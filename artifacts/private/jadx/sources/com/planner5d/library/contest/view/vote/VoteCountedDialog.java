package com.planner5d.library.contest.view.vote;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.contest.e;
import db.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
public final class VoteCountedDialog extends ContentDialog<Boolean> {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(VoteCountedDialog voteCountedDialog, View view) {
        voteCountedDialog.sendResultOnce(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        g gVarC = g.c(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(gVarC, "inflate(...)");
        gVarC.f269790c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.vote.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoteCountedDialog.T(this.f153827a, view);
            }
        });
        L(gVarC.f269789b);
        ConstraintLayout root2 = gVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return e.l.f151254h0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        sendResultOnce(Boolean.FALSE);
        super.onDismiss(dialog);
    }
}
