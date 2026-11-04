package io.ktor.util;

import java.nio.charset.Charset;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f296497a = 16;

    @NotNull
    public static final k0 a(@NotNull String str) {
        return d0.b(str);
    }

    @io.ktor.utils.io.o0
    @Nullable
    public static final Object b(@NotNull k0 k0Var, @NotNull String str, @NotNull Charset charset, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        return e0.a(k0Var, str, charset, dVar);
    }

    @io.ktor.utils.io.o0
    @Nullable
    public static final Object c(@NotNull k0 k0Var, @NotNull byte[] bArr, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        return e0.b(k0Var, bArr, dVar);
    }

    @NotNull
    public static final String e() {
        return d0.c();
    }

    @NotNull
    public static final byte[] f(int i10) {
        return e0.d(i10);
    }

    @NotNull
    public static final Function1<String, byte[]> g(@NotNull String str, @NotNull Function1<? super String, String> function1) {
        return d0.f(str, function1);
    }

    @NotNull
    public static final String h(@NotNull byte[] bArr) {
        return e0.e(bArr);
    }

    @NotNull
    public static final byte[] i(@NotNull String str) {
        return e0.f(str);
    }

    @NotNull
    public static final byte[] j(@NotNull byte[] bArr) {
        return d0.h(bArr);
    }
}
