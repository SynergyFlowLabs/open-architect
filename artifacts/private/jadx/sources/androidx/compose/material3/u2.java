package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,3517:1\n81#2:3518\n114#2,2:3519\n81#2:3521\n114#2,2:3522\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/BottomAppBarStateImpl\n*L\n2325#1:3518\n2325#1:3519,2\n2334#1:3521\n2334#1:3522,2\n*E\n"})
final class u2 implements t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f33360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f33361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.k3 f33362d;

    public u2(float f10, float f11, float f12) {
        this.f33360b = androidx.compose.runtime.g4.b(f10);
        this.f33361c = androidx.compose.runtime.g4.b(f12);
        this.f33362d = androidx.compose.runtime.g4.b(f11);
    }

    @Override // androidx.compose.material3.t2
    public float a() {
        if (b() == 0.0f) {
            return 0.0f;
        }
        return d() / b();
    }

    @Override // androidx.compose.material3.t2
    public float b() {
        return this.f33360b.V0();
    }

    @Override // androidx.compose.material3.t2
    public void c(float f10) {
        this.f33362d.q(kotlin.ranges.r.H(f10, b(), 0.0f));
    }

    @Override // androidx.compose.material3.t2
    public float d() {
        return this.f33362d.V0();
    }

    @Override // androidx.compose.material3.t2
    public float e() {
        return this.f33361c.V0();
    }

    @Override // androidx.compose.material3.t2
    public void f(float f10) {
        this.f33361c.q(f10);
    }

    @Override // androidx.compose.material3.t2
    public void g(float f10) {
        this.f33360b.q(f10);
    }
}
