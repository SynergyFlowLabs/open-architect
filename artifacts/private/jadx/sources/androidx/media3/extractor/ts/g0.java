package androidx.media3.extractor.ts;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.u0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.media3.common.w> f69077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0[] f69079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.container.j f69080d = new androidx.media3.container.j(new androidx.media3.container.j.b() { // from class: androidx.media3.extractor.ts.f0
        @Override // androidx.media3.container.j.b
        public final void a(long j10, androidx.media3.common.util.o0 o0Var) {
            androidx.media3.extractor.f.a(j10, o0Var, this.f69076a.f69079c);
        }
    });

    public g0(List<androidx.media3.common.w> list, String str) {
        this.f69077a = list;
        this.f69078b = str;
        this.f69079c = new u0[list.size()];
    }

    public void b() {
        this.f69080d.d();
    }

    public void c(long j10, androidx.media3.common.util.o0 o0Var) {
        this.f69080d.a(j10, o0Var);
    }

    public void d(androidx.media3.extractor.t tVar, m0.e eVar) {
        for (int i10 = 0; i10 < this.f69079c.length; i10++) {
            eVar.a();
            u0 u0VarA = tVar.a(eVar.c(), 3);
            androidx.media3.common.w wVar = this.f69077a.get(i10);
            String str = wVar.f61761o;
            androidx.media3.common.util.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = wVar.f61747a;
            if (strB == null) {
                strB = eVar.b();
            }
            u0VarA.e(new androidx.media3.common.w.b().f0(strB).U(this.f69078b).u0(str).w0(wVar.f61751e).j0(wVar.f61750d).O(wVar.J).g0(wVar.f61764r).N());
            this.f69079c[i10] = u0VarA;
        }
    }

    public void e() {
        this.f69080d.d();
    }

    public void f(int i10) {
        this.f69080d.g(i10);
    }
}
