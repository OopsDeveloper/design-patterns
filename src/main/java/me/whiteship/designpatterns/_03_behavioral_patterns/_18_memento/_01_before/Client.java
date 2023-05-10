package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._01_before;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        //캡슐화가 깨진 것: 게임을 구성하는 정보를 클라이언트가 다 알아야되서
        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        restoredGame.setBlueTeamScore(blueTeamScore);
        restoredGame.setRedTeamScore(redTeamScore);
    }
}
