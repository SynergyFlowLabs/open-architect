package com.planner5d.library.activity.fragment.snapshots;

import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.snapshot.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public class n0 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f136068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t f136069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.config.j f136070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Timer f136071d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f136072e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.lifecycle.c1<List<Snapshot>> f136073f = new a(new ArrayList());

    class a extends androidx.lifecycle.c1<List<Snapshot>> {
        a(List list) {
            super(list);
        }

        @Override // androidx.lifecycle.w0
        protected void m() {
            if (n0.this.f136070c.a(com.planner5d.library.model.manager.config.f.RenderFlowUpdate)) {
                return;
            }
            synchronized (n0.this.f136072e) {
                try {
                    n0.this.f136071d = new Timer();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n0.this.c0();
        }

        @Override // androidx.lifecycle.w0
        protected void n() {
            synchronized (n0.this.f136072e) {
                n0.this.a0();
                n0.this.f136071d = null;
            }
        }
    }

    class b extends com.planner5d.library.services.rx.e<List<Snapshot>> {

        class a extends TimerTask {
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                n0.this.c0();
            }
        }

        b() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            throw new RuntimeException(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(List<Snapshot> list) {
            int i10;
            if (n0.this.f136073f.f() != 0 && ((List) n0.this.f136073f.f()).size() != list.size()) {
                com.planner5d.library.services.m0.f224431d.t();
            }
            n0.this.f136073f.r(list);
            if (list.isEmpty()) {
                return;
            }
            Iterator<Snapshot> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = 6;
                    break;
                } else if (it.next().draft) {
                    i10 = 1;
                    break;
                }
            }
            synchronized (n0.this.f136072e) {
                try {
                    if (n0.this.f136071d != null) {
                        n0.this.a0();
                        n0 n0Var = n0.this;
                        Timer timer = new Timer();
                        n0Var.f136071d = timer;
                        timer.schedule(new a(), ((long) i10) * 10000);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @ij.a
    public n0(com.planner5d.library.modules.user.user.t tVar, b4 b4Var, com.planner5d.library.model.manager.config.j jVar) {
        this.f136069b = tVar;
        this.f136068a = b4Var;
        this.f136070c = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        synchronized (this.f136072e) {
            try {
                Timer timer = this.f136071d;
                if (timer != null) {
                    timer.cancel();
                    this.f136071d.purge();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public androidx.lifecycle.w0<List<Snapshot>> b0() {
        return this.f136073f;
    }

    void c0() {
        if (this.f136070c.a(com.planner5d.library.model.manager.config.f.RenderFlowUpdate)) {
            return;
        }
        synchronized (this.f136072e) {
            try {
                if (this.f136071d == null) {
                    return;
                }
                a0();
                this.f136068a.X(this.f136069b.a()).subscribe((Subscriber<? super List<Snapshot>>) new b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
