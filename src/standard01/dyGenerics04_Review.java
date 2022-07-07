package standard01;

class Family1{
    public int age;
    public Family1(int kkk){
        age = kkk;
    }
}

class Relatives1{
    public String name;
    public Relatives1(String 이름){
        name = 이름;
    }
}

class Father1<T, A>{
    public T info1;
    public A gender;
    public Father1(T aaa, A bbb){
        info1 = aaa;
        gender = bbb;
    }
}
public class dyGenerics04_Review {
    public static void main(String[] args) {
        Integer gender = new Integer(2);
        //이제 '새객 '의 값은 '2'가 됨.
        Father1<Family1, Integer>

    }
}
