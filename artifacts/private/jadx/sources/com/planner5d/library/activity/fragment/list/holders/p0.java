package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.databinding.n5;
import com.planner5d.library.databinding.o5;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderRecognitionFailed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderRecognitionFailed.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderRecognitionFailed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class p0 extends a<Date> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f134174f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f134175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f134176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f134177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final TextView f134178e;

    public p0(@NotNull Context context, @NotNull final l1 viewModel, @NotNull com.planner5d.library.services.utility.p0 formatter) {
        b4.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p0.j(viewModel, view);
            }
        };
        EnhancedRecyclerView.e eVarF = viewModel.S0().f();
        EnhancedRecyclerView.e eVar = EnhancedRecyclerView.e.GRID;
        if (eVarF == eVar) {
            n5 n5VarC = n5.c(layoutInflaterFrom);
            n5VarC.f159401d.setOnClickListener(onClickListener);
            Intrinsics.checkNotNull(n5VarC);
            bVar = n5VarC;
        } else {
            o5 o5VarC = o5.c(layoutInflaterFrom);
            o5VarC.getRoot().setOnClickListener(onClickListener);
            Intrinsics.checkNotNull(o5VarC);
            bVar = o5VarC;
        }
        View root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134175b = context;
        this.f134176c = viewModel;
        this.f134177d = formatter;
        TextView textView = viewModel.S0().f() == eVar ? n5.a(this.itemView).f159404g : o5.a(this.itemView).f159458d;
        Intrinsics.checkNotNull(textView);
        this.f134178e = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(l1 l1Var, View view) {
        l1Var.C1(l1.g.RecognitionFailed);
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable Date date) {
        this.f134178e.setText(this.f134177d.m(this.f134175b, date));
    }
}
