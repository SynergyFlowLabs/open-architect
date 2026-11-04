package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class r1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f123717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f123718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f123719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<a> f123720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private o1 f123721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f123722f;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f123723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.gms.tasks.l<Void> f123724b = new com.google.android.gms.tasks.l<>();

        a(Intent intent) {
            this.f123723a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.f123723a.getAction();
            aVar.d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.p1
                @Override // java.lang.Runnable
                public final void run() {
                    r1.a.b(this.f123705a);
                }
            }, 20L, TimeUnit.SECONDS);
            e().e(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.q1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f123724b.e(null);
        }

        Task<Void> e() {
            return this.f123724b.a();
        }
    }

    r1(Context context, String str) {
        this(context, str, a());
    }

    @e.a({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    @androidx.annotation.b0("this")
    private void b() {
        while (!this.f123720d.isEmpty()) {
            this.f123720d.poll().d();
        }
    }

    private synchronized void c() {
        while (!this.f123720d.isEmpty()) {
            try {
                o1 o1Var = this.f123721e;
                if (o1Var == null || !o1Var.isBinderAlive()) {
                    e();
                    return;
                } else {
                    this.f123721e.b(this.f123720d.poll());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (com.google.android.gms.common.stats.a.b().a(r5.f123717a, r5.f123718b, r5, 65) != false) goto L8;
     */
    @androidx.annotation.b0("this")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            r5 = this;
            boolean r0 = r5.f123722f
            if (r0 == 0) goto L5
            goto L1a
        L5:
            r0 = 1
            r4 = 5
            r5.f123722f = r0
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.a.b()     // Catch: java.lang.SecurityException -> L1c
            r4 = 5
            android.content.Context r1 = r5.f123717a     // Catch: java.lang.SecurityException -> L1c
            android.content.Intent r2 = r5.f123718b     // Catch: java.lang.SecurityException -> L1c
            r3 = 65
            boolean r0 = r0.a(r1, r2, r5, r3)     // Catch: java.lang.SecurityException -> L1c
            if (r0 == 0) goto L1c
        L1a:
            r4 = 4
            return
        L1c:
            r0 = 0
            r5.f123722f = r0
            r4 = 5
            r5.b()
            r4 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.r1.e():void");
    }

    @z7.a
    synchronized Task<Void> d(Intent intent) {
        a aVar;
        try {
            aVar = new a(intent);
            aVar.c(this.f123719c);
            this.f123720d.add(aVar);
            c();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(e.f123469a, 3)) {
                Objects.toString(componentName);
            }
            this.f123722f = false;
            if (iBinder instanceof o1) {
                this.f123721e = (o1) iBinder;
                c();
            } else {
                Objects.toString(iBinder);
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(e.f123469a, 3)) {
            Objects.toString(componentName);
        }
        c();
    }

    @androidx.annotation.l1
    r1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f123720d = new ArrayDeque();
        this.f123722f = false;
        Context applicationContext = context.getApplicationContext();
        this.f123717a = applicationContext;
        this.f123718b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f123719c = scheduledExecutorService;
    }
}
