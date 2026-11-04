package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class y0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f297181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p2 f297182b;

    public y0(@NotNull p channel, @NotNull p2 job) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f297181a = channel;
        this.f297182b = job;
    }

    @Override // io.ktor.utils.io.x
    @NotNull
    public p2 a() {
        return this.f297182b;
    }

    @NotNull
    public final p b() {
        return this.f297181a;
    }
}
