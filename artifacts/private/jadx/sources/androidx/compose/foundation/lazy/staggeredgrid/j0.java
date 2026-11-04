package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1474:1\n1132#2:1475\n1138#2:1477\n1135#2:1478\n1132#2:1480\n85#3:1476\n90#3:1479\n85#3:1481\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1258#1:1475\n1259#1:1477\n1259#1:1478\n1259#1:1480\n1258#1:1476\n1259#1:1479\n1259#1:1481\n*E\n"})
public abstract class j0 extends androidx.compose.foundation.lazy.layout.b1<n0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17885g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final r f17887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.w0 f17888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final v0 f17889f;

    public j0(boolean z10, @NotNull r rVar, @NotNull androidx.compose.foundation.lazy.layout.w0 w0Var, @NotNull v0 v0Var) {
        this.f17886c = z10;
        this.f17887d = rVar;
        this.f17888e = w0Var;
        this.f17889f = v0Var;
    }

    private final long c(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.f17889f.b()[i10];
        } else {
            int i13 = this.f17889f.a()[i10];
            int i14 = (i10 + i11) - 1;
            i12 = (this.f17889f.a()[i14] + this.f17889f.b()[i14]) - i13;
        }
        return this.f17886c ? androidx.compose.ui.unit.b.f42658b.e(i12) : androidx.compose.ui.unit.b.f42658b.d(i12);
    }

    @NotNull
    public abstract n0 d(int i10, int i11, int i12, @NotNull Object obj, @Nullable Object obj2, @NotNull List<? extends i2> list, long j10);

    @Override // androidx.compose.foundation.lazy.layout.b1
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n0 a(int i10, int i11, int i12, long j10) {
        return d(i10, i11, i12, this.f17887d.d(i10), this.f17887d.f(i10), b(this.f17888e, i10, j10), j10);
    }

    @NotNull
    public final n0 f(int i10, long j10) {
        Object objD = this.f17887d.d(i10);
        Object objF = this.f17887d.f(i10);
        int length = this.f17889f.b().length;
        int i11 = (int) (j10 >> 32);
        int iB = kotlin.ranges.r.B(i11, length - 1);
        int iB2 = kotlin.ranges.r.B(((int) (j10 & com.rabbitmq.client.k0.f265952a)) - i11, length - iB);
        long jC = c(iB, iB2);
        return d(i10, iB, iB2, objD, objF, b(this.f17888e, i10, jC), jC);
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.o0 g() {
        return this.f17887d.b();
    }
}
