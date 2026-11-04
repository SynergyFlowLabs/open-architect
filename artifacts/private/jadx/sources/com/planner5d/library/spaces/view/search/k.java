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
public final class k extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230473b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee.r f230474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull ee.r binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f230474a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function0 function0, View view) {
        function0.invoke();
    }

    public final void h(@NotNull i item, @NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f230474a.f274865c.setText(item.a());
        this.f230474a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.search.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.i(listener, view);
            }
        });
    }
}
