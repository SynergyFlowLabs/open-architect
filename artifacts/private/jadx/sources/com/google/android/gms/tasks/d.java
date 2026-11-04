package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends IllegalStateException {
    private d(String str, @androidx.annotation.p0 Throwable th2) {
        super(str, th2);
    }

    @NonNull
    public static IllegalStateException a(@NonNull Task<?> task) {
        String strConcat;
        if (!task.t()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excP = task.p();
        if (excP != null) {
            strConcat = com.facebook.login.v.L;
        } else if (task.u()) {
            strConcat = "result ".concat(String.valueOf(task.q()));
        } else {
            strConcat = task.s() ? "cancellation" : "unknown issue";
        }
        return new d("Complete with: ".concat(strConcat), excP);
    }
}
