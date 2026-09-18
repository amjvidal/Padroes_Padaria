public class Saying extends CakeDecorator {
    private String saying;
    
    public Saying(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " with saying '" + saying + "'"; 
    }
}