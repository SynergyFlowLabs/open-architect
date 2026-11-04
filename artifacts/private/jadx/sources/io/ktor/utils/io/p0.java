package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 {
    @o0
    public static /* synthetic */ void a() {
    }

    @o0
    @NotNull
    public static final <T> Object b(@NotNull q0<T> serializer, @NotNull T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(value, "value");
        return new k0(serializer, value);
    }
}
