package org.example;

public class email {
    email(String Email, String userName){
        this.Email= Email;
        this.userName=userName;

    }
    email(){

    }
    private String Email;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "email{" +
                "Email='" + Email + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
