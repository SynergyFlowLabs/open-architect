package androidx.media3.exoplayer.util;

import android.os.Looper;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.media3.common.k;
import androidx.media3.common.n4;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.j;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f66175e = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExoPlayer f66176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f66177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f66178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66179d;

    private final class b implements z0.g, Runnable {
        private b() {
        }

        @Override // androidx.media3.common.z0.g
        public void a0(boolean z10, int i10) {
            a.this.k();
        }

        @Override // androidx.media3.common.z0.g
        public void d0(z0.k kVar, z0.k kVar2, int i10) {
            a.this.k();
        }

        @Override // androidx.media3.common.z0.g
        public void h0(int i10) {
            a.this.k();
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    public a(ExoPlayer exoPlayer, TextView textView) {
        boolean z10;
        if (exoPlayer.d0() == Looper.getMainLooper()) {
            z10 = true;
            int i10 = 6 << 1;
        } else {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        this.f66176a = exoPlayer;
        this.f66177b = textView;
        this.f66178c = new b();
    }

    private static String b(@p0 k kVar) {
        if (kVar == null || !kVar.n()) {
            return "";
        }
        return " colr:" + kVar.s();
    }

    private static String d(j jVar) {
        if (jVar == null) {
            return "";
        }
        jVar.c();
        return " sib:" + jVar.f63911d + " sb:" + jVar.f63913f + " rb:" + jVar.f63912e + " dib:" + jVar.f63915h + " db:" + jVar.f63914g + " mcdb:" + jVar.f63916i + " dk:" + jVar.f63917j;
    }

    private static String e(float f10) {
        if (f10 == -1.0f || f10 == 1.0f) {
            return "";
        }
        return " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f10));
    }

    private static String g(long j10, int i10) {
        return i10 == 0 ? "N/A" : String.valueOf((long) (j10 / ((double) i10)));
    }

    @b1
    protected String a() {
        w wVarF2 = this.f66176a.f2();
        j jVarU1 = this.f66176a.u1();
        if (wVarF2 == null || jVarU1 == null) {
            return "";
        }
        return "\n" + wVarF2.f61761o + "(id:" + wVarF2.f61747a + " hz:" + wVarF2.F + " ch:" + wVarF2.E + d(jVarU1) + ")";
    }

    @b1
    protected String c() {
        return f() + h() + a();
    }

    @b1
    protected String f() {
        String str;
        int iH = this.f66176a.H();
        if (iH == 1) {
            str = "idle";
        } else if (iH == 2) {
            str = "buffering";
        } else if (iH != 3) {
            str = iH != 4 ? "unknown" : "ended";
        } else {
            str = "ready";
        }
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.f66176a.J()), str, Integer.valueOf(this.f66176a.l0()));
    }

    @b1
    protected String h() {
        w wVarL1 = this.f66176a.L1();
        n4 n4VarH0 = this.f66176a.h0();
        j jVarJ1 = this.f66176a.j1();
        if (wVarL1 == null || jVarJ1 == null) {
            return "";
        }
        return "\n" + wVarL1.f61761o + "(id:" + wVarL1.f61747a + " r:" + n4VarH0.f60997a + "x" + n4VarH0.f60998b + b(wVarL1.C) + e(n4VarH0.f61000d) + d(jVarJ1) + " vfpo: " + g(jVarJ1.f63918k, jVarJ1.f63919l) + ")";
    }

    public final void i() {
        if (this.f66179d) {
            return;
        }
        this.f66179d = true;
        this.f66176a.U1(this.f66178c);
        k();
    }

    public final void j() {
        if (this.f66179d) {
            this.f66179d = false;
            this.f66176a.Q1(this.f66178c);
            this.f66177b.removeCallbacks(this.f66178c);
        }
    }

    @b1
    @e.a({"SetTextI18n"})
    protected final void k() {
        this.f66177b.setText(c());
        this.f66177b.removeCallbacks(this.f66178c);
        this.f66177b.postDelayed(this.f66178c, 1000L);
    }
}
