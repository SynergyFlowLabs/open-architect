package io.ktor.util;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s0 f296806a = new s0();

    private s0() {
    }

    public final int a(@NotNull Object... objects) {
        Intrinsics.checkNotNullParameter(objects, "objects");
        return ArraysKt.toList(objects).hashCode();
    }
}
