package com.ariel;



public class Password {

    private static int lengthDefault = 8;

    private int length;

    private String password;

    public Password(){
        this(lengthDefault);
    }

    public Password(int length){
        this.length = length;
        this.password = genPassword();
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String _password){
        this.password = _password;
    };

    //Needs nothing and returns  a generated password

    /**
     *
     * @return String
     */
    public String genPassword(){
        String password = "";
        for(int i = 0; i < this.length; i++) {
            int choice = ((int) Math.floor(Math.random()*(3-1)+1));
            if (choice == 1){
                char lowerCaseLetter = (char)((int)Math.floor(Math.random()*(123-97)+97));
                password += lowerCaseLetter;
            }else{
                if(choice == 2){
                    char uperCaseLetter = (char)((int)Math.floor(Math.random()*(91-65)+65));
                    password += uperCaseLetter;
                }else{
                    char numbers = (char)((int)Math.floor(Math.random()*(58-48)+48));
                    password += numbers;
                }
            }
        }
        return password;
    }

    //Validates if the password is strong

    /**
     *
     * @return boolean
     */
    public boolean isStrong(){
        int countLowerCaseLetter = 0;
        int countUpperCaseLetter = 0;
        int numbers = 0;

        for(int i = 0; i < this.password.length(); i++){
            if(this.password.charAt(i) >=97 || this.password.charAt(i) <= 122){
                countLowerCaseLetter += 1;
            }
            else {
                if(this.password.charAt(i) >= 65 || this.password.charAt(i) <= 90){
                    countUpperCaseLetter += 1;
                }
                else{
                    numbers += 1;
                }
            }
        }

        return countLowerCaseLetter >=1 && countUpperCaseLetter >=2 && numbers >=3;
    }

}
