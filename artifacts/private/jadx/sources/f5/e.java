package f5;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f275001a = new e();

    private e() {
    }

    private final boolean a(TextView textView) {
        int i10;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            g gVar = g.f275010a;
            String strReplace = new Regex("\\s").replace(g.k(textView), "");
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char cCharAt = strReplace.charAt(i11);
                        if (!Character.isDigit(cCharAt)) {
                            return false;
                        }
                        int iE = CharsKt.E(cCharAt);
                        if (z10 && (iE = iE * 2) > 9) {
                            iE = (iE % 10) + 1;
                        }
                        i10 += iE;
                        z10 = !z10;
                        if (i12 < 0) {
                            break;
                        }
                        i11 = i12;
                    }
                } else {
                    i10 = 0;
                }
                if (i10 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            g gVar = g.f275010a;
            String strK = g.k(textView);
            if (strK != null && strK.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strK).matches();
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    @n
    public static final boolean g(@Nullable View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            e eVar = f275001a;
            return eVar.c((TextView) view) || eVar.a((TextView) view) || eVar.d((TextView) view) || eVar.f((TextView) view) || eVar.e((TextView) view) || eVar.b((TextView) view);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return false;
        }
    }
}
