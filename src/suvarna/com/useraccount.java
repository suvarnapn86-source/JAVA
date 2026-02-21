package suvarna.com;

class useraccount {
    private String Username;
    private String Password;

    void setUsername(String username) {
        this.Username = Username;
    }
        void setPassword(String Password){
            this.Password=Password;

        }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }
    public String toStirng(){
        return "useraccount:[Username:"+Username+",Password:"+Password+"]";
    }
}


