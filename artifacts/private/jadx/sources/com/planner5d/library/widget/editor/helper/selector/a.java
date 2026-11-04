package com.planner5d.library.widget.editor.helper.selector;

import android.graphics.PointF;
import com.planner5d.library.model.item.Item;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    boolean B(@Nullable Item item);

    @NotNull
    Observable<Void> M(@NotNull PointF pointF, @Nullable Item[] itemArr);

    void d(@Nullable Item item);

    void p(@Nullable String str);

    void t(@Nullable Item item, boolean z10);
}
