package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n13409#2,2:76\n13474#2,2:78\n13476#2:81\n1#3:80\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n43#1:76,2\n57#1:78,2\n57#1:81\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f17105i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v0[] f17107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k1 f17108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<c> f17109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f17111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f17113h;

    public y0(int i10, @NotNull v0[] v0VarArr, @NotNull k1 k1Var, @NotNull List<c> list, boolean z10, int i11) {
        this.f17106a = i10;
        this.f17107b = v0VarArr;
        this.f17108c = k1Var;
        this.f17109d = list;
        this.f17110e = z10;
        this.f17111f = i11;
        int iMax = 0;
        for (v0 v0Var : v0VarArr) {
            iMax = Math.max(iMax, v0Var.t());
        }
        this.f17112g = iMax;
        this.f17113h = kotlin.ranges.r.u(iMax + this.f17111f, 0);
    }

    public final int a() {
        return this.f17106a;
    }

    @NotNull
    public final v0[] b() {
        return this.f17107b;
    }

    public final int c() {
        return this.f17112g;
    }

    public final int d() {
        return this.f17113h;
    }

    public final boolean e() {
        return this.f17107b.length == 0;
    }

    @NotNull
    public final v0[] f(int i10, int i11, int i12) {
        v0[] v0VarArr = this.f17107b;
        int length = v0VarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            v0 v0Var = v0VarArr[i13];
            int i16 = i14 + 1;
            int iE = c.e(this.f17109d.get(i14).h());
            int i17 = this.f17108c.a()[i15];
            boolean z10 = this.f17110e;
            v0Var.w(i10, i17, i11, i12, z10 ? this.f17106a : i15, z10 ? i15 : this.f17106a);
            Unit unit = Unit.f312394a;
            i15 += iE;
            i13++;
            i14 = i16;
        }
        return this.f17107b;
    }
}
