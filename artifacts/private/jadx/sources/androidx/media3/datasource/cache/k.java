package androidx.media3.datasource.cache;

import androidx.annotation.p0;
import androidx.media3.common.util.z;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62387f = "CachedContent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TreeSet<u> f62390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f62391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o f62392e;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62394b;

        public a(long j10, long j11) {
            this.f62393a = j10;
            this.f62394b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f62394b;
            if (j12 == -1) {
                return j10 >= this.f62393a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f62393a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f62393a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f62394b;
            if (j13 != -1 && j12 + j13 <= j10) {
                return false;
            }
            return true;
        }
    }

    public k(int i10, String str) {
        this(i10, str, o.f62433f);
    }

    public void a(u uVar) {
        this.f62390c.add(uVar);
    }

    public boolean b(n nVar) {
        o oVar = this.f62392e;
        o oVarH = oVar.h(nVar);
        this.f62392e = oVarH;
        return !oVarH.equals(oVar);
    }

    public long c(long j10, long j11) {
        androidx.media3.common.util.a.a(j10 >= 0);
        androidx.media3.common.util.a.a(j11 >= 0);
        u uVarE = e(j10, j11);
        if (uVarE.k()) {
            return -Math.min(uVarE.l() ? Long.MAX_VALUE : uVarE.f62372c, j11);
        }
        long j12 = j10 + j11;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long jMax = uVarE.f62371b + uVarE.f62372c;
        if (jMax < j13) {
            for (u uVar : this.f62390c.tailSet(uVarE, false)) {
                long j14 = uVar.f62371b;
                if (j14 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j14 + uVar.f62372c);
                if (jMax >= j13) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public o d() {
        return this.f62392e;
    }

    public u e(long j10, long j11) {
        u uVarR = u.r(this.f62389b, j10);
        u uVarFloor = this.f62390c.floor(uVarR);
        if (uVarFloor != null && uVarFloor.f62371b + uVarFloor.f62372c > j10) {
            return uVarFloor;
        }
        u uVarCeiling = this.f62390c.ceiling(uVarR);
        if (uVarCeiling != null) {
            long j12 = uVarCeiling.f62371b - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return u.q(this.f62389b, j10, j11);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f62388a == kVar.f62388a && this.f62389b.equals(kVar.f62389b) && this.f62390c.equals(kVar.f62390c) && this.f62392e.equals(kVar.f62392e)) {
                return true;
            }
        }
        return false;
    }

    public TreeSet<u> f() {
        return this.f62390c;
    }

    public boolean g() {
        return this.f62390c.isEmpty();
    }

    public boolean h(long j10, long j11) {
        for (int i10 = 0; i10 < this.f62391d.size(); i10++) {
            if (this.f62391d.get(i10).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f62388a * 31) + this.f62389b.hashCode()) * 31) + this.f62392e.hashCode();
    }

    public boolean i() {
        return this.f62391d.isEmpty();
    }

    public boolean j(long j10, long j11) {
        for (int i10 = 0; i10 < this.f62391d.size(); i10++) {
            if (this.f62391d.get(i10).b(j10, j11)) {
                return false;
            }
        }
        this.f62391d.add(new a(j10, j11));
        return true;
    }

    public boolean k(i iVar) {
        if (!this.f62390c.remove(iVar)) {
            return false;
        }
        File file = iVar.f62374e;
        if (file != null) {
            file.delete();
        }
        return true;
    }

    public u l(u uVar, long j10, boolean z10) {
        long j11;
        androidx.media3.common.util.a.i(this.f62390c.remove(uVar));
        File file = (File) androidx.media3.common.util.a.g(uVar.f62374e);
        if (z10) {
            j11 = j10;
            File fileS = u.s((File) androidx.media3.common.util.a.g(file.getParentFile()), this.f62388a, uVar.f62371b, j11);
            if (file.renameTo(fileS)) {
                file = fileS;
            } else {
                z.n(f62387f, "Failed to rename " + file + " to " + fileS);
            }
        } else {
            j11 = j10;
        }
        u uVarN = uVar.n(file, j11);
        this.f62390c.add(uVarN);
        return uVarN;
    }

    public void m(long j10) {
        for (int i10 = 0; i10 < this.f62391d.size(); i10++) {
            if (this.f62391d.get(i10).f62393a == j10) {
                this.f62391d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public k(int i10, String str, o oVar) {
        this.f62388a = i10;
        this.f62389b = str;
        this.f62392e = oVar;
        this.f62390c = new TreeSet<>();
        this.f62391d = new ArrayList<>();
    }
}
