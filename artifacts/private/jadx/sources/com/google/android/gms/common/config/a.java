package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f106354d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final String f106355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final Object f106356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private Object f106357c = null;

    protected a(@NonNull String str, @NonNull Object obj) {
        this.f106355a = str;
        this.f106356b = obj;
    }

    @g6.a
    public static boolean c() {
        synchronized (f106354d) {
        }
        return false;
    }

    @NonNull
    @g6.a
    public static a<Float> f(@NonNull String str, @NonNull Float f10) {
        return new e(str, f10);
    }

    @NonNull
    @g6.a
    public static a<Integer> g(@NonNull String str, @NonNull Integer num) {
        return new d(str, num);
    }

    @NonNull
    @g6.a
    public static a<Long> h(@NonNull String str, @NonNull Long l10) {
        return new c(str, l10);
    }

    @NonNull
    @g6.a
    public static a<String> i(@NonNull String str, @NonNull String str2) {
        return new f(str, str2);
    }

    @NonNull
    @g6.a
    public static a<Boolean> j(@NonNull String str, boolean z10) {
        return new b(str, Boolean.valueOf(z10));
    }

    @NonNull
    @g6.a
    public final T a() {
        T t10;
        T t11 = (T) this.f106357c;
        if (t11 != null) {
            return t11;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = f106354d;
        synchronized (obj) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (obj) {
            try {
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            try {
                t10 = (T) k(this.f106355a);
            } catch (Throwable th4) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th4;
            }
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                t10 = (T) k(this.f106355a);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th5) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th5;
            }
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return t10;
    }

    @NonNull
    @g6.a
    @Deprecated
    public final T b() {
        return a();
    }

    @l1
    @g6.a
    public void d(@NonNull T t10) {
        this.f106357c = t10;
        Object obj = f106354d;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @l1
    @g6.a
    public void e() {
        this.f106357c = null;
    }

    @NonNull
    protected abstract Object k(@NonNull String str);
}
