package com.planner5d.library.widget.editor.catalog.adapter;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class j extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f254424b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f254425a;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(@NotNull View itemView, @NotNull Point catalogItemViewSize) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(catalogItemViewSize, "catalogItemViewSize");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super(new d(context, catalogItemViewSize));
        View view = this.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.planner5d.library.widget.editor.catalog.adapter.ViewCatalogPlaceholder");
        this.f254425a = (d) view;
    }

    public final void a() {
        this.f254425a.b();
    }

    public final void g() {
        this.f254425a.a();
    }
}
