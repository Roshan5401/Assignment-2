import java.io.*;
public class Customer {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public String cust_name;
    public int cust_age;
    public String cust_address;
    public long cust_phone;
    public String cust_email;
    private int wallet;
    
    void cust_inputs() throws IOException
    {
        System.out.println("Enter Name");
        this.cust_name=br.readLine();

        System.out.println("Enter age");
        this.cust_age=Integer.parseInt(br.readLine());

        System.out.println("Enter the address");
        this.cust_address=br.readLine();

        System.out.println("Enter the phone number");
        this.cust_phone=Long.parseLong(br.readLine());

        System.out.println("Enter the email id");
        this.cust_email=br.readLine();
    }
    void details_cust()
    {
        System.out.println();
        System.out.println("Given below are the details of the customer");
        System.out.println("Name: "+cust_name);
        System.out.println("Age: "+cust_age);
        System.out.println("Address: "+cust_address);
        System.out.println("Phone number: "+cust_phone);
        System.out.println("Email id: "+cust_email);
        System.out.println();
    }
    public int getWallet() {
        return wallet;
    }
    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
    
}
