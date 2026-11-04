package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class i extends h {
    i(j jVar, l lVar, String str) {
        super(jVar, new com.google.android.play.core.review.internal.i("OnRequestInstallCallback"), lVar);
    }

    @Override // com.google.android.play.core.review.h, com.google.android.play.core.review.internal.h
    public final void r(Bundle bundle) throws RemoteException {
        super.r(bundle);
        this.f114942b.e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
