package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d0 extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f53287q = 150000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f53288r = 20000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final short f53289s = 1024;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f53290t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f53291u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f53292v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f53293w = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f53296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f53297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f53302p;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface a {
    }

    public d0() {
        byte[] bArr = q0.f57631f;
        this.f53296j = bArr;
        this.f53297k = bArr;
    }

    private int o(long durationUs) {
        return (int) ((durationUs * ((long) this.f53510b)) / 1000000);
    }

    private int p(ByteBuffer buffer) {
        for (int iLimit = buffer.limit() - 1; iLimit >= buffer.position(); iLimit -= 2) {
            if (Math.abs((int) buffer.get(iLimit)) > 4) {
                int i10 = this.f53294h;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return buffer.position();
    }

    private int q(ByteBuffer buffer) {
        for (int iPosition = buffer.position() + 1; iPosition < buffer.limit(); iPosition += 2) {
            if (Math.abs((int) buffer.get(iPosition)) > 4) {
                int i10 = this.f53294h;
                return i10 * (iPosition / i10);
            }
        }
        return buffer.limit();
    }

    private void s(ByteBuffer data) {
        int iRemaining = data.remaining();
        m(iRemaining).put(data).flip();
        if (iRemaining > 0) {
            this.f53301o = true;
        }
    }

    private void t(byte[] data, int length) {
        m(length).put(data, 0, length).flip();
        if (length > 0) {
            this.f53301o = true;
        }
    }

    private void u(ByteBuffer inputBuffer) {
        int iLimit = inputBuffer.limit();
        int iQ = q(inputBuffer);
        int iPosition = iQ - inputBuffer.position();
        byte[] bArr = this.f53296j;
        int length = bArr.length;
        int i10 = this.f53299m;
        int i11 = length - i10;
        int i12 = 5 | 0;
        if (iQ < iLimit && iPosition < i11) {
            t(bArr, i10);
            this.f53299m = 0;
            this.f53298l = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        inputBuffer.limit(inputBuffer.position() + iMin);
        inputBuffer.get(this.f53296j, this.f53299m, iMin);
        int i13 = this.f53299m + iMin;
        this.f53299m = i13;
        byte[] bArr2 = this.f53296j;
        if (i13 == bArr2.length) {
            if (this.f53301o) {
                t(bArr2, this.f53300n);
                this.f53302p += (long) ((this.f53299m - (this.f53300n * 2)) / this.f53294h);
            } else {
                this.f53302p += (long) ((i13 - this.f53300n) / this.f53294h);
            }
            y(inputBuffer, this.f53296j, this.f53299m);
            this.f53299m = 0;
            this.f53298l = 2;
        }
        inputBuffer.limit(iLimit);
    }

    private void v(ByteBuffer inputBuffer) {
        int iLimit = inputBuffer.limit();
        inputBuffer.limit(Math.min(iLimit, inputBuffer.position() + this.f53296j.length));
        int iP = p(inputBuffer);
        if (iP == inputBuffer.position()) {
            this.f53298l = 1;
        } else {
            inputBuffer.limit(iP);
            s(inputBuffer);
        }
        inputBuffer.limit(iLimit);
    }

    private void w(ByteBuffer inputBuffer) {
        int iLimit = inputBuffer.limit();
        int iQ = q(inputBuffer);
        inputBuffer.limit(iQ);
        this.f53302p += (long) (inputBuffer.remaining() / this.f53294h);
        y(inputBuffer, this.f53297k, this.f53300n);
        if (iQ < iLimit) {
            t(this.f53297k, this.f53300n);
            this.f53298l = 0;
            inputBuffer.limit(iLimit);
        }
    }

    private void y(ByteBuffer input, byte[] buffer, int size) {
        int iMin = Math.min(input.remaining(), this.f53300n);
        int i10 = this.f53300n - iMin;
        System.arraycopy(buffer, size - i10, this.f53297k, 0, i10);
        input.position(input.limit() - iMin);
        input.get(this.f53297k, i10, iMin);
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void b(ByteBuffer inputBuffer) {
        while (inputBuffer.hasRemaining() && !i()) {
            int i10 = this.f53298l;
            if (i10 == 0) {
                v(inputBuffer);
            } else if (i10 == 1) {
                u(inputBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                w(inputBuffer);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean h(int sampleRateHz, int channelCount, int encoding) throws j.a {
        if (encoding != 2) {
            throw new j.a(sampleRateHz, channelCount, encoding);
        }
        this.f53294h = channelCount * 2;
        return n(sampleRateHz, channelCount, encoding);
    }

    @Override // androidx.media2.exoplayer.external.audio.w, androidx.media2.exoplayer.external.audio.j
    public boolean isActive() {
        return super.isActive() && this.f53295i;
    }

    @Override // androidx.media2.exoplayer.external.audio.w
    protected void j() {
        if (isActive()) {
            int iO = o(f53287q) * this.f53294h;
            if (this.f53296j.length != iO) {
                this.f53296j = new byte[iO];
            }
            int iO2 = o(20000L) * this.f53294h;
            this.f53300n = iO2;
            if (this.f53297k.length != iO2) {
                this.f53297k = new byte[iO2];
            }
        }
        this.f53298l = 0;
        this.f53302p = 0L;
        this.f53299m = 0;
        this.f53301o = false;
    }

    @Override // androidx.media2.exoplayer.external.audio.w
    protected void k() {
        int i10 = this.f53299m;
        if (i10 > 0) {
            t(this.f53296j, i10);
        }
        if (!this.f53301o) {
            this.f53302p += (long) (this.f53300n / this.f53294h);
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.w
    protected void l() {
        this.f53295i = false;
        this.f53300n = 0;
        byte[] bArr = q0.f57631f;
        this.f53296j = bArr;
        this.f53297k = bArr;
    }

    public long r() {
        return this.f53302p;
    }

    public void x(boolean enabled) {
        this.f53295i = enabled;
        flush();
    }
}
