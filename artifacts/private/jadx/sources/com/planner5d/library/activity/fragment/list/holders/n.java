package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.databinding.g6;
import com.planner5d.library.services.utility.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderDocumentsSynchronization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderDocumentsSynchronization.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderDocumentsSynchronization\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,38:1\n1#2:39\n257#3,2:40\n257#3,2:42\n*S KotlinDebug\n*F\n+ 1 MainListViewHolderDocumentsSynchronization.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderDocumentsSynchronization\n*L\n25#1:40,2\n27#1:42,2\n*E\n"})
public final class n extends a<androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f134159d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g6 f134160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f134161c;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(@NotNull g6 binding, @NotNull l1 viewModel) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134160b = binding;
        this.f134161c = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(g6 g6Var, final n nVar, com.planner5d.library.activity.fragment.spaces.view.d state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g6Var.f159020l3.z(state, new Function0() { // from class: com.planner5d.library.activity.fragment.list.holders.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.m(this.f134151a);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(n nVar) {
        int i10 = 3 & 2;
        l1.M1(nVar.f134161c, false, null, 2, null);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable androidx.lifecycle.w0<com.planner5d.library.activity.fragment.spaces.view.d> w0Var) {
        final g6 g6Var = this.f134160b;
        if (w0Var == null) {
            View root = g6Var.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(8);
        } else {
            View root2 = g6Var.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            root2.setVisibility(0);
            androidx.lifecycle.o0 o0VarS = g6Var.S();
            if (o0VarS != null) {
                n1.a(o0VarS, w0Var, new Function1() { // from class: com.planner5d.library.activity.fragment.list.holders.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n.l(g6Var, this, (com.planner5d.library.activity.fragment.spaces.view.d) obj);
                    }
                });
            }
        }
        g6Var.s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(@NotNull Context context, @NotNull l1 viewModel, @NotNull androidx.lifecycle.o0 lifecycleOwner) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        g6 g6VarI1 = g6.i1(LayoutInflater.from(context));
        g6VarI1.C0(lifecycleOwner);
        Intrinsics.checkNotNullExpressionValue(g6VarI1, "apply(...)");
        this(g6VarI1, viewModel);
    }
}
