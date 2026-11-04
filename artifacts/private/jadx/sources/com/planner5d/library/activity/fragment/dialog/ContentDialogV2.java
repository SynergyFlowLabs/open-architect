package com.planner5d.library.activity.fragment.dialog;

import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ContentDialogV2<T> extends ContentDialog<T> {
    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.view.d.l.f247410h0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int i10 = 4 >> 0;
        sendResultOnce(null);
        super.onDismiss(dialog);
    }
}
