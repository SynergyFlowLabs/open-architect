package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.w;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.audio.s0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b extends androidx.media3.exoplayer.i {
    private static final String Z = "CameraMotionRenderer";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f66458p0 = 100000;

    @p0
    private a X;
    private long Y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final androidx.media3.decoder.g f66459v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final o0 f66460w;

    public b() {
        super(6);
        this.f66459v = new androidx.media3.decoder.g(1);
        this.f66460w = new o0();
    }

    @p0
    private float[] s0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f66460w.Y(byteBuffer.array(), byteBuffer.limit());
        this.f66460w.a0(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f66460w.w());
        }
        return fArr;
    }

    private void t0() {
        a aVar = this.X;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return q();
    }

    @Override // androidx.media3.exoplayer.a5
    public int b(w wVar) {
        return "application/x-camera-motion".equals(wVar.f61761o) ? a5.M(4) : a5.M(0);
    }

    @Override // androidx.media3.exoplayer.i
    protected void e0() {
        t0();
    }

    @Override // androidx.media3.exoplayer.z4
    public void g(long j10, long j11) {
        while (!q() && this.Y < s0.f63372z + j10) {
            this.f66459v.o();
            boolean z10 = false;
            if (p0(W(), this.f66459v, 0) != -4 || this.f66459v.s()) {
                return;
            }
            long j12 = this.f66459v.f62702f;
            this.Y = j12;
            boolean z11 = j12 < Y();
            if (this.X != null && !z11) {
                this.f66459v.H();
                float[] fArrS0 = s0((ByteBuffer) k1.o(this.f66459v.f62700d));
                if (fArrS0 != null) {
                    ((a) k1.o(this.X)).b(this.Y - b0(), fArrS0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public String getName() {
        return Z;
    }

    @Override // androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) {
        this.Y = Long.MIN_VALUE;
        t0();
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.w4.b
    public void i(int i10, @p0 Object obj) throws androidx.media3.exoplayer.s0 {
        if (i10 == 8) {
            this.X = (a) obj;
        } else {
            super.i(i10, obj);
        }
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        return true;
    }
}
