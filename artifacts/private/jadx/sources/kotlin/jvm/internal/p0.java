package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends a1<long[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final long[] f312781d;

    public p0(int i10) {
        super(i10);
        this.f312781d = new long[i10];
    }

    public final void h(long j10) {
        long[] jArr = this.f312781d;
        int iB = b();
        e(iB + 1);
        jArr[iB] = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public final long[] j() {
        return g(this.f312781d, new long[f()]);
    }
}
