package androidx.compose.ui.node;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,88:1\n85#2:89\n117#2,2:90\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:89\n30#1:90,2\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39703c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f39704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3 f39705b;

    public c0(@NotNull l0 l0Var, @NotNull androidx.compose.ui.layout.a1 a1Var) {
        this.f39704a = l0Var;
        this.f39705b = d7.g(a1Var, null, 2, null);
    }

    private final androidx.compose.ui.layout.a1 b() {
        return (androidx.compose.ui.layout.a1) this.f39705b.getValue();
    }

    private final void k(androidx.compose.ui.layout.a1 a1Var) {
        this.f39705b.setValue(a1Var);
    }

    @NotNull
    public final l0 a() {
        return this.f39704a;
    }

    public final int c(int i10) {
        return b().d(this.f39704a.F0(), this.f39704a.Y(), i10);
    }

    public final int d(int i10) {
        return b().e(this.f39704a.F0(), this.f39704a.Y(), i10);
    }

    public final int e(int i10) {
        return b().d(this.f39704a.F0(), this.f39704a.X(), i10);
    }

    public final int f(int i10) {
        return b().e(this.f39704a.F0(), this.f39704a.X(), i10);
    }

    public final int g(int i10) {
        return b().b(this.f39704a.F0(), this.f39704a.Y(), i10);
    }

    public final int h(int i10) {
        return b().c(this.f39704a.F0(), this.f39704a.Y(), i10);
    }

    public final int i(int i10) {
        return b().b(this.f39704a.F0(), this.f39704a.X(), i10);
    }

    public final int j(int i10) {
        return b().c(this.f39704a.F0(), this.f39704a.X(), i10);
    }

    public final void l(@NotNull androidx.compose.ui.layout.a1 a1Var) {
        k(a1Var);
    }
}
