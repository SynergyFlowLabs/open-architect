package com.google.firebase.installations;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q {
    @NotNull
    public static final j a(@NotNull com.google.firebase.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        j jVarU = j.u();
        Intrinsics.checkNotNullExpressionValue(jVarU, "getInstance()");
        return jVarU;
    }

    @NotNull
    public static final j b(@NotNull com.google.firebase.d dVar, @NotNull com.google.firebase.h app2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(app2, "app");
        j jVarV = j.v(app2);
        Intrinsics.checkNotNullExpressionValue(jVarV, "getInstance(app)");
        return jVarV;
    }
}
