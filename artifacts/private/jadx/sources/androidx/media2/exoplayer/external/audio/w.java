package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class w implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f53510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f53511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f53512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f53513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f53514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53515g;

    public w() {
        ByteBuffer byteBuffer = j.f53430a;
        this.f53513e = byteBuffer;
        this.f53514f = byteBuffer;
        this.f53511c = -1;
        this.f53510b = -1;
        this.f53512d = -1;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    @androidx.annotation.i
    public boolean a() {
        return this.f53515g && this.f53514f == j.f53430a;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public final void c() {
        this.f53515g = true;
        k();
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    @androidx.annotation.i
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f53514f;
        this.f53514f = j.f53430a;
        return byteBuffer;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public int e() {
        return this.f53511c;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public int f() {
        return this.f53510b;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public final void flush() {
        this.f53514f = j.f53430a;
        this.f53515g = false;
        j();
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public int g() {
        return this.f53512d;
    }

    protected final boolean i() {
        return this.f53514f.hasRemaining();
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean isActive() {
        if (this.f53510b == -1) {
            return false;
        }
        int i10 = 6 ^ 1;
        return true;
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l() {
    }

    protected final ByteBuffer m(int count) {
        if (this.f53513e.capacity() < count) {
            this.f53513e = ByteBuffer.allocateDirect(count).order(ByteOrder.nativeOrder());
        } else {
            this.f53513e.clear();
        }
        ByteBuffer byteBuffer = this.f53513e;
        this.f53514f = byteBuffer;
        return byteBuffer;
    }

    protected final boolean n(int sampleRateHz, int channelCount, int encoding) {
        if (sampleRateHz == this.f53510b && channelCount == this.f53511c && encoding == this.f53512d) {
            return false;
        }
        this.f53510b = sampleRateHz;
        this.f53511c = channelCount;
        this.f53512d = encoding;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public final void reset() {
        flush();
        this.f53513e = j.f53430a;
        this.f53510b = -1;
        this.f53511c = -1;
        this.f53512d = -1;
        l();
    }
}
