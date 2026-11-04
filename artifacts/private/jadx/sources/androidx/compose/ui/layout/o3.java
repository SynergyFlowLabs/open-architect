package androidx.compose.ui.layout;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.h6;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nWindowInsetsRulers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/WindowWindowInsetsAnimationValues\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,576:1\n85#2:577\n117#2,2:578\n85#2:580\n117#2,2:581\n81#3:583\n114#3,2:584\n81#3:589\n114#3,2:590\n79#4:586\n112#4,2:587\n*S KotlinDebug\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/WindowWindowInsetsAnimationValues\n*L\n68#1:577\n68#1:578,2\n69#1:580\n69#1:581,2\n70#1:583\n70#1:584,2\n72#1:589\n72#1:590,2\n71#1:586\n71#1:587,2\n*E\n"})
public final class o3 implements l2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39457l = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final m2 f39463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m2 f39464g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f39458a = d7.g(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f39459b = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f39460c = g4.b(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.m3 f39461d = h6.b(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f39462e = g4.b(1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f39465h = g3.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f39466i = g3.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f39467j = g3.c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f39468k = g3.c();

    public o3(@NotNull String str) {
        this.f39463f = o2.b(str + " source");
        this.f39464g = o2.b(str + " target");
    }

    @Override // androidx.compose.ui.layout.j3
    @NotNull
    public m2 P() {
        return this.f39463f;
    }

    @Override // androidx.compose.ui.layout.j3
    public long a() {
        return this.f39461d.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.j3
    public boolean b() {
        return ((Boolean) this.f39459b.getValue()).booleanValue();
    }

    public final long c() {
        return this.f39465h;
    }

    public final long d() {
        return this.f39466i;
    }

    public final long e() {
        return this.f39467j;
    }

    public final long f() {
        return this.f39468k;
    }

    public void g(float f10) {
        this.f39462e.q(f10);
    }

    public void h(boolean z10) {
        this.f39459b.setValue(Boolean.valueOf(z10));
    }

    public final void i(long j10) {
        this.f39465h = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.j3
    public boolean isVisible() {
        return ((Boolean) this.f39458a.getValue()).booleanValue();
    }

    public void j(long j10) {
        this.f39461d.C(j10);
    }

    public void k(float f10) {
        this.f39460c.q(f10);
    }

    public final void l(long j10) {
        this.f39466i = j10;
    }

    public final void m(long j10) {
        this.f39467j = j10;
    }

    public final void n(long j10) {
        this.f39468k = j10;
    }

    public void o(boolean z10) {
        this.f39458a.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.ui.layout.j3
    public float r() {
        return this.f39462e.V0();
    }

    @Override // androidx.compose.ui.layout.j3
    @NotNull
    public m2 y1() {
        return this.f39464g;
    }

    @Override // androidx.compose.ui.layout.j3
    public float z1() {
        return this.f39460c.V0();
    }
}
