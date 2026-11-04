package androidx.media3.exoplayer.analytics;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.n4;
import com.google.common.collect.l6;
import com.google.common.collect.nb;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@androidx.annotation.w0(31)
public final class f4 implements androidx.media3.exoplayer.analytics.b, g4.a {

    @androidx.annotation.p0
    private androidx.media3.common.x0 B0;

    @androidx.annotation.p0
    private b C0;

    @androidx.annotation.p0
    private b D0;

    @androidx.annotation.p0
    private b E0;

    @androidx.annotation.p0
    private androidx.media3.common.w F0;

    @androidx.annotation.p0
    private androidx.media3.common.w G0;

    @androidx.annotation.p0
    private androidx.media3.common.w H0;
    private boolean I0;
    private int J0;
    private boolean K0;
    private int L0;
    private int M0;
    private int N0;
    private boolean O0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Context f62890n0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final g4 f62892p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final PlaybackSession f62893q0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @androidx.annotation.p0
    private String f62899w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @androidx.annotation.p0
    private PlaybackMetrics.Builder f62900x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f62901y0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Executor f62891o0 = androidx.media3.common.util.c.a();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final androidx.media3.common.z3.d f62895s0 = new androidx.media3.common.z3.d();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final androidx.media3.common.z3.b f62896t0 = new androidx.media3.common.z3.b();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final HashMap<String, Long> f62898v0 = new HashMap<>();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final HashMap<String, Long> f62897u0 = new HashMap<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final long f62894r0 = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f62902z0 = 0;
    private int A0 = 0;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62904b;

        public a(int i10, int i11) {
            this.f62903a = i10;
            this.f62904b = i11;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.w f62905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62907c;

        public b(androidx.media3.common.w wVar, int i10, String str) {
            this.f62905a = wVar;
            this.f62906b = i10;
            this.f62907c = str;
        }
    }

    private f4(Context context, PlaybackSession playbackSession) {
        this.f62890n0 = context.getApplicationContext();
        this.f62893q0 = playbackSession;
        y1 y1Var = new y1();
        this.f62892p0 = y1Var;
        y1Var.b(this);
    }

    @il.e(expression = {"#1"}, result = true)
    private boolean I0(@androidx.annotation.p0 b bVar) {
        return bVar != null && bVar.f62907c.equals(this.f62892p0.d());
    }

    @androidx.annotation.p0
    public static f4 J0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = a3.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new f4(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void K0() {
        PlaybackMetrics.Builder builder = this.f62900x0;
        if (builder != null && this.O0) {
            builder.setAudioUnderrunCount(this.N0);
            this.f62900x0.setVideoFramesDropped(this.L0);
            this.f62900x0.setVideoFramesPlayed(this.M0);
            Long l10 = this.f62897u0.get(this.f62899w0);
            this.f62900x0.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f62898v0.get(this.f62899w0);
            this.f62900x0.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f62900x0.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f62900x0.build();
            this.f62891o0.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.d4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62873a.f62893q0.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f62900x0 = null;
        this.f62899w0 = null;
        this.N0 = 0;
        this.L0 = 0;
        this.M0 = 0;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.O0 = false;
    }

    @e.a({"SwitchIntDef"})
    private static int L0(int i10) {
        switch (androidx.media3.common.util.k1.t0(i10)) {
            case androidx.media3.common.x0.B3 /* 6002 */:
                return 24;
            case androidx.media3.common.x0.C3 /* 6003 */:
                return 28;
            case androidx.media3.common.x0.D3 /* 6004 */:
                return 25;
            case androidx.media3.common.x0.E3 /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    @androidx.annotation.p0
    private static DrmInitData M0(l6<androidx.media3.common.i4.a> l6Var) {
        DrmInitData drmInitData;
        nb<androidx.media3.common.i4.a> it = l6Var.iterator();
        while (it.hasNext()) {
            androidx.media3.common.i4.a next = it.next();
            for (int i10 = 0; i10 < next.f60646a; i10++) {
                if (next.k(i10) && (drmInitData = next.d(i10).f61765s) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int N0(DrmInitData drmInitData) {
        for (int i10 = 0; i10 < drmInitData.f60268d; i10++) {
            UUID uuid = drmInitData.f(i10).f60270b;
            if (uuid.equals(androidx.media3.common.j.f60719n2)) {
                return 3;
            }
            if (uuid.equals(androidx.media3.common.j.f60724o2)) {
                return 2;
            }
            if (uuid.equals(androidx.media3.common.j.f60714m2)) {
                return 6;
            }
        }
        return 1;
    }

    private static a O0(androidx.media3.common.x0 x0Var, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (x0Var.f61851a == 1001) {
            return new a(20, 0);
        }
        if (x0Var instanceof androidx.media3.exoplayer.s0) {
            androidx.media3.exoplayer.s0 s0Var = (androidx.media3.exoplayer.s0) x0Var;
            z11 = s0Var.S3 == 1;
            i10 = s0Var.W3;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) androidx.media3.common.util.a.g(x0Var.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof androidx.media3.exoplayer.mediacodec.v.c) {
                return new a(13, androidx.media3.common.util.k1.u0(((androidx.media3.exoplayer.mediacodec.v.c) th2).f64212d));
            }
            if (th2 instanceof androidx.media3.exoplayer.mediacodec.s) {
                return new a(14, ((androidx.media3.exoplayer.mediacodec.s) th2).f64136c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof androidx.media3.exoplayer.audio.x.c) {
                return new a(17, ((androidx.media3.exoplayer.audio.x.c) th2).f63446a);
            }
            if (th2 instanceof androidx.media3.exoplayer.audio.x.h) {
                return new a(18, ((androidx.media3.exoplayer.audio.x.h) th2).f63451a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(L0(errorCode), errorCode);
        }
        if (th2 instanceof androidx.media3.datasource.g0.f) {
            return new a(5, ((androidx.media3.datasource.g0.f) th2).f62493h);
        }
        if ((th2 instanceof androidx.media3.datasource.g0.e) || (th2 instanceof androidx.media3.common.v0)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th2 instanceof androidx.media3.datasource.g0.d;
        if (!z12 && !(th2 instanceof androidx.media3.datasource.s1.a)) {
            if (x0Var.f61851a == 1002) {
                return new a(21, 0);
            }
            if (!(th2 instanceof androidx.media3.exoplayer.drm.m.a)) {
                if (!(th2 instanceof androidx.media3.datasource.d0.b) || !(th2.getCause() instanceof FileNotFoundException)) {
                    return new a(9, 0);
                }
                Throwable cause = ((Throwable) androidx.media3.common.util.a.g(th2.getCause())).getCause();
                return ((cause instanceof ErrnoException) && ((ErrnoException) cause).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
            }
            Throwable th3 = (Throwable) androidx.media3.common.util.a.g(th2.getCause());
            if (th3 instanceof MediaDrm.MediaDrmStateException) {
                int iU0 = androidx.media3.common.util.k1.u0(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
                return new a(L0(iU0), iU0);
            }
            if (androidx.media3.common.util.k1.f61540a >= 23 && (th3 instanceof MediaDrmResetException)) {
                return new a(27, 0);
            }
            if (th3 instanceof NotProvisionedException) {
                return new a(24, 0);
            }
            if (th3 instanceof DeniedByServerException) {
                return new a(29, 0);
            }
            if (th3 instanceof androidx.media3.exoplayer.drm.w0) {
                return new a(23, 0);
            }
            return th3 instanceof androidx.media3.exoplayer.drm.h.e ? new a(28, 0) : new a(30, 0);
        }
        if (androidx.media3.common.util.e0.e(context).g() == 1) {
            return new a(3, 0);
        }
        Throwable cause2 = th2.getCause();
        if (cause2 instanceof UnknownHostException) {
            return new a(6, 0);
        }
        if (cause2 instanceof SocketTimeoutException) {
            return new a(7, 0);
        }
        return (z12 && ((androidx.media3.datasource.g0.d) th2).f62491d == 1) ? new a(4, 0) : new a(8, 0);
    }

    private static Pair<String, String> P0(String str) {
        String[] strArrL2 = androidx.media3.common.util.k1.l2(str, "-");
        return Pair.create(strArrL2[0], strArrL2.length >= 2 ? strArrL2[1] : null);
    }

    private static int R0(Context context) {
        switch (androidx.media3.common.util.e0.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int S0(androidx.media3.common.k0 k0Var) {
        androidx.media3.common.k0.h hVar = k0Var.f60822b;
        if (hVar == null) {
            return 0;
        }
        int iA1 = androidx.media3.common.util.k1.a1(hVar.f60920a, hVar.f60921b);
        if (iA1 == 0) {
            return 3;
        }
        if (iA1 != 1) {
            return iA1 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int T0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void U0(androidx.media3.exoplayer.analytics.b.c cVar) {
        for (int i10 = 0; i10 < cVar.e(); i10++) {
            int iC = cVar.c(i10);
            androidx.media3.exoplayer.analytics.b.C0577b c0577bD = cVar.d(iC);
            if (iC == 0) {
                this.f62892p0.g(c0577bD);
            } else if (iC == 11) {
                this.f62892p0.c(c0577bD, this.f62901y0);
            } else {
                this.f62892p0.a(c0577bD);
            }
        }
    }

    private void V0(long j10) {
        int iR0 = R0(this.f62890n0);
        if (iR0 != this.A0) {
            this.A0 = iR0;
            final NetworkEvent networkEventBuild = q3.a().setNetworkType(iR0).setTimeSinceCreatedMillis(j10 - this.f62894r0).build();
            this.f62891o0.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.b4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62853a.f62893q0.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    private void W0(long j10) {
        androidx.media3.common.x0 x0Var = this.B0;
        if (x0Var == null) {
            return;
        }
        a aVarO0 = O0(x0Var, this.f62890n0, this.J0 == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = t3.a().setTimeSinceCreatedMillis(j10 - this.f62894r0).setErrorCode(aVarO0.f62903a).setSubErrorCode(aVarO0.f62904b).setException(x0Var).build();
        this.f62891o0.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.c4
            @Override // java.lang.Runnable
            public final void run() {
                this.f62863a.f62893q0.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.O0 = true;
        this.B0 = null;
    }

    private void X0(androidx.media3.common.z0 z0Var, androidx.media3.exoplayer.analytics.b.c cVar, long j10) {
        if (z0Var.H() != 2) {
            this.I0 = false;
        }
        if (z0Var.a() == null) {
            this.K0 = false;
        } else if (cVar.a(10)) {
            this.K0 = true;
        }
        int iF1 = f1(z0Var);
        if (this.f62902z0 != iF1) {
            this.f62902z0 = iF1;
            this.O0 = true;
            final PlaybackStateEvent playbackStateEventBuild = u3.a().setState(this.f62902z0).setTimeSinceCreatedMillis(j10 - this.f62894r0).build();
            this.f62891o0.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.e4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62881a.f62893q0.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    private void Y0(androidx.media3.common.z0 z0Var, androidx.media3.exoplayer.analytics.b.c cVar, long j10) {
        if (cVar.a(2)) {
            androidx.media3.common.i4 i4VarM0 = z0Var.M0();
            boolean zE = i4VarM0.e(2);
            boolean zE2 = i4VarM0.e(1);
            boolean zE3 = i4VarM0.e(3);
            if (zE || zE2 || zE3) {
                if (!zE) {
                    d1(j10, null, 0);
                }
                if (!zE2) {
                    Z0(j10, null, 0);
                }
                if (!zE3) {
                    b1(j10, null, 0);
                }
            }
        }
        if (I0(this.C0)) {
            b bVar = this.C0;
            androidx.media3.common.w wVar = bVar.f62905a;
            if (wVar.f61769w != -1) {
                d1(j10, wVar, bVar.f62906b);
                this.C0 = null;
            }
        }
        if (I0(this.D0)) {
            b bVar2 = this.D0;
            Z0(j10, bVar2.f62905a, bVar2.f62906b);
            this.D0 = null;
        }
        if (I0(this.E0)) {
            b bVar3 = this.E0;
            b1(j10, bVar3.f62905a, bVar3.f62906b);
            this.E0 = null;
        }
    }

    private void Z0(long j10, @androidx.annotation.p0 androidx.media3.common.w wVar, int i10) {
        if (Objects.equals(this.G0, wVar)) {
            return;
        }
        if (this.G0 == null && i10 == 0) {
            i10 = 1;
        }
        this.G0 = wVar;
        e1(0, j10, wVar, i10);
    }

    private void a1(androidx.media3.common.z0 z0Var, androidx.media3.exoplayer.analytics.b.c cVar) {
        DrmInitData drmInitDataM0;
        if (cVar.a(0)) {
            androidx.media3.exoplayer.analytics.b.C0577b c0577bD = cVar.d(0);
            if (this.f62900x0 != null) {
                c1(c0577bD.f62839b, c0577bD.f62841d);
            }
        }
        if (cVar.a(2) && this.f62900x0 != null && (drmInitDataM0 = M0(z0Var.M0().c())) != null) {
            q2.a(androidx.media3.common.util.k1.o(this.f62900x0)).setDrmType(N0(drmInitDataM0));
        }
        if (cVar.a(1011)) {
            this.N0++;
        }
    }

    private void b1(long j10, @androidx.annotation.p0 androidx.media3.common.w wVar, int i10) {
        if (Objects.equals(this.H0, wVar)) {
            return;
        }
        if (this.H0 == null && i10 == 0) {
            i10 = 1;
        }
        this.H0 = wVar;
        e1(2, j10, wVar, i10);
    }

    @il.m({"metricsBuilder"})
    private void c1(androidx.media3.common.z3 z3Var, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
        int iF;
        PlaybackMetrics.Builder builder = this.f62900x0;
        if (bVar == null || (iF = z3Var.f(bVar.f65467a)) == -1) {
            return;
        }
        z3Var.j(iF, this.f62896t0);
        z3Var.t(this.f62896t0.f61969c, this.f62895s0);
        builder.setStreamType(S0(this.f62895s0.f61990c));
        androidx.media3.common.z3.d dVar = this.f62895s0;
        if (dVar.f62000m != -9223372036854775807L && !dVar.f61998k && !dVar.f61996i && !dVar.i()) {
            builder.setMediaDurationMillis(this.f62895s0.e());
        }
        builder.setPlaybackType(this.f62895s0.i() ? 2 : 1);
        this.O0 = true;
    }

    private void d1(long j10, @androidx.annotation.p0 androidx.media3.common.w wVar, int i10) {
        if (Objects.equals(this.F0, wVar)) {
            return;
        }
        if (this.F0 == null && i10 == 0) {
            i10 = 1;
        }
        this.F0 = wVar;
        e1(1, j10, wVar, i10);
    }

    private void e1(int i10, long j10, @androidx.annotation.p0 androidx.media3.common.w wVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = p3.a(i10).setTimeSinceCreatedMillis(j10 - this.f62894r0);
        if (wVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(T0(i11));
            String str = wVar.f61760n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = wVar.f61761o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = wVar.f61757k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = wVar.f61756j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = wVar.f61768v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = wVar.f61769w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = wVar.E;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = wVar.F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = wVar.f61750d;
            if (str4 != null) {
                Pair<String, String> pairP0 = P0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairP0.first);
                Object obj = pairP0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = wVar.f61770x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.O0 = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f62891o0.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.a4
            @Override // java.lang.Runnable
            public final void run() {
                this.f62797a.f62893q0.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private int f1(androidx.media3.common.z0 z0Var) {
        int iH = z0Var.H();
        if (this.I0) {
            return 5;
        }
        if (this.K0) {
            return 13;
        }
        if (iH == 4) {
            return 11;
        }
        if (iH == 2) {
            int i10 = this.f62902z0;
            if (i10 != 0 && i10 != 2 && i10 != 12) {
                if (z0Var.J()) {
                    return z0Var.V1() != 0 ? 10 : 6;
                }
                return 7;
            }
            return 2;
        }
        if (iH == 3) {
            if (z0Var.J()) {
                return z0Var.V1() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iH != 1 || this.f62902z0 == 0) {
            return this.f62902z0;
        }
        return 12;
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void B0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str) {
        androidx.media3.exoplayer.source.t0.b bVar = c0577b.f62841d;
        if (bVar == null || !bVar.c()) {
            K0();
            this.f62899w0 = str;
            this.f62900x0 = s3.a().setPlayerName(androidx.media3.common.p0.f61019a).setPlayerVersion(androidx.media3.common.p0.f61020b);
            c1(c0577b.f62839b, c0577b.f62841d);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void F(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, boolean z10) {
        androidx.media3.exoplayer.source.t0.b bVar = c0577b.f62841d;
        if ((bVar == null || !bVar.c()) && str.equals(this.f62899w0)) {
            K0();
        }
        this.f62897u0.remove(str);
        this.f62898v0.remove(str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void G(androidx.media3.exoplayer.analytics.b.C0577b c0577b, n4 n4Var) {
        b bVar = this.C0;
        if (bVar != null) {
            androidx.media3.common.w wVar = bVar.f62905a;
            if (wVar.f61769w == -1) {
                this.C0 = new b(wVar.b().B0(n4Var.f60997a).d0(n4Var.f60998b).N(), bVar.f62906b, bVar.f62907c);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void J(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.exoplayer.source.h0 h0Var) {
        if (c0577b.f62841d != null) {
            b bVar = new b((androidx.media3.common.w) androidx.media3.common.util.a.g(h0Var.f65067c), h0Var.f65068d, this.f62892p0.e(c0577b.f62839b, (androidx.media3.exoplayer.source.t0.b) androidx.media3.common.util.a.g(c0577b.f62841d)));
            int i10 = h0Var.f65066b;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.D0 = bVar;
                    return;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        this.E0 = bVar;
                        return;
                    }
                }
            }
            this.C0 = bVar;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void K(androidx.media3.common.z0 z0Var, androidx.media3.exoplayer.analytics.b.c cVar) {
        if (cVar.e() == 0) {
            return;
        }
        U0(cVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a1(z0Var, cVar);
        W0(jElapsedRealtime);
        Y0(z0Var, cVar, jElapsedRealtime);
        V0(jElapsedRealtime);
        X0(z0Var, cVar, jElapsedRealtime);
        if (cVar.a(androidx.media3.exoplayer.analytics.b.f62814h0)) {
            this.f62892p0.h(cVar.d(androidx.media3.exoplayer.analytics.b.f62814h0));
        }
    }

    public LogSessionId Q0() {
        return this.f62893q0.getSessionId();
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void T(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.common.x0 x0Var) {
        this.B0 = x0Var;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void V(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.exoplayer.j jVar) {
        this.L0 += jVar.f63914g;
        this.M0 += jVar.f63912e;
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void a(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, String str2) {
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void b0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.common.z0.k kVar, androidx.media3.common.z0.k kVar2, int i10) {
        if (i10 == 1) {
            this.I0 = true;
        }
        this.f62901y0 = i10;
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void f(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10, long j10, long j11) {
        androidx.media3.exoplayer.source.t0.b bVar = c0577b.f62841d;
        if (bVar != null) {
            String strE = this.f62892p0.e(c0577b.f62839b, (androidx.media3.exoplayer.source.t0.b) androidx.media3.common.util.a.g(bVar));
            Long l10 = this.f62898v0.get(strE);
            Long l11 = this.f62897u0.get(strE);
            this.f62898v0.put(strE, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f62897u0.put(strE, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.b
    public void f0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var, IOException iOException, boolean z10) {
        this.J0 = h0Var.f65065a;
    }

    @Override // androidx.media3.exoplayer.analytics.g4.a
    public void z0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str) {
    }
}
