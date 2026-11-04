package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.databinding.y6;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderSortingAndAppearance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderSortingAndAppearance.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderSortingAndAppearance\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,36:1\n257#2,2:37\n*S KotlinDebug\n*F\n+ 1 MainListViewHolderSortingAndAppearance.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderSortingAndAppearance\n*L\n27#1:37,2\n*E\n"})
public final class a1 extends a<Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f134084d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y6 f134085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f134086c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a1(@NotNull y6 binding, @NotNull l1 mainListViewModel) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(mainListViewModel, "mainListViewModel");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134085b = binding;
        this.f134086c = mainListViewModel;
        binding.s1(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.i(this.f134232a, view);
            }
        });
        binding.r1(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.j(this.f134235a, view);
            }
        });
    }

    public static void i(a1 a1Var, View view) {
        a1Var.f134086c.Z1();
    }

    public static void j(a1 a1Var, View view) {
        a1Var.f134086c.c2();
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable Unit unit) {
        y6 y6Var = this.f134085b;
        TextView labelSelectedSortType = y6Var.f159985l3;
        Intrinsics.checkNotNullExpressionValue(labelSelectedSortType, "labelSelectedSortType");
        int i10 = 0;
        if (!((this.f134086c.g1() && this.f134086c.X0().b() == null) ? false : true)) {
            i10 = 8;
        }
        labelSelectedSortType.setVisibility(i10);
        y6Var.t1(this.f134086c.h1());
        y6Var.q1(this.f134086c.S0().f());
        y6Var.s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a1(@NotNull Context context, @NotNull l1 mainListViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainListViewModel, "mainListViewModel");
        y6 y6VarM1 = y6.m1(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(y6VarM1, "inflate(...)");
        this(y6VarM1, mainListViewModel);
    }
}
