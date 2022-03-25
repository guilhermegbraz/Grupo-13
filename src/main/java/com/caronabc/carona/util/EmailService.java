package com.caronabc.carona.util;

public class EmailService {

    public boolean isEmailValid(String email) {

        String emailPattern = "[^ \t\n\f\r]+@(aluno\\.)?ufabc\\.edu\\.br";

        return email.matches(emailPattern);
    }

}
