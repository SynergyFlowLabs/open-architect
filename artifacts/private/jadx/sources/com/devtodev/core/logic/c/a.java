package com.devtodev.core.logic.c;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.devtodev.core.logic.SDKClient;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98289b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, Boolean> f98288a = new HashMap<>();

    public a() {
        c();
    }

    private void a() {
        SDKClient.getInstance().endSession();
        this.f98289b = true;
    }

    private boolean b() {
        Iterator<Boolean> it = this.f98288a.values().iterator();
        while (it.hasNext()) {
            if (it.next().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    private void c() {
        SDKClient.getInstance().startSession();
        this.f98289b = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f98288a.put(Integer.valueOf(activity.hashCode()), Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f98288a.remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f98289b = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        HashMap<Integer, Boolean> map = this.f98288a;
        Integer numValueOf = Integer.valueOf(activity.hashCode());
        Boolean bool = Boolean.TRUE;
        map.put(numValueOf, bool);
        if (this.f98289b) {
            c();
        }
        this.f98288a.put(Integer.valueOf(activity.hashCode()), bool);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f98288a.put(Integer.valueOf(activity.hashCode()), Boolean.FALSE);
        if (b()) {
            a();
        }
    }
}
