package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
@i(generateAdapter = true)
public final class ProjectInfoResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230158c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f230159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final ProjectInfo f230160b;

    public ProjectInfoResponse(@NotNull String status, @Nullable ProjectInfo projectInfo) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f230159a = status;
        this.f230160b = projectInfo;
    }

    @Nullable
    public final ProjectInfo a() {
        return this.f230160b;
    }

    @NotNull
    public final String b() {
        return this.f230159a;
    }
}
