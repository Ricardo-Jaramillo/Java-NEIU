package problem3;

public class Faculty {

    private final String name;

    public Faculty(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
