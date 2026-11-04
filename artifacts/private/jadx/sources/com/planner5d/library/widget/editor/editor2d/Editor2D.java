package com.planner5d.library.widget.editor.editor2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.services.utility.q2;
import com.planner5d.library.widget.editor.editor2d.painter.a0;
import com.planner5d.library.widget.editor.facade.i0;
import com.planner5d.library.widget.editor.facade.u;
import com.planner5d.library.widget.editor.helper.g1;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes12.dex */
public class Editor2D extends l implements TextureView.SurfaceTextureListener, View.OnTouchListener, View.OnGenericMotionListener, ScaleGestureDetector.OnScaleGestureListener, com.planner5d.library.widget.editor.a, SurfaceHolder.Callback, com.planner5d.library.widget.editor.editor2d.painter.d.e {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f254813q3 = 0;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f254814r3 = 1;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f254815s3 = 2;
    private boolean H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor2d.painter.d f254816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f254817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f254818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f254819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g1 f254820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.g f254821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.planner5d.library.widget.editor.helper.selector.a f254822g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f254823g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i0 f254824h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final i f254825h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.planner5d.library.widget.editor.facade.f f254826i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final int f254827i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.planner5d.library.widget.editor.helper.g f254828j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private final m f254829j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f254830k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private final Runnable f254831k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.planner5d.library.math.k f254832l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private com.planner5d.library.widget.editor.editor2d.painter.d.C1727d f254833l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.planner5d.library.math.k f254834m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f254835m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Bundle f254836n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f254837n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f254838o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final Object f254839o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f254840p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f254841p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f254842p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private long f254843p3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ScaleGestureDetector f254844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PointF f254845t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final PointF f254846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final PointF f254847w;

    class a extends com.planner5d.library.services.rx.e<Integer> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            synchronized (Editor2D.this.f254839o3) {
                try {
                    Editor2D.this.f254837n3 = false;
                    if (Editor2D.this.f254835m3) {
                        Editor2D.this.f254835m3 = false;
                        Editor2D.this.U();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.a.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f254849d;

        class a extends com.planner5d.library.services.rx.e<Void> {
            a() {
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(Throwable th2) {
                b.this.f254849d.onError(th2);
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                b.this.f254849d.onNext(new com.planner5d.library.widget.editor.a.b(100));
                b.this.f254849d.onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f254849d = subscriber2;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            Editor2D editor2D = Editor2D.this;
            editor2D.Q(editor2D.getMeasuredWidth(), Editor2D.this.getMeasuredHeight()).subscribe((Subscriber) new a());
        }
    }

    class c extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f254852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f254853e;

        c(Subscriber subscriber, o oVar) {
            this.f254852d = subscriber;
            this.f254853e = oVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            this.f254852d.onError(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
            Editor2D.this.T(this.f254853e).subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e(this.f254852d));
        }
    }

    public Editor2D(Context context) {
        this(context, null);
    }

    private boolean D(PointF pointF, PointF pointF2) {
        o oVar = this.f254817b;
        if (oVar == null || !oVar.p(oVar.l(), pointF2)) {
            return false;
        }
        this.f254845t.set(pointF);
        this.f254842p2 = false;
        if (this.f254833l3 != null) {
            return false;
        }
        g1 g1Var = this.f254820e;
        com.planner5d.library.widget.editor.helper.g gVar = g1Var != null ? g1Var.f256317c4 : this.f254828j;
        if (gVar != null) {
            this.f254823g3 = true;
            gVar.b();
        }
        this.f254833l3 = this.f254816a.U(pointF2, com.planner5d.library.widget.editor.editor2d.painter.d.c.Move);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        a0.f255148d.d();
        this.f254829j3.b();
        this.f254817b = null;
        this.f254820e = null;
        this.f254821f = null;
        this.f254822g = null;
        this.f254824h = null;
        this.f254826i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f254822g.d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(ItemProject itemProject, Subscriber subscriber) {
        o oVar = this.f254817b;
        if (oVar != null) {
            oVar.v(itemProject, this.f254826i.j(), this.f254826i.z1(), false).subscribe((Subscriber<? super Void>) new c(subscriber, oVar));
        } else {
            subscriber.onError(new Exception("Scene is empty"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Subscriber subscriber) {
        com.planner5d.library.widget.editor.facade.f fVar = this.f254826i;
        boolean z10 = fVar == null;
        this.f254816a.R(this.f254817b, z10 ? null : fVar.B1(), z10 ? com.planner5d.library.model.p.b.normal : fVar.F1(), true).map(new Func1() { // from class: com.planner5d.library.widget.editor.editor2d.g
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return Editor2D.s((Integer) obj);
            }
        }).subscribe((Subscriber<? super R>) new b(subscriber, subscriber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Item item) {
        this.f254816a.S(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Subscriber subscriber) {
        while (!this.f254816a.x() && !this.f254816a.r()) {
            o3.c(10L);
        }
        subscriber.onCompleted();
    }

    private boolean L(PointF pointF, PointF pointF2) {
        if (!this.f254816a.t(this.f254833l3)) {
            return false;
        }
        if (!this.f254845t.equals(pointF)) {
            if (!this.f254842p2) {
                PointF pointF3 = this.f254845t;
                if (new com.planner5d.library.math.k(pointF3.x, pointF3.y).b0(pointF.x, pointF.y).F() <= this.f254827i3 || System.currentTimeMillis() - this.f254843p3 < 250) {
                    return false;
                }
            }
            this.f254845t.set(pointF);
            this.f254842p2 = true;
            this.f254816a.B(this.f254833l3, pointF2);
        }
        return true;
    }

    private boolean M(MotionEvent motionEvent) {
        g1 g1Var = this.f254820e;
        com.planner5d.library.widget.editor.helper.g gVar = g1Var != null ? g1Var.f256317c4 : this.f254828j;
        if (gVar != null) {
            return this.f254825h3.b(this.f254817b, this.f254816a, motionEvent.getActionMasked(), this.f254847w, gVar);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 5) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean N(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.editor2d.Editor2D.N(android.view.MotionEvent):boolean");
    }

    private boolean O(MotionEvent motionEvent) {
        if ((this.f254844s.isInProgress() || motionEvent.getPointerCount() == 2) && !this.f254816a.t(this.f254833l3) && !this.f254825h3.c()) {
            try {
                return this.f254844s.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    private void P(PointF pointF, PointF pointF2) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = this.f254826i.G1();
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = 7 << 1;
        pointF3.offset(iArr[0], iArr[1]);
        if (this.f254816a.t(this.f254833l3)) {
            this.f254816a.X(this.f254833l3);
            this.f254833l3 = null;
            if (this.f254822g != null) {
                S();
                if (!this.f254842p2) {
                    this.f254822g.M(pointF3, this.f254817b.j(pointF2, bVarG1)).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
                }
            }
        } else if (this.f254822g != null) {
            S();
            com.planner5d.library.widget.editor.helper.selector.a aVar = this.f254822g;
            aVar.t(this.f254817b.n(aVar, pointF2, bVarG1), true);
        }
        this.f254842p2 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<Void> Q(int i10, int i11) {
        com.planner5d.library.widget.editor.facade.f fVar = this.f254826i;
        if (this.f254817b == null || this.f254818c || i10 <= 0 || i11 <= 0 || fVar == null) {
            return Observable.just(null);
        }
        this.f254818c = true;
        PointF pointFE1 = fVar.E1();
        com.planner5d.library.widget.editor.editor2d.painter.d dVar = this.f254816a;
        float f10 = pointFE1.x;
        float f11 = dVar.K;
        dVar.C(f10 - ((i10 / 2) / f11), pointFE1.y - ((i11 / 2) / f11), false);
        return this.f254816a.b0();
    }

    private void S() {
        com.planner5d.library.widget.editor.helper.g gVar;
        g1 g1Var;
        boolean z10 = this.f254823g3;
        if (z10 && (g1Var = this.f254820e) != null) {
            this.f254823g3 = false;
            g1Var.f256317c4.i();
        } else {
            if (!z10 || (gVar = this.f254828j) == null) {
                return;
            }
            this.f254823g3 = false;
            gVar.i();
        }
    }

    public static /* synthetic */ com.planner5d.library.widget.editor.a.b s(Integer num) {
        return new com.planner5d.library.widget.editor.a.b(Math.min(num.intValue(), 99));
    }

    public void R() {
        this.f254816a.q();
    }

    public Observable<com.planner5d.library.widget.editor.a.b> T(o oVar) {
        this.f254817b = oVar;
        Bundle bundle = this.f254836n;
        if (bundle != null) {
            setState(bundle);
        }
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.c
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f254866a.H((Subscriber) obj);
            }
        });
    }

    public void U() {
        synchronized (this.f254839o3) {
            try {
                if (this.f254837n3) {
                    this.f254835m3 = true;
                } else {
                    com.planner5d.library.widget.editor.facade.f fVar = this.f254826i;
                    if (fVar == null) {
                        return;
                    }
                    this.f254837n3 = true;
                    this.f254816a.Q(fVar.B1(), fVar.F1()).subscribe((Subscriber<? super Integer>) new a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Observable<Void> V() {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.d
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f254867a.J((Subscriber) obj);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.a
    public void a(float f10) {
    }

    @Override // com.planner5d.library.widget.editor.a
    public void b() {
    }

    @Override // com.planner5d.library.widget.editor.editor2d.painter.d.e
    public void c() {
        this.f254821f.e();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void e(float f10, boolean z10) {
    }

    @Override // com.planner5d.library.widget.editor.a
    public void f(@NonNull com.planner5d.library.widget.editor.editaction.e eVar, @NonNull com.planner5d.library.widget.editor.editaction.h hVar) {
        hVar.c(this.f254817b);
        eVar.a(hVar);
        eVar.c(hVar);
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public String getEditorCode() {
        return "2D";
    }

    public com.planner5d.library.widget.editor.editor2d.painter.d getPainterData() {
        return this.f254816a;
    }

    @Override // com.planner5d.library.widget.editor.a
    public vd.a getRenderCamera() {
        o oVar = this.f254817b;
        PointF pointF = new PointF(getMeasuredWidth(), getMeasuredHeight());
        PointF pointF2 = new PointF(pointF.x / 2.0f, pointF.y / 2.0f);
        int i10 = 6 & 0;
        PointF pointF3 = new PointF(0.0f, 0.0f);
        ItemProject itemProjectH = oVar == null ? null : oVar.h();
        float activeFloorZ = itemProjectH != null ? itemProjectH.getActiveFloorZ() : 0.0f;
        this.f254816a.A(pointF2);
        this.f254816a.A(pointF3);
        this.f254816a.A(pointF);
        return new vd.a(new com.planner5d.library.math.m(pointF2.x, ((float) (((double) (Math.min(Math.abs(pointF.x - pointF3.x), Math.abs(pointF.y - pointF3.y)) / 2.0f)) / Math.tan(Math.toRadians(37.5d)))) + activeFloorZ, pointF2.y), new com.planner5d.library.math.m(pointF2.x, activeFloorZ, pointF2.y - 1.0f), 50.0f);
    }

    @fj.h
    public o getScene() {
        return this.f254817b;
    }

    @Override // com.planner5d.library.widget.editor.a
    public Item getSelectedItem() {
        o oVar = this.f254817b;
        if (oVar == null) {
            return null;
        }
        return oVar.l();
    }

    @Override // com.planner5d.library.widget.editor.a
    public Bundle getState() {
        Bundle bundleA = new com.planner5d.library.services.utility.i().h(r.painter, this.f254816a.L()).a();
        o oVar = this.f254817b;
        if (oVar != null) {
            oVar.u(bundleA);
        }
        return bundleA;
    }

    @Override // com.planner5d.library.widget.editor.a
    public void h(float f10, boolean z10) {
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Void> i(final Item item) {
        return com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.editor2d.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f255113a.I(item);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public PointF j(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        this.f254816a.A(pointF2);
        return pointF2;
    }

    @Override // com.planner5d.library.widget.editor.a
    public void m(Item item) {
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Bitmap> o() {
        return this.f254816a.E();
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 8 || motionEvent.getToolType(0) != 3) {
            return false;
        }
        this.f254816a.V(1.0f, motionEvent.getRawX(), motionEvent.getRawY());
        this.f254816a.e0((motionEvent.getAxisValue(9) * 0.1f) + 1.0f);
        this.f254816a.j();
        return true;
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f254830k) {
            this.f254830k = true;
            Q(i12 - i10, i13 - i11).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f254816a.e0(scaleGestureDetector.getScaleFactor());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f254838o = 1;
        this.f254841p1 = true;
        this.f254816a.V(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f254838o = 0;
        this.f254816a.j();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        surfaceCreated(null);
        onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceCreated(null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        surfaceChanged(null, 4, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.f254840p0 || this.f254817b == null || ((i10 = this.f254838o) != 0 && i10 != 1)) {
            return false;
        }
        if (O(motionEvent)) {
            return true;
        }
        this.f254846v.set(motionEvent.getX(), motionEvent.getY());
        this.f254847w.set(this.f254846v);
        this.f254816a.A(this.f254847w);
        return M(motionEvent) || N(motionEvent);
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void q(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        int i10 = this.f254838o;
        if (i10 == 0 || i10 == 2) {
            if (i10 == 0) {
                this.f254838o = 2;
                this.f254816a.W();
                this.f254816a.O(true);
            }
            if (!kVar.D()) {
                this.f254816a.C(kVar.R(10.0f).f180480a, kVar.f180481b, false);
            } else {
                this.f254838o = 0;
                this.f254816a.O(false);
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setHelper(g1 g1Var) {
        this.f254820e = g1Var;
        if (g1Var != null) {
            g1Var.R2(this.f254824h);
        }
    }

    public void setInteractionEnabled(boolean z10) {
        this.f254840p0 = z10;
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setListeners(u uVar) {
        this.f254821f = uVar.b();
        this.f254822g = uVar.d();
        i0.b bVarE = uVar.e();
        if (bVarE != null) {
            this.f254824h.f256112b = bVarE;
        }
        this.f254826i = uVar.a();
        this.f254828j = uVar.c();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void setState(Bundle bundle) {
        this.f254818c = true;
        if (this.f254817b == null) {
            this.f254836n = bundle;
            return;
        }
        this.f254836n = null;
        Bundle bundleH = new com.planner5d.library.services.utility.j(bundle).h(r.painter, null);
        if (bundleH != null) {
            this.f254816a.K(bundleH);
            this.f254829j3.g();
        }
        o oVar = this.f254817b;
        if (oVar != null) {
            oVar.t(bundle);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f254829j3.d(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f254829j3.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f254829j3.f();
    }

    @Override // com.planner5d.library.widget.editor.a
    public void u(boolean z10) {
        if (z10) {
            this.f254816a.d0();
        }
    }

    @Override // com.planner5d.library.widget.editor.a
    @NonNull
    public PointF x(com.planner5d.library.math.m mVar) {
        com.planner5d.library.math.k kVarZ = this.f254816a.Z(new com.planner5d.library.math.k(mVar.f180482a, mVar.f180483b));
        return new PointF(kVarZ.f180480a, kVarZ.f180481b);
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<com.planner5d.library.widget.editor.a.b> y(final ItemProject itemProject) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.b
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f254864a.G(itemProject, (Subscriber) obj);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    @Override // com.planner5d.library.widget.editor.a
    public Observable<Void> z() {
        return com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.editor2d.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f255115a.E();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public Editor2D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Editor2D(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f254817b = null;
        this.f254818c = false;
        this.f254819d = new PointF();
        this.f254820e = null;
        this.f254821f = null;
        this.f254822g = null;
        this.f254824h = new i0();
        this.f254826i = null;
        this.f254828j = null;
        this.f254830k = false;
        this.f254832l = new com.planner5d.library.math.k();
        this.f254834m = new com.planner5d.library.math.k();
        this.f254836n = null;
        this.f254838o = 0;
        this.f254845t = new PointF();
        this.f254846v = new PointF();
        this.f254847w = new PointF();
        this.f254840p0 = true;
        this.f254841p1 = false;
        this.H1 = false;
        this.f254842p2 = false;
        this.f254823g3 = false;
        this.f254825h3 = new i();
        this.f254831k3 = new Runnable() { // from class: com.planner5d.library.widget.editor.editor2d.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f255116a.F();
            }
        };
        this.f254833l3 = null;
        this.f254835m3 = false;
        this.f254837n3 = false;
        this.f254839o3 = new Object();
        this.f254843p3 = 0L;
        this.f254827i3 = getResources().getDimensionPixelSize(com.planner5d.library.f.g.f166949e5);
        com.planner5d.library.widget.editor.editor2d.painter.d dVar = new com.planner5d.library.widget.editor.editor2d.painter.d(context, this, this);
        this.f254816a = dVar;
        this.f254829j3 = new m(dVar, this.f254824h);
        setOnTouchListener(this);
        setOnGenericMotionListener(this);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.f254844s = scaleGestureDetector;
        q2.f(scaleGestureDetector, scaleGestureDetector.getClass(), "mMinSpan", 0);
    }
}
