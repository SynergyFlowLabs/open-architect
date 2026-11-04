package androidx.core.app;

import android.app.Dialog;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    @w0(28)
    static class a {
        private a() {
        }

        static <T> T a(Dialog dialog, int i10) {
            return (T) dialog.requireViewById(i10);
        }
    }

    private n() {
    }

    @NonNull
    public static View a(@NonNull Dialog dialog, int i10) {
        return (View) a.a(dialog, i10);
    }
}
