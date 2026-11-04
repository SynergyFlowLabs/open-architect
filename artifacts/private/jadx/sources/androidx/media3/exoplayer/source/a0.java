package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.common.b4;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.t3;
import com.google.common.collect.l6;
import com.google.common.collect.z6;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class a0 extends j2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z6<Integer> f64748m;

    private static final class a implements s0, s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f64749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z6<Integer> f64750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private s0.a f64751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private h2 f64752d;

        public a(s0 s0Var, z6<Integer> z6Var) {
            this.f64749a = s0Var;
            this.f64750b = z6Var;
        }

        @Override // androidx.media3.exoplayer.source.t1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void l(s0 s0Var) {
            ((s0.a) androidx.media3.common.util.a.g(this.f64751c)).l(this);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public long b() {
            return this.f64749a.b();
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public void c(long j10) {
            this.f64749a.c(j10);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public boolean d() {
            return this.f64749a.d();
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public long e() {
            return this.f64749a.e();
        }

        @Override // androidx.media3.exoplayer.source.s0
        public List<StreamKey> f(List<androidx.media3.exoplayer.trackselection.c0> list) {
            return this.f64749a.f(list);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long g(long j10, f5 f5Var) {
            return this.f64749a.g(j10, f5Var);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long h(long j10) {
            return this.f64749a.h(j10);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long i() {
            return this.f64749a.i();
        }

        @Override // androidx.media3.exoplayer.source.s0.a
        public void j(s0 s0Var) {
            h2 h2VarM = s0Var.m();
            l6.a aVarS = l6.s();
            for (int i10 = 0; i10 < h2VarM.f65076a; i10++) {
                b4 b4VarC = h2VarM.c(i10);
                if (this.f64750b.contains(Integer.valueOf(b4VarC.f60461c))) {
                    aVarS.a(b4VarC);
                }
            }
            this.f64752d = new h2((b4[]) aVarS.e().toArray(new b4[0]));
            ((s0.a) androidx.media3.common.util.a.g(this.f64751c)).j(this);
        }

        @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
        public boolean k(t3 t3Var) {
            return this.f64749a.k(t3Var);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public h2 m() {
            return (h2) androidx.media3.common.util.a.g(this.f64752d);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void o() throws IOException {
            this.f64749a.o();
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void p(long j10, boolean z10) {
            this.f64749a.p(j10, z10);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
            return this.f64749a.t(c0VarArr, zArr, s1VarArr, zArr2, j10);
        }

        @Override // androidx.media3.exoplayer.source.s0
        public void v(s0.a aVar, long j10) {
            this.f64751c = aVar;
            this.f64749a.v(this, j10);
        }
    }

    public a0(t0 t0Var, int i10) {
        this(t0Var, z6.J(Integer.valueOf(i10)));
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        super.l(((a) s0Var).f64749a);
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        return new a(super.x(bVar, bVar2, j10), this.f64748m);
    }

    public a0(t0 t0Var, Set<Integer> set) {
        super(t0Var);
        this.f64748m = z6.A(set);
    }
}
