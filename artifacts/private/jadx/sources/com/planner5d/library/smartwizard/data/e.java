package com.planner5d.library.smartwizard.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f229920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f229921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f229922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f229923d;

    public e(@NotNull String imageUri, @NotNull String title, @Nullable String str, long j10) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f229920a = imageUri;
        this.f229921b = title;
        this.f229922c = str;
        this.f229923d = j10;
    }

    @NotNull
    public final String a() {
        return this.f229920a;
    }

    @Nullable
    public final String b() {
        return this.f229922c;
    }

    public final long c() {
        return this.f229923d;
    }

    @NotNull
    public final String d() {
        return this.f229921b;
    }
}
