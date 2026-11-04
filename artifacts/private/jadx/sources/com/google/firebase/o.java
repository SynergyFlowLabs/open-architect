package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes5.dex */
public class o extends Exception {
    @Deprecated
    protected o() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NonNull String str) {
        super(str);
        w.m(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NonNull String str, @NonNull Throwable th2) {
        super(str, th2);
        w.m(str, "Detail message must not be empty");
    }
}
