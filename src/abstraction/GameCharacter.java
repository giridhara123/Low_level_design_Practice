public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int level;
    //constructor
    public GameCharacter(String name)
    {
        this.name = name;
        this.health = 100;
        this.level = 1;

    }
    //abstract methods
    public  abstract void attack();
    public abstract void useSpecialAbility();

    //concrete methods
    public void takeDamage(int dmg)
    {
        this.health =  Math.max(0, this.health - dmg);
        if(health == 0)
            die();

    }
    public void die()
    {
        System.out.println(name+" is defeated");
    }
    public void health(int amount)
    {
        this.health= Math.max(0, this.health + amount);

    }
    public void levelUp()
    {
        level++;
        System.out.println(name + " reached level "+ level);
    }




}
//  GameCharacter a= new Warrior("srinu");
// System.out.println(a.toString());
// a.attack();
// a.useSpecialAbility();
////  GameCharacter b= new Mage("kamal");
// System.out.println(b.toString());
// b.attack();
// b.useSpecialAbility();
