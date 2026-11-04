package androidx.media2.exoplayer.external.audio;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.util.q0;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b0 extends androidx.media2.exoplayer.external.mediacodec.b implements androidx.media2.exoplayer.external.util.r {
    private static final int I4 = 10;
    private static final String J4 = "MediaCodecAudioRenderer";
    private int A4;
    private int B4;
    private int C4;
    private long D4;
    private boolean E4;
    private boolean F4;
    private long G4;
    private int H4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private final Context f53262q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private final r.a f53263r4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private final s f53264s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private final long[] f53265t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private int f53266u4;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private boolean f53267v4;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private boolean f53268w4;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private boolean f53269x4;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private MediaFormat f53270y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private int f53271z4;

    private final class b implements s.c {
        private b() {
        }

        @Override // androidx.media2.exoplayer.external.audio.s.c
        public void a(int audioSessionId) {
            b0.this.f53263r4.a(audioSessionId);
            b0.this.h1(audioSessionId);
        }

        @Override // androidx.media2.exoplayer.external.audio.s.c
        public void b(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
            b0.this.f53263r4.b(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
            b0.this.j1(bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
        }

        @Override // androidx.media2.exoplayer.external.audio.s.c
        public void c() {
            b0.this.i1();
            b0.this.F4 = true;
        }
    }

    public b0(Context context, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector) {
        this(context, mediaCodecSelector, (androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v>) null, false);
    }

    private static boolean a1(String codecName) {
        if (q0.f57626a < 24 && "OMX.SEC.aac.dec".equals(codecName) && "samsung".equals(q0.f57628c)) {
            String str = q0.f57627b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean b1(String codecName) {
        if (q0.f57626a < 21 && "OMX.SEC.mp3.dec".equals(codecName) && "samsung".equals(q0.f57628c)) {
            String str = q0.f57627b;
            if (str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean c1() {
        if (q0.f57626a != 23) {
            return false;
        }
        String str = q0.f57629d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int d1(androidx.media2.exoplayer.external.mediacodec.a codecInfo, Format format) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(codecInfo.f55319a) || (i10 = q0.f57626a) >= 24 || (i10 == 23 && q0.r0(this.f53262q4))) {
            return format.f53105j;
        }
        return -1;
    }

    private void k1() {
        long jL = this.f53264s4.l(a());
        if (jL != Long.MIN_VALUE) {
            if (!this.F4) {
                jL = Math.max(this.D4, jL);
            }
            this.D4 = jL;
            this.F4 = false;
        }
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    @androidx.annotation.i
    protected void A0(long presentationTimeUs) {
        while (this.H4 != 0 && presentationTimeUs >= this.f53265t4[0]) {
            this.f53264s4.m();
            int i10 = this.H4 - 1;
            this.H4 = i10;
            long[] jArr = this.f53265t4;
            System.arraycopy(jArr, 1, jArr, 0, i10);
        }
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.b
    protected void B(boolean joining) throws androidx.media2.exoplayer.external.i {
        super.B(joining);
        this.f53263r4.e(this.T3);
        int i10 = h().f57729a;
        if (i10 != 0) {
            this.f53264s4.p(i10);
        } else {
            this.f53264s4.i();
        }
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected void B0(androidx.media2.exoplayer.external.decoder.e buffer) {
        if (this.E4 && !buffer.s()) {
            if (Math.abs(buffer.f53790d - this.D4) > 500000) {
                this.D4 = buffer.f53790d;
            }
            this.E4 = false;
        }
        this.G4 = Math.max(buffer.f53790d, this.G4);
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.b
    protected void C(long positionUs, boolean joining) throws androidx.media2.exoplayer.external.i {
        super.C(positionUs, joining);
        this.f53264s4.flush();
        this.D4 = positionUs;
        this.E4 = true;
        this.F4 = true;
        this.G4 = -9223372036854775807L;
        this.H4 = 0;
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.b
    protected void D() {
        try {
            super.D();
            s sVar = this.f53264s4;
        } finally {
            this.f53264s4.reset();
        }
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected boolean D0(long positionUs, long elapsedRealtimeUs, MediaCodec codec, ByteBuffer buffer, int bufferIndex, int bufferFlags, long bufferPresentationTimeUs, boolean isDecodeOnlyBuffer, boolean isLastBuffer, Format format) throws androidx.media2.exoplayer.external.i {
        if (this.f53269x4 && bufferPresentationTimeUs == 0 && (bufferFlags & 4) != 0) {
            long j10 = this.G4;
            if (j10 != -9223372036854775807L) {
                bufferPresentationTimeUs = j10;
            }
        }
        if (this.f53267v4 && (bufferFlags & 2) != 0) {
            codec.releaseOutputBuffer(bufferIndex, false);
            return true;
        }
        if (isDecodeOnlyBuffer) {
            codec.releaseOutputBuffer(bufferIndex, false);
            this.T3.f53781f++;
            this.f53264s4.m();
            return true;
        }
        try {
            if (!this.f53264s4.n(buffer, bufferPresentationTimeUs)) {
                return false;
            }
            codec.releaseOutputBuffer(bufferIndex, false);
            this.T3.f53780e++;
            return true;
        } catch (s.b | s.d e10) {
            throw androidx.media2.exoplayer.external.i.c(e10, j());
        }
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.b
    protected void E() {
        super.E();
        this.f53264s4.B();
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.b
    protected void F() {
        k1();
        this.f53264s4.pause();
        super.F();
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void G(Format[] formats, long offsetUs) throws androidx.media2.exoplayer.external.i {
        super.G(formats, offsetUs);
        if (this.G4 != -9223372036854775807L) {
            int i10 = this.H4;
            long[] jArr = this.f53265t4;
            if (i10 == jArr.length) {
                long j10 = jArr[i10 - 1];
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("Too many stream changes, so dropping change at ");
                sb2.append(j10);
                androidx.media2.exoplayer.external.util.p.l(J4, sb2.toString());
            } else {
                this.H4 = i10 + 1;
            }
            this.f53265t4[this.H4 - 1] = this.G4;
        }
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected void J0() throws androidx.media2.exoplayer.external.i {
        try {
            this.f53264s4.k();
        } catch (s.d e10) {
            throw androidx.media2.exoplayer.external.i.c(e10, j());
        }
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected int K(MediaCodec codec, androidx.media2.exoplayer.external.mediacodec.a codecInfo, Format oldFormat, Format newFormat) {
        if (d1(codecInfo, newFormat) <= this.f53266u4 && oldFormat.H1 == 0 && oldFormat.f53114p2 == 0 && newFormat.H1 == 0 && newFormat.f53114p2 == 0) {
            if (codecInfo.o(oldFormat, newFormat, true)) {
                return 3;
            }
            if (Z0(oldFormat, newFormat)) {
                return 1;
            }
        }
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected int S0(androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, Format format) throws androidx.media2.exoplayer.external.mediacodec.h.c {
        String str = format.f53103i;
        if (!androidx.media2.exoplayer.external.util.s.l(str)) {
            return 0;
        }
        int i10 = q0.f57626a >= 21 ? 32 : 0;
        boolean z10 = format.f53108l == null || androidx.media2.exoplayer.external.drm.v.class.equals(format.f53104i3) || (format.f53104i3 == null && androidx.media2.exoplayer.external.b.J(drmSessionManager, format.f53108l));
        if (z10 && Y0(format.Z, str) && mediaCodecSelector.b() != null) {
            return i10 | 12;
        }
        if (("audio/raw".equals(str) && !this.f53264s4.q(format.Z, format.f53113p1)) || !this.f53264s4.q(format.Z, 2)) {
            return 1;
        }
        List<androidx.media2.exoplayer.external.mediacodec.a> listK0 = k0(mediaCodecSelector, format, false);
        if (listK0.isEmpty()) {
            return 1;
        }
        if (!z10) {
            return 2;
        }
        androidx.media2.exoplayer.external.mediacodec.a aVar = listK0.get(0);
        boolean zL = aVar.l(format);
        return ((zL && aVar.n(format)) ? 16 : 8) | i10 | (zL ? 4 : 3);
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected void T(androidx.media2.exoplayer.external.mediacodec.a codecInfo, MediaCodec codec, Format format, @p0 MediaCrypto crypto, float codecOperatingRate) {
        this.f53266u4 = e1(codecInfo, format, m());
        this.f53268w4 = a1(codecInfo.f55319a);
        this.f53269x4 = b1(codecInfo.f55319a);
        boolean z10 = codecInfo.f55326h;
        this.f53267v4 = z10;
        MediaFormat mediaFormatF1 = f1(format, z10 ? "audio/raw" : codecInfo.f55321c, this.f53266u4, codecOperatingRate);
        codec.configure(mediaFormatF1, (Surface) null, crypto, 0);
        if (!this.f53267v4) {
            this.f53270y4 = null;
        } else {
            this.f53270y4 = mediaFormatF1;
            mediaFormatF1.setString("mime", format.f53103i);
        }
    }

    protected boolean Y0(int channelCount, String mimeType) {
        return g1(channelCount, mimeType) != 0;
    }

    protected boolean Z0(Format oldFormat, Format newFormat) {
        if (!q0.b(oldFormat.f53103i, newFormat.f53103i) || oldFormat.Z != newFormat.Z || oldFormat.f53112p0 != newFormat.f53112p0 || !oldFormat.L(newFormat)) {
            return false;
        }
        int i10 = 1 >> 1;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.t0
    public boolean a() {
        return super.a() && this.f53264s4.a();
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public m0 c() {
        return this.f53264s4.c();
    }

    protected int e1(androidx.media2.exoplayer.external.mediacodec.a codecInfo, Format format, Format[] streamFormats) {
        int iD1 = d1(codecInfo, format);
        boolean z10 = true | true;
        if (streamFormats.length == 1) {
            return iD1;
        }
        for (Format format2 : streamFormats) {
            if (codecInfo.o(format, format2, false)) {
                iD1 = Math.max(iD1, d1(codecInfo, format2));
            }
        }
        return iD1;
    }

    @e.a({"InlinedApi"})
    protected MediaFormat f1(Format format, String codecMimeType, int codecMaxInputSize, float codecOperatingRate) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", codecMimeType);
        mediaFormat.setInteger("channel-count", format.Z);
        mediaFormat.setInteger("sample-rate", format.f53112p0);
        androidx.media2.exoplayer.external.mediacodec.i.e(mediaFormat, format.f53107k);
        androidx.media2.exoplayer.external.mediacodec.i.d(mediaFormat, "max-input-size", codecMaxInputSize);
        int i10 = q0.f57626a;
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (codecOperatingRate != -1.0f && !c1()) {
                mediaFormat.setFloat("operating-rate", codecOperatingRate);
            }
        }
        if (i10 <= 28 && "audio/ac4".equals(format.f53103i)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        return mediaFormat;
    }

    protected int g1(int channelCount, String mimeType) {
        if ("audio/eac3-joc".equals(mimeType)) {
            if (this.f53264s4.q(channelCount, 18)) {
                return androidx.media2.exoplayer.external.util.s.c("audio/eac3-joc");
            }
            mimeType = "audio/eac3";
        }
        int iC = androidx.media2.exoplayer.external.util.s.c(mimeType);
        if (this.f53264s4.q(channelCount, iC)) {
            return iC;
        }
        return 0;
    }

    protected void h1(int audioSessionId) {
    }

    @Override // androidx.media2.exoplayer.external.b, androidx.media2.exoplayer.external.q0.b
    public void i(int messageType, @p0 Object message) throws androidx.media2.exoplayer.external.i {
        if (messageType == 2) {
            this.f53264s4.f(((Float) message).floatValue());
            return;
        }
        if (messageType == 3) {
            this.f53264s4.o((c) message);
        } else if (messageType != 5) {
            super.i(messageType, message);
        } else {
            this.f53264s4.h((v) message);
        }
    }

    protected void i1() {
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        return this.f53264s4.j() || super.isReady();
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected float j0(float operatingRate, Format format, Format[] streamFormats) {
        int iMax = -1;
        for (Format format2 : streamFormats) {
            int i10 = format2.f53112p0;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * operatingRate;
    }

    protected void j1(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public long k() {
        if (getState() == 2) {
            k1();
        }
        return this.D4;
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected List<androidx.media2.exoplayer.external.mediacodec.a> k0(androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, Format format, boolean requiresSecureDecoder) throws androidx.media2.exoplayer.external.mediacodec.h.c {
        androidx.media2.exoplayer.external.mediacodec.a aVarB;
        if (Y0(format.Z, format.f53103i) && (aVarB = mediaCodecSelector.b()) != null) {
            return Collections.singletonList(aVarB);
        }
        List<androidx.media2.exoplayer.external.mediacodec.a> listL = androidx.media2.exoplayer.external.mediacodec.h.l(mediaCodecSelector.a(format.f53103i, requiresSecureDecoder, false), format);
        if ("audio/eac3-joc".equals(format.f53103i)) {
            listL.addAll(mediaCodecSelector.a("audio/eac3", requiresSecureDecoder, false));
        }
        return Collections.unmodifiableList(listL);
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b, androidx.media2.exoplayer.external.b
    protected void o() {
        try {
            this.G4 = -9223372036854775807L;
            this.H4 = 0;
            this.f53264s4.flush();
            try {
                super.o();
                r.a aVar = this.f53263r4;
                androidx.media2.exoplayer.external.decoder.d dVar = this.T3;
            } finally {
                this.f53263r4.d(this.T3);
            }
        } catch (Throwable th2) {
            try {
                super.o();
                r.a aVar2 = this.f53263r4;
                throw th2;
            } finally {
                this.f53263r4.d(this.T3);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.b, androidx.media2.exoplayer.external.t0
    public androidx.media2.exoplayer.external.util.r u() {
        return this;
    }

    @Override // androidx.media2.exoplayer.external.util.r
    public void w(m0 playbackParameters) {
        this.f53264s4.w(playbackParameters);
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected void x0(String name, long initializedTimestampMs, long initializationDurationMs) {
        this.f53263r4.c(name, initializedTimestampMs, initializationDurationMs);
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected void y0(androidx.media2.exoplayer.external.d0 formatHolder) throws androidx.media2.exoplayer.external.i {
        super.y0(formatHolder);
        Format format = formatHolder.f53762c;
        this.f53263r4.f(format);
        this.f53271z4 = "audio/raw".equals(format.f53103i) ? format.f53113p1 : 2;
        this.A4 = format.Z;
        this.B4 = format.H1;
        this.C4 = format.f53114p2;
    }

    @Override // androidx.media2.exoplayer.external.mediacodec.b
    protected void z0(MediaCodec codec, MediaFormat outputFormat) throws androidx.media2.exoplayer.external.i {
        int iG1;
        int[] iArr;
        int i10;
        MediaFormat mediaFormat = this.f53270y4;
        if (mediaFormat != null) {
            iG1 = g1(mediaFormat.getInteger("channel-count"), mediaFormat.getString("mime"));
            outputFormat = mediaFormat;
        } else {
            iG1 = this.f53271z4;
        }
        int integer = outputFormat.getInteger("channel-count");
        int integer2 = outputFormat.getInteger("sample-rate");
        if (this.f53268w4 && integer == 6 && (i10 = this.A4) < 6) {
            iArr = new int[i10];
            for (int i11 = 0; i11 < this.A4; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = null;
        }
        try {
            this.f53264s4.r(iG1, integer, integer2, 0, iArr, this.B4, this.C4);
        } catch (s.a e10) {
            throw androidx.media2.exoplayer.external.i.c(e10, j());
        }
    }

    public b0(Context context, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, boolean playClearSamplesWithoutKeys) {
        this(context, mediaCodecSelector, drmSessionManager, playClearSamplesWithoutKeys, null, null);
    }

    public b0(Context context, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 Handler eventHandler, @p0 r eventListener) {
        this(context, mediaCodecSelector, null, false, eventHandler, eventListener);
    }

    public b0(Context context, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, boolean playClearSamplesWithoutKeys, @p0 Handler eventHandler, @p0 r eventListener) {
        this(context, mediaCodecSelector, drmSessionManager, playClearSamplesWithoutKeys, eventHandler, eventListener, (d) null, new j[0]);
    }

    public b0(Context context, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, boolean playClearSamplesWithoutKeys, @p0 Handler eventHandler, @p0 r eventListener, @p0 d audioCapabilities, j... audioProcessors) {
        this(context, mediaCodecSelector, drmSessionManager, playClearSamplesWithoutKeys, eventHandler, eventListener, new y(audioCapabilities, audioProcessors));
    }

    public b0(Context context, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, boolean playClearSamplesWithoutKeys, @p0 Handler eventHandler, @p0 r eventListener, s audioSink) {
        this(context, mediaCodecSelector, drmSessionManager, playClearSamplesWithoutKeys, false, eventHandler, eventListener, audioSink);
    }

    public b0(Context context, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 androidx.media2.exoplayer.external.drm.r<androidx.media2.exoplayer.external.drm.v> drmSessionManager, boolean playClearSamplesWithoutKeys, boolean enableDecoderFallback, @p0 Handler eventHandler, @p0 r eventListener, s audioSink) {
        super(1, mediaCodecSelector, drmSessionManager, playClearSamplesWithoutKeys, enableDecoderFallback, 44100.0f);
        this.f53262q4 = context.getApplicationContext();
        this.f53264s4 = audioSink;
        this.G4 = -9223372036854775807L;
        this.f53265t4 = new long[10];
        this.f53263r4 = new r.a(eventHandler, eventListener);
        audioSink.s(new b());
    }
}
