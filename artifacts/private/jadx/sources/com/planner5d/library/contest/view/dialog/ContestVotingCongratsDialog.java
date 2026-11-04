package com.planner5d.library.contest.view.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.AnimatedImageView;
import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestVotingCongratsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestVotingCongratsDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestVotingCongratsDialog\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,74:1\n28#2:75\n*S KotlinDebug\n*F\n+ 1 ContestVotingCongratsDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestVotingCongratsDialog\n*L\n47#1:75\n*E\n"})
public final class ContestVotingCongratsDialog extends androidx.fragment.app.m {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private db.f f153560p1;

    /* synthetic */ class a extends g0 implements Function0<Unit> {
        a(Object obj) {
            super(0, obj, ContestVotingCongratsDialog.class, ActionType.DISMISS, "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ContestVotingCongratsDialog) this.receiver).dismiss();
        }
    }

    private final void A(boolean z10) {
        db.f fVar = this.f153560p1;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        AnimatedImageView animatedImageView = fVar.f269784b;
        if (z10) {
            animatedImageView.b(com.planner5d.library.contest.e.g.f150577o4);
        } else {
            animatedImageView.c();
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.D1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.C1);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(dimensionPixelSize, dimensionPixelSize2);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.contest.e.s.f152582xf);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        db.f fVarA = db.f.a(inflater.inflate(com.planner5d.library.contest.e.l.f151244f0, viewGroup));
        Intrinsics.checkNotNullExpressionValue(fVarA, "bind(...)");
        fVarA.f269785c.a(new a(this));
        this.f153560p1 = fVarA;
        ConstraintLayout root = fVarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        db.f fVar = this.f153560p1;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        fVar.f269785c.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        A(false);
        db.f fVar = this.f153560p1;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        fVar.f269785c.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        A(true);
        db.f fVar = this.f153560p1;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        fVar.f269785c.d();
    }
}
