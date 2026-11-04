package com.planner5d.library.activity.fragment.list.holders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
public abstract class a<T> extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f134082a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void a();

    public abstract void g(@Nullable T t10);

    public void h(boolean z10) {
    }
}
