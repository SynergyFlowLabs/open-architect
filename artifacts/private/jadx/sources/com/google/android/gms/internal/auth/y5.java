package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class y5 extends RuntimeException {
    public y5(w4 w4Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final a4 a() {
        return new a4(getMessage());
    }
}
