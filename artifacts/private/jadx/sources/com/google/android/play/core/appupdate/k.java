package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class k implements com.google.android.play.core.common.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f114864a;

    k(l lVar, Activity activity) {
        this.f114864a = activity;
    }

    @Override // com.google.android.play.core.common.a
    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        this.f114864a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
