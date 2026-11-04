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
public final class n extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230478b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee.q f230479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull ee.q binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f230479a = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function0 function0, View view) {
        function0.invoke();
    }

    public final void h(@NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ee.q qVar = this.f230479a;
        qVar.f274860b.setImageDrawable(androidx.core.content.d.l(qVar.getRoot().getContext(), de.b.g.f271894n8));
        qVar.f274861c.setText(qVar.getRoot().getContext().getString(de.b.r.Ss));
        qVar.f274862d.setText(qVar.getRoot().getContext().getString(de.b.r.Ts));
        qVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.search.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.i(listener, view);
            }
        });
    }
}
