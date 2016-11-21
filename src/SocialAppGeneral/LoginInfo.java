package SocialAppGeneral;

import com.google.gson.Gson;

/**
 * Created by kemo on 30/10/2016.
 */
public class LoginInfo implements Shareable {

    //TODO #prototype GSON
    //just for prototype will be removed
    private transient final String EMAIL ="email"; //using transient GSON will ignore this obj and wont put it in string
    private String email;
    private String password;
    public LoginInfo() {
        this.email = "";
        this.password = "";
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String EMAIL) {
        this.email = EMAIL;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public  void fromJsonString(String jsonStr) {
        //TODO #prototype GSON
        //Read JSON
         Gson gson = new Gson();
        LoginInfo loginInfo = gson.fromJson(jsonStr,LoginInfo.class);
        this.email = loginInfo.getEmail();
        this.password = loginInfo.getPassword();
    }

    @Override
    public String convertToJsonString() {
       //TODO #prototype GSON
        //Write JSON
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
