package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class m90 implements k90 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30588c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.ui.layout.g0> f30589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.window.s f30590b;

    /* JADX WARN: Multi-variable type inference failed */
    public m90(@NotNull Function0<? extends androidx.compose.ui.layout.g0> function0, @NotNull androidx.compose.ui.window.s sVar) {
        this.f30589a = function0;
        this.f30590b = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o e(Function2 function2, m90 m90Var, androidx.compose.ui.draw.i iVar) {
        return (androidx.compose.ui.draw.o) function2.invoke(iVar, m90Var.f30589a.invoke());
    }

    @Override // androidx.compose.material3.k90
    @NotNull
    public androidx.compose.ui.window.s a() {
        return this.f30590b;
    }

    @Override // androidx.compose.material3.k90
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, final Function2 function2) {
        return androidx.compose.ui.draw.n.c(a0Var, new Function1() { // from class: androidx.compose.material3.l90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m90.e(function2, this, (androidx.compose.ui.draw.i) obj);
            }
        });
    }

    @Override // androidx.compose.material3.k90
    @Nullable
    public androidx.compose.ui.layout.g0 c(@NotNull androidx.compose.ui.layout.c1 c1Var) {
        return this.f30589a.invoke();
    }

    @NotNull
    public final Function0<androidx.compose.ui.layout.g0> f() {
        return this.f30589a;
    }

    @NotNull
    public final androidx.compose.ui.window.s g() {
        return this.f30590b;
    }
}
