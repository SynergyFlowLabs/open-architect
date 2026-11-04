package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.text.p3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Use PlatformTextInputModifierNode instead.")
@SourceDebugExtension({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,365:1\n176#1,5:366\n176#1,5:371\n176#1,5:376\n176#1,5:381\n176#1,5:386\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n195#1:366,5\n219#1:371,5\n246#1:376,5\n266#1:381,5\n283#1:386,5\n*E\n"})
public final class g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41883c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f41884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q0 f41885b;

    public g1(@NotNull a1 a1Var, @NotNull q0 q0Var) {
        this.f41884a = a1Var;
        this.f41885b = q0Var;
    }

    private final boolean b(Function0<Unit> function0) {
        boolean zD = d();
        if (zD) {
            function0.invoke();
        }
        return zD;
    }

    public final void a() {
        this.f41884a.g(this);
    }

    public final boolean c() {
        boolean zD = d();
        if (zD) {
            this.f41885b.e();
        }
        return zD;
    }

    public final boolean d() {
        return Intrinsics.areEqual(this.f41884a.a(), this);
    }

    public final boolean e(@NotNull n0.j jVar) {
        boolean zD = d();
        if (zD) {
            this.f41885b.g(jVar);
        }
        return zD;
    }

    public final boolean f() {
        boolean zD = d();
        if (zD) {
            this.f41885b.f();
        }
        return zD;
    }

    public final boolean g(@Nullable y0 y0Var, @NotNull y0 y0Var2) {
        boolean zD = d();
        if (zD) {
            this.f41885b.b(y0Var, y0Var2);
        }
        return zD;
    }

    public final boolean h(@NotNull y0 y0Var, @NotNull m0 m0Var, @NotNull p3 p3Var, @NotNull Function1<? super c2, Unit> function1, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
        boolean zD = d();
        if (zD) {
            this.f41885b.c(y0Var, m0Var, p3Var, function1, jVar, jVar2);
        }
        return zD;
    }
}
