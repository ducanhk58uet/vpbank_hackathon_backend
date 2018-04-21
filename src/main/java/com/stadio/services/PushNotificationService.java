package com.stadio.services;

import com.stadio.documents.Notification;
import com.stadio.utils.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class PushNotificationService
{

    private static String testDeviceToken = "e8M-U4Y-krQ:APA91bFdjFRTpIkRy7T-J2NXwd63WgDqy7kM_stjvJjOI9C4TRjoM-uzFLOrry4Ow14iM4X5NdtEvtXF0DNS48q2uYQm9p-S-2o0ATP35zuj6l2UFgbCrSnIiCz9Y8-JYv3Rqm6zKAvm";

    private Logger logger = LogManager.getLogger(PushNotificationService.class);

    public void sendPushNotification(List<String> deviceToken, Notification notification)
    {

        JSONObject bodyJSON = new JSONObject();
        JSONObject data = new JSONObject();

        //JSONObject notificationData = new JSONObject();

        bodyJSON.put("title", notification.getTitle());
        bodyJSON.put("body", notification.getMessage());
        bodyJSON.put("sound", "default");
        bodyJSON.put("content_available", true);

        //notificationData.put("screen", notification.getScreen().name());
        //notificationData.put("type", notification.getType().name());

        data.put("notification", bodyJSON);
        data.put("data", bodyJSON);

        data.put("registration_ids", deviceToken);
        data.put("priority", "normal");

        try
        {
            logger.info("FCM request: " + data.toString(2));
            JSONObject res = sendPushNotification(data);
            //Object success = res.get("success");
            logger.info("FCM response: " + res.toString(2));

        }
        catch (Exception e)
        {
            logger.error("Connect exception: " + e);
        }

    }

    private static JSONObject sendPushNotification(JSONObject body) throws Exception
    {

        URL obj = new URL(Constants.FCM_API_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setDoOutput(true);

        con.setRequestMethod("POST");

        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        con.setRequestProperty("Authorization", "key=" + Constants.FCM_SERVER_KEY);

        OutputStream wr = con.getOutputStream();

        wr.write(body.toString().getBytes("UTF-8"));

        wr.flush();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null)
        {
            response.append(inputLine);
        }
        in.close();

        JSONObject res = new JSONObject(response.toString());

        return res;
    }

}

