package com.planner5d.library.model.manager.performancetracing.sentry;

import com.planner5d.library.model.manager.performancetracing.g;
import io.sentry.p1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p1 f193121b;

    public d(@NotNull p1 span) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.f193121b = span;
    }

    @Override // com.planner5d.library.model.manager.performancetracing.g
    public void b(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f193121b.D(throwable);
        this.f193121b.u();
    }

    @NotNull
    public final p1 c() {
        return this.f193121b;
    }

    @Override // com.planner5d.library.model.manager.performancetracing.g
    public void complete() {
        this.f193121b.u();
    }
}
