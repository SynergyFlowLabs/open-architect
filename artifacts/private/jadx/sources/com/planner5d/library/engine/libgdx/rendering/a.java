package com.planner5d.library.engine.libgdx.rendering;

import ac.l;
import ac.m;
import ac.n;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.badlogic.gdx.graphics.g3d.i;
import com.planner5d.library.engine.g;
import com.planner5d.library.engine.util.math.h;
import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a implements m<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.planner5d.library.math.m[] f160789a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f160790b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f160791c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f160792d = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.m f160793e = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k[] f160794f = {new k(), new k(), new k(), new k(), new k(), new k()};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ac.d<i>[] f160795g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<ac.k> f160796h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<l> f160797i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f160798j = new PointF(2.0f, 12.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f160799k = null;

    private h b(g gVar) {
        Float fValueOf;
        float f10 = gVar.getPosition().f180482a;
        float f11 = gVar.getPosition().f180483b;
        float f12 = gVar.getPosition().f180484c;
        float f13 = this.f160793e.A0(gVar.getPosition()).R(gVar.Q1()).f180482a;
        com.planner5d.library.math.m mVar = this.f160793e;
        float fB = com.planner5d.library.engine.util.math.d.b(f10, f11, f12, f13, mVar.f180483b, mVar.f180484c, gc.d.f275441h, mVar);
        this.f160791c.U(gVar.Q1().f180482a, gVar.Q1().f180484c).M();
        if (fB > 0.0f) {
            k kVar = this.f160790b;
            com.planner5d.library.math.m mVar2 = this.f160793e;
            float fL = kVar.U(mVar2.f180482a, mVar2.f180484c).l(gVar.getPosition().f180482a, gVar.getPosition().f180484c);
            PointF pointF = this.f160798j;
            float f14 = pointF.y;
            if (fL > f14) {
                fValueOf = Float.valueOf(f14);
            } else {
                float f15 = pointF.x;
                if (fL < f15) {
                    fValueOf = Float.valueOf(f15);
                } else {
                    this.f160792d.V(this.f160790b);
                    fValueOf = null;
                }
            }
        } else {
            fValueOf = Float.valueOf(this.f160798j.y);
        }
        if (fValueOf != null) {
            this.f160792d.V(this.f160791c).R(fValueOf.floatValue()).a(gVar.getPosition().f180482a, gVar.getPosition().f180484c);
        }
        float f16 = gVar.getPosition().f180482a;
        float f17 = gVar.getPosition().f180484c;
        float f18 = this.f160790b.V(this.f160791c.R(6.0f)).N(90.0f).b(this.f160792d).f180480a;
        k kVar2 = this.f160790b;
        int i10 = (4 ^ 1) >> 3;
        return new h(new float[]{f16, f17, f18, kVar2.f180481b, kVar2.V(this.f160791c).N(-90.0f).b(this.f160792d).f180480a, this.f160790b.f180481b});
    }

    private boolean c(g gVar) {
        com.planner5d.library.math.m[] mVarArr = this.f160789a;
        if (mVarArr == null) {
            this.f160789a = new com.planner5d.library.math.m[]{new com.planner5d.library.math.m(gVar.getPosition()), new com.planner5d.library.math.m(gVar.Q1())};
            return true;
        }
        if (mVarArr[0].equals(gVar.getPosition()) && this.f160789a[1].equals(gVar.Q1())) {
            return false;
        }
        this.f160789a[0].A0(gVar.getPosition());
        this.f160789a[1].A0(gVar.Q1());
        return true;
    }

    private boolean d(g gVar, ac.k kVar) {
        this.f160794f[0].V(kVar.e()[0]);
        this.f160794f[2].V(kVar.e()[1]);
        this.f160794f[4].V(kVar.e()[2]);
        int i10 = 0;
        while (true) {
            k[] kVarArr = this.f160794f;
            if (i10 >= kVarArr.length) {
                break;
            }
            kVarArr[i10 + 1].V(kVarArr[i10]).b(this.f160791c.V(this.f160794f[i10]).b0(gVar.getPosition().f180482a, gVar.getPosition().f180484c).M().R(9000.0f));
            i10 += 2;
        }
        Object objD = kVar.d();
        for (ac.k kVar2 : this.f160796h) {
            if (kVar2 != kVar && objD == kVar2.d()) {
                k[] kVarArrA = kVar2.a();
                int i11 = 0;
                while (true) {
                    k[] kVarArr2 = this.f160794f;
                    if (i11 >= kVarArr2.length) {
                        break;
                    }
                    if (com.planner5d.library.math.b.f180462a.g(kVarArr2[i11], kVarArr2[i11 + 1], kVarArrA[0], kVarArrA[1], null)) {
                        return false;
                    }
                    i11 += 2;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    @Override // ac.m
    public void a(@p0 n nVar, @NonNull g gVar, @NonNull ac.c<i> cVar) {
        ac.c<i> cVar2;
        Iterator<l> it;
        h hVarB;
        boolean z10 = nVar != null && (nVar.e() || nVar.d());
        if (this.f160795g == cVar.a()) {
            cVar2 = cVar;
            Boolean bool = this.f160799k;
            if (bool == null || bool.booleanValue() != z10 || c(gVar)) {
            }
            if (this.f160797i.isEmpty()) {
            }
            it = this.f160797i.iterator();
            while (it.hasNext()) {
                if (!it.next().a()) {
                    it.remove();
                }
            }
            cVar2.g();
        }
        this.f160795g = cVar.a();
        this.f160797i.clear();
        this.f160796h.clear();
        if (this.f160795g == null) {
            this.f160799k = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ac.d<i> dVar : cVar.a()) {
            if (dVar.w0() && !dVar.A0() && !arrayList.contains(dVar.getItem())) {
                arrayList.add(dVar.getItem());
            }
        }
        for (Object obj : arrayList) {
            arrayList2.clear();
            for (ac.d<i> dVar2 : cVar.d()) {
                if (dVar2.getItem() == obj) {
                    arrayList2.add(dVar2);
                }
            }
            for (ac.d<i>[] dVarArr : cVar.f()) {
                for (ac.d<i> dVar3 : dVarArr) {
                    if (dVar3.getItem() == obj) {
                        arrayList2.add(dVar3);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                this.f160796h.add(cVar.c(arrayList2));
            }
        }
        cVar2 = cVar;
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f160799k = boolValueOf;
        h hVarB2 = boolValueOf.booleanValue() ? b(gVar) : null;
        this.f160797i.clear();
        for (ac.k kVar : this.f160796h) {
            this.f160797i.add(kVar.c((hVarB2 == null || (hVarB = kVar.b()) == null || !com.planner5d.library.engine.util.math.d.i(hVarB2, hVarB) || d(gVar, kVar)) ? false : true));
        }
        cVar2.g();
        if (this.f160797i.isEmpty()) {
            it = this.f160797i.iterator();
            while (it.hasNext()) {
                if (!it.next().a()) {
                    it.remove();
                }
            }
            cVar2.g();
        }
    }
}
