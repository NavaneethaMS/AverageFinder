package Collections;

class Generics<T> {

    T obj;

    Generics(T obj) {
        this.obj = obj;
    }  // constructor

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        // instance of Integer type
        Generics<Integer> iObj = new Generics<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Generics<String> sObj =
                new Generics<String>("TestGenerics");
        System.out.println(sObj.getObject());
        Generics<Integer> i=new Generics<Integer>(16);
        System.out.println("i="+i.getObject());
    }


}