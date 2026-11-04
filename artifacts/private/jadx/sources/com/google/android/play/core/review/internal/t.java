package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.b0;
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
public final class t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f114960n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f114961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f114962b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f114967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f114968h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ServiceConnection f114972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private IInterface f114973m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f114964d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("attachedRemoteTasksLock")
    private final Set f114965e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f114966f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f114970j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f114949a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b0("attachedRemoteTasksLock")
    private final AtomicInteger f114971k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f114963c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f114969i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, com.google.android.play.core.review.f fVar, @p0 o oVar) {
        this.f114961a = context;
        this.f114962b = iVar;
        this.f114968h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.f114962b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f114969i.get();
        if (oVar != null) {
            tVar.f114962b.c("calling onBinderDied", new Object[0]);
            oVar.a();
        } else {
            tVar.f114962b.c("%s : Binder has died.", tVar.f114963c);
            Iterator it = tVar.f114964d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f114964d.clear();
        }
        synchronized (tVar.f114966f) {
            try {
                tVar.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ void n(final t tVar, final com.google.android.gms.tasks.l lVar) {
        tVar.f114965e.add(lVar);
        lVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.review.internal.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f114950a.t(lVar, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f114973m != null || tVar.f114967g) {
            if (!tVar.f114967g) {
                jVar.run();
                return;
            } else {
                tVar.f114962b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f114964d.add(jVar);
                return;
            }
        }
        tVar.f114962b.c("Initiate binding to the service.", new Object[0]);
        tVar.f114964d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f114972l = rVar;
        tVar.f114967g = true;
        if (!tVar.f114961a.bindService(tVar.f114968h, rVar, 1)) {
            tVar.f114962b.c("Failed to bind to the service.", new Object[0]);
            tVar.f114967g = false;
            Iterator it = tVar.f114964d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(new u());
            }
            tVar.f114964d.clear();
        }
    }

    static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.f114962b.c("linkToDeath", new Object[0]);
        try {
            tVar.f114973m.asBinder().linkToDeath(tVar.f114970j, 0);
        } catch (RemoteException e10) {
            tVar.f114962b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.f114962b.c("unlinkToDeath", new Object[0]);
        tVar.f114973m.asBinder().unlinkToDeath(tVar.f114970j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f114963c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @b0("attachedRemoteTasksLock")
    public final void w() {
        Iterator it = this.f114965e.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.tasks.l) it.next()).d(v());
        }
        this.f114965e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f114960n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f114963c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f114963c, 10);
                    handlerThread.start();
                    map.put(this.f114963c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f114963c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    @p0
    public final IInterface e() {
        return this.f114973m;
    }

    public final void s(j jVar, @p0 com.google.android.gms.tasks.l lVar) {
        c().post(new m(this, jVar.b(), lVar, jVar));
    }

    final /* synthetic */ void t(com.google.android.gms.tasks.l lVar, Task task) {
        synchronized (this.f114966f) {
            try {
                this.f114965e.remove(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u(com.google.android.gms.tasks.l lVar) {
        synchronized (this.f114966f) {
            try {
                this.f114965e.remove(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new n(this));
    }
}
