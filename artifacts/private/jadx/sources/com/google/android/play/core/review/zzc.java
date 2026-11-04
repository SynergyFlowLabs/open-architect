package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class zzc extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f114981a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(e eVar, Handler handler, l lVar) {
        super(handler);
        this.f114981a = lVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f114981a.e(null);
    }
}
