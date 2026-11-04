package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class g0 implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f53385p = 8.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f53386q = 0.1f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f53387r = 8.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f53388s = 0.1f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53389t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f53390u = 0.01f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f53391v = 1024;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private f0 f53399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ByteBuffer f53400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ShortBuffer f53401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f53402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f53403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f53404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53405o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f53394d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f53395e = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53392b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53393c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53396f = -1;

    public g0() {
        ByteBuffer byteBuffer = j.f53430a;
        this.f53400j = byteBuffer;
        this.f53401k = byteBuffer.asShortBuffer();
        this.f53402l = byteBuffer;
        this.f53397g = -1;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean a() {
        if (!this.f53405o) {
            return false;
        }
        f0 f0Var = this.f53399i;
        return f0Var == null || f0Var.k() == 0;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void b(ByteBuffer inputBuffer) {
        f0 f0Var = (f0) androidx.media2.exoplayer.external.util.a.g(this.f53399i);
        if (inputBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = inputBuffer.asShortBuffer();
            int iRemaining = inputBuffer.remaining();
            this.f53403m += (long) iRemaining;
            f0Var.s(shortBufferAsShortBuffer);
            inputBuffer.position(inputBuffer.position() + iRemaining);
        }
        int iK = f0Var.k();
        if (iK > 0) {
            if (this.f53400j.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f53400j = byteBufferOrder;
                this.f53401k = byteBufferOrder.asShortBuffer();
            } else {
                this.f53400j.clear();
                this.f53401k.clear();
            }
            f0Var.j(this.f53401k);
            this.f53404n += (long) iK;
            this.f53400j.limit(iK);
            this.f53402l = this.f53400j;
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void c() {
        f0 f0Var = this.f53399i;
        if (f0Var != null) {
            f0Var.r();
        }
        this.f53405o = true;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f53402l;
        this.f53402l = j.f53430a;
        return byteBuffer;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public int e() {
        return this.f53392b;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public int f() {
        return this.f53396f;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void flush() {
        if (isActive()) {
            if (this.f53398h) {
                this.f53399i = new f0(this.f53393c, this.f53392b, this.f53394d, this.f53395e, this.f53396f);
            } else {
                f0 f0Var = this.f53399i;
                if (f0Var != null) {
                    f0Var.i();
                }
            }
        }
        this.f53402l = j.f53430a;
        this.f53403m = 0L;
        this.f53404n = 0L;
        this.f53405o = false;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public int g() {
        return 2;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean h(int sampleRateHz, int channelCount, int encoding) throws j.a {
        if (encoding != 2) {
            throw new j.a(sampleRateHz, channelCount, encoding);
        }
        int i10 = this.f53397g;
        if (i10 == -1) {
            i10 = sampleRateHz;
        }
        if (this.f53393c == sampleRateHz && this.f53392b == channelCount && this.f53396f == i10) {
            return false;
        }
        this.f53393c = sampleRateHz;
        this.f53392b = channelCount;
        this.f53396f = i10;
        this.f53398h = true;
        return true;
    }

    public long i(long duration) {
        long j10 = this.f53404n;
        if (j10 < 1024) {
            return (long) (((double) this.f53394d) * duration);
        }
        int i10 = this.f53396f;
        int i11 = this.f53393c;
        return i10 == i11 ? q0.I0(duration, this.f53403m, j10) : q0.I0(duration, this.f53403m * ((long) i10), j10 * ((long) i11));
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean isActive() {
        return this.f53393c != -1 && (Math.abs(this.f53394d - 1.0f) >= 0.01f || Math.abs(this.f53395e - 1.0f) >= 0.01f || this.f53396f != this.f53393c);
    }

    public void j(int sampleRateHz) {
        this.f53397g = sampleRateHz;
    }

    public float k(float pitch) {
        float fQ = q0.q(pitch, 0.1f, 8.0f);
        if (this.f53395e != fQ) {
            this.f53395e = fQ;
            this.f53398h = true;
        }
        flush();
        return fQ;
    }

    public float l(float speed) {
        float fQ = q0.q(speed, 0.1f, 8.0f);
        if (this.f53394d != fQ) {
            this.f53394d = fQ;
            this.f53398h = true;
        }
        flush();
        return fQ;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void reset() {
        this.f53394d = 1.0f;
        this.f53395e = 1.0f;
        this.f53392b = -1;
        this.f53393c = -1;
        this.f53396f = -1;
        ByteBuffer byteBuffer = j.f53430a;
        this.f53400j = byteBuffer;
        this.f53401k = byteBuffer.asShortBuffer();
        this.f53402l = byteBuffer;
        this.f53397g = -1;
        this.f53398h = false;
        this.f53399i = null;
        this.f53403m = 0L;
        this.f53404n = 0L;
        this.f53405o = false;
    }
}
