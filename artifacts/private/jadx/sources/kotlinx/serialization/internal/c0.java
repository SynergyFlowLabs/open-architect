package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class c0 extends n2<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private double[] f315899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315900b;

    public c0(@NotNull double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315899a = bufferWithData;
        this.f315900b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        double[] dArr = this.f315899a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, kotlin.ranges.r.u(i10, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f315899a = dArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315900b;
    }

    public final void e(double d10) {
        n2.c(this, 0, 1, null);
        double[] dArr = this.f315899a;
        int iD = d();
        this.f315900b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f315899a, d());
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
