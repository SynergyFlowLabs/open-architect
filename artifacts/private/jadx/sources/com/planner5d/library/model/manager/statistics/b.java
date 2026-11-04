package com.planner5d.library.model.manager.statistics;

import android.os.Bundle;
import java.lang.Enum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class b<T extends Enum<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private T f202900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c<T> f202901b;

    public b(@NotNull T source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f202900a = source;
        this.f202901b = new c<>();
    }

    @NotNull
    public final T a() {
        return this.f202900a;
    }

    public final void b(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        T t10 = (T) this.f202901b.c(bundle);
        if (t10 == null && (t10 = (T) this.f202901b.c(bundle2)) == null) {
            t10 = this.f202900a;
        }
        this.f202900a = t10;
    }

    public final void c(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f202901b.d(state, this.f202900a);
    }
}
