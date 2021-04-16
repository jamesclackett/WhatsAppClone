package com.example.whatsappclone.Utils;

import com.onesignal.OneSignal;

import org.json.JSONException;
import org.json.JSONObject;

public class SendNotification {

    public SendNotification(String message, String heading, String notificationKey){

        try {
            JSONObject notficationContent = new JSONObject(
                    "{'contents':{'en':'" + message + "'}," +
                    "'include_player_ids':['" + notificationKey + "']," +
                    "'headings':{'en': '" + heading + "'}}");
            OneSignal.postNotification(notficationContent, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
