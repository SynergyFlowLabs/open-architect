package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends a1<boolean[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final boolean[] f312763d;

    public n(int i10) {
        super(i10);
        this.f312763d = new boolean[i10];
    }

    public final void h(boolean z10) {
        boolean[] zArr = this.f312763d;
        int iB = b();
        e(iB + 1);
        zArr[iB] = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @NotNull
    public final boolean[] j() {
        return g(this.f312763d, new boolean[f()]);
    }
}
