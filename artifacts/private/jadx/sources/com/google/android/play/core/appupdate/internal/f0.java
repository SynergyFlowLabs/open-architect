package com.google.android.play.core.appupdate.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
