package androidx.appcompat.widget;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class p1 {

    @androidx.annotation.w0(26)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private p1() {
    }

    public static void a(@NonNull View view, @androidx.annotation.p0 CharSequence charSequence) {
        a.a(view, charSequence);
    }
}
