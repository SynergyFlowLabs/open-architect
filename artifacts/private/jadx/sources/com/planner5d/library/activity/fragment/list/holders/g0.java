package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.databinding.o6;
import com.planner5d.library.databinding.q6;
import com.planner5d.library.widget.EnhancedRecyclerView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMainListViewHolderNewProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderNewProject.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderNewProject\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class g0 extends a<Unit> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f134122b = 0;

    public g0(@NotNull Context context, @NotNull final l1 viewModel) {
        b4.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.j(viewModel, view);
            }
        };
        if (viewModel.S0().f() == EnhancedRecyclerView.e.GRID) {
            o6 o6VarJ1 = o6.j1(layoutInflaterFrom);
            o6VarJ1.n1(onClickListener);
            Intrinsics.checkNotNull(o6VarJ1);
            bVar = o6VarJ1;
        } else {
            q6 q6VarJ1 = q6.j1(layoutInflaterFrom);
            q6VarJ1.n1(onClickListener);
            Intrinsics.checkNotNull(q6VarJ1);
            bVar = q6VarJ1;
        }
        View root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(l1 l1Var, View view) {
        l1Var.C1(l1.g.NewProject);
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable Unit unit) {
    }
}
