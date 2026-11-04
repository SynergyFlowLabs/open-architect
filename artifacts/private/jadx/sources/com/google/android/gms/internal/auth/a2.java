package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("SharedPreferencesLoader.class")
    private static final Map f107551c = new androidx.collection.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f107552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f107553b;

    @androidx.annotation.p0
    static a2 b(Context context, String str, Runnable runnable) {
        a2 a2Var;
        if (y0.b()) {
            throw null;
        }
        synchronized (a2.class) {
            try {
                a2Var = (a2) f107551c.get(null);
                if (a2Var == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return a2Var;
    }

    static synchronized void c() {
        try {
            Map map = f107551c;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((a2) it.next()).f107552a;
                throw null;
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.auth.h1
    @androidx.annotation.p0
    public final Object a(String str) {
        throw null;
    }
}
