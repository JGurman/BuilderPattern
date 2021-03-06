
/** "ConcreteBuilder" */

class HawaiianPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("cross");
    }
    public void buildSauce() {
        pizza.setSauce("mild");
    }
    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
    public void setName() {
        pizza.setName("hawaii");
    }
}

/** "ConcreteBuilder" */
class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("pan baked");
    }
    public void buildSauce()   {
        pizza.setSauce("hot");
    }
    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
    public void setName() {
        pizza.setName("spicy");
    }


}
