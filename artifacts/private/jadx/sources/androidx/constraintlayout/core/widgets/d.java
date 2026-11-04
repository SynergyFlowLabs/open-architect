package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f44655j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44656k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f44660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f44661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f44662f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    androidx.constraintlayout.core.i f44665i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<d> f44657a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44663g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f44664h = Integer.MIN_VALUE;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f44660d = eVar;
        this.f44661e = aVar;
    }

    private boolean s(e eVar, HashSet<e> hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == i()) {
            return true;
        }
        ArrayList<d> arrayListS = eVar.s();
        int size = arrayListS.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = arrayListS.get(i10);
            if (dVar.u(this) && dVar.p() && s(dVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public void A(int i10) {
        this.f44658b = i10;
        this.f44659c = true;
    }

    public void B(int i10) {
        if (p()) {
            this.f44664h = i10;
        }
    }

    public void C(int i10) {
        if (p()) {
            this.f44663g = i10;
        }
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            x();
            return true;
        }
        if (!z10 && !v(dVar)) {
            return false;
        }
        this.f44662f = dVar;
        if (dVar.f44657a == null) {
            dVar.f44657a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f44662f.f44657a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f44663g = i10;
        this.f44664h = i11;
        return true;
    }

    public void c(d dVar, HashMap<e, e> map) {
        HashSet<d> hashSet;
        d dVar2 = this.f44662f;
        if (dVar2 != null && (hashSet = dVar2.f44657a) != null) {
            hashSet.remove(this);
        }
        d dVar3 = dVar.f44662f;
        if (dVar3 != null) {
            this.f44662f = map.get(dVar.f44662f.f44660d).r(dVar3.l());
        } else {
            this.f44662f = null;
        }
        d dVar4 = this.f44662f;
        if (dVar4 != null) {
            if (dVar4.f44657a == null) {
                dVar4.f44657a = new HashSet<>();
            }
            this.f44662f.f44657a.add(this);
        }
        this.f44663g = dVar.f44663g;
        this.f44664h = dVar.f44664h;
    }

    public void d(int i10, ArrayList<androidx.constraintlayout.core.widgets.analyzer.o> arrayList, androidx.constraintlayout.core.widgets.analyzer.o oVar) {
        HashSet<d> hashSet = this.f44657a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.i.a(it.next().f44660d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> e() {
        return this.f44657a;
    }

    public int f() {
        if (this.f44659c) {
            return this.f44658b;
        }
        return 0;
    }

    public int g() {
        d dVar;
        if (this.f44660d.l0() == 8) {
            return 0;
        }
        return (this.f44664h == Integer.MIN_VALUE || (dVar = this.f44662f) == null || dVar.f44660d.l0() != 8) ? this.f44663g : this.f44664h;
    }

    public final d h() {
        switch (this.f44661e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f44660d.S;
            case TOP:
                return this.f44660d.T;
            case RIGHT:
                return this.f44660d.Q;
            case BOTTOM:
                return this.f44660d.R;
            default:
                throw new AssertionError(this.f44661e.name());
        }
    }

    public e i() {
        return this.f44660d;
    }

    public androidx.constraintlayout.core.i j() {
        return this.f44665i;
    }

    public d k() {
        return this.f44662f;
    }

    public a l() {
        return this.f44661e;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f44657a;
        int i10 = 0 << 0;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<d> hashSet = this.f44657a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f44659c;
    }

    public boolean p() {
        return this.f44662f != null;
    }

    public boolean q(e eVar) {
        if (s(eVar, new HashSet<>())) {
            return false;
        }
        e eVarU = i().U();
        return eVarU == eVar || eVar.U() == eVarU;
    }

    public boolean r(e eVar, d dVar) {
        return q(eVar);
    }

    public boolean t() {
        switch (this.f44661e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case TOP:
            case RIGHT:
            case BOTTOM:
                return true;
            default:
                throw new AssertionError(this.f44661e.name());
        }
    }

    public String toString() {
        return this.f44660d.y() + ":" + this.f44661e.toString();
    }

    public boolean u(d dVar) {
        a aVarL = dVar.l();
        a aVar = this.f44661e;
        if (aVarL == aVar) {
            return true;
        }
        switch (aVar) {
            case NONE:
                return false;
            case LEFT:
            case RIGHT:
            case CENTER_X:
                return aVarL == a.LEFT || aVarL == a.RIGHT || aVarL == a.CENTER_X;
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                if (aVarL != a.TOP && aVarL != a.BOTTOM && aVarL != a.CENTER_Y && aVarL != a.BASELINE) {
                    return false;
                }
                return true;
            case CENTER:
                return aVarL != a.BASELINE;
            default:
                throw new AssertionError(this.f44661e.name());
        }
    }

    public boolean v(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarL = dVar.l();
        a aVar = this.f44661e;
        if (aVarL == aVar) {
            return aVar != a.BASELINE || (dVar.i().q0() && i().q0());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarL == a.LEFT || aVarL == a.RIGHT;
                if (dVar.i() instanceof h) {
                    return z10 || aVarL == a.CENTER_X;
                }
                return z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarL == a.TOP || aVarL == a.BOTTOM;
                if (dVar.i() instanceof h) {
                    return z11 || aVarL == a.CENTER_Y;
                }
                return z11;
            case BASELINE:
                return (aVarL == a.LEFT || aVarL == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarL == a.BASELINE || aVarL == a.CENTER_X || aVarL == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f44661e.name());
        }
    }

    public boolean w() {
        switch (this.f44661e) {
            case NONE:
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                return true;
            case LEFT:
            case RIGHT:
            case CENTER:
            case CENTER_X:
                return false;
            default:
                throw new AssertionError(this.f44661e.name());
        }
    }

    public void x() {
        HashSet<d> hashSet;
        d dVar = this.f44662f;
        if (dVar != null && (hashSet = dVar.f44657a) != null) {
            hashSet.remove(this);
            if (this.f44662f.f44657a.size() == 0) {
                this.f44662f.f44657a = null;
            }
        }
        this.f44657a = null;
        this.f44662f = null;
        this.f44663g = 0;
        this.f44664h = Integer.MIN_VALUE;
        this.f44659c = false;
        this.f44658b = 0;
    }

    public void y() {
        this.f44659c = false;
        this.f44658b = 0;
    }

    public void z(androidx.constraintlayout.core.c cVar) {
        androidx.constraintlayout.core.i iVar = this.f44665i;
        if (iVar == null) {
            this.f44665i = new androidx.constraintlayout.core.i(androidx.constraintlayout.core.i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.r();
        }
    }
}
