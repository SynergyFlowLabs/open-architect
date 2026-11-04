package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.datasource.x;
import androidx.media3.exoplayer.upstream.u;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f65911e = 0.85d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f65912f = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<x, Long> f65913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f65914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.j f65915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f65916d;

    private static class a<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65917a;

        public a(int i10) {
            this.f65917a = i10;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f65917a;
        }
    }

    public g() {
        this(0.85d, androidx.media3.common.util.j.f61520a);
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public void a(x xVar) {
        Long lRemove = this.f65913a.remove(xVar);
        if (lRemove == null) {
            return;
        }
        long jD1 = k1.D1(this.f65915c.b()) - lRemove.longValue();
        long j10 = this.f65916d;
        if (j10 == -9223372036854775807L) {
            this.f65916d = jD1;
        } else {
            double d10 = this.f65914b;
            this.f65916d = (long) ((j10 * d10) + ((1.0d - d10) * jD1));
        }
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public void b(x xVar) {
        this.f65913a.remove(xVar);
        this.f65913a.put(xVar, Long.valueOf(k1.D1(this.f65915c.b())));
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public long c() {
        return this.f65916d;
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public void reset() {
        this.f65916d = -9223372036854775807L;
    }

    public g(double d10) {
        this(d10, androidx.media3.common.util.j.f61520a);
    }

    @l1
    g(double d10, androidx.media3.common.util.j jVar) {
        this.f65914b = d10;
        this.f65915c = jVar;
        this.f65913a = new a(10);
        this.f65916d = -9223372036854775807L;
    }
}
