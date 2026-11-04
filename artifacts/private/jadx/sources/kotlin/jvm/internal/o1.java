package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class o1 extends a1<short[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final short[] f312779d;

    public o1(int i10) {
        super(i10);
        this.f312779d = new short[i10];
    }

    public final void h(short s10) {
        short[] sArr = this.f312779d;
        int iB = b();
        e(iB + 1);
        sArr[iB] = s10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public final short[] j() {
        return g(this.f312779d, new short[f()]);
    }
}
