package com.planner5d.library.project.fragment.roomstyle;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.u;
import com.planner5d.library.model.manager.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends u<j, i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f223744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f223745d;

    public /* synthetic */ g(com.planner5d.library.services.bitmaploader.target.h hVar, y0 y0Var, androidx.recyclerview.widget.k.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, y0Var, (i10 & 4) != 0 ? new k() : fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull i holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        j jVar = h().get(i10);
        Intrinsics.checkNotNullExpressionValue(jVar, "get(...)");
        holder.h(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        nd.f fVarD = nd.f.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fVarD, "inflate(...)");
        return new i(fVarD, this.f223744c, this.f223745d, parent.getContext().getResources().getDimensionPixelSize(md.b.g.f324477l4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull i holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
        super.onViewRecycled(holder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull androidx.recyclerview.widget.k.f<j> diffCallback) {
        super(new androidx.recyclerview.widget.c.a(diffCallback).a());
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f223744c = bitmapTargetManager;
        this.f223745d = imageManager;
    }
}
