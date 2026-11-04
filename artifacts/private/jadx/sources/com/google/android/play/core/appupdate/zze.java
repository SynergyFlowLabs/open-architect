package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes4.dex */
final class zze extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f114897a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(l lVar, Handler handler, com.google.android.gms.tasks.l lVar2) {
        super(handler);
        this.f114897a = lVar2;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            this.f114897a.e(-1);
            return;
        }
        com.google.android.gms.tasks.l lVar = this.f114897a;
        if (i10 != 2) {
            lVar.e(1);
        } else {
            lVar.e(0);
        }
    }
}
