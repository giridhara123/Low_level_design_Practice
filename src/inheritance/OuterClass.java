public class OuterClass {
    int number =10;

    public void hello()
    {
        System.out.println(number);

        class LocalInnerClass {
            int number1 = 30;
            public void localinner()
            {
                System.out.println(number1);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.localinner();
    }

    public static  class InnerClass {
        int number2 = 20;

        public void innerhello()
        {
            System.out.println(number2);
        }
    }
}
//OuterClass outer = new OuterClass();
//outer.hello();

// OuterClass.InnerClass inner = outer.new InnerClass(); //instance of outerClass object is used to call instance of inner class
//when inner class is static method in outer class, it just requires this method.
// OuterClass.InnerClass inner = new OuterClass.InnerClass();
// inner.innerhello();

