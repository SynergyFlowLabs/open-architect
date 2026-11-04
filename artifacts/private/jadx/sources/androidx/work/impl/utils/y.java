package androidx.work.impl.utils;

import androidx.annotation.b1;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.u f77283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.a0 f77284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final WorkerParameters.a f77285c;

    public y(@NotNull androidx.work.impl.u processor, @NotNull androidx.work.impl.a0 startStopToken, @Nullable WorkerParameters.a aVar) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(startStopToken, "startStopToken");
        this.f77283a = processor;
        this.f77284b = startStopToken;
        this.f77285c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f77283a.q(this.f77284b, this.f77285c);
    }
}
