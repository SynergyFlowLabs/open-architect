package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class r extends androidx.fragment.app.m {
    public r() {
    }

    @Override // androidx.fragment.app.m
    @NonNull
    public Dialog onCreateDialog(@p0 Bundle bundle) {
        return new q(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.m
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i10) {
        if (!(dialog instanceof q)) {
            super.setupDialog(dialog, i10);
            return;
        }
        q qVar = (q) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        qVar.l(1);
    }

    public r(@j0 int i10) {
        super(i10);
    }
}
