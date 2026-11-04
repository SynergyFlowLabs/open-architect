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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f123570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f123571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f123572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.a({"ThreadPoolCreation"})
    @androidx.annotation.l1
    ExecutorService f123573d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("firebase-iid-executor"));

    @androidx.annotation.l1
    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private f1 f123574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Context f123575b;

        public a(f1 f1Var) {
            this.f123574a = f1Var;
        }

        public void a() {
            f1.c();
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            f1 f1Var = this.f123574a;
            if (f1Var != null) {
                Context contextB = f1Var.b();
                this.f123575b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f1 f1Var = this.f123574a;
            if (f1Var != null && f1Var.d()) {
                f1.c();
                this.f123574a.f123572c.w(this.f123574a, 0L);
                Context context2 = this.f123575b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f123574a = null;
            }
        }
    }

    @e.a({"InvalidWakeLockTag"})
    @androidx.annotation.l1
    public f1(FirebaseMessaging firebaseMessaging, long j10) {
        this.f123572c = firebaseMessaging;
        this.f123570a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f123571b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable(e.f123469a, 3);
    }

    Context b() {
        return this.f123572c.x();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @androidx.annotation.l1
    boolean e() throws IOException {
        try {
            return this.f123572c.r() != null;
        } catch (IOException e10) {
            if (j0.i(e10.getMessage())) {
                e10.getMessage();
                return false;
            }
            if (e10.getMessage() == null) {
                return false;
            }
            throw e10;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (com.google.firebase.messaging.b1.b().e(b()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r5.f123571b.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (com.google.firebase.messaging.b1.b().e(b()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (com.google.firebase.messaging.b1.b().e(b()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    @e.a({"WakelockTimeout"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.f1.run():void");
    }
}
