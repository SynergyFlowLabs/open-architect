package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import com.google.android.gms.measurement.internal.o6;
import com.google.android.gms.measurement.internal.p6;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementReceiver extends g2.a implements o6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p6 f109720d;

    @Override // com.google.android.gms.measurement.internal.o6
    @l0
    public void a(@NonNull Context context, @NonNull Intent intent) {
        g2.a.c(context, intent);
    }

    @NonNull
    public BroadcastReceiver.PendingResult d() {
        return goAsync();
    }

    @Override // android.content.BroadcastReceiver
    @l0
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f109720d == null) {
            this.f109720d = new p6(this);
        }
        this.f109720d.a(context, intent);
    }
}
