package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.list.n1;
import com.planner5d.library.databinding.j5;
import com.planner5d.library.databinding.l5;
import com.planner5d.library.widget.EnhancedRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderAddNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderAddNew.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderAddNew\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class c extends a<Bundle> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f134091c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.databinding.e0 f134092b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@NotNull androidx.databinding.e0 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134092b = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(n1 n1Var, View view) {
        if (n1Var != null) {
            Intrinsics.checkNotNull(view);
            n1Var.a(view, null);
        }
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable Bundle bundle) {
        if (bundle != null && bundle.getBoolean(com.planner5d.library.services.r.hasParent.f224891a, false)) {
            androidx.databinding.e0 e0Var = this.f134092b;
            if (e0Var instanceof j5) {
                CardView cardView = ((j5) e0Var).f159191l3;
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.I = "1:1";
                cardView.setLayoutParams(bVar);
            }
        }
    }

    public c(@NotNull Context context, @NotNull l1 viewModel, @Nullable final n1<Object> n1Var) {
        androidx.databinding.e0 e0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.j(n1Var, view);
            }
        };
        if (viewModel.S0().f() == EnhancedRecyclerView.e.GRID) {
            j5 j5VarJ1 = j5.j1(layoutInflaterFrom);
            j5VarJ1.n1(onClickListener);
            Intrinsics.checkNotNull(j5VarJ1);
            e0Var = j5VarJ1;
        } else {
            l5 l5VarJ1 = l5.j1(layoutInflaterFrom);
            l5VarJ1.n1(onClickListener);
            Intrinsics.checkNotNull(l5VarJ1);
            e0Var = l5VarJ1;
        }
        this(e0Var);
    }
}
