package com.planner5d.library.widget.editor.editor2d.painter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.m1;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditability;
import com.planner5d.library.model.item.ItemLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class d {
    private static final int P = 5;
    private static final long Q = TimeUnit.SECONDS.toMillis(3);
    private final com.planner5d.library.widget.editor.editor2d.drawable.d J;
    public final float K;
    public final float L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f255176i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final b f255182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f255183p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f255168a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f255169b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f255170c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f255171d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f255172e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Object f255173f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f255174g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f255175h = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f255177j = new h(new a());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AtomicBoolean f255178k = new AtomicBoolean(true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f255179l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    PointF f255180m = new PointF();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    x.c f255181n = x.c.Idle;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Object f255184q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Matrix f255185r = new Matrix();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    com.planner5d.library.widget.editor.editor2d.o f255186s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f255187t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Bitmap f255188u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Matrix f255189v = new Matrix();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final float[] f255190w = {0.0f, 0.0f};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f255191x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final Point f255192y = new Point();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C1727d f255193z = null;
    private final Object A = new Object();
    final PointF B = new PointF(0.5f, 4.0f);
    float C = 1.0f;
    float D = 1.0f;

    @fj.g
    com.planner5d.library.widget.editor.projectresources.viewoptions.b E = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a().a();
    private ItemEditability F = null;
    private final com.planner5d.library.math.k G = new com.planner5d.library.math.k();
    private final float[] H = new float[9];
    private final PointF[] I = {new PointF(), new PointF()};
    Item M = null;
    Object[][] N = new Object[0][];
    final Rect O = new Rect();

    class a implements h.a {
        a() {
        }

        @Override // com.planner5d.library.widget.editor.editor2d.painter.h.a
        public void a(boolean z10) {
            if (z10 || System.currentTimeMillis() - d.this.f255176i > d.Q) {
                d.this.J();
            }
            d.this.G();
        }

        @Override // com.planner5d.library.widget.editor.editor2d.painter.h.a
        public boolean b() {
            return d.this.r();
        }
    }

    public interface b {
        void d(Canvas canvas);

        @fj.h
        Canvas lock();
    }

    public enum c {
        Move,
        Rotate,
        ResizeXFromLeft,
        ResizeXFromRight,
        ResizeYFromTop,
        ResizeYFromBottom,
        ResizeXYFromTopLeft
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editor2d.painter.d$d, reason: collision with other inner class name */
    public static class C1727d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.h
        final Item f255203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final PointF f255204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final PointF f255205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f255206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f255207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f255208f;

        /* JADX INFO: Access modifiers changed from: private */
        public void g(PointF pointF) {
            if (!this.f255204b.equals(pointF)) {
                this.f255204b.set(pointF);
                this.f255207e = true;
            }
        }

        public c b() {
            return this.f255208f;
        }

        boolean c() {
            return this.f255207e;
        }

        public boolean d() {
            return this.f255208f == c.Move;
        }

        public boolean e() {
            c cVar = this.f255208f;
            return cVar == c.ResizeXFromRight || cVar == c.ResizeXFromLeft || cVar == c.ResizeYFromTop || cVar == c.ResizeYFromBottom || cVar == c.ResizeXYFromTopLeft;
        }

        public boolean f() {
            return this.f255208f == c.Rotate;
        }

        private C1727d(@fj.h Item item, PointF pointF, c cVar) {
            this.f255207e = false;
            this.f255203a = item;
            this.f255204b = new PointF(pointF.x, pointF.y);
            this.f255205c = new PointF(pointF.x, pointF.y);
            this.f255208f = cVar;
            this.f255206d = (item == null || !f()) ? null : Integer.valueOf((int) item.getLayout(new ItemLayout()).getRotationY());
        }
    }

    public interface e {
        @m1
        void c();
    }

    public d(Context context, b bVar, @fj.g e eVar) {
        int i10 = 1 >> 2;
        this.f255182o = bVar;
        this.J = new com.planner5d.library.widget.editor.editor2d.drawable.d(context);
        this.f255183p = eVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.K = displayMetrics.density / 2.0f;
        this.L = TypedValue.applyDimension(1, 1.0f, displayMetrics);
    }

    private void F() {
        X(null);
        synchronized (this.f255173f) {
            this.f255174g = true;
        }
        c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        synchronized (this.f255173f) {
            try {
                if (!this.f255174g) {
                    this.f255169b = true;
                    this.f255173f.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void H() {
        synchronized (this.f255173f) {
            this.f255174g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        this.f255176i = System.currentTimeMillis();
        com.planner5d.library.widget.editor.editor2d.o oVar = this.f255186s;
        List<com.planner5d.library.widget.editor.editor2d.drawable.c> arrayList = oVar == null ? new ArrayList<>() : oVar.d();
        RectF rectF = oVar == null ? new RectF(0.0f, 0.0f, 800.0f, 8000.0f) : oVar.c();
        Item itemL = oVar == null ? null : oVar.l();
        ArrayList arrayList2 = new ArrayList();
        if (itemL != null) {
            arrayList2.addAll(itemL.getDrawableInstanceTreeList());
        }
        Object[][] objArr = new Object[arrayList.size()][];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            com.planner5d.library.widget.editor.editor2d.drawable.c cVar = arrayList.get(i10);
            objArr[i10] = new Object[]{cVar, Boolean.valueOf(arrayList2.contains(cVar)), cVar.d(new RectF())};
        }
        synchronized (this.f255184q) {
            try {
                this.N = objArr;
                this.M = itemL;
                rectF.roundOut(this.O);
                q();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Matrix M(Canvas canvas, Matrix matrix) {
        synchronized (this.f255184q) {
            try {
                canvas.setMatrix(matrix);
                float f10 = this.K;
                canvas.scale(f10, f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return matrix;
    }

    private void Y(boolean z10, C1727d c1727d) {
        synchronized (this.f255184q) {
            try {
                C1727d c1727d2 = this.f255193z;
                if (c1727d2 == null) {
                    return;
                }
                if (z10 || c1727d2 == c1727d) {
                    this.f255193z = null;
                }
                G();
                J();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a0() {
        boolean z10;
        synchronized (this.f255184q) {
            try {
                z10 = this.f255168a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c0();
        if (z10) {
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        G();
        d0();
    }

    private boolean v() {
        boolean z10;
        synchronized (this.f255173f) {
            try {
                z10 = this.f255169b || this.f255168a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap y() throws Exception {
        Bitmap bitmap;
        synchronized (this.f255184q) {
            try {
                this.f255187t = true;
                this.f255188u = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a0();
        synchronized (this.f255184q) {
            bitmap = this.f255188u;
            this.f255187t = false;
            this.f255188u = null;
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(com.planner5d.library.widget.editor.editor2d.o oVar, com.planner5d.library.model.p.b bVar, boolean z10, Subscriber subscriber) {
        synchronized (this.A) {
            try {
                F();
                subscriber.onNext(50);
                if (oVar != null) {
                    this.f255177j.f(oVar.d(), bVar, z10);
                }
                subscriber.onNext(60);
                J();
                H();
                G();
                subscriber.onNext(100);
                subscriber.onCompleted();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PointF A(PointF pointF) {
        synchronized (this.f255189v) {
            float[] fArr = this.f255190w;
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
            this.f255185r.invert(this.f255189v);
            this.f255189v.mapPoints(this.f255190w);
            float[] fArr2 = this.f255190w;
            float f10 = fArr2[0];
            float f11 = this.K;
            pointF.set(f10 / f11, fArr2[1] / f11);
        }
        return pointF;
    }

    public void B(C1727d c1727d, PointF pointF) {
        synchronized (this.f255184q) {
            try {
                if (this.f255193z == c1727d && c1727d != null) {
                    c1727d.g(pointF);
                    G();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(float f10, float f11, boolean z10) {
        synchronized (this.f255184q) {
            if (!z10) {
                try {
                    float f12 = this.K;
                    f10 *= f12;
                    f11 *= f12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f255192y.offset((int) f10, (int) f11);
        }
        G();
    }

    public void D(Throwable th2) {
        if (((th2 instanceof OutOfMemoryError) || (th2 instanceof NullPointerException)) && this.f255175h.incrementAndGet() == 5) {
            this.f255183p.c();
        }
    }

    public Observable<Bitmap> E() {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.editor.editor2d.painter.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f255147a.y();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public void I() {
        while (true) {
            synchronized (this.f255173f) {
                try {
                    if (this.f255171d == null) {
                        return;
                    }
                    if (!this.f255170c) {
                        this.f255170c = true;
                        this.f255173f.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Thread.yield();
        }
    }

    public void K(Bundle bundle) {
        this.f255185r.setValues(new com.planner5d.library.services.utility.j(bundle).k(com.planner5d.library.services.r.matrix, null));
    }

    public Bundle L() {
        float[] fArr = new float[9];
        this.f255185r.getValues(fArr);
        return new com.planner5d.library.services.utility.i().o(com.planner5d.library.services.r.matrix, fArr).a();
    }

    public void N(Matrix matrix) {
        synchronized (this.f255184q) {
            try {
                this.f255185r.set(matrix);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void O(boolean z10) {
        synchronized (this.f255184q) {
            try {
                this.f255179l = z10;
                int i10 = 5 & 0;
                this.f255192y.set(0, 0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        G();
    }

    @m1
    public void P(Object obj) {
        while (true) {
            synchronized (this.f255173f) {
                try {
                    Object obj2 = this.f255171d;
                    if (obj2 == obj) {
                        return;
                    }
                    if (obj2 == null) {
                        this.f255171d = obj;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public Observable<Integer> Q(@fj.h ItemEditability itemEditability, com.planner5d.library.model.p.b bVar) {
        return R(this.f255186s, itemEditability, bVar, false);
    }

    public Observable<Integer> R(final com.planner5d.library.widget.editor.editor2d.o oVar, @fj.h ItemEditability itemEditability, final com.planner5d.library.model.p.b bVar, final boolean z10) {
        this.f255186s = oVar;
        this.F = itemEditability;
        if (itemEditability != null) {
            this.E = itemEditability.getViewOptions();
        }
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.painter.c
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f255164a.z(oVar, bVar, z10, (Subscriber) obj);
            }
        });
    }

    public void S(Item item) {
        if (this.f255186s.w(item)) {
            J();
        }
    }

    com.planner5d.library.widget.editor.editor2d.drawable.d T(Canvas canvas, Matrix matrix, boolean z10) {
        com.planner5d.library.widget.editor.editor2d.drawable.d dVarB;
        float fP = p();
        synchronized (this.f255184q) {
            try {
                com.planner5d.library.widget.editor.editor2d.drawable.d dVar = this.J;
                if (matrix == null) {
                    matrix = this.f255185r;
                }
                dVarB = dVar.b(canvas, M(canvas, matrix), this.E, fP, z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarB;
    }

    public C1727d U(PointF pointF, c cVar) {
        synchronized (this.f255184q) {
            try {
                if (!this.f255174g && x() && this.f255193z == null) {
                    C1727d c1727d = new C1727d(this.f255186s.l(), pointF, cVar);
                    this.f255193z = c1727d;
                    G();
                    return c1727d;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void V(float f10, float f11, float f12) {
        synchronized (this.f255184q) {
            try {
                this.f255179l = false;
                this.f255192y.set(0, 0);
                if (this.f255181n == x.c.Idle) {
                    this.f255181n = x.c.Started;
                    this.D = f10;
                    this.C = f10;
                    this.f255180m.set(f11, f12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        G();
    }

    public void W() {
        Y(true, null);
    }

    public void X(C1727d c1727d) {
        Y(false, c1727d);
    }

    public com.planner5d.library.math.k Z(com.planner5d.library.math.k kVar) {
        synchronized (this.f255189v) {
            try {
                float[] fArr = this.f255190w;
                float f10 = kVar.f180480a;
                float f11 = this.K;
                fArr[0] = f10 * f11;
                fArr[1] = kVar.f180481b * f11;
                this.f255185r.mapPoints(fArr);
                float[] fArr2 = this.f255190w;
                kVar.U(fArr2[0], fArr2[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    public Observable<Void> b0() {
        return com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.editor2d.painter.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f255163a.c0();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public void d0() {
        synchronized (this.f255173f) {
            while (v()) {
                try {
                    try {
                        this.f255173f.wait(2000L);
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void e0(float f10) {
        synchronized (this.f255184q) {
            try {
                this.C *= f10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        G();
    }

    @m1
    public void h(Object obj) {
        synchronized (this.f255173f) {
            try {
                if (this.f255171d == obj) {
                    this.f255171d = null;
                    this.f255169b = false;
                    this.f255168a = false;
                    this.f255173f.notifyAll();
                    this.f255170c = false;
                    this.f255172e = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i() {
        I();
        synchronized (this.f255184q) {
            this.N = (com.planner5d.library.widget.editor.editor2d.drawable.c[][]) Array.newInstance((Class<?>) com.planner5d.library.widget.editor.editor2d.drawable.c.class, 0, 0);
            this.f255191x = true;
        }
        this.f255186s = null;
    }

    public void j() {
        synchronized (this.f255184q) {
            try {
                if (this.f255181n == x.c.Started) {
                    this.f255181n = x.c.Finished;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        G();
    }

    void k() {
        synchronized (this.f255184q) {
            this.f255193z = null;
        }
    }

    @fj.h
    public ItemEditability l() {
        return this.F;
    }

    public Matrix m() {
        Matrix matrix;
        synchronized (this.f255184q) {
            matrix = this.f255185r;
        }
        return matrix;
    }

    public C1727d n() {
        C1727d c1727d;
        synchronized (this.f255184q) {
            c1727d = this.f255193z;
        }
        return c1727d;
    }

    public boolean o() {
        return this.f255179l;
    }

    public float p() {
        float F;
        Matrix matrixM = m();
        synchronized (this.H) {
            matrixM.getValues(this.H);
            this.I[0].set(0.0f, 0.0f);
            this.I[1].set(1.0f, 0.0f);
            F = this.L * this.G.U(A(this.I[0]).x, this.I[0].y).b0(A(this.I[1]).x, this.I[1].y).F();
        }
        return F;
    }

    public void q() {
        this.f255178k.set(true);
        G();
    }

    public boolean r() {
        boolean z10;
        synchronized (this.f255184q) {
            try {
                z10 = this.f255191x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    boolean s() {
        boolean z10;
        synchronized (this.f255184q) {
            z10 = this.f255193z != null;
        }
        return z10;
    }

    public boolean t(C1727d c1727d) {
        boolean z10;
        synchronized (this.f255184q) {
            try {
                z10 = s() && this.f255193z == c1727d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @m1
    public boolean u(Object obj) {
        boolean z10;
        synchronized (this.f255173f) {
            z10 = this.f255171d == obj;
        }
        return z10;
    }

    public boolean w() {
        return this.f255168a;
    }

    public boolean x() {
        boolean z10;
        synchronized (this.f255173f) {
            try {
                z10 = this.f255171d != null && this.f255172e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
