package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class e9 extends RuntimeException {
    public e9(h8 h8Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final l7 a() {
        return new l7(getMessage());
    }
}
