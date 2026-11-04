package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.c0;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.n0;
import com.google.firebase.crashlytics.internal.concurrency.n;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f120923b = "clx";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f120924c = "crash";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f120925d = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    final c0 f120926a;

    private FirebaseCrashlytics(@NonNull c0 c0Var) {
        this.f120926a = c0Var;
    }

    @p0
    static FirebaseCrashlytics b(@NonNull com.google.firebase.h hVar, @NonNull com.google.firebase.installations.k kVar, @NonNull z8.a<com.google.firebase.crashlytics.internal.a> aVar, @NonNull z8.a<com.google.firebase.analytics.connector.a> aVar2, @NonNull z8.a<k9.a> aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextN = hVar.n();
        String packageName = contextN.getPackageName();
        com.google.firebase.crashlytics.internal.g.f().g("Initializing Firebase Crashlytics " + c0.u() + " for " + packageName);
        n nVar = new n(executorService, executorService2);
        com.google.firebase.crashlytics.internal.persistence.g gVar = new com.google.firebase.crashlytics.internal.persistence.g(contextN);
        i0 i0Var = new i0(hVar);
        n0 n0Var = new n0(contextN, packageName, kVar, i0Var);
        com.google.firebase.crashlytics.internal.d dVar = new com.google.firebase.crashlytics.internal.d(aVar);
        d dVar2 = new d(aVar2);
        m mVar = new m(i0Var, gVar);
        com.google.firebase.sessions.api.b.e(mVar);
        c0 c0Var = new c0(hVar, n0Var, dVar, i0Var, dVar2.e(), dVar2.d(), gVar, mVar, new com.google.firebase.crashlytics.internal.l(aVar3), nVar);
        String strJ = hVar.s().j();
        String strN = com.google.firebase.crashlytics.internal.common.i.n(contextN);
        List<com.google.firebase.crashlytics.internal.common.f> listJ = com.google.firebase.crashlytics.internal.common.i.j(contextN);
        com.google.firebase.crashlytics.internal.g.f().b("Mapping file ID is: " + strN);
        for (com.google.firebase.crashlytics.internal.common.f fVar : listJ) {
            com.google.firebase.crashlytics.internal.g.f().b(String.format("Build id for %s on %s: %s", fVar.c(), fVar.a(), fVar.b()));
        }
        try {
            com.google.firebase.crashlytics.internal.common.a aVarA = com.google.firebase.crashlytics.internal.common.a.a(contextN, n0Var, strJ, strN, listJ, new com.google.firebase.crashlytics.internal.f(contextN));
            com.google.firebase.crashlytics.internal.g.f().k("Installer package name is: " + aVarA.f120968d);
            com.google.firebase.crashlytics.internal.settings.g gVarL = com.google.firebase.crashlytics.internal.settings.g.l(contextN, strJ, n0Var, new f8.b(), aVarA.f120970f, aVarA.f120971g, gVar, i0Var);
            gVarL.o(nVar).h(executorService3, new com.google.android.gms.tasks.f() { // from class: com.google.firebase.crashlytics.i
                @Override // com.google.android.gms.tasks.f
                public final void d(Exception exc) {
                    com.google.firebase.crashlytics.internal.g.f().e("Error fetching settings.", exc);
                }
            });
            if (c0Var.C(aVarA, gVarL)) {
                c0Var.r(gVarL);
            }
            return new FirebaseCrashlytics(c0Var);
        } catch (PackageManager.NameNotFoundException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) com.google.firebase.h.p().l(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f120926a.m();
    }

    public void deleteUnsentReports() {
        this.f120926a.n();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f120926a.o();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f120926a.w();
    }

    public void log(@NonNull String str) {
        this.f120926a.x(str);
    }

    public void recordException(@NonNull Throwable th2) {
        if (th2 == null) {
            com.google.firebase.crashlytics.internal.g.f().m("A null value was passed to recordException. Ignoring.");
        } else {
            this.f120926a.y(th2, Collections.EMPTY_MAP);
        }
    }

    public void sendUnsentReports() {
        this.f120926a.D();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f120926a.E(Boolean.valueOf(z10));
    }

    public void setCustomKey(@NonNull String str, boolean z10) {
        this.f120926a.F(str, Boolean.toString(z10));
    }

    public void setCustomKeys(@NonNull h hVar) {
        this.f120926a.G(hVar.f120945a);
    }

    public void setUserId(@NonNull String str) {
        this.f120926a.I(str);
    }

    public void setCrashlyticsCollectionEnabled(@p0 Boolean bool) {
        this.f120926a.E(bool);
    }

    public void setCustomKey(@NonNull String str, double d10) {
        this.f120926a.F(str, Double.toString(d10));
    }

    public void setCustomKey(@NonNull String str, float f10) {
        this.f120926a.F(str, Float.toString(f10));
    }

    public void setCustomKey(@NonNull String str, int i10) {
        this.f120926a.F(str, Integer.toString(i10));
    }

    public void recordException(@NonNull Throwable th2, @NonNull h hVar) {
        if (th2 == null) {
            com.google.firebase.crashlytics.internal.g.f().m("A null value was passed to recordException. Ignoring.");
        } else {
            this.f120926a.y(th2, hVar.f120945a);
        }
    }

    public void setCustomKey(@NonNull String str, long j10) {
        this.f120926a.F(str, Long.toString(j10));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.f120926a.F(str, str2);
    }
}
