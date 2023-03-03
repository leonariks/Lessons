import java.util.Objects;

public class User {

    private String name;
    private String patronymic;
    private String surname;
    private String phoneNumber;
    private String login;
    private String email;
    private String password;
    private boolean isAdmin;

    public User(String name, String patronymic, String surname, String phoneNumber, String login, String email, String password, boolean isAdmin) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.login = login;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User(String name, String patronymic, String surname, String phoneNumber, String login, String email, String password) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return  login.equals(user.login) && password.equals(user.password) || email.equals(user.email) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, patronymic, surname, phoneNumber, login, email, password, isAdmin);
    }

    @Override
    public String toString() {
        return "User{" +
                "Имя='" + name + '\'' +
                ", Отчество='" + patronymic + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Номер телефона='" + phoneNumber + '\'' +
                ", Логин='" + login + '\'' +
                ", Майл='" + email + '\'' +
                ", Пароль='" + password + '\'' +
                ", Является администратором=" + isAdmin +
                '}';
    }
}
