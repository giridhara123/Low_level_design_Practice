public class Warrior extends GameCharacter {

    private int range;
    //constructor
    public Warrior(String name)
    {
        super(name);
        this.range = 0;
    }
    public void attack()
    {
        System.out.println(name + " swings their sword!");
        range +=10;
    }
    public void useSpecialAbility()
    {
        if(range>= 50)
        {
            System.out.println(name + " uses berserker Range!");
            range= 50;
        }
        else {
            System.out.println(" not enough range");
        }

    }
    public String toString()
    {
        return "warrior:"+ name +" "+health+ " "+ level;
    }


}
