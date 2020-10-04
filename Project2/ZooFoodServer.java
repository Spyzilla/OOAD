package Zoo;

public class ZooFoodServer extends ZooEmployee{
    public ZooFoodServer(Zoo inZoo) {
        super(inZoo);
        this.setTitle("Zoo Food Server");
        Zoo.addObserver(this);
    }

    public void makeFood() {
        System.out.println("The " + this.toString() + " is making food.");
    }

    public void serveFood(){
        if(this.getZoo().getTime() == 12) {
            setCurrent_event("lunch");
            System.out.println("The " + this.toString() + " is serving lunch.");
        } else if (this.getZoo().getTime() == 17) {
            setCurrent_event("dinner");
            System.out.println("The " + this.toString() + " is serving dinner.");
        }
    }

    public void cleanUp() {
        System.out.println("The " + this.toString() + " is cleaning up");
    }

    public void update() {
        int time = this.getZoo().getTime();
        switch(time) {
            case 10:
                arrive(this.getDay());
                break;
            case 11:
                makeFood();
                break;
            case 12:
                serveFood();
                break;
            case 13:
                cleanUp();
                break;
            case 16:
                makeFood();
                break;
            case 17:
                serveFood();
                break;
            case 18:
                cleanUp();
                break;
            case 20:
                leave();
                break;
        }
    }
}
