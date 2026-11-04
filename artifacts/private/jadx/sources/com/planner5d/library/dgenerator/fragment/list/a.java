package com.planner5d.library.dgenerator.fragment.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.u;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.model.manager.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends u<AutoStyle, l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f160314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f160315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<AutoStyle, Integer, Unit> f160316f;

    public /* synthetic */ a(com.planner5d.library.services.bitmaploader.target.h hVar, y0 y0Var, com.planner5d.library.model.manager.builtin.i iVar, androidx.recyclerview.widget.k.f fVar, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, y0Var, iVar, (i10 & 8) != 0 ? new q() : fVar, function2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull l holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AutoStyle autoStyleI = i(i10);
        Intrinsics.checkNotNullExpressionValue(autoStyleI, "getItem(...)");
        holder.h(autoStyleI, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public l onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        mb.g gVarD = mb.g.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(gVarD, "inflate(...)");
        return new l(context, gVarD, this.f160313c, this.f160314d, parent.getContext().getResources().getDimensionPixelSize(lb.b.g.X0), this.f160315e, this.f160316f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull l holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull androidx.recyclerview.widget.k.f<AutoStyle> diffCallback, @NotNull Function2<? super AutoStyle, ? super Integer, Unit> onClickListener) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f160313c = bitmapTargetManager;
        this.f160314d = imageManager;
        this.f160315e = builtInDataManager;
        this.f160316f = onClickListener;
    }
}
