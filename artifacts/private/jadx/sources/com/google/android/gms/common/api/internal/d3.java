package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class d3 extends com.google.android.gms.internal.base.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e3 f105986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, Looper looper) {
        super(looper);
        this.f105986b = e3Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        com.google.android.gms.common.api.p pVar = (com.google.android.gms.common.api.p) message.obj;
        synchronized (this.f105986b.f106012e) {
            try {
                e3 e3Var = (e3) com.google.android.gms.common.internal.w.r(this.f105986b.f106009b);
                if (pVar == null) {
                    e3Var.m(new Status(13, "Transform returned null"));
                } else if (pVar instanceof t2) {
                    e3Var.m(((t2) pVar).k());
                } else {
                    e3Var.l(pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
