package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes4.dex */
public final class wd extends be {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AlarmManager f110649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w f110650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f110651f;

    protected wd(qe qeVar) {
        super(qeVar);
        this.f110649d = (AlarmManager) this.f110184a.d().getSystemService(androidx.core.app.w.K0);
    }

    private final w o() {
        if (this.f110650e == null) {
            this.f110650e = new vd(this, this.f110700b.g0());
        }
        return this.f110650e;
    }

    @e.b(24)
    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f110184a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f110651f == null) {
            this.f110651f = Integer.valueOf("measurement".concat(String.valueOf(this.f110184a.d().getPackageName())).hashCode());
        }
        return this.f110651f.intValue();
    }

    private final PendingIntent r() {
        Context contextD = this.f110184a.d();
        return PendingIntent.getBroadcast(contextD, 0, new Intent().setClassName(contextD, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.j1.f108576a);
    }

    @Override // com.google.android.gms.measurement.internal.be
    protected final boolean l() {
        AlarmManager alarmManager = this.f110649d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        p();
        return false;
    }

    public final void m(long j10) {
        j();
        h7 h7Var = this.f110184a;
        h7Var.c();
        Context contextD = h7Var.d();
        if (!ze.j0(contextD)) {
            h7Var.a().v().a("Receiver not registered/enabled");
        }
        if (!ze.E(contextD, false)) {
            h7Var.a().v().a("Service not registered/enabled");
        }
        n();
        h7Var.a().w().b("Scheduling upload, millis", Long.valueOf(j10));
        h7Var.e().b();
        h7Var.w();
        if (j10 < Math.max(0L, ((Long) z4.M.b(null)).longValue()) && !o().c()) {
            o().b(j10);
        }
        h7Var.c();
        Context contextD2 = h7Var.d();
        ComponentName componentName = new ComponentName(contextD2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iQ = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(com.facebook.internal.w0.f100156c1, "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.k1.a(contextD2, new JobInfo.Builder(iQ, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f110184a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f110649d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        p();
    }
}
