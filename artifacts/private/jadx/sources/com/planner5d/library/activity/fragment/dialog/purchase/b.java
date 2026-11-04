package com.planner5d.library.activity.fragment.dialog.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.databinding.b5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPremiumProductView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumProductView.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PremiumProductView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n257#2,2:78\n257#2,2:80\n257#2,2:82\n257#2,2:84\n*S KotlinDebug\n*F\n+ 1 PremiumProductView.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PremiumProductView\n*L\n52#1:78,2\n54#1:80,2\n57#1:82,2\n59#1:84,2\n*E\n"})
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132494e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c f132495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private TextView f132496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b5 f132497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private TextView f132498d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132499a;

        static {
            int[] iArr = new int[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.values().length];
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.Recommendations.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.RecommendationsAdvanced.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f132499a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b(@NotNull Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 7 << 0;
    }

    private final void b() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        setClipChildren(false);
        layoutParams.topMargin = getContext().getResources().getDimensionPixelSize(this.f132495a == com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare ? com.planner5d.library.f.g.f166919cj : com.planner5d.library.f.g.Lh);
        setLayoutParams(layoutParams);
    }

    public final void a(@NotNull CharSequence text, boolean z10, @Nullable CharSequence charSequence, @Nullable String str, @Nullable String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        setSelected(z10);
        b5 b5Var = this.f132497c;
        b5Var.f158756c.setText(text);
        TextView purchasePremiumProductSaleTag = b5Var.f158755b;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumProductSaleTag, "purchasePremiumProductSaleTag");
        boolean z12 = true;
        int i10 = 0;
        purchasePremiumProductSaleTag.setVisibility(charSequence != null ? 0 : 8);
        b5Var.f158755b.setText(charSequence);
        TextView purchasePremiumProductText = b5Var.f158756c;
        Intrinsics.checkNotNullExpressionValue(purchasePremiumProductText, "purchasePremiumProductText");
        com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c cVar = this.f132495a;
        com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c cVar2 = com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare;
        purchasePremiumProductText.setVisibility(cVar != cVar2 || z11 ? 0 : 8);
        if (this.f132495a == cVar2) {
            TextView textView = this.f132498d;
            if (textView != null) {
                textView.setVisibility(str != null ? 0 : 8);
            }
            TextView textView2 = this.f132498d;
            if (textView2 != null) {
                textView2.setText(str);
            }
            TextView textView3 = this.f132496b;
            if (textView3 != null) {
                if (str2 == null) {
                    z12 = false;
                }
                if (!z12) {
                    i10 = 8;
                }
                textView3.setVisibility(i10);
            }
            TextView textView4 = this.f132496b;
            if (textView4 != null) {
                textView4.setText(str2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i10, com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.Standard : cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, @NotNull com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c viewType) {
        int i11;
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f132495a = viewType;
        int i12 = a.f132499a[viewType.ordinal()];
        if (i12 == 1) {
            i11 = com.planner5d.library.f.m.I7;
        } else if (i12 == 2) {
            i11 = com.planner5d.library.f.m.M7;
        } else if (i12 == 3) {
            i11 = com.planner5d.library.f.m.L7;
        } else if (i12 == 4) {
            i11 = com.planner5d.library.f.m.K7;
        } else {
            if (i12 != 5) {
                throw new k0();
            }
            i11 = com.planner5d.library.f.m.J7;
        }
        b5 b5VarA = b5.a(View.inflate(context, i11, this));
        this.f132497c = b5VarA;
        if (viewType == com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare) {
            this.f132498d = (TextView) b5VarA.getRoot().findViewById(com.planner5d.library.f.j.Qo);
            this.f132496b = (TextView) b5VarA.getRoot().findViewById(com.planner5d.library.f.j.So);
        }
        b();
        setClickable(true);
        setFocusable(true);
        setClipChildren(false);
    }
}
