package com.planner5d.library.activity.fragment.dialog.purchase.designgenerator;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.r4;
import com.planner5d.library.widget.textview.ButtonTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDesignGeneratorPurchaseListItemViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesignGeneratorPurchaseListItemViewHolder.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/designgenerator/DesignGeneratorPurchaseListItemViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,26:1\n257#2,2:27\n*S KotlinDebug\n*F\n+ 1 DesignGeneratorPurchaseListItemViewHolder.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/designgenerator/DesignGeneratorPurchaseListItemViewHolder\n*L\n19#1:27,2\n*E\n"})
public class e extends RecyclerView.g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132552c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f132553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r4 f132554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @NotNull r4 binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f132553a = context;
        this.f132554b = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c cVar, View view) {
        cVar.k().invoke();
    }

    public void a() {
    }

    public void h(@NotNull final c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        r4 r4Var = this.f132554b;
        r4Var.f159596g.setText(data.r().i(this.f132553a));
        r4Var.f159593d.setText(data.l().i(this.f132553a));
        r4Var.f159595f.setText(data.o().i(this.f132553a));
        r4Var.f159591b.setSelected(data.q());
        r4Var.f159592c.setSelected(data.q());
        ButtonTextView paywallProductMostPopularTag = r4Var.f159594e;
        Intrinsics.checkNotNullExpressionValue(paywallProductMostPopularTag, "paywallProductMostPopularTag");
        paywallProductMostPopularTag.setVisibility(data.m() ? 0 : 8);
        r4Var.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.i(data, view);
            }
        });
    }
}
