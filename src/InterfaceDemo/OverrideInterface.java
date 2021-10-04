package InterfaceDemo;

class OverrideInterface implements Interface,Interface2
{
    public void add()
    {
        System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
    }
    public void sub()
    {
        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
    }

    @Override
    public void multiply() {
        System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
    }

    @Override
    public void divide() {
        System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
    }

    public static void main(String[] args)
    {
        OverrideInterface obj = new OverrideInterface();
        obj.add();
        obj.sub();
        obj.multiply();;
        obj.divide();
    }

    @Override
    public void read() {
        System.out.println("hi from read method");
    }
}

