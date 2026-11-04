package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f106939a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @g6.a
    public static boolean a(@NonNull Context context, @NonNull Throwable th2) {
        try {
            com.google.android.gms.common.internal.w.r(context);
            com.google.android.gms.common.internal.w.r(th2);
        } catch (Exception unused) {
        }
        return false;
    }
}
