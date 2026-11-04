package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.l0;
import androidx.annotation.p0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class x implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    y f105809c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ d0 f105812f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f105807a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Messenger f105808b = new Messenger(new com.google.android.gms.internal.cloudmessaging.f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            x xVar = this.f105804a;
            synchronized (xVar) {
                try {
                    a0 a0Var = (a0) xVar.f105811e.get(i10);
                    if (a0Var != null) {
                        xVar.f105811e.remove(i10);
                        xVar.f();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            a0Var.c(new b0(4, "Not supported by GmsCore", null));
                        } else {
                            a0Var.a(data);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Queue f105810d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseArray f105811e = new SparseArray();

    /* synthetic */ x(d0 d0Var, w wVar) {
        this.f105812f = d0Var;
    }

    final synchronized void a(int i10, @p0 String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, @p0 String str, @p0 Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i11 = this.f105807a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f105807a = 4;
                return;
            }
            this.f105807a = 4;
            com.google.android.gms.common.stats.a.b().c(this.f105812f.f105771a, this);
            b0 b0Var = new b0(i10, str, th2);
            Iterator it = this.f105810d.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).c(b0Var);
            }
            this.f105810d.clear();
            for (int i12 = 0; i12 < this.f105811e.size(); i12++) {
                ((a0) this.f105811e.valueAt(i12)).c(b0Var);
            }
            this.f105811e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    final void c() {
        this.f105812f.f105772b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.r
            @Override // java.lang.Runnable
            public final void run() {
                final a0 a0Var;
                while (true) {
                    final x xVar = this.f105801a;
                    synchronized (xVar) {
                        try {
                            if (xVar.f105807a != 2) {
                                return;
                            }
                            if (xVar.f105810d.isEmpty()) {
                                xVar.f();
                                return;
                            } else {
                                a0Var = (a0) xVar.f105810d.poll();
                                xVar.f105811e.put(a0Var.f105754a, a0Var);
                                xVar.f105812f.f105772b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        xVar.e(a0Var.f105754a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(a0Var));
                    }
                    d0 d0Var = xVar.f105812f;
                    Messenger messenger = xVar.f105808b;
                    int i10 = a0Var.f105756c;
                    Context context = d0Var.f105771a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = a0Var.f105754a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a0Var.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", a0Var.f105757d);
                    messageObtain.setData(bundle);
                    try {
                        xVar.f105809c.a(messageObtain);
                    } catch (RemoteException e10) {
                        xVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        try {
            if (this.f105807a == 1) {
                a(1, "Timed out while binding");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void e(int i10) {
        try {
            a0 a0Var = (a0) this.f105811e.get(i10);
            if (a0Var != null) {
                this.f105811e.remove(i10);
                int i11 = 0 & 3;
                a0Var.c(new b0(3, "Timed out waiting for response", null));
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void f() {
        if (this.f105807a == 2 && this.f105810d.isEmpty() && this.f105811e.size() == 0) {
            this.f105807a = 3;
            com.google.android.gms.common.stats.a.b().c(this.f105812f.f105771a, this);
        }
    }

    final synchronized boolean g(a0 a0Var) {
        int i10 = this.f105807a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f105810d.add(a0Var);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f105810d.add(a0Var);
            c();
            return true;
        }
        this.f105810d.add(a0Var);
        com.google.android.gms.common.internal.w.x(this.f105807a == 0);
        this.f105807a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (com.google.android.gms.common.stats.a.b().a(this.f105812f.f105771a, intent, this, 1)) {
                this.f105812f.f105772b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f105802a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f105812f.f105772b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = this.f105799a;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    try {
                        if (iBinder2 == null) {
                            xVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            xVar.f105809c = new y(iBinder2);
                            xVar.f105807a = 2;
                            xVar.c();
                        } catch (RemoteException e10) {
                            xVar.a(0, e10.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @l0
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f105812f.f105772b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f105803a.a(2, "Service disconnected");
            }
        });
    }
}
