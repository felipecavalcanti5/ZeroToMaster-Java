package aula09.Enum;

public class GameStatusesExample {
    public static void main(String[] args) {
        for(GameStatus gameStatus : GameStatus.values()){
            System.out.println(gameStatus);
        }
        GameStatus gameStatus = GameStatus.PAUSED;
    }
}
