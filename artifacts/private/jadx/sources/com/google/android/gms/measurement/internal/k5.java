package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.eh;
import com.google.android.gms.internal.measurement.fg;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class k5 extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f110143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f110144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f110145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f110146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f110147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f110148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f110149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f110150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f110151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f110152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f110153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f110154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f110155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f110156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f110157q;

    k5(h7 h7Var, long j10, long j11) {
        super(h7Var);
        this.f110156p = 0L;
        this.f110157q = null;
        this.f110149i = j10;
        this.f110150j = j11;
    }

    @Override // com.google.android.gms.measurement.internal.b5
    protected final boolean m() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:43:0x0135  */
    /* JADX WARN: Code duplicated, block: B:44:0x0147  */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:46:0x016c  */
    /* JADX WARN: Code duplicated, block: B:47:0x017f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ca A[Catch: IllegalStateException -> 0x01e2, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x01e2, blocks: (B:50:0x01ad, B:54:0x01c5, B:56:0x01ca), top: B:80:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0211  */
    /* JADX WARN: Code duplicated, block: B:65:0x0218  */
    /* JADX WARN: Code duplicated, block: B:66:0x022b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0236  */
    /* JADX WARN: Code duplicated, block: B:72:0x024e A[EDGE_INSN: B:72:0x024e->B:73:0x0251 BREAK  A[LOOP:0: B:67:0x022f->B:88:?]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0253  */
    /* JADX WARN: Code duplicated, block: B:76:0x0261  */
    /* JADX WARN: Code duplicated, block: B:86:0x024e A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.b5
    @il.d({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @androidx.annotation.m1
    protected final void n() {
        String str;
        String string;
        int iH;
        h7 h7Var;
        h7 h7Var2;
        List listK;
        Iterator it;
        String strA;
        h7 h7Var3 = this.f110184a;
        h7Var3.a().w().c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.f110150j), Long.valueOf(this.f110149i));
        String packageName = h7Var3.d().getPackageName();
        PackageManager packageManager = h7Var3.d().getPackageManager();
        String str2 = "";
        int i10 = Integer.MIN_VALUE;
        String str3 = com.facebook.internal.a.f99697t;
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.f110184a.a().o().b("Error retrieving app installer package name. appId", w5.x(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.f110184a.d().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : com.facebook.internal.a.f99697t;
                        try {
                            str3 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.f110184a.a().o().c("Error retrieving package info. appId, appName", w5.x(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = com.facebook.internal.a.f99697t;
                }
                this.f110143c = packageName;
                this.f110146f = installerPackageName;
                this.f110144d = str3;
                this.f110145e = i10;
                this.f110147g = string;
                this.f110148h = 0L;
                h7 h7Var4 = this.f110184a;
                iH = h7Var4.h();
                if (iH != 0) {
                    this.f110184a.a().w().a("App measurement collection enabled");
                } else if (iH != 1) {
                    this.f110184a.a().u().a("App measurement deactivated via the manifest");
                } else if (iH != 3) {
                    this.f110184a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iH != 4) {
                    this.f110184a.a().u().a("App measurement disabled via the manifest");
                } else if (iH != 6) {
                    this.f110184a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iH != 7) {
                    this.f110184a.a().u().a("App measurement disabled via the global data collection setting");
                } else if (iH != 8) {
                    h7 h7Var5 = this.f110184a;
                    h7Var5.a().u().a("App measurement disabled");
                    h7Var5.a().p().a("Invalid scion state in identity");
                } else {
                    this.f110184a.a().u().a("App measurement disabled due to denied storage consent");
                }
                this.f110154n = "";
                h7Var = this.f110184a;
                h7Var.c();
                strA = db.a(h7Var.d(), "google_app_id", h7Var4.H());
                if (TextUtils.isEmpty(strA)) {
                    str2 = strA;
                }
                this.f110154n = str2;
                if (iH == 0) {
                    h7Var.a().w().c("App measurement enabled for app package, google app id", this.f110143c, this.f110154n);
                }
                this.f110151k = null;
                h7Var2 = this.f110184a;
                h7Var2.c();
                listK = h7Var2.w().K("analytics.safelisted_events");
                if (listK != null) {
                    this.f110151k = listK;
                    break;
                } else if (listK.isEmpty()) {
                    it = listK.iterator();
                    do {
                        if (it.hasNext()) {
                            this.f110151k = listK;
                            break;
                        }
                    } while (h7Var2.C().u0("safelisted event", (String) it.next()));
                } else {
                    h7Var2.a().t().a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.f110153m = com.google.android.gms.common.wrappers.b.a(h7Var2.d()) ? 1 : 0;
                } else {
                    this.f110153m = 0;
                }
            }
            h7Var3.a().o().b("PackageManager is null, app identity information might be inaccurate. appId", w5.x(packageName));
            strA = db.a(h7Var.d(), "google_app_id", h7Var4.H());
            if (TextUtils.isEmpty(strA)) {
                str2 = strA;
            }
            this.f110154n = str2;
            if (iH == 0) {
                h7Var.a().w().c("App measurement enabled for app package, google app id", this.f110143c, this.f110154n);
            }
        } catch (IllegalStateException e10) {
            this.f110184a.a().o().c("Fetching Google App Id failed with exception. appId", w5.x(packageName), e10);
        }
        string = com.facebook.internal.a.f99697t;
        this.f110143c = packageName;
        this.f110146f = installerPackageName;
        this.f110144d = str3;
        this.f110145e = i10;
        this.f110147g = string;
        this.f110148h = 0L;
        h7 h7Var6 = this.f110184a;
        iH = h7Var6.h();
        if (iH != 0) {
            this.f110184a.a().w().a("App measurement collection enabled");
        } else if (iH != 1) {
            this.f110184a.a().u().a("App measurement deactivated via the manifest");
        } else if (iH != 3) {
            this.f110184a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iH != 4) {
            this.f110184a.a().u().a("App measurement disabled via the manifest");
        } else if (iH != 6) {
            this.f110184a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iH != 7) {
            this.f110184a.a().u().a("App measurement disabled via the global data collection setting");
        } else if (iH != 8) {
            h7 h7Var7 = this.f110184a;
            h7Var7.a().u().a("App measurement disabled");
            h7Var7.a().p().a("Invalid scion state in identity");
        } else {
            this.f110184a.a().u().a("App measurement disabled due to denied storage consent");
        }
        this.f110154n = "";
        h7Var = this.f110184a;
        h7Var.c();
        this.f110151k = null;
        h7Var2 = this.f110184a;
        h7Var2.c();
        listK = h7Var2.w().K("analytics.safelisted_events");
        if (listK != null) {
            this.f110151k = listK;
            break;
        } else if (listK.isEmpty()) {
            it = listK.iterator();
            do {
                if (it.hasNext()) {
                    this.f110151k = listK;
                    break;
                }
            } while (h7Var2.C().u0("safelisted event", (String) it.next()));
        } else {
            h7Var2.a().t().a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.f110153m = com.google.android.gms.common.wrappers.b.a(h7Var2.d()) ? 1 : 0;
        } else {
            this.f110153m = 0;
        }
    }

    @androidx.annotation.m1
    final zzr o(String str) {
        long J;
        String str2;
        String str3;
        boolean z10;
        int i10;
        int i11;
        long j10;
        h();
        String strQ = q();
        String strR = r();
        j();
        String str4 = this.f110144d;
        j();
        long j11 = this.f110145e;
        j();
        com.google.android.gms.common.internal.w.r(this.f110146f);
        String str5 = this.f110146f;
        h7 h7Var = this.f110184a;
        h7Var.w().A();
        j();
        h();
        long j12 = this.f110148h;
        if (j12 == 0) {
            ze zeVarC = this.f110184a.C();
            Context contextD = h7Var.d();
            String packageName = h7Var.d().getPackageName();
            zeVarC.h();
            com.google.android.gms.common.internal.w.r(contextD);
            com.google.android.gms.common.internal.w.l(packageName);
            PackageManager packageManager = contextD.getPackageManager();
            MessageDigest messageDigestC = ze.C();
            long jD = -1;
            if (messageDigestC == null) {
                zeVarC.f110184a.a().o().a("Could not get MD5 instance");
                J = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (zeVarC.S(contextD, packageName)) {
                            J = 0;
                            jD = 0;
                        } else {
                            com.google.android.gms.common.wrappers.c cVarA = com.google.android.gms.common.wrappers.d.a(contextD);
                            h7 h7Var2 = zeVarC.f110184a;
                            J = 0;
                            try {
                                Signature[] signatureArr = cVarA.f(h7Var2.d().getPackageName(), 64).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    h7Var2.a().r().a("Could not get signatures");
                                } else {
                                    jD = ze.D(messageDigestC.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                zeVarC.f110184a.a().o().b("Package name not found", e);
                                j12 = J;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        J = 0;
                    }
                } else {
                    J = 0;
                }
                j12 = J;
                this.f110148h = j12;
            }
            j12 = jD;
            this.f110148h = j12;
        } else {
            J = 0;
        }
        long j13 = j12;
        h7 h7Var3 = this.f110184a;
        boolean zG = h7Var3.g();
        boolean z11 = !h7Var3.x().f110174s;
        h();
        if (h7Var3.g()) {
            eh.a();
            if (h7Var3.w().H(null, z4.I0)) {
                this.f110184a.a().w().a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = h7Var3.d().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f110184a.d());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.f110184a.a().t().a("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.f110184a.a().s().a("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        h7 h7Var4 = this.f110184a;
        long jA = h7Var4.x().f110161f.a();
        long jMin = jA == J ? h7Var4.D : Math.min(h7Var4.D, jA);
        j();
        int i12 = this.f110153m;
        h7 h7Var5 = this.f110184a;
        boolean zM = h7Var5.w().M();
        k6 k6VarX = h7Var5.x();
        k6VarX.h();
        boolean z12 = k6VarX.p().getBoolean("deferred_analytics_collection", false);
        boolean z13 = h7Var5.w().O("google_analytics_default_allow_ad_personalization_signals", true) != o8.GRANTED;
        long j14 = this.f110149i;
        Boolean boolValueOf = Boolean.valueOf(z13);
        List list = this.f110151k;
        String strL = h7Var5.x().w().l();
        if (this.f110152l == null) {
            this.f110152l = h7Var5.C().l0();
        }
        String str6 = this.f110152l;
        if (h7Var5.x().w().o(q8.ANALYTICS_STORAGE)) {
            h();
            if (this.f110156p != J) {
                long jCurrentTimeMillis = h7Var5.e().currentTimeMillis() - this.f110156p;
                if (this.f110155o != null && jCurrentTimeMillis > 86400000 && this.f110157q == null) {
                    p();
                }
            }
            if (this.f110155o == null) {
                p();
            }
            str3 = this.f110155o;
        } else {
            str3 = null;
        }
        boolean zP = h7Var5.w().P();
        ze zeVarC2 = h7Var5.C();
        String strQ2 = q();
        String str7 = str3;
        h7 h7Var6 = zeVarC2.f110184a;
        if (h7Var6.d().getPackageManager() == null) {
            z10 = zP;
            j10 = J;
        } else {
            try {
                z10 = zP;
                i10 = 0;
                try {
                    ApplicationInfo applicationInfoC = com.google.android.gms.common.wrappers.d.a(h7Var6.d()).c(strQ2, 0);
                    i11 = applicationInfoC != null ? applicationInfoC.targetSdkVersion : i10;
                } catch (PackageManager.NameNotFoundException unused4) {
                    h7 h7Var7 = zeVarC2.f110184a;
                    h7Var7.c();
                    h7Var7.a().u().b("PackageManager failed to find running app: app_id", strQ2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                z10 = zP;
                i10 = 0;
            }
            j10 = i11;
        }
        h7 h7Var8 = this.f110184a;
        int iB = h7Var8.x().w().b();
        String strE = h7Var8.x().u().e();
        fg.a();
        k kVarW = h7Var8.w();
        y4 y4Var = z4.R0;
        long j15 = j10;
        int I = kVarW.H(null, y4Var) ? h7Var8.C().I() : 0;
        fg.a();
        if (h7Var8.w().H(null, y4Var)) {
            J = h7Var8.C().J();
        }
        String strR2 = h7Var8.w().R();
        String strB = new z2(h7Var8.w().O("google_analytics_default_allow_ad_personalization_signals", true)).b();
        h7 h7Var9 = this.f110184a;
        return new zzr(strQ, strR, str4, j11, str5, 133005L, j13, str, zG, z11, str2, jMin, i12, zM, z12, boolValueOf, j14, list, strL, str6, str7, z10, j15, iB, strE, I, J, strR2, strB, h7Var9.D, h7Var9.N().q().a());
    }

    @androidx.annotation.m1
    final void p() {
        String str;
        h();
        h7 h7Var = this.f110184a;
        if (h7Var.x().w().o(q8.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            h7Var.C().q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            h7Var.a().v().a("Analytics Storage consent is not granted");
            str = null;
        }
        h7Var.a().v().a(String.format("Resetting session stitching token to %s", str == null ? AbstractJsonLexerKt.NULL : "not null"));
        this.f110155o = str;
        this.f110156p = h7Var.e().currentTimeMillis();
    }

    @androidx.annotation.m1
    final String q() {
        j();
        com.google.android.gms.common.internal.w.r(this.f110143c);
        return this.f110143c;
    }

    @androidx.annotation.m1
    final String r() {
        h();
        j();
        com.google.android.gms.common.internal.w.r(this.f110154n);
        return this.f110154n;
    }

    @androidx.annotation.m1
    final String s() {
        j();
        com.google.android.gms.common.internal.w.r(this.f110147g);
        return this.f110147g;
    }

    @androidx.annotation.m1
    final int t() {
        j();
        return this.f110145e;
    }

    final long u() {
        return this.f110150j;
    }

    @androidx.annotation.m1
    final int v() {
        j();
        return this.f110153m;
    }

    @androidx.annotation.m1
    final List w() {
        return this.f110151k;
    }

    final boolean x(String str) {
        String str2 = this.f110157q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f110157q = str;
        return z10;
    }
}
