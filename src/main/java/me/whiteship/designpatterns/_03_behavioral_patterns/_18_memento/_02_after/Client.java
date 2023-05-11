package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

public class Client {

    public static void main(String[] args) {
        //메멘토: 객체 내부의 상태를 외부에 저장을 해놓고 그 저장된 정보를 복원하고 싶을 때 사용하는 패턴
        // 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 방법.
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        game.restore(save);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
