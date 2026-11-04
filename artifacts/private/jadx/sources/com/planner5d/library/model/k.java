package com.planner5d.library.model;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180763c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f180764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Boolean f180765b;

    public k(@NotNull h record, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.f180764a = record;
        this.f180765b = bool;
    }

    @Nullable
    public final Boolean a() {
        return this.f180765b;
    }

    @NotNull
    public final h b() {
        return this.f180764a;
    }
}
