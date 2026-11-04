package androidx.media2.exoplayer.external.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class y implements s {
    private static final long T = 250000;
    private static final long U = 750000;
    private static final long V = 250000;
    private static final int W = 4;
    private static final int X = 2;
    private static final int Y = -2;
    private static final int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f53519a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f53520b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @e.a({"InlinedApi"})
    private static final int f53521c0 = 1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f53522d0 = "AudioTrack";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f53523e0 = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f53524f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f53525g0 = 2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static boolean f53526h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static boolean f53527i0;
    private long A;
    private int B;
    private int C;
    private long D;
    private float E;
    private j[] F;
    private ByteBuffer[] G;

    @p0
    private ByteBuffer H;

    @p0
    private ByteBuffer I;
    private byte[] J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private v Q;
    private boolean R;
    private long S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final androidx.media2.exoplayer.external.audio.d f53528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f53529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f53530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f53531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i0 f53532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j[] f53533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j[] f53534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConditionVariable f53535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f53536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayDeque<g> f53537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private s.c f53538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private AudioTrack f53539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private d f53540n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f53541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AudioTrack f53542p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.media2.exoplayer.external.audio.c f53543q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private m0 f53544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private m0 f53545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f53546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f53547u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private ByteBuffer f53548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f53549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f53550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f53551y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f53552z;

    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioTrack f53553a;

        a(final AudioTrack val$toRelease) {
            this.f53553a = val$toRelease;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f53553a.flush();
                this.f53553a.release();
            } finally {
                y.this.f53535i.open();
            }
        }
    }

    class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioTrack f53555a;

        b(final y this$0, final AudioTrack val$toRelease) {
            this.f53555a = val$toRelease;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f53555a.release();
        }
    }

    public interface c {
        j[] a();

        long b();

        long c(long playoutDuration);

        m0 d(m0 playbackParameters);
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f53556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f53559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f53560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f53561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f53562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f53563h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f53564i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f53565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final j[] f53566k;

        public d(boolean isInputPcm, int inputPcmFrameSize, int inputSampleRate, int outputPcmFrameSize, int outputSampleRate, int outputChannelConfig, int outputEncoding, int specifiedBufferSize, boolean processingEnabled, boolean canApplyPlaybackParameters, j[] availableAudioProcessors) {
            this.f53556a = isInputPcm;
            this.f53557b = inputPcmFrameSize;
            this.f53558c = inputSampleRate;
            this.f53559d = outputPcmFrameSize;
            this.f53560e = outputSampleRate;
            this.f53561f = outputChannelConfig;
            this.f53562g = outputEncoding;
            this.f53563h = specifiedBufferSize == 0 ? f() : specifiedBufferSize;
            this.f53564i = processingEnabled;
            this.f53565j = canApplyPlaybackParameters;
            this.f53566k = availableAudioProcessors;
        }

        @e.b(21)
        private AudioTrack c(boolean tunneling, androidx.media2.exoplayer.external.audio.c audioAttributes, int audioSessionId) {
            AudioAttributes audioAttributesBuild = tunneling ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : audioAttributes.a();
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.f53561f).setEncoding(this.f53562g).setSampleRate(this.f53560e).build();
            int i10 = this.f53563h;
            if (audioSessionId == 0) {
                audioSessionId = 0;
            }
            return new AudioTrack(audioAttributesBuild, audioFormatBuild, i10, 1, audioSessionId);
        }

        private int f() {
            if (this.f53556a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.f53560e, this.f53561f, this.f53562g);
                androidx.media2.exoplayer.external.util.a.i(minBufferSize != -2);
                return q0.r(minBufferSize * 4, ((int) d(250000L)) * this.f53559d, (int) Math.max(minBufferSize, d(y.U) * ((long) this.f53559d)));
            }
            int iF = y.F(this.f53562g);
            if (this.f53562g == 5) {
                iF *= 2;
            }
            return (int) ((((long) iF) * 250000) / 1000000);
        }

        public AudioTrack a(boolean tunneling, androidx.media2.exoplayer.external.audio.c audioAttributes, int audioSessionId) throws s.b {
            AudioTrack audioTrack;
            if (q0.f57626a >= 21) {
                audioTrack = c(tunneling, audioAttributes, audioSessionId);
            } else {
                int iA0 = q0.a0(audioAttributes.f53276c);
                audioTrack = audioSessionId == 0 ? new AudioTrack(iA0, this.f53560e, this.f53561f, this.f53562g, this.f53563h, 1) : new AudioTrack(iA0, this.f53560e, this.f53561f, this.f53562g, this.f53563h, 1, audioSessionId);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new s.b(state, this.f53560e, this.f53561f, this.f53563h);
        }

        public boolean b(d audioTrackConfiguration) {
            return audioTrackConfiguration.f53562g == this.f53562g && audioTrackConfiguration.f53560e == this.f53560e && audioTrackConfiguration.f53561f == this.f53561f;
        }

        public long d(long durationUs) {
            return (durationUs * ((long) this.f53560e)) / 1000000;
        }

        public long e(long frameCount) {
            return (frameCount * 1000000) / ((long) this.f53560e);
        }

        public long g(long frameCount) {
            return (frameCount * 1000000) / ((long) this.f53558c);
        }
    }

    public static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j[] f53567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0 f53568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0 f53569c;

        public e(j... audioProcessors) {
            j[] jVarArr = new j[audioProcessors.length + 2];
            this.f53567a = jVarArr;
            System.arraycopy(audioProcessors, 0, jVarArr, 0, audioProcessors.length);
            d0 d0Var = new d0();
            this.f53568b = d0Var;
            g0 g0Var = new g0();
            this.f53569c = g0Var;
            jVarArr[audioProcessors.length] = d0Var;
            jVarArr[audioProcessors.length + 1] = g0Var;
        }

        @Override // androidx.media2.exoplayer.external.audio.y.c
        public j[] a() {
            return this.f53567a;
        }

        @Override // androidx.media2.exoplayer.external.audio.y.c
        public long b() {
            return this.f53568b.r();
        }

        @Override // androidx.media2.exoplayer.external.audio.y.c
        public long c(long playoutDuration) {
            return this.f53569c.i(playoutDuration);
        }

        @Override // androidx.media2.exoplayer.external.audio.y.c
        public m0 d(m0 playbackParameters) {
            this.f53568b.x(playbackParameters.f55315c);
            return new m0(this.f53569c.l(playbackParameters.f55313a), this.f53569c.k(playbackParameters.f55314b), playbackParameters.f55315c);
        }
    }

    public static final class f extends RuntimeException {
        /* synthetic */ f(String str, a aVar) {
            this(str);
        }

        private f(String message) {
            super(message);
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m0 f53570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f53571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f53572c;

        /* synthetic */ g(m0 m0Var, long j10, long j11, a aVar) {
            this(m0Var, j10, j11);
        }

        private g(m0 playbackParameters, long mediaTimeUs, long positionUs) {
            this.f53570a = playbackParameters;
            this.f53571b = mediaTimeUs;
            this.f53572c = positionUs;
        }
    }

    private final class h implements u.a {
        private h() {
        }

        @Override // androidx.media2.exoplayer.external.audio.u.a
        public void b(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs) {
            long jG = y.this.G();
            long jH = y.this.H();
            StringBuilder sb2 = new StringBuilder(182);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(audioTimestampPositionFrames);
            sb2.append(", ");
            sb2.append(audioTimestampSystemTimeUs);
            sb2.append(", ");
            sb2.append(systemTimeUs);
            sb2.append(", ");
            sb2.append(playbackPositionUs);
            sb2.append(", ");
            sb2.append(jG);
            sb2.append(", ");
            sb2.append(jH);
            String string = sb2.toString();
            if (y.f53527i0) {
                throw new f(string, null);
            }
            androidx.media2.exoplayer.external.util.p.l(y.f53522d0, string);
        }

        @Override // androidx.media2.exoplayer.external.audio.u.a
        public void c(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs) {
            long jG = y.this.G();
            long jH = y.this.H();
            StringBuilder sb2 = new StringBuilder(180);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(audioTimestampPositionFrames);
            sb2.append(", ");
            sb2.append(audioTimestampSystemTimeUs);
            sb2.append(", ");
            sb2.append(systemTimeUs);
            sb2.append(", ");
            sb2.append(playbackPositionUs);
            sb2.append(", ");
            sb2.append(jG);
            sb2.append(", ");
            sb2.append(jH);
            String string = sb2.toString();
            if (y.f53527i0) {
                throw new f(string, null);
            }
            androidx.media2.exoplayer.external.util.p.l(y.f53522d0, string);
        }

        @Override // androidx.media2.exoplayer.external.audio.u.a
        public void d(int bufferSize, long bufferSizeMs) {
            if (y.this.f53538l != null) {
                y.this.f53538l.b(bufferSize, bufferSizeMs, SystemClock.elapsedRealtime() - y.this.S);
            }
        }

        @Override // androidx.media2.exoplayer.external.audio.u.a
        public void e(long latencyUs) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(latencyUs);
            androidx.media2.exoplayer.external.util.p.l(y.f53522d0, sb2.toString());
        }

        /* synthetic */ h(y yVar, a aVar) {
            this();
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface i {
    }

    public y(@p0 androidx.media2.exoplayer.external.audio.d audioCapabilities, j[] audioProcessors) {
        this(audioCapabilities, audioProcessors, false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003e -> B:9:0x0018). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean A() throws androidx.media2.exoplayer.external.audio.s.d {
        /*
            r10 = this;
            java.lang.String r9 = "Androeed.ru"
            int r0 = r10.L
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L1b
            androidx.media2.exoplayer.external.audio.y$d r0 = r10.f53541o
            boolean r0 = r0.f53564i
            r9 = 1
            if (r0 == 0) goto L12
            r0 = r2
            goto L15
        L12:
            androidx.media2.exoplayer.external.audio.j[] r0 = r10.F
            int r0 = r0.length
        L15:
            r9 = 3
            r10.L = r0
        L18:
            r0 = r1
            r0 = r1
            goto L1d
        L1b:
            r9 = 3
            r0 = r2
        L1d:
            int r4 = r10.L
            androidx.media2.exoplayer.external.audio.j[] r5 = r10.F
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L46
            r4 = r5[r4]
            r9 = 5
            if (r0 == 0) goto L32
            r9 = 4
            r4.c()
        L32:
            r10.M(r7)
            boolean r0 = r4.a()
            r9 = 5
            if (r0 != 0) goto L3e
            r9 = 4
            return r2
        L3e:
            r9 = 0
            int r0 = r10.L
            int r0 = r0 + r1
            r9 = 2
            r10.L = r0
            goto L18
        L46:
            java.nio.ByteBuffer r0 = r10.I
            r9 = 0
            if (r0 == 0) goto L54
            r10.S(r0, r7)
            java.nio.ByteBuffer r0 = r10.I
            r9 = 6
            if (r0 == 0) goto L54
            return r2
        L54:
            r9 = 5
            r10.L = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.audio.y.A():boolean");
    }

    private void C() {
        int i10 = 0;
        while (true) {
            j[] jVarArr = this.F;
            if (i10 >= jVarArr.length) {
                return;
            }
            j jVar = jVarArr[i10];
            jVar.flush();
            this.G[i10] = jVar.d();
            i10++;
        }
    }

    private static int D(int channelCount, boolean isInputPcm) {
        int i10 = q0.f57626a;
        if (i10 <= 28 && !isInputPcm) {
            if (channelCount == 7) {
                channelCount = 8;
            } else if (channelCount == 3 || channelCount == 4 || channelCount == 5) {
                channelCount = 6;
            }
        }
        if (i10 <= 26 && "fugu".equals(q0.f57627b) && !isInputPcm && channelCount == 1) {
            channelCount = 2;
        }
        return q0.F(channelCount);
    }

    private static int E(int encoding, ByteBuffer buffer) {
        if (encoding == 7 || encoding == 8) {
            return z.e(buffer);
        }
        if (encoding == 5) {
            return androidx.media2.exoplayer.external.audio.a.b();
        }
        if (encoding == 6 || encoding == 18) {
            return androidx.media2.exoplayer.external.audio.a.h(buffer);
        }
        if (encoding == 17) {
            return androidx.media2.exoplayer.external.audio.b.c(buffer);
        }
        if (encoding == 14) {
            int iA = androidx.media2.exoplayer.external.audio.a.a(buffer);
            if (iA == -1) {
                return 0;
            }
            return androidx.media2.exoplayer.external.audio.a.i(buffer, iA) * 16;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Unexpected audio encoding: ");
        sb2.append(encoding);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(int encoding) {
        if (encoding == 5) {
            return androidx.media3.extractor.b.f67118a;
        }
        if (encoding == 6) {
            return 768000;
        }
        if (encoding == 7) {
            return androidx.media3.extractor.o.f68165f;
        }
        if (encoding == 8) {
            return androidx.media3.extractor.o.f68166g;
        }
        if (encoding == 14) {
            return androidx.media3.extractor.b.f67120c;
        }
        if (encoding == 17) {
            return androidx.media3.extractor.c.f67165t;
        }
        if (encoding == 18) {
            return 768000;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long G() {
        d dVar = this.f53541o;
        return dVar.f53556a ? this.f53550x / ((long) dVar.f53557b) : this.f53551y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long H() {
        d dVar = this.f53541o;
        return dVar.f53556a ? this.f53552z / ((long) dVar.f53559d) : this.A;
    }

    private void I(long presentationTimeUs) throws s.b {
        this.f53535i.block();
        AudioTrack audioTrackA = ((d) androidx.media2.exoplayer.external.util.a.g(this.f53541o)).a(this.R, this.f53543q, this.P);
        this.f53542p = audioTrackA;
        int audioSessionId = audioTrackA.getAudioSessionId();
        if (f53526h0 && q0.f57626a < 21) {
            AudioTrack audioTrack = this.f53539m;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                N();
            }
            if (this.f53539m == null) {
                this.f53539m = J(audioSessionId);
            }
        }
        if (this.P != audioSessionId) {
            this.P = audioSessionId;
            s.c cVar = this.f53538l;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        x(this.f53545s, presentationTimeUs);
        u uVar = this.f53536j;
        AudioTrack audioTrack2 = this.f53542p;
        d dVar = this.f53541o;
        uVar.s(audioTrack2, dVar.f53562g, dVar.f53559d, dVar.f53563h);
        O();
        int i10 = this.Q.f53508a;
        if (i10 != 0) {
            this.f53542p.attachAuxEffect(i10);
            this.f53542p.setAuxEffectSendLevel(this.Q.f53509b);
        }
    }

    private static AudioTrack J(int audioSessionId) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
    }

    private boolean K() {
        return this.f53542p != null;
    }

    private void L() {
        if (this.N) {
            return;
        }
        this.N = true;
        this.f53536j.g(H());
        this.f53542p.stop();
        int i10 = 3 >> 0;
        this.f53549w = 0;
    }

    private void M(long avSyncPresentationTimeUs) throws s.d {
        ByteBuffer byteBuffer;
        int length = this.F.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.G[i10 - 1];
            } else {
                byteBuffer = this.H;
                if (byteBuffer == null) {
                    byteBuffer = j.f53430a;
                }
            }
            if (i10 == length) {
                S(byteBuffer, avSyncPresentationTimeUs);
            } else {
                j jVar = this.F[i10];
                jVar.b(byteBuffer);
                ByteBuffer byteBufferD = jVar.d();
                this.G[i10] = byteBufferD;
                if (byteBufferD.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                break;
            } else {
                i10--;
            }
        }
    }

    private void N() {
        AudioTrack audioTrack = this.f53539m;
        if (audioTrack == null) {
            return;
        }
        this.f53539m = null;
        new b(this, audioTrack).start();
    }

    private void O() {
        if (K()) {
            if (q0.f57626a >= 21) {
                P(this.f53542p, this.E);
            } else {
                Q(this.f53542p, this.E);
            }
        }
    }

    @e.b(21)
    private static void P(AudioTrack audioTrack, float volume) {
        audioTrack.setVolume(volume);
    }

    private static void Q(AudioTrack audioTrack, float volume) {
        audioTrack.setStereoVolume(volume, volume);
    }

    private void R() {
        j[] jVarArr = this.f53541o.f53566k;
        ArrayList arrayList = new ArrayList();
        for (j jVar : jVarArr) {
            if (jVar.isActive()) {
                arrayList.add(jVar);
            } else {
                jVar.flush();
            }
        }
        int size = arrayList.size();
        this.F = (j[]) arrayList.toArray(new j[size]);
        this.G = new ByteBuffer[size];
        C();
    }

    private void S(ByteBuffer buffer, long avSyncPresentationTimeUs) throws s.d {
        y yVar;
        if (buffer.hasRemaining()) {
            ByteBuffer byteBuffer = this.I;
            int iT = 0;
            if (byteBuffer != null) {
                androidx.media2.exoplayer.external.util.a.a(byteBuffer == buffer);
            } else {
                this.I = buffer;
                if (q0.f57626a < 21) {
                    int iRemaining = buffer.remaining();
                    byte[] bArr = this.J;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.J = new byte[iRemaining];
                    }
                    int iPosition = buffer.position();
                    buffer.get(this.J, 0, iRemaining);
                    buffer.position(iPosition);
                    this.K = 0;
                }
            }
            int iRemaining2 = buffer.remaining();
            if (q0.f57626a < 21) {
                int iC = this.f53536j.c(this.f53552z);
                if (iC > 0) {
                    iT = this.f53542p.write(this.J, this.K, Math.min(iRemaining2, iC));
                    if (iT > 0) {
                        this.K += iT;
                        buffer.position(buffer.position() + iT);
                    }
                }
                yVar = this;
            } else if (this.R) {
                androidx.media2.exoplayer.external.util.a.i(avSyncPresentationTimeUs != -9223372036854775807L);
                yVar = this;
                iT = yVar.U(this.f53542p, buffer, iRemaining2, avSyncPresentationTimeUs);
            } else {
                yVar = this;
                iT = T(yVar.f53542p, buffer, iRemaining2);
            }
            yVar.S = SystemClock.elapsedRealtime();
            if (iT < 0) {
                throw new s.d(iT);
            }
            boolean z10 = yVar.f53541o.f53556a;
            if (z10) {
                yVar.f53552z += (long) iT;
            }
            if (iT == iRemaining2) {
                if (!z10) {
                    yVar.A += (long) yVar.B;
                }
                yVar.I = null;
            }
        }
    }

    @e.b(21)
    private static int T(AudioTrack audioTrack, ByteBuffer buffer, int size) {
        return audioTrack.write(buffer, size, 1);
    }

    @e.b(21)
    private int U(AudioTrack audioTrack, ByteBuffer buffer, int size, long presentationTimeUs) {
        if (q0.f57626a >= 26) {
            int i10 = 7 | 1;
            return audioTrack.write(buffer, size, 1, presentationTimeUs * 1000);
        }
        if (this.f53548v == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f53548v = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f53548v.putInt(1431633921);
        }
        if (this.f53549w == 0) {
            this.f53548v.putInt(4, size);
            this.f53548v.putLong(8, presentationTimeUs * 1000);
            this.f53548v.position(0);
            this.f53549w = size;
        }
        int iRemaining = this.f53548v.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f53548v, iRemaining, 1);
            if (iWrite < 0) {
                this.f53549w = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iT = T(audioTrack, buffer, size);
        if (iT < 0) {
            this.f53549w = 0;
            return iT;
        }
        this.f53549w -= iT;
        return iT;
    }

    private void x(m0 playbackParameters, long presentationTimeUs) {
        this.f53537k.add(new g(this.f53541o.f53565j ? this.f53529c.d(playbackParameters) : m0.f55312e, Math.max(0L, presentationTimeUs), this.f53541o.e(H()), null));
        R();
    }

    private long y(long positionUs) {
        return positionUs + this.f53541o.e(this.f53529c.b());
    }

    private long z(long positionUs) {
        long j10;
        long jR;
        g gVarRemove = null;
        while (!this.f53537k.isEmpty() && positionUs >= this.f53537k.getFirst().f53572c) {
            gVarRemove = this.f53537k.remove();
        }
        if (gVarRemove != null) {
            this.f53545s = gVarRemove.f53570a;
            this.f53547u = gVarRemove.f53572c;
            this.f53546t = gVarRemove.f53571b - this.D;
        }
        if (this.f53545s.f55313a == 1.0f) {
            return (positionUs + this.f53546t) - this.f53547u;
        }
        if (this.f53537k.isEmpty()) {
            j10 = this.f53546t;
            jR = this.f53529c.c(positionUs - this.f53547u);
        } else {
            j10 = this.f53546t;
            jR = q0.R(positionUs - this.f53547u, this.f53545s.f55313a);
        }
        return j10 + jR;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void B() {
        this.O = true;
        if (K()) {
            this.f53536j.t();
            this.f53542p.play();
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public boolean a() {
        if (K()) {
            return this.M && !j();
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public m0 c() {
        m0 m0Var = this.f53544r;
        if (m0Var != null) {
            return m0Var;
        }
        return !this.f53537k.isEmpty() ? this.f53537k.getLast().f53570a : this.f53545s;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void f(float volume) {
        if (this.E != volume) {
            this.E = volume;
            O();
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void flush() {
        if (K()) {
            this.f53550x = 0L;
            this.f53551y = 0L;
            this.f53552z = 0L;
            this.A = 0L;
            this.B = 0;
            m0 m0Var = this.f53544r;
            if (m0Var != null) {
                this.f53545s = m0Var;
                this.f53544r = null;
            } else if (!this.f53537k.isEmpty()) {
                this.f53545s = this.f53537k.getLast().f53570a;
            }
            this.f53537k.clear();
            this.f53546t = 0L;
            this.f53547u = 0L;
            this.f53532f.p();
            C();
            this.H = null;
            this.I = null;
            this.N = false;
            this.M = false;
            this.L = -1;
            this.f53548v = null;
            this.f53549w = 0;
            this.C = 0;
            if (this.f53536j.i()) {
                this.f53542p.pause();
            }
            AudioTrack audioTrack = this.f53542p;
            this.f53542p = null;
            d dVar = this.f53540n;
            if (dVar != null) {
                this.f53541o = dVar;
                this.f53540n = null;
            }
            this.f53536j.q();
            this.f53535i.close();
            new a(audioTrack).start();
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void g(int audioSessionId) {
        if (this.P != audioSessionId) {
            this.P = audioSessionId;
            flush();
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void h(v auxEffectInfo) {
        if (this.Q.equals(auxEffectInfo)) {
            return;
        }
        int i10 = auxEffectInfo.f53508a;
        float f10 = auxEffectInfo.f53509b;
        AudioTrack audioTrack = this.f53542p;
        if (audioTrack != null) {
            if (this.Q.f53508a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f53542p.setAuxEffectSendLevel(f10);
            }
        }
        this.Q = auxEffectInfo;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void i() {
        if (this.R) {
            this.R = false;
            this.P = 0;
            flush();
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public boolean j() {
        return K() && this.f53536j.h(H());
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void k() throws s.d {
        if (!this.M && K() && A()) {
            L();
            this.M = true;
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public long l(boolean sourceEnded) {
        if (K() && this.C != 0) {
            return this.D + y(z(Math.min(this.f53536j.d(sourceEnded), this.f53541o.e(H()))));
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void m() {
        if (this.C == 1) {
            this.C = 2;
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public boolean n(ByteBuffer buffer, long presentationTimeUs) throws s.d, s.b {
        ByteBuffer byteBuffer = this.H;
        androidx.media2.exoplayer.external.util.a.a(byteBuffer == null || buffer == byteBuffer);
        if (this.f53540n != null) {
            if (!A()) {
                return false;
            }
            if (this.f53540n.b(this.f53541o)) {
                this.f53541o = this.f53540n;
                this.f53540n = null;
            } else {
                L();
                if (j()) {
                    return false;
                }
                flush();
            }
            x(this.f53545s, presentationTimeUs);
        }
        if (!K()) {
            I(presentationTimeUs);
            if (this.O) {
                B();
            }
        }
        if (!this.f53536j.k(H())) {
            return false;
        }
        if (this.H == null) {
            if (!buffer.hasRemaining()) {
                return true;
            }
            d dVar = this.f53541o;
            if (!dVar.f53556a && this.B == 0) {
                int iE = E(dVar.f53562g, buffer);
                this.B = iE;
                if (iE == 0) {
                    return true;
                }
            }
            if (this.f53544r != null) {
                if (!A()) {
                    return false;
                }
                m0 m0Var = this.f53544r;
                this.f53544r = null;
                x(m0Var, presentationTimeUs);
            }
            if (this.C == 0) {
                this.D = Math.max(0L, presentationTimeUs);
                this.C = 1;
            } else {
                long jG = this.D + this.f53541o.g(G() - this.f53532f.o());
                if (this.C == 1 && Math.abs(jG - presentationTimeUs) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(jG);
                    sb2.append(", got ");
                    sb2.append(presentationTimeUs);
                    sb2.append("]");
                    androidx.media2.exoplayer.external.util.p.d(f53522d0, sb2.toString());
                    this.C = 2;
                }
                if (this.C == 2) {
                    long j10 = presentationTimeUs - jG;
                    this.D += j10;
                    this.C = 1;
                    s.c cVar = this.f53538l;
                    if (cVar != null && j10 != 0) {
                        cVar.c();
                    }
                }
            }
            if (this.f53541o.f53556a) {
                this.f53550x += (long) buffer.remaining();
            } else {
                this.f53551y += (long) this.B;
            }
            this.H = buffer;
        }
        if (this.f53541o.f53564i) {
            M(presentationTimeUs);
        } else {
            S(this.H, presentationTimeUs);
        }
        if (!this.H.hasRemaining()) {
            this.H = null;
            return true;
        }
        if (!this.f53536j.j(H())) {
            return false;
        }
        androidx.media2.exoplayer.external.util.p.l(f53522d0, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void o(androidx.media2.exoplayer.external.audio.c audioAttributes) {
        if (this.f53543q.equals(audioAttributes)) {
            return;
        }
        this.f53543q = audioAttributes;
        if (this.R) {
            return;
        }
        flush();
        this.P = 0;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void p(int tunnelingAudioSessionId) {
        androidx.media2.exoplayer.external.util.a.i(q0.f57626a >= 21);
        if (this.R && this.P == tunnelingAudioSessionId) {
            return;
        }
        this.R = true;
        this.P = tunnelingAudioSessionId;
        flush();
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void pause() {
        this.O = false;
        if (K() && this.f53536j.p()) {
            this.f53542p.pause();
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public boolean q(int channelCount, int encoding) {
        if (q0.o0(encoding)) {
            return encoding != 4 || q0.f57626a >= 21;
        }
        androidx.media2.exoplayer.external.audio.d dVar = this.f53528b;
        return dVar != null && dVar.f(encoding) && (channelCount == -1 || channelCount <= this.f53528b.e());
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void r(int inputEncoding, int inputChannelCount, int inputSampleRate, int specifiedBufferSize, @p0 int[] outputChannels, int trimStartFrames, int trimEndFrames) throws s.a {
        int[] iArr;
        int i10;
        int iE;
        boolean z10;
        int iG;
        if (q0.f57626a < 21 && inputChannelCount == 8 && outputChannels == null) {
            iArr = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = outputChannels;
        }
        boolean zO0 = q0.o0(inputEncoding);
        boolean z11 = zO0 && inputEncoding != 4;
        boolean z12 = this.f53530d && q(inputChannelCount, 4) && q0.n0(inputEncoding);
        j[] jVarArr = z12 ? this.f53534h : this.f53533g;
        if (z11) {
            this.f53532f.q(trimStartFrames, trimEndFrames);
            this.f53531e.o(iArr);
            int iF = inputSampleRate;
            iE = inputChannelCount;
            boolean zH = false;
            iG = inputEncoding;
            for (j jVar : jVarArr) {
                try {
                    zH |= jVar.h(iF, iE, iG);
                    if (jVar.isActive()) {
                        iE = jVar.e();
                        iF = jVar.f();
                        iG = jVar.g();
                    }
                } catch (j.a e10) {
                    throw new s.a(e10);
                }
            }
            z10 = zH;
            i10 = iF;
        } else {
            i10 = inputSampleRate;
            iE = inputChannelCount;
            z10 = false;
            iG = inputEncoding;
        }
        int iD = D(iE, zO0);
        if (iD == 0) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Unsupported channel count: ");
            sb2.append(iE);
            throw new s.a(sb2.toString());
        }
        d dVar = new d(zO0, zO0 ? q0.V(inputEncoding, inputChannelCount) : -1, inputSampleRate, zO0 ? q0.V(iG, iE) : -1, i10, iD, iG, specifiedBufferSize, z11, z11 && !z12, jVarArr);
        boolean z13 = z10 || this.f53540n != null;
        if (!K() || (dVar.b(this.f53541o) && !z13)) {
            this.f53541o = dVar;
        } else {
            this.f53540n = dVar;
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void reset() {
        flush();
        N();
        for (j jVar : this.f53533g) {
            jVar.reset();
        }
        for (j jVar2 : this.f53534h) {
            jVar2.reset();
        }
        this.P = 0;
        this.O = false;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void s(s.c listener) {
        this.f53538l = listener;
    }

    @Override // androidx.media2.exoplayer.external.audio.s
    public void w(m0 playbackParameters) {
        d dVar = this.f53541o;
        if (dVar != null && !dVar.f53565j) {
            this.f53545s = m0.f55312e;
        } else {
            if (playbackParameters.equals(c())) {
                return;
            }
            if (K()) {
                this.f53544r = playbackParameters;
            } else {
                this.f53545s = playbackParameters;
            }
        }
    }

    public y(@p0 androidx.media2.exoplayer.external.audio.d audioCapabilities, j[] audioProcessors, boolean enableConvertHighResIntPcmToFloat) {
        this(audioCapabilities, new e(audioProcessors), enableConvertHighResIntPcmToFloat);
    }

    public y(@p0 androidx.media2.exoplayer.external.audio.d audioCapabilities, c audioProcessorChain, boolean enableConvertHighResIntPcmToFloat) {
        this.f53528b = audioCapabilities;
        this.f53529c = (c) androidx.media2.exoplayer.external.util.a.g(audioProcessorChain);
        this.f53530d = enableConvertHighResIntPcmToFloat;
        this.f53535i = new ConditionVariable(true);
        this.f53536j = new u(new h(this, null));
        x xVar = new x();
        this.f53531e = xVar;
        i0 i0Var = new i0();
        this.f53532f = i0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new c0(), xVar, i0Var);
        Collections.addAll(arrayList, audioProcessorChain.a());
        this.f53533g = (j[]) arrayList.toArray(new j[0]);
        this.f53534h = new j[]{new a0()};
        this.E = 1.0f;
        this.C = 0;
        this.f53543q = androidx.media2.exoplayer.external.audio.c.f53273e;
        this.P = 0;
        this.Q = new v(0, 0.0f);
        this.f53545s = m0.f55312e;
        this.L = -1;
        this.F = new j[0];
        this.G = new ByteBuffer[0];
        this.f53537k = new ArrayDeque<>();
    }
}
