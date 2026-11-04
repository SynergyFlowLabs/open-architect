package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f106595a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f106596b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private static j2 f106597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.l1
    @androidx.annotation.p0
    static HandlerThread f106598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private static Executor f106599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f106600f;

    @g6.a
    public static int d() {
        return 4225;
    }

    @NonNull
    @g6.a
    public static l e(@NonNull Context context) {
        synchronized (f106595a) {
            try {
                if (f106597c == null) {
                    f106597c = new j2(context.getApplicationContext(), f106600f ? f().getLooper() : context.getMainLooper(), f106599e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f106597c;
    }

    @NonNull
    @g6.a
    public static HandlerThread f() {
        synchronized (f106595a) {
            try {
                HandlerThread handlerThread = f106598d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f106596b);
                f106598d = handlerThread2;
                handlerThread2.start();
                return f106598d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @g6.a
    public static HandlerThread g(int i10) {
        synchronized (f106595a) {
            try {
                HandlerThread handlerThread = f106598d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i10);
                f106598d = handlerThread2;
                handlerThread2.start();
                return f106598d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public static void h(@androidx.annotation.p0 Executor executor) {
        synchronized (f106595a) {
            try {
                j2 j2Var = f106597c;
                if (j2Var != null) {
                    j2Var.u(executor);
                }
                f106599e = executor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public static boolean i(int i10) {
        synchronized (f106595a) {
            try {
                if (f106598d != null) {
                    return false;
                }
                f106596b = i10;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public static void j() {
        synchronized (f106595a) {
            try {
                j2 j2Var = f106597c;
                if (j2Var != null && !f106600f) {
                    j2Var.v(f().getLooper());
                }
                f106600f = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public boolean a(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        return m(new f2(componentName, 4225), serviceConnection, str, null).f2();
    }

    @g6.a
    public boolean b(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str, @androidx.annotation.p0 Executor executor) {
        return m(new f2(componentName, 4225), serviceConnection, str, executor).f2();
    }

    @g6.a
    public boolean c(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        return m(new f2(str, 4225, false), serviceConnection, str2, null).f2();
    }

    @g6.a
    public void k(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        n(new f2(componentName, 4225), serviceConnection, str);
    }

    @g6.a
    public void l(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        n(new f2(str, 4225, false), serviceConnection, str2);
    }

    protected abstract ConnectionResult m(f2 f2Var, ServiceConnection serviceConnection, String str, @androidx.annotation.p0 Executor executor);

    protected abstract void n(f2 f2Var, ServiceConnection serviceConnection, String str);

    public final void o(@NonNull String str, @NonNull String str2, int i10, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z10) {
        n(new f2(str, str2, 4225, z10), serviceConnection, str3);
    }
}
