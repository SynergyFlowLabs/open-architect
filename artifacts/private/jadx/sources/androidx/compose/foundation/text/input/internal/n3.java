package androidx.compose.foundation.text.input.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nImeEditCommand.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,462:1\n97#2,4:463\n97#2,4:474\n25#3,3:467\n32#3,4:470\n101#4,10:478\n101#4,10:488\n*S KotlinDebug\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt\n*L\n266#1:463,4\n300#1:474,4\n273#1:467,3\n278#1:470,4\n363#1:478,10\n364#1:488,10\n*E\n"})
public final class n3 {
    public static final void h(@NotNull f3 f3Var, @NotNull final String str, final int i10) {
        f3Var.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.i(str, i10, (androidx.compose.foundation.text.input.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(String str, int i10, androidx.compose.foundation.text.input.j jVar) {
        androidx.compose.ui.text.w3 w3VarP = jVar.p();
        if (w3VarP != null) {
            q(jVar, androidx.compose.ui.text.w3.n(w3VarP.r()), androidx.compose.ui.text.w3.i(w3VarP.r()), str);
        } else {
            q(jVar, androidx.compose.ui.text.w3.n(jVar.w()), androidx.compose.ui.text.w3.i(jVar.w()), str);
        }
        int iN = androidx.compose.ui.text.w3.n(jVar.w());
        jVar.O(androidx.compose.ui.text.x3.a(kotlin.ranges.r.I(i10 > 0 ? (iN + i10) - 1 : (iN + i10) - str.length(), 0, jVar.r())));
        return Unit.f312394a;
    }

    public static final void j(@NotNull f3 f3Var, final int i10, final int i11) {
        f3Var.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.k3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.k(i10, i11, (androidx.compose.foundation.text.input.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(int i10, int i11, androidx.compose.foundation.text.input.j jVar) {
        if (!(i10 >= 0 && i11 >= 0)) {
            androidx.compose.foundation.internal.e.g("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
        }
        int i12 = androidx.compose.ui.text.w3.i(jVar.w());
        int iR = i12 + i11;
        if (((i11 ^ iR) & (i12 ^ iR)) < 0) {
            iR = jVar.r();
        }
        p(jVar, androidx.compose.ui.text.w3.i(jVar.w()), Math.min(iR, jVar.r()));
        int iN = androidx.compose.ui.text.w3.n(jVar.w());
        int i13 = iN - i10;
        if (((i10 ^ iN) & (iN ^ i13)) < 0) {
            i13 = 0;
        }
        p(jVar, Math.max(0, i13), androidx.compose.ui.text.w3.n(jVar.w()));
        return Unit.f312394a;
    }

    public static final void l(@NotNull f3 f3Var, final int i10, final int i11) {
        f3Var.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.g3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.m(i10, i11, (androidx.compose.foundation.text.input.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(int i10, int i11, androidx.compose.foundation.text.input.j jVar) {
        if (!(i10 >= 0 && i11 >= 0)) {
            androidx.compose.foundation.internal.e.g("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
        }
        int iN = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iN + 1;
            if (androidx.compose.ui.text.w3.n(jVar.w()) <= i13) {
                iN = androidx.compose.ui.text.w3.n(jVar.w());
                break;
            }
            iN = r(jVar.e().charAt((androidx.compose.ui.text.w3.n(jVar.w()) - i13) - 1), jVar.e().charAt(androidx.compose.ui.text.w3.n(jVar.w()) - i13)) ? iN + 2 : i13;
        }
        int iR = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = iR + 1;
            if (androidx.compose.ui.text.w3.i(jVar.w()) + i15 >= jVar.r()) {
                iR = jVar.r() - androidx.compose.ui.text.w3.i(jVar.w());
                break;
            }
            iR = r(jVar.e().charAt((androidx.compose.ui.text.w3.i(jVar.w()) + i15) - 1), jVar.e().charAt(androidx.compose.ui.text.w3.i(jVar.w()) + i15)) ? iR + 2 : i15;
        }
        p(jVar, androidx.compose.ui.text.w3.i(jVar.w()), androidx.compose.ui.text.w3.i(jVar.w()) + iR);
        p(jVar, androidx.compose.ui.text.w3.n(jVar.w()) - iN, androidx.compose.ui.text.w3.n(jVar.w()));
        return Unit.f312394a;
    }

    public static final void n(@NotNull f3 f3Var) {
        f3Var.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.l3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.o((androidx.compose.foundation.text.input.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.foundation.text.input.j jVar) {
        jVar.i();
        return Unit.f312394a;
    }

    @androidx.annotation.l1
    public static final void p(@NotNull androidx.compose.foundation.text.input.j jVar, int i10, int i11) {
        androidx.compose.ui.text.w3 w3VarP = jVar.p();
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        androidx.compose.foundation.text.input.k.b(jVar, iMin, iMax);
        if (w3VarP != null) {
            w3VarP.r();
            long jA = androidx.compose.foundation.text.input.k.a(w3VarP.r(), iMin, iMax, 0);
            if (androidx.compose.ui.text.w3.h(jA)) {
                jVar.i();
            } else {
                androidx.compose.foundation.text.input.j.K(jVar, androidx.compose.ui.text.w3.l(jA), androidx.compose.ui.text.w3.k(jA), null, 4, null);
            }
        }
    }

    @androidx.annotation.l1
    public static final void q(@NotNull androidx.compose.foundation.text.input.j jVar, int i10, int i11, @NotNull CharSequence charSequence) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i12 = 0;
        int i13 = iMin;
        while (i13 < iMax && i12 < charSequence.length() && charSequence.charAt(i12) == jVar.e().charAt(i13)) {
            i12++;
            i13++;
        }
        int length = charSequence.length();
        while (iMax > i13 && length > i12 && charSequence.charAt(length - 1) == jVar.e().charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i13 == iMax && i12 == length) {
            jVar.i();
            jVar.h();
        } else {
            jVar.C(i13, iMax, charSequence.subSequence(i12, length));
        }
        jVar.O(androidx.compose.ui.text.x3.a(iMin + charSequence.length()));
    }

    private static final boolean r(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }

    public static final void s(@NotNull f3 f3Var, final int i10, final int i11) {
        f3Var.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.m3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.t(i10, i11, (androidx.compose.foundation.text.input.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(int i10, int i11, androidx.compose.foundation.text.input.j jVar) {
        if (jVar.x()) {
            jVar.i();
        }
        int I = kotlin.ranges.r.I(i10, 0, jVar.r());
        int I2 = kotlin.ranges.r.I(i11, 0, jVar.r());
        if (I != I2) {
            if (I < I2) {
                androidx.compose.foundation.text.input.j.K(jVar, I, I2, null, 4, null);
            } else {
                androidx.compose.foundation.text.input.j.K(jVar, I2, I, null, 4, null);
            }
        }
        return Unit.f312394a;
    }

    public static final void u(@NotNull f3 f3Var, @NotNull final String str, final int i10, @Nullable final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list) {
        f3Var.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.i3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.w(str, list, i10, (androidx.compose.foundation.text.input.j) obj);
            }
        });
    }

    public static /* synthetic */ void v(f3 f3Var, String str, int i10, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = null;
        }
        u(f3Var, str, i10, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String str, List list, int i10, androidx.compose.foundation.text.input.j jVar) {
        androidx.compose.ui.text.w3 w3VarP = jVar.p();
        if (w3VarP != null) {
            q(jVar, androidx.compose.ui.text.w3.n(w3VarP.r()), androidx.compose.ui.text.w3.i(w3VarP.r()), str);
            if (str.length() > 0) {
                jVar.J(androidx.compose.ui.text.w3.n(w3VarP.r()), androidx.compose.ui.text.w3.n(w3VarP.r()) + str.length(), list);
            }
        } else {
            int iN = androidx.compose.ui.text.w3.n(jVar.w());
            q(jVar, iN, androidx.compose.ui.text.w3.i(jVar.w()), str);
            if (str.length() > 0) {
                jVar.J(iN, str.length() + iN, list);
            }
        }
        int iN2 = androidx.compose.ui.text.w3.n(jVar.w());
        jVar.O(androidx.compose.ui.text.x3.a(kotlin.ranges.r.I(i10 > 0 ? (iN2 + i10) - 1 : (iN2 + i10) - str.length(), 0, jVar.r())));
        return Unit.f312394a;
    }

    public static final void x(@NotNull final f3 f3Var, final int i10, final int i11) {
        f3Var.b(new Function1() { // from class: androidx.compose.foundation.text.input.internal.h3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.y(f3Var, i10, i11, (androidx.compose.foundation.text.input.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(f3 f3Var, int i10, int i11, androidx.compose.foundation.text.input.j jVar) {
        long jE = f3Var.e(androidx.compose.ui.text.x3.b(0, jVar.r()));
        int iL = androidx.compose.ui.text.w3.l(jE);
        int iK = androidx.compose.ui.text.w3.k(jE);
        if (i10 < iL) {
            i10 = iL;
        }
        if (i10 <= iK) {
            iK = i10;
        }
        int iL2 = androidx.compose.ui.text.w3.l(jE);
        int iK2 = androidx.compose.ui.text.w3.k(jE);
        if (i11 < iL2) {
            i11 = iL2;
        }
        if (i11 <= iK2) {
            iK2 = i11;
        }
        jVar.O(f3Var.f(androidx.compose.ui.text.x3.b(iK, iK2)));
        return Unit.f312394a;
    }
}
