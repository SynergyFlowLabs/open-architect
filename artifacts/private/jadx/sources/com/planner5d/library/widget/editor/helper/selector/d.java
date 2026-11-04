package com.planner5d.library.widget.editor.helper.selector;

import android.graphics.PointF;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f256758a = 0;

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public boolean B(@Nullable Item item) {
        return false;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @NotNull
    public Observable<Void> M(@NotNull PointF point, @Nullable Item[] itemArr) {
        Intrinsics.checkNotNullParameter(point, "point");
        Observable<Void> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void d(@Nullable Item item) {
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void p(@Nullable String str) {
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    public void t(@Nullable Item item, boolean z10) {
    }
}
