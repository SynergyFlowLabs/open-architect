package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.datasource.x;
import androidx.media3.exoplayer.upstream.t;
import androidx.media3.exoplayer.upstream.u;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65918f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f65919g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f65920h = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<x, Long> f65921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f65922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f65923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.util.j f65924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f65925e;

    private static class a<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65926a;

        public a(int i10) {
            this.f65926a = i10;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f65926a;
        }
    }

    public h() {
        this(10, 0.5f);
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public void a(x xVar) {
        Long lRemove = this.f65921a.remove(xVar);
        if (lRemove == null) {
            return;
        }
        this.f65922b.c(1, k1.D1(this.f65924d.b()) - lRemove.longValue());
        this.f65925e = false;
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public void b(x xVar) {
        this.f65921a.remove(xVar);
        this.f65921a.put(xVar, Long.valueOf(k1.D1(this.f65924d.b())));
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public long c() {
        if (this.f65925e) {
            return -9223372036854775807L;
        }
        return (long) this.f65922b.f(this.f65923c);
    }

    @Override // androidx.media3.exoplayer.upstream.u
    public void reset() {
        this.f65922b.g();
        this.f65925e = true;
    }

    public h(int i10, float f10) {
        this(i10, f10, androidx.media3.common.util.j.f61520a);
    }

    @l1
    h(int i10, float f10, androidx.media3.common.util.j jVar) {
        androidx.media3.common.util.a.a(i10 > 0 && f10 > 0.0f && f10 <= 1.0f);
        this.f65923c = f10;
        this.f65924d = jVar;
        this.f65921a = new a(10);
        this.f65922b = new t(i10);
        this.f65925e = true;
    }
}
