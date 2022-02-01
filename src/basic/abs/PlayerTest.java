package basic.abs;

// 추상 클래스, 추상 메서드 연습
abstract class Player{
    abstract void play(int pos);
    abstract void stop();

}

// 추상 클래스는 상속을 통해 완성!
class AudioPlayer extends Player{
    void play(int pos){
        System.out.println(pos + " 위치부터 play");
    };

    void stop(){
        System.out.println("멈춰!!");
    };
}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player();
        AudioPlayer ap1 = new AudioPlayer();
        Player ap2 = new AudioPlayer(); // 다형성 덕분에 가능

        ap1.play(100);
        ap1.stop();
    }
}
