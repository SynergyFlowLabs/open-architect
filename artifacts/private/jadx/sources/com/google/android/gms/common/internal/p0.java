package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 implements DialogInterface.OnClickListener {
    public static p0 b(Activity activity, @androidx.annotation.p0 Intent intent, int i10) {
        return new m0(intent, activity, i10);
    }

    public static p0 c(@NonNull Fragment fragment, @androidx.annotation.p0 Intent intent, int i10) {
        return new n0(intent, fragment, i10);
    }

    public static p0 d(@NonNull com.google.android.gms.common.api.internal.n nVar, @androidx.annotation.p0 Intent intent, int i10) {
        return new o0(intent, nVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
            dialogInterface.dismiss();
        } catch (Throwable th2) {
            dialogInterface.dismiss();
            throw th2;
        }
    }
}
