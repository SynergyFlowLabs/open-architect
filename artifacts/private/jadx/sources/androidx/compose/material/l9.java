package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,172:1\n113#2:173\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n171#1:173\n*E\n"})
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Boolean> f23666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Boolean> f23667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f23668c;

    static {
        androidx.compose.runtime.m4<Boolean> m4VarM = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material.k9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(l9.b());
            }
        });
        f23666a = m4VarM;
        f23667b = m4VarM;
        float f10 = 48;
        f23668c = androidx.compose.ui.unit.i.b(androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        return true;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Boolean> d() {
        return f23666a;
    }

    @u7
    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Boolean> f() {
        return f23667b;
    }

    @u7
    @kotlin.l(level = kotlin.n.WARNING, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @kotlin.b1(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    public static /* synthetic */ void g() {
    }

    @NotNull
    public static final androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var) {
        return a0Var.B2(MinimumInteractiveModifier.f21933c);
    }
}
