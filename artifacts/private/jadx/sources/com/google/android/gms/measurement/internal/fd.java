package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f109966a;

    public fd(Context context) {
        com.google.android.gms.common.internal.w.r(context);
        this.f109966a = context;
    }

    @androidx.annotation.l0
    public static final void i(Intent intent) {
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    @androidx.annotation.l0
    public static final boolean j(Intent intent) {
        if (intent == null) {
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    private final void k(qe qeVar, Runnable runnable) {
        qeVar.b().t(new ad(this, qeVar, runnable));
    }

    @androidx.annotation.l0
    public final void a() {
        this.f109966a.getClass().getSimpleName().concat(" is starting up.");
    }

    @androidx.annotation.l0
    public final void b() {
        this.f109966a.getClass().getSimpleName().concat(" is shutting down.");
    }

    @androidx.annotation.l0
    public final int c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            return 2;
        }
        Context context = this.f109966a;
        h7 h7VarO = h7.O(context, null, null);
        final w5 w5VarA = h7VarO.a();
        String action = intent.getAction();
        h7VarO.c();
        w5VarA.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(qe.F(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.ed
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f109932a.f(i11, w5VarA, intent);
                }
            });
        }
        return 2;
    }

    @androidx.annotation.l0
    public final IBinder d(Intent intent) {
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new j8(qe.F(this.f109966a), null);
        }
        "onBind received unknown action: ".concat(String.valueOf(action));
        return null;
    }

    @e.b(24)
    @androidx.annotation.l0
    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString(com.facebook.internal.w0.f100156c1);
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) com.google.android.gms.common.internal.w.r(string);
            qe qeVarF = qe.F(this.f109966a);
            final w5 w5VarA = qeVarF.a();
            qeVarF.c();
            w5VarA.w().b("Local AppMeasurementJobService called. action", str);
            k(qeVarF, new Runnable() { // from class: com.google.android.gms.measurement.internal.cd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f109860a.g(w5VarA, jobParameters);
                }
            });
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            int i10 = 2 | 0;
            com.google.android.gms.internal.measurement.f4.v(this.f109966a, null).R(new Runnable() { // from class: com.google.android.gms.measurement.internal.dd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f109894a.h(jobParameters);
                }
            });
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(int i10, w5 w5Var, Intent intent) {
        Context context = this.f109966a;
        bd bdVar = (bd) context;
        if (bdVar.o(i10)) {
            w5Var.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            h7.O(context, null, null).a().w().a("Completed wakeful intent.");
            bdVar.a(intent);
        }
    }

    final /* synthetic */ void g(w5 w5Var, JobParameters jobParameters) {
        w5Var.w().a("AppMeasurementJobService processed last upload request.");
        ((bd) this.f109966a).b(jobParameters, false);
    }

    final /* synthetic */ void h(JobParameters jobParameters) {
        ((bd) this.f109966a).b(jobParameters, false);
    }
}
