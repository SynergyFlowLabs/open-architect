package androidx.work.impl;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface p0 {
    default void a(@NotNull a0 workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        d(workSpecId, i10);
    }

    default void b(@NotNull a0 workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        c(workSpecId, null);
    }

    void c(@NotNull a0 a0Var, @Nullable WorkerParameters.a aVar);

    void d(@NotNull a0 a0Var, int i10);

    default void e(@NotNull a0 workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        d(workSpecId, androidx.work.l0.f77348o);
    }
}
