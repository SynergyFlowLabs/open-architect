package com.planner5d.library.model;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f222435d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f222436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f222437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f222438c;

    public o(int i10, @NotNull String name, @NotNull String title) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f222436a = i10;
        this.f222437b = name;
        this.f222438c = title;
    }

    public final int a() {
        return this.f222436a;
    }

    @NotNull
    public final String b() {
        return this.f222437b;
    }

    @NotNull
    public final String c() {
        return this.f222438c;
    }
}
