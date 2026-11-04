package com.planner5d.library.uploadplan.view.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class RecognitionThankYouDialog extends ContentDialog<Boolean> implements n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(RecognitionThankYouDialog recognitionThankYouDialog, View view) {
        recognitionThankYouDialog.dismiss();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        ie.f fVarD = ie.f.d(LayoutInflater.from(root.getContext()), root, false);
        fVarD.f287139b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionThankYouDialog.T(this.f231018a, view);
            }
        });
        ConstraintLayout root2 = fVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.Fg);
    }
}
