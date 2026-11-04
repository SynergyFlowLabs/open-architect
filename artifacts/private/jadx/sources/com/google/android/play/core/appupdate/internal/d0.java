package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.p0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f114822o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f114823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f114824b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f114829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f114830h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ServiceConnection f114834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private IInterface f114835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.play.core.appupdate.q f114836n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f114826d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("attachedRemoteTasksLock")
    private final Set f114827e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f114828f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f114832j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.appupdate.internal.v
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d0.j(this.f114856a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("attachedRemoteTasksLock")
    private final AtomicInteger f114833k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f114825c = "AppUpdateService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f114831i = new WeakReference(null);

    public d0(Context context, s sVar, String str, Intent intent, com.google.android.play.core.appupdate.q qVar, @p0 y yVar) {
        this.f114823a = context;
        this.f114824b = sVar;
        this.f114830h = intent;
        this.f114836n = qVar;
    }

    public static /* synthetic */ void j(d0 d0Var) {
        d0Var.f114824b.d("reportBinderDeath", new Object[0]);
        y yVar = (y) d0Var.f114831i.get();
        if (yVar != null) {
            d0Var.f114824b.d("calling onBinderDied", new Object[0]);
            yVar.a();
        } else {
            d0Var.f114824b.d("%s : Binder has died.", d0Var.f114825c);
            Iterator it = d0Var.f114826d.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(d0Var.v());
            }
            d0Var.f114826d.clear();
        }
        synchronized (d0Var.f114828f) {
            d0Var.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final d0 d0Var, final com.google.android.gms.tasks.l lVar) {
        d0Var.f114827e.add(lVar);
        lVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.appupdate.internal.u
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f114854a.t(lVar, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(d0 d0Var, t tVar) {
        if (d0Var.f114835m != null || d0Var.f114829g) {
            if (!d0Var.f114829g) {
                tVar.run();
                return;
            } else {
                d0Var.f114824b.d("Waiting to bind to the service.", new Object[0]);
                d0Var.f114826d.add(tVar);
                return;
            }
        }
        d0Var.f114824b.d("Initiate binding to the service.", new Object[0]);
        d0Var.f114826d.add(tVar);
        c0 c0Var = new c0(d0Var, null);
        d0Var.f114834l = c0Var;
        d0Var.f114829g = true;
        if (!d0Var.f114823a.bindService(d0Var.f114830h, c0Var, 1)) {
            d0Var.f114824b.d("Failed to bind to the service.", new Object[0]);
            d0Var.f114829g = false;
            Iterator it = d0Var.f114826d.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(new e0());
            }
            d0Var.f114826d.clear();
        }
    }

    static /* bridge */ /* synthetic */ void q(d0 d0Var) {
        d0Var.f114824b.d("linkToDeath", new Object[0]);
        try {
            d0Var.f114835m.asBinder().linkToDeath(d0Var.f114832j, 0);
        } catch (RemoteException e10) {
            d0Var.f114824b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(d0 d0Var) {
        d0Var.f114824b.d("unlinkToDeath", new Object[0]);
        d0Var.f114835m.asBinder().unlinkToDeath(d0Var.f114832j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f114825c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.b0("attachedRemoteTasksLock")
    public final void w() {
        Iterator it = this.f114827e.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.tasks.l) it.next()).d(v());
        }
        this.f114827e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f114822o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f114825c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f114825c, 10);
                    handlerThread.start();
                    map.put(this.f114825c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f114825c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    @p0
    public final IInterface e() {
        return this.f114835m;
    }

    public final void s(t tVar, @p0 com.google.android.gms.tasks.l lVar) {
        c().post(new w(this, tVar.b(), lVar, tVar));
    }

    final /* synthetic */ void t(com.google.android.gms.tasks.l lVar, Task task) {
        synchronized (this.f114828f) {
            try {
                this.f114827e.remove(lVar);
            } finally {
            }
        }
    }

    public final void u(com.google.android.gms.tasks.l lVar) {
        synchronized (this.f114828f) {
            this.f114827e.remove(lVar);
        }
        c().post(new x(this));
    }
}
