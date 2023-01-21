import java.io.*;
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Customer c1=new Customer();
        Customer c2=new Customer();

        Product p1=new Product();
        Product p2=new Product();
       
        System.out.println("Enter the details of the customer");
        c1.cust_inputs();
        System.out.println("Enter the wallet amount of the customer");
        int x=Integer.parseInt(br.readLine());
        c1.setWallet(x);
        c1.details_cust();
        c1.getWallet();

        System.out.println("Enter the details of the customer");
        c2.cust_inputs();
        System.out.println("Enter the wallet amount of the customer");
        x=Integer.parseInt(br.readLine());
        c2.setWallet(x);
        c2.details_cust();
        c2.getWallet();

        System.out.println("Enter the details of the product");
        p1.prod_inputs();
        p1.display_pro_detail();
        p1.discounts_price(5, 99);

        System.out.println("Enter the details of the product");
        p2.prod_inputs();
        p2.display_pro_detail();
        p2.discounts_price(15, 99);
    }
}
