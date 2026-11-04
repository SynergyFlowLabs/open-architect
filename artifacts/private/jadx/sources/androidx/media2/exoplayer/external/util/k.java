package androidx.media2.exoplayer.external.util;

import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.z0;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class k implements androidx.media2.exoplayer.external.analytics.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f57579f = "EventLogger";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f57580g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final NumberFormat f57581h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media2.exoplayer.external.trackselection.i f57582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0.c f57584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z0.b f57585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f57586e;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f57581h = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public k(@androidx.annotation.p0 androidx.media2.exoplayer.external.trackselection.i trackSelector) {
        this(trackSelector, f57579f);
    }

    private String E(androidx.media2.exoplayer.external.analytics.c.a eventTime, String eventName, String eventDescription) {
        String strS = S(eventTime);
        StringBuilder sb2 = new StringBuilder(String.valueOf(eventName).length() + 5 + String.valueOf(strS).length() + String.valueOf(eventDescription).length());
        sb2.append(eventName);
        sb2.append(" [");
        sb2.append(strS);
        sb2.append(", ");
        sb2.append(eventDescription);
        sb2.append("]");
        return sb2.toString();
    }

    private String S(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        int i10 = eventTime.f53142c;
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("window=");
        sb2.append(i10);
        String string = sb2.toString();
        if (eventTime.f53143d != null) {
            String strValueOf = String.valueOf(string);
            int iB = eventTime.f53141b.b(eventTime.f53143d.f56507a);
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 20);
            sb3.append(strValueOf);
            sb3.append(", period=");
            sb3.append(iB);
            string = sb3.toString();
            if (eventTime.f53143d.b()) {
                String strValueOf2 = String.valueOf(string);
                int i11 = eventTime.f53143d.f56508b;
                StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 21);
                sb4.append(strValueOf2);
                sb4.append(", adGroup=");
                sb4.append(i11);
                String strValueOf3 = String.valueOf(sb4.toString());
                int i12 = eventTime.f53143d.f56509c;
                StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 16);
                sb5.append(strValueOf3);
                sb5.append(", ad=");
                sb5.append(i12);
                string = sb5.toString();
            }
        }
        String strW = W(eventTime.f53140a - this.f57586e);
        String strW2 = W(eventTime.f53145f);
        StringBuilder sb6 = new StringBuilder(String.valueOf(strW).length() + 4 + String.valueOf(strW2).length() + String.valueOf(string).length());
        sb6.append(strW);
        sb6.append(", ");
        sb6.append(strW2);
        sb6.append(", ");
        sb6.append(string);
        return sb6.toString();
    }

    private static String T(int formatSupport) {
        if (formatSupport == 0) {
            return "NO";
        }
        if (formatSupport == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (formatSupport == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (formatSupport != 3) {
            return formatSupport != 4 ? com.planner5d.library.model.payments.a.f222474i : "YES";
        }
        return "NO_EXCEEDS_CAPABILITIES";
    }

    private static String U(int repeatMode) {
        if (repeatMode == 0) {
            return "OFF";
        }
        if (repeatMode != 1) {
            return repeatMode != 2 ? com.planner5d.library.model.payments.a.f222474i : org.apache.commons.codec.language.bm.g.f335338f;
        }
        return "ONE";
    }

    private static String V(int state) {
        if (state == 1) {
            return "IDLE";
        }
        if (state == 2) {
            return "BUFFERING";
        }
        if (state != 3) {
            return state != 4 ? com.planner5d.library.model.payments.a.f222474i : "ENDED";
        }
        return "READY";
    }

    private static String W(long timeMs) {
        return timeMs == -9223372036854775807L ? com.planner5d.library.model.payments.a.f222474i : f57581h.format(timeMs / 1000.0f);
    }

    private static String X(int reason) {
        if (reason == 0) {
            return "PREPARED";
        }
        if (reason != 1) {
            return reason != 2 ? com.planner5d.library.model.payments.a.f222474i : "DYNAMIC";
        }
        return "RESET";
    }

    private static String Y(@androidx.annotation.p0 androidx.media2.exoplayer.external.trackselection.m selection, TrackGroup group, int trackIndex) {
        return Z((selection == null || selection.g() != group || selection.f(trackIndex) == -1) ? false : true);
    }

    private static String Z(boolean enabled) {
        return enabled ? "[X]" : "[ ]";
    }

    private static String a(int trackCount, int adaptiveSupport) {
        if (trackCount < 2) {
            return "N/A";
        }
        if (adaptiveSupport == 0) {
            return "NO";
        }
        if (adaptiveSupport != 8) {
            return adaptiveSupport != 16 ? com.planner5d.library.model.payments.a.f222474i : "YES";
        }
        return "YES_NOT_SEAMLESS";
    }

    private static String a0(int trackType) {
        switch (trackType) {
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "metadata";
            case 5:
                return "camera motion";
            case 6:
                return "none";
            default:
                if (trackType < 10000) {
                    return com.planner5d.library.model.payments.a.f222474i;
                }
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("custom (");
                sb2.append(trackType);
                sb2.append(")");
                return sb2.toString();
        }
    }

    private void b0(androidx.media2.exoplayer.external.analytics.c.a eventTime, String eventName) {
        d0(j(eventTime, eventName));
    }

    private static String c(int reason) {
        if (reason == 0) {
            return "PERIOD_TRANSITION";
        }
        if (reason == 1) {
            return "SEEK";
        }
        if (reason == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (reason != 3) {
            return reason != 4 ? com.planner5d.library.model.payments.a.f222474i : "INTERNAL";
        }
        return "AD_INSERTION";
    }

    private void c0(androidx.media2.exoplayer.external.analytics.c.a eventTime, String eventName, String eventDescription) {
        d0(E(eventTime, eventName, eventDescription));
    }

    private void e0(androidx.media2.exoplayer.external.analytics.c.a eventTime, String eventName, String eventDescription, @androidx.annotation.p0 Throwable throwable) {
        g0(E(eventTime, eventName, eventDescription), throwable);
    }

    private void f0(androidx.media2.exoplayer.external.analytics.c.a eventTime, String eventName, @androidx.annotation.p0 Throwable throwable) {
        g0(j(eventTime, eventName), throwable);
    }

    private void h0(androidx.media2.exoplayer.external.analytics.c.a eventTime, String type, Exception e10) {
        e0(eventTime, "internalError", type, e10);
    }

    private void i0(Metadata metadata, String prefix) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            String strValueOf = String.valueOf(metadata.c(i10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(prefix).length() + strValueOf.length());
            sb2.append(prefix);
            sb2.append(strValueOf);
            d0(sb2.toString());
        }
    }

    private String j(androidx.media2.exoplayer.external.analytics.c.a eventTime, String eventName) {
        String strS = S(eventTime);
        StringBuilder sb2 = new StringBuilder(String.valueOf(eventName).length() + 3 + String.valueOf(strS).length());
        sb2.append(eventName);
        sb2.append(" [");
        sb2.append(strS);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void A(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.source.k0.b loadEventInfo, androidx.media2.exoplayer.external.source.k0.c mediaLoadData) {
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void B(androidx.media2.exoplayer.external.analytics.c.a eventTime, int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append(bufferSize);
        sb2.append(", ");
        sb2.append(bufferSizeMs);
        sb2.append(", ");
        sb2.append(elapsedSinceLastFeedMs);
        sb2.append("]");
        e0(eventTime, "audioTrackUnderrun", sb2.toString(), null);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void C(androidx.media2.exoplayer.external.analytics.c.a eventTime, Metadata metadata) {
        String strS = S(eventTime);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strS).length() + 12);
        sb2.append("metadata [");
        sb2.append(strS);
        sb2.append(", ");
        d0(sb2.toString());
        i0(metadata, "  ");
        d0("]");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void D(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.i e10) {
        f0(eventTime, "playerFailed", e10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void F(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.m0 playbackParameters) {
        c0(eventTime, "playbackParameters", q0.B("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(playbackParameters.f55313a), Float.valueOf(playbackParameters.f55314b), Boolean.valueOf(playbackParameters.f55315c)));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void G(androidx.media2.exoplayer.external.analytics.c.a eventTime, int reason) {
        int i10 = eventTime.f53141b.i();
        int iR = eventTime.f53141b.r();
        String strS = S(eventTime);
        String strX = X(reason);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strS).length() + 76 + String.valueOf(strX).length());
        sb2.append("timelineChanged [");
        sb2.append(strS);
        sb2.append(", periodCount=");
        sb2.append(i10);
        sb2.append(", windowCount=");
        sb2.append(iR);
        sb2.append(", reason=");
        sb2.append(strX);
        d0(sb2.toString());
        for (int i11 = 0; i11 < Math.min(i10, 3); i11++) {
            eventTime.f53141b.f(i11, this.f57585d);
            String strW = W(this.f57585d.h());
            StringBuilder sb3 = new StringBuilder(String.valueOf(strW).length() + 11);
            sb3.append("  period [");
            sb3.append(strW);
            sb3.append("]");
            d0(sb3.toString());
        }
        if (i10 > 3) {
            d0("  ...");
        }
        for (int i12 = 0; i12 < Math.min(iR, 3); i12++) {
            eventTime.f53141b.n(i12, this.f57584c);
            String strW2 = W(this.f57584c.c());
            z0.c cVar = this.f57584c;
            boolean z10 = cVar.f57963e;
            boolean z11 = cVar.f57964f;
            StringBuilder sb4 = new StringBuilder(String.valueOf(strW2).length() + 25);
            sb4.append("  window [");
            sb4.append(strW2);
            sb4.append(", ");
            sb4.append(z10);
            sb4.append(", ");
            sb4.append(z11);
            sb4.append("]");
            d0(sb4.toString());
        }
        if (iR > 3) {
            d0("  ...");
        }
        d0("]");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void H(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.source.k0.b loadEventInfo, androidx.media2.exoplayer.external.source.k0.c mediaLoadData) {
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void I(androidx.media2.exoplayer.external.analytics.c.a eventTime, int trackType, androidx.media2.exoplayer.external.decoder.d counters) {
        c0(eventTime, "decoderDisabled", a0(trackType));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void J(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void K(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "mediaPeriodReleased");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void L(androidx.media2.exoplayer.external.analytics.c.a eventTime, boolean isLoading) {
        c0(eventTime, "loading", Boolean.toString(isLoading));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void M(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.source.k0.b loadEventInfo, androidx.media2.exoplayer.external.source.k0.c mediaLoadData) {
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void N(androidx.media2.exoplayer.external.analytics.c.a eventTime, boolean playWhenReady, int state) {
        String strV = V(state);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strV).length() + 7);
        sb2.append(playWhenReady);
        sb2.append(", ");
        sb2.append(strV);
        c0(eventTime, "state", sb2.toString());
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void O(androidx.media2.exoplayer.external.analytics.c.a eventTime, @androidx.annotation.p0 Surface surface) {
        c0(eventTime, "renderedFirstFrame", String.valueOf(surface));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void P(androidx.media2.exoplayer.external.analytics.c.a eventTime, boolean shuffleModeEnabled) {
        c0(eventTime, "shuffleModeEnabled", Boolean.toString(shuffleModeEnabled));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void Q(androidx.media2.exoplayer.external.analytics.c.a eventTime, int trackType, androidx.media2.exoplayer.external.decoder.d counters) {
        c0(eventTime, "decoderEnabled", a0(trackType));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void R(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void b(androidx.media2.exoplayer.external.analytics.c.a eventTime, Exception e10) {
        h0(eventTime, "drmSessionManagerError", e10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void d(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "seekStarted");
    }

    protected void d0(String msg) {
        p.b(this.f57583b, msg);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void e(androidx.media2.exoplayer.external.analytics.c.a eventTime, int reason) {
        c0(eventTime, "positionDiscontinuity", c(reason));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void f(androidx.media2.exoplayer.external.analytics.c.a eventTime, int trackType, String decoderName, long initializationDurationMs) {
        String strA0 = a0(trackType);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strA0).length() + 2 + String.valueOf(decoderName).length());
        sb2.append(strA0);
        sb2.append(", ");
        sb2.append(decoderName);
        c0(eventTime, "decoderInitialized", sb2.toString());
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void g(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "drmKeysRemoved");
    }

    protected void g0(String msg, @androidx.annotation.p0 Throwable tr) {
        p.e(this.f57583b, msg, tr);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void h(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "drmSessionAcquired");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void i(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "mediaPeriodCreated");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void k(androidx.media2.exoplayer.external.analytics.c.a eventTime, int repeatMode) {
        c0(eventTime, "repeatMode", U(repeatMode));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void l(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "seekProcessed");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void m(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.source.k0.c mediaLoadData) {
        c0(eventTime, "downstreamFormatChanged", Format.M(mediaLoadData.f56249c));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void n(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "mediaPeriodReadingStarted");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void o(androidx.media2.exoplayer.external.analytics.c.a aVar, androidx.media2.exoplayer.external.audio.c cVar) {
        androidx.media2.exoplayer.external.analytics.b.a(this, aVar, cVar);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void p(androidx.media2.exoplayer.external.analytics.c.a eventTime, int width, int height) {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(width);
        sb2.append(", ");
        sb2.append(height);
        c0(eventTime, "surfaceSizeChanged", sb2.toString());
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void q(androidx.media2.exoplayer.external.analytics.c.a eventTime, int totalLoadTimeMs, long totalBytesLoaded, long bitrateEstimate) {
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void r(androidx.media2.exoplayer.external.analytics.c.a eventTime, int audioSessionId) {
        c0(eventTime, "audioSessionId", Integer.toString(audioSessionId));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void s(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.source.k0.b loadEventInfo, androidx.media2.exoplayer.external.source.k0.c mediaLoadData, IOException error, boolean wasCanceled) {
        h0(eventTime, "loadError", error);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void t(androidx.media2.exoplayer.external.analytics.c.a eventTime, int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(width);
        sb2.append(", ");
        sb2.append(height);
        c0(eventTime, "videoSizeChanged", sb2.toString());
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void u(androidx.media2.exoplayer.external.analytics.c.a eventTime, TrackGroupArray ignored, androidx.media2.exoplayer.external.trackselection.p trackSelections) {
        androidx.media2.exoplayer.external.trackselection.i.a aVar;
        androidx.media2.exoplayer.external.trackselection.i iVar = this.f57582a;
        androidx.media2.exoplayer.external.trackselection.i.a aVarG = iVar != null ? iVar.g() : null;
        if (aVarG == null) {
            c0(eventTime, "tracksChanged", okhttp3.v.f334777p);
            return;
        }
        String strS = S(eventTime);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strS).length() + 17);
        sb2.append("tracksChanged [");
        sb2.append(strS);
        sb2.append(", ");
        d0(sb2.toString());
        int iC = aVarG.c();
        int i10 = 0;
        while (true) {
            String str = "  ]";
            if (i10 >= iC) {
                break;
            }
            TrackGroupArray trackGroupArrayG = aVarG.g(i10);
            androidx.media2.exoplayer.external.trackselection.m mVarA = trackSelections.a(i10);
            if (trackGroupArrayG.f55657a > 0) {
                StringBuilder sb3 = new StringBuilder(24);
                sb3.append("  Renderer:");
                sb3.append(i10);
                sb3.append(" [");
                d0(sb3.toString());
                int i11 = 0;
                while (i11 < trackGroupArrayG.f55657a) {
                    TrackGroup trackGroupA = trackGroupArrayG.a(i11);
                    TrackGroupArray trackGroupArray = trackGroupArrayG;
                    String str2 = str;
                    String strA = a(trackGroupA.f55653a, aVarG.a(i10, i11, false));
                    StringBuilder sb4 = new StringBuilder(String.valueOf(strA).length() + 44);
                    sb4.append("    Group:");
                    sb4.append(i11);
                    sb4.append(", adaptive_supported=");
                    sb4.append(strA);
                    sb4.append(" [");
                    d0(sb4.toString());
                    int i12 = 0;
                    while (i12 < trackGroupA.f55653a) {
                        String strY = Y(mVarA, trackGroupA, i12);
                        String strT = T(aVarG.h(i10, i11, i12));
                        androidx.media2.exoplayer.external.trackselection.i.a aVar2 = aVarG;
                        String strM = Format.M(trackGroupA.a(i12));
                        TrackGroup trackGroup = trackGroupA;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(strY).length() + 38 + String.valueOf(strM).length() + String.valueOf(strT).length());
                        sb5.append("      ");
                        sb5.append(strY);
                        sb5.append(" Track:");
                        sb5.append(i12);
                        sb5.append(", ");
                        sb5.append(strM);
                        sb5.append(", supported=");
                        sb5.append(strT);
                        d0(sb5.toString());
                        i12++;
                        trackGroupA = trackGroup;
                        aVarG = aVar2;
                        i11 = i11;
                    }
                    d0("    ]");
                    i11++;
                    trackGroupArrayG = trackGroupArray;
                    str = str2;
                }
                aVar = aVarG;
                String str3 = str;
                if (mVarA != null) {
                    for (int i13 = 0; i13 < mVarA.length(); i13++) {
                        Metadata metadata = mVarA.l(i13).f53099g;
                        if (metadata != null) {
                            d0("    Metadata [");
                            i0(metadata, "      ");
                            d0("    ]");
                            break;
                        }
                    }
                }
                d0(str3);
            } else {
                aVar = aVarG;
            }
            i10++;
            iC = iC;
            aVarG = aVar;
        }
        TrackGroupArray trackGroupArrayL = aVarG.l();
        if (trackGroupArrayL.f55657a > 0) {
            d0("  Renderer:None [");
            for (int i14 = 0; i14 < trackGroupArrayL.f55657a; i14++) {
                StringBuilder sb6 = new StringBuilder(23);
                sb6.append("    Group:");
                sb6.append(i14);
                sb6.append(" [");
                d0(sb6.toString());
                TrackGroup trackGroupA2 = trackGroupArrayL.a(i14);
                int i15 = 0;
                while (i15 < trackGroupA2.f55653a) {
                    String strZ = Z(false);
                    String strT2 = T(0);
                    String strM2 = Format.M(trackGroupA2.a(i15));
                    TrackGroup trackGroup2 = trackGroupA2;
                    StringBuilder sb7 = new StringBuilder(String.valueOf(strZ).length() + 38 + String.valueOf(strM2).length() + String.valueOf(strT2).length());
                    sb7.append("      ");
                    sb7.append(strZ);
                    sb7.append(" Track:");
                    sb7.append(i15);
                    sb7.append(", ");
                    sb7.append(strM2);
                    sb7.append(", supported=");
                    sb7.append(strT2);
                    d0(sb7.toString());
                    i15++;
                    trackGroupArrayL = trackGroupArrayL;
                    trackGroupA2 = trackGroup2;
                }
                d0("    ]");
            }
            d0("  ]");
        }
        d0("]");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void v(androidx.media2.exoplayer.external.analytics.c.a eventTime) {
        b0(eventTime, "drmSessionReleased");
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void w(androidx.media2.exoplayer.external.analytics.c.a aVar, float f10) {
        androidx.media2.exoplayer.external.analytics.b.N(this, aVar, f10);
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void x(androidx.media2.exoplayer.external.analytics.c.a eventTime, int count, long elapsedMs) {
        c0(eventTime, "droppedFrames", Integer.toString(count));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void y(androidx.media2.exoplayer.external.analytics.c.a eventTime, androidx.media2.exoplayer.external.source.k0.c mediaLoadData) {
        c0(eventTime, "upstreamDiscarded", Format.M(mediaLoadData.f56249c));
    }

    @Override // androidx.media2.exoplayer.external.analytics.c
    public void z(androidx.media2.exoplayer.external.analytics.c.a eventTime, int trackType, Format format) {
        String strA0 = a0(trackType);
        String strM = Format.M(format);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strA0).length() + 2 + String.valueOf(strM).length());
        sb2.append(strA0);
        sb2.append(", ");
        sb2.append(strM);
        c0(eventTime, "decoderInputFormatChanged", sb2.toString());
    }

    public k(@androidx.annotation.p0 androidx.media2.exoplayer.external.trackselection.i trackSelector, String tag) {
        this.f57582a = trackSelector;
        this.f57583b = tag;
        this.f57584c = new z0.c();
        this.f57585d = new z0.b();
        this.f57586e = SystemClock.elapsedRealtime();
    }
}
