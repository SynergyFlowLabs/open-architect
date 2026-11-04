package com.planner5d.library.widget;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface j {
    boolean hasNext();

    void next();

    void setAdapter(@Nullable RecyclerView.h<?> hVar);

    void setOnSlideChange(@NotNull Function1<? super Integer, Unit> function1);
}
