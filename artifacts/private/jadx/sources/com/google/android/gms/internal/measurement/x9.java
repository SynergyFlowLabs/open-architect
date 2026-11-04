package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x9 implements d9 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("SharedPreferencesLoader.class")
    private static final Map f108967f = new androidx.collection.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f108968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f108969b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f108971d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f108970c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final List f108972e = new ArrayList();

    private x9(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f108968a = sharedPreferences;
    }

    static x9 c(Context context, String str, Runnable runnable) {
        final x9 x9Var;
        SharedPreferences sharedPreferencesA;
        if (u8.a() && !str.startsWith("direct_boot:") && !u8.c(context)) {
            return null;
        }
        synchronized (x9.class) {
            try {
                Map map = f108967f;
                x9Var = (x9) map.get(str);
                if (x9Var == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        if (str.startsWith("direct_boot:")) {
                            if (u8.a()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            sharedPreferencesA = i1.a(context, str.substring(12), 0, e1.f108377a);
                        } else {
                            sharedPreferencesA = i1.a(context, str, 0, e1.f108377a);
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        x9Var = new x9(sharedPreferencesA, runnable);
                        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.w9
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                                this.f108943a.e(sharedPreferences, str2);
                            }
                        };
                        x9Var.f108969b = onSharedPreferenceChangeListener;
                        x9Var.f108968a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                        map.put(str, x9Var);
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return x9Var;
    }

    static synchronized void d() {
        try {
            Map map = f108967f;
            for (x9 x9Var : map.values()) {
                x9Var.f108968a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) com.google.common.base.j0.E(x9Var.f108969b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d9
    public final Object a(String str) {
        Map<String, ?> map = this.f108971d;
        if (map == null) {
            synchronized (this.f108970c) {
                try {
                    map = this.f108971d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f108968a.getAll();
                            this.f108971d = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f108970c) {
            try {
                this.f108971d = null;
                v9.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this) {
            try {
                Iterator it = this.f108972e.iterator();
                while (it.hasNext()) {
                    ((a9) it.next()).a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
