package com.planner5d.library.aichat.view.bottomsheet;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final wa.g f142023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull wa.g item) {
        super(item.getRoot());
        Intrinsics.checkNotNullParameter(item, "item");
        this.f142023a = item;
    }

    public final void g(@NotNull d0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f142023a.f385992c.setText(message.c().n());
    }
}
