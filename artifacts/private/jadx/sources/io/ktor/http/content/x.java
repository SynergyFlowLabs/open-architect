package io.ktor.http.content;

import io.ktor.utils.io.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class x {
    @o0
    public static final boolean a(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar instanceof w.c) {
            return true;
        }
        if (wVar instanceof w.b) {
            return a(((w.b) wVar).i());
        }
        return false;
    }
}
