package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._01_before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<String>> messages;

    public ChatServer() {
        this.messages = new HashMap<>();
    }


    public void add(String subject, String message) {
        //기존에 존재하는 주제면, 해당 subject에 내용을 추가 그렇지않으면 새로 만들어서 messages에 추가
        if (messages.containsKey(subject)) {
            messages.get(subject).add(message);
        } else {
            List<String> messageList = new ArrayList<>();
            messageList.add(message);
            messages.put(subject, messageList);
        }
    }

    public List<String> getMessage(String subject) {
        return messages.get(subject);
    }
}
