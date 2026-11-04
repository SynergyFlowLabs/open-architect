package androidx.compose.ui.node;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1593:1\n78#2,5:1594\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNodeKt\n*L\n1582#1:1594,5\n*E\n"})
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f39954a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.unit.d f39955b = androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null);

    public static final void b(@NotNull l0 l0Var, @NotNull l0 l0Var2) {
        l0Var.W0(l0Var.Z().size(), l0Var2);
    }

    @NotNull
    public static final x1 c(@NotNull l0 l0Var) {
        x1 x1VarI0 = l0Var.I0();
        if (x1VarI0 != null) {
            return x1VarI0;
        }
        s0.a.j("LayoutNode should be attached to an owner");
        throw new kotlin.a0();
    }

    public static final <T> T d(@NotNull l0 l0Var, @NotNull Function0<? extends T> function0) throws Throwable {
        try {
            return function0.invoke();
        } catch (Throwable th2) {
            l0Var.Y1(th2);
            throw new kotlin.a0();
        }
    }
}
