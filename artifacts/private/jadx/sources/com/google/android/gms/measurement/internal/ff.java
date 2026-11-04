package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.fg;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ff extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h7 f109970a;

    public ff(h7 h7Var) {
        this.f109970a = h7Var;
    }

    final /* synthetic */ void a() {
        this.f109970a.N().o(((Long) z4.D.b(null)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    @Override // android.content.BroadcastReceiver
    @androidx.annotation.l0
    public final void onReceive(Context context, Intent intent) {
        byte b10;
        if (intent == null) {
            this.f109970a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f109970a.a().r().a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                this.f109970a.a().r().a("App receiver called with unknown action");
                return;
            }
            h7 h7Var = this.f109970a;
            h7Var.a().w().a("[sgtm] App Receiver notified batches are available");
            h7Var.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.cf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f109867a.a();
                }
            });
            return;
        }
        final h7 h7Var2 = this.f109970a;
        fg.a();
        if (h7Var2.w().H(null, z4.R0)) {
            h7Var2.a().w().a("App receiver notified triggers are available");
            h7Var2.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.df
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    h7 h7Var3 = h7Var2;
                    if (!h7Var3.C().G()) {
                        h7Var3.a().r().a("registerTrigger called but app not eligible");
                        return;
                    }
                    h7Var3.B().u0();
                    final ta taVarB = h7Var3.B();
                    Objects.requireNonNull(taVarB);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.ef
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            taVarB.v0();
                        }
                    }).start();
                }
            });
        }
    }
}
