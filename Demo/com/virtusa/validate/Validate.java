package Demo.com.virtusa.validate;

public class Validate {
    

    public static void validate(String uname, String passwd)
    {
        if(uname.equals("Vivek") && passwd.equals("Cake"))
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
