package com.planner5d.library.spaces.view.search;

import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class f extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230462b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee.p f230463a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull ee.p binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f230463a = binding;
    }

    public final void g(@NotNull i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f230463a.f274858b.setText(state.b());
    }
}
