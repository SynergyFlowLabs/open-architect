package androidx.compose.foundation.text.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21352a = -1;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21353a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21353a = iArr;
        }
    }

    @NotNull
    public static final o1 b(@NotNull androidx.compose.ui.text.p3 p3Var, int i10, int i11, int i12, long j10, boolean z10, boolean z11) {
        return new o3(z11, 1, 1, z10 ? null : new h0(new h0.a(n1.a(p3Var, androidx.compose.ui.text.w3.n(j10)), androidx.compose.ui.text.w3.n(j10), 1L), new h0.a(n1.a(p3Var, androidx.compose.ui.text.w3.i(j10)), androidx.compose.ui.text.w3.i(j10), 1L), androidx.compose.ui.text.w3.m(j10)), new f0(1L, 1, i10, i11, i12, p3Var));
    }

    public static final boolean c(@Nullable h0 h0Var, @Nullable o1 o1Var) {
        if (h0Var == null || o1Var == null) {
            return true;
        }
        if (h0Var.h().h() == h0Var.f().h()) {
            return h0Var.h().g() == h0Var.f().g();
        }
        if ((h0Var.g() ? h0Var.h() : h0Var.f()).g() != 0) {
            return false;
        }
        if (o1Var.j().l() != (h0Var.g() ? h0Var.f() : h0Var.h()).g()) {
            return false;
        }
        final kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        aVar.f312744a = true;
        o1Var.l(new Function1() { // from class: androidx.compose.foundation.text.selection.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r1.d(aVar, (f0) obj);
            }
        });
        return aVar.f312744a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(kotlin.jvm.internal.i1.a aVar, f0 f0Var) {
        if (f0Var.c().length() > 0) {
            aVar.f312744a = false;
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final n e(@NotNull n nVar, @NotNull n nVar2) {
        int[] iArr = a.f21353a;
        int i10 = iArr[nVar2.ordinal()];
        if (i10 == 1) {
            return n.BEFORE;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return n.AFTER;
            }
            throw new kotlin.k0();
        }
        int i11 = iArr[nVar.ordinal()];
        if (i11 == 1) {
            return n.BEFORE;
        }
        if (i11 == 2) {
            return n.ON;
        }
        if (i11 == 3) {
            return n.AFTER;
        }
        throw new kotlin.k0();
    }
}
