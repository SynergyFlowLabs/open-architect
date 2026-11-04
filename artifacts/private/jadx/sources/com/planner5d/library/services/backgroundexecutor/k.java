package com.planner5d.library.services.backgroundexecutor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.planner5d.library.services.utility.o3;

/* JADX INFO: loaded from: classes10.dex */
class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f224031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.k f224032c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.c f224030a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f224033d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ServiceConnection f224034e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.planner5d.library.d f224035f = null;

    class a implements ServiceConnection {

        /* JADX INFO: renamed from: com.planner5d.library.services.backgroundexecutor.k$a$a, reason: collision with other inner class name */
        class BinderC1661a extends com.planner5d.library.e.b {
            BinderC1661a() {
            }

            @Override // com.planner5d.library.e
            public void ed(BackgroundExecutorThrowableContainer crash) {
                k.this.f224032c.f(crash.a());
            }
        }

        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (k.this.f224033d) {
                try {
                    k.this.f224030a = com.planner5d.library.c.b.i(iBinder);
                    try {
                        k kVar = k.this;
                        if (kVar.f224035f != null) {
                            kVar.f224030a.S3(k.this.f224035f);
                        }
                        k.this.f224030a.sa(new BinderC1661a());
                    } catch (RemoteException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (k.this.f224033d) {
                k.this.f224030a = null;
            }
        }
    }

    k(Context context, com.planner5d.library.model.manager.k crashReporter) {
        this.f224031b = context.getApplicationContext();
        this.f224032c = crashReporter;
    }

    public com.planner5d.library.c e(int retries) {
        for (int i10 = 0; i10 < retries; i10++) {
            com.planner5d.library.c cVar = this.f224030a;
            if (cVar != null) {
                return cVar;
            }
            this.f224031b.bindService(new Intent(this.f224031b, (Class<?>) BackgroundExecutorService.class), this.f224034e, 1);
            for (int i11 = 0; i11 < 50; i11++) {
                com.planner5d.library.c cVar2 = this.f224030a;
                if (cVar2 != null) {
                    return cVar2;
                }
                o3.c(100L);
            }
        }
        return null;
    }
}
