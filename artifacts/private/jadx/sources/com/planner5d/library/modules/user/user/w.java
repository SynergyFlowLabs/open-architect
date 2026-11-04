package com.planner5d.library.modules.user.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes9.dex */
public interface w {
    @Nullable
    id.a a();

    boolean b();

    @Nullable
    Object c(@NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @NotNull
    kotlinx.coroutines.flow.o0<id.a> d();

    long e();

    @androidx.annotation.m1
    void f(@Nullable id.a aVar);

    @NotNull
    Observable<id.a> g(@NotNull id.a aVar);

    @NotNull
    String h();
}
