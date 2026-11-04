package com.planner5d.library.model;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f222843c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f222844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f222845b;

    public v(int i10, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f222844a = i10;
        this.f222845b = title;
    }

    public final int a() {
        return this.f222844a;
    }

    @NotNull
    public final String b() {
        return this.f222845b;
    }

    @NotNull
    public String toString() {
        return this.f222845b;
    }
}
