package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class g1 extends com.google.android.gms.internal.base.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i1 f106031b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g1(i1 i1Var, Looper looper) {
        super(looper);
        this.f106031b = i1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            i1.Q(this.f106031b);
        } else {
            if (i10 != 2) {
                return;
            }
            i1.P(this.f106031b);
        }
    }
}
