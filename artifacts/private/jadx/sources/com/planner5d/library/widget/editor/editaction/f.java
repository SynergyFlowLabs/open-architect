package com.planner5d.library.widget.editor.editaction;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f254758b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f254759a;

    @ij.a
    public f(@NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f254759a = builtInDataManager;
    }

    public final void a(@NotNull e action, boolean z10, @NotNull com.planner5d.library.widget.editor.facade.h facade) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(facade, "facade");
        com.planner5d.library.widget.editor.a aVarB = facade.b();
        if (aVarB != null) {
            aVarB.f(action, new h(facade.getItem(), this.f254759a, facade.G(), new com.planner5d.library.widget.editor.helper.selector.d(), facade.F(), facade.w()));
        }
        if (z10) {
            facade.F().r();
        }
    }
}
