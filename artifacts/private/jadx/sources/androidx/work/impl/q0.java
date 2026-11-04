package androidx.work.impl;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u f77099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.utils.taskexecutor.b f77100b;

    public q0(@NotNull u processor, @NotNull androidx.work.impl.utils.taskexecutor.b workTaskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f77099a = processor;
        this.f77100b = workTaskExecutor;
    }

    @Override // androidx.work.impl.p0
    public void c(@NotNull a0 workSpecId, @Nullable WorkerParameters.a aVar) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f77100b.b(new androidx.work.impl.utils.y(this.f77099a, workSpecId, aVar));
    }

    @Override // androidx.work.impl.p0
    public void d(@NotNull a0 workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f77100b.b(new androidx.work.impl.utils.a0(this.f77099a, workSpecId, false, i10));
    }

    @NotNull
    public final u f() {
        return this.f77099a;
    }

    @NotNull
    public final androidx.work.impl.utils.taskexecutor.b g() {
        return this.f77100b;
    }
}
