package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.widget.editor.facade.i0;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class x extends Thread {
    static final int X = 225;
    private static final AtomicInteger Y = new AtomicInteger(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f255337w = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f255338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f255339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f255340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f255341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f255342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Point f255343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f255344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f255345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f255346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f255347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f255348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u f255349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i f255350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f255351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final v f255352o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AtomicInteger f255353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f255354t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f255355v;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Bitmap f255356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Canvas f255357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Bitmap f255358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Canvas f255359d;

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            Bitmap bitmap = this.f255356a;
            this.f255356a = this.f255358c;
            this.f255358c = bitmap;
            Canvas canvas = this.f255357b;
            this.f255357b = this.f255359d;
            this.f255359d = canvas;
        }

        private a(Bitmap bitmap, Bitmap bitmap2) throws NullPointerException {
            if (bitmap == null || bitmap2 == null) {
                throw null;
            }
            this.f255356a = bitmap;
            this.f255357b = new Canvas(bitmap);
            this.f255358c = bitmap2;
            this.f255359d = new Canvas(bitmap2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f255360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f255361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f255362c;

        /* JADX INFO: Access modifiers changed from: private */
        public void f(d dVar) {
            this.f255360a = dVar.f255187t;
        }

        private b(a aVar) {
            this.f255360a = false;
            this.f255361b = false;
            this.f255362c = aVar;
        }
    }

    enum c {
        Idle,
        Started,
        Finished
    }

    public x(d dVar, i0 i0Var, int i10, int i11, int i12) {
        super("Painter-" + Y.incrementAndGet() + "-" + i10);
        this.f255339b = new Matrix();
        this.f255340c = new RectF();
        this.f255343f = new Point();
        this.f255344g = new Rect();
        this.f255345h = new Rect();
        this.f255346i = new RectF();
        this.f255347j = false;
        this.f255348k = false;
        u uVar = new u();
        this.f255349l = uVar;
        i iVar = new i();
        this.f255350m = iVar;
        this.f255353s = new AtomicInteger(0);
        this.f255354t = new AtomicBoolean(false);
        this.f255355v = new AtomicBoolean(false);
        this.f255352o = new v(iVar);
        this.f255351n = new j(uVar, i0Var);
        this.f255338a = dVar;
        this.f255341d = i11;
        this.f255342e = i12;
        o();
        dVar.q();
    }

    private Bitmap a() {
        return td.a.f380845a.e(this.f255341d, this.f255342e, Bitmap.Config.ARGB_8888);
    }

    private a b() {
        while (true) {
            try {
                return new a(a(), a());
            } catch (Throwable th2) {
                this.f255338a.D(th2);
                o3.c(250L);
                synchronized (this.f255338a.f255173f) {
                    try {
                        if (this.f255338a.f255170c) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    private void d(Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f255340c);
        c(canvas, false, null, true);
        canvas.restore();
    }

    private void i() {
        synchronized (this.f255338a.f255184q) {
            try {
                Point point = this.f255343f;
                Point point2 = this.f255338a.f255192y;
                point.set(-point2.x, -point2.y);
                this.f255338a.f255192y.set(0, 0);
                this.f255344g.set(this.f255338a.O);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Point point3 = this.f255343f;
        if (point3.x == 0 && point3.y == 0) {
            return;
        }
        this.f255350m.c(point3, this.f255339b, f(), e(), this.f255344g.width(), this.f255344g.height(), this.f255338a);
    }

    private boolean j(b bVar) {
        if (!this.f255351n.a(this.f255338a)) {
            return false;
        }
        if (this.f255351n.f(this.f255338a)) {
            return !bVar.f255361b;
        }
        this.f255351n.b(this.f255338a, bVar.f255362c.f255357b, bVar.f255362c.f255356a);
        return true;
    }

    private boolean k(a aVar) {
        i();
        Canvas canvasLock = this.f255338a.f255182o.lock();
        if (canvasLock != null) {
            this.f255338a.f255178k.set(false);
            c(aVar.f255357b, false, null, false);
            canvasLock.drawBitmap(aVar.f255356a, 0.0f, 0.0f, (Paint) null);
            this.f255347j = true;
            this.f255338a.f255182o.d(canvasLock);
        }
        return true;
    }

    private void l(a aVar) {
        synchronized (this.f255338a.f255184q) {
            try {
                d dVar = this.f255338a;
                Point point = dVar.f255192y;
                if (point.x == 0 && point.y == 0) {
                    if (this.f255348k && !dVar.o()) {
                        this.f255348k = false;
                        this.f255338a.q();
                    }
                    return;
                }
                i();
                Point point2 = this.f255343f;
                int i10 = point2.x;
                if (i10 == 0 && point2.y == 0) {
                    return;
                }
                this.f255348k = true;
                if (this.f255347j) {
                    aVar.f255359d.drawBitmap(aVar.f255356a, i10, point2.y, (Paint) null);
                    int i11 = this.f255343f.x;
                    if (i11 != 0) {
                        RectF rectF = this.f255340c;
                        rectF.top = 0.0f;
                        rectF.bottom = this.f255342e;
                        if (i11 > 0) {
                            rectF.left = 0.0f;
                            rectF.right = i11;
                        } else {
                            int i12 = this.f255341d;
                            rectF.right = i12;
                            rectF.left = i12 + i11;
                        }
                        d(aVar.f255359d);
                    }
                    Point point3 = this.f255343f;
                    if (point3.y != 0) {
                        this.f255340c.left = Math.max(0, point3.x);
                        this.f255340c.right = this.f255341d + Math.min(this.f255343f.x, 0);
                        int i13 = this.f255343f.y;
                        if (i13 > 0) {
                            RectF rectF2 = this.f255340c;
                            rectF2.top = 0.0f;
                            rectF2.bottom = i13;
                        } else {
                            RectF rectF3 = this.f255340c;
                            int i14 = this.f255342e;
                            rectF3.bottom = i14;
                            rectF3.top = i14 + i13;
                        }
                        d(aVar.f255359d);
                    }
                    aVar.b();
                } else {
                    c(aVar.f255357b, false, null, true);
                    this.f255347j = true;
                }
                Canvas canvasLock = this.f255338a.f255182o.lock();
                if (canvasLock != null) {
                    canvasLock.drawBitmap(aVar.f255356a, 0.0f, 0.0f, (Paint) null);
                    this.f255338a.f255182o.d(canvasLock);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m() {
        try {
            Bitmap bitmapA = a();
            c(new Canvas(bitmapA), true, null, false);
            synchronized (this.f255338a.f255184q) {
                try {
                    this.f255338a.f255188u = bitmapA;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void p(String str) {
        throw new RuntimeException(getName() + " is still " + str);
    }

    private void q(b bVar) {
        if (bVar.f255360a) {
            m();
        }
        if (this.f255352o.d(this, bVar.f255362c, this.f255338a, this.f255339b, this.f255341d, this.f255342e)) {
            return;
        }
        bVar.f255361b = this.f255338a.f255178k.get();
        if (j(bVar)) {
            return;
        }
        if (!bVar.f255361b || k(bVar.f255362c)) {
            l(bVar.f255362c);
        }
    }

    void c(Canvas canvas, boolean z10, Matrix matrix, boolean z11) {
        Item item;
        if (canvas == null) {
            return;
        }
        synchronized (this.f255338a.f255184q) {
            try {
                d dVar = this.f255338a;
                Object[][] objArr = dVar.N;
                if (objArr.length == 0) {
                    return;
                }
                if (z10) {
                    LinkedList linkedList = new LinkedList();
                    for (Object[] objArr2 : this.f255338a.N) {
                        Object obj = objArr2[0];
                        if (!(obj instanceof com.planner5d.library.widget.editor.editor2d.drawable.t) || !((com.planner5d.library.widget.editor.editor2d.drawable.t) obj).n()) {
                            if (((Boolean) objArr2[1]).booleanValue()) {
                                linkedList.add(new Object[]{objArr2[0], Boolean.FALSE, objArr2[2]});
                            } else {
                                linkedList.add(objArr2);
                            }
                        }
                    }
                    objArr = (Object[][]) linkedList.toArray(new Object[0][]);
                    item = null;
                } else {
                    item = dVar.M;
                }
                canvas.save();
                com.planner5d.library.widget.editor.editor2d.drawable.d dVarT = this.f255338a.T(canvas, matrix, z11);
                canvas.getClipBounds(this.f255345h);
                this.f255346i.set(this.f255345h);
                for (Object[] objArr3 : objArr) {
                    RectF rectF = (RectF) objArr3[2];
                    if (rectF == null || RectF.intersects(this.f255346i, rectF)) {
                        if (((Boolean) objArr3[1]).booleanValue()) {
                            this.f255349l.c(dVarT, this.f255338a, false);
                        }
                        ((com.planner5d.library.widget.editor.editor2d.drawable.c) objArr3[0]).b(dVarT, ((Boolean) objArr3[1]).booleanValue(), item);
                    }
                }
                this.f255349l.b(dVarT, this.f255338a, false);
                canvas.restore();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int e() {
        return this.f255342e;
    }

    public int f() {
        return this.f255341d;
    }

    void g(a aVar) {
        if (this.f255347j) {
            return;
        }
        c(aVar.f255357b, false, null, false);
        this.f255347j = true;
    }

    public boolean h() {
        return this.f255354t.get();
    }

    public void n() {
        if (!this.f255355v.get()) {
            if (!h()) {
                p("not started");
            }
            p("active");
        }
        if (this.f255338a.u(this)) {
            p("online");
        }
    }

    public void o() {
        synchronized (this.f255338a.f255184q) {
            try {
                this.f255339b.set(this.f255338a.m());
                this.f255350m.b(this.f255339b, this.f255338a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        d dVar;
        int iIncrementAndGet = this.f255353s.incrementAndGet();
        if (iIncrementAndGet != 1) {
            throw new RuntimeException("Too many launch attempts to this painter, attempt #" + iIncrementAndGet);
        }
        this.f255338a.P(this);
        this.f255354t.set(true);
        try {
            b bVar = new b(b());
            synchronized (this.f255338a.f255173f) {
                try {
                    this.f255338a.f255172e = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            loop0: while (true) {
                synchronized (this.f255338a.f255173f) {
                    try {
                        d dVar2 = this.f255338a;
                        dVar2.f255168a = false;
                        dVar2.f255173f.notifyAll();
                        while (true) {
                            dVar = this.f255338a;
                            if (!dVar.f255169b) {
                                if (dVar.f255170c) {
                                    break loop0;
                                } else {
                                    try {
                                        dVar.f255173f.wait();
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            }
                        }
                        dVar.f255169b = false;
                        dVar.f255168a = true;
                        bVar.f(dVar);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                q(bVar);
            }
            synchronized (dVar.f255184q) {
                try {
                    this.f255338a.X(null);
                    try {
                        this.f255351n.f(this.f255338a);
                    } catch (Throwable unused2) {
                    }
                    this.f255338a.k();
                    this.f255338a.f255181n = c.Idle;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            this.f255355v.set(true);
            this.f255338a.h(this);
        } catch (Throwable th5) {
            synchronized (this.f255338a.f255184q) {
                this.f255338a.X(null);
                try {
                    this.f255351n.f(this.f255338a);
                } catch (Throwable unused3) {
                }
                this.f255338a.k();
                this.f255338a.f255181n = c.Idle;
                this.f255355v.set(true);
                this.f255338a.h(this);
                throw th5;
            }
        }
    }
}
