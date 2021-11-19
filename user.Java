public class user extends userManager {

   private int password;
   private String  userName;
   private String email;

  public int getPassword()
  {
      return password;
  }

public void setPassword(int password)
{
    this.password=password;
}

public String getuserName()
{
    return userName;
}

public void setuserName(String username)
{
    this.userName=username;
}

public String geteMail()
{
    return email;
}

public void seteMail(String email)
{
    this.email=email;
}
    
}
