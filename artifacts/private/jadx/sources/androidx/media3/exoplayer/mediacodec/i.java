package androidx.media3.exoplayer.mediacodec;

import androidx.annotation.l1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class i extends androidx.media3.decoder.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f64107s = 32;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    static final int f64108t = 3072000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f64109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f64110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f64111o;

    public i() {
        super(2);
        this.f64111o = 32;
    }

    private boolean O(androidx.media3.decoder.g gVar) {
        ByteBuffer byteBuffer;
        if (!U()) {
            return true;
        }
        if (this.f64110n >= this.f64111o) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f62700d;
        return byteBuffer2 == null || (byteBuffer = this.f62700d) == null || byteBuffer.position() + byteBuffer2.remaining() <= f64108t;
    }

    public boolean N(androidx.media3.decoder.g gVar) {
        androidx.media3.common.util.a.a(!gVar.I());
        androidx.media3.common.util.a.a(!gVar.r());
        androidx.media3.common.util.a.a(!gVar.s());
        if (!O(gVar)) {
            return false;
        }
        int i10 = this.f64110n;
        this.f64110n = i10 + 1;
        if (i10 == 0) {
            this.f62702f = gVar.f62702f;
            if (gVar.v()) {
                z(1);
            }
        }
        ByteBuffer byteBuffer = gVar.f62700d;
        if (byteBuffer != null) {
            E(byteBuffer.remaining());
            this.f62700d.put(byteBuffer);
        }
        this.f64109m = gVar.f62702f;
        return true;
    }

    public long R() {
        return this.f62702f;
    }

    public long S() {
        return this.f64109m;
    }

    public int T() {
        return this.f64110n;
    }

    public boolean U() {
        return this.f64110n > 0;
    }

    public void V(@androidx.annotation.g0(from = 1) int i10) {
        androidx.media3.common.util.a.a(i10 > 0);
        this.f64111o = i10;
    }

    @Override // androidx.media3.decoder.g, androidx.media3.decoder.a
    public void o() {
        super.o();
        this.f64110n = 0;
    }
}
