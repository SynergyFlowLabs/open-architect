package com.planner5d.library.activity.fragment.smartwizard.roomstyle;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.v2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.widget.d1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class q extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f135839f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f135840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f135841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<com.planner5d.library.smartwizard.data.e, Unit> f135842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList<com.planner5d.library.smartwizard.data.e> f135843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.smartwizard.data.e f135844e;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull Function1<? super com.planner5d.library.smartwizard.data.e, Unit> onStyleSelected) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(onStyleSelected, "onStyleSelected");
        this.f135840a = bitmapTargetManager;
        this.f135841b = imageManager;
        this.f135842c = onStyleSelected;
        this.f135843d = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f135843d.size();
    }

    @NotNull
    public final com.planner5d.library.smartwizard.data.e h() {
        com.planner5d.library.smartwizard.data.e eVar = this.f135844e;
        return eVar == null ? (com.planner5d.library.smartwizard.data.e) CollectionsKt.first((List) this.f135843d) : eVar;
    }

    @e.a({"NotifyDataSetChanged"})
    public final void i(@NotNull List<com.planner5d.library.smartwizard.data.e> styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        this.f135843d.clear();
        this.f135843d.addAll(styles);
        if (!this.f135843d.isEmpty()) {
            Function1<com.planner5d.library.smartwizard.data.e, Unit> function1 = this.f135842c;
            com.planner5d.library.smartwizard.data.e eVar = this.f135843d.get(0);
            Intrinsics.checkNotNullExpressionValue(eVar, "get(...)");
            function1.invoke(eVar);
        }
        notifyDataSetChanged();
    }

    @e.a({"NotifyDataSetChanged"})
    public final int j(@NotNull com.planner5d.library.smartwizard.data.e style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f135844e = style;
        notifyDataSetChanged();
        return this.f135843d.indexOf(style);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        com.planner5d.library.smartwizard.data.e eVar = this.f135843d.get(i10);
        Intrinsics.checkNotNullExpressionValue(eVar, "get(...)");
        com.planner5d.library.smartwizard.data.e eVar2 = eVar;
        ((s) holder).h(eVar2, Intrinsics.areEqual(this.f135844e, eVar2), this.f135842c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        v2 v2VarC = v2.c(LayoutInflater.from(parent.getContext()));
        Intrinsics.checkNotNullExpressionValue(v2VarC, "inflate(...)");
        return new s(v2VarC, this.f135840a, this.f135841b, parent.getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.Yj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NotNull RecyclerView.g0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((d1) holder).a();
    }
}
