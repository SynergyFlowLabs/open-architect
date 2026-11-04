package io.ktor.utils.io;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends IllegalStateException {
    public /* synthetic */ f0(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull String taskName, @Nullable Throwable th2) {
        super("Concurrent " + taskName + " attempts", th2);
        Intrinsics.checkNotNullParameter(taskName, "taskName");
    }
}
