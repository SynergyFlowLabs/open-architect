package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.datasource.p;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class c implements androidx.media3.exoplayer.upstream.experimental.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.experimental.b f65861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f65862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f65863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.d.a.C0595a f65864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.common.util.j f65865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f65867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f65868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f65869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f65870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f65871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f65872m;

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f65874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f65875c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.experimental.b f65873a = new l();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.common.util.j f65876d = androidx.media3.common.util.j.f61520a;

        public c e() {
            return new c(this);
        }

        @z7.a
        public b f(androidx.media3.exoplayer.upstream.experimental.b bVar) {
            androidx.media3.common.util.a.g(bVar);
            this.f65873a = bVar;
            return this;
        }

        @z7.a
        @l1
        b g(androidx.media3.common.util.j jVar) {
            this.f65876d = jVar;
            return this;
        }

        @z7.a
        public b h(long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            this.f65875c = j10;
            return this;
        }

        @z7.a
        public b i(int i10) {
            androidx.media3.common.util.a.a(i10 >= 0);
            this.f65874b = i10;
            return this;
        }
    }

    private void i(int i10, long j10, long j11) {
        if (j11 != Long.MIN_VALUE) {
            if (i10 == 0 && j10 == 0 && j11 == this.f65870k) {
                return;
            }
            this.f65870k = j11;
            this.f65864e.c(i10, j10, j11);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void a(androidx.media3.exoplayer.upstream.d.a aVar) {
        this.f65864e.d(aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public long b() {
        return this.f65869j;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void c(p pVar) {
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void d(Handler handler, androidx.media3.exoplayer.upstream.d.a aVar) {
        this.f65864e.b(handler, aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void e(p pVar) {
        androidx.media3.common.util.a.i(this.f65866g > 0);
        int i10 = this.f65866g - 1;
        this.f65866g = i10;
        if (i10 > 0) {
            return;
        }
        long jB = (int) (this.f65865f.b() - this.f65867h);
        if (jB > 0) {
            this.f65861b.a(this.f65868i, 1000 * jB);
            int i11 = this.f65871l + 1;
            this.f65871l = i11;
            if (i11 > this.f65862c && this.f65872m > this.f65863d) {
                this.f65869j = this.f65861b.b();
            }
            i((int) jB, this.f65868i, this.f65869j);
            this.f65868i = 0L;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void f(p pVar, int i10) {
        long j10 = i10;
        this.f65868i += j10;
        this.f65872m += j10;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void g(long j10) {
        long jB = this.f65865f.b();
        i(this.f65866g > 0 ? (int) (jB - this.f65867h) : 0, this.f65868i, j10);
        this.f65861b.reset();
        this.f65869j = Long.MIN_VALUE;
        this.f65867h = jB;
        this.f65868i = 0L;
        this.f65871l = 0;
        this.f65872m = 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public void h(p pVar) {
        if (this.f65866g == 0) {
            this.f65867h = this.f65865f.b();
        }
        this.f65866g++;
    }

    private c(b bVar) {
        this.f65861b = bVar.f65873a;
        this.f65862c = bVar.f65874b;
        this.f65863d = bVar.f65875c;
        this.f65865f = bVar.f65876d;
        this.f65864e = new androidx.media3.exoplayer.upstream.d.a.C0595a();
        this.f65869j = Long.MIN_VALUE;
        this.f65870k = Long.MIN_VALUE;
    }
}
