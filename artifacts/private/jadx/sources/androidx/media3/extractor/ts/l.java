package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.u0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<m0.a> f69178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0[] f69180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f69184g = -9223372036854775807L;

    public l(List<m0.a> list, String str) {
        this.f69178a = list;
        this.f69179b = str;
        this.f69180c = new u0[list.size()];
    }

    private boolean f(androidx.media3.common.util.o0 o0Var, int i10) {
        if (o0Var.a() == 0) {
            return false;
        }
        if (o0Var.L() != i10) {
            this.f69181d = false;
        }
        this.f69182e--;
        return this.f69181d;
    }

    @Override // androidx.media3.extractor.ts.m
    public void a() {
        this.f69181d = false;
        this.f69184g = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.m
    public void b(androidx.media3.common.util.o0 o0Var) {
        if (this.f69181d) {
            if (this.f69182e != 2 || f(o0Var, 32)) {
                if (this.f69182e != 1 || f(o0Var, 0)) {
                    int iF = o0Var.f();
                    int iA = o0Var.a();
                    for (u0 u0Var : this.f69180c) {
                        o0Var.a0(iF);
                        u0Var.b(o0Var, iA);
                    }
                    this.f69183f += iA;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void c(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f69181d = true;
        this.f69184g = j10;
        this.f69183f = 0;
        this.f69182e = 2;
    }

    @Override // androidx.media3.extractor.ts.m
    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        for (int i10 = 0; i10 < this.f69180c.length; i10++) {
            m0.a aVar = this.f69178a.get(i10);
            eVar.a();
            u0 u0VarA = tVar.a(eVar.c(), 3);
            u0VarA.e(new androidx.media3.common.w.b().f0(eVar.b()).U(this.f69179b).u0("application/dvbsubs").g0(Collections.singletonList(aVar.f69240c)).j0(aVar.f69238a).N());
            this.f69180c[i10] = u0VarA;
        }
    }

    @Override // androidx.media3.extractor.ts.m
    public void e(boolean z10) {
        if (this.f69181d) {
            androidx.media3.common.util.a.i(this.f69184g != -9223372036854775807L);
            for (u0 u0Var : this.f69180c) {
                u0Var.g(this.f69184g, 1, this.f69183f, 0, null);
            }
            this.f69181d = false;
        }
    }
}
