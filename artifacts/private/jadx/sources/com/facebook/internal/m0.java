package com.facebook.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f99998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Exception f99999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f100000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Bitmap f100001d;

    public m0(@NotNull l0 request, @Nullable Exception exc, boolean z10, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f99998a = request;
        this.f99999b = exc;
        this.f100000c = z10;
        this.f100001d = bitmap;
    }

    @Nullable
    public final Bitmap a() {
        return this.f100001d;
    }

    @Nullable
    public final Exception b() {
        return this.f99999b;
    }

    @NotNull
    public final l0 c() {
        return this.f99998a;
    }

    public final boolean d() {
        return this.f100000c;
    }
}
