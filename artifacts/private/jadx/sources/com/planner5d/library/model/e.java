package com.planner5d.library.model;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f180680d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f180681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f180682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final byte[] f180683c;

    public e(long j10, @NotNull String title, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f180681a = j10;
        this.f180682b = title;
        this.f180683c = bArr;
    }

    @Nullable
    public final byte[] a() {
        return this.f180683c;
    }

    public final long b() {
        return this.f180681a;
    }

    @NotNull
    public final String c() {
        return this.f180682b;
    }
}
