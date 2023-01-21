import java.io.*;
public class Product {
    public String prod_name;
    public int prod_id;
    public int prod_price;
    public int prod_total;
    public int prod_book;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void prod_inputs() throws IOException
    {
        System.out.println("Enter Product Name");
        this.prod_name=br.readLine();

        System.out.println("Enter Product Id");
        this.prod_id=Integer.parseInt(br.readLine());

        System.out.println("Enter Product Price");
        this.prod_price=Integer.parseInt(br.readLine());

        System.out.println("Enter Product Quantity");
        this.prod_total=Integer.parseInt(br.readLine());

        System.out.println("Enter Product Demand");
        this.prod_book=Integer.parseInt(br.readLine());
    }
    void discounts_price(int x,int d)
    {

        if(prod_book>x)
            System.out.println("If demand is more then "+x+"then discounted price is: "+ (prod_price-d));
        else
            System.out.println("No discount");
    }
    void display_pro_detail()
    {
        System.out.println();
        System.out.println("Given below are the details of the customer");
        System.out.println("Product Name: "+prod_name);
        System.out.println("Product Id: "+prod_id);
        System.out.println("Product price: "+prod_price);
        System.out.println("Total product: "+prod_total);
        System.out.println("Total demand: "+prod_book);
        System.out.println();
    }
}
