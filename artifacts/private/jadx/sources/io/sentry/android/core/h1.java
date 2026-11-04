package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.n8;
import io.sentry.y7;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e.a({"StaticFieldLeak"})
    private static volatile h1 f304174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f304175j = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f304177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u0 f304178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Boolean f304179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final a1.a f304180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final a1.b f304181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.l f304182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Long f304183h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f304184a;

        static {
            int[] iArr = new int[io.sentry.u0.a.values().length];
            f304184a = iArr;
            try {
                iArr[io.sentry.u0.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f304184a[io.sentry.u0.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h1(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f304176a = context;
        this.f304177b = sentryAndroidOptions;
        u0 u0Var = new u0(sentryAndroidOptions.getLogger());
        this.f304178c = u0Var;
        io.sentry.android.core.internal.util.l.b().d();
        this.f304182g = v();
        this.f304179d = u0Var.f();
        this.f304180e = a1.x(context, sentryAndroidOptions.getLogger(), u0Var);
        this.f304181f = a1.y(context, u0Var);
        ActivityManager.MemoryInfo memoryInfoN = a1.n(context, sentryAndroidOptions.getLogger());
        if (memoryInfoN != null) {
            this.f304183h = Long.valueOf(memoryInfoN.totalMem);
        } else {
            this.f304183h = null;
        }
    }

    @Nullable
    private Intent b() {
        return a1.v(this.f304176a, this.f304178c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
    }

    @Nullable
    public static Float c(@NotNull Intent intent, @NotNull n8 n8Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    @Nullable
    private Float d(@NotNull Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
        } catch (Throwable th2) {
            this.f304177b.getLogger().a(y7.ERROR, "Error getting battery temperature.", th2);
        }
        return null;
    }

    @Nullable
    private Date e() {
        try {
            return io.sentry.p.e(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e10) {
            this.f304177b.getLogger().b(y7.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    @Nullable
    private String f() {
        try {
            return m1.a(this.f304176a);
        } catch (Throwable th2) {
            this.f304177b.getLogger().a(y7.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    @Nullable
    private File g(@Nullable File file) {
        File[] externalFilesDirs = this.f304176a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f304177b.getLogger().c(y7.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    @Nullable
    private StatFs h(@Nullable File file) {
        try {
            File fileG = g(file);
            if (fileG != null) {
                return new StatFs(fileG.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f304177b.getLogger().c(y7.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    @NotNull
    public static h1 i(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (f304174i == null) {
            io.sentry.m1 m1VarA = f304175j.a();
            try {
                if (f304174i == null) {
                    f304174i = new h1(a1.g(context), sentryAndroidOptions);
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f304174i;
    }

    @Nullable
    private io.sentry.protocol.e.b k() {
        io.sentry.protocol.e.b bVarA;
        Throwable th2;
        try {
            bVarA = io.sentry.android.core.internal.util.n.a(this.f304176a.getResources().getConfiguration().orientation);
            if (bVarA != null) {
                return bVarA;
            }
            try {
                this.f304177b.getLogger().c(y7.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                this.f304177b.getLogger().a(y7.ERROR, "Error getting device orientation.", th2);
                return bVarA;
            }
        } catch (Throwable th4) {
            bVarA = null;
            th2 = th4;
        }
    }

    @NotNull
    private TimeZone n() {
        if (this.f304178c.d() >= 24) {
            LocaleList locales = this.f304176a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    @Nullable
    private Long o(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f304177b.getLogger().a(y7.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    @Nullable
    private Long p(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f304177b.getLogger().a(y7.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    @Nullable
    private Long r(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f304177b.getLogger().a(y7.ERROR, "Error getting unused external storage amount.", th2);
            int i10 = 3 << 0;
            return null;
        }
    }

    @Nullable
    private Long s(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th2) {
            this.f304177b.getLogger().a(y7.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    @Nullable
    public static Boolean t(@NotNull Intent intent, @NotNull n8 n8Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1) {
                int i10 = 0 << 2;
                if (intExtra != 2) {
                    z10 = false;
                }
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    @lm.n
    public static void u() {
        f304174i = null;
    }

    @NotNull
    private io.sentry.protocol.l v() {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.o("Android");
        lVar.r(Build.VERSION.RELEASE);
        lVar.m(Build.DISPLAY);
        String strM = a1.m(this.f304177b.getLogger());
        if (strM != null) {
            lVar.n(strM);
        }
        if (this.f304177b.isEnableRootCheck()) {
            lVar.q(Boolean.valueOf(new io.sentry.android.core.internal.util.s(this.f304176a, this.f304178c, this.f304177b.getLogger()).e()));
        }
        return lVar;
    }

    private void w(@NotNull io.sentry.protocol.e eVar, boolean z10) {
        Boolean bool;
        Intent intentB = b();
        if (intentB != null) {
            eVar.r0(c(intentB, this.f304177b));
            eVar.v0(t(intentB, this.f304177b));
            eVar.s0(d(intentB));
        }
        int i10 = a.f304184a[this.f304177b.getConnectionStatusProvider().L3().ordinal()];
        if (i10 != 1) {
            bool = i10 != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        eVar.M0(bool);
        ActivityManager.MemoryInfo memoryInfoN = a1.n(this.f304176a, this.f304177b.getLogger());
        if (memoryInfoN != null && z10) {
            eVar.C0(Long.valueOf(memoryInfoN.availMem));
            eVar.G0(Boolean.valueOf(memoryInfoN.lowMemory));
        }
        File externalFilesDir = this.f304176a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            eVar.V0(p(statFs));
            eVar.D0(s(statFs));
        }
        StatFs statFsH = h(externalFilesDir);
        if (statFsH != null) {
            eVar.A0(o(statFsH));
            eVar.z0(r(statFsH));
        }
        if (eVar.O() == null) {
            eVar.x0(this.f304177b.getConnectionStatusProvider().k2());
        }
    }

    @e.a({"NewApi"})
    @NotNull
    public io.sentry.protocol.e a(boolean z10, boolean z11) {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.H0(Build.MANUFACTURER);
        eVar.u0(Build.BRAND);
        eVar.B0(a1.l(this.f304177b.getLogger()));
        eVar.J0(Build.MODEL);
        eVar.K0(Build.ID);
        eVar.q0(a1.j());
        if (this.f304178c.d() >= 31) {
            eVar.w0(Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL);
        }
        eVar.N0(k());
        Boolean bool = this.f304179d;
        if (bool != null) {
            eVar.U0(bool);
        }
        DisplayMetrics displayMetricsK = a1.k(this.f304176a, this.f304177b.getLogger());
        if (displayMetricsK != null) {
            eVar.T0(Integer.valueOf(displayMetricsK.widthPixels));
            eVar.S0(Integer.valueOf(displayMetricsK.heightPixels));
            eVar.Q0(Float.valueOf(displayMetricsK.density));
            eVar.R0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        eVar.t0(e());
        eVar.W0(n());
        if (eVar.V() == null) {
            eVar.E0(f());
        }
        Locale locale = Locale.getDefault();
        if (eVar.W() == null) {
            eVar.F0(locale.toString());
        }
        List<Integer> listD = io.sentry.android.core.internal.util.l.b().d();
        if (!listD.isEmpty()) {
            eVar.P0(Double.valueOf(((Integer) Collections.max(listD)).doubleValue()));
            eVar.O0(Integer.valueOf(listD.size()));
        }
        eVar.I0(this.f304183h);
        if (z10 && this.f304177b.isCollectAdditionalContext()) {
            w(eVar, z11);
        }
        return eVar;
    }

    @NotNull
    public io.sentry.protocol.l j() {
        return this.f304182g;
    }

    @Nullable
    public a1.a l() {
        return this.f304180e;
    }

    @Nullable
    public a1.b m() {
        return this.f304181f;
    }

    @Nullable
    public Long q() {
        return this.f304183h;
    }
}
