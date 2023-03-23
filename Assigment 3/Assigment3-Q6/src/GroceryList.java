import java.util.ArrayList;

public class GroceryList {

    /*public GroceryList()
        constructs a new empty grocery list.
        public void add(GroceryltemOrder item)
        adds the given item order to this list, if the list is not full (i.e., has fewer than 10 items).
        public double getTotalCost()
        returns the total sum cost of all grocery item orders in this list.
       */

    protected ArrayList<GroceryList> list;

    public GroceryList(ArrayList<GroceryList> list) {
        this.list = list;
    }

    public void add(GroceryList x)
    {
        if (list.size()<10)
        {
            list.add(x);
        }
    }
    public double getTotalCost()
    {
        return getTotalCost();
    }






}
