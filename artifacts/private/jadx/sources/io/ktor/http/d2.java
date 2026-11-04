package io.ktor.http;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nQuery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Query.kt\nio/ktor/http/QueryKt\n+ 2 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,97:1\n31#2:98\n*S KotlinDebug\n*F\n+ 1 Query.kt\nio/ktor/http/QueryKt\n*L\n16#1:98\n*E\n"})
public final class d2 {
    private static final void a(y1 y1Var, String str, int i10, int i11, int i12, boolean z10) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i11 == -1) {
            int iF = f(i10, i12, str);
            int iE = e(iF, i12, str);
            if (iE > iF) {
                if (z10) {
                    strSubstring3 = h.k(str, iF, iE, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iF, iE);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                }
                y1Var.g(strSubstring3, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        int iF2 = f(i10, i11, str);
        int iE2 = e(iF2, i11, str);
        if (iE2 > iF2) {
            if (z10) {
                strSubstring = h.k(str, iF2, iE2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iF2, iE2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            int iF3 = f(i11 + 1, i12, str);
            int iE3 = e(iF3, i12, str);
            if (z10) {
                strSubstring2 = h.k(str, iF3, iE3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iF3, iE3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            }
            y1Var.l(strSubstring, strSubstring2);
        }
    }

    private static final void b(y1 y1Var, String str, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int iI3 = StringsKt.i3(str);
        int i14 = 0;
        if (i10 <= iI3) {
            int i15 = -1;
            int i16 = i10;
            int i17 = i16;
            while (i14 != i11) {
                char cCharAt = str.charAt(i17);
                if (cCharAt == '&') {
                    a(y1Var, str, i16, i15, i17, z10);
                    i14++;
                    i15 = -1;
                    i16 = i17 + 1;
                } else if (cCharAt == '=' && i15 == -1) {
                    i15 = i17;
                }
                if (i17 != iI3) {
                    i17++;
                } else {
                    i13 = i16;
                    i12 = i15;
                }
            }
            return;
        }
        i12 = -1;
        i13 = i10;
        if (i14 == i11) {
            return;
        }
        a(y1Var, str, i13, i12, str.length(), z10);
    }

    @NotNull
    public static final x1 c(@NotNull String query, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (i10 > StringsKt.i3(query)) {
            return x1.f296128b.b();
        }
        x1.a aVar = x1.f296128b;
        y1 y1VarB = b2.b(0, 1, null);
        b(y1VarB, query, i10, i11, z10);
        return y1VarB.build();
    }

    public static /* synthetic */ x1 d(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return c(str, i10, i11, z10);
    }

    private static final int e(int i10, int i11, CharSequence charSequence) {
        while (i11 > i10 && CharsKt.q(charSequence.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    private static final int f(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11 && CharsKt.q(charSequence.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
