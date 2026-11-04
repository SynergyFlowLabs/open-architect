package com.planner5d.library.activity.fragment.dialog.snapshots;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.u7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class b extends RecyclerView.h<C1463b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f132947g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f132948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f132949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.activity.fragment.dialog.snapshots.a f132950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.activity.fragment.dialog.snapshots.a f132951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<? extends vd.b> f132952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f132953f;

    public interface a {
        void a(@NotNull vd.b bVar);
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.snapshots.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nRenderVariantsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderVariantsAdapter.kt\ncom/planner5d/library/activity/fragment/dialog/snapshots/RenderVariantsAdapter$RenderVariantViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,87:1\n257#2,2:88\n*S KotlinDebug\n*F\n+ 1 RenderVariantsAdapter.kt\ncom/planner5d/library/activity/fragment/dialog/snapshots/RenderVariantsAdapter$RenderVariantViewHolder\n*L\n69#1:88,2\n*E\n"})
    public final class C1463b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final u7 f132954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f132955b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1463b(@NotNull b bVar, u7 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f132955b = bVar;
            this.f132954a = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, vd.b bVar, View view) {
            aVar.a(bVar);
        }

        public final void h(@NotNull final vd.b item, @NotNull final a listener, boolean z10) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            u7 u7Var = this.f132954a;
            b bVar = this.f132955b;
            boolean z11 = true;
            int i10 = 6 >> 1;
            int i11 = 0;
            boolean z12 = item.f385730a == vd.b.PRO4K.f385730a;
            ImageView proBadge = u7Var.f159781c;
            Intrinsics.checkNotNullExpressionValue(proBadge, "proBadge");
            if (!z12 || bVar.f132949b) {
                z11 = false;
            }
            if (!z11) {
                i11 = 8;
            }
            proBadge.setVisibility(i11);
            ImageView imageView = u7Var.f159783e;
            Integer numO = item.o();
            Intrinsics.checkNotNullExpressionValue(numO, "getImageNew(...)");
            imageView.setImageResource(numO.intValue());
            TextView textView = u7Var.f159785g;
            Context context = u7Var.getRoot().getContext();
            Integer numP = item.p();
            Intrinsics.checkNotNullExpressionValue(numP, "getTitle(...)");
            textView.setText(context.getString(numP.intValue()));
            TextView textView2 = u7Var.f159787i;
            q1 q1Var = q1.f312784a;
            String str = String.format(Locale.getDefault(), "%dx%d,", Arrays.copyOf(new Object[]{Integer.valueOf(item.f385731b), Integer.valueOf(item.f385732c)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView2.setText(str);
            TextView textView3 = u7Var.f159782d;
            Context context2 = u7Var.getRoot().getContext();
            Integer numN = item.n();
            Intrinsics.checkNotNullExpressionValue(numN, "getDescription(...)");
            textView3.setText(context2.getString(numN.intValue()));
            com.planner5d.library.activity.fragment.dialog.snapshots.a aVar = null;
            Integer numValueOf = (!z10 || z12) ? null : Integer.valueOf(com.planner5d.library.f.C1549f.Mh);
            u7Var.f159786h.setButtonTintList(numValueOf != null ? ColorStateList.valueOf(androidx.core.content.d.g(u7Var.getRoot().getContext(), numValueOf.intValue())) : null);
            ConstraintLayout constraintLayout = u7Var.f159780b;
            if (z10 && z12) {
                aVar = bVar.f132951d;
            } else if (z10) {
                aVar = bVar.f132950c;
            }
            constraintLayout.setForeground(aVar);
            u7Var.f159786h.setChecked(z10);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.C1463b.i(listener, item, view);
                }
            });
        }

        @NotNull
        public final u7 j() {
            return this.f132954a;
        }
    }

    public b(@NotNull Context context, @NotNull a listener, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f132948a = listener;
        this.f132949b = z10;
        this.f132952e = CollectionsKt.emptyList();
        float fA = com.github.danielnilsson9.colorpickerview.view.d.a(context, 2.0f);
        float fA2 = com.github.danielnilsson9.colorpickerview.view.d.a(context, 11.0f);
        this.f132951d = new com.planner5d.library.activity.fragment.dialog.snapshots.a(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.Pi), androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.Oi), fA, fA2);
        this.f132950c = new com.planner5d.library.activity.fragment.dialog.snapshots.a(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.Th), androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.Th), fA, fA2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f132952e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C1463b holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h(this.f132952e.get(i10), this.f132948a, i10 == this.f132953f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1463b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        u7 u7VarD = u7.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(u7VarD, "inflate(...)");
        return new C1463b(this, u7VarD);
    }

    public final void m(@NotNull ArrayList<vd.b> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f132952e = products;
    }

    @e.a({"NotifyDataSetChanged"})
    public final void n(@Nullable vd.b bVar) {
        this.f132953f = CollectionsKt.indexOf(this.f132952e, bVar);
        notifyDataSetChanged();
    }
}
