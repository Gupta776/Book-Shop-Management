package main;
import java.util.ArrayList;
import java.util.List;

import main.Bill;
import main.Item;

public class Cart extends Bill{
    //one cart one bill
    public List<Item> inCart = new ArrayList<Item>();
    public List<Integer> quant = new ArrayList<Integer>();
   // public int noOfItems=0; //replaced by next line
    public int noOfItems=0;
    public void updateCart(Item a,int q ){
      //write your code here
      //------------
      //------------
    	inCart.add(a);
    	quant.add(q);
    	noOfItems = noOfItems +1;

    }
    public int totalAmt=0;
    public void finalizeCart(String name){
        super.getBill(name);//make it outside
        for(int i=0;i<noOfItems;i++){
            System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
        }
        totalAmt = calcBill();
       // System.out.println("no of items entered " + noOfItems);
        System.out.println("total Amount: "+ Integer.toString(totalAmt));
    }
    public int calcBill() {
    	int total=0;
//    	write your code here!!!
//    	----------------------
    	for (int i=0; i< noOfItems; i++) {
    		
    		total=total+((quant.get(i)) * (inCart.get(i).mrp));
    	}
    	return total;
    	
    }
}