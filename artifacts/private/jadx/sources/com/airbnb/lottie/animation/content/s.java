package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import androidx.annotation.p0;
import com.airbnb.lottie.b1;
import com.airbnb.lottie.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s implements n, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f88062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f88064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.m f88065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private List<t> f88066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f88067g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f88061a = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f88068h = new b();

    public s(w0 w0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.r rVar) {
        this.f88062b = rVar.b();
        this.f88063c = rVar.d();
        this.f88064d = w0Var;
        com.airbnb.lottie.animation.keyframe.m mVarA = rVar.c().a();
        this.f88065e = mVarA;
        bVar.i(mVarA);
        mVarA.a(this);
    }

    private void b() {
        this.f88067g = false;
        this.f88064d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path S() {
        if (this.f88067g && !this.f88065e.k()) {
            return this.f88061a;
        }
        this.f88061a.reset();
        if (this.f88063c) {
            this.f88067g = true;
            return this.f88061a;
        }
        Path pathH = this.f88065e.h();
        if (pathH == null) {
            return this.f88061a;
        }
        this.f88061a.set(pathH);
        this.f88061a.setFillType(Path.FillType.EVEN_ODD);
        this.f88068h.b(this.f88061a);
        this.f88067g = true;
        return this.f88061a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == com.airbnb.lottie.model.content.t.a.SIMULTANEOUSLY) {
                    this.f88068h.a(vVar);
                    vVar.b(this);
                } else if (!(cVar instanceof t)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((t) cVar);
                }
            } else if (!(cVar instanceof t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((t) cVar);
            }
        }
        this.f88065e.r(arrayList);
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void g(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        if (t10 == b1.P) {
            this.f88065e.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88062b;
    }

    @Override // com.airbnb.lottie.model.f
    public void h(com.airbnb.lottie.model.e eVar, int i10, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i10, list, eVar2, this);
    }
}
