public class User {
    private String secondName;
    private String firstName;
    private String surname;
    private String telephone;
    private String email;
    private String login;
    private String pas;

    public User(String secondName, String firstName, String surname, String telephone, String email, String login, String pas) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.pas = pas;
    }


    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public boolean setTelephone(String telephone) {
        if (telephone.matches("(\\+7|7|8)+(\\d{10})")) {
            this.telephone = telephone;
            return true;
        } else {
            System.out.println("Вы ввели неккоректный номер телефона!");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.matches("(@|.)?")){
            this.email = email;
            return true;
        }else {
            System.out.println("Email введён некорректно.");
            return false;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }


}