package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends k8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f110135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f110136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f110137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f110138e;

    k(h7 h7Var) {
        super(h7Var);
        this.f110137d = i.f110069a;
    }

    public static final long n() {
        return ((Long) z4.f110757e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) z4.f110772j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) z4.f110778l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) z4.S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) z4.N.b(null)).longValue();
    }

    private final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.w.r(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f110184a.a().o().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f110184a.a().o().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f110184a.a().o().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f110184a.a().o().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final long A() {
        this.f110184a.c();
        return 133005L;
    }

    @il.d({"this.isMainProcess"})
    public final boolean B() {
        if (this.f110138e == null) {
            synchronized (this) {
                try {
                    if (this.f110138e == null) {
                        h7 h7Var = this.f110184a;
                        ApplicationInfo applicationInfo = h7Var.d().getApplicationInfo();
                        String strA = com.google.android.gms.common.util.x.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strA)) {
                                z10 = true;
                            }
                            this.f110138e = Boolean.valueOf(z10);
                        }
                        if (this.f110138e == null) {
                            this.f110138e = Boolean.TRUE;
                            h7Var.a().o().a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f110138e.booleanValue();
    }

    @androidx.annotation.m1
    public final String C(String str, y4 y4Var) {
        return TextUtils.isEmpty(str) ? (String) y4Var.b(null) : (String) y4Var.b(this.f110137d.f(str, y4Var.a()));
    }

    @androidx.annotation.m1
    public final long D(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) y4Var.b(null)).longValue();
        }
        String strF = this.f110137d.f(str, y4Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Long) y4Var.b(null)).longValue();
        }
        try {
            return ((Long) y4Var.b(Long.valueOf(Long.parseLong(strF)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) y4Var.b(null)).longValue();
        }
    }

    @androidx.annotation.m1
    public final int E(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) y4Var.b(null)).intValue();
        }
        String strF = this.f110137d.f(str, y4Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Integer) y4Var.b(null)).intValue();
        }
        try {
            return ((Integer) y4Var.b(Integer.valueOf(Integer.parseInt(strF)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) y4Var.b(null)).intValue();
        }
    }

    @androidx.annotation.m1
    public final int F(String str, y4 y4Var, int i10, int i11) {
        return Math.max(Math.min(E(str, y4Var), i11), i10);
    }

    @androidx.annotation.m1
    public final double G(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
        String strF = this.f110137d.f(str, y4Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
        try {
            return ((Double) y4Var.b(Double.valueOf(Double.parseDouble(strF)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
    }

    @androidx.annotation.m1
    public final boolean H(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) y4Var.b(null)).booleanValue();
        }
        String strF = this.f110137d.f(str, y4Var.a());
        return TextUtils.isEmpty(strF) ? ((Boolean) y4Var.b(null)).booleanValue() : ((Boolean) y4Var.b(Boolean.valueOf("1".equals(strF)))).booleanValue();
    }

    @androidx.annotation.l1
    final Bundle I() {
        try {
            h7 h7Var = this.f110184a;
            if (h7Var.d().getPackageManager() == null) {
                h7Var.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = com.google.android.gms.common.wrappers.d.a(h7Var.d()).c(h7Var.d().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            h7Var.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f110184a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    final Boolean J(@androidx.annotation.d1(min = 1) String str) {
        com.google.android.gms.common.internal.w.l(str);
        Bundle bundleI = I();
        if (bundleI == null) {
            this.f110184a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleI.containsKey(str)) {
            return Boolean.valueOf(bundleI.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f A[Catch: NotFoundException -> 0x0054, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0054, blocks: (B:12:0x0038, B:16:0x004f), top: B:22:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final List K(@androidx.annotation.d1(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        com.google.android.gms.common.internal.w.l("analytics.safelisted_events");
        Bundle bundleI = I();
        if (bundleI != null) {
            if (bundleI.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleI.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.f110184a.d().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.f110184a.a().o().b("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        this.f110184a.a().o().a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.f110184a.d().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final boolean L() {
        this.f110184a.c();
        Boolean boolJ = J("firebase_analytics_collection_deactivated");
        return boolJ != null && boolJ.booleanValue();
    }

    public final boolean M() {
        Boolean boolJ = J("google_analytics_adid_collection_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final boolean N() {
        Boolean boolJ = J("google_analytics_automatic_screen_reporting_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final o8 O(String str, boolean z10) {
        Object obj;
        com.google.android.gms.common.internal.w.l(str);
        h7 h7Var = this.f110184a;
        Bundle bundleI = I();
        if (bundleI == null) {
            h7Var.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleI.get(str);
        }
        if (obj == null) {
            return o8.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return o8.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return o8.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return o8.POLICY;
        }
        h7Var.a().r().b("Invalid manifest metadata for", str);
        return o8.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean boolJ = J("google_analytics_sgtm_upload_enabled");
        if (boolJ == null) {
            return false;
        }
        return boolJ.booleanValue();
    }

    public final void Q(String str) {
        this.f110136c = str;
    }

    public final String R() {
        return this.f110136c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.f110137d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f110137d.f(str, "measurement.event_sampling_enabled"));
    }

    @androidx.annotation.m1
    final boolean m() {
        if (this.f110135b == null) {
            Boolean boolJ = J("app_measurement_lite");
            this.f110135b = boolJ;
            if (boolJ == null) {
                this.f110135b = Boolean.FALSE;
            }
        }
        return this.f110135b.booleanValue() || !this.f110184a.G();
    }

    final void t(j jVar) {
        this.f110137d = jVar;
    }

    final String u() {
        this.f110184a.c();
        return "FA";
    }

    public final int v() {
        return this.f110184a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(@androidx.annotation.d1(min = 1) String str) {
        return F(str, z4.Y, 25, 100);
    }

    final int x(String str, boolean z10) {
        if (z10) {
            return F(str, z4.f110770i0, 100, 500);
        }
        return 500;
    }

    final int y(String str, boolean z10) {
        return Math.max(x(str, z10), 256);
    }

    final int z(@androidx.annotation.d1(min = 1) String str) {
        return F(str, z4.X, 500, 2000);
    }
}
