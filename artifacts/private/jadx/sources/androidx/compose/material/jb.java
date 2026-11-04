package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMutableWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,51:1\n85#2:52\n117#2,2:53\n*S KotlinDebug\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material/MutableWindowInsets\n*L\n39#1:52\n39#1:53,2\n*E\n"})
public final class jb implements androidx.compose.foundation.layout.v6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23311c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f23312b;

    /* JADX WARN: Multi-variable type inference failed */
    public jb() {
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
    public final androidx.compose.foundation.layout.v6 e() {
        return (androidx.compose.foundation.layout.v6) this.f23312b.getValue();
    }

    public final void f(@NotNull androidx.compose.foundation.layout.v6 v6Var) {
        this.f23312b.setValue(v6Var);
    }

    public jb(@NotNull androidx.compose.foundation.layout.v6 v6Var) {
        this.f23312b = androidx.compose.runtime.d7.g(v6Var, null, 2, null);
    }

    public /* synthetic */ jb(androidx.compose.foundation.layout.v6 v6Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.foundation.layout.b7.b(0, 0, 0, 0) : v6Var);
    }
}
