public class Mage extends GameCharacter{
    private int mana;
    //constructor
    public Mage(String name)
    {
        super(name);
        this.mana= 100;
    }

    public void attack()
    {
        System.out.println(name + " casts a fireball");
        mana -= 10;
    }
    public void useSpecialAbility()
    {
        if(mana >=50)
        {
            mana -=50;
            System.out.println(name+ " casts arcane explosion");
        }
        else {
            System.out.println("Not enough man!");
        }

    }
    public String toString()
    {
        return "Mage:"+ name +" "+health+ " "+ level;
    }
}
