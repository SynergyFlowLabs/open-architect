package com.planner5d.library.widget.editor.editor3d.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.services.utility.c2;
import rx.Subscriber;
import rx.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f255790a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Subscription f255791b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f255792c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f255793d = false;

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c2 f255794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j f255795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ve.b f255796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ItemNs[] f255797d;

        a(c2 c2Var, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ve.b bVar, ItemNs[] itemNsArr) {
            this.f255794a = c2Var;
            this.f255795b = jVar;
            this.f255796c = bVar;
            this.f255797d = itemNsArr;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (this.f255794a.d(context)) {
                synchronized (s.this.f255790a) {
                    try {
                        if (s.this.f255793d) {
                            return;
                        }
                        s.this.k(context);
                        s.this.i(context, this.f255795b, this.f255796c, this.f255797d, this.f255794a);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    class b extends com.planner5d.library.services.rx.e<n[]> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f255799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j f255800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ve.b f255801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c2 f255802g;

        b(Context context, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ve.b bVar, c2 c2Var) {
            this.f255799d = context;
            this.f255800e = jVar;
            this.f255801f = bVar;
            this.f255802g = c2Var;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
            s.this.h(this.f255799d, this.f255800e, this.f255801f, this.f255802g);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            synchronized (s.this.f255790a) {
                try {
                    s.this.f255791b = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ve.b bVar, ItemNs[] itemNsArr, c2 c2Var) {
        this.f255791b = p.e(itemNsArr, bVar, jVar, true).subscribe((Subscriber<? super n[]>) new b(context, jVar, bVar, c2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Context context) {
        synchronized (this.f255790a) {
            try {
                BroadcastReceiver broadcastReceiver = this.f255792c;
                if (broadcastReceiver != null) {
                    try {
                        context.unregisterReceiver(broadcastReceiver);
                    } catch (Throwable unused) {
                    }
                    this.f255792c = null;
                }
            } finally {
            }
        }
    }

    public void f(Context context) {
        synchronized (this.f255790a) {
            try {
                j(context);
                this.f255793d = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(Context context, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ve.b bVar, c2 c2Var) {
        synchronized (this.f255790a) {
            try {
                if (!this.f255793d) {
                    j(context);
                    h(context, jVar, bVar, c2Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(Context context, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ve.b bVar, c2 c2Var) {
        synchronized (this.f255790a) {
            try {
                if (!this.f255793d && this.f255791b == null && !c2Var.d(context)) {
                    ItemNs[] itemNsArrU = jVar.u();
                    if (itemNsArrU.length > 0) {
                        a aVar = new a(c2Var, jVar, bVar, itemNsArrU);
                        this.f255792c = aVar;
                        com.planner5d.library.services.network.b.k(context, aVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(Context context) {
        synchronized (this.f255790a) {
            try {
                if (this.f255793d) {
                    return;
                }
                k(context);
                Subscription subscription = this.f255791b;
                if (subscription != null) {
                    subscription.unsubscribe();
                    this.f255791b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
