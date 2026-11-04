package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import com.google.android.gms.measurement.internal.bd;
import com.google.android.gms.measurement.internal.fd;

/* JADX INFO: loaded from: classes4.dex */
@e.b(24)
public final class AppMeasurementJobService extends JobService implements bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fd f109719a;

    private final fd c() {
        if (this.f109719a == null) {
            this.f109719a = new fd(this);
        }
        return this.f109719a;
    }

    @Override // com.google.android.gms.measurement.internal.bd
    public final void a(@NonNull Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.bd
    @e.b(24)
    public final void b(@NonNull JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.bd
    public final boolean o(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    @l0
    public void onCreate() {
        super.onCreate();
        c().a();
    }

    @Override // android.app.Service
    @l0
    public void onDestroy() {
        c().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    @l0
    public void onRebind(@NonNull Intent intent) {
        c();
        fd.i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        c().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @l0
    public boolean onUnbind(@NonNull Intent intent) {
        c();
        fd.j(intent);
        return true;
    }
}
