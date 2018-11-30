public class Entity {

    @Secured(valueInt = 10)
    public void move(){

    }

    public String writeLetter(String str){
        return null;
    }

    @Secured(valueInt = 45, valName = "blabla")
    @Deprecated
    private int count(int x){
        return 0;
    }

    protected void update(){

    }

    private void go(){

    }
}
