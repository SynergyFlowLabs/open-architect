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
public final class ResultLostDialog extends ContentDialog<Boolean> implements n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ResultLostDialog resultLostDialog, View view) {
        resultLostDialog.sendResultOnce(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(ResultLostDialog resultLostDialog, View view) {
        resultLostDialog.sendResultOnce(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(ResultLostDialog resultLostDialog, View view) {
        resultLostDialog.sendResultOnce(Boolean.FALSE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        ie.g gVarD = ie.g.d(LayoutInflater.from(root.getContext()), root, false);
        gVarD.f287146d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultLostDialog.V(this.f231019a, view);
            }
        });
        gVarD.f287145c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultLostDialog.W(this.f231020a, view);
            }
        });
        gVarD.f287144b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultLostDialog.X(this.f230936a, view);
            }
        });
        ConstraintLayout root2 = gVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.Fg);
    }
}
