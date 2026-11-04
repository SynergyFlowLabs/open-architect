package androidx.media2.exoplayer.external.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.drm.o;
import androidx.media2.exoplayer.external.drm.p;
import androidx.media2.exoplayer.external.drm.r;
import androidx.media2.exoplayer.external.drm.v;
import androidx.media2.exoplayer.external.util.j0;
import androidx.media2.exoplayer.external.util.l0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.t;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class b extends androidx.media2.exoplayer.external.b {
    protected static final float U3 = -1.0f;
    private static final String V3 = "MediaCodecRenderer";
    private static final long W3 = 1000;
    protected static final int X3 = 0;
    protected static final int Y3 = 1;
    protected static final int Z3 = 2;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    protected static final int f55331a4 = 3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f55332b4 = 0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f55333c4 = 1;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final int f55334d4 = 2;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final int f55335e4 = 0;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final int f55336f4 = 1;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final int f55337g4 = 2;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final int f55338h4 = 0;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final int f55339i4 = 1;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final int f55340j4 = 2;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final int f55341k4 = 3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final int f55342l4 = 0;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f55343m4 = 1;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f55344n4 = 2;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final byte[] f55345o4 = q0.H("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final int f55346p4 = 32;
    private long A3;
    private int B3;
    private int C3;
    private ByteBuffer D3;
    private boolean E3;
    private boolean F3;
    private boolean G3;

    @p0
    private MediaCrypto H1;
    private int H3;
    private int I3;
    private int J3;
    private boolean K3;
    private boolean L3;
    private long M3;
    private long N3;
    private boolean O3;
    private boolean P3;
    private boolean Q3;
    private boolean R3;
    private boolean S3;
    protected androidx.media2.exoplayer.external.decoder.d T3;
    private final MediaCodec.BufferInfo X;

    @p0
    private Format Y;
    private Format Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private long f55347g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private float f55348h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private MediaCodec f55349i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.mediacodec.c f55350j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @p0
    private Format f55351j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final r<v> f55352k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private float f55353k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f55354l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @p0
    private ArrayDeque<androidx.media2.exoplayer.external.mediacodec.a> f55355l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f55356m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @p0
    private c f55357m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f55358n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.mediacodec.a f55359n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.decoder.e f55360o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int f55361o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private p<v> f55362p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private p<v> f55363p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f55364p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f55365p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f55366q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f55367r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.decoder.e f55368s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean f55369s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d0 f55370t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f55371t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f55372u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final j0<Format> f55373v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f55374v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ArrayList<Long> f55375w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f55376w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f55377x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private ByteBuffer[] f55378y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private ByteBuffer[] f55379z3;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface a {
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.mediacodec.b$b, reason: collision with other inner class name */
    public static class C0513b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final androidx.media2.exoplayer.external.mediacodec.a f55380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final String f55381b;

        /* JADX WARN: Illegal instructions before constructor call */
        public C0513b(Throwable cause, @p0 androidx.media2.exoplayer.external.mediacodec.a codecInfo) {
            String strValueOf = String.valueOf(codecInfo == null ? null : codecInfo.f55319a);
            super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), cause);
            this.f55380a = codecInfo;
            this.f55381b = q0.f57626a >= 21 ? a(cause) : null;
        }

        @e.b(21)
        private static String a(Throwable cause) {
            if (cause instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) cause).getDiagnosticInfo();
            }
            return null;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface d {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface e {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    protected @interface f {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface g {
    }

    public b(int trackType, androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 r<v> drmSessionManager, boolean playClearSamplesWithoutKeys, boolean enableDecoderFallback, float assumedMinimumCodecOperatingRate) {
        super(trackType);
        this.f55350j = (androidx.media2.exoplayer.external.mediacodec.c) androidx.media2.exoplayer.external.util.a.g(mediaCodecSelector);
        this.f55352k = drmSessionManager;
        this.f55354l = playClearSamplesWithoutKeys;
        this.f55356m = enableDecoderFallback;
        this.f55358n = assumedMinimumCodecOperatingRate;
        this.f55360o = new androidx.media2.exoplayer.external.decoder.e(0);
        this.f55368s = androidx.media2.exoplayer.external.decoder.e.I();
        this.f55370t = new d0();
        this.f55373v = new j0<>();
        this.f55375w = new ArrayList<>();
        this.X = new MediaCodec.BufferInfo();
        this.H3 = 0;
        this.I3 = 0;
        this.J3 = 0;
        this.f55353k3 = -1.0f;
        this.f55348h3 = 1.0f;
        this.f55347g3 = -9223372036854775807L;
    }

    private void C0() throws androidx.media2.exoplayer.external.i {
        int i10 = this.J3;
        if (i10 == 1) {
            c0();
            return;
        }
        if (i10 == 2) {
            U0();
        } else if (i10 == 3) {
            H0();
        } else {
            this.P3 = true;
            J0();
        }
    }

    private void E0() {
        if (q0.f57626a < 21) {
            this.f55379z3 = this.f55349i3.getOutputBuffers();
        }
    }

    private void F0() throws androidx.media2.exoplayer.external.i {
        MediaFormat outputFormat = this.f55349i3.getOutputFormat();
        if (this.f55361o3 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f55376w3 = true;
            return;
        }
        if (this.f55372u3) {
            outputFormat.setInteger("channel-count", 1);
        }
        z0(this.f55349i3, outputFormat);
    }

    private boolean G0(boolean requireFormat) throws androidx.media2.exoplayer.external.i {
        this.f55368s.o();
        int iH = H(this.f55370t, this.f55368s, requireFormat);
        if (iH == -5) {
            y0(this.f55370t);
            return true;
        }
        if (iH == -4 && this.f55368s.t()) {
            this.O3 = true;
            C0();
        }
        return false;
    }

    private void H0() throws androidx.media2.exoplayer.external.i {
        I0();
        v0();
    }

    private void K0() {
        if (q0.f57626a < 21) {
            this.f55378y3 = null;
            this.f55379z3 = null;
        }
    }

    private int L(String name) {
        int i10 = q0.f57626a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(name)) {
            String str = q0.f57629d;
            if (str.startsWith("SM-T585") || str.startsWith("SM-A510") || str.startsWith("SM-A520") || str.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(name) && !"OMX.Nvidia.h264.decode.secure".equals(name)) {
            return 0;
        }
        String str2 = q0.f57627b;
        return ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) ? 1 : 0;
    }

    private void L0() {
        this.B3 = -1;
        this.f55360o.f53789c = null;
    }

    private static boolean M(String name, Format format) {
        return q0.f57626a < 21 && format.f53107k.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(name);
    }

    private void M0() {
        this.C3 = -1;
        this.D3 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean N(java.lang.String r3) {
        /*
            int r0 = androidx.media2.exoplayer.external.util.q0.f57626a
            r1 = 23
            if (r0 > r1) goto L11
            java.lang.String r1 = "i.esgrue.voddoXlbeOogMr.o"
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r3)
            r2 = 0
            if (r1 != 0) goto L3c
        L11:
            r1 = 19
            if (r0 > r1) goto L40
            java.lang.String r0 = androidx.media2.exoplayer.external.util.q0.f57627b
            java.lang.String r1 = "hb2000"
            r2 = 3
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            r2 = 7
            java.lang.String r1 = "stvm8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L40
        L29:
            r2 = 0
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome"
            boolean r0 = r0.equals(r3)
            r2 = 5
            if (r0 != 0) goto L3c
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r3 = r0.equals(r3)
            r2 = 5
            if (r3 == 0) goto L40
        L3c:
            r3 = 5
            r3 = 1
            r2 = 3
            return r3
        L40:
            r2 = 0
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.mediacodec.b.N(java.lang.String):boolean");
    }

    private void N0(@p0 p<v> session) {
        o.a(this.f55362p0, session);
        this.f55362p0 = session;
    }

    private static boolean O(String name) {
        if (q0.f57626a != 21 || !"OMX.google.aac.decoder".equals(name)) {
            return false;
        }
        int i10 = 5 | 1;
        return true;
    }

    private void O0(@p0 p<v> session) {
        o.a(this.f55363p1, session);
        this.f55363p1 = session;
    }

    private static boolean P(androidx.media2.exoplayer.external.mediacodec.a codecInfo) {
        String str = codecInfo.f55319a;
        int i10 = q0.f57626a;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 17 || !"OMX.allwinner.video.decoder.avc".equals(str)) {
            return "Amazon".equals(q0.f57628c) && "AFTS".equals(q0.f57629d) && codecInfo.f55325g;
        }
        return true;
    }

    private boolean P0(long drainStartTimeMs) {
        return this.f55347g3 == -9223372036854775807L || SystemClock.elapsedRealtime() - drainStartTimeMs < this.f55347g3;
    }

    private static boolean Q(String name) {
        int i10 = q0.f57626a;
        if (i10 >= 18 && ((i10 != 18 || (!"OMX.SEC.avc.dec".equals(name) && !"OMX.SEC.avc.dec.secure".equals(name))) && (i10 != 19 || !q0.f57629d.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(name) && !"OMX.Exynos.avc.dec.secure".equals(name))))) {
            return false;
        }
        return true;
    }

    private static boolean R(String name, Format format) {
        return q0.f57626a <= 18 && format.Z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(name);
    }

    private boolean R0(boolean bufferEncrypted) throws androidx.media2.exoplayer.external.i {
        p<v> pVar = this.f55362p0;
        int i10 = 7 | 0;
        if (pVar == null || (!bufferEncrypted && this.f55354l)) {
            return false;
        }
        int state = pVar.getState();
        if (state != 1) {
            return state != 4;
        }
        throw androidx.media2.exoplayer.external.i.c(this.f55362p0.T(), j());
    }

    private static boolean S(String name) {
        return q0.f57629d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(name);
    }

    private void T0() throws androidx.media2.exoplayer.external.i {
        if (q0.f57626a < 23) {
            return;
        }
        float fJ0 = j0(this.f55348h3, this.f55351j3, m());
        float f10 = this.f55353k3;
        if (f10 == fJ0) {
            return;
        }
        if (fJ0 == -1.0f) {
            X();
            return;
        }
        if (f10 != -1.0f || fJ0 > this.f55358n) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fJ0);
            this.f55349i3.setParameters(bundle);
            this.f55353k3 = fJ0;
        }
    }

    @e.b(23)
    private void U0() throws androidx.media2.exoplayer.external.i {
        v vVar = (v) this.f55363p1.W();
        if (vVar == null) {
            H0();
            return;
        }
        if (androidx.media2.exoplayer.external.c.A1.equals(vVar.f53910a)) {
            H0();
            return;
        }
        if (c0()) {
            return;
        }
        try {
            this.H1.setMediaDrmSession(vVar.f53911b);
            N0(this.f55363p1);
            this.I3 = 0;
            this.J3 = 0;
        } catch (MediaCryptoException e10) {
            throw androidx.media2.exoplayer.external.i.c(e10, j());
        }
    }

    private boolean V() {
        if ("Amazon".equals(q0.f57628c)) {
            String str = q0.f57629d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void W() {
        if (this.K3) {
            this.I3 = 1;
            this.J3 = 1;
        }
    }

    private void X() throws androidx.media2.exoplayer.external.i {
        if (!this.K3) {
            H0();
        } else {
            this.I3 = 1;
            this.J3 = 3;
        }
    }

    private void Y() throws androidx.media2.exoplayer.external.i {
        if (q0.f57626a < 23) {
            X();
        } else if (!this.K3) {
            U0();
        } else {
            this.I3 = 1;
            this.J3 = 2;
        }
    }

    private boolean Z(long positionUs, long elapsedRealtimeUs) throws androidx.media2.exoplayer.external.i {
        boolean zD0;
        int iDequeueOutputBuffer;
        if (!q0()) {
            if (this.f55371t3 && this.L3) {
                try {
                    iDequeueOutputBuffer = this.f55349i3.dequeueOutputBuffer(this.X, l0());
                } catch (IllegalStateException unused) {
                    C0();
                    if (this.P3) {
                        I0();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.f55349i3.dequeueOutputBuffer(this.X, l0());
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    F0();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    E0();
                    return true;
                }
                if (this.f55377x3 && (this.O3 || this.I3 == 2)) {
                    C0();
                }
                return false;
            }
            if (this.f55376w3) {
                this.f55376w3 = false;
                this.f55349i3.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.X;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                C0();
                return false;
            }
            this.C3 = iDequeueOutputBuffer;
            ByteBuffer byteBufferO0 = o0(iDequeueOutputBuffer);
            this.D3 = byteBufferO0;
            if (byteBufferO0 != null) {
                byteBufferO0.position(this.X.offset);
                ByteBuffer byteBuffer = this.D3;
                MediaCodec.BufferInfo bufferInfo2 = this.X;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.E3 = s0(this.X.presentationTimeUs);
            long j10 = this.M3;
            long j11 = this.X.presentationTimeUs;
            this.F3 = j10 == j11;
            V0(j11);
        }
        if (this.f55371t3 && this.L3) {
            try {
                MediaCodec mediaCodec = this.f55349i3;
                ByteBuffer byteBuffer2 = this.D3;
                int i10 = this.C3;
                MediaCodec.BufferInfo bufferInfo3 = this.X;
                zD0 = D0(positionUs, elapsedRealtimeUs, mediaCodec, byteBuffer2, i10, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.E3, this.F3, this.Z);
            } catch (IllegalStateException unused2) {
                C0();
                if (this.P3) {
                    I0();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.f55349i3;
            ByteBuffer byteBuffer3 = this.D3;
            int i11 = this.C3;
            MediaCodec.BufferInfo bufferInfo4 = this.X;
            zD0 = D0(positionUs, elapsedRealtimeUs, mediaCodec2, byteBuffer3, i11, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.E3, this.F3, this.Z);
        }
        if (zD0) {
            A0(this.X.presentationTimeUs);
            boolean z10 = (this.X.flags & 4) != 0;
            M0();
            if (!z10) {
                return true;
            }
            C0();
        }
        return false;
    }

    private boolean b0() throws androidx.media2.exoplayer.external.i {
        int iPosition;
        int iH;
        MediaCodec mediaCodec = this.f55349i3;
        if (mediaCodec == null || this.I3 == 2 || this.O3) {
            return false;
        }
        if (this.B3 < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.B3 = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            this.f55360o.f53789c = n0(iDequeueInputBuffer);
            this.f55360o.o();
        }
        if (this.I3 == 1) {
            if (!this.f55377x3) {
                this.L3 = true;
                this.f55349i3.queueInputBuffer(this.B3, 0, 0, 0L, 4);
                L0();
            }
            this.I3 = 2;
            return false;
        }
        if (this.f55374v3) {
            this.f55374v3 = false;
            ByteBuffer byteBuffer = this.f55360o.f53789c;
            byte[] bArr = f55345o4;
            byteBuffer.put(bArr);
            this.f55349i3.queueInputBuffer(this.B3, 0, bArr.length, 0L, 0);
            L0();
            this.K3 = true;
            return true;
        }
        if (this.Q3) {
            iH = -4;
            iPosition = 0;
        } else {
            if (this.H3 == 1) {
                for (int i10 = 0; i10 < this.f55351j3.f53107k.size(); i10++) {
                    this.f55360o.f53789c.put(this.f55351j3.f53107k.get(i10));
                }
                this.H3 = 2;
            }
            iPosition = this.f55360o.f53789c.position();
            iH = H(this.f55370t, this.f55360o, false);
        }
        if (q()) {
            this.M3 = this.N3;
        }
        if (iH == -3) {
            return false;
        }
        if (iH == -5) {
            if (this.H3 == 2) {
                this.f55360o.o();
                this.H3 = 1;
            }
            y0(this.f55370t);
            return true;
        }
        if (this.f55360o.t()) {
            if (this.H3 == 2) {
                this.f55360o.o();
                this.H3 = 1;
            }
            this.O3 = true;
            if (!this.K3) {
                C0();
                return false;
            }
            try {
                if (!this.f55377x3) {
                    this.L3 = true;
                    this.f55349i3.queueInputBuffer(this.B3, 0, 0, 0L, 4);
                    L0();
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                throw androidx.media2.exoplayer.external.i.c(e10, j());
            }
        }
        if (this.R3 && !this.f55360o.v()) {
            this.f55360o.o();
            if (this.H3 == 2) {
                this.H3 = 1;
            }
            return true;
        }
        this.R3 = false;
        boolean zE = this.f55360o.E();
        boolean zR0 = R0(zE);
        this.Q3 = zR0;
        if (zR0) {
            return false;
        }
        if (this.f55366q3 && !zE) {
            t.b(this.f55360o.f53789c);
            if (this.f55360o.f53789c.position() == 0) {
                return true;
            }
            this.f55366q3 = false;
        }
        try {
            androidx.media2.exoplayer.external.decoder.e eVar = this.f55360o;
            long j10 = eVar.f53790d;
            if (eVar.s()) {
                this.f55375w.add(Long.valueOf(j10));
            }
            if (this.S3) {
                this.f55373v.a(j10, this.Y);
                this.S3 = false;
            }
            this.N3 = Math.max(this.N3, j10);
            this.f55360o.D();
            if (this.f55360o.r()) {
                p0(this.f55360o);
            }
            B0(this.f55360o);
            if (zE) {
                this.f55349i3.queueSecureInputBuffer(this.B3, 0, m0(this.f55360o, iPosition), j10, 0);
            } else {
                this.f55349i3.queueInputBuffer(this.B3, 0, this.f55360o.f53789c.limit(), j10, 0);
            }
            L0();
            this.K3 = true;
            this.H3 = 0;
            this.T3.f53778c++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            throw androidx.media2.exoplayer.external.i.c(e11, j());
        }
    }

    private List<androidx.media2.exoplayer.external.mediacodec.a> e0(boolean mediaCryptoRequiresSecureDecoder) throws h.c {
        List<androidx.media2.exoplayer.external.mediacodec.a> listK0 = k0(this.f55350j, this.Y, mediaCryptoRequiresSecureDecoder);
        if (!listK0.isEmpty() || !mediaCryptoRequiresSecureDecoder) {
            return listK0;
        }
        List<androidx.media2.exoplayer.external.mediacodec.a> listK1 = k0(this.f55350j, this.Y, false);
        if (!listK1.isEmpty()) {
            String str = this.Y.f53103i;
            String strValueOf = String.valueOf(listK1);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 99 + strValueOf.length());
            sb2.append("Drm session requires secure decoder for ");
            sb2.append(str);
            sb2.append(", but no secure decoder available. Trying to proceed with ");
            sb2.append(strValueOf);
            sb2.append(".");
            androidx.media2.exoplayer.external.util.p.l(V3, sb2.toString());
        }
        return listK1;
    }

    private void g0(MediaCodec codec) {
        if (q0.f57626a < 21) {
            this.f55378y3 = codec.getInputBuffers();
            this.f55379z3 = codec.getOutputBuffers();
        }
    }

    private static MediaCodec.CryptoInfo m0(androidx.media2.exoplayer.external.decoder.e buffer, int adaptiveReconfigurationBytes) {
        MediaCodec.CryptoInfo cryptoInfoA = buffer.f53788b.a();
        if (adaptiveReconfigurationBytes == 0) {
            return cryptoInfoA;
        }
        if (cryptoInfoA.numBytesOfClearData == null) {
            cryptoInfoA.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA.numBytesOfClearData;
        iArr[0] = iArr[0] + adaptiveReconfigurationBytes;
        return cryptoInfoA;
    }

    private ByteBuffer n0(int inputIndex) {
        return q0.f57626a >= 21 ? this.f55349i3.getInputBuffer(inputIndex) : this.f55378y3[inputIndex];
    }

    private ByteBuffer o0(int outputIndex) {
        return q0.f57626a >= 21 ? this.f55349i3.getOutputBuffer(outputIndex) : this.f55379z3[outputIndex];
    }

    private boolean q0() {
        return this.C3 >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    private void r0(androidx.media2.exoplayer.external.mediacodec.a codecInfo, MediaCrypto crypto) throws Exception {
        b bVar;
        Exception exc;
        String strConcat;
        String str = codecInfo.f55319a;
        float fJ0 = q0.f57626a < 23 ? -1.0f : j0(this.f55348h3, this.Y, m());
        float f10 = fJ0 <= this.f55358n ? -1.0f : fJ0;
        MediaCodec mediaCodec = null;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                try {
                    strConcat = "createCodec:".concat(strValueOf);
                } catch (Exception e10) {
                    exc = e10;
                    bVar = this;
                    if (mediaCodec != null) {
                        throw exc;
                    }
                    bVar.K0();
                    mediaCodec.release();
                    throw exc;
                }
            } else {
                strConcat = new String("createCodec:");
            }
            l0.a(strConcat);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                l0.c();
                l0.a("configureCodec");
                bVar = this;
                try {
                    bVar.T(codecInfo, mediaCodecCreateByCodecName, this.Y, crypto, f10);
                    try {
                        l0.c();
                        l0.a("startCodec");
                        mediaCodecCreateByCodecName.start();
                        l0.c();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        bVar.g0(mediaCodecCreateByCodecName);
                        bVar.f55349i3 = mediaCodecCreateByCodecName;
                        bVar.f55359n3 = codecInfo;
                        bVar.f55353k3 = f10;
                        bVar.f55351j3 = bVar.Y;
                        bVar.f55361o3 = bVar.L(str);
                        bVar.f55365p3 = S(str);
                        bVar.f55366q3 = M(str, bVar.f55351j3);
                        bVar.f55367r3 = Q(str);
                        bVar.f55369s3 = N(str);
                        bVar.f55371t3 = O(str);
                        bVar.f55372u3 = R(str, bVar.f55351j3);
                        bVar.f55377x3 = P(codecInfo) || bVar.i0();
                        bVar.L0();
                        bVar.M0();
                        bVar.A3 = bVar.getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        bVar.G3 = false;
                        bVar.H3 = 0;
                        bVar.L3 = false;
                        bVar.K3 = false;
                        bVar.I3 = 0;
                        bVar.J3 = 0;
                        bVar.f55374v3 = false;
                        bVar.f55376w3 = false;
                        bVar.E3 = false;
                        bVar.F3 = false;
                        bVar.R3 = true;
                        bVar.T3.f53776a++;
                        bVar.x0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                    } catch (Exception e11) {
                        e = e11;
                        bVar = bVar;
                        exc = e;
                        mediaCodec = mediaCodecCreateByCodecName;
                        if (mediaCodec != null) {
                            throw exc;
                        }
                        bVar.K0();
                        mediaCodec.release();
                        throw exc;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                bVar = this;
            }
        } catch (Exception e14) {
            bVar = this;
            exc = e14;
        }
    }

    private boolean s0(long presentationTimeUs) {
        int size = this.f55375w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f55375w.get(i10).longValue() == presentationTimeUs) {
                this.f55375w.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean t0(IllegalStateException error) {
        if (q0.f57626a >= 21 && u0(error)) {
            return true;
        }
        StackTraceElement[] stackTrace = error.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @e.b(21)
    private static boolean u0(IllegalStateException error) {
        return error instanceof MediaCodec.CodecException;
    }

    private void w0(MediaCrypto crypto, boolean mediaCryptoRequiresSecureDecoder) throws c {
        if (this.f55355l3 == null) {
            try {
                List<androidx.media2.exoplayer.external.mediacodec.a> listE0 = e0(mediaCryptoRequiresSecureDecoder);
                ArrayDeque<androidx.media2.exoplayer.external.mediacodec.a> arrayDeque = new ArrayDeque<>();
                this.f55355l3 = arrayDeque;
                if (this.f55356m) {
                    arrayDeque.addAll(listE0);
                } else if (!listE0.isEmpty()) {
                    this.f55355l3.add(listE0.get(0));
                }
                this.f55357m3 = null;
            } catch (h.c e10) {
                throw new c(this.Y, e10, mediaCryptoRequiresSecureDecoder, -49998);
            }
        }
        if (this.f55355l3.isEmpty()) {
            throw new c(this.Y, (Throwable) null, mediaCryptoRequiresSecureDecoder, -49999);
        }
        while (this.f55349i3 == null) {
            androidx.media2.exoplayer.external.mediacodec.a aVarPeekFirst = this.f55355l3.peekFirst();
            if (!Q0(aVarPeekFirst)) {
                return;
            }
            try {
                r0(aVarPeekFirst, crypto);
            } catch (Exception e11) {
                String strValueOf = String.valueOf(aVarPeekFirst);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 30);
                sb2.append("Failed to initialize decoder: ");
                sb2.append(strValueOf);
                androidx.media2.exoplayer.external.util.p.m(V3, sb2.toString(), e11);
                this.f55355l3.removeFirst();
                c cVar = new c(this.Y, e11, mediaCryptoRequiresSecureDecoder, aVarPeekFirst);
                if (this.f55357m3 == null) {
                    this.f55357m3 = cVar;
                } else {
                    this.f55357m3 = this.f55357m3.c(cVar);
                }
                if (this.f55355l3.isEmpty()) {
                    throw this.f55357m3;
                }
            }
        }
        this.f55355l3 = null;
    }

    protected void A0(long presentationTimeUs) {
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void B(boolean joining) throws androidx.media2.exoplayer.external.i {
        this.T3 = new androidx.media2.exoplayer.external.decoder.d();
    }

    protected void B0(androidx.media2.exoplayer.external.decoder.e buffer) {
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void C(long positionUs, boolean joining) throws androidx.media2.exoplayer.external.i {
        this.O3 = false;
        this.P3 = false;
        c0();
        this.f55373v.c();
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void D() {
        try {
            I0();
            O0(null);
        } catch (Throwable th2) {
            O0(null);
            throw th2;
        }
    }

    protected abstract boolean D0(long positionUs, long elapsedRealtimeUs, MediaCodec codec, ByteBuffer buffer, int bufferIndex, int bufferFlags, long bufferPresentationTimeUs, boolean isDecodeOnlyBuffer, boolean isLastBuffer, Format format) throws androidx.media2.exoplayer.external.i;

    @Override // androidx.media2.exoplayer.external.b
    protected void E() {
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void F() {
    }

    protected void I0() {
        this.f55355l3 = null;
        this.f55359n3 = null;
        this.f55351j3 = null;
        L0();
        M0();
        K0();
        this.Q3 = false;
        this.A3 = -9223372036854775807L;
        this.f55375w.clear();
        this.N3 = -9223372036854775807L;
        this.M3 = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.f55349i3;
            if (mediaCodec != null) {
                this.T3.f53777b++;
                try {
                    mediaCodec.stop();
                    this.f55349i3.release();
                } catch (Throwable th2) {
                    this.f55349i3.release();
                    throw th2;
                }
            }
            this.f55349i3 = null;
            try {
                MediaCrypto mediaCrypto = this.H1;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                this.H1 = null;
                this.f55364p2 = false;
            } finally {
                this.H1 = null;
                this.f55364p2 = false;
                N0(null);
            }
        } catch (Throwable th3) {
            this.f55349i3 = null;
            try {
                MediaCrypto mediaCrypto2 = this.H1;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                this.H1 = null;
                this.f55364p2 = false;
                N0(null);
                throw th3;
            } catch (Throwable th4) {
                this.H1 = null;
                this.f55364p2 = false;
                N0(null);
                throw th4;
            }
        }
    }

    protected void J0() throws androidx.media2.exoplayer.external.i {
    }

    protected int K(MediaCodec codec, androidx.media2.exoplayer.external.mediacodec.a codecInfo, Format oldFormat, Format newFormat) {
        return 0;
    }

    protected boolean Q0(androidx.media2.exoplayer.external.mediacodec.a codecInfo) {
        return true;
    }

    protected abstract int S0(androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, @p0 r<v> drmSessionManager, Format format) throws h.c;

    protected abstract void T(androidx.media2.exoplayer.external.mediacodec.a codecInfo, MediaCodec codec, Format format, @p0 MediaCrypto crypto, float codecOperatingRate);

    protected C0513b U(Throwable cause, @p0 androidx.media2.exoplayer.external.mediacodec.a codecInfo) {
        return new C0513b(cause, codecInfo);
    }

    @p0
    protected final Format V0(long presentationTimeUs) {
        Format formatI = this.f55373v.i(presentationTimeUs);
        if (formatI != null) {
            this.Z = formatI;
        }
        return formatI;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        return this.P3;
    }

    public void a0(long renderTimeLimitMs) {
        this.f55347g3 = renderTimeLimitMs;
    }

    @Override // androidx.media2.exoplayer.external.u0
    public final int b(Format format) throws androidx.media2.exoplayer.external.i {
        try {
            return S0(this.f55350j, this.f55352k, format);
        } catch (h.c e10) {
            throw androidx.media2.exoplayer.external.i.c(e10, j());
        }
    }

    protected final boolean c0() throws androidx.media2.exoplayer.external.i {
        boolean zD0 = d0();
        if (zD0) {
            v0();
        }
        return zD0;
    }

    protected boolean d0() {
        MediaCodec mediaCodec = this.f55349i3;
        if (mediaCodec == null) {
            return false;
        }
        if (this.J3 != 3 && !this.f55367r3 && (!this.f55369s3 || !this.L3)) {
            mediaCodec.flush();
            L0();
            M0();
            this.A3 = -9223372036854775807L;
            this.L3 = false;
            this.K3 = false;
            this.R3 = true;
            this.f55374v3 = false;
            this.f55376w3 = false;
            this.E3 = false;
            this.F3 = false;
            this.Q3 = false;
            this.f55375w.clear();
            this.N3 = -9223372036854775807L;
            this.M3 = -9223372036854775807L;
            this.I3 = 0;
            this.J3 = 0;
            this.H3 = this.G3 ? 1 : 0;
            return false;
        }
        I0();
        return true;
    }

    protected final MediaCodec f0() {
        return this.f55349i3;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void g(long positionUs, long elapsedRealtimeUs) throws androidx.media2.exoplayer.external.i {
        try {
            if (this.P3) {
                J0();
                return;
            }
            if (this.Y != null || G0(true)) {
                v0();
                if (this.f55349i3 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    l0.a("drainAndFeed");
                    while (Z(positionUs, elapsedRealtimeUs)) {
                    }
                    while (b0() && P0(jElapsedRealtime)) {
                    }
                    l0.c();
                } else {
                    this.T3.f53779d += I(positionUs);
                    G0(false);
                }
                this.T3.a();
            }
        } catch (IllegalStateException e10) {
            if (!t0(e10)) {
                throw e10;
            }
            throw androidx.media2.exoplayer.external.i.c(U(e10, h0()), j());
        }
    }

    @p0
    protected final androidx.media2.exoplayer.external.mediacodec.a h0() {
        return this.f55359n3;
    }

    protected boolean i0() {
        return false;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        if (this.Y == null || this.Q3) {
            return false;
        }
        if (n() || q0()) {
            return true;
        }
        return this.A3 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.A3;
    }

    protected float j0(float operatingRate, Format format, Format[] streamFormats) {
        return -1.0f;
    }

    protected abstract List<androidx.media2.exoplayer.external.mediacodec.a> k0(androidx.media2.exoplayer.external.mediacodec.c mediaCodecSelector, Format format, boolean requiresSecureDecoder) throws h.c;

    @Override // androidx.media2.exoplayer.external.b, androidx.media2.exoplayer.external.u0
    public final int l() {
        return 8;
    }

    protected long l0() {
        return 0L;
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void o() {
        this.Y = null;
        if (this.f55363p1 == null && this.f55362p0 == null) {
            d0();
        } else {
            D();
        }
    }

    protected void p0(androidx.media2.exoplayer.external.decoder.e buffer) throws androidx.media2.exoplayer.external.i {
    }

    protected final void v0() throws androidx.media2.exoplayer.external.i {
        if (this.f55349i3 != null || this.Y == null) {
            return;
        }
        N0(this.f55363p1);
        String str = this.Y.f53103i;
        p<v> pVar = this.f55362p0;
        if (pVar != null) {
            if (this.H1 == null) {
                v vVar = (v) pVar.W();
                if (vVar != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(vVar.f53910a, vVar.f53911b);
                        this.H1 = mediaCrypto;
                        this.f55364p2 = !vVar.f53912c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw androidx.media2.exoplayer.external.i.c(e10, j());
                    }
                } else if (this.f55362p0.T() == null) {
                    return;
                }
            }
            if (V()) {
                int state = this.f55362p0.getState();
                if (state == 1) {
                    throw androidx.media2.exoplayer.external.i.c(this.f55362p0.T(), j());
                }
                int i10 = 2 & 4;
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            w0(this.H1, this.f55364p2);
        } catch (c e11) {
            throw androidx.media2.exoplayer.external.i.c(e11, j());
        }
    }

    protected void x0(String name, long initializedTimestampMs, long initializationDurationMs) {
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Multi-variable type inference failed */
    protected void y0(d0 formatHolder) throws androidx.media2.exoplayer.external.i {
        Format format = this.Y;
        Format format2 = formatHolder.f53762c;
        this.Y = format2;
        boolean z10 = true;
        this.S3 = true;
        if (!q0.b(format2.f53108l, format == null ? null : format.f53108l)) {
            if (format2.f53108l == null) {
                O0(null);
            } else if (formatHolder.f53760a) {
                O0(formatHolder.f53761b);
            } else {
                r<v> rVar = this.f55352k;
                if (rVar == null) {
                    throw androidx.media2.exoplayer.external.i.c(new IllegalStateException("Media requires a DrmSessionManager"), j());
                }
                p pVarD = rVar.d(Looper.myLooper(), format2.f53108l);
                p<v> pVar = this.f55363p1;
                if (pVar != null) {
                    pVar.X();
                }
                this.f55363p1 = pVarD;
            }
        }
        MediaCodec mediaCodec = this.f55349i3;
        if (mediaCodec == null) {
            v0();
            return;
        }
        p<v> pVar2 = this.f55363p1;
        if ((pVar2 == null && this.f55362p0 != null) || ((pVar2 != null && this.f55362p0 == null) || ((pVar2 != null && !this.f55359n3.f55325g) || (q0.f57626a < 23 && pVar2 != this.f55362p0)))) {
            X();
            return;
        }
        int iK = K(mediaCodec, this.f55359n3, this.f55351j3, format2);
        if (iK == 0) {
            X();
            return;
        }
        if (iK == 1) {
            this.f55351j3 = format2;
            T0();
            if (this.f55363p1 != this.f55362p0) {
                Y();
                return;
            } else {
                W();
                return;
            }
        }
        if (iK != 2) {
            if (iK != 3) {
                throw new IllegalStateException();
            }
            this.f55351j3 = format2;
            T0();
            if (this.f55363p1 != this.f55362p0) {
                Y();
                return;
            }
            return;
        }
        if (this.f55365p3) {
            X();
            return;
        }
        this.G3 = true;
        this.H3 = 1;
        int i10 = this.f55361o3;
        if (i10 != 2) {
            if (i10 == 1) {
                int i11 = format2.f53110n;
                Format format3 = this.f55351j3;
                if (i11 != format3.f53110n || format2.f53111o != format3.f53111o) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        this.f55374v3 = z10;
        this.f55351j3 = format2;
        T0();
        if (this.f55363p1 != this.f55362p0) {
            Y();
        }
    }

    @Override // androidx.media2.exoplayer.external.b, androidx.media2.exoplayer.external.t0
    public final void z(float operatingRate) throws androidx.media2.exoplayer.external.i {
        this.f55348h3 = operatingRate;
        if (this.f55349i3 != null && this.J3 != 3 && getState() != 0) {
            T0();
        }
    }

    protected void z0(MediaCodec codec, MediaFormat outputFormat) throws androidx.media2.exoplayer.external.i {
    }

    public static class c extends Exception {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f55382f = -50000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f55383g = -49999;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f55384h = -49998;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f55386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final androidx.media2.exoplayer.external.mediacodec.a f55387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f55388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final c f55389e;

        public c(Format format, Throwable cause, boolean secureDecoderRequired, int errorCode) {
            String strValueOf = String.valueOf(format);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
            sb2.append("Decoder init failed: [");
            sb2.append(errorCode);
            sb2.append("], ");
            sb2.append(strValueOf);
            this(sb2.toString(), cause, format.f53103i, secureDecoderRequired, null, b(errorCode), null);
        }

        private static String b(int errorCode) {
            String str = errorCode < 0 ? "neg_" : "";
            int iAbs = Math.abs(errorCode);
            StringBuilder sb2 = new StringBuilder(str.length() + 76);
            sb2.append("androidx.media2.exoplayer.external.mediacodec.MediaCodecRenderer_");
            sb2.append(str);
            sb2.append(iAbs);
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.j
        public c c(c fallbackException) {
            return new c(getMessage(), getCause(), this.f55385a, this.f55386b, this.f55387c, this.f55388d, fallbackException);
        }

        @e.b(21)
        private static String d(Throwable cause) {
            if (cause instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) cause).getDiagnosticInfo();
            }
            return null;
        }

        public c(Format format, Throwable cause, boolean secureDecoderRequired, androidx.media2.exoplayer.external.mediacodec.a mediaCodecInfo) {
            String str = mediaCodecInfo.f55319a;
            String strValueOf = String.valueOf(format);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
            sb2.append("Decoder init failed: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(strValueOf);
            this(sb2.toString(), cause, format.f53103i, secureDecoderRequired, mediaCodecInfo, q0.f57626a >= 21 ? d(cause) : null, null);
        }

        private c(String message, Throwable cause, String mimeType, boolean secureDecoderRequired, @p0 androidx.media2.exoplayer.external.mediacodec.a mediaCodecInfo, @p0 String diagnosticInfo, @p0 c fallbackDecoderInitializationException) {
            super(message, cause);
            this.f55385a = mimeType;
            this.f55386b = secureDecoderRequired;
            this.f55387c = mediaCodecInfo;
            this.f55388d = diagnosticInfo;
            this.f55389e = fallbackDecoderInitializationException;
        }
    }
}
