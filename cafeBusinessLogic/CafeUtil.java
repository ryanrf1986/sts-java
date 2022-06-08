import java.util.ArrayList;
public class CafeUtil {
        
        public int getStreakGoal(){
            int count = 0;
            for(int i = 0; i <=10; i++){
                count += 1;
            }
            return count;
        }

        public double getOrderTotal(double[] prices){
            double orderTotal = 0;
            for(double itemPrice : prices){
                orderTotal += itemPrice;
            }
            return orderTotal;
        }

        public void displayMenu(ArrayList<String> menuItems){
            for(byte i =0; i < menuItems.size(); i++){
                System.out.printf("%s #s", i, menuItems.get(i));
            }
        }

    public void addCustomer(ArrayList<String> customers){
    System.out.println("Please enter name:");
    String userName = System.console().readLine();
    System.out.printf("Hello %s", userName);
    System.out.printf("There are %s people ahead of you", customers.size());
    customers.add(userName);
    }
}