package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d1 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f296871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p2 f296872b;

    public d1(@NotNull h channel, @NotNull p2 job) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f296871a = channel;
        this.f296872b = job;
    }

    @Override // io.ktor.utils.io.x
    @NotNull
    public p2 a() {
        return this.f296872b;
    }

    @NotNull
    public final h b() {
        return this.f296871a;
    }
}
