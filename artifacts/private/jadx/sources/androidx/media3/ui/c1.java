package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes3.dex */
final class c1 {
    private c1() {
    }

    public static /* synthetic */ boolean a(Object obj) {
        if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof androidx.media3.common.text.g);
    }

    public static void c(androidx.media3.common.text.a.c cVar) {
        cVar.b();
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.A(SpannableString.valueOf(cVar.k()));
            }
            e((Spannable) androidx.media3.common.util.a.g(cVar.k()), new com.google.common.base.k0() { // from class: androidx.media3.ui.a1
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return c1.b(obj);
                }
            });
        }
        d(cVar);
    }

    public static void d(androidx.media3.common.text.a.c cVar) {
        cVar.C(-3.4028235E38f, Integer.MIN_VALUE);
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.A(SpannableString.valueOf(cVar.k()));
            }
            e((Spannable) androidx.media3.common.util.a.g(cVar.k()), new com.google.common.base.k0() { // from class: androidx.media3.ui.b1
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return c1.a(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, com.google.common.base.k0<Object> k0Var) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (k0Var.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
