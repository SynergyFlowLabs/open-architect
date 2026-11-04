package com.google.firebase.inappmessaging.display.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.r;

/* JADX INFO: loaded from: classes5.dex */
public class i implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {
    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(com.google.firebase.inappmessaging.model.i iVar, r rVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.a("Created activity: " + activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        l.a("Destroyed activity: " + activity.getClass().getName());
    }

    public void onActivityPaused(Activity activity) {
        l.a("Pausing activity: " + activity.getClass().getName());
    }

    public void onActivityResumed(Activity activity) {
        l.a("Resumed activity: " + activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.a("SavedInstance activity: " + activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        l.a("Started activity: " + activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        l.a("Stopped activity: " + activity.getClass().getName());
    }
}
