package com.planner5d.library.widget.editor.editor3d;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.widget.editor.facade.i0;
import com.planner5d.library.widget.editor.helper.g1;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class l implements com.planner5d.library.engine.b, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.b f255583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.controller.f f255584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.application.b f255585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.controller.a f255586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s0 f255587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t1 f255588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b2 f255589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c2 f255591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.services.utility.w f255593i;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor3d.model.i f255596j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.planner5d.library.engine.i f255597k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private final dc.d<cc.a> f255598k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ac.f f255599l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final vb.g f255600l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final cc.f f255602m3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Observable<Void> f255605p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.planner5d.library.engine.g f255608s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i0 f255595j = new i0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f255601m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f255603n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f255604o = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.scene3d.j f255609t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.e f255610v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.g f255611w = null;
    private com.planner5d.library.widget.editor.helper.selector.a X = null;
    private com.planner5d.library.widget.editor.facade.f Y = null;
    private final AtomicBoolean Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f255606p1 = false;
    private boolean H1 = false;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f255607p2 = false;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final List<Pair<com.planner5d.library.widget.editor.editaction.e, com.planner5d.library.widget.editor.editaction.h>> f255590g3 = new LinkedList();

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private float f255592h3 = 0.0f;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private vb.a f255594i3 = null;

    class a extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.editor3d.model.e.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f255612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j f255613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ItemProject f255614f;

        a(Subscriber subscriber, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ItemProject itemProject) {
            this.f255612d = subscriber;
            this.f255613e = jVar;
            this.f255614f = itemProject;
        }

        private boolean e() {
            boolean z10;
            synchronized (l.this.f255601m) {
                try {
                    z10 = l.this.f255609t == this.f255613e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, com.planner5d.library.widget.editor.editor3d.model.e.b bVar, ItemProject itemProject, Subscriber subscriber) {
            if (e()) {
                jVar.e0(bVar.f255743c, itemProject);
                subscriber.onNext(bVar);
            }
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            this.f255612d.onError(th2);
            synchronized (l.this.f255601m) {
                try {
                    if (e()) {
                        this.f255613e.Z();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(final com.planner5d.library.widget.editor.editor3d.model.e.b bVar) {
            if (e()) {
                final com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255613e;
                final ItemProject itemProject = this.f255614f;
                final Subscriber subscriber = this.f255612d;
                jVar.M(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f255578a.f(jVar, bVar, itemProject, subscriber);
                    }
                });
            }
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            synchronized (l.this.f255601m) {
                try {
                    l.this.f255610v = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f255612d.onCompleted();
            synchronized (l.this.f255601m) {
                try {
                    if (e()) {
                        this.f255613e.Z();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @ij.a
    public l(com.planner5d.library.application.b bVar, s0 s0Var, t1 t1Var, b2 b2Var, k5 k5Var, y0 y0Var, ec.e eVar, c2 c2Var, com.planner5d.library.services.utility.w wVar, com.planner5d.library.engine.i iVar, ac.f fVar, bc.c cVar, cc.b bVar2, dc.d<cc.a> dVar, com.planner5d.library.engine.h hVar, com.planner5d.library.model.manager.builtin.n nVar, vb.g gVar, cc.f fVar2, dd.c cVar2) {
        com.planner5d.library.widget.editor.editor3d.model.i iVar2 = new com.planner5d.library.widget.editor.editor3d.model.i(this);
        this.f255596j3 = iVar2;
        this.f255583a = new ve.b(bVar, b2Var, k5Var, y0Var, s0Var, eVar, iVar2, new ij.c() { // from class: com.planner5d.library.widget.editor.editor3d.b
            @Override // ij.c
            public final Object get() {
                return this.f255379a.h0();
            }
        }, c2Var, cVar, bVar2, nVar, new ec.a(cVar2, nVar));
        this.f255585c = bVar;
        this.f255587e = s0Var;
        this.f255588f = t1Var;
        this.f255589g = b2Var;
        this.f255591h = c2Var;
        this.f255593i = wVar;
        this.f255597k = iVar;
        this.f255599l = fVar;
        this.f255598k3 = dVar;
        this.f255600l3 = gVar;
        this.f255602m3 = fVar2;
        this.f255608s = hVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.planner5d.library.widget.editor.editor3d.scene3d.j L0() {
        int i10 = 0;
        while (true) {
            if (i10 >= 200 && !this.Z.get()) {
                return null;
            }
            synchronized (this.f255601m) {
                try {
                    com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
                    if (jVar != null) {
                        return jVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o3.c(100L);
            i10++;
        }
    }

    private vb.b Q() {
        vb.b bVar = new vb.b();
        bVar.f385710a = 8;
        bVar.f385711b = 8;
        bVar.f385712c = 8;
        bVar.f385713d = 8;
        bVar.f385716g = 2;
        bVar.f385714e = 24;
        return bVar;
    }

    private void d0(final com.planner5d.library.widget.editor.editaction.e eVar, @NonNull final com.planner5d.library.widget.editor.editaction.h hVar) {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
        if (jVar == null || this.f255594i3.k()) {
            return;
        }
        hVar.d(jVar, this.f255583a);
        eVar.a(hVar);
        jVar.M(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f255572a.g0(eVar, hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ vb.c f0(vb.a aVar, vb.b bVar) {
        return this.f255597k.a(aVar, bVar, this.f255600l3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(com.planner5d.library.widget.editor.editaction.e eVar, com.planner5d.library.widget.editor.editaction.h hVar) {
        eVar.c(hVar);
        synchronized (this.f255604o) {
            try {
                if (this.f255590g3.isEmpty()) {
                    this.f255607p2 = false;
                } else {
                    Pair<com.planner5d.library.widget.editor.editaction.e, com.planner5d.library.widget.editor.editaction.h> pairRemove = this.f255590g3.remove(0);
                    d0((com.planner5d.library.widget.editor.editaction.e) pairRemove.first, (com.planner5d.library.widget.editor.editaction.h) pairRemove.second);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j h0() {
        return this.f255609t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] j0(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, int i10, int i11) throws Throwable {
        byte[] bArrX;
        synchronized (this.f255601m) {
            try {
                bArrX = jVar.X(this.f255608s, this.Y.G1(), i10, i11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0() {
        this.f255594i3.h().X5(this.f255586d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.widget.editor.a.b o0(final ItemProject itemProject, Subscriber subscriber) throws Throwable {
        final com.planner5d.library.widget.editor.editor3d.scene3d.j jVarL0 = L0();
        synchronized (this.f255601m) {
            try {
                if (jVarL0 == null) {
                    subscriber.onError(this.Z.get() ? new q.a() : new Exception("Scene not initialized"));
                    return null;
                }
                synchronized (this.f255601m) {
                    try {
                        jVarL0.c0(this.f255608s);
                        jVarL0.m(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f255382a.k0();
                            }
                        });
                        this.f255584b.g0(jVarL0).d0(this.f255608s);
                        this.f255592h3 = itemProject.getActiveFloorZ();
                        w0();
                        if (this.f255610v != null) {
                            subscriber.onError(new Exception("Loader already in progress"));
                            return null;
                        }
                        jVarL0.a0();
                        jVarL0.N(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                jVarL0.e0(new com.planner5d.library.widget.editor.editor3d.model.n[0], itemProject);
                            }
                        }, 5000L);
                        jVarL0.j();
                        com.planner5d.library.widget.editor.editor3d.model.e eVar = new com.planner5d.library.widget.editor.editor3d.model.e(itemProject, this.f255583a, this.f255598k3, this.f255589g, this, jVarL0, true);
                        this.f255610v = eVar;
                        Observable<com.planner5d.library.widget.editor.editor3d.model.e.b> observableU = eVar.u();
                        Scheduler scheduler = com.planner5d.library.services.rx.c.f224933c;
                        observableU.subscribeOn(scheduler).onBackpressureDrop().observeOn(scheduler).subscribe((Subscriber<? super com.planner5d.library.widget.editor.editor3d.model.e.b>) new a(subscriber, jVarL0, itemProject));
                        return null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(Item item, Subscriber subscriber) {
        if (item == null) {
            com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
            if (jVar != null) {
                jVar.k();
            }
        } else {
            this.f255609t.h0(item);
        }
        subscriber.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(final Item item, final Subscriber subscriber) {
        if (this.f255609t.M(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f255568a.r0(item, subscriber);
            }
        })) {
            return;
        }
        subscriber.onCompleted();
    }

    public Observable<com.planner5d.library.widget.editor.editor3d.scene3d.j> B0() {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.editor.editor3d.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f255577a.L0();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.w
    public void C0(vd.a aVar, int i10) {
        this.f255584b.C0(aVar, i10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.w
    public vb.a P0() {
        vb.a aVar;
        synchronized (this.f255603n) {
            aVar = this.f255594i3;
        }
        return aVar;
    }

    public vb.a X(Activity activity) {
        vb.a aVar;
        synchronized (this.f255603n) {
            try {
                if (this.f255594i3 == null) {
                    this.f255594i3 = this.f255597k.c(activity, this, Q(), new vb.e() { // from class: com.planner5d.library.widget.editor.editor3d.a
                        @Override // vb.e
                        public final vb.c a(vb.a aVar2, vb.b bVar) {
                            return this.f255374a.f0(aVar2, bVar);
                        }
                    });
                    com.planner5d.library.widget.editor.editor3d.controller.f fVar = new com.planner5d.library.widget.editor.editor3d.controller.f(new com.planner5d.library.widget.editor.editor3d.controller.h(this.f255585c), this.f255585c, this.f255594i3);
                    this.f255584b = fVar;
                    this.f255586d = new com.planner5d.library.widget.editor.editor3d.controller.a(fVar);
                }
                aVar = this.f255594i3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.planner5d.library.widget.editor.a
    public void a(float f10) {
        Item itemY;
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
        if (jVar == null || (itemY = jVar.y()) == null) {
            return;
        }
        jVar.K(itemY, itemY.getLayout(new ItemLayout()).setPositionZ(f10));
    }

    @Override // com.planner5d.library.widget.editor.a
    public void b() {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
        if (jVar != null) {
            jVar.g0(true);
        }
    }

    public com.planner5d.library.widget.editor.editor3d.scene3d.j b0() {
        return this.f255609t;
    }

    @Override // com.planner5d.library.engine.b
    public void c(int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        this.f255608s.b2(i10);
        this.f255608s.R1(i11);
        this.H1 = true;
        this.f255584b.W();
    }

    void c0() {
        synchronized (this.f255601m) {
            try {
                com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
                if (jVar != null) {
                    jVar.A();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.engine.b, gc.e
    public void dispose() {
        com.planner5d.library.widget.editor.editor3d.model.e eVar;
        this.Z.set(true);
        this.f255596j3.b().d();
        synchronized (this.f255601m) {
            eVar = this.f255610v;
            this.f255610v = null;
        }
        if (eVar != null) {
            eVar.A();
        }
        synchronized (this.f255601m) {
            try {
                com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
                if (jVar != null) {
                    jVar.l(this.f255585c);
                    this.f255609t = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f255583a.dispose();
        this.f255596j3.b().c();
        this.f255605p0 = null;
        setHelper(null);
        setListeners(new com.planner5d.library.widget.editor.facade.u());
    }

    @Override // com.planner5d.library.widget.editor.a
    public void e(float f10, boolean z10) {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
        Item itemY = jVar == null ? null : jVar.y();
        if (itemY != null) {
            ItemLayout layout = itemY.getLayout(new ItemLayout());
            if (z10) {
                layout.setRotationY(f10);
            } else {
                layout.setRotationX(f10);
            }
            this.f255609t.K(itemY, layout);
        }
    }

    @Override // com.planner5d.library.widget.editor.a
    public void f(@NonNull com.planner5d.library.widget.editor.editaction.e eVar, @NonNull com.planner5d.library.widget.editor.editaction.h hVar) {
        synchronized (this.f255604o) {
            try {
                if (this.f255607p2) {
                    this.f255590g3.add(new Pair<>(eVar, hVar));
                } else {
                    this.f255607p2 = true;
                    d0(eVar, hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void g(double d10) {
        this.f255586d.g(d10);
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public String getEditorCode() {
        return "3D";
    }

    @Override // com.planner5d.library.widget.editor.a
    public vd.a getRenderCamera() {
        return new vd.a(gc.d.c(new com.planner5d.library.math.m(this.f255608s.getPosition())), gc.d.c(new com.planner5d.library.math.m(this.f255608s.Q1()).u0().R(this.f255608s.getPosition())), gc.d.b(this.f255608s.V1()));
    }

    @Override // com.planner5d.library.widget.editor.a
    public Item getSelectedItem() {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
        if (jVar == null) {
            return null;
        }
        return jVar.y();
    }

    @Override // com.planner5d.library.widget.editor.a
    public Bundle getState() {
        Item selectedItem = getSelectedItem();
        return new com.planner5d.library.services.utility.i().h(com.planner5d.library.services.r.controller, this.f255584b.a0()).o(com.planner5d.library.services.r.viewport, new float[]{this.f255608s.M1(), this.f255608s.T1()}).j(com.planner5d.library.services.r.selected, selectedItem == null ? null : selectedItem.getUid()).a();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void h(float f10, boolean z10) {
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Void> i(final Item item) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor3d.i
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f255575a.t0(item, (Subscriber) obj);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public PointF j(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m();
        com.planner5d.library.engine.util.math.d.f(this.f255608s.S1(this.f255594i3.m(), pointF2.x, pointF2.y), gc.d.f275441h, mVar);
        pointF2.set(gc.d.c(mVar).f180482a, mVar.f180484c);
        return pointF2;
    }

    @Override // com.planner5d.library.engine.b
    public void k() {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar;
        Observable<Void> observable;
        this.f255608s.c2(0.4f);
        this.f255608s.N1(100.0f);
        com.planner5d.library.engine.g gVar = this.f255608s;
        if (gVar instanceof gc.b) {
            ((gc.b) gVar).e(60.0f);
        }
        synchronized (this.f255601m) {
            jVar = new com.planner5d.library.widget.editor.editor3d.scene3d.j(P0(), this.f255583a, this.f255585c, this.f255587e, this.f255588f, true, this.X, this.Y, this.f255611w, this.f255591h, this.f255599l, this.f255598k3, this.f255602m3);
            this.f255609t = jVar;
        }
        jVar.W();
        if (this.f255606p1 || (observable = this.f255605p0) == null) {
            return;
        }
        this.f255606p1 = true;
        observable.subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    @Override // com.planner5d.library.widget.editor.a
    public void m(Item item) {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
        if (jVar == null || item == null) {
            return;
        }
        jVar.K(item, item.getLayout(new ItemLayout()));
    }

    @Override // com.planner5d.library.engine.b
    public void n1() {
        synchronized (this.f255601m) {
            try {
                com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
                if (jVar != null) {
                    jVar.c0(this.f255608s);
                    this.f255609t.V(this.f255608s, this.Y.G1());
                    this.f255586d.w();
                    this.f255584b.h0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Bitmap> o() {
        vb.a aVarP0 = P0();
        com.planner5d.library.engine.k kVarM = aVarP0.m();
        return (aVarP0.k() || kVarM == null) ? Observable.error(new Exception("Scene is inactive already")) : c0.f(this.f255609t, kVarM.getWidth(), kVarM.getHeight(), new c0.a() { // from class: com.planner5d.library.widget.editor.editor3d.g
            @Override // com.planner5d.library.widget.editor.editor3d.c0.a
            public final byte[] a(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, int i10, int i11) {
                return this.f255571a.j0(jVar, i10, i11);
            }
        });
    }

    @Override // com.planner5d.library.engine.m
    public void p() {
    }

    @Override // com.planner5d.library.widget.editor.editor3d.w
    public vd.a p0() {
        return this.f255584b.p0();
    }

    @Override // com.planner5d.library.engine.m
    public void pause() {
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void q(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        this.f255586d.q(kVar, kVar2);
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setHelper(g1 g1Var) {
        this.f255584b.setHelper(g1Var);
        if (g1Var != null) {
            g1Var.R2(this.f255595j);
        }
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setListeners(com.planner5d.library.widget.editor.facade.u uVar) {
        this.f255611w = uVar.b();
        this.X = uVar.d();
        com.planner5d.library.widget.editor.facade.f fVarA = uVar.a();
        this.Y = fVarA;
        this.f255584b.e0(fVarA, this.X);
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setState(Bundle bundle) {
        float[] fArrK;
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        if (!this.H1 && (fArrK = jVar.k(com.planner5d.library.services.r.viewport, null)) != null) {
            this.f255608s.b2(fArrK[0]);
            this.f255608s.R1(fArrK[1]);
        }
        this.f255584b.Z(jVar.h(com.planner5d.library.services.r.controller, null));
        this.X.p(jVar.t(com.planner5d.library.services.r.selected, null));
    }

    @Override // com.planner5d.library.widget.editor.a
    public void u(boolean z10) {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255609t;
        if (jVar != null) {
            jVar.g0(false);
        }
    }

    public void v0() {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar;
        synchronized (this.f255601m) {
            try {
                jVar = this.f255609t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            w0();
            this.f255584b.Y();
            jVar.C();
        }
    }

    public void w0() {
        this.f255584b.c0(this.Y.G1().f258077h ? 0.0f : this.f255592h3);
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public PointF x(com.planner5d.library.math.m mVar) {
        if (this.f255594i3.k()) {
            return new PointF(mVar.f180482a, mVar.f180483b);
        }
        com.planner5d.library.math.m mVar2 = new com.planner5d.library.math.m(mVar);
        com.planner5d.library.math.m mVarO1 = this.f255608s.O1(this.f255594i3.m(), gc.d.f(mVar2).y0(mVar2.f180482a, mVar2.f180484c, mVar2.f180483b));
        return new PointF(mVarO1.f180482a, this.f255608s.T1() - mVarO1.f180483b);
    }

    public void x0(PointF pointF) {
        this.f255584b.f0(pointF);
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<com.planner5d.library.widget.editor.a.b> y(final ItemProject itemProject) {
        return this.f255593i.n(new com.planner5d.library.services.utility.w.b() { // from class: com.planner5d.library.widget.editor.editor3d.e
            @Override // com.planner5d.library.services.utility.w.b
            public final Object a(Subscriber subscriber) {
                return this.f255566a.o0(itemProject, subscriber);
            }
        });
    }

    public void y0(Observable<Void> observable) {
        if (this.f255606p1) {
            return;
        }
        if (this.f255609t == null) {
            this.f255605p0 = observable;
        } else {
            this.f255606p1 = true;
            observable.subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        }
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Void> z() {
        return Observable.just(null);
    }
}
