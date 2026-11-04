package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n1 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pj.n<Throwable, fi.w, kotlin.coroutines.d<? super Unit>, Object> f294912a;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(@NotNull pj.n<? super Throwable, ? super fi.w, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f294912a = handler;
    }

    @NotNull
    public final pj.n<Throwable, fi.w, kotlin.coroutines.d<? super Unit>, Object> a() {
        return this.f294912a;
    }
}
