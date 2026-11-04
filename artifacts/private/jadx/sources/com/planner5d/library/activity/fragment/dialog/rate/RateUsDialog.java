package com.planner5d.library.activity.fragment.dialog.rate;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.databinding.q;
import com.planner5d.library.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class RateUsDialog extends ContentDialog<Boolean> {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(RateUsDialog rateUsDialog, View view) {
        rateUsDialog.sendResultOnce(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        q qVarC = q.c(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(qVarC, "inflate(...)");
        qVarC.f159530c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.rate.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RateUsDialog.T(this.f132841a, view);
            }
        });
        L(qVarC.f159529b);
        ScrollView root2 = qVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return f.m.B0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        sendResultOnce(Boolean.FALSE);
        super.onDismiss(dialog);
    }
}
