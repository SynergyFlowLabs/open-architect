package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.m0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f53458a = Long.MIN_VALUE;

    public static final class a extends Exception {
        public a(Throwable cause) {
            super(cause);
        }

        public a(String message) {
            super(message);
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53459a;

        public b(int audioTrackState, int sampleRate, int channelConfig, int bufferSize) {
            StringBuilder sb2 = new StringBuilder(82);
            sb2.append("AudioTrack init failed: ");
            sb2.append(audioTrackState);
            sb2.append(", Config(");
            sb2.append(sampleRate);
            sb2.append(", ");
            sb2.append(channelConfig);
            sb2.append(", ");
            sb2.append(bufferSize);
            sb2.append(")");
            super(sb2.toString());
            this.f53459a = audioTrackState;
        }
    }

    public interface c {
        void a(int audioSessionId);

        void b(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs);

        void c();
    }

    public static final class d extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53460a;

        public d(int errorCode) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("AudioTrack write failed: ");
            sb2.append(errorCode);
            super(sb2.toString());
            this.f53460a = errorCode;
        }
    }

    void B();

    boolean a();

    m0 c();

    void f(float volume);

    void flush();

    void g(int audioSessionId);

    void h(v auxEffectInfo);

    void i();

    boolean j();

    void k() throws d;

    long l(boolean sourceEnded);

    void m();

    boolean n(ByteBuffer buffer, long presentationTimeUs) throws d, b;

    void o(androidx.media2.exoplayer.external.audio.c audioAttributes);

    void p(int tunnelingAudioSessionId);

    void pause();

    boolean q(int channelCount, int encoding);

    void r(int inputEncoding, int inputChannelCount, int inputSampleRate, int specifiedBufferSize, @p0 int[] outputChannels, int trimStartFrames, int trimEndFrames) throws a;

    void reset();

    void s(c listener);

    void w(m0 playbackParameters);
}
