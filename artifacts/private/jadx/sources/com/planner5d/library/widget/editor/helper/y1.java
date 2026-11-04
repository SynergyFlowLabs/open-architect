package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f256863c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f256864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.h f256865b;

    public y1(@NotNull g1 helperEditor, @NotNull com.planner5d.library.widget.editor.facade.h facade) {
        Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
        Intrinsics.checkNotNullParameter(facade, "facade");
        this.f256864a = helperEditor;
        this.f256865b = facade;
    }

    private final Item b(String str) {
        com.planner5d.library.widget.editor.a aVarB = this.f256865b.b();
        ItemProject item = this.f256865b.getItem();
        if (aVarB == null || item == null) {
            return null;
        }
        return item.getActiveFloor().getChild(str);
    }

    public final boolean a(@NotNull String puid) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        l1.f256518a.k(this.f256864a, this.f256865b.getItem(), b(puid));
        return true;
    }
}
