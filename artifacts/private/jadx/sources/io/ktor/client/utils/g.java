package io.ktor.client.utils;

import io.ktor.utils.io.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @o0
    @NotNull
    public static final n0 a(@NotNull l1 l1Var, int i10, @NotNull String dispatcherName) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(dispatcherName, "dispatcherName");
        return n0.d0(l1.c(), i10, null, 2, null);
    }

    public static /* synthetic */ n0 b(l1 l1Var, int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "ktor-client-dispatcher";
        }
        return a(l1Var, i10, str);
    }
}
