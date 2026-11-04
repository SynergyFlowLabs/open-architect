package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.datasource.p;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class m implements androidx.media3.exoplayer.upstream.experimental.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.experimental.b f65949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f65950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f65951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.j f65952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.d.a.C0595a f65953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f65955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f65956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f65957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f65958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f65959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f65960m;

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f65962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f65963c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.experimental.b f65961a = new l();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.common.util.j f65964d = androidx.media3.common.util.j.f61520a;

        public m e() {
            return new m(this);
        }

        @z7.a
        public b f(androidx.media3.exoplayer.upstream.experimental.b bVar) {
            androidx.media3.common.util.a.g(bVar);
            this.f65961a = bVar;
            return this;
        }

        @z7.a
        @l1
        b g(androidx.media3.common.util.j jVar) {
            this.f65964d = jVar;
            return this;
        }

        @z7.a
        public b h(long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            this.f65963c = j10;
            return this;
        }

        @z7.a
        public b i(int i10) {
            androidx.media3.common.util.a.a(i10 >= 0);
            this.f65962b = i10;
            return this;
        }
    }

    private void i(int i10, long j10, long j11) {
        if (j11 != Long.MIN_VALUE && (i10 != 0 || j10 != 0 || j11 != this.f65958k)) {
            this.f65958k = j11;
            this.f65953f.c(i10, j10, j11);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void a(androidx.media3.exoplayer.upstream.d.a aVar) {
        this.f65953f.d(aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public long b() {
        return this.f65957j;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void c(p pVar) {
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void d(Handler handler, androidx.media3.exoplayer.upstream.d.a aVar) {
        this.f65953f.b(handler, aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void e(p pVar) {
        androidx.media3.common.util.a.i(this.f65954g > 0);
        long jB = this.f65952e.b();
        long j10 = (int) (jB - this.f65955h);
        if (j10 > 0) {
            this.f65949b.a(this.f65956i, 1000 * j10);
            int i10 = this.f65959l + 1;
            this.f65959l = i10;
            if (i10 > this.f65950c && this.f65960m > this.f65951d) {
                this.f65957j = this.f65949b.b();
            }
            i((int) j10, this.f65956i, this.f65957j);
            this.f65955h = jB;
            this.f65956i = 0L;
        }
        this.f65954g--;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void f(p pVar, int i10) {
        long j10 = i10;
        this.f65956i += j10;
        this.f65960m += j10;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void g(long j10) {
        long jB = this.f65952e.b();
        i(this.f65954g > 0 ? (int) (jB - this.f65955h) : 0, this.f65956i, j10);
        this.f65949b.reset();
        this.f65957j = Long.MIN_VALUE;
        this.f65955h = jB;
        this.f65956i = 0L;
        this.f65959l = 0;
        this.f65960m = 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void h(p pVar) {
        if (this.f65954g == 0) {
            this.f65955h = this.f65952e.b();
        }
        this.f65954g++;
    }

    private m(b bVar) {
        this.f65949b = bVar.f65961a;
        this.f65950c = bVar.f65962b;
        this.f65951d = bVar.f65963c;
        this.f65952e = bVar.f65964d;
        this.f65953f = new androidx.media3.exoplayer.upstream.d.a.C0595a();
        this.f65957j = Long.MIN_VALUE;
        this.f65958k = Long.MIN_VALUE;
    }
}
