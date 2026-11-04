package com.planner5d.library.spaces.view.search;

import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class l extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230475b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee.q f230476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull ee.q binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f230476a = binding;
    }

    public final void g() {
        ee.q qVar = this.f230476a;
        qVar.f274860b.setImageDrawable(androidx.core.content.d.l(qVar.getRoot().getContext(), de.b.g.f271894n8));
        qVar.f274861c.setText(qVar.getRoot().getContext().getString(de.b.r.Qs));
        qVar.f274862d.setText(qVar.getRoot().getContext().getString(de.b.r.Rs));
    }
}
