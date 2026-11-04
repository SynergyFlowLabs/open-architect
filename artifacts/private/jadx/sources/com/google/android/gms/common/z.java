package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"HandlerLeak"})
final class z extends com.google.android.gms.internal.base.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f106992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f106993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f106993c = fVar;
        this.f106992b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        f fVar = this.f106993c;
        int iJ = fVar.j(this.f106992b);
        if (fVar.o(iJ)) {
            this.f106993c.D(this.f106992b, iJ);
        }
    }
}
