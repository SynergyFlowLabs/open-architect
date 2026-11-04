package com.google.vr.ndk.base;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class n {
    public l a(Activity activity) {
        return m.c(activity, activity.getComponentName());
    }

    public l b(Context context) {
        ComponentName componentNameC = com.google.vr.cardboard.f.c(context);
        return componentNameC != null ? m.c(context, componentNameC) : new l();
    }

    public boolean c(Activity activity) {
        return d(activity);
    }

    public boolean d(Context context) {
        return b(context).f();
    }

    public boolean e(Context context) {
        return m.g(context);
    }

    public boolean f(Activity activity) {
        return g(activity);
    }

    public boolean g(Context context) {
        return b(context).c();
    }

    public boolean h(com.google.vr.sdk.proto.nano.a.c cVar) {
        return m.h(cVar);
    }
}
