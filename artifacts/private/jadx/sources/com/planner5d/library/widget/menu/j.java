package com.planner5d.library.widget.menu;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMenuAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuAdapter.kt\ncom/planner5d/library/widget/menu/MenuAdapter\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,55:1\n29#2:56\n47#2:57\n*S KotlinDebug\n*F\n+ 1 MenuAdapter.kt\ncom/planner5d/library/widget/menu/MenuAdapter\n*L\n27#1:56\n31#1:57\n*E\n"})
public final class j extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258352d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Menu f258353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f258354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<MenuItem, Unit> f258355c;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f258356f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f258357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f258358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function1<MenuItem, Unit> f258359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final TextView f258360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final ImageView f258361e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ViewGroup parent, @androidx.annotation.l int i10, @NotNull Function1<? super MenuItem, Unit> onItemClickListener) {
            super(LayoutInflater.from(parent.getContext()).inflate(c1.l.f252182m2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
            this.f258357a = parent;
            this.f258358b = i10;
            this.f258359c = onItemClickListener;
            View viewFindViewById = this.itemView.findViewById(c1.i.f251943p1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f258360d = (TextView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(c1.i.f251919n1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f258361e = (ImageView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, MenuItem menuItem, View view) {
            aVar.f258359c.invoke(menuItem);
        }

        public final void h(@NotNull final MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "menuItem");
            this.f258360d.setText(menuItem.getTitle());
            this.f258361e.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.i(menuItem.getIcon(), Integer.valueOf(this.f258358b)));
            if (!menuItem.isVisible()) {
                this.itemView.setVisibility(8);
                this.itemView.setLayoutParams(new RecyclerView.q(0, 0));
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.menu.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.a.i(this.f258350a, menuItem, view);
                }
            });
        }

        public final int j() {
            return this.f258358b;
        }

        @NotNull
        public final ViewGroup k() {
            return this.f258357a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public j(@NotNull Menu menu, @androidx.annotation.l int i10, @NotNull Function1<? super MenuItem, Unit> onItemClickListener) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.f258353a = menu;
        this.f258354b = i10;
        this.f258355c = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f258353a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).h(this.f258353a.getItem(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent, this.f258354b, this.f258355c);
    }
}
