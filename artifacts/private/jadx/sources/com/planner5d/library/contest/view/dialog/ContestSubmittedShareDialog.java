package com.planner5d.library.contest.view.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
public final class ContestSubmittedShareDialog extends ContentDialog<Boolean> implements n0 {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(ContestSubmittedShareDialog contestSubmittedShareDialog, View view) {
        contestSubmittedShareDialog.sendResultOnce(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ContestSubmittedShareDialog contestSubmittedShareDialog, View view) {
        contestSubmittedShareDialog.sendResultOnce(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        db.d dVarA = db.d.a(LayoutInflater.from(getContext()).inflate(com.planner5d.library.contest.e.l.Z, root, false));
        dVarA.f269767b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestSubmittedShareDialog.U(this.f153583a, view);
            }
        });
        dVarA.f269769d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestSubmittedShareDialog.V(this.f153584a, view);
            }
        });
        ConstraintLayout root2 = dVarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.contest.e.l.f151249g0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog
    protected void onActivityCreatedWithSetup(@Nullable Bundle bundle) {
        super.onActivityCreatedWithSetup(bundle);
        com.planner5d.library.activity.fragment.dialog.i.b bVar = com.planner5d.library.activity.fragment.dialog.i.f132070d;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        O(bVar.a(contextRequireContext));
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i10 = 3 >> 2;
        setStyle(2, com.planner5d.library.contest.e.s.P5);
    }
}
