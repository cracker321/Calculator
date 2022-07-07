package standard01;

interface E1{
    public String A();
}
//인터페이스 E1 정의 및 불완전 메소드 A정의

interface E2{
    public String B();
}

class D2 implements E1, E2{
    public String A(){
        return "제발";
    }
    public String B(){
        return "싱가폴취업";
    }
    //클래스 D2가 인터페이스 E1, E2를 구현할 때는, 반드시 그 내부의
    //불완전 메소드들을 다 구현해줘야 한다!
}

public class dyPolymorphism8 {
    public static void main(String[] args) {
        E1 c1 = new D2();
        System.out.println(c1.A());
        E2 c2 = new D2();
        System.out.println(c2.B());
        //무조건 왼쪽에 부모클래스, 추상클래스, 인터페이스
        //그리고 오른쪽인 자녀클래스

    }
}
