package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<Throwable, kotlin.coroutines.d<? super Unit>, Object> f294973a;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@NotNull Function2<? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f294973a = handler;
    }

    @NotNull
    public final Function2<Throwable, kotlin.coroutines.d<? super Unit>, Object> a() {
        return this.f294973a;
    }
}
