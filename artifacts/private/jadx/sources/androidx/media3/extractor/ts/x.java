package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.w0;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.media3.common.w f69526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w0 f69527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u0 f69528c;

    public x(String str, String str2) {
        this.f69526a = new androidx.media3.common.w.b().U(str2).u0(str).N();
    }

    @il.d({"timestampAdjuster", "output"})
    private void a() {
        androidx.media3.common.util.a.k(this.f69527b);
        k1.o(this.f69528c);
    }

    @Override // androidx.media3.extractor.ts.d0
    public void b(androidx.media3.common.util.o0 o0Var) {
        a();
        long jE = this.f69527b.e();
        long jF = this.f69527b.f();
        if (jE != -9223372036854775807L && jF != -9223372036854775807L) {
            androidx.media3.common.w wVar = this.f69526a;
            if (jF != wVar.f61766t) {
                androidx.media3.common.w wVarN = wVar.b().y0(jF).N();
                this.f69526a = wVarN;
                this.f69528c.e(wVarN);
            }
            int iA = o0Var.a();
            this.f69528c.b(o0Var, iA);
            this.f69528c.g(jE, 1, iA, 0, null);
        }
    }

    @Override // androidx.media3.extractor.ts.d0
    public void c(w0 w0Var, androidx.media3.extractor.t tVar, m0.e eVar) {
        this.f69527b = w0Var;
        eVar.a();
        u0 u0VarA = tVar.a(eVar.c(), 5);
        this.f69528c = u0VarA;
        u0VarA.e(this.f69526a);
    }
}
