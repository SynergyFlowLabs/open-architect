package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f63915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f63918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f63919l;

    private void b(long j10, int i10) {
        this.f63918k += j10;
        this.f63919l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public void d(j jVar) {
        this.f63908a += jVar.f63908a;
        this.f63909b += jVar.f63909b;
        this.f63910c += jVar.f63910c;
        this.f63911d += jVar.f63911d;
        this.f63912e += jVar.f63912e;
        this.f63913f += jVar.f63913f;
        this.f63914g += jVar.f63914g;
        this.f63915h += jVar.f63915h;
        this.f63916i = Math.max(this.f63916i, jVar.f63916i);
        this.f63917j += jVar.f63917j;
        b(jVar.f63918k, jVar.f63919l);
    }

    public String toString() {
        return androidx.media3.common.util.k1.S("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f63908a), Integer.valueOf(this.f63909b), Integer.valueOf(this.f63910c), Integer.valueOf(this.f63911d), Integer.valueOf(this.f63912e), Integer.valueOf(this.f63913f), Integer.valueOf(this.f63914g), Integer.valueOf(this.f63915h), Integer.valueOf(this.f63916i), Integer.valueOf(this.f63917j), Long.valueOf(this.f63918k), Integer.valueOf(this.f63919l));
    }
}
