package androidx.media3.decoder;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class l extends h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f62728s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f62729t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f62730v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f62731w = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public ByteBuffer f62734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public w f62737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    public ByteBuffer[] f62738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    public int[] f62739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    public ByteBuffer f62741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final h.a<l> f62742o;

    public l(h.a<l> aVar) {
        this.f62742o = aVar;
    }

    private static boolean L(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        return i11 <= 0 || i10 < Integer.MAX_VALUE / i11;
    }

    @Override // androidx.media3.decoder.h
    public void D() {
        this.f62742o.a(this);
    }

    public void E(long j10, int i10, @p0 ByteBuffer byteBuffer) {
        this.f62708b = j10;
        this.f62733f = i10;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f62741n = null;
            return;
        }
        c(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f62741n;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f62741n = ByteBuffer.allocate(iLimit);
        } else {
            this.f62741n.clear();
        }
        this.f62741n.put(byteBuffer);
        this.f62741n.flip();
        byteBuffer.position(0);
    }

    public void H(int i10, int i11) {
        this.f62735h = i10;
        this.f62736i = i11;
    }

    public boolean I(int i10, int i11, int i12, int i13, int i14) {
        this.f62735h = i10;
        this.f62736i = i11;
        this.f62740m = i14;
        int i15 = (int) ((((long) i11) + 1) / 2);
        if (L(i12, i11) && L(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (L(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.f62734g;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.f62734g = ByteBuffer.allocateDirect(i18);
                } else {
                    this.f62734g.position(0);
                    this.f62734g.limit(i18);
                }
                if (this.f62738k == null) {
                    this.f62738k = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f62734g;
                ByteBuffer[] byteBufferArr = this.f62738k;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i16);
                byteBuffer2.position(i16);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i17);
                byteBuffer2.position(i16 + i17);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i17);
                if (this.f62739l == null) {
                    this.f62739l = new int[3];
                }
                int[] iArr = this.f62739l;
                iArr[0] = i12;
                iArr[1] = i13;
                iArr[2] = i13;
                return true;
            }
        }
        return false;
    }
}
