package androidx.media2.exoplayer.external.audio;

import android.os.Handler;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Handler f53456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final r f53457b;

        public a(@p0 Handler handler, @p0 r listener) {
            this.f53456a = listener != null ? (Handler) androidx.media2.exoplayer.external.util.a.g(handler) : null;
            this.f53457b = listener;
        }

        public void a(final int audioSessionId) {
            if (this.f53457b != null) {
                this.f53456a.post(new Runnable(this, audioSessionId) { // from class: androidx.media2.exoplayer.external.audio.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final r.a f53454a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f53455b;

                    {
                        this.f53454a = this;
                        this.f53455b = audioSessionId;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f53454a.g(this.f53455b);
                    }
                });
            }
        }

        public void b(final int bufferSize, final long bufferSizeMs, final long elapsedSinceLastFeedMs) {
            if (this.f53457b != null) {
                this.f53456a.post(new Runnable(this, bufferSize, bufferSizeMs, elapsedSinceLastFeedMs) { // from class: androidx.media2.exoplayer.external.audio.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final r.a f53448a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final int f53449b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final long f53450c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final long f53451d;

                    {
                        this.f53448a = this;
                        this.f53449b = bufferSize;
                        this.f53450c = bufferSizeMs;
                        this.f53451d = elapsedSinceLastFeedMs;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f53448a.h(this.f53449b, this.f53450c, this.f53451d);
                    }
                });
            }
        }

        public void c(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs) {
            if (this.f53457b != null) {
                this.f53456a.post(new Runnable(this, decoderName, initializedTimestampMs, initializationDurationMs) { // from class: androidx.media2.exoplayer.external.audio.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final r.a f53442a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final String f53443b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private final long f53444c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private final long f53445d;

                    {
                        this.f53442a = this;
                        this.f53443b = decoderName;
                        this.f53444c = initializedTimestampMs;
                        this.f53445d = initializationDurationMs;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f53442a.i(this.f53443b, this.f53444c, this.f53445d);
                    }
                });
            }
        }

        public void d(final androidx.media2.exoplayer.external.decoder.d counters) {
            counters.a();
            if (this.f53457b != null) {
                this.f53456a.post(new Runnable(this, counters) { // from class: androidx.media2.exoplayer.external.audio.p

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final r.a f53452a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final androidx.media2.exoplayer.external.decoder.d f53453b;

                    {
                        this.f53452a = this;
                        this.f53453b = counters;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f53452a.j(this.f53453b);
                    }
                });
            }
        }

        public void e(final androidx.media2.exoplayer.external.decoder.d decoderCounters) {
            if (this.f53457b != null) {
                this.f53456a.post(new Runnable(this, decoderCounters) { // from class: androidx.media2.exoplayer.external.audio.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final r.a f53440a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final androidx.media2.exoplayer.external.decoder.d f53441b;

                    {
                        this.f53440a = this;
                        this.f53441b = decoderCounters;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f53440a.k(this.f53441b);
                    }
                });
            }
        }

        public void f(final Format format) {
            if (this.f53457b != null) {
                this.f53456a.post(new Runnable(this, format) { // from class: androidx.media2.exoplayer.external.audio.n

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final r.a f53446a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final Format f53447b;

                    {
                        this.f53446a = this;
                        this.f53447b = format;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f53446a.l(this.f53447b);
                    }
                });
            }
        }

        final /* synthetic */ void g(int i10) {
            this.f53457b.a(i10);
        }

        final /* synthetic */ void h(int i10, long j10, long j11) {
            this.f53457b.I(i10, j10, j11);
        }

        final /* synthetic */ void i(String str, long j10, long j11) {
            this.f53457b.b(str, j10, j11);
        }

        final /* synthetic */ void j(androidx.media2.exoplayer.external.decoder.d dVar) {
            dVar.a();
            this.f53457b.Q(dVar);
        }

        final /* synthetic */ void k(androidx.media2.exoplayer.external.decoder.d dVar) {
            this.f53457b.o(dVar);
        }

        final /* synthetic */ void l(Format format) {
            this.f53457b.q(format);
        }
    }

    void I(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs);

    void Q(androidx.media2.exoplayer.external.decoder.d counters);

    void a(int audioSessionId);

    void b(String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void o(androidx.media2.exoplayer.external.decoder.d counters);

    void q(Format format);
}
