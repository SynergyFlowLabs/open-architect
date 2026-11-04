package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends a1<double[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final double[] f312831d;

    public x(int i10) {
        super(i10);
        this.f312831d = new double[i10];
    }

    public final void h(double d10) {
        double[] dArr = this.f312831d;
        int iB = b();
        e(iB + 1);
        dArr[iB] = d10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public final double[] j() {
        return g(this.f312831d, new double[f()]);
    }
}
