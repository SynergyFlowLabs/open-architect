package androidx.media2.exoplayer.external.video;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class h extends androidx.media2.exoplayer.external.decoder.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57822n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57823o = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f57824s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f57825t = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public ByteBuffer f57828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f57830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    public ColorInfo f57831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public ByteBuffer[] f57832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    public int[] f57833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f57834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    public ByteBuffer f57835m;

    private static boolean H(int a10, int b10) {
        if (a10 < 0 || b10 < 0) {
            return false;
        }
        return b10 <= 0 || a10 < Integer.MAX_VALUE / b10;
    }

    public void D(int width, int height) {
        this.f57829g = width;
        this.f57830h = height;
    }

    public boolean E(int width, int height, int yStride, int uvStride, int colorspace) {
        this.f57829g = width;
        this.f57830h = height;
        this.f57834l = colorspace;
        int i10 = (int) ((((long) height) + 1) / 2);
        if (H(yStride, height) && H(uvStride, i10)) {
            int i11 = height * yStride;
            int i12 = i10 * uvStride;
            int i13 = (i12 * 2) + i11;
            if (H(i12, 2) && i13 >= i11) {
                ByteBuffer byteBuffer = this.f57828f;
                if (byteBuffer == null || byteBuffer.capacity() < i13) {
                    this.f57828f = ByteBuffer.allocateDirect(i13);
                } else {
                    this.f57828f.position(0);
                    this.f57828f.limit(i13);
                }
                if (this.f57832j == null) {
                    this.f57832j = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f57828f;
                ByteBuffer[] byteBufferArr = this.f57832j;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i11);
                byteBuffer2.position(i11);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i12);
                byteBuffer2.position(i11 + i12);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i12);
                if (this.f57833k == null) {
                    this.f57833k = new int[3];
                }
                int[] iArr = this.f57833k;
                iArr[0] = yStride;
                iArr[1] = uvStride;
                iArr[2] = uvStride;
                return true;
            }
        }
        return false;
    }

    public void z(long timeUs, int mode, @p0 ByteBuffer supplementalData) {
        this.f53793b = timeUs;
        this.f57827e = mode;
        if (supplementalData != null) {
            c(268435456);
            int iLimit = supplementalData.limit();
            ByteBuffer byteBuffer = this.f57835m;
            if (byteBuffer == null || byteBuffer.capacity() < iLimit) {
                this.f57835m = ByteBuffer.allocate(iLimit);
            }
            this.f57835m.position(0);
            this.f57835m.put(supplementalData);
            this.f57835m.flip();
            supplementalData.position(0);
        }
    }
}
