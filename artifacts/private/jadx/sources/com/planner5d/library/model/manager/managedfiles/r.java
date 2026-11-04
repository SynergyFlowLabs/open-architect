package com.planner5d.library.model.manager.managedfiles;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface r {
    boolean a(@NotNull String str);

    void b(@Nullable File file) throws Throwable;

    boolean c(@NotNull String str);

    void d(int i10);

    @Nullable
    Object e(@NotNull kotlin.coroutines.d<? super v> dVar);

    boolean f(@NotNull String str);

    void g(@NotNull String str);

    @Nullable
    Object h(boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    void validate();
}
