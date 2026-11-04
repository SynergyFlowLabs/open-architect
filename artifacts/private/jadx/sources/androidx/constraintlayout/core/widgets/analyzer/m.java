package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44585h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44586i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44587j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f44588k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f44591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f44592d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f44594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f44595g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44589a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44590b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<p> f44593e = new ArrayList<>();

    m(p pVar, int i10) {
        this.f44591c = null;
        this.f44592d = null;
        int i11 = f44588k;
        this.f44594f = i11;
        f44588k = i11 + 1;
        this.f44591c = pVar;
        this.f44592d = pVar;
        this.f44595g = i10;
    }

    private boolean c(p pVar, int i10) {
        f fVar;
        p pVar2;
        f fVar2;
        p pVar3;
        if (!pVar.f44616b.f44714g[i10]) {
            return false;
        }
        for (d dVar : pVar.f44622h.f44562k) {
            if ((dVar instanceof f) && (pVar3 = (fVar2 = (f) dVar).f44555d) != pVar && fVar2 == pVar3.f44622h) {
                if (pVar instanceof c) {
                    Iterator<p> it = ((c) pVar).f44539k.iterator();
                    while (it.hasNext()) {
                        c(it.next(), i10);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f44616b.f44714g[i10] = false;
                }
                c(fVar2.f44555d, i10);
            }
        }
        for (d dVar2 : pVar.f44623i.f44562k) {
            if ((dVar2 instanceof f) && (pVar2 = (fVar = (f) dVar2).f44555d) != pVar && fVar == pVar2.f44622h) {
                if (pVar instanceof c) {
                    Iterator<p> it2 = ((c) pVar).f44539k.iterator();
                    while (it2.hasNext()) {
                        c(it2.next(), i10);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f44616b.f44714g[i10] = false;
                }
                c(fVar.f44555d, i10);
            }
        }
        return false;
    }

    private long e(f fVar, long j10) {
        p pVar = fVar.f44555d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f44562k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f44562k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f44555d != pVar) {
                    jMin = Math.min(jMin, e(fVar2, ((long) fVar2.f44557f) + j10));
                }
            }
        }
        if (fVar != pVar.f44623i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, e(pVar.f44622h, j11)), j11 - ((long) pVar.f44622h.f44557f));
    }

    private long f(f fVar, long j10) {
        p pVar = fVar.f44555d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f44562k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f44562k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f44555d != pVar) {
                    jMax = Math.max(jMax, f(fVar2, ((long) fVar2.f44557f) + j10));
                }
            }
        }
        if (fVar != pVar.f44622h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, f(pVar.f44623i, j11)), j11 - ((long) pVar.f44623i.f44557f));
    }

    public void a(p pVar) {
        this.f44593e.add(pVar);
        this.f44592d = pVar;
    }

    public long b(androidx.constraintlayout.core.widgets.f fVar, int i10) {
        p pVar = this.f44591c;
        if (pVar instanceof c) {
            if (((c) pVar).f44620f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f44710e : fVar.f44712f).f44622h;
        f fVar3 = (i10 == 0 ? fVar.f44710e : fVar.f44712f).f44623i;
        boolean zContains = pVar.f44622h.f44563l.contains(fVar2);
        boolean zContains2 = this.f44591c.f44623i.f44563l.contains(fVar3);
        long j10 = this.f44591c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                f fVar4 = this.f44591c.f44622h;
                return Math.max(f(fVar4, fVar4.f44557f), ((long) this.f44591c.f44622h.f44557f) + j10);
            }
            if (!zContains2) {
                p pVar2 = this.f44591c;
                return (((long) pVar2.f44622h.f44557f) + pVar2.j()) - ((long) this.f44591c.f44623i.f44557f);
            }
            f fVar5 = this.f44591c.f44623i;
            return Math.max(-e(fVar5, fVar5.f44557f), ((long) (-this.f44591c.f44623i.f44557f)) + j10);
        }
        long jF = f(this.f44591c.f44622h, 0L);
        long jE = e(this.f44591c.f44623i, 0L);
        long j11 = jF - j10;
        p pVar3 = this.f44591c;
        int i11 = pVar3.f44623i.f44557f;
        if (j11 >= (-i11)) {
            j11 += (long) i11;
        }
        int i12 = pVar3.f44622h.f44557f;
        long j12 = ((-jE) - j10) - ((long) i12);
        if (j12 >= i12) {
            j12 -= (long) i12;
        }
        float fU = pVar3.f44616b.u(i10);
        float f10 = fU > 0.0f ? (long) ((j12 / fU) + (j11 / (1.0f - fU))) : 0L;
        long j13 = ((long) ((f10 * fU) + 0.5f)) + j10 + ((long) ((f10 * (1.0f - fU)) + 0.5f));
        p pVar4 = this.f44591c;
        return (((long) pVar4.f44622h.f44557f) + j13) - ((long) pVar4.f44623i.f44557f);
    }

    public void d(boolean z10, boolean z11) {
        if (z10) {
            p pVar = this.f44591c;
            if (pVar instanceof l) {
                c(pVar, 0);
            }
        }
        if (z11) {
            p pVar2 = this.f44591c;
            if (pVar2 instanceof n) {
                c(pVar2, 1);
            }
        }
    }
}
