package androidx.media2.exoplayer.external.video.spherical;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.i;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import androidx.media3.exoplayer.audio.s0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b extends androidx.media2.exoplayer.external.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f57881s = 100000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f57882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.decoder.e f57883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x f57884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f57885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private a f57886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f57887o;

    public b() {
        super(5);
        this.f57882j = new d0();
        this.f57883k = new androidx.media2.exoplayer.external.decoder.e(1);
        this.f57884l = new x();
    }

    @p0
    private float[] K(ByteBuffer data) {
        if (data.remaining() != 16) {
            return null;
        }
        this.f57884l.O(data.array(), data.limit());
        this.f57884l.Q(data.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f57884l.o());
        }
        return fArr;
    }

    private void L() {
        this.f57887o = 0L;
        a aVar = this.f57886n;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void C(long positionUs, boolean joining) throws i {
        L();
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void G(Format[] formats, long offsetUs) throws i {
        this.f57885m = offsetUs;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        return q();
    }

    @Override // androidx.media2.exoplayer.external.u0
    public int b(Format format) {
        return "application/x-camera-motion".equals(format.f53103i) ? 4 : 0;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void g(long positionUs, long elapsedRealtimeUs) throws i {
        float[] fArrK;
        while (!q() && this.f57887o < s0.f63372z + positionUs) {
            this.f57883k.o();
            if (H(this.f57882j, this.f57883k, false) != -4 || this.f57883k.t()) {
                return;
            }
            this.f57883k.D();
            androidx.media2.exoplayer.external.decoder.e eVar = this.f57883k;
            this.f57887o = eVar.f53790d;
            if (this.f57886n != null && (fArrK = K((ByteBuffer) q0.i(eVar.f53789c))) != null) {
                ((a) q0.i(this.f57886n)).b(this.f57887o - this.f57885m, fArrK);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.b, androidx.media2.exoplayer.external.q0.b
    public void i(int messageType, @p0 Object message) throws i {
        if (messageType == 7) {
            this.f57886n = (a) message;
        } else {
            super.i(messageType, message);
        }
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void o() {
        L();
    }
}
