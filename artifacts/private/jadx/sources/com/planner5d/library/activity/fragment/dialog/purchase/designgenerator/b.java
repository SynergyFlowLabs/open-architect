package com.planner5d.library.activity.fragment.dialog.purchase.designgenerator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.u;
import com.planner5d.library.databinding.r4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class b extends u<c, e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132541c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull e holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        c cVarI = i(i10);
        Intrinsics.checkNotNullExpressionValue(cVarI, "getItem(...)");
        holder.h(cVarI);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        r4 r4VarD = r4.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(r4VarD, "inflate(...)");
        return new e(context, r4VarD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull e holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
        super.onViewRecycled(holder);
    }

    public /* synthetic */ b(androidx.recyclerview.widget.k.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new a() : fVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull androidx.recyclerview.widget.k.f<c> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }
}
