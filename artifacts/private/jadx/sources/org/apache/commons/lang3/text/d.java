package org.apache.commons.lang3.text;

import java.util.Formattable;
import java.util.Formatter;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.s;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f337287a = "%s";

    public static Formatter a(CharSequence charSequence, Formatter formatter, int i10, int i11, int i12) {
        return c(charSequence, formatter, i10, i11, i12, ' ', null);
    }

    public static Formatter b(CharSequence charSequence, Formatter formatter, int i10, int i11, int i12, char c10) {
        return c(charSequence, formatter, i10, i11, i12, c10, null);
    }

    public static Formatter c(CharSequence charSequence, Formatter formatter, int i10, int i11, int i12, char c10, CharSequence charSequence2) {
        c0.v(charSequence2 == null || i12 < 0 || charSequence2.length() <= i12, "Specified ellipsis '%1$s' exceeds precision of %2$s", charSequence2, Integer.valueOf(i12));
        StringBuilder sb2 = new StringBuilder(charSequence);
        if (i12 >= 0 && i12 < charSequence.length()) {
            CharSequence charSequence3 = (CharSequence) s.r(charSequence2, "");
            sb2.replace(i12 - charSequence3.length(), charSequence.length(), charSequence3.toString());
        }
        boolean z10 = (i10 & 1) == 1;
        for (int length = sb2.length(); length < i11; length++) {
            sb2.insert(z10 ? length : 0, c10);
        }
        formatter.format(sb2.toString(), new Object[0]);
        return formatter;
    }

    public static Formatter d(CharSequence charSequence, Formatter formatter, int i10, int i11, int i12, CharSequence charSequence2) {
        return c(charSequence, formatter, i10, i11, i12, ' ', charSequence2);
    }

    public static String e(Formattable formattable) {
        return String.format(f337287a, formattable);
    }
}
