package io.ktor.http;

import com.superwall.sdk.network.Api;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t2 {
    public static final boolean a(@NotNull s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        if (!Intrinsics.areEqual(s2Var.getName(), Api.scheme) && !Intrinsics.areEqual(s2Var.getName(), "wss")) {
            return false;
        }
        return true;
    }

    public static final boolean b(@NotNull s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        return Intrinsics.areEqual(s2Var.getName(), "ws") || Intrinsics.areEqual(s2Var.getName(), "wss");
    }
}
