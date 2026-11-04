package com.planner5d.library.widget.editor.itemactionsbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class d extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f256947b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private List<b> f256948a;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f256949c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f256950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final ImageView f256951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.f168733j7, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f256950a = parent;
            View viewFindViewById = this.itemView.findViewById(com.planner5d.library.f.j.f168485x0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f256951b = (ImageView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(b bVar, View view) {
            bVar.f().invoke();
        }

        public final void h(@NotNull final b itemAction) {
            Intrinsics.checkNotNullParameter(itemAction, "itemAction");
            this.f256951b.setImageResource(itemAction.g());
            this.f256951b.setColorFilter(androidx.core.content.d.g(this.itemView.getContext(), itemAction.h()));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.itemactionsbar.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.i(itemAction, view);
                }
            });
        }

        @NotNull
        public final ViewGroup j() {
            return this.f256950a;
        }
    }

    @ij.a
    public d(@NotNull List<b> itemActionList) {
        Intrinsics.checkNotNullParameter(itemActionList, "itemActionList");
        this.f256948a = itemActionList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f256948a.size();
    }

    @e.a({"NotifyDataSetChanged"})
    public final void h(@NotNull List<b> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f256948a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).h(this.f256948a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent);
    }
}
