package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.k7;
import androidx.compose.ui.layout.b3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class x0 implements w0, androidx.compose.ui.layout.c1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17604f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f17605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b3 f17606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f17607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<List<androidx.compose.ui.layout.i2>> f17608d = androidx.collection.k0.j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<List<androidx.compose.ui.layout.z0>> f17609e = androidx.collection.k0.j();

    public x0(@NotNull i0 i0Var, @NotNull b3 b3Var) {
        this.f17605a = i0Var;
        this.f17606b = b3Var;
        this.f17607c = i0Var.d().invoke();
    }

    @Override // androidx.compose.ui.unit.d
    public long C0(long j10) {
        return this.f17606b.C0(j10);
    }

    @Override // androidx.compose.ui.unit.d
    public float D3(int i10) {
        return this.f17606b.D3(i10);
    }

    @Override // androidx.compose.ui.unit.d
    public float F3(float f10) {
        return this.f17606b.F3(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    @NotNull
    public n0.j N3(@NotNull androidx.compose.ui.unit.k kVar) {
        return this.f17606b.N3(kVar);
    }

    @Override // androidx.compose.ui.layout.z
    public boolean P5() {
        return this.f17606b.P5();
    }

    @Override // androidx.compose.ui.layout.c1
    @NotNull
    public androidx.compose.ui.layout.b1 S6(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @NotNull Function1<? super androidx.compose.ui.layout.i2.a, Unit> function1) {
        return this.f17606b.S6(i10, i11, map, function1);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float S7(float f10) {
        return this.f17606b.S7(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int c8(long j10) {
        return this.f17606b.c8(j10);
    }

    @Override // androidx.compose.ui.unit.n
    public long d0(float f10) {
        return this.f17606b.d0(f10);
    }

    @Override // androidx.compose.ui.layout.c1
    @NotNull
    public androidx.compose.ui.layout.b1 f8(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super androidx.compose.ui.layout.v2, Unit> function1, @NotNull Function1<? super androidx.compose.ui.layout.i2.a, Unit> function2) {
        return this.f17606b.f8(i10, i11, map, function1, function2);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int g6(float f10) {
        return this.f17606b.g6(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.w0
    @NotNull
    public List<androidx.compose.ui.layout.z0> g8(int i10) {
        List<androidx.compose.ui.layout.z0> listN = this.f17609e.n(i10);
        if (listN != null) {
            return listN;
        }
        Object objD = this.f17607c.d(i10);
        List<androidx.compose.ui.layout.z0> listS4 = this.f17606b.S4(objD, this.f17605a.b(i10, objD, this.f17607c.f(i10)));
        this.f17609e.j0(i10, listS4);
        return listS4;
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f17606b.getDensity();
    }

    @Override // androidx.compose.ui.layout.z
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.f17606b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.d
    public long j1(int i10) {
        return this.f17606b.j1(i10);
    }

    @Override // androidx.compose.ui.unit.d
    public long k4(long j10) {
        return this.f17606b.k4(j10);
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f17606b.m0();
    }

    @Override // androidx.compose.ui.unit.d
    public long m1(float f10) {
        return this.f17606b.m1(f10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float p6(long j10) {
        return this.f17606b.p6(j10);
    }

    @Override // androidx.compose.foundation.lazy.layout.w0
    @kotlin.l(message = "Please use compose and measure")
    @NotNull
    public List<androidx.compose.ui.layout.i2> t1(int i10, long j10) {
        List<androidx.compose.ui.layout.i2> listN = this.f17608d.n(i10);
        if (listN != null) {
            return listN;
        }
        Object objD = this.f17607c.d(i10);
        List<androidx.compose.ui.layout.z0> listS4 = this.f17606b.S4(objD, this.f17605a.b(i10, objD, this.f17607c.f(i10)));
        int size = listS4.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listS4.get(i11).P0(j10));
        }
        this.f17608d.j0(i10, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.unit.n
    public float y(long j10) {
        return this.f17606b.y(j10);
    }
}
