package androidx.media3.extractor.ts;

import androidx.media3.extractor.u0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f69327d = 434;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.media3.common.w> f69328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0[] f69330c;

    public o0(List<androidx.media3.common.w> list, String str) {
        this.f69328a = list;
        this.f69329b = str;
        this.f69330c = new u0[list.size()];
    }

    public void a(long j10, androidx.media3.common.util.o0 o0Var) {
        if (o0Var.a() >= 9) {
            int iS = o0Var.s();
            int iS2 = o0Var.s();
            int iL = o0Var.L();
            if (iS == f69327d && iS2 == 1195456820 && iL == 3) {
                androidx.media3.extractor.f.b(j10, o0Var, this.f69330c);
            }
        }
    }

    public void b(androidx.media3.extractor.t tVar, m0.e eVar) {
        for (int i10 = 0; i10 < this.f69330c.length; i10++) {
            eVar.a();
            u0 u0VarA = tVar.a(eVar.c(), 3);
            androidx.media3.common.w wVar = this.f69328a.get(i10);
            String str = wVar.f61761o;
            androidx.media3.common.util.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            u0VarA.e(new androidx.media3.common.w.b().f0(eVar.b()).U(this.f69329b).u0(str).w0(wVar.f61751e).j0(wVar.f61750d).O(wVar.J).g0(wVar.f61764r).N());
            this.f69330c[i10] = u0VarA;
        }
    }
}
