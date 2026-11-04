package androidx.compose.foundation.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,698:1\n85#2:699\n117#2,2:700\n85#2:702\n117#2,2:703\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n56#1:699\n56#1:700,2\n62#1:702\n62#1:703,2\n*E\n"})
public final class h implements v6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16063f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f16065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16066d = androidx.compose.runtime.d7.g(androidx.core.graphics.j.f47822e, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16067e = androidx.compose.runtime.d7.g(Boolean.TRUE, null, 2, null);

    public h(int i10, @NotNull String str) {
        this.f16064b = i10;
        this.f16065c = str;
        int i11 = 3 & 2;
    }

    private final void i(boolean z10) {
        this.f16067e.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return e().f47824b;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return e().f47825c;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return e().f47826d;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return e().f47823a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final androidx.core.graphics.j e() {
        return (androidx.core.graphics.j) this.f16066d.getValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f16064b == ((h) obj).f16064b;
    }

    public final int f() {
        return this.f16064b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f16067e.getValue()).booleanValue();
    }

    public final void h(@NotNull androidx.core.graphics.j jVar) {
        this.f16066d.setValue(jVar);
    }

    public int hashCode() {
        return this.f16064b;
    }

    public final void j(@NotNull androidx.core.view.g3 g3Var, int i10) {
        if (i10 != 0 && (i10 & this.f16064b) == 0) {
            return;
        }
        h(g3Var.f(this.f16064b));
        i(g3Var.C(this.f16064b));
    }

    @NotNull
    public String toString() {
        return this.f16065c + '(' + e().f47823a + ", " + e().f47824b + ", " + e().f47825c + ", " + e().f47826d + ')';
    }
}
