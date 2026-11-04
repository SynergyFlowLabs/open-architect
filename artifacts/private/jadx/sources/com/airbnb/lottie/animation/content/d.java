package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e, n, com.airbnb.lottie.animation.keyframe.a.b, com.airbnb.lottie.model.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f87943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f87944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f87945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Path f87946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f87947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f87948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c> f87950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w0 f87951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private List<n> f87952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.p f87953k;

    public d(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.q qVar, com.airbnb.lottie.k kVar) {
        this(w0Var, bVar, qVar.c(), qVar.d(), b(w0Var, kVar, bVar, qVar.b()), i(qVar.b()));
    }

    private static List<c> b(w0 w0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar, List<com.airbnb.lottie.model.content.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = list.get(i10).a(w0Var, kVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    @p0
    static com.airbnb.lottie.model.animatable.l i(List<com.airbnb.lottie.model.content.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.airbnb.lottie.model.content.c cVar = list.get(i10);
            if (cVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) cVar;
            }
        }
        return null;
    }

    private boolean m() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f87950h.size(); i11++) {
            if (this.f87950h.get(i11) instanceof e) {
                i10++;
                int i12 = 1 << 2;
                if (i10 >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path S() {
        this.f87945c.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f87953k;
        if (pVar != null) {
            this.f87945c.set(pVar.f());
        }
        this.f87946d.reset();
        if (this.f87949g) {
            return this.f87946d;
        }
        for (int size = this.f87950h.size() - 1; size >= 0; size--) {
            c cVar = this.f87950h.get(size);
            if (cVar instanceof n) {
                this.f87946d.addPath(((n) cVar).S(), this.f87945c);
            }
        }
        return this.f87946d;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f87945c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f87953k;
        if (pVar != null) {
            this.f87945c.preConcat(pVar.f());
        }
        this.f87947e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f87950h.size() - 1; size >= 0; size--) {
            c cVar = this.f87950h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(this.f87947e, this.f87945c, z10);
                rectF.union(this.f87947e);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f87949g) {
            return;
        }
        this.f87945c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f87953k;
        if (pVar != null) {
            this.f87945c.preConcat(pVar.f());
            i10 = (int) (((((this.f87953k.h() == null ? 100 : this.f87953k.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f87951i.s0() && m() && i10 != 255;
        if (z10) {
            this.f87944b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.f87944b, this.f87945c, true);
            this.f87943a.setAlpha(i10);
            com.airbnb.lottie.utils.j.n(canvas, this.f87944b, this.f87943a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f87950h.size() - 1; size >= 0; size--) {
            c cVar = this.f87950h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(canvas, this.f87945c, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f87951i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f87950h.size());
        arrayList.addAll(list);
        int size = this.f87950h.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            c cVar = this.f87950h.get(size);
            cVar.e(arrayList, this.f87950h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f87953k;
        if (pVar != null) {
            pVar.c(t10, jVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f87948f;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        if (eVar.h(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.j(this));
                }
            }
            if (eVar.i(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f87950h.size(); i11++) {
                    c cVar = this.f87950h.get(i11);
                    if (cVar instanceof com.airbnb.lottie.model.f) {
                        ((com.airbnb.lottie.model.f) cVar).h(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    public List<c> j() {
        return this.f87950h;
    }

    List<n> k() {
        if (this.f87952j == null) {
            this.f87952j = new ArrayList();
            for (int i10 = 0; i10 < this.f87950h.size(); i10++) {
                c cVar = this.f87950h.get(i10);
                if (cVar instanceof n) {
                    this.f87952j.add((n) cVar);
                }
            }
        }
        return this.f87952j;
    }

    Matrix l() {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f87953k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f87945c.reset();
        return this.f87945c;
    }

    d(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, String str, boolean z10, List<c> list, @p0 com.airbnb.lottie.model.animatable.l lVar) {
        this.f87943a = new com.airbnb.lottie.animation.a();
        this.f87944b = new RectF();
        this.f87945c = new Matrix();
        this.f87946d = new Path();
        this.f87947e = new RectF();
        this.f87948f = str;
        this.f87951i = w0Var;
        this.f87949g = z10;
        this.f87950h = list;
        if (lVar != null) {
            com.airbnb.lottie.animation.keyframe.p pVarB = lVar.b();
            this.f87953k = pVarB;
            pVarB.a(bVar);
            this.f87953k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((j) arrayList.get(size2)).b(list.listIterator(list.size()));
            }
        }
    }
}
