package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.annotation.p0;
import androidx.annotation.x;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.o;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, com.airbnb.lottie.animation.keyframe.a.b, com.airbnb.lottie.model.f {
    private static final int D = 2;
    private static final int E = 16;
    private static final int F = 1;
    private static final int G = 19;

    @p0
    private Paint A;
    float B;

    @p0
    BlurMaskFilter C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f88547a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f88548b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f88549c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f88550d = new com.airbnb.lottie.animation.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f88551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f88552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f88553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f88554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f88555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f88556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f88557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f88558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f88559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f88560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Matrix f88561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final w0 f88562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final e f88563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.h f88564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.d f88565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private b f88566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private b f88567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<b> f88568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, ?>> f88569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final p f88570x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f88571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f88572z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88574b;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.i.a.values().length];
            f88574b = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88574b[com.airbnb.lottie.model.content.i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88574b[com.airbnb.lottie.model.content.i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88574b[com.airbnb.lottie.model.content.i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f88573a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88573a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88573a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88573a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88573a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88573a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88573a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(w0 w0Var, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f88551e = new com.airbnb.lottie.animation.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f88552f = new com.airbnb.lottie.animation.a(1, mode2);
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f88553g = aVar;
        this.f88554h = new com.airbnb.lottie.animation.a(PorterDuff.Mode.CLEAR);
        this.f88555i = new RectF();
        this.f88556j = new RectF();
        this.f88557k = new RectF();
        this.f88558l = new RectF();
        this.f88559m = new RectF();
        this.f88561o = new Matrix();
        this.f88569w = new ArrayList();
        this.f88571y = true;
        this.B = 0.0f;
        this.f88562p = w0Var;
        this.f88563q = eVar;
        this.f88560n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.x().b();
        this.f88570x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(eVar.h());
            this.f88564r = hVar;
            Iterator<com.airbnb.lottie.animation.keyframe.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 : this.f88564r.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        N();
    }

    private void C(RectF rectF, Matrix matrix) {
        this.f88557k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (A()) {
            int size = this.f88564r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.airbnb.lottie.model.content.i iVar = this.f88564r.b().get(i10);
                Path pathH = this.f88564r.a().get(i10).h();
                if (pathH != null) {
                    this.f88547a.set(pathH);
                    this.f88547a.transform(matrix);
                    int i11 = a.f88574b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f88547a.computeBounds(this.f88559m, false);
                    if (i10 == 0) {
                        this.f88557k.set(this.f88559m);
                    } else {
                        RectF rectF2 = this.f88557k;
                        rectF2.set(Math.min(rectF2.left, this.f88559m.left), Math.min(this.f88557k.top, this.f88559m.top), Math.max(this.f88557k.right, this.f88559m.right), Math.max(this.f88557k.bottom, this.f88559m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f88557k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D(RectF rectF, Matrix matrix) {
        if (B() && this.f88563q.i() != e.b.INVERT) {
            this.f88558l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f88566t.a(this.f88558l, matrix, true);
            if (rectF.intersect(this.f88558l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E() {
        this.f88562p.invalidateSelf();
    }

    private void F(float f10) {
        this.f88562p.T().o().e(this.f88563q.j(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(boolean z10) {
        if (z10 != this.f88571y) {
            this.f88571y = z10;
            E();
        }
    }

    private void N() {
        if (this.f88563q.f().isEmpty()) {
            M(true);
            return;
        }
        com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(this.f88563q.f());
        this.f88565s = dVar;
        dVar.m();
        this.f88565s.a(new com.airbnb.lottie.animation.keyframe.a.b() { // from class: com.airbnb.lottie.model.layer.a
            @Override // com.airbnb.lottie.animation.keyframe.a.b
            public final void d() {
                b bVar = this.f88546a;
                bVar.M(bVar.f88565s.q() == 1.0f);
            }
        });
        M(this.f88565s.h().floatValue() == 1.0f);
        i(this.f88565s);
    }

    private void j(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        this.f88547a.set(aVar.h());
        this.f88547a.transform(matrix);
        this.f88550d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f88547a, this.f88550d);
    }

    private void k(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f88555i, this.f88551e);
        this.f88547a.set(aVar.h());
        this.f88547a.transform(matrix);
        this.f88550d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f88547a, this.f88550d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f88555i, this.f88550d);
        canvas.drawRect(this.f88555i, this.f88550d);
        this.f88547a.set(aVar.h());
        this.f88547a.transform(matrix);
        this.f88550d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f88547a, this.f88552f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f88555i, this.f88551e);
        canvas.drawRect(this.f88555i, this.f88550d);
        this.f88552f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f88547a.set(aVar.h());
        this.f88547a.transform(matrix);
        canvas.drawPath(this.f88547a, this.f88552f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f88555i, this.f88552f);
        canvas.drawRect(this.f88555i, this.f88550d);
        this.f88552f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f88547a.set(aVar.h());
        this.f88547a.transform(matrix);
        canvas.drawPath(this.f88547a, this.f88552f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.f.b("Layer#saveLayer");
        com.airbnb.lottie.utils.j.o(canvas, this.f88555i, this.f88551e, 19);
        com.airbnb.lottie.f.c("Layer#saveLayer");
        for (int i10 = 0; i10 < this.f88564r.b().size(); i10++) {
            com.airbnb.lottie.model.content.i iVar = this.f88564r.b().get(i10);
            com.airbnb.lottie.animation.keyframe.a<o, Path> aVar = this.f88564r.a().get(i10);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f88564r.c().get(i10);
            int i11 = a.f88574b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f88550d.setColor(-16777216);
                        this.f88550d.setAlpha(255);
                        canvas.drawRect(this.f88555i, this.f88550d);
                    }
                    if (iVar.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    m(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (q()) {
                this.f88550d.setAlpha(255);
                canvas.drawRect(this.f88555i, this.f88550d);
            }
        }
        com.airbnb.lottie.f.b("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.f.c("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar) {
        this.f88547a.set(aVar.h());
        this.f88547a.transform(matrix);
        canvas.drawPath(this.f88547a, this.f88552f);
    }

    private boolean q() {
        if (this.f88564r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f88564r.b().size(); i10++) {
            if (this.f88564r.b().get(i10).a() != com.airbnb.lottie.model.content.i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f88568v == null) {
            if (this.f88567u == null) {
                this.f88568v = Collections.EMPTY_LIST;
                return;
            }
            this.f88568v = new ArrayList();
            for (b bVar = this.f88567u; bVar != null; bVar = bVar.f88567u) {
                this.f88568v.add(bVar);
            }
        }
    }

    private void s(Canvas canvas) {
        com.airbnb.lottie.f.b("Layer#clearLayer");
        RectF rectF = this.f88555i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f88554h);
        com.airbnb.lottie.f.c("Layer#clearLayer");
    }

    @p0
    static b u(c cVar, e eVar, w0 w0Var, k kVar) {
        switch (a.f88573a[eVar.g().ordinal()]) {
            case 1:
                return new g(w0Var, eVar, cVar, kVar);
            case 2:
                return new c(w0Var, eVar, kVar.p(eVar.n()), kVar);
            case 3:
                return new h(w0Var, eVar);
            case 4:
                return new d(w0Var, eVar);
            case 5:
                return new f(w0Var, eVar);
            case 6:
                return new i(w0Var, eVar);
            default:
                com.airbnb.lottie.utils.d.e("Unknown layer type " + eVar.g());
                return null;
        }
    }

    boolean A() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.f88564r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean B() {
        return this.f88566t != null;
    }

    public void G(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f88569w.remove(aVar);
    }

    void H(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
    }

    void I(@p0 b bVar) {
        this.f88566t = bVar;
    }

    void J(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new com.airbnb.lottie.animation.a();
        }
        this.f88572z = z10;
    }

    void K(@p0 b bVar) {
        this.f88567u = bVar;
    }

    void L(@x(from = 0.0d, to = 1.0d) float f10) {
        com.airbnb.lottie.f.b("BaseLayer#setProgress");
        com.airbnb.lottie.f.b("BaseLayer#setProgress.transform");
        this.f88570x.j(f10);
        com.airbnb.lottie.f.c("BaseLayer#setProgress.transform");
        if (this.f88564r != null) {
            com.airbnb.lottie.f.b("BaseLayer#setProgress.mask");
            for (int i10 = 0; i10 < this.f88564r.a().size(); i10++) {
                this.f88564r.a().get(i10).n(f10);
            }
            com.airbnb.lottie.f.c("BaseLayer#setProgress.mask");
        }
        if (this.f88565s != null) {
            com.airbnb.lottie.f.b("BaseLayer#setProgress.inout");
            this.f88565s.n(f10);
            com.airbnb.lottie.f.c("BaseLayer#setProgress.inout");
        }
        if (this.f88566t != null) {
            com.airbnb.lottie.f.b("BaseLayer#setProgress.matte");
            this.f88566t.L(f10);
            com.airbnb.lottie.f.c("BaseLayer#setProgress.matte");
        }
        com.airbnb.lottie.f.b("BaseLayer#setProgress.animations." + this.f88569w.size());
        for (int i11 = 0; i11 < this.f88569w.size(); i11++) {
            this.f88569w.get(i11).n(f10);
        }
        com.airbnb.lottie.f.c("BaseLayer#setProgress.animations." + this.f88569w.size());
        com.airbnb.lottie.f.c("BaseLayer#setProgress");
    }

    @Override // com.airbnb.lottie.animation.content.e
    @androidx.annotation.i
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f88555i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f88561o.set(matrix);
        if (z10) {
            List<b> list = this.f88568v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f88561o.preConcat(this.f88568v.get(size).f88570x.f());
                }
            } else {
                b bVar = this.f88567u;
                if (bVar != null) {
                    this.f88561o.preConcat(bVar.f88570x.f());
                }
            }
        }
        this.f88561o.preConcat(this.f88570x.f());
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer numH;
        com.airbnb.lottie.f.b(this.f88560n);
        if (!this.f88571y || this.f88563q.y()) {
            com.airbnb.lottie.f.c(this.f88560n);
            return;
        }
        r();
        com.airbnb.lottie.f.b("Layer#parentMatrix");
        this.f88548b.reset();
        this.f88548b.set(matrix);
        for (int size = this.f88568v.size() - 1; size >= 0; size--) {
            this.f88548b.preConcat(this.f88568v.get(size).f88570x.f());
        }
        com.airbnb.lottie.f.c("Layer#parentMatrix");
        com.airbnb.lottie.animation.keyframe.a<?, Integer> aVarH = this.f88570x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((aVarH == null || (numH = aVarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!B() && !A()) {
            this.f88548b.preConcat(this.f88570x.f());
            com.airbnb.lottie.f.b("Layer#drawLayer");
            t(canvas, this.f88548b, iIntValue);
            com.airbnb.lottie.f.c("Layer#drawLayer");
            F(com.airbnb.lottie.f.c(this.f88560n));
            return;
        }
        com.airbnb.lottie.f.b("Layer#computeBounds");
        a(this.f88555i, this.f88548b, false);
        D(this.f88555i, matrix);
        this.f88548b.preConcat(this.f88570x.f());
        C(this.f88555i, this.f88548b);
        this.f88556j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f88549c);
        if (!this.f88549c.isIdentity()) {
            Matrix matrix2 = this.f88549c;
            matrix2.invert(matrix2);
            this.f88549c.mapRect(this.f88556j);
        }
        if (!this.f88555i.intersect(this.f88556j)) {
            this.f88555i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.airbnb.lottie.f.c("Layer#computeBounds");
        if (this.f88555i.width() >= 1.0f && this.f88555i.height() >= 1.0f) {
            com.airbnb.lottie.f.b("Layer#saveLayer");
            this.f88550d.setAlpha(255);
            com.airbnb.lottie.utils.j.n(canvas, this.f88555i, this.f88550d);
            com.airbnb.lottie.f.c("Layer#saveLayer");
            s(canvas);
            com.airbnb.lottie.f.b("Layer#drawLayer");
            t(canvas, this.f88548b, iIntValue);
            com.airbnb.lottie.f.c("Layer#drawLayer");
            if (A()) {
                o(canvas, this.f88548b);
            }
            if (B()) {
                com.airbnb.lottie.f.b("Layer#drawMatte");
                com.airbnb.lottie.f.b("Layer#saveLayer");
                com.airbnb.lottie.utils.j.o(canvas, this.f88555i, this.f88553g, 19);
                com.airbnb.lottie.f.c("Layer#saveLayer");
                s(canvas);
                this.f88566t.c(canvas, matrix, iIntValue);
                com.airbnb.lottie.f.b("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.f.c("Layer#restoreLayer");
                com.airbnb.lottie.f.c("Layer#drawMatte");
            }
            com.airbnb.lottie.f.b("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.f.c("Layer#restoreLayer");
        }
        if (this.f88572z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f88555i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f88555i, this.A);
        }
        F(com.airbnb.lottie.f.c(this.f88560n));
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        E();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    @Override // com.airbnb.lottie.model.f
    @androidx.annotation.i
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        this.f88570x.c(t10, jVar);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88563q.j();
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        b bVar = this.f88566t;
        if (bVar != null) {
            com.airbnb.lottie.model.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f88566t.getName(), i10)) {
                list.add(eVarA.j(this.f88566t));
            }
            if (eVar.i(getName(), i10)) {
                this.f88566t.H(eVar, eVar.e(this.f88566t.getName(), i10) + i10, list, eVarA);
            }
        }
        if (eVar.h(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.j(this));
                }
            }
            if (eVar.i(getName(), i10)) {
                H(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    public void i(@p0 com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f88569w.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i10);

    public com.airbnb.lottie.model.content.h v() {
        return this.f88563q.a();
    }

    @p0
    public com.airbnb.lottie.model.content.a w() {
        return this.f88563q.b();
    }

    public BlurMaskFilter x(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }

    @p0
    public com.airbnb.lottie.parser.j y() {
        return this.f88563q.d();
    }

    e z() {
        return this.f88563q;
    }
}
