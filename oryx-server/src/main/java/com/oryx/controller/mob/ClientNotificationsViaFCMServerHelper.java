package com.oryx.controller.mob;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.gson.JsonObject;

import com.oryx.model.system.ose.User;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ClientNotificationsViaFCMServerHelper {

    private static final Logger log =
            Logger.getLogger(ClientNotificationsViaFCMServerHelper.class.getName());

    private static String SCOPE = "https://www.googleapis.com/auth/firebase.messaging";
    private static String FCM_ENDPOINT =
            "https://fcm.googleapis.com/v1/projects/oryx-barcode-51b50/messages:send";



    public void sendNotification() {
        String notificationTitle = "New Items In Auto";
        String notificationBody = "New items in auto category have "
                + "been added, you may be interested in.";

        sendMessageToFcm(getFCMNotificationMessage(notificationTitle, notificationBody));
    }

    public void sendData() {
        sendMessageToFcm(getFCMDataMessage());
    }

    // send message to firebase cloud messaging server using okhttp
    private void sendMessageToFcm(String jsonMessage) {
        final MediaType mediaType = MediaType.parse("application/json");

        OkHttpClient httpClient = new OkHttpClient();
        try {
            Request request = new Request.Builder().url(FCM_ENDPOINT)
                    .addHeader("Content-Type", "application/json; UTF-8")
                    .addHeader("Authorization", "Bearer " + getAccessToken())
                    .post(RequestBody.create(mediaType, jsonMessage)).build();

            Response response = httpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                log.info("Message has been sent to FCM server "
                        + response.body().string());
            }

        } catch (IOException e) {
            log.info("Error in sending message to FCM server " + e);
        }

    }

    private String getAccessToken() throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();

        GoogleCredential googleCredential = GoogleCredential
                .fromStream(new FileInputStream(classLoader.getResource("oryx-barcode-51b50-firebase-adminsdk-q6xhd-b4482a0630.json").getFile()))
                .createScoped(Arrays.asList(SCOPE));
        googleCredential.refreshToken();
        String token = googleCredential.getAccessToken();
        return token;
    }

    private String getFCMDataMessage() {

        User user = getClientTokenAndData();

        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("token", "dZwE1nSaEKk:APA91bHPqS_S_fDJY3nhqXylt47K4BygzoOZV8qKPxNI3QT7SmixuVI0uOv818_oVlVfJZ2Rj9nQU-MQuvAfuTw_DvsDPItINLP5TZu8rDqDj9U-eEl9VLaBkHFYCmC5PAcVzfCfkZWA");

        JsonObject itemInfo = new JsonObject();
        itemInfo.addProperty("login", user.getLogin());

        jsonObj.add("data", itemInfo);

        JsonObject msgObj = new JsonObject();
        msgObj.add("message", jsonObj);

        log.info("data  message " + msgObj.toString());

        return msgObj.toString();
    }

    private String getFCMNotificationMessage(String title, String msg) {
        JsonObject jsonObj = new JsonObject();
        // client registration key is sent as token in the message to FCM server
        jsonObj.addProperty("token", getClientToken());

        JsonObject notification = new JsonObject();
        notification.addProperty("body", msg);
        notification.addProperty("title", title);
        jsonObj.add("notification", notification);

        JsonObject message = new JsonObject();
        message.add("message", jsonObj);

        log.info("notification message " + message.toString());

        return message.toString();
    }

    private User getClientTokenAndData() {
        User user = new User();
        user.setLogin("toto");
        return user;
    }

    // Firebase SDK registration key from client
    private String getClientToken() {
        return "dZwE1nSaEKk:APA91bHPqS_S_fDJY3nhqXylt47K4BygzoOZV8qKPxNI3QT7SmixuVI0uOv818_oVlVfJZ2Rj9nQU-MQuvAfuTw_DvsDPItINLP5TZu8rDqDj9U-eEl9VLaBkHFYCmC5PAcVzfCfkZWA";
    }
}