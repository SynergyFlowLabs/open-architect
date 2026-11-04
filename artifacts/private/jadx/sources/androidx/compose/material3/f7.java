package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class f7 implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27590c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.runtime.c0, Integer, Unit> f27591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.n<p1, androidx.compose.runtime.c0, Integer, Unit> f27592b;

    /* JADX WARN: Multi-variable type inference failed */
    public f7(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull pj.n<? super p1, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        this.f27591a = function2;
        this.f27592b = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(f7 f7Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        f7Var.b(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(f7 f7Var, p1 p1Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        f7Var.a(p1Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.material3.b0
    @androidx.compose.runtime.o
    public void a(@NotNull final p1 p1Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1853735176);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(p1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1853735176, i11, -1, "androidx.compose.material3.CustomAppBarItem.MenuContent (AppBarDsl.kt:233)");
            }
            this.f27592b.invoke(p1Var, c0VarR, Integer.valueOf(i11 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.e7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f7.f(this.f27286a, p1Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.b0
    @androidx.compose.runtime.o
    public void b(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1121775917);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1121775917, i11, -1, "androidx.compose.material3.CustomAppBarItem.AppbarContent (AppBarDsl.kt:228)");
            }
            this.f27591a.invoke(c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.d7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f7.e(this.f27050a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
