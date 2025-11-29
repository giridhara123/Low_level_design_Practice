public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    private final int value;

    private Coin(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

}
//int total = Coin.DIME.getValue() + Coin.QUARTER.getValue() + Coin.DIME.getValue() + Coin.DIME.getValue();
       // System.out.println(total);

