package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._02_after;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>(); //옵저버들(subscriber)을 주제별로 묶어놓기 위해 Map을 사용

    public void register(String subject, Subscriber subscriber) { //특정한 주제에 해당하는 구독자를 등록
        if (this.subscribers.containsKey(subject)) { //이미 있다면
            this.subscribers.get(subject).add(subscriber); // 있는거에다가 추가
        } else { // 없다면 새로 만들어서 구독자 추가해서 맵에다가 넣어준다.
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
            /*
            * 만약 코드를 줄이고 싶어서
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            2줄을 List.of(subscriber)로 줄이면 안된다.
            이유는 Immutable한 Collection을 리턴한다.
            그래서 이 컬렉션에다가 새로운 것을 추가할 수 없다.
            * */
        }
    }

    public void unregister(String subject, Subscriber subscriber) { //해지
        if (this.subscribers.containsKey(subject)) { //해당하는 서브젝트에 목록이 있다면
            this.subscribers.get(subject).remove(subscriber); //가져와서 빼주면 된다.
        }
    }

    public void sendMessage(User user, String subject, String message) { //특정한 유져가 특정한 주제로 특정한 메세지를 보낸다
        if (this.subscribers.containsKey(subject)) { //해당 주제를 구독하고있는 사람이 있다면
            String userMessage = user.getName() + ": " + message;
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage)); //가져와서 순회를하면서 각각의 서브스크라이브들(옵저버들)이 가지고있는 핸들메세지에다가 메세지를 전달
        }
    }

}
