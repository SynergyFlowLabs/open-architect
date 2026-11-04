package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class l1 extends com.google.android.gms.internal.base.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m1 f106117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l1(m1 m1Var, Looper looper) {
        super(looper);
        this.f106117b = m1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((k1) message.obj).b(this.f106117b);
        } else if (i10 == 2) {
            throw ((RuntimeException) message.obj);
        }
    }
}
