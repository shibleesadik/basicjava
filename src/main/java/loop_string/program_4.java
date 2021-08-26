package loop_string;
// 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression.
public class program_4 {
    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        double sharee=Double.parseDouble(arr[1]);
        double shirt=Double.parseDouble(arr[3]);
        double pant=Double.parseDouble(arr[5]);
        double sharee_quantity=Double.parseDouble(arr[0]);
        double shirt_quantity=Double.parseDouble(arr[2]);
        double pant_quantity=Double.parseDouble(arr[4]);
        double total_price=(sharee*sharee_quantity)+(shirt*shirt_quantity)+(pant*pant_quantity);
        double total_quantity= sharee_quantity+shirt_quantity+pant_quantity;
        System.out.println("Total price is: "+total_price+" and Total quantity is: "+total_quantity);
    }
}
