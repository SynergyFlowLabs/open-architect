package io.ktor.utils.io;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class z {
    @NotNull
    public static final p a(@NotNull p pVar, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> onClose) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        return new y(pVar, onClose);
    }
}
