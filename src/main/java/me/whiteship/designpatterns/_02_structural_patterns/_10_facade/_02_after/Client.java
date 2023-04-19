package me.whiteship.designpatterns._02_structural_patterns._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        // 만약에 자바 email sender가 아닌 특정한 email sender로 변경할 때 유리
        // 이렇게 하는게 나쁘지 않은 선택이긴하다.
        // 클라이언트가 이메일을 여러군대서 보낸다고 한다면 의미가 있다.
        // 한 곳으로 모아놨다고 하는 것만으로도 의미가 있다.
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("keesun");
        emailMessage.setTo("whiteship");
        emailMessage.setCc("일남");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이더라고..");

        emailSender.sendEmail(emailMessage);
    }
}
