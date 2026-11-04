package com.planner5d.library.uploadplan.view.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.widget.AnimatedVectorImageView;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class RecognitionInProgressDialog extends ContentDialog<Boolean> implements n0 {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private ie.b f230915o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final f0 f230916p3 = g0.c(new Function0() { // from class: com.planner5d.library.uploadplan.view.dialog.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecognitionInProgressDialog.U(this.f230993a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimatedVectorImageView U(RecognitionInProgressDialog recognitionInProgressDialog) {
        ie.b bVar = recognitionInProgressDialog.f230915o3;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar = null;
        }
        return bVar.f287118d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(RecognitionInProgressDialog recognitionInProgressDialog, View view) {
        recognitionInProgressDialog.dismiss();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        ie.b bVarD = ie.b.d(LayoutInflater.from(root.getContext()), root, false);
        this.f230915o3 = bVarD;
        bVarD.f287116b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionInProgressDialog.V(this.f230994a, view);
            }
        });
        ConstraintLayout constraintLayoutB = bVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @Nullable
    protected AnimatedVectorImageView W() {
        return (AnimatedVectorImageView) this.f230916p3.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.f169922n7);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        AnimatedVectorImageView animatedVectorImageViewW = W();
        if (animatedVectorImageViewW != null) {
            animatedVectorImageViewW.e();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AnimatedVectorImageView animatedVectorImageViewW = W();
        if (animatedVectorImageViewW != null) {
            animatedVectorImageViewW.d();
        }
    }
}
