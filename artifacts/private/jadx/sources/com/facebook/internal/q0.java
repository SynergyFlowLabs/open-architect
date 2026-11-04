package com.facebook.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q0 f100060a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f100061b = "Unity.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile String f100062c;

    private q0() {
    }

    @oj.n
    @Nullable
    public static final String a() {
        return f100062c;
    }

    public static final boolean b() {
        String str = f100062c;
        return Intrinsics.areEqual(str != null ? Boolean.valueOf(StringsKt.u2(str, f100061b, false, 2, null)) : null, Boolean.TRUE);
    }

    @oj.n
    public static /* synthetic */ void c() {
    }

    @oj.n
    public static final void d(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        f100062c = value;
    }
}
