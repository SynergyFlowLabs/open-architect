package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@u1
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,715:1\n85#2:716\n117#2,2:717\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n73#1:716\n73#1:717,2\n*E\n"})
public final class n4 implements v6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16251c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16252b;

    /* JADX WARN: Multi-variable type inference failed */
    public n4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return e().a(dVar);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return e().b(dVar, wVar);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return e().c(dVar);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return e().d(dVar, wVar);
    }

    @NotNull
    public final v6 e() {
        return (v6) this.f16252b.getValue();
    }

    public final void f(@NotNull v6 v6Var) {
        this.f16252b.setValue(v6Var);
    }

    public n4(@NotNull v6 v6Var) {
        this.f16252b = androidx.compose.runtime.d7.g(v6Var, null, 2, null);
    }

    public /* synthetic */ n4(v6 v6Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? b7.b(0, 0, 0, 0) : v6Var);
    }
}
