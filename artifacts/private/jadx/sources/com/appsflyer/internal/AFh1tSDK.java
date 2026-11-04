package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public enum AFh1tSDK {
    application,
    activity,
    other;

    public static AFh1tSDK getRevenue(Context context) {
        if (context instanceof Activity) {
            return activity;
        }
        return context instanceof Application ? application : other;
    }
}
