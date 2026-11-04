package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class c extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Dialog f106350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f106351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private Dialog f106352c;

    @NonNull
    public static c a(@NonNull Dialog dialog) {
        return b(dialog, null);
    }

    @NonNull
    public static c b(@NonNull Dialog dialog, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.w.s(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f106350a = dialog2;
        if (onCancelListener != null) {
            cVar.f106351b = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f106351b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@androidx.annotation.p0 Bundle bundle) {
        Dialog dialog = this.f106350a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f106352c == null) {
            this.f106352c = new AlertDialog.Builder((Context) com.google.android.gms.common.internal.w.r(getActivity())).create();
        }
        return this.f106352c;
    }

    @Override // android.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, @androidx.annotation.p0 String str) {
        super.show(fragmentManager, str);
    }
}
