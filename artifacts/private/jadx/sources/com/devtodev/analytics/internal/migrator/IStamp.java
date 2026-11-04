package com.devtodev.analytics.internal.migrator;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
interface IStamp {
    Boolean UserCardIsEmpty();

    Boolean UserIdIsNull();

    boolean activeUserIsNull();

    String getActiveUser();

    JSONObject getAllData();

    void getOrderData(ArrayList<?> arrayList);

    Boolean ordersJsonIsEmpty();

    void takeActiveUser(Object obj);

    void takeLevel(String str);

    void takePeopleCard(Object obj);

    void takeTrackingStatus(Integer num);

    void takeTutorialData(ArrayList<?> arrayList);

    void takeUserId(String str, Object obj);

    Boolean trackingStatusIsNull();

    Boolean tutorialJsonIsEmpty();
}
