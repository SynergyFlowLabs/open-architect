package com.planner5d.library.activity.fragment.smartwizard.roomshape;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class j extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135640d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f135641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i[] f135642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private i f135643c;

    public j(@NotNull h itemClickListener) {
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.f135641a = itemClickListener;
        this.f135642b = i.values();
        this.f135643c = i.lType;
    }

    private static /* synthetic */ void j() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f135642b.length;
    }

    public final int h(@NotNull i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Integer.min(ArraysKt.indexOf(this.f135642b, type) + 1, ArraysKt.getLastIndex(this.f135642b));
    }

    @NotNull
    public final i i() {
        return this.f135643c;
    }

    @e.a({"NotifyDataSetChanged"})
    public final void k(@NotNull i shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f135643c = shape;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        i iVar = this.f135642b[i10];
        ((l) holder).h(iVar, this.f135643c == iVar, this.f135641a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new l(new ImageView(parent.getContext()));
    }
}
