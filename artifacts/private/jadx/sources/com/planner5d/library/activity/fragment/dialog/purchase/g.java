package com.planner5d.library.activity.fragment.dialog.purchase;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.services.utility.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProductView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductView.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/ProductView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,88:1\n257#2,2:89\n*S KotlinDebug\n*F\n+ 1 ProductView.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/ProductView\n*L\n63#1:89,2\n*E\n"})
public final class g extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132623d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public p0 f132624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public n1 f132625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.databinding.o f132626c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public g(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setUpPrice(fd.g gVar) {
        this.f132626c.f159416b.setText(gVar.f275147d ? getContext().getString(com.planner5d.library.f.s.Cx) : gVar.f275144a.j());
    }

    private final void setUpSubtitle(fd.f fVar) {
        String strC;
        TextView purchaseProductSubtitle = this.f132626c.f159417c;
        Intrinsics.checkNotNullExpressionValue(purchaseProductSubtitle, "purchaseProductSubtitle");
        fd.i iVarK = fVar.k();
        purchaseProductSubtitle.setVisibility((iVarK != null ? iVarK.i() : null) == fd.k.CATALOG ? 0 : 8);
        TextView textView = this.f132626c.f159417c;
        if (fVar.m()) {
            strC = getContext().getString(com.planner5d.library.f.s.I1);
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            strC = fVar.c(context, getFormatter(), getLanguageManager());
        }
        textView.setText(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Function0 function0, View view) {
        function0.invoke();
    }

    private final void z() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.f166963ej);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = dimensionPixelSize;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = dimensionPixelSize;
        setLayoutParams(bVar);
    }

    @NotNull
    public final p0 getFormatter() {
        p0 p0Var = this.f132624a;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    @NotNull
    public final n1 getLanguageManager() {
        n1 n1Var = this.f132625b;
        if (n1Var != null) {
            return n1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageManager");
        return null;
    }

    public final void setFormatter(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.f132624a = p0Var;
    }

    public final void setLanguageManager(@NotNull n1 n1Var) {
        Intrinsics.checkNotNullParameter(n1Var, "<set-?>");
        this.f132625b = n1Var;
    }

    public final void x(@NotNull fd.g productListInfo, @NotNull final Function0<Unit> clickListener) {
        int i10;
        Intrinsics.checkNotNullParameter(productListInfo, "productListInfo");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        TextView textView = this.f132626c.f159419e;
        fd.f fVar = productListInfo.f275144a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(fVar.l(context, getLanguageManager()));
        setUpSubtitle(productListInfo.f275144a);
        setUpPrice(productListInfo);
        TextView textView2 = this.f132626c.f159418d;
        if (productListInfo.f275146c) {
            i10 = 0;
            int i11 = 7 & 0;
        } else {
            i10 = 4;
        }
        textView2.setVisibility(i10);
        if (productListInfo.f275146c) {
            setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.y(clickListener, view);
                }
            });
        }
        z();
        Resources resources = getContext().getResources();
        fd.i iVarK = productListInfo.f275144a.k();
        setMinWidth(resources.getDimensionPixelSize((iVarK != null ? iVarK.i() : null) == fd.k.TEXTURES ? com.planner5d.library.f.g.f167072jj : com.planner5d.library.f.g.f166985fj));
        setMinHeight(getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.Wi));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public g(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public g(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.application.b.f142455c.a().E0(this);
        View viewInflate = View.inflate(context, com.planner5d.library.f.m.U0, this);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.planner5d.library.f.d.Ik, typedValue, true);
        viewInflate.setForeground(androidx.core.content.d.l(context, typedValue.resourceId));
        this.f132626c = com.planner5d.library.databinding.o.a(viewInflate);
    }
}
