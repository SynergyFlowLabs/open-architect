package com.planner5d.library.activity.fragment.dialog;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final FragmentManager f132840a;

    public r(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f132840a = fragmentManager;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.l
    public void a(@NotNull androidx.fragment.app.m dialog, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!this.f132840a.i1()) {
            dialog.show(this.f132840a, tag);
        }
    }
}
