package com.planner5d.library.activity.fragment.list;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListAdapter.kt\ncom/planner5d/library/activity/fragment/list/MainListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class f0 extends androidx.recyclerview.widget.u<yc.d<h0>, com.planner5d.library.activity.fragment.list.holders.a<?>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f134046i = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.list.holders.u f134047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f134048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.o0 f134049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f134050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final l1 f134051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final n1<Object> f134052h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull com.planner5d.library.activity.fragment.list.holders.u factory, @NotNull kotlinx.coroutines.s0 scope, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull l1 viewModel, @Nullable n1<Object> n1Var) {
        super(new yc.e());
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f134047c = factory;
        this.f134048d = scope;
        this.f134049e = lifecycleOwner;
        this.f134050f = bitmapTargetManager;
        this.f134051g = viewModel;
        this.f134052h = n1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        h0.a aVarF;
        h0 h0Var;
        yc.d<h0> dVarI = i(i10);
        if (dVarI == null || (h0Var = (h0) dVarI.c()) == null || (aVarF = h0Var.f()) == null) {
            aVarF = h0.a.Unknown;
        }
        return aVarF.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull com.planner5d.library.activity.fragment.list.holders.a<?> holder, int i10) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        yc.d<h0> dVarI = i(i10);
        holder.g((dVarI == null || (h0Var = (h0) dVarI.c()) == null) ? null : h0Var.d());
        holder.h(dVarI.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull com.planner5d.library.activity.fragment.list.holders.a<?> holder, int i10, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) payloads);
        if (objLastOrNull instanceof yc.a.C2534a) {
            holder.h(((yc.a.C2534a) objLastOrNull).d());
        } else {
            onBindViewHolder(holder, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.list.holders.a<?> onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        h0.a aVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        com.planner5d.library.activity.fragment.list.holders.u uVar = this.f134047c;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kotlinx.coroutines.s0 s0Var = this.f134048d;
        androidx.lifecycle.o0 o0Var = this.f134049e;
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f134050f;
        l1 l1Var = this.f134051g;
        n1<Object> n1Var = this.f134052h;
        h0.a[] aVarArrValues = h0.a.values();
        int length = aVarArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i11];
            if (aVar.n() == i10) {
                break;
            }
            i11++;
        }
        if (aVar == null) {
            aVar = h0.a.Unknown;
        }
        com.planner5d.library.activity.fragment.list.holders.a<?> aVarF = uVar.f(context, s0Var, o0Var, hVar, l1Var, n1Var, aVar);
        aVarF.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
        return aVarF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull com.planner5d.library.activity.fragment.list.holders.a<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.a();
    }
}
