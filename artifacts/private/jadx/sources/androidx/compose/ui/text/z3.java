package androidx.compose.ui.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z3 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42354a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42354a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a1 b(y0 y0Var, x0 x0Var) {
        if (y0Var == null && x0Var == null) {
            return null;
        }
        return e.a(y0Var, x0Var);
    }

    @NotNull
    public static final y3 c(@NotNull y3 y3Var, @NotNull y3 y3Var2, float f10) {
        return new y3(e3.c(y3Var.o0(), y3Var2.o0(), f10), u0.b(y3Var.n0(), y3Var2.n0(), f10));
    }

    @NotNull
    public static final y3 d(@NotNull y3 y3Var, @NotNull androidx.compose.ui.unit.w wVar) {
        return new y3(e3.h(y3Var.O()), u0.e(y3Var.L(), wVar), y3Var.M());
    }

    public static final int e(@NotNull androidx.compose.ui.unit.w wVar, int i10) {
        androidx.compose.ui.text.style.l.a aVar = androidx.compose.ui.text.style.l.f42221b;
        if (androidx.compose.ui.text.style.l.j(i10, aVar.a())) {
            int i11 = a.f42354a[wVar.ordinal()];
            if (i11 == 1) {
                return aVar.b();
            }
            if (i11 == 2) {
                return aVar.c();
            }
            throw new kotlin.k0();
        }
        if (!androidx.compose.ui.text.style.l.j(i10, aVar.f())) {
            return i10;
        }
        int i12 = a.f42354a[wVar.ordinal()];
        if (i12 == 1) {
            return aVar.d();
        }
        if (i12 == 2) {
            return aVar.e();
        }
        throw new kotlin.k0();
    }
}
