package com.planner5d.library.activity.fragment.dialog.premiumfeature;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.dialog.r;
import com.planner5d.library.databinding.m;
import com.planner5d.library.f;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.t3;
import kotlin.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPremiumFeaturesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumFeaturesDialog.kt\ncom/planner5d/library/activity/fragment/dialog/premiumfeature/PremiumFeaturesDialog\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,63:1\n12#2,6:64\n28#2:70\n*S KotlinDebug\n*F\n+ 1 PremiumFeaturesDialog.kt\ncom/planner5d/library/activity/fragment/dialog/premiumfeature/PremiumFeaturesDialog\n*L\n29#1:64,6\n29#1:70\n*E\n"})
public final class PremiumFeaturesDialog extends ContentDialog<Boolean> {
    public static final int $stable = 8;

    @ij.a
    public k dialogLauncher;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final f0 f132230o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b<y3.c> f132231p3;

    @ij.a
    public ia.b paywallStrategy;

    public PremiumFeaturesDialog() {
        t3 t3Var = t3.f229751a;
        this.f132230o3 = new i2(j1.d(b.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132231p3 = new com.planner5d.library.model.manager.statistics.b<>(y3.c.editing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(PremiumFeaturesDialog premiumFeaturesDialog, View view) {
        premiumFeaturesDialog.sendResultOnce(Boolean.TRUE);
        ia.b paywallStrategy$P5D_Library_release = premiumFeaturesDialog.getPaywallStrategy$P5D_Library_release();
        FragmentManager parentFragmentManager = premiumFeaturesDialog.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        paywallStrategy$P5D_Library_release.c(new r(parentFragmentManager), com.planner5d.library.model.manager.config.purchaseplacement.b.a.editing, (y3.c) premiumFeaturesDialog.f132231p3.a(), premiumFeaturesDialog.getArguments());
    }

    private final b U() {
        return (b) this.f132230o3.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        com.planner5d.library.application.b.f142455c.a().u0(this);
        m mVarC = m.c(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(mVarC, "inflate(...)");
        mVarC.f159310c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.premiumfeature.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumFeaturesDialog.T(this.f132232a, view);
            }
        });
        L(mVarC.f159309b);
        ConstraintLayout root2 = mVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return f.m.B0;
    }

    @NotNull
    public final k getDialogLauncher$P5D_Library_release() {
        k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final ia.b getPaywallStrategy$P5D_Library_release() {
        ia.b bVar = this.paywallStrategy;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallStrategy");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f132231p3.b(bundle, getArguments());
        U().V((y3.c) this.f132231p3.a());
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        sendResultOnce(Boolean.FALSE);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f132231p3.c(outState);
        super.onSaveInstanceState(outState);
    }

    public final void setDialogLauncher$P5D_Library_release(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setPaywallStrategy$P5D_Library_release(@NotNull ia.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.paywallStrategy = bVar;
    }
}
