package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!androidx.compose.ui.text.android.l0.a(spannableString, w0.c.class)) {
            z0.d.y(spannableString, new w0.c(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(androidx.compose.ui.text.android.f1 f1Var, int i10) {
        int iR = f1Var.r();
        for (int i11 = 0; i11 < iR; i11++) {
            if (f1Var.q(i11) > i10) {
                return i11;
            }
        }
        return f1Var.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(y3 y3Var, boolean z10) {
        if (z10 && !androidx.compose.ui.unit.z.j(y3Var.E(), androidx.compose.ui.unit.a0.m(0)) && !androidx.compose.ui.unit.z.j(y3Var.E(), androidx.compose.ui.unit.z.f42728b.b())) {
            int iR = y3Var.R();
            androidx.compose.ui.text.style.j.a aVar = androidx.compose.ui.text.style.j.f42206b;
            if (!androidx.compose.ui.text.style.j.k(iR, aVar.g()) && !androidx.compose.ui.text.style.j.k(y3Var.R(), aVar.f()) && !androidx.compose.ui.text.style.j.k(y3Var.R(), aVar.c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i10) {
        androidx.compose.ui.text.style.j.a aVar = androidx.compose.ui.text.style.j.f42206b;
        if (androidx.compose.ui.text.style.j.k(i10, aVar.d())) {
            return 3;
        }
        if (androidx.compose.ui.text.style.j.k(i10, aVar.e())) {
            return 4;
        }
        if (androidx.compose.ui.text.style.j.k(i10, aVar.a())) {
            return 2;
        }
        if (!androidx.compose.ui.text.style.j.k(i10, aVar.f()) && androidx.compose.ui.text.style.j.k(i10, aVar.b())) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i10) {
        androidx.compose.ui.text.style.f.b.a aVar = androidx.compose.ui.text.style.f.b.f42160b;
        if (androidx.compose.ui.text.style.f.b.h(i10, aVar.c())) {
            return 0;
        }
        if (androidx.compose.ui.text.style.f.b.h(i10, aVar.b())) {
            return 1;
        }
        return androidx.compose.ui.text.style.f.b.h(i10, aVar.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i10) {
        androidx.compose.ui.text.style.e.a aVar = androidx.compose.ui.text.style.e.f42149b;
        if (androidx.compose.ui.text.style.e.g(i10, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        androidx.compose.ui.text.style.e.g(i10, aVar.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i10) {
        androidx.compose.ui.text.style.f.c.a aVar = androidx.compose.ui.text.style.f.c.f42166b;
        if (androidx.compose.ui.text.style.f.c.i(i10, aVar.a())) {
            return 0;
        }
        if (androidx.compose.ui.text.style.f.c.i(i10, aVar.b())) {
            return 1;
        }
        if (!androidx.compose.ui.text.style.f.c.i(i10, aVar.c())) {
            return androidx.compose.ui.text.style.f.c.i(i10, aVar.d()) ? 3 : 0;
        }
        int i11 = 2 | 2;
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i10) {
        androidx.compose.ui.text.style.f.d.a aVar = androidx.compose.ui.text.style.f.d.f42173b;
        return (!androidx.compose.ui.text.style.f.d.g(i10, aVar.a()) && androidx.compose.ui.text.style.f.d.g(i10, aVar.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i10) {
        i3.a aVar = i3.f41793b;
        return (!i3.f(i10, aVar.a()) && i3.f(i10, aVar.b())) ? 1 : 0;
    }
}
