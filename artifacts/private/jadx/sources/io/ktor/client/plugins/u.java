package io.ktor.client.plugins;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@io.ktor.utils.io.r0
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object>> f295131a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<t> f295132b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f295133c = true;

    public final boolean a() {
        return this.f295133c;
    }

    @NotNull
    public final List<t> b() {
        return this.f295132b;
    }

    @NotNull
    public final List<Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object>> c() {
        return this.f295131a;
    }

    public final void d(@NotNull pj.n<? super Throwable, ? super fi.w, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295132b.add(new n1(block));
    }

    public final void e(@NotNull pj.n<? super Throwable, ? super fi.w, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295132b.add(new n1(block));
    }

    public final void f(boolean z10) {
        this.f295133c = z10;
    }

    public final void g(@NotNull Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295131a.add(block);
    }
}
