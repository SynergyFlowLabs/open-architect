package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class v4 extends TimeoutException {
    /* synthetic */ v4(String str, w4 w4Var) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        try {
            setStackTrace(new StackTraceElement[0]);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
