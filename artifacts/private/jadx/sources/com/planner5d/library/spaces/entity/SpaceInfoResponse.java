package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@i(generateAdapter = true)
public final class SpaceInfoResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230188c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f230189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final SpaceInfo f230190b;

    public SpaceInfoResponse(@NotNull String status, @Nullable SpaceInfo spaceInfo) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f230189a = status;
        this.f230190b = spaceInfo;
    }

    @Nullable
    public final SpaceInfo a() {
        return this.f230190b;
    }

    @NotNull
    public final String b() {
        return this.f230189a;
    }
}
