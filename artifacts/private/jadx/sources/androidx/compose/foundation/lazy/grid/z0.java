package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public abstract class z0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17120g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k1 f17122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0 f17125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final o1 f17126f;

    public z0(boolean z10, @NotNull k1 k1Var, int i10, int i11, @NotNull x0 x0Var, @NotNull o1 o1Var) {
        this.f17121a = z10;
        this.f17122b = k1Var;
        this.f17123c = i10;
        this.f17124d = i11;
        this.f17125e = x0Var;
        this.f17126f = o1Var;
    }

    public final long a(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.f17122b.b()[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            i12 = (this.f17122b.a()[i13] + this.f17122b.b()[i13]) - this.f17122b.a()[i10];
        }
        int iU = kotlin.ranges.r.u(i12, 0);
        return this.f17121a ? androidx.compose.ui.unit.b.f42658b.e(iU) : androidx.compose.ui.unit.b.f42658b.d(iU);
    }

    @NotNull
    public abstract y0 b(int i10, @NotNull v0[] v0VarArr, @NotNull List<c> list, int i11);

    @NotNull
    public final y0 c(int i10) {
        o1.c cVarD = this.f17126f.d(i10);
        int size = cVarD.b().size();
        int i11 = (size == 0 || cVarD.a() + size == this.f17123c) ? 0 : this.f17124d;
        v0[] v0VarArr = new v0[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iE = c.e(cVarD.b().get(i13).h());
            v0 v0VarE = this.f17125e.e(cVarD.a() + i13, a(i12, iE), i12, iE, i11);
            i12 += iE;
            Unit unit = Unit.f312394a;
            v0VarArr[i13] = v0VarE;
        }
        return b(i10, v0VarArr, cVarD.b(), i11);
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.o0 d() {
        return this.f17125e.g();
    }

    @NotNull
    public final y0 e(int i10) {
        return c(i10);
    }

    public final int f(int i10) {
        o1 o1Var = this.f17126f;
        return o1Var.k(i10, o1Var.g());
    }
}
