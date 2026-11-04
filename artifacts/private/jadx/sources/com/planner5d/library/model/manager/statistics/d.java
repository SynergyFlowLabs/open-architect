package com.planner5d.library.model.manager.statistics;

import android.os.Bundle;
import java.lang.Enum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface d<T extends Enum<?>> {
    @NotNull
    T a(@Nullable Bundle bundle, @NotNull T t10);

    @NotNull
    Bundle b(@NotNull Bundle bundle, @Nullable T t10);

    @Nullable
    T c(@Nullable Bundle bundle);

    void d(@NotNull Bundle bundle, @NotNull T t10);
}
