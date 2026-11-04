package androidx.compose.foundation.text.input;

import androidx.compose.foundation.b2;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final long a(long j10, int i10, int i11, int i12) {
        int i13;
        int iL = w3.l(j10);
        int iK = w3.k(j10);
        if (iK < i10) {
            return j10;
        }
        if (iL <= i10 && i11 <= iK) {
            i13 = i12 - (i11 - i10);
            if (iL == iK) {
                iL += i13;
            }
            i10 = iK + i13;
        } else if (iL > i10 && iK < i11) {
            i10 += i12;
            iL = i10;
        } else if (iL >= i11) {
            i13 = i12 - (i11 - i10);
            iL += i13;
            i10 = iK + i13;
        } else if (i10 < iL) {
            iL = i10 + i12;
            i13 = i12 - (i11 - i10);
            i10 = iK + i13;
        }
        return x3.b(iL, i10);
    }

    public static final void b(@NotNull j jVar, int i10, int i11) {
        jVar.C(i10, i11, "");
    }

    public static final void c(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull pj.o<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> oVar) {
        int i10;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i11 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i10 = 0;
        } else {
            int i12 = 0;
            i10 = 0;
            boolean z10 = false;
            while (true) {
                if (i11 == 0) {
                    if (charSequence.charAt(i12) == charSequence2.charAt(i10)) {
                        i12++;
                        i10++;
                    } else {
                        i11 = 1;
                    }
                }
                if (!z10) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z10 = true;
                    }
                }
                if (i12 >= length || i10 >= length2 || (i11 != 0 && z10)) {
                    break;
                }
            }
            i11 = i12;
        }
        if (i11 < length || i10 < length2) {
            oVar.invoke(Integer.valueOf(i11), Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(length2));
        }
    }

    @b2
    public static final void d(@NotNull j.a aVar, @NotNull Function2<? super w3, ? super w3, Unit> function2) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            function2.invoke(w3.b(aVar.c(i10)), w3.b(aVar.b(i10)));
        }
    }

    @b2
    public static final void e(@NotNull j.a aVar, @NotNull Function2<? super w3, ? super w3, Unit> function2) {
        for (int iA = aVar.a() - 1; iA >= 0; iA--) {
            function2.invoke(w3.b(aVar.c(iA)), w3.b(aVar.b(iA)));
        }
    }

    public static final void f(@NotNull j jVar, int i10, @NotNull String str) {
        jVar.C(i10, i10, str);
    }

    public static final void g(@NotNull j jVar) {
        jVar.B(jVar.r());
    }

    public static final void h(@NotNull j jVar) {
        jVar.O(x3.b(0, jVar.r()));
    }

    public static final void i(@NotNull j jVar, int i10, int i11) {
        jVar.O(x3.b(kotlin.ranges.r.I(i10, 0, jVar.r()), kotlin.ranges.r.I(i11, 0, jVar.r())));
    }

    public static /* synthetic */ void j(j jVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = i10;
        }
        i(jVar, i10, i11);
    }
}
