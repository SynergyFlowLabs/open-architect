package com.planner5d.library.activity.fragment.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 1)
public final class ChooseRoomDialog extends ContentDialog<Boolean> implements n0 {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(ChooseRoomDialog chooseRoomDialog, View view) {
        chooseRoomDialog.sendResultOnce(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ChooseRoomDialog chooseRoomDialog, View view) {
        chooseRoomDialog.sendResultOnce(Boolean.FALSE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        com.planner5d.library.databinding.b bVarD = com.planner5d.library.databinding.b.d(LayoutInflater.from(root.getContext()), root, false);
        bVarD.f158733c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseRoomDialog.U(this.f132046a, view);
            }
        });
        bVarD.f158732b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseRoomDialog.V(this.f132054a, view);
            }
        });
        ConstraintLayout root2 = bVarD.getRoot();
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
