package standard01;

class World{
    private int num1 = 10;//'외부클래스 World의 인스턴스변수 num1' 선언
    private static int num2 = 20;//'외부클래스 World의 클래스변수 num2' 선언
    Nation city = new Nation();
        class Nation {//'내부클래스 Nation' 선언
            int num3 = 30;//'내부클래스 Nation의 인스턴스변수 num3' 선언

            void inTest() {//'내부클래스 Nation의 메소드 inTest' 선언
                System.out.println(num1 + num3);
            }
        }
          //'내부클래스 Nation'이 '끝'. 아래부터 '외부클래스 World' 다시 시작.
    public void Country(){
                city.inTest();
    }
    //'외부클래스 World의 메소드 Country' 속에서
    //'내부클래스 Nation을 담고 있는 새객(&변수) city'가
    //'내부클래스 Nation의 메소드 inTest'를 호출하는 것 가능 O.
    }

public class doInnerclass01_Review {
    public static void main(String[] args) {
        World world = new World();
        //'외부클래스 World를 참조하는 새객 world' 선언.
        world.Country();
    }
}
