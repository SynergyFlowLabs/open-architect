package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.collection.b1;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.k;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> H;
    private final List<b> I;
    private final RectF J;
    private final RectF K;
    private final Paint L;

    @p0
    private Boolean M;

    @p0
    private Boolean N;
    private float O;
    private boolean P;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88575a;

        static {
            int[] iArr = new int[e.b.values().length];
            f88575a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88575a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(w0 w0Var, e eVar, List<e> list, k kVar) {
        int i10;
        b bVar;
        super(w0Var, eVar);
        this.I = new ArrayList();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new Paint();
        this.P = true;
        com.airbnb.lottie.model.animatable.b bVarV = eVar.v();
        if (bVarV != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarA = bVarV.a();
            this.H = aVarA;
            i(aVarA);
            this.H.a(this);
        } else {
            this.H = null;
        }
        b1 b1Var = new b1(kVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b bVarU = b.u(this, eVar2, w0Var, kVar);
            if (bVarU != null) {
                b1Var.n(bVarU.z().e(), bVarU);
                if (bVar2 != null) {
                    bVar2.I(bVarU);
                    bVar2 = null;
                } else {
                    this.I.add(0, bVarU);
                    int i11 = a.f88575a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = bVarU;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < b1Var.size(); i10++) {
            b bVar3 = (b) b1Var.g(b1Var.l(i10));
            if (bVar3 != null && (bVar = (b) b1Var.g(bVar3.z().k())) != null) {
                bVar3.K(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        for (int i11 = 0; i11 < this.I.size(); i11++) {
            this.I.get(i11).h(eVar, i10, list, eVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void J(boolean z10) {
        super.J(z10);
        Iterator<b> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().J(z10);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void L(@x(from = 0.0d, to = 1.0d) float f10) {
        com.airbnb.lottie.f.b("CompositionLayer#setProgress");
        this.O = f10;
        super.L(f10);
        if (this.H != null) {
            f10 = ((this.H.h().floatValue() * this.f88563q.c().i()) - this.f88563q.c().r()) / (this.f88562p.T().e() + 0.01f);
        }
        if (this.H == null) {
            f10 -= this.f88563q.s();
        }
        if (this.f88563q.w() != 0.0f && !"__container".equals(this.f88563q.j())) {
            f10 /= this.f88563q.w();
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).L(f10);
        }
        com.airbnb.lottie.f.c("CompositionLayer#setProgress");
    }

    public float O() {
        return this.O;
    }

    public boolean P() {
        if (this.N == null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                b bVar = this.I.get(size);
                if (bVar instanceof g) {
                    if (bVar.A()) {
                        this.N = Boolean.TRUE;
                        return true;
                    }
                } else if ((bVar instanceof c) && ((c) bVar).P()) {
                    this.N = Boolean.TRUE;
                    return true;
                }
            }
            this.N = Boolean.FALSE;
        }
        return this.N.booleanValue();
    }

    public boolean Q() {
        if (this.M == null) {
            if (B()) {
                this.M = Boolean.TRUE;
                return true;
            }
            for (int size = this.I.size() - 1; size >= 0; size--) {
                if (this.I.get(size).B()) {
                    this.M = Boolean.TRUE;
                    return true;
                }
            }
            this.M = Boolean.FALSE;
        }
        return this.M.booleanValue();
    }

    public void R(boolean z10) {
        this.P = z10;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.J.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.I.get(size).a(this.J, this.f88561o, true);
            rectF.union(this.J);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.g(t10, jVar);
        if (t10 == com.airbnb.lottie.b1.E) {
            if (jVar == null) {
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.H;
                if (aVar != null) {
                    aVar.o(null);
                }
            } else {
                q qVar = new q(jVar);
                this.H = qVar;
                qVar.a(this);
                i(this.H);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        com.airbnb.lottie.f.b("CompositionLayer#draw");
        this.K.set(0.0f, 0.0f, this.f88563q.m(), this.f88563q.l());
        matrix.mapRect(this.K);
        boolean z10 = this.f88562p.s0() && this.I.size() > 1 && i10 != 255;
        if (z10) {
            this.L.setAlpha(i10);
            com.airbnb.lottie.utils.j.n(canvas, this.K, this.L);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            if (((this.P || !"__container".equals(this.f88563q.j())) && !this.K.isEmpty()) ? canvas.clipRect(this.K) : true) {
                this.I.get(size).c(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.airbnb.lottie.f.c("CompositionLayer#draw");
    }
}
