package com.yancy.testWebsocket.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint("/server/user/{userid}")
public class WebSocketServer {

        private static final Map<String , Session> webSocketMap = new ConcurrentHashMap<>();



        @OnOpen
        public void onOpen(Session session , @PathParam("userid") Integer userid) throws IOException {
            System.out.println("connect success");
            webSocketMap.put(userid.toString() , session);
            sendMessage();

        }


        @OnMessage
        public void OnMessage(String message){
            System.out.println(message);

        }



        public void sendMessage() throws IOException {
                for(Map.Entry<String,Session> entry : webSocketMap.entrySet()){
                    entry.getValue().getBasicRemote().sendText("后端传来了数据");
                }
        }
}
