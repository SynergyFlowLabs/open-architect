package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,715:1\n85#2:716\n117#2,2:717\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n355#1:716\n355#1:717,2\n*E\n"})
public final class t6 implements v6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16443d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16445c;

    public t6(@NotNull a4 a4Var, @NotNull String str) {
        this.f16444b = str;
        this.f16445c = androidx.compose.runtime.d7.g(a4Var, null, 2, null);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return f().d();
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return f().c();
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return f().a();
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return f().b();
    }

    @NotNull
    public final String e() {
        return this.f16444b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t6) {
            return Intrinsics.areEqual(f(), ((t6) obj).f());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final a4 f() {
        return (a4) this.f16445c.getValue();
    }

    public final void g(@NotNull a4 a4Var) {
        this.f16445c.setValue(a4Var);
    }

    public int hashCode() {
        return this.f16444b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f16444b + "(left=" + f().b() + ", top=" + f().d() + ", right=" + f().c() + ", bottom=" + f().a() + ')';
    }
}
