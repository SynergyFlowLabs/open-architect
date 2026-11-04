package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class l implements androidx.media3.exoplayer.upstream.experimental.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65940f = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f65941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f65942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.j f65943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f65944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f65945e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f65946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f65947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f65948c;

        public a(long j10, double d10, long j11) {
            this.f65946a = j10;
            this.f65947b = d10;
            this.f65948c = j11;
        }
    }

    public interface b {
        boolean a(Deque<a> deque);
    }

    public l() {
        this(g(10L));
    }

    public static /* synthetic */ boolean c(long j10, androidx.media3.common.util.j jVar, Deque deque) {
        if (!deque.isEmpty() && ((a) k1.o((a) deque.peek())).f65948c + j10 < jVar.b()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean d(long j10, Deque deque) {
        return ((long) deque.size()) >= j10;
    }

    public static b e(long j10) {
        return f(j10, androidx.media3.common.util.j.f61520a);
    }

    @l1
    static b f(final long j10, final androidx.media3.common.util.j jVar) {
        return new b() { // from class: androidx.media3.exoplayer.upstream.experimental.j
            @Override // androidx.media3.exoplayer.upstream.experimental.l.b
            public final boolean a(Deque deque) {
                return l.c(j10, jVar, deque);
            }
        };
    }

    public static b g(final long j10) {
        return new b() { // from class: androidx.media3.exoplayer.upstream.experimental.k
            @Override // androidx.media3.exoplayer.upstream.experimental.l.b
            public final boolean a(Deque deque) {
                return l.d(j10, deque);
            }
        };
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public void a(long j10, long j11) {
        while (this.f65942b.a(this.f65941a)) {
            a aVarRemove = this.f65941a.remove();
            double d10 = this.f65944d;
            double d11 = aVarRemove.f65946a;
            double d12 = aVarRemove.f65947b;
            this.f65944d = d10 - (d11 * d12);
            this.f65945e -= d12;
        }
        a aVar = new a((j10 * 8000000) / j11, Math.sqrt(j10), this.f65943c.b());
        this.f65941a.add(aVar);
        double d13 = this.f65944d;
        double d14 = aVar.f65946a;
        double d15 = aVar.f65947b;
        this.f65944d = d13 + (d14 * d15);
        this.f65945e += d15;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public long b() {
        if (this.f65941a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.f65944d / this.f65945e);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public void reset() {
        this.f65941a.clear();
        this.f65944d = 0.0d;
        this.f65945e = 0.0d;
    }

    public l(b bVar) {
        this(bVar, androidx.media3.common.util.j.f61520a);
    }

    @l1
    l(b bVar, androidx.media3.common.util.j jVar) {
        this.f65941a = new ArrayDeque<>();
        this.f65942b = bVar;
        this.f65943c = jVar;
    }
}
