package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: loaded from: classes4.dex */
final class y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f106987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f106988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.activity.result.h f106989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f106990d;

    y(f fVar, Activity activity, int i10, androidx.activity.result.h hVar) {
        this.f106987a = activity;
        this.f106988b = i10;
        this.f106989c = hVar;
        this.f106990d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        PendingIntent pendingIntentF = this.f106990d.f(this.f106987a, this.f106988b, 0);
        if (pendingIntentF == null) {
            return;
        }
        this.f106989c.b(new IntentSenderRequest.a(pendingIntentF.getIntentSender()).a());
    }
}
