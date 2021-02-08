public class Planet {

    public String name;
    public Integer size;

    public Planet(String name, Integer size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public Integer getSize(){
        return this.size;
    }

    public void explode(){
        System.out.println("Boom! " + this.name + " has exploded.");
    }
}
