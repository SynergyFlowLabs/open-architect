package com.planner5d.library.project.fragment.roomtype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.u;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends u<j, i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f223826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f223827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n1 f223828e;

    public /* synthetic */ g(com.planner5d.library.services.bitmaploader.target.h hVar, y0 y0Var, n1 n1Var, androidx.recyclerview.widget.k.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, y0Var, n1Var, (i10 & 8) != 0 ? new k() : fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull i holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        j jVarI = i(i10);
        Intrinsics.checkNotNullExpressionValue(jVarI, "getItem(...)");
        holder.h(jVarI);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nd.g gVarD = nd.g.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(gVarD, "inflate(...)");
        return new i(context, gVarD, this.f223826c, this.f223827d, this.f223828e, parent.getContext().getResources().getDimensionPixelSize(md.b.g.f324477l4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull i holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
        super.onViewRecycled(holder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull n1 languageManager, @NotNull androidx.recyclerview.widget.k.f<j> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f223826c = bitmapTargetManager;
        this.f223827d = imageManager;
        this.f223828e = languageManager;
    }
}
