package com.planner5d.library.activity.fragment.dialog.purchase;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.k2;
import androidx.core.view.u1;
import androidx.core.view.v3;
import com.planner5d.library.model.manager.statistics.events.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchaseGreenDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseGreenDialog.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseGreenDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,154:1\n257#2,2:155\n257#2,2:157\n257#2,2:159\n299#2,2:161\n299#2,2:163\n257#2,2:165\n*S KotlinDebug\n*F\n+ 1 PurchaseGreenDialog.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseGreenDialog\n*L\n84#1:155,2\n86#1:157,2\n87#1:159,2\n110#1:161,2\n111#1:163,2\n147#1:165,2\n*E\n"})
public final class PurchaseGreenDialog extends PurchaseDialog {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private te.h f132484p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private rd.k f132485q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @Nullable
    private View f132486r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b<y3.c> f132487s3 = new com.planner5d.library.model.manager.statistics.b<>(y3.c.onboarding);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NotNull
    private Function1<? super Boolean, Unit> f132488t3 = new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.a0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return PurchaseGreenDialog.i0(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 h0(PurchaseGreenDialog purchaseGreenDialog, View view, g3 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        androidx.core.graphics.j jVarF = insets.f(g3.m.i());
        Intrinsics.checkNotNullExpressionValue(jVarF, "getInsets(...)");
        View view2 = purchaseGreenDialog.f132486r3;
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i10 = jVarF.f47824b;
        if (i10 != 0 && marginLayoutParams != null) {
            marginLayoutParams.topMargin = i10;
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(boolean z10) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 j0(PurchaseGreenDialog purchaseGreenDialog, View view, g3 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        androidx.core.graphics.j jVarF = insets.f(g3.m.i());
        Intrinsics.checkNotNullExpressionValue(jVarF, "getInsets(...)");
        te.h hVar = purchaseGreenDialog.f132484p3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("includeAppBarBinding");
            hVar = null;
        }
        ViewGroup.LayoutParams layoutParams = hVar.f380926d.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = jVarF.f47824b;
        if (i10 != 0) {
            marginLayoutParams.topMargin = i10;
        }
        return insets;
    }

    private final void k0(boolean z10) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            new v3(window, window.getDecorView()).i(z10);
        }
    }

    private final void l0(Context context, @androidx.annotation.v int i10, @androidx.annotation.n int i11, boolean z10) {
        rd.k kVar = null;
        int iE = androidx.core.content.res.i.e(context.getResources(), i11, null);
        te.h hVar = this.f132484p3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("includeAppBarBinding");
            hVar = null;
        }
        hVar.f380924b.setBackgroundResource(i10);
        hVar.f380926d.setBackgroundResource(i10);
        hVar.f380926d.setTitleTextColor(iE);
        Drawable navigationIcon = hVar.f380926d.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(iE);
        }
        Toolbar toolbar = hVar.f380926d;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        toolbar.setVisibility(z10 ? 0 : 8);
        rd.k kVar2 = this.f132485q3;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButtonBinding");
            kVar2 = null;
        }
        View barBackground = kVar2.f366629b;
        Intrinsics.checkNotNullExpressionValue(barBackground, "barBackground");
        barBackground.setVisibility(z10 ? 0 : 8);
        rd.k kVar3 = this.f132485q3;
        if (kVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButtonBinding");
        } else {
            kVar = kVar3;
        }
        ImageView buttonClose = kVar.f366630c;
        Intrinsics.checkNotNullExpressionValue(buttonClose, "buttonClose");
        buttonClose.setVisibility(z10 ? 0 : 8);
    }

    private final void m0() {
        te.h hVarA = te.h.a(L().getRoot());
        Intrinsics.checkNotNullExpressionValue(hVarA, "bind(...)");
        rd.k kVarD = rd.k.d(LayoutInflater.from(getContext()), hVarA.f380925c, true);
        Intrinsics.checkNotNullExpressionValue(kVarD, "inflate(...)");
        ImageView imageView = kVarD.f366630c;
        this.f132486r3 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseGreenDialog.n0(this.f132500a, view);
            }
        });
        rd.k kVar = null;
        kVarD.f366629b.setBackground(androidx.core.content.res.i.g(getResources(), com.planner5d.library.f.h.B5, null));
        kVarD.f366630c.setImageTintList(androidx.core.content.d.h(requireContext(), com.planner5d.library.f.C1549f.Xn));
        this.f132485q3 = kVarD;
        Toolbar toolbar = hVarA.f380926d;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        toolbar.setVisibility(!M().k0() ? 8 : 0);
        rd.k kVar2 = this.f132485q3;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButtonBinding");
        } else {
            kVar = kVar2;
        }
        ConstraintLayout root = kVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(M().k0() ? 8 : 0);
        this.f132484p3 = hVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(PurchaseGreenDialog purchaseGreenDialog, View view) {
        purchaseGreenDialog.dismiss();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog
    protected void S() {
        Window window;
        super.S();
        m0();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            v3 v3Var = new v3(window, window.getDecorView());
            v3Var.i(false);
            v3Var.h(false);
            k2.c(window, false);
            window.setFlags(512, 512);
            window.setLayout(-1, -1);
            te.h hVar = this.f132484p3;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("includeAppBarBinding");
                hVar = null;
            }
            u1.j2(hVar.f380926d, new b1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.y
                @Override // androidx.core.view.b1
                public final g3 b(View view, g3 g3Var) {
                    return PurchaseGreenDialog.j0(this.f132833a, view, g3Var);
                }
            });
        }
        Y(false);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog
    protected void T() {
        super.T();
        M().r0((y3.c) this.f132487s3.a());
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog
    protected void X(@Nullable Drawable drawable) {
        super.X(drawable);
        te.h hVar = this.f132484p3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("includeAppBarBinding");
            hVar = null;
        }
        Drawable navigationIcon = hVar.f380926d.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(-1);
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog
    protected void Y(boolean z10) {
        k0(z10);
        if (z10) {
            Context context = getContext();
            if (context != null) {
                l0(context, com.planner5d.library.f.C1549f.Xn, com.planner5d.library.f.C1549f.f166273bi, M().k0());
            }
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                l0(context2, com.planner5d.library.f.h.B5, com.planner5d.library.f.C1549f.Xn, M().k0());
            }
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f132487s3.b(bundle, getArguments());
        View view = this.f132486r3;
        if (view != null) {
            u1.j2(view, new b1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.z
                @Override // androidx.core.view.b1
                public final g3 b(View view2, g3 g3Var) {
                    return PurchaseGreenDialog.h0(this.f132834a, view2, g3Var);
                }
            });
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        this.f132488t3.invoke(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f132487s3.c(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.m
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        View view = this.f132486r3;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @NotNull
    public final PurchaseDialog setOnFinished(@NotNull Function1<? super Boolean, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.f132488t3 = onFinished;
        return this;
    }
}
