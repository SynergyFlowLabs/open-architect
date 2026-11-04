package com.planner5d.library.smartwizard.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f229892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f229893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f229894c;

    public a(@NotNull String name, @NotNull String categoryKey, @NotNull String localizationKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(localizationKey, "localizationKey");
        this.f229892a = name;
        this.f229893b = categoryKey;
        this.f229894c = localizationKey;
    }

    @NotNull
    public final String a() {
        return this.f229893b;
    }

    @NotNull
    public final String b() {
        return this.f229894c;
    }

    @NotNull
    public final String c() {
        return this.f229892a;
    }
}
