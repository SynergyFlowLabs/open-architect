package com.devtodev.analytics.internal.migrator;

import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Stamp implements IStamp {
    private String activeUser = null;
    private String userId = null;
    private Integer userLevel = null;
    private Integer trackingAvailable = null;
    private JSONArray tutorialJson = new JSONArray();
    private JSONArray ordersJson = new JSONArray();
    private final JSONObject userCard = new JSONObject();

    public enum UserCardKeys {
        name,
        age,
        email,
        gender,
        cheater,
        phone,
        photo
    }

    private boolean containsKey(String str) {
        for (UserCardKeys userCardKeys : UserCardKeys.values()) {
            if (userCardKeys.name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public Boolean UserCardIsEmpty() {
        return Boolean.valueOf(this.userCard.length() == 0);
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public Boolean UserIdIsNull() {
        return Boolean.valueOf(this.userId == null);
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public boolean activeUserIsNull() {
        return this.activeUser == null;
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public String getActiveUser() {
        return this.activeUser;
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    @NotNull
    public JSONObject getAllData() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("userId", this.userId);
            jSONObject.accumulate("level", this.userLevel);
            if (this.trackingAvailable.intValue() == 0) {
                jSONObject.accumulate(ProjectEntry.trackingAvailable, Boolean.TRUE);
            } else if (this.trackingAvailable.intValue() == 1) {
                jSONObject.accumulate(ProjectEntry.trackingAvailable, Boolean.FALSE);
            }
            jSONObject.accumulate("tutorCompletedSteps", this.tutorialJson);
            jSONObject.accumulate("userCard", this.userCard);
            jSONObject.accumulate("transactionIds", this.ordersJson);
            return jSONObject;
        } catch (JSONException e10) {
            Logger.INSTANCE.error("", e10);
            return new JSONObject();
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public void getOrderData(ArrayList<?> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (!(obj instanceof String)) {
                this.ordersJson = new JSONArray();
                return;
            }
            this.ordersJson.put(obj);
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public Boolean ordersJsonIsEmpty() {
        return Boolean.valueOf(this.ordersJson.length() == 0);
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public void takeActiveUser(Object obj) {
        String[] strArrSplit = obj.toString().split("\n\t");
        if (strArrSplit.length > 0) {
            String[] strArrSplit2 = strArrSplit[0].split(":");
            if (strArrSplit2.length > 0) {
                String str = strArrSplit2[1];
                if (str.substring(0, 1).equals(" ")) {
                    this.activeUser = str.substring(1);
                } else {
                    this.activeUser = str;
                }
            }
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public void takeLevel(String str) {
        try {
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length < 2 || !strArrSplit[0].toLowerCase().contains("level")) {
                return;
            }
            int i10 = 1 << 1;
            this.userLevel = Integer.valueOf(Integer.parseInt(strArrSplit[1].trim()));
        } catch (Exception e10) {
            Logger.INSTANCE.error("[Migration] ", e10);
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public void takePeopleCard(Object obj) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
            Enumeration enumerationKeys = concurrentHashMap.keys();
            while (enumerationKeys.hasMoreElements()) {
                String str = (String) enumerationKeys.nextElement();
                if (containsKey(str)) {
                    this.userCard.accumulate(str, concurrentHashMap.get(str));
                }
            }
        } catch (Exception e10) {
            Logger.INSTANCE.error("[Migration] ", e10);
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public void takeTrackingStatus(Integer num) {
        if (num.intValue() == 0) {
            this.trackingAvailable = 0;
        } else if (num.intValue() == 1) {
            this.trackingAvailable = 1;
        } else {
            Logger.INSTANCE.error("[Migration] trackingStatus not found!", null);
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public void takeTutorialData(ArrayList<?> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (!(obj instanceof Integer)) {
                this.tutorialJson = new JSONArray();
                return;
            }
            this.tutorialJson.put(((Integer) obj).intValue());
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public void takeUserId(String str, Object obj) {
        if (obj != null && (obj instanceof String) && !obj.toString().trim().equals("") && str.contains(obj.toString())) {
            this.userId = obj.toString();
        }
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public Boolean trackingStatusIsNull() {
        return Boolean.valueOf(this.trackingAvailable == null);
    }

    @Override // com.devtodev.analytics.internal.migrator.IStamp
    public Boolean tutorialJsonIsEmpty() {
        return Boolean.valueOf(this.tutorialJson.length() == 0);
    }
}
