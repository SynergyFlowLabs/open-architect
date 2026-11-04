package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends a1<int[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final int[] f312753d;

    public j0(int i10) {
        super(i10);
        this.f312753d = new int[i10];
    }

    public final void h(int i10) {
        int[] iArr = this.f312753d;
        int iB = b();
        e(iB + 1);
        iArr[iB] = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public final int[] j() {
        return g(this.f312753d, new int[f()]);
    }
}
