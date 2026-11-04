package com.planner5d.library.activity.fragment.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.k7;
import com.planner5d.library.databinding.l7;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class u extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f134853c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f134854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends ed.c> f134855b;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nProfileMenuItemsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileMenuItemsAdapter.kt\ncom/planner5d/library/activity/fragment/profile/ProfileMenuItemsAdapter$ItemViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,84:1\n257#2,2:85\n*S KotlinDebug\n*F\n+ 1 ProfileMenuItemsAdapter.kt\ncom/planner5d/library/activity/fragment/profile/ProfileMenuItemsAdapter$ItemViewHolder\n*L\n58#1:85,2\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f134856b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f134857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.N8, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f134857a = parent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(b bVar, ed.b bVar2, View view) {
            bVar.a(bVar2);
        }

        public final void h(@NotNull final ed.b item, @NotNull final b listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            k7 k7VarA = k7.a(this.itemView);
            ConstraintLayout root = k7VarA.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(item.g() ? 0 : 8);
            if (!item.g()) {
                k7VarA.getRoot().setLayoutParams(new RecyclerView.q(0, 0));
            }
            k7VarA.f159250c.setImageResource(item.e());
            k7VarA.f159251d.setText(item.f());
            k7VarA.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.a.i(listener, item, view);
                }
            });
            TextView textView = k7VarA.f159249b;
            textView.setText(item.b());
            Integer numC = item.c();
            if (numC != null) {
                textView.setTextColor(androidx.core.content.d.g(textView.getContext(), numC.intValue()));
            }
        }

        @NotNull
        public final ViewGroup j() {
            return this.f134857a;
        }
    }

    public interface b {
        void a(@NotNull ed.b bVar);
    }

    @w0(parameters = 0)
    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f134858b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f134859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.O8, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f134859a = parent;
        }

        public final void g(@NotNull ed.e item) {
            Intrinsics.checkNotNullParameter(item, "item");
            l7.a(this.itemView).f159307b.setText(item.b());
        }

        @NotNull
        public final ViewGroup h() {
            return this.f134859a;
        }
    }

    @ij.a
    public u(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f134854a = listener;
        this.f134855b = CollectionsKt.emptyList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f134855b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f134855b.get(i10).a().n();
    }

    @e.a({"NotifyDataSetChanged"})
    public final void h(@NotNull List<? extends ed.c> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f134855b = menuItems;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ed.c cVar = this.f134855b.get(i10);
        if (cVar instanceof ed.b) {
            ((a) holder).h((ed.b) cVar, this.f134854a);
        } else if (cVar instanceof ed.e) {
            ((c) holder).g((ed.e) cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return i10 == ed.c.a.ClickableItem.n() ? new a(parent) : new c(parent);
    }
}
