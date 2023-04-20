package com.example.springsecurityapplication.config;
import com.example.springsecurityapplication.services.PersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{
    private final PersonDetailsService personDetailsService;
//    @Bean // Метод отключает шифрование паролей т.к. в БД они в открытом виде
//    public PasswordEncoder getPasswordEncode(){
//        return NoOpPasswordEncoder.getInstance();
//    }
    @Bean // Метод возвращает шифрование паролей
    public PasswordEncoder getPasswordEncode(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        //конфигурируем работу Spring Security
//http.csrf().disable() // отключаем защиту от межсайтовой подделки запросов
        http
                .authorizeHttpRequests() //указываем что все страницы должны быть защищены аутентификацией
                //указываем что не аутентифицированные пользователя могут зайти на страницу аутентификации и на объект ошибки
                //с помощью permitAll указываем что не аутентифицированные пользователи могут заходить на перечисленные страницы
                .requestMatchers("/authentication","/error","/registration").permitAll()
                //указываем что для всех страниц необходимо вызывать метод authenticated(), который открывает форму
                //аутентификации
                .requestMatchers("/admin").hasRole("ADMIN")//указываем на то что страница /admin доступна пользователям с ролью ADMIN
                .requestMatchers("/authentication","/registration","/error","/resources/**","/static/**","/css/**","/js/**","/img/**").permitAll()
                .anyRequest().hasAnyRole("USER","ADMIN")
//                .anyRequest().authenticated()
                .and() //указываем что дальше настраивается аутентификация и соединяем ее с настройкой доступа
                .formLogin().loginPage("/authentication")//указываем какой url запрос будеьт отправлятся при заходе на защищенные страницы
                .loginProcessingUrl("/process_login")//указываем на какой адрес будут отправляться данные с формы.
                // Нам уже не нужно будет создавать метод в контроллере и обрабатывать данные с формы. Мы задали url, который
                // используется по умольчанию для обработки формы аутентификации по средствам Spring Security. Spring Security будет ждать
                // объект с формы аутентификации и затем сверять логин/пароль с данными в БД
                .defaultSuccessUrl("/index", true) //указываем на какой url необходимо направить пользователя после успешной аутентификации.
                // Вторым аргументом указывается true чтобы перенаправление шло в любом случае после успешной аутентификации
                .failureUrl("/authentication?error") //Указываем куда необходимо перенаправить пользователя при проваленной аутентификации.
                // В запрос будет передан объект error, который будет проверяться на форме и при наличии данного объекта в запросе
                // выводится сообщение "Неправильный логин/пароль"
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/authentication");
        return http.build();
    }
    @Autowired
    public SecurityConfig(PersonDetailsService personDetailsService) {
        this.personDetailsService = personDetailsService;
    }

    //    private final AuthenticationProvider authenticationProvider;
//
//    public SecurityConfig(AuthenticationProvider authenticationProvider) {
//        this.authenticationProvider = authenticationProvider;
//    }
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder.authenticationProvider(authenticationProvider);
        authenticationManagerBuilder.userDetailsService(personDetailsService)
                .passwordEncoder(getPasswordEncode());
    }
}
