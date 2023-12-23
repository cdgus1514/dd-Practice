package dh.study.test;

import dh.study.test.password.RandomPasswordGenerator;

public class User {

    private String passowrd;

    public void initPassword(PasswordGenerator passwordGenerator) {
//        RandomPasswordGenerator RandomPasswordGenerator = new RandomPasswordGenerator();
        String generatePassword = passwordGenerator.generatePassword();

        if(generatePassword.length() >= 8 && generatePassword.length() <= 12) {
            this.passowrd = generatePassword;
        }
    }

    String getPassowrd() {
        return passowrd;
    }
}
