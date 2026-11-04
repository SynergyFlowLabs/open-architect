package com.planner5d.library.dgenerator.fragment.gallery;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.planner5d.library.model.manager.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends androidx.recyclerview.widget.u<p, m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f160170d;

    public /* synthetic */ o(com.planner5d.library.services.bitmaploader.target.h hVar, y0 y0Var, androidx.recyclerview.widget.k.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, y0Var, (i10 & 4) != 0 ? new q() : fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return i(i10).e().n();
    }

    public final int m(int i10) {
        return getItemViewType(i10) == p.a.Title.n() ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull m holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        p pVarI = i(i10);
        Intrinsics.checkNotNullExpressionValue(pVarI, "getItem(...)");
        holder.g(pVarI);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 == p.a.Image.n()) {
            mb.h hVarD = mb.h.d(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(hVarD, "inflate(...)");
            return new l(hVarD, this.f160169c, this.f160170d);
        }
        mb.i iVarD = mb.i.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(iVarD, "inflate(...)");
        return new n(iVarD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull m holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
        super.onViewRecycled(holder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull androidx.recyclerview.widget.k.f<p> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f160169c = bitmapTargetManager;
        this.f160170d = imageManager;
    }
}
