package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class j extends com.google.android.gms.internal.cloudmessaging.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f105788b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(d dVar, Looper looper) {
        super(looper);
        this.f105788b = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d.g(this.f105788b, message);
    }
}
