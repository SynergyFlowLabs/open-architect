package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes4.dex */
public class u extends androidx.fragment.app.m {
    private DialogInterface.OnCancelListener H1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private Dialog f106917p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.p0
    private Dialog f106918p2;

    @NonNull
    public static u A(@NonNull Dialog dialog) {
        return B(dialog, null);
    }

    @NonNull
    public static u B(@NonNull Dialog dialog, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        u uVar = new u();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.w.s(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        uVar.f106917p1 = dialog2;
        if (onCancelListener != null) {
            uVar.H1 = onCancelListener;
        }
        return uVar;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.H1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.m
    @NonNull
    public Dialog onCreateDialog(@androidx.annotation.p0 Bundle bundle) {
        Dialog dialog = this.f106917p1;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f106918p2 == null) {
            this.f106918p2 = new AlertDialog.Builder((Context) com.google.android.gms.common.internal.w.r(getContext())).create();
        }
        return this.f106918p2;
    }

    @Override // androidx.fragment.app.m
    public void show(@NonNull FragmentManager fragmentManager, @androidx.annotation.p0 String str) {
        super.show(fragmentManager, str);
    }
}
