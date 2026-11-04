package androidx.media3.extractor.ogg;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import androidx.media3.extractor.w;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class d implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f68221g = new w() { // from class: androidx.media3.extractor.ogg.c
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return d.d();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68222h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f68223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f68224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68225f;

    public static /* synthetic */ r[] d() {
        return new r[]{new d()};
    }

    private static o0 e(o0 o0Var) {
        o0Var.a0(0);
        return o0Var;
    }

    @il.e(expression = {"streamReader"}, result = true)
    private boolean i(s sVar) throws IOException {
        f fVar = new f();
        if (fVar.a(sVar, true) && (fVar.f68238b & 2) == 2) {
            int iMin = Math.min(fVar.f68245i, 8);
            o0 o0Var = new o0(iMin);
            sVar.i(o0Var.e(), 0, iMin);
            if (b.p(e(o0Var))) {
                this.f68224e = new b();
            } else if (j.r(e(o0Var))) {
                this.f68224e = new j();
            } else if (h.o(e(o0Var))) {
                this.f68224e = new h();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        i iVar = this.f68224e;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        androidx.media3.common.util.a.k(this.f68223d);
        if (this.f68224e == null) {
            if (!i(sVar)) {
                throw v0.a("Failed to determine bitstream type", null);
            }
            sVar.l();
        }
        if (!this.f68225f) {
            u0 u0VarA = this.f68223d.a(0, 1);
            this.f68223d.l();
            this.f68224e.d(this.f68223d, u0VarA);
            this.f68225f = true;
        }
        return this.f68224e.g(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        try {
            return i(sVar);
        } catch (v0 unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f68223d = tVar;
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
