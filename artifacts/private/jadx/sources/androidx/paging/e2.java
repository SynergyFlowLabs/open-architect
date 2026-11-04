package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "PagingLiveData")
public final class e2 {
    @NotNull
    public static final <T> androidx.lifecycle.w0<x1<T>> a(@NotNull androidx.lifecycle.w0<x1<T>> w0Var, @NotNull androidx.lifecycle.c0 lifecycle) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        return androidx.lifecycle.w.g(j.a(androidx.lifecycle.w.a(w0Var), androidx.lifecycle.m0.a(lifecycle)), null, 0L, 3, null);
    }

    @NotNull
    public static final <T> androidx.lifecycle.w0<x1<T>> b(@NotNull androidx.lifecycle.w0<x1<T>> w0Var, @NotNull androidx.lifecycle.f2 viewModel) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        int i10 = 3 << 0;
        return androidx.lifecycle.w.g(j.a(androidx.lifecycle.w.a(w0Var), androidx.lifecycle.g2.a(viewModel)), null, 0L, 3, null);
    }

    @NotNull
    public static final <T> androidx.lifecycle.w0<x1<T>> c(@NotNull androidx.lifecycle.w0<x1<T>> w0Var, @NotNull kotlinx.coroutines.s0 scope) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return androidx.lifecycle.w.g(j.a(androidx.lifecycle.w.a(w0Var), scope), null, 0L, 3, null);
    }

    @NotNull
    public static final <Key, Value> androidx.lifecycle.w0<x1<Value>> d(@NotNull v1<Key, Value> v1Var) {
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        int i10 = 5 << 0;
        return androidx.lifecycle.w.g(v1Var.a(), null, 0L, 3, null);
    }
}
