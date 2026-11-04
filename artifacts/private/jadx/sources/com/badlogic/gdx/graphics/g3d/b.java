package com.badlogic.gdx.graphics.g3d;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Iterable<a>, Comparator<a>, Comparable<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f94370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.badlogic.gdx.utils.b<a> f94371b = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f94372c = true;

    private final void U1(long j10) {
        this.f94370a = (~j10) & this.f94370a;
    }

    private final void V1(long j10) {
        this.f94370a = j10 | this.f94370a;
    }

    public int R1() {
        p2();
        int i10 = this.f94371b.f95174b;
        long jHashCode = this.f94370a + 71;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 7) & 65535;
            jHashCode += this.f94370a * ((long) this.f94371b.get(i12).hashCode()) * ((long) i11);
        }
        return (int) ((jHashCode >> 32) ^ jHashCode);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] */
    public final int compare(a aVar, a aVar2) {
        return (int) (aVar.f94297a - aVar2.f94297a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        if (bVar == this) {
            return 0;
        }
        long j10 = this.f94370a;
        long j11 = bVar.f94370a;
        if (j10 != j11) {
            return j10 < j11 ? -1 : 1;
        }
        p2();
        bVar.p2();
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<a> bVar2 = this.f94371b;
            if (i10 >= bVar2.f95174b) {
                return 0;
            }
            int iCompareTo = bVar2.get(i10).compareTo(bVar.f94371b.get(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i10++;
        }
    }

    public final a W1(long j10) {
        if (!a2(j10)) {
            return null;
        }
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<a> bVar = this.f94371b;
            if (i10 >= bVar.f95174b) {
                return null;
            }
            if (bVar.get(i10).f94297a == j10) {
                return this.f94371b.get(i10);
            }
            i10++;
        }
    }

    public final <T extends a> T X1(Class<T> cls, long j10) {
        return (T) W1(j10);
    }

    public final com.badlogic.gdx.utils.b<a> Y1(com.badlogic.gdx.utils.b<a> bVar, long j10) {
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<a> bVar2 = this.f94371b;
            if (i10 >= bVar2.f95174b) {
                return bVar;
            }
            if ((bVar2.get(i10).f94297a & j10) != 0) {
                bVar.c(this.f94371b.get(i10));
            }
            i10++;
        }
    }

    public final long Z1() {
        return this.f94370a;
    }

    public final boolean a2(long j10) {
        return j10 != 0 && (this.f94370a & j10) == j10;
    }

    protected int b2(long j10) {
        if (a2(j10)) {
            int i10 = 0;
            while (true) {
                com.badlogic.gdx.utils.b<a> bVar = this.f94371b;
                if (i10 >= bVar.f95174b) {
                    break;
                }
                if (bVar.get(i10).f94297a == j10) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void clear() {
        this.f94370a = 0L;
        this.f94371b.clear();
    }

    public final void e2(long j10) {
        for (int i10 = this.f94371b.f95174b - 1; i10 >= 0; i10--) {
            long j11 = this.f94371b.get(i10).f94297a;
            if ((j10 & j11) == j11) {
                this.f94371b.A(i10);
                U1(j11);
                this.f94372c = false;
            }
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return g2((b) obj, true);
    }

    public final boolean f2(b bVar) {
        return g2(bVar, false);
    }

    public final boolean g2(b bVar, boolean z10) {
        if (bVar == this) {
            return true;
        }
        if (bVar == null || this.f94370a != bVar.f94370a) {
            return false;
        }
        if (!z10) {
            return true;
        }
        p2();
        bVar.p2();
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<a> bVar2 = this.f94371b;
            if (i10 >= bVar2.f95174b) {
                return true;
            }
            if (!bVar2.get(i10).l(bVar.f94371b.get(i10))) {
                return false;
            }
            i10++;
        }
    }

    public final void h2(a aVar) {
        int iB2 = b2(aVar.f94297a);
        if (iB2 >= 0) {
            this.f94371b.L(iB2, aVar);
            return;
        }
        V1(aVar.f94297a);
        this.f94371b.c(aVar);
        this.f94372c = false;
    }

    public int hashCode() {
        return R1();
    }

    @Override // java.lang.Iterable
    public final Iterator<a> iterator() {
        return this.f94371b.iterator();
    }

    public final void j2(a aVar, a aVar2) {
        h2(aVar);
        h2(aVar2);
    }

    public final void k2(a aVar, a aVar2, a aVar3) {
        h2(aVar);
        h2(aVar2);
        h2(aVar3);
    }

    public final void l2(a aVar, a aVar2, a aVar3, a aVar4) {
        h2(aVar);
        h2(aVar2);
        h2(aVar3);
        h2(aVar4);
    }

    public final void m2(Iterable<a> iterable) {
        Iterator<a> it = iterable.iterator();
        while (it.hasNext()) {
            h2(it.next());
        }
    }

    public final void n2(a... aVarArr) {
        for (a aVar : aVarArr) {
            h2(aVar);
        }
    }

    public final void p2() {
        if (this.f94372c) {
            return;
        }
        this.f94371b.sort(this);
        this.f94372c = true;
    }

    public int size() {
        return this.f94371b.f95174b;
    }
}
