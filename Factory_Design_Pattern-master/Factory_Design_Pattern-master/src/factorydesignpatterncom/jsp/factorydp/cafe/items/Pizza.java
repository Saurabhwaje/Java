package factorydesignpatterncom.jsp.factorydp.cafe.items;

import factorydesignpatterncom.jsp.factorydp.cafe.order.Order;

public class Pizza implements Order {

    @Override
    public void orderItem() {
        System.out.println("Ordering Pizza");
        prepareItem("Pizza");
    }

    private void prepareItem(String itemName) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(itemName + " is ready");
    }
}
