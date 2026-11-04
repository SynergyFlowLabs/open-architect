package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.ea;
import io.sentry.fa;
import io.sentry.n8;
import io.sentry.s7;
import io.sentry.t5;
import io.sentry.u5;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class SentryPerformanceProvider extends i1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f304008f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Application f304009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f304010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u0 f304011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304012e = new io.sentry.util.a();

    @lm.n
    SentryPerformanceProvider(@NotNull ILogger iLogger, @NotNull u0 u0Var) {
        this.f304010c = iLogger;
        this.f304011d = u0Var;
    }

    private void a(@NotNull Context context, @NotNull u5 u5Var, @NotNull io.sentry.android.core.performance.h hVar) {
        if (!u5Var.f()) {
            this.f304010c.c(y7.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        u uVar = new u(this.f304011d, new io.sentry.android.core.internal.util.b0(context.getApplicationContext(), this.f304010c, this.f304011d), this.f304010c, u5Var.c(), u5Var.d(), new s7());
        hVar.E(null);
        hVar.D(uVar);
        this.f304010c.c(y7.DEBUG, "App start continuous profiling started.", new Object[0]);
        n8 n8VarEmpty = n8.empty();
        n8VarEmpty.setProfileSessionSampleRate(Double.valueOf(u5Var.f() ? 1.0d : 0.0d));
        uVar.j(u5Var.a(), new ea(n8VarEmpty));
    }

    private void b(@NotNull Context context, @NotNull u5 u5Var, @NotNull io.sentry.android.core.performance.h hVar) {
        fa faVar = new fa(Boolean.valueOf(u5Var.l()), u5Var.e(), Boolean.valueOf(u5Var.i()), u5Var.b());
        hVar.F(faVar);
        if (!faVar.b().booleanValue() || !faVar.e().booleanValue()) {
            this.f304010c.c(y7.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        i0 i0Var = new i0(context, this.f304011d, new io.sentry.android.core.internal.util.b0(context, this.f304010c, this.f304011d), this.f304010c, u5Var.c(), u5Var.j(), u5Var.d(), new s7());
        hVar.D(null);
        hVar.E(i0Var);
        this.f304010c.c(y7.DEBUG, "App start profiling started.", new Object[0]);
        i0Var.start();
    }

    private void c(@NotNull io.sentry.android.core.performance.h hVar) {
        Context context = getContext();
        if (context == null) {
            this.f304010c.c(y7.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File(d0.d(context), t5.f306820f);
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    u5 u5Var = (u5) new io.sentry.l2(n8.empty()).c(bufferedReader, u5.class);
                    if (u5Var == null) {
                        this.f304010c.c(y7.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (u5Var.g() && u5Var.k()) {
                        a(context, u5Var, hVar);
                    } else if (!u5Var.j()) {
                        this.f304010c.c(y7.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (u5Var.h()) {
                        b(context, u5Var, hVar);
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                this.f304010c.a(y7.ERROR, "App start profiling config file not found. ", e10);
            } catch (Throwable th4) {
                this.f304010c.a(y7.ERROR, "Error reading app start profiling config file. ", th4);
            }
        }
    }

    @e.a({"NewApi"})
    private void d(@Nullable Context context, @NotNull io.sentry.android.core.performance.h hVar) {
        hVar.t().I(f304008f);
        if (this.f304011d.d() >= 24) {
            hVar.m().I(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.f304009b = (Application) context;
        }
        Application application = this.f304009b;
        if (application == null) {
            return;
        }
        hVar.B(application);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.h hVarS = io.sentry.android.core.performance.h.s();
        d(getContext(), hVarS);
        c(hVarS);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        io.sentry.m1 m1VarA = io.sentry.android.core.performance.h.f304451t.a();
        try {
            io.sentry.s1 s1VarK = io.sentry.android.core.performance.h.s().k();
            if (s1VarK != null) {
                s1VarK.close();
            }
            io.sentry.v0 v0VarJ = io.sentry.android.core.performance.h.s().j();
            if (v0VarJ != null) {
                v0VarJ.i(true);
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

    public SentryPerformanceProvider() {
        y yVar = new y();
        this.f304010c = yVar;
        this.f304011d = new u0(yVar);
    }
}
