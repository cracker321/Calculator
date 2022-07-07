package standard01;

interface father{}
interface mother{}
interface believer{}
interface programmer{
    public void coding();
}

class Steve implements father, believer, programmer{
    public void coding(){
        System.out.println("fast");
    }
    //인터페이스 programmer의 메소드 coding의 매개변수가 없으면
    //오버라이딩한 클래스 Steve의 메소드 coding에도 매개변수가 없어야한다!
}

class Rachel implements mother, believer, programmer{
    public void coding(){
        System.out.println("delicate");
    }
}

public class dyPolymorphism9 {
    public static void main(String[] args) {
        programmer c1 = new Steve();
        //인터페이스 programmer의 불완전 메소드 coding을
        //클래스 Steve에서 완성시켜주고 있고,
        // 새객 c1이 클래스 Steve를 담으면서 인터페이스 programmer행세를
        //한다면, 이 때, 메소드 coding을 호출하면,
        // 클래스 Steve 안에 있는 자녀메소드 coding이 호출된다!
        c1.coding();
        //새로운 객체 c1은 인터페이스 father 할 수 없다!
        programmer c2 = new Rachel();
        c2.coding();
        //클래스 Rachel이 인터페이스 programmer를 완성시켜주고 있고,
        //여기서 메소드 coding을 호출하면, 자녀메소드 coding이 속한
        //클래스 Rachel의 자녀메소드 coding이 호출된다.

    }
}
