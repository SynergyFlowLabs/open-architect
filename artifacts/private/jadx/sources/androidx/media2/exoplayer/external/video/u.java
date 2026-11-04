package androidx.media2.exoplayer.external.video;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface u {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Handler f57918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final u f57919b;

        public a(@p0 Handler handler, @p0 u listener) {
            this.f57918a = listener != null ? (Handler) androidx.media2.exoplayer.external.util.a.g(handler) : null;
            this.f57919b = listener;
        }

        public void a(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs) {
            if (this.f57919b != null) {
                this.f57918a.post(new Runnable(this, decoderName, initializedTimestampMs, initializationDurationMs) { // from class: androidx.media2.exoplayer.external.video.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final u.a f57865a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final String f57866b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final long f57867c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final long f57868d;

                    {
                        this.f57865a = this;
                        this.f57866b = decoderName;
                        this.f57867c = initializedTimestampMs;
                        this.f57868d = initializationDurationMs;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f57865a.f(this.f57866b, this.f57867c, this.f57868d);
                    }
                });
            }
        }

        public void b(final androidx.media2.exoplayer.external.decoder.d counters) {
            counters.a();
            if (this.f57919b != null) {
                this.f57918a.post(new Runnable(this, counters) { // from class: androidx.media2.exoplayer.external.video.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final u.a f57916a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final androidx.media2.exoplayer.external.decoder.d f57917b;

                    {
                        this.f57916a = this;
                        this.f57917b = counters;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f57916a.g(this.f57917b);
                    }
                });
            }
        }

        public void c(final int droppedFrameCount, final long elapsedMs) {
            if (this.f57919b != null) {
                this.f57918a.post(new Runnable(this, droppedFrameCount, elapsedMs) { // from class: androidx.media2.exoplayer.external.video.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final u.a f57871a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f57872b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final long f57873c;

                    {
                        this.f57871a = this;
                        this.f57872b = droppedFrameCount;
                        this.f57873c = elapsedMs;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f57871a.h(this.f57872b, this.f57873c);
                    }
                });
            }
        }

        public void d(final androidx.media2.exoplayer.external.decoder.d decoderCounters) {
            if (this.f57919b != null) {
                this.f57918a.post(new Runnable(this, decoderCounters) { // from class: androidx.media2.exoplayer.external.video.n

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final u.a f57863a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final androidx.media2.exoplayer.external.decoder.d f57864b;

                    {
                        this.f57863a = this;
                        this.f57864b = decoderCounters;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f57863a.i(this.f57864b);
                    }
                });
            }
        }

        public void e(final Format format) {
            if (this.f57919b != null) {
                this.f57918a.post(new Runnable(this, format) { // from class: androidx.media2.exoplayer.external.video.p

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final u.a f57869a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final Format f57870b;

                    {
                        this.f57869a = this;
                        this.f57870b = format;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f57869a.j(this.f57870b);
                    }
                });
            }
        }

        final /* synthetic */ void f(String str, long j10, long j11) {
            this.f57919b.d(str, j10, j11);
        }

        final /* synthetic */ void g(androidx.media2.exoplayer.external.decoder.d dVar) {
            dVar.a();
            this.f57919b.J(dVar);
        }

        final /* synthetic */ void h(int i10, long j10) {
            this.f57919b.c(i10, j10);
        }

        final /* synthetic */ void i(androidx.media2.exoplayer.external.decoder.d dVar) {
            this.f57919b.L(dVar);
        }

        final /* synthetic */ void j(Format format) {
            this.f57919b.m(format);
        }

        final /* synthetic */ void k(Surface surface) {
            this.f57919b.w(surface);
        }

        final /* synthetic */ void l(int i10, int i11, int i12, float f10) {
            this.f57919b.e(i10, i11, i12, f10);
        }

        public void m(@p0 final Surface surface) {
            if (this.f57919b != null) {
                this.f57918a.post(new Runnable(this, surface) { // from class: androidx.media2.exoplayer.external.video.s

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final u.a f57879a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final Surface f57880b;

                    {
                        this.f57879a = this;
                        this.f57880b = surface;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f57879a.k(this.f57880b);
                    }
                });
            }
        }

        public void n(final int width, final int height, final int unappliedRotationDegrees, final float pixelWidthHeightRatio) {
            if (this.f57919b != null) {
                this.f57918a.post(new Runnable(this, width, height, unappliedRotationDegrees, pixelWidthHeightRatio) { // from class: androidx.media2.exoplayer.external.video.r

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final u.a f57874a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f57875b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final int f57876c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final int f57877d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private final float f57878e;

                    {
                        this.f57874a = this;
                        this.f57875b = width;
                        this.f57876c = height;
                        this.f57877d = unappliedRotationDegrees;
                        this.f57878e = pixelWidthHeightRatio;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f57874a.l(this.f57875b, this.f57876c, this.f57877d, this.f57878e);
                    }
                });
            }
        }
    }

    void J(androidx.media2.exoplayer.external.decoder.d counters);

    void L(androidx.media2.exoplayer.external.decoder.d counters);

    void c(int count, long elapsedMs);

    void d(String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void e(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio);

    void m(Format format);

    void w(@p0 Surface surface);
}
