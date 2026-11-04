package androidx.compose.ui.focus;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,79:1\n643#2,2:80\n648#2,2:82\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n*L\n71#1:80,2\n75#1:82,2\n*E\n"})
final class m0 extends androidx.compose.ui.a0.d implements k0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private g0 f37434s;

    public m0(@NotNull g0 g0Var) {
        this.f37434s = g0Var;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        this.f37434s.h().d(this);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f37434s.h().n0(this);
        super.f9();
    }

    @NotNull
    public final g0 n1() {
        return this.f37434s;
    }

    public final void v9(@NotNull g0 g0Var) {
        this.f37434s = g0Var;
    }
}
