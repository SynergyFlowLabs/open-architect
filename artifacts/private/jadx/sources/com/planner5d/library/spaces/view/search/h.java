package com.planner5d.library.spaces.view.search;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class h extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230465b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee.q f230466a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull ee.q binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f230466a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function0 function0, View view) {
        function0.invoke();
    }

    public final void h(@NotNull i state, @NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f230466a.f274861c.setText(state.b());
        this.f230466a.f274862d.setText(state.c());
        this.f230466a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.search.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.i(listener, view);
            }
        });
    }
}
