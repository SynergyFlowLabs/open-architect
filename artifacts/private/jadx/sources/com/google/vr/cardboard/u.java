package com.google.vr.cardboard;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f126918a = "u";

    public void a(Context context) {
        Activity activityB;
        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 || (activityB = f.b(context)) == null) {
            return;
        }
        activityB.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 239);
    }
}
