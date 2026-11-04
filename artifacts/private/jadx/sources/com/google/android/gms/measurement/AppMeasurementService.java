package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import androidx.annotation.p0;
import com.google.android.gms.measurement.internal.bd;
import com.google.android.gms.measurement.internal.fd;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementService extends Service implements bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fd f109721a;

    private final fd c() {
        if (this.f109721a == null) {
            this.f109721a = new fd(this);
        }
        return this.f109721a;
    }

    @Override // com.google.android.gms.measurement.internal.bd
    public final void a(@NonNull Intent intent) {
        g2.a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.bd
    public final void b(@NonNull JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.bd
    public final boolean o(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    @l0
    @p0
    public IBinder onBind(@NonNull Intent intent) {
        return c().d(intent);
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

    @Override // android.app.Service
    @l0
    public int onStartCommand(@NonNull Intent intent, int i10, int i11) {
        c().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    @l0
    public boolean onUnbind(@NonNull Intent intent) {
        c();
        fd.j(intent);
        return true;
    }
}
