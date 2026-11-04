package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.p0;
import androidx.media3.common.i4;
import androidx.media3.common.k0;
import androidx.media3.common.n4;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import androidx.media3.common.w;
import androidx.media3.common.x0;
import androidx.media3.common.y0;
import androidx.media3.common.z0;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.audio.x;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.h0;
import androidx.media3.exoplayer.trackselection.e0;
import com.google.common.collect.l6;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.codec.language.bm.g;

/* JADX INFO: loaded from: classes3.dex */
public class b implements androidx.media3.exoplayer.analytics.b {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f66181r0 = "EventLogger";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f66182s0 = 3;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final NumberFormat f66183t0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final String f66184n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final z3.d f66185o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final z3.b f66186p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final long f66187q0;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f66183t0 = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public b() {
        this(f66181r0);
    }

    private String B0(androidx.media3.exoplayer.analytics.b.C0577b c0577b) {
        String str = "window=" + c0577b.f62840c;
        if (c0577b.f62841d != null) {
            str = str + ", period=" + c0577b.f62839b.f(c0577b.f62841d.f65467a);
            if (c0577b.f62841d.c()) {
                str = (str + ", adGroup=" + c0577b.f62841d.f65468b) + ", ad=" + c0577b.f62841d.f65469c;
            }
        }
        return "eventTime=" + I0(c0577b.f62838a - this.f66187q0) + ", mediaPos=" + I0(c0577b.f62842e) + ", " + str;
    }

    private static String D0(int i10) {
        if (i10 == 0) {
            return "REPEAT";
        }
        if (i10 == 1) {
            return "AUTO";
        }
        if (i10 != 2) {
            return i10 != 3 ? com.planner5d.library.model.payments.a.f222474i : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static String E0(int i10) {
        if (i10 == 1) {
            return "USER_REQUEST";
        }
        if (i10 == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i10 == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i10 != 4) {
            return i10 != 5 ? com.planner5d.library.model.payments.a.f222474i : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static String F(int i10) {
        switch (i10) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return com.planner5d.library.model.payments.a.f222474i;
        }
    }

    private static String F0(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? com.planner5d.library.model.payments.a.f222474i : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "NONE";
    }

    private static String G0(int i10) {
        if (i10 == 0) {
            return "OFF";
        }
        if (i10 != 1) {
            return i10 != 2 ? com.planner5d.library.model.payments.a.f222474i : g.f335338f;
        }
        return "ONE";
    }

    private static String H0(int i10) {
        if (i10 == 1) {
            return "IDLE";
        }
        if (i10 == 2) {
            return "BUFFERING";
        }
        if (i10 != 3) {
            return i10 != 4 ? com.planner5d.library.model.payments.a.f222474i : "ENDED";
        }
        return "READY";
    }

    private static String I0(long j10) {
        return j10 == -9223372036854775807L ? com.planner5d.library.model.payments.a.f222474i : f66183t0.format(j10 / 1000.0f);
    }

    private static String J0(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? com.planner5d.library.model.payments.a.f222474i : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String K0(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    private void L0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str) {
        N0(z0(c0577b, str, null, null));
    }

    private void M0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, String str2) {
        N0(z0(c0577b, str, str2, null));
    }

    private void O0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, String str2, @p0 Throwable th2) {
        Q0(z0(c0577b, str, str2, th2));
    }

    private void P0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, @p0 Throwable th2) {
        Q0(z0(c0577b, str, null, th2));
    }

    private void R0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, Exception exc) {
        O0(c0577b, "internalError", str, exc);
    }

    private void S0(r0 r0Var, String str) {
        for (int i10 = 0; i10 < r0Var.e(); i10++) {
            N0(str + r0Var.d(i10));
        }
    }

    private static String a(x.a aVar) {
        return aVar.f63439a + "," + aVar.f63441c + "," + aVar.f63440b + "," + aVar.f63442d + "," + aVar.f63443e + "," + aVar.f63444f;
    }

    private String z0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, @p0 String str2, @p0 Throwable th2) {
        String str3 = str + " [" + B0(c0577b);
        if (th2 instanceof x0) {
            str3 = str3 + ", errorCode=" + ((x0) th2).f();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String strG = z.g(th2);
        if (!TextUtils.isEmpty(strG)) {
            str3 = str3 + "\n  " + strG.replace("\n", "\n  ") + '\n';
        }
        return str3 + "]";
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void B(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10, long j10) {
        M0(c0577b, "droppedFrames", Integer.toString(i10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void C0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, w wVar, @p0 k kVar) {
        M0(c0577b, "videoInputFormat", w.l(wVar));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void D(androidx.media3.exoplayer.analytics.b.C0577b c0577b) {
        L0(c0577b, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void E(androidx.media3.exoplayer.analytics.b.C0577b c0577b, i4 i4Var) {
        r0 r0Var;
        N0("tracks [" + B0(c0577b));
        l6<i4.a> l6VarC = i4Var.c();
        for (int i10 = 0; i10 < l6VarC.size(); i10++) {
            i4.a aVar = l6VarC.get(i10);
            N0("  group [");
            for (int i11 = 0; i11 < aVar.f60646a; i11++) {
                N0("    " + K0(aVar.k(i11)) + " Track:" + i11 + ", " + w.l(aVar.d(i11)) + ", supported=" + k1.v0(aVar.e(i11)));
            }
            N0("  ]");
        }
        boolean z10 = false;
        for (int i12 = 0; !z10 && i12 < l6VarC.size(); i12++) {
            i4.a aVar2 = l6VarC.get(i12);
            for (int i13 = 0; !z10 && i13 < aVar2.f60646a; i13++) {
                if (aVar2.k(i13) && (r0Var = aVar2.d(i13).f61758l) != null && r0Var.e() > 0) {
                    N0("  Metadata [");
                    S0(r0Var, "    ");
                    N0("  ]");
                    z10 = true;
                }
            }
        }
        N0("]");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void G(androidx.media3.exoplayer.analytics.b.C0577b c0577b, n4 n4Var) {
        M0(c0577b, "videoSize", n4Var.f60997a + ", " + n4Var.f60998b);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void J(androidx.media3.exoplayer.analytics.b.C0577b c0577b, h0 h0Var) {
        M0(c0577b, "downstreamFormat", w.l(h0Var.f65067c));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void M(androidx.media3.exoplayer.analytics.b.C0577b c0577b) {
        L0(c0577b, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void N(androidx.media3.exoplayer.analytics.b.C0577b c0577b, Object obj, long j10) {
        M0(c0577b, "renderedFirstFrame", String.valueOf(obj));
    }

    @b1
    protected void N0(String str) {
        z.b(this.f66184n0, str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void O(androidx.media3.exoplayer.analytics.b.C0577b c0577b, boolean z10) {
        M0(c0577b, "loading", Boolean.toString(z10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void Q(androidx.media3.exoplayer.analytics.b.C0577b c0577b, r0 r0Var) {
        N0("metadata [" + B0(c0577b));
        S0(r0Var, "  ");
        N0("]");
    }

    @b1
    protected void Q0(String str) {
        z.d(this.f66184n0, str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void S(androidx.media3.exoplayer.analytics.b.C0577b c0577b, boolean z10) {
        M0(c0577b, "skipSilenceEnabled", Boolean.toString(z10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void T(androidx.media3.exoplayer.analytics.b.C0577b c0577b, x0 x0Var) {
        P0(c0577b, "playerFailed", x0Var);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void V(androidx.media3.exoplayer.analytics.b.C0577b c0577b, j jVar) {
        L0(c0577b, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void X(androidx.media3.exoplayer.analytics.b.C0577b c0577b, androidx.media3.common.d dVar) {
        M0(c0577b, "audioAttributes", dVar.f60478a + "," + dVar.f60479b + "," + dVar.f60480c + "," + dVar.f60481d);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void Y(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10) {
        int iM = c0577b.f62839b.m();
        int iV = c0577b.f62839b.v();
        N0("timeline [" + B0(c0577b) + ", periodCount=" + iM + ", windowCount=" + iV + ", reason=" + J0(i10));
        for (int i11 = 0; i11 < Math.min(iM, 3); i11++) {
            c0577b.f62839b.j(i11, this.f66186p0);
            N0("  period [" + I0(this.f66186p0.l()) + "]");
        }
        if (iM > 3) {
            N0("  ...");
        }
        for (int i12 = 0; i12 < Math.min(iV, 3); i12++) {
            c0577b.f62839b.t(i12, this.f66185o0);
            N0("  window [" + I0(this.f66185o0.e()) + ", seekable=" + this.f66185o0.f61995h + ", dynamic=" + this.f66185o0.f61996i + "]");
        }
        if (iV > 3) {
            N0("  ...");
        }
        N0("]");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void Z(androidx.media3.exoplayer.analytics.b.C0577b c0577b, j jVar) {
        L0(c0577b, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void b(androidx.media3.exoplayer.analytics.b.C0577b c0577b, boolean z10) {
        M0(c0577b, "isPlaying", Boolean.toString(z10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void b0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, z0.k kVar, z0.k kVar2, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("reason=");
        sb2.append(F(i10));
        sb2.append(", PositionInfo:old [");
        sb2.append("mediaItem=");
        sb2.append(kVar.f61948c);
        sb2.append(", period=");
        sb2.append(kVar.f61951f);
        sb2.append(", pos=");
        sb2.append(kVar.f61952g);
        if (kVar.f61954i != -1) {
            sb2.append(", contentPos=");
            sb2.append(kVar.f61953h);
            sb2.append(", adGroup=");
            sb2.append(kVar.f61954i);
            sb2.append(", ad=");
            sb2.append(kVar.f61955j);
        }
        sb2.append("], PositionInfo:new [");
        sb2.append("mediaItem=");
        sb2.append(kVar2.f61948c);
        sb2.append(", period=");
        sb2.append(kVar2.f61951f);
        sb2.append(", pos=");
        sb2.append(kVar2.f61952g);
        if (kVar2.f61954i != -1) {
            sb2.append(", contentPos=");
            sb2.append(kVar2.f61953h);
            sb2.append(", adGroup=");
            sb2.append(kVar2.f61954i);
            sb2.append(", ad=");
            sb2.append(kVar2.f61955j);
        }
        sb2.append("]");
        M0(c0577b, "positionDiscontinuity", sb2.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void c0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, j jVar) {
        L0(c0577b, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void d(androidx.media3.exoplayer.analytics.b.C0577b c0577b, boolean z10, int i10) {
        M0(c0577b, "playWhenReady", z10 + ", " + E0(i10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void e(androidx.media3.exoplayer.analytics.b.C0577b c0577b) {
        L0(c0577b, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void e0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, float f10) {
        M0(c0577b, "volume", Float.toString(f10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void f0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, d0 d0Var, h0 h0Var, IOException iOException, boolean z10) {
        R0(c0577b, "loadError", iOException);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void h0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10, long j10, long j11) {
        O0(c0577b, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11, null);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void i(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, long j10, long j11) {
        M0(c0577b, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void j0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, x.a aVar) {
        M0(c0577b, "audioTrackInit", a(aVar));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void k(androidx.media3.exoplayer.analytics.b.C0577b c0577b, Exception exc) {
        R0(c0577b, "drmSessionManagerError", exc);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void k0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str) {
        M0(c0577b, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void l(androidx.media3.exoplayer.analytics.b.C0577b c0577b, @p0 k0 k0Var, int i10) {
        N0("mediaItem [" + B0(c0577b) + ", reason=" + D0(i10) + "]");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void l0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str) {
        M0(c0577b, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void m(androidx.media3.exoplayer.analytics.b.C0577b c0577b, j jVar) {
        L0(c0577b, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void m0(androidx.media3.exoplayer.analytics.b.C0577b c0577b) {
        L0(c0577b, "drmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void n(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10, int i11) {
        M0(c0577b, "surfaceSize", i10 + ", " + i11);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void o0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10, int i11, boolean z10) {
        M0(c0577b, "rendererReady", "rendererIndex=" + i10 + ", " + k1.O0(i11) + ", " + z10);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void p(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10) {
        M0(c0577b, "drmSessionAcquired", "state=" + i10);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void s(androidx.media3.exoplayer.analytics.b.C0577b c0577b, boolean z10) {
        M0(c0577b, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void t(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10) {
        M0(c0577b, "state", H0(i10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void u(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10) {
        M0(c0577b, "audioSessionId", Integer.toString(i10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void v(androidx.media3.exoplayer.analytics.b.C0577b c0577b, w wVar, @p0 k kVar) {
        M0(c0577b, "audioInputFormat", w.l(wVar));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void v0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10) {
        M0(c0577b, "repeatMode", G0(i10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void w(androidx.media3.exoplayer.analytics.b.C0577b c0577b, y0 y0Var) {
        M0(c0577b, "playbackParameters", y0Var.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void x(androidx.media3.exoplayer.analytics.b.C0577b c0577b, x.a aVar) {
        M0(c0577b, "audioTrackReleased", a(aVar));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void x0(androidx.media3.exoplayer.analytics.b.C0577b c0577b, String str, long j10, long j11) {
        M0(c0577b, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void y(androidx.media3.exoplayer.analytics.b.C0577b c0577b, int i10) {
        M0(c0577b, "playbackSuppressionReason", F0(i10));
    }

    @Override // androidx.media3.exoplayer.analytics.b
    @b1
    public void z(androidx.media3.exoplayer.analytics.b.C0577b c0577b, h0 h0Var) {
        M0(c0577b, "upstreamDiscarded", w.l(h0Var.f65067c));
    }

    public b(String str) {
        this.f66184n0 = str;
        this.f66185o0 = new z3.d();
        this.f66186p0 = new z3.b();
        this.f66187q0 = SystemClock.elapsedRealtime();
    }

    @b1
    @Deprecated
    public b(@p0 e0 e0Var) {
        this(f66181r0);
    }

    @b1
    @Deprecated
    public b(@p0 e0 e0Var, String str) {
        this(str);
    }
}
