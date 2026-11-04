package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.ArrayDeque;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class i implements b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65927g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f65928h = 0.5d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f65929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f65930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f65931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TreeSet<a> f65932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f65933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f65934f;

    private static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f65935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f65936b;

        public a(long j10, double d10) {
            this.f65935a = j10;
            this.f65936b = d10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return k1.u(this.f65935a, aVar.f65935a);
        }
    }

    public i() {
        this(10, 0.5d);
    }

    private long c() {
        if (this.f65931c.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d10 = this.f65933e * this.f65930b;
        double d11 = 0.0d;
        long j10 = 0;
        double d12 = 0.0d;
        for (a aVar : this.f65932d) {
            double d13 = d11 + (aVar.f65936b / 2.0d);
            if (d13 >= d10) {
                return j10 == 0 ? aVar.f65935a : j10 + ((long) (((aVar.f65935a - j10) * (d10 - d12)) / (d13 - d12)));
            }
            j10 = aVar.f65935a;
            d12 = d13;
            d11 = (aVar.f65936b / 2.0d) + d13;
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public void a(long j10, long j11) {
        while (this.f65931c.size() >= this.f65929a) {
            a aVarRemove = this.f65931c.remove();
            this.f65932d.remove(aVarRemove);
            this.f65933e -= aVarRemove.f65936b;
        }
        double dSqrt = Math.sqrt(j10);
        a aVar = new a((j10 * 8000000) / j11, dSqrt);
        this.f65931c.add(aVar);
        this.f65932d.add(aVar);
        this.f65933e += dSqrt;
        this.f65934f = c();
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public long b() {
        return this.f65934f;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public void reset() {
        this.f65931c.clear();
        this.f65932d.clear();
        this.f65933e = 0.0d;
        this.f65934f = Long.MIN_VALUE;
    }

    public i(int i10, double d10) {
        androidx.media3.common.util.a.a(d10 >= 0.0d && d10 <= 1.0d);
        this.f65929a = i10;
        this.f65930b = d10;
        this.f65931c = new ArrayDeque<>();
        this.f65932d = new TreeSet<>();
        this.f65934f = Long.MIN_VALUE;
    }
}
