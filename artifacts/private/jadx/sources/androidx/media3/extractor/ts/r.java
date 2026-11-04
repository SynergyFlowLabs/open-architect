package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class r implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f69414h = "Id3Reader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69415a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u0 f69417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69418d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69421g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f69416b = new androidx.media3.common.util.o0(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f69419e = -9223372036854775807L;

    public r(String str) {
        this.f69415a = str;
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69418d = false;
        this.f69419e = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        androidx.media3.common.util.a.k(this.f69417c);
        if (this.f69418d) {
            int iA = o0Var.a();
            int i10 = this.f69421g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(o0Var.e(), o0Var.f(), this.f69416b.e(), this.f69421g, iMin);
                if (this.f69421g + iMin == 10) {
                    this.f69416b.a0(0);
                    if (73 != this.f69416b.L() || 68 != this.f69416b.L() || 51 != this.f69416b.L()) {
                        androidx.media3.common.util.z.n(f69414h, "Discarding invalid ID3 tag");
                        this.f69418d = false;
                        return;
                    } else {
                        this.f69416b.b0(3);
                        this.f69420f = this.f69416b.K() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f69420f - this.f69421g);
            this.f69417c.b(o0Var, iMin2);
            this.f69421g += iMin2;
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f69418d = true;
        this.f69419e = j10;
        this.f69420f = 0;
        this.f69421g = 0;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        eVar.a();
        u0 u0VarA = tVar.a(eVar.c(), 5);
        this.f69417c = u0VarA;
        u0VarA.e(new androidx.media3.common.w.b().f0(eVar.b()).U(this.f69415a).u0("application/id3").N());
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
        int i10;
        androidx.media3.common.util.a.k(this.f69417c);
        if (this.f69418d && (i10 = this.f69420f) != 0 && this.f69421g == i10) {
            androidx.media3.common.util.a.i(this.f69419e != -9223372036854775807L);
            this.f69417c.g(this.f69419e, 1, this.f69420f, 0, null);
            this.f69418d = false;
        }
    }
}
