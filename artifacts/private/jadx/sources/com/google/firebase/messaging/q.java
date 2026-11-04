package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
class q implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f123706b = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<String> f123707a = new ArrayDeque(10);

    q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strH = n0.h(extras);
                if (!TextUtils.isEmpty(strH)) {
                    if (this.f123707a.contains(strH)) {
                        return;
                    } else {
                        this.f123707a.add(strH);
                    }
                }
                bundle = extras.getBundle(e.c.E);
            }
        } catch (RuntimeException unused) {
        }
        if (n0.F(bundle)) {
            n0.x(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @e.a({"ThreadPoolCreation"})
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        b(intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
