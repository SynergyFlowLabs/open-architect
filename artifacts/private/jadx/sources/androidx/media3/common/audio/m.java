package androidx.media3.common.audio;

import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class m implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f60378r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f60379s = 1.0E-4f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f60380t = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f60381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f60383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f60384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g.a f60385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g.a f60386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g.a f60387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g.a f60388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private l f60390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f60391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShortBuffer f60392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f60393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f60394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f60395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f60396q;

    public m() {
        this(false);
    }

    private boolean g() {
        return Math.abs(this.f60383d - 1.0f) < 1.0E-4f && Math.abs(this.f60384e - 1.0f) < 1.0E-4f && this.f60386g.f60333a == this.f60385f.f60333a;
    }

    @Override // androidx.media3.common.audio.g
    public boolean a() {
        l lVar;
        return this.f60396q && ((lVar = this.f60390k) == null || lVar.o() == 0);
    }

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            l lVar = (l) androidx.media3.common.util.a.g(this.f60390k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f60394o += (long) iRemaining;
            lVar.x(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.g
    public void c() {
        l lVar = this.f60390k;
        if (lVar != null) {
            lVar.w();
        }
        this.f60396q = true;
    }

    @Override // androidx.media3.common.audio.g
    public ByteBuffer d() {
        int iO;
        l lVar = this.f60390k;
        if (lVar != null && (iO = lVar.o()) > 0) {
            if (this.f60391l.capacity() < iO) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iO).order(ByteOrder.nativeOrder());
                this.f60391l = byteBufferOrder;
                this.f60392m = byteBufferOrder.asShortBuffer();
            } else {
                this.f60391l.clear();
                this.f60392m.clear();
            }
            lVar.n(this.f60392m);
            this.f60395p += (long) iO;
            this.f60391l.limit(iO);
            this.f60393n = this.f60391l;
        }
        ByteBuffer byteBuffer = this.f60393n;
        this.f60393n = g.f60331a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.g
    public g.a e(g.a aVar) throws g.b {
        if (aVar.f60335c != 2) {
            throw new g.b(aVar);
        }
        int i10 = this.f60382c;
        if (i10 == -1) {
            i10 = aVar.f60333a;
        }
        this.f60385f = aVar;
        g.a aVar2 = new g.a(i10, aVar.f60334b, 2);
        this.f60386g = aVar2;
        this.f60389j = true;
        return aVar2;
    }

    @Override // androidx.media3.common.audio.g
    public long f(long j10) {
        return i(j10);
    }

    @Override // androidx.media3.common.audio.g
    public void flush() {
        if (isActive()) {
            g.a aVar = this.f60385f;
            this.f60387h = aVar;
            g.a aVar2 = this.f60386g;
            this.f60388i = aVar2;
            if (this.f60389j) {
                this.f60390k = new l(aVar.f60333a, aVar.f60334b, this.f60383d, this.f60384e, aVar2.f60333a);
            } else {
                l lVar = this.f60390k;
                if (lVar != null) {
                    lVar.j();
                }
            }
        }
        this.f60393n = g.f60331a;
        this.f60394o = 0L;
        this.f60395p = 0L;
        this.f60396q = false;
    }

    public long h(long j10) {
        if (this.f60395p < 1024) {
            return (long) (((double) this.f60383d) * j10);
        }
        long jP = this.f60394o - ((long) ((l) androidx.media3.common.util.a.g(this.f60390k)).p());
        int i10 = this.f60388i.f60333a;
        int i11 = this.f60387h.f60333a;
        return i10 == i11 ? k1.X1(j10, jP, this.f60395p) : k1.X1(j10, jP * ((long) i10), this.f60395p * ((long) i11));
    }

    public long i(long j10) {
        if (this.f60395p < 1024) {
            return (long) (j10 / ((double) this.f60383d));
        }
        long jP = this.f60394o - ((long) ((l) androidx.media3.common.util.a.g(this.f60390k)).p());
        int i10 = this.f60388i.f60333a;
        int i11 = this.f60387h.f60333a;
        return i10 == i11 ? k1.X1(j10, this.f60395p, jP) : k1.X1(j10, this.f60395p * ((long) i11), jP * ((long) i10));
    }

    @Override // androidx.media3.common.audio.g
    public boolean isActive() {
        if (this.f60386g.f60333a != -1) {
            return this.f60381b || !g();
        }
        return false;
    }

    public long j() {
        return this.f60394o - ((long) ((l) androidx.media3.common.util.a.g(this.f60390k)).p());
    }

    public void k(int i10) {
        androidx.media3.common.util.a.a(i10 == -1 || i10 > 0);
        this.f60382c = i10;
    }

    public void l(@x(from = 0.0d, fromInclusive = false) float f10) {
        int i10 = 7 >> 1;
        androidx.media3.common.util.a.a(f10 > 0.0f);
        if (this.f60384e != f10) {
            this.f60384e = f10;
            this.f60389j = true;
        }
    }

    public void m(@x(from = 0.0d, fromInclusive = false) float f10) {
        androidx.media3.common.util.a.a(f10 > 0.0f);
        if (this.f60383d != f10) {
            this.f60383d = f10;
            this.f60389j = true;
        }
    }

    @Override // androidx.media3.common.audio.g
    public void reset() {
        this.f60383d = 1.0f;
        this.f60384e = 1.0f;
        g.a aVar = g.a.f60332e;
        this.f60385f = aVar;
        this.f60386g = aVar;
        this.f60387h = aVar;
        this.f60388i = aVar;
        ByteBuffer byteBuffer = g.f60331a;
        this.f60391l = byteBuffer;
        this.f60392m = byteBuffer.asShortBuffer();
        this.f60393n = byteBuffer;
        this.f60382c = -1;
        this.f60389j = false;
        this.f60390k = null;
        this.f60394o = 0L;
        this.f60395p = 0L;
        this.f60396q = false;
    }

    m(boolean z10) {
        this.f60383d = 1.0f;
        this.f60384e = 1.0f;
        g.a aVar = g.a.f60332e;
        this.f60385f = aVar;
        this.f60386g = aVar;
        this.f60387h = aVar;
        this.f60388i = aVar;
        ByteBuffer byteBuffer = g.f60331a;
        this.f60391l = byteBuffer;
        this.f60392m = byteBuffer.asShortBuffer();
        this.f60393n = byteBuffer;
        this.f60382c = -1;
        this.f60381b = z10;
    }
}
