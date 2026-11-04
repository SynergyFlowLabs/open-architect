package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@u7.d
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f103483a = "cct";

    public static i a(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new c(context, aVar, aVar2, f103483a);
    }

    public static i b(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context c();

    @NonNull
    public abstract String d();

    public abstract com.google.android.datatransport.runtime.time.a e();

    public abstract com.google.android.datatransport.runtime.time.a f();
}
