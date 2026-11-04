package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import com.planner5d.library.math.m;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.widget.editor.editor3d.scene3d.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
class i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f255521u = 40.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f255522v = 39.99f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f255523a = {new m(), new m()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.math.k[] f255524b = {new com.planner5d.library.math.k(), new com.planner5d.library.math.k()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f255525c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.k f255526d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f255527e = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f255528f = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.k f255529g = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.math.k f255530h = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.math.k f255531i = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.planner5d.library.math.k f255532j = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.planner5d.library.math.k f255533k = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.planner5d.library.math.k f255534l = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ItemLayout f255535m = new ItemLayout();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.planner5d.library.math.k f255536n = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f255537o = new m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.planner5d.library.math.k f255538p = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.planner5d.library.math.k f255539q = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.planner5d.library.math.k f255540r = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set<l.a> f255541s = new HashSet(3);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set<String> f255542t = new HashSet();

    i() {
    }

    private Float a(com.planner5d.library.math.k[] kVarArr, com.planner5d.library.math.k kVar) {
        float f10 = com.planner5d.library.math.c.f180466e.f(this.f255539q.V(kVar).c0(kVarArr[0]), this.f255540r.V(kVarArr[1]).c0(kVarArr[0]));
        if (f10 < 0.0f || f10 > this.f255540r.F()) {
            return null;
        }
        return Float.valueOf(c(kVarArr, kVar, this.f255539q).m(kVar));
    }

    private com.planner5d.library.math.k[] b(ItemDoor itemDoor, com.planner5d.library.math.k[] kVarArr) {
        this.f255536n.U(0.5f, 0.0f).R(itemDoor.getSize(this.f255537o).f180482a).N(itemDoor.getLayout(this.f255535m).getRotationY() + 90.0f);
        int i10 = 3 | 0;
        kVarArr[1].V(this.f255535m.getPosition(kVarArr[0]));
        kVarArr[0].c0(this.f255536n);
        kVarArr[1].b(this.f255536n);
        return kVarArr;
    }

    private com.planner5d.library.math.k c(com.planner5d.library.math.k[] kVarArr, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return com.planner5d.library.math.b.f180462a.j(kVarArr[0], kVarArr[1], kVar, kVar2);
    }

    private com.planner5d.library.math.k[] d(ItemWall itemWall, com.planner5d.library.math.k[] kVarArr) {
        itemWall.getPoint(kVarArr[0], true, true);
        itemWall.getPoint(kVarArr[1], true, false);
        return kVarArr;
    }

    private boolean e(l.a[] aVarArr, m mVar) {
        l.a aVar;
        l.a next;
        this.f255538p.U(mVar.f180482a, mVar.f180484c);
        l.a aVar2 = null;
        Float f10 = null;
        for (l.a aVar3 : aVarArr) {
            Item item = aVar3.f255865a;
            if ((item instanceof ItemDoor) && !((ItemDoor) item).getClosed()) {
                String attachedTo = ((ItemDoor) aVar3.f255865a).getAttachedTo();
                this.f255541s.clear();
                this.f255542t.clear();
                this.f255542t.addAll(((ItemDoor) aVar3.f255865a).getIntersectedWalls());
                if (this.f255542t.isEmpty()) {
                    aVar = null;
                } else {
                    aVar = null;
                    for (l.a aVar4 : aVarArr) {
                        Item item2 = aVar4.f255865a;
                        if ((item2 instanceof ItemWall) && !((ItemWall) item2).hidden && this.f255542t.contains(item2.getUid())) {
                            if (attachedTo != null && attachedTo.endsWith(aVar4.f255865a.getUid())) {
                                aVar = aVar4;
                            }
                            this.f255541s.add(aVar4);
                            if (this.f255542t.size() == this.f255541s.size()) {
                                break;
                            }
                        }
                    }
                }
                if (this.f255541s.isEmpty()) {
                    next = null;
                    break;
                }
                Iterator<l.a> it = this.f255541s.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.b(mVar));
                if (next != null || aVar == null) {
                    aVar = next;
                }
                Float fA = a(b((ItemDoor) aVar3.f255865a, this.f255524b), this.f255538p);
                if (fA != null) {
                    if (aVar != null) {
                        fA = Float.valueOf(fA.floatValue() - aVar.a(mVar));
                    }
                    if (f10 == null || fA.floatValue() < f10.floatValue()) {
                        f10 = fA;
                        aVar2 = aVar3;
                    }
                }
            }
        }
        return aVar2 != null && f10.floatValue() < f255521u;
    }

    private com.planner5d.library.math.k g(com.planner5d.library.math.k[] kVarArr, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, float f10) {
        int i10 = 1;
        this.f255533k.V(kVarArr[1]).c0(kVarArr[0]).M();
        float F = kVar.F();
        c(kVarArr, kVar3, this.f255532j);
        if (!this.f255532j.equals(kVarArr[0]) && !this.f255532j.equals(kVarArr[1])) {
            boolean z10 = kVar.k(this.f255533k) >= 0.0f;
            return kVar3.b(this.f255533k.R((z10 ? 1 : -1) * Math.min(this.f255531i.V(z10 ? kVarArr[1] : kVarArr[0]).c0(this.f255532j).F(), F)));
        }
        float f11 = kVar.f(this.f255531i.V(this.f255532j).c0(kVar2));
        com.planner5d.library.math.k kVarM = this.f255531i.V(kVar3).c0(this.f255532j).M();
        float f12 = f10 + f255521u;
        com.planner5d.library.math.k kVarR = kVarM.R(f12);
        if (f11 <= 0.0f) {
            i10 = -1;
        }
        return kVar3.V(kVarR.P(i10 * (F / f12)).b(this.f255532j));
    }

    private m h(l.a[] aVarArr, m mVar, m mVar2) {
        if (aVarArr != null && aVarArr.length != 0) {
            this.f255529g.U(this.f255525c.A0(mVar2).H0(mVar).f180482a, this.f255525c.f180484c);
            if (e(aVarArr, mVar2)) {
                return null;
            }
            return i(aVarArr, mVar, mVar2);
        }
        return null;
    }

    private m i(l.a[] aVarArr, m mVar, m mVar2) {
        this.f255526d.U(mVar.f180482a, mVar.f180484c);
        this.f255528f.U(mVar2.f180482a, mVar2.f180484c);
        l.a aVar = null;
        Float fValueOf = null;
        for (l.a aVar2 : aVarArr) {
            Item item = aVar2.f255865a;
            if (item instanceof ItemWall) {
                float fM = c(d((ItemWall) item, this.f255524b), this.f255528f, this.f255530h).m(this.f255528f) - aVar2.a(mVar);
                if (fValueOf == null || fM < fValueOf.floatValue()) {
                    fValueOf = Float.valueOf(fM);
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            c(d((ItemWall) aVar.f255865a, this.f255524b), this.f255528f, this.f255530h);
            float fA = aVar.a(mVar);
            if (this.f255530h.m(this.f255528f) - fA < f255521u) {
                j(this.f255524b, this.f255526d, this.f255527e, fA);
                g(this.f255524b, this.f255529g, this.f255526d, this.f255527e, fA);
                for (l.a aVar3 : aVarArr) {
                    if (aVar3 != aVar) {
                        Item item2 = aVar3.f255865a;
                        if ((item2 instanceof ItemWall) && c(d((ItemWall) item2, this.f255524b), this.f255527e, this.f255530h).m(this.f255527e) < f255522v) {
                            this.f255527e.V(this.f255526d);
                            break;
                        }
                    }
                }
                m mVar3 = this.f255525c;
                com.planner5d.library.math.k kVar = this.f255527e;
                return mVar3.y0(kVar.f180480a, mVar.f180483b, kVar.f180481b);
            }
        }
        return null;
    }

    private com.planner5d.library.math.k j(com.planner5d.library.math.k[] kVarArr, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, float f10) {
        c(kVarArr, kVar, this.f255534l);
        return kVar2.V(kVar).c0(this.f255534l).M().R(f10 + f255521u).b(this.f255534l);
    }

    void f(j jVar, l.a[] aVarArr, boolean z10, double d10, double d11) {
        jVar.h(this.f255523a[0]);
        if (z10) {
            jVar.r(d10, d11);
        } else {
            jVar.o(d10, d11);
        }
        m[] mVarArr = this.f255523a;
        m mVarH = h(aVarArr, mVarArr[0], jVar.h(mVarArr[1]));
        if (mVarH != null) {
            jVar.B(mVarH);
        }
    }
}
