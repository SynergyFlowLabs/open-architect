package com.planner5d.library.activity.tutorial;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s[] f141878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.drawable.d f141879b;

    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ra.c f141880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ra.c binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f141880a = binding;
        }

        public final void g(@NotNull s model, @NotNull com.planner5d.library.widget.drawable.d drawableUtils) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(drawableUtils, "drawableUtils");
            this.f141880a.f362241d.setText(model.f141874a);
            this.f141880a.f362239b.setText(model.f141875b);
            ImageView imageView = this.f141880a.f362240c;
            imageView.setImageDrawable(model.f141877d > 0 ? drawableUtils.a(imageView.getContext(), model.f141877d, null) : null);
            this.f141880a.getRoot().setBackgroundColor(model.f141876c);
        }
    }

    public t(@NotNull s[] list, @NotNull com.planner5d.library.widget.drawable.d drawableUtils) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(drawableUtils, "drawableUtils");
        this.f141878a = list;
        this.f141879b = drawableUtils;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f141878a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.g(this.f141878a[i10], this.f141879b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ra.c cVarD = ra.c.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(cVarD, "inflate(...)");
        return new a(cVarD);
    }
}
