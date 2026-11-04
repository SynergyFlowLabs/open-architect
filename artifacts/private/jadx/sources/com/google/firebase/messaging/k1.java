package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
class k1 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f123647f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f123648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f123649h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f123650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f123651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f123652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j1 f123653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f123654e;

    @androidx.annotation.l1
    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("this")
        @androidx.annotation.p0
        private k1 f123655a;

        public a(k1 k1Var) {
            this.f123655a = k1Var;
        }

        public void a() {
            k1.j();
            k1.this.f123650a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                k1 k1Var = this.f123655a;
                if (k1Var == null) {
                    return;
                }
                if (k1Var.i()) {
                    k1.j();
                    this.f123655a.f123653d.m(this.f123655a, 0L);
                    context.unregisterReceiver(this);
                    this.f123655a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    k1(j1 j1Var, Context context, p0 p0Var, long j10) {
        this.f123653d = j1Var;
        this.f123650a = context;
        this.f123654e = j10;
        this.f123651b = p0Var;
        this.f123652c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, e.f123470b);
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f123647f) {
            try {
                Boolean bool = f123649h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f123649h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable(e.f123469a, 3)) {
            e(str);
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f123647f) {
            try {
                Boolean bool = f123648g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f123648g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f123650a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable(e.f123469a, 3);
    }

    @Override // java.lang.Runnable
    @e.a({"Wakelock"})
    public void run() {
        if (h(this.f123650a)) {
            this.f123652c.acquire(e.f123471c);
        }
        try {
            try {
                try {
                    this.f123653d.o(true);
                    if (!this.f123651b.g()) {
                        this.f123653d.o(false);
                        if (h(this.f123650a)) {
                            try {
                                this.f123652c.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (f(this.f123650a) && !i()) {
                        new a(this).a();
                        if (h(this.f123650a)) {
                            try {
                                this.f123652c.release();
                                return;
                            } catch (RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    if (this.f123653d.s()) {
                        this.f123653d.o(false);
                    } else {
                        this.f123653d.t(this.f123654e);
                    }
                    if (h(this.f123650a)) {
                        this.f123652c.release();
                    }
                } catch (IOException e10) {
                    e10.getMessage();
                    this.f123653d.o(false);
                    if (h(this.f123650a)) {
                        this.f123652c.release();
                    }
                }
            } catch (RuntimeException unused3) {
            }
        } catch (Throwable th2) {
            if (h(this.f123650a)) {
                try {
                    this.f123652c.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}
