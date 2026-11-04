package com.planner5d.library.uploadplan.view.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.AnimatedVectorImageView;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class RecognitionStartedDialog extends RecognitionInProgressDialog {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private ie.d f230918q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private final f0 f230919r3 = g0.c(new Function0() { // from class: com.planner5d.library.uploadplan.view.dialog.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecognitionStartedDialog.Z(this.f230999a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimatedVectorImageView Z(RecognitionStartedDialog recognitionStartedDialog) {
        ie.d dVar = recognitionStartedDialog.f230918q3;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        return dVar.f287131d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(RecognitionStartedDialog recognitionStartedDialog, View view) {
        recognitionStartedDialog.dismiss();
    }

    @Override // com.planner5d.library.uploadplan.view.dialog.RecognitionInProgressDialog, com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        ie.d dVarD = ie.d.d(LayoutInflater.from(root.getContext()), root, false);
        this.f230918q3 = dVarD;
        dVarD.f287129b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionStartedDialog.a0(this.f231000a, view);
            }
        });
        ConstraintLayout root2 = dVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.uploadplan.view.dialog.RecognitionInProgressDialog
    @NotNull
    protected AnimatedVectorImageView W() {
        return (AnimatedVectorImageView) this.f230919r3.getValue();
    }
}
