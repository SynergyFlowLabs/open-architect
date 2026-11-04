package io.ktor.http.cio.internals;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k {
    public static final int a(@NotNull CharSequence text, @NotNull j range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int iB = range.b();
        int iA = range.a();
        if (iB < iA && !CharsKt.q(text.charAt(iB))) {
            do {
                iB++;
                if (iB >= iA) {
                    break;
                }
            } while (!CharsKt.q(text.charAt(iB)));
        }
        return iB;
    }

    @NotNull
    public static final CharSequence b(@NotNull CharSequence text, @NotNull j range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int iA = a(text, range);
        CharSequence charSequenceSubSequence = text.subSequence(range.b(), iA);
        range.d(iA);
        return charSequenceSubSequence;
    }

    public static final void c(@NotNull CharSequence text, @NotNull j range) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(range, "range");
        int iB = range.b();
        int iA = range.a();
        if (iB < iA && CharsKt.q(text.charAt(iB))) {
            do {
                iB++;
                if (iB >= iA) {
                    break;
                }
            } while (CharsKt.q(text.charAt(iB)));
            range.d(iB);
        }
    }

    public static final int d(@NotNull d text, int i10, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        while (i10 < i11) {
            char cCharAt = text.charAt(i10);
            if (!CharsKt.q(cCharAt) && cCharAt != '\t') {
                break;
            }
            i10++;
        }
        return i10;
    }
}
