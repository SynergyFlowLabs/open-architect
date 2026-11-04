package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k1 {
    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @NotNull
    public static final StackTraceElement c(@NotNull kotlin.reflect.d<?> kClass, @NotNull String methodName, @NotNull String fileName, int i10) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new StackTraceElement(oj.b.e(kClass).getName(), methodName, fileName, i10);
    }
}
