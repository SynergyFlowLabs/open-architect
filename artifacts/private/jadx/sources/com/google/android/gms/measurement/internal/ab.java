package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes4.dex */
public final class ab extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JobScheduler f109753c;

    public ab(h7 h7Var) {
        super(h7Var);
    }

    @Override // com.google.android.gms.measurement.internal.b5
    protected final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.b5
    @e.b(24)
    @androidx.annotation.m1
    protected final void n() {
        this.f109753c = (JobScheduler) this.f110184a.d().getSystemService("jobscheduler");
    }

    @e.b(24)
    @androidx.annotation.m1
    public final void o(long j10) {
        j();
        h();
        JobScheduler jobScheduler = this.f109753c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.f110184a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.u7 u7VarQ = q();
        if (u7VarQ != com.google.android.gms.internal.measurement.u7.CLIENT_UPLOAD_ELIGIBLE) {
            this.f110184a.a().w().b("[sgtm] Not eligible for Scion upload", u7VarQ.name());
            return;
        }
        h7 h7Var = this.f110184a;
        h7Var.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(com.facebook.internal.w0.f100156c1, "com.google.android.gms.measurement.SCION_UPLOAD");
        h7Var.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) com.google.android.gms.common.internal.w.r(this.f109753c)).schedule(new JobInfo.Builder(p(), new ComponentName(h7Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    @androidx.annotation.l1
    final int p() {
        return "measurement-client".concat(String.valueOf(this.f110184a.d().getPackageName())).hashCode();
    }

    @androidx.annotation.m1
    final com.google.android.gms.internal.measurement.u7 q() {
        j();
        h();
        if (this.f109753c == null) {
            return com.google.android.gms.internal.measurement.u7.MISSING_JOB_SCHEDULER;
        }
        h7 h7Var = this.f110184a;
        if (!h7Var.w().P()) {
            return com.google.android.gms.internal.measurement.u7.NOT_ENABLED_IN_MANIFEST;
        }
        h7 h7Var2 = this.f110184a;
        if (h7Var2.L().u() < 119000) {
            return com.google.android.gms.internal.measurement.u7.SDK_TOO_OLD;
        }
        if (ze.F(h7Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return !h7Var2.J().y() ? com.google.android.gms.internal.measurement.u7.NON_PLAY_MODE : com.google.android.gms.internal.measurement.u7.CLIENT_UPLOAD_ELIGIBLE;
        }
        return com.google.android.gms.internal.measurement.u7.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
