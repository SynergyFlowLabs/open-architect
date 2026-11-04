package org.locationtech.jts.noding;

/* JADX INFO: loaded from: classes14.dex */
public class f implements t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.algorithm.o f338574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f338575g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f338569a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338570b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338571c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338572d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338573e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f338576h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f338577i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f338578j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f338579k = 0;

    public f(org.locationtech.jts.algorithm.o oVar) {
        this.f338574f = oVar;
    }

    public static boolean h(int i10, int i11) {
        return Math.abs(i10 - i11) == 1;
    }

    private boolean i(y yVar, int i10, y yVar2, int i11) {
        if (yVar == yVar2 && this.f338574f.l() == 1) {
            if (h(i10, i11)) {
                return true;
            }
            if (yVar.isClosed()) {
                int size = yVar.size() - 1;
                if ((i10 == 0 && i11 == size) || (i11 == 0 && i10 == size)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.locationtech.jts.noding.t
    public void a(y yVar, int i10, y yVar2, int i11) {
        if (yVar == yVar2 && i10 == i11) {
            return;
        }
        this.f338579k++;
        this.f338574f.f(yVar.n()[i10], yVar.n()[i10 + 1], yVar2.n()[i11], yVar2.n()[i11 + 1]);
        if (this.f338574f.n()) {
            this.f338576h++;
            if (this.f338574f.q()) {
                this.f338577i++;
                this.f338572d = true;
            }
            if (i(yVar, i10, yVar2, i11)) {
                return;
            }
            this.f338569a = true;
            ((m) yVar).e(this.f338574f, i10, 0);
            ((m) yVar2).e(this.f338574f, i11, 1);
            if (this.f338574f.t()) {
                this.f338578j++;
                this.f338570b = true;
                this.f338571c = true;
            }
        }
    }

    public org.locationtech.jts.algorithm.o b() {
        return this.f338574f;
    }

    public org.locationtech.jts.geom.a c() {
        return this.f338573e;
    }

    public boolean d() {
        return this.f338572d;
    }

    public boolean e() {
        return this.f338569a;
    }

    public boolean f() {
        return this.f338571c;
    }

    public boolean g() {
        return this.f338570b;
    }

    @Override // org.locationtech.jts.noding.t
    public boolean isDone() {
        return false;
    }
}
