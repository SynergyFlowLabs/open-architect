package com.planner5d.library.widget.editor.editor3dcardboard;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.HeadTransform;
import com.planner5d.library.activity.MainCardboard;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.helper.ItemProjectPosition;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.NotImplemented;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.widget.editor.facade.c0;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.n3;
import com.planner5d.library.widget.editor.helper.t3;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class l implements com.planner5d.library.widget.editor.editor3d.w, com.planner5d.library.widget.editor.editor3dcardboard.a {
    private static final float F3 = 1.8f;
    private final Object A3;
    private final com.planner5d.library.widget.editor.projectresources.viewoptions.b B3;
    private float C3;
    private final com.planner5d.library.widget.editor.editor3dcardboard.b D3;
    private final com.planner5d.library.widget.editor.editor3dcardboard.b.C1730b E3;

    @ij.a
    protected bc.c H1;

    @ij.a
    protected com.planner5d.library.model.manager.config.p X;

    @ij.a
    protected com.planner5d.library.model.manager.performancetracing.e Y;

    @ij.a
    protected g Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.b f255973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected d0 f255974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.b f255975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t f255976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.d f255977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected s0 f255978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected t1 f255979g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @ij.a
    protected dc.d<cc.a> f255980g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    protected ij.c<u> f255981h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @ij.a
    protected cc.f f255982h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    protected n3 f255983i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.engine.h f255984i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    protected b2 f255985j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.builtin.n f255986j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    protected k5 f255987k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @ij.a
    protected dd.c f255988k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    protected y0 f255989l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final vb.a f255990l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ij.a
    protected ec.e f255991m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.scene3d.j f255992m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @ij.a
    protected c2 f255993n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.scene3d.j f255994n3 = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @ij.a
    protected t0 f255995o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final gc.c f255996o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.engine.i f255997p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @ij.a
    protected ac.f f255998p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @ij.a
    protected cc.b f255999p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor3d.model.i f256000p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final com.planner5d.library.math.k f256001q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private final com.planner5d.library.math.k f256002r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.synchronization.i f256003s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final com.planner5d.library.services.utility.j f256004s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @ij.a
    protected c0 f256005t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor3d.model.e f256006t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f256007u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.widget.editor.facade.s f256008v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final float[] f256009v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.config.d f256010w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private final com.planner5d.library.engine.util.math.i f256011w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final com.planner5d.library.math.m f256012x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private final com.planner5d.library.math.k f256013y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private final com.planner5d.library.math.k f256014z3;

    class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j f256015a;

        a(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar) {
            this.f256015a = jVar;
        }

        @Override // com.planner5d.library.widget.editor.editor3dcardboard.w
        public boolean a() {
            synchronized (l.this.A3) {
                try {
                    com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = l.this.f255992m3;
                    com.planner5d.library.widget.editor.editor3d.scene3d.j jVar2 = this.f256015a;
                    if (jVar != jVar2) {
                        return false;
                    }
                    l.this.f255994n3 = jVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.planner5d.library.widget.editor.editor3dcardboard.w
        public void b(@NonNull t3 t3Var) {
            synchronized (l.this.A3) {
                try {
                    if (l.this.f255994n3 != this.f256015a) {
                        return;
                    }
                    l.this.P(t3Var.a(), this.f256015a);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.planner5d.library.widget.editor.editor3dcardboard.w
        public void onComplete() {
            synchronized (l.this.A3) {
                try {
                    if (l.this.f255994n3 == this.f256015a) {
                        l.this.f255994n3 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.editor3d.model.e.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j f256017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ItemProject f256018e;

        b(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, ItemProject itemProject) {
            this.f256017d = jVar;
            this.f256018e = itemProject;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(final com.planner5d.library.widget.editor.editor3d.model.e.b bVar) {
            synchronized (l.this.A3) {
                try {
                    if (l.this.f256007u3) {
                        return;
                    }
                    final com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f256017d;
                    final ItemProject itemProject = this.f256018e;
                    jVar.M(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            jVar.e0(bVar.f255743c, itemProject);
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            synchronized (l.this.A3) {
                try {
                    if (l.this.f256006t3 != null) {
                        l.this.f256006t3 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f256017d.Z();
        }
    }

    public l(final MainCardboard mainCardboard, final ViewGroup viewGroup, final GvrView gvrView) {
        int i10;
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
        this.f256001q3 = kVar;
        com.planner5d.library.math.k kVar2 = new com.planner5d.library.math.k();
        this.f256002r3 = kVar2;
        this.f256006t3 = null;
        this.f256007u3 = false;
        this.f256009v3 = new float[4];
        this.f256011w3 = new com.planner5d.library.engine.util.math.i();
        this.f256012x3 = new com.planner5d.library.math.m();
        this.f256013y3 = new com.planner5d.library.math.k();
        this.f256014z3 = new com.planner5d.library.math.k();
        this.A3 = new Object();
        this.B3 = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a().a();
        this.C3 = F3;
        com.planner5d.library.widget.editor.editor3dcardboard.b bVar = new com.planner5d.library.widget.editor.editor3dcardboard.b();
        this.D3 = bVar;
        this.E3 = new com.planner5d.library.widget.editor.editor3dcardboard.b.C1730b();
        com.planner5d.library.application.b.r().Z0(this);
        com.planner5d.library.widget.editor.editor3d.model.i iVar = new com.planner5d.library.widget.editor.editor3d.model.i(this);
        this.f256000p3 = iVar;
        com.planner5d.library.application.b bVar2 = this.f255975c;
        b2 b2Var = this.f255985j;
        k5 k5Var = this.f255987k;
        y0 y0Var = this.f255989l;
        s0 s0Var = this.f255978f;
        ec.e eVar = this.f255991m;
        ij.c cVar = new ij.c() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.j
            @Override // ij.c
            public final Object get() {
                return this.f255968a.K();
            }
        };
        c2 c2Var = this.f255993n;
        bc.c cVar2 = this.H1;
        cc.b bVar3 = this.f255999p2;
        com.planner5d.library.model.manager.builtin.n nVar = this.f255986j3;
        this.f255973a = new ve.b(bVar2, b2Var, k5Var, y0Var, s0Var, eVar, iVar, cVar, c2Var, cVar2, bVar3, nVar, new ec.a(this.f255988k3, nVar));
        gc.c cVarC = this.f255984i3.c();
        this.f255996o3 = cVarC;
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(mainCardboard.getIntent().getExtras());
        this.f256004s3 = jVar;
        if (!jVar.a(com.planner5d.library.services.r.projectUri) && !jVar.a(com.planner5d.library.services.r.id)) {
            this.f255990l3 = null;
            mainCardboard.finish();
            return;
        }
        if (h3.L(mainCardboard)) {
            i10 = 0;
        } else {
            i10 = 0;
            this.f255985j.r(new ErrorMessageException(com.planner5d.library.f.s.Eb, new String[0]));
        }
        vb.b bVar4 = new vb.b();
        bVar4.f385716g = i10;
        bVar4.f385714e = 16;
        vb.a aVarC = this.f255997p0.c(mainCardboard, this, bVar4, new vb.e() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.k
            @Override // vb.e
            public final vb.c a(vb.a aVar, vb.b bVar5) {
                return this.f255969a.N(viewGroup, gvrView, mainCardboard, aVar, bVar5);
            }
        });
        this.f255990l3 = aVarC;
        vb.d dVar = (vb.d) aVarC.h();
        dVar.X5(bVar);
        dVar.K(bVar);
        cVarC.c2(0.2f);
        cVarC.N1(80.0f);
        kVar2.U(41.0f, 40.0f);
        kVar.U(1.0f, 0.0f).M();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.widget.editor.editor3d.scene3d.j K() {
        return this.f255992m3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ vb.c N(ViewGroup viewGroup, GvrView gvrView, MainCardboard mainCardboard, vb.a aVar, vb.b bVar) {
        viewGroup.removeAllViews();
        viewGroup.addView(gvrView);
        mainCardboard.G(gvrView);
        com.google.vr.sdk.base.a.b(mainCardboard, true);
        return this.f255997p0.a(aVar, bVar, this.f255981h.get().c(gvrView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(ItemProject itemProject, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar) {
        PointF pointF = ItemProjectPosition.getDefault(itemProject);
        this.C3 = gc.d.d(itemProject.getActiveFloorZ()) + F3;
        this.f256002r3.U(gc.d.d(pointF.x), gc.d.d(pointF.y));
        b0();
        itemProject.fixDuplicateUids();
        new com.planner5d.library.widget.editor.helper.k().d(itemProject);
        new com.planner5d.library.widget.editor.helper.j().b(itemProject);
        synchronized (this.A3) {
            try {
                if (!this.f256007u3) {
                    com.planner5d.library.widget.editor.editor3d.model.e eVar = new com.planner5d.library.widget.editor.editor3d.model.e(itemProject, this.f255973a, this.f255980g3, this.f255985j, this, jVar, false);
                    this.f256006t3 = eVar;
                    eVar.u().subscribe((Subscriber<? super com.planner5d.library.widget.editor.editor3d.model.e.b>) new b(jVar, itemProject));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void X() {
        c0();
        String strT = this.f256004s3.t(com.planner5d.library.services.r.id, null);
        String strT2 = this.f256004s3.t(com.planner5d.library.services.r.projectUri, null);
        if ((strT != null && !strT.isEmpty()) || (strT2 != null && !strT2.isEmpty())) {
            this.Z.c(new a(this.f255992m3), this.f256004s3.e());
        }
    }

    private void b0() {
        com.planner5d.library.math.m position = this.f255996o3.getPosition();
        com.planner5d.library.math.k kVar = this.f256002r3;
        position.y0(kVar.f180480a, this.C3, kVar.f180481b);
        this.f256013y3.V(this.f256001q3).R(com.planner5d.library.widget.editor.editor3d.scene3d.j.p(this.f255975c));
        gc.c cVar = this.f255996o3;
        com.planner5d.library.math.k kVar2 = this.f256002r3;
        float f10 = kVar2.f180480a;
        com.planner5d.library.math.k kVar3 = this.f256013y3;
        cVar.P1(f10 + kVar3.f180480a, this.C3, kVar2.f180481b + kVar3.f180481b);
    }

    private void c0() {
        com.planner5d.library.widget.editor.editor3d.model.e eVar;
        synchronized (this.A3) {
            try {
                eVar = this.f256006t3;
                this.f256006t3 = null;
                this.f255994n3 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (eVar != null) {
            eVar.A();
        }
    }

    @Override // com.planner5d.library.widget.editor.editor3d.w
    public void C0(vd.a aVar, int i10) {
    }

    @Override // com.planner5d.library.widget.editor.editor3d.w
    public vb.a P0() {
        return this.f255990l3;
    }

    void Q() {
        this.D3.e();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void a(float f10) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void b() {
    }

    @Override // com.planner5d.library.engine.b
    public void c(int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    @Override // com.planner5d.library.engine.b, gc.e
    public void dispose() {
        synchronized (this.A3) {
            try {
                if (this.f256007u3) {
                    return;
                }
                this.f256007u3 = true;
                this.f256000p3.b().d();
                c0();
                com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255992m3;
                if (jVar != null) {
                    jVar.l(this.f255990l3.getContext());
                    int i10 = 5 >> 0;
                    this.f255992m3 = null;
                }
                this.f255973a.dispose();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.a
    public void e(float f10, boolean z10) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void f(@NonNull com.planner5d.library.widget.editor.editaction.e eVar, @NonNull com.planner5d.library.widget.editor.editaction.h hVar) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public String getEditorCode() {
        return "3DCardboard";
    }

    @Override // com.planner5d.library.widget.editor.a
    public vd.a getRenderCamera() {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public Item getSelectedItem() {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public Bundle getState() {
        return null;
    }

    @Override // com.planner5d.library.widget.editor.a
    public void h(float f10, boolean z10) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Void> i(Item item) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public PointF j(PointF pointF) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.engine.b
    public void k() {
        this.f256007u3 = false;
        com.planner5d.library.widget.editor.helper.t1 t1Var = new com.planner5d.library.widget.editor.helper.t1(this.f255995o, this.f256003s, this.f256005t, this.f256008v, this.f255979g, this.Y);
        vb.a aVar = this.f255990l3;
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = new com.planner5d.library.widget.editor.editor3d.scene3d.j(aVar, this.f255973a, aVar.getContext(), this.f255978f, this.f255979g, false, t1Var, t1Var, t1Var.p1(), this.f255993n, this.f255998p1, this.f255980g3, this.f255982h3);
        jVar.c0(this.f255996o3);
        this.f255992m3 = jVar;
        X();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void m(Item item) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.engine.b
    public void n1() {
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Bitmap> o() {
        return Observable.just(null);
    }

    @Override // com.planner5d.library.widget.editor.editor3dcardboard.a
    public void onDrawEye(Eye eye) {
        this.f255996o3.d(eye.getEyeView());
        gc.c cVar = this.f255996o3;
        cVar.c(eye.b(cVar.V1(), this.f255996o3.X1()));
        this.f255996o3.L1();
        this.f255992m3.W();
        this.f255992m3.V(this.f255996o3, this.B3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008f A[PHI: r0
      0x008f: PHI (r0v11 float) = (r0v10 float), (r0v18 float) binds: [B:8:0x0080, B:10:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.planner5d.library.widget.editor.editor3dcardboard.a
    public void onNewFrame(HeadTransform headTransform) {
        this.D3.b(this.E3);
        if (this.E3.f255933a != null) {
            headTransform.d(this.f256009v3, 0);
            com.planner5d.library.math.m mVar = this.f256012x3;
            com.planner5d.library.math.k kVar = this.f256001q3;
            com.planner5d.library.math.m mVarY0 = mVar.y0(kVar.f180480a, 0.0f, kVar.f180481b);
            com.planner5d.library.engine.util.math.i iVar = this.f256011w3;
            float[] fArr = this.f256009v3;
            mVar.A0(com.planner5d.library.engine.util.math.n.b(mVarY0, iVar.M(fArr[0], fArr[1], fArr[2], fArr[3])));
            headTransform.b(this.f256009v3, 0);
            com.planner5d.library.math.k kVar2 = this.f256013y3;
            float[] fArr2 = this.f256009v3;
            kVar2.U(fArr2[0], fArr2[2]);
            headTransform.e(this.f256009v3, 0);
            com.planner5d.library.math.k kVar3 = this.f256013y3;
            com.planner5d.library.math.k kVar4 = this.f256014z3;
            float[] fArr3 = this.f256009v3;
            float fD = kVar3.d(kVar4.U(fArr3[0], fArr3[2]));
            float f10 = 180.0f;
            float f11 = fD > 0.0f ? 180.0f : 0.0f;
            int iIntValue = this.E3.f255933a.intValue();
            if (iIntValue != 1) {
                f10 = 90.0f;
                if (iIntValue == 3) {
                    f11 += f10;
                } else if (iIntValue == 4) {
                    f11 -= 90.0f;
                }
            } else {
                f11 += f10;
            }
            com.planner5d.library.math.k kVar5 = this.f256013y3;
            com.planner5d.library.math.m mVar2 = this.f256012x3;
            this.f256002r3.b(this.f256013y3.V(this.f256001q3).N(f11 + kVar5.U(mVar2.f180482a, mVar2.f180484c).c()).R(this.E3.f255934b * this.f255990l3.m().e()));
            b0();
        }
        this.f255992m3.c0(this.f255996o3);
    }

    @Override // com.planner5d.library.engine.m
    public void p() {
    }

    @Override // com.planner5d.library.widget.editor.editor3d.w
    public vd.a p0() {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.engine.m
    public void pause() {
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void q(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setHelper(g1 g1Var) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setListeners(com.planner5d.library.widget.editor.facade.u uVar) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setState(Bundle bundle) {
    }

    @Override // com.planner5d.library.widget.editor.a
    public void u(boolean z10) {
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public PointF x(com.planner5d.library.math.m mVar) {
        throw new NotImplemented();
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<com.planner5d.library.widget.editor.a.b> y(ItemProject itemProject) {
        return null;
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Void> z() {
        return Observable.just(null);
    }
}
