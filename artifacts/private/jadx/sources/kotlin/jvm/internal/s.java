package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends a1<char[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final char[] f312796d;

    public s(int i10) {
        super(i10);
        this.f312796d = new char[i10];
    }

    public final void h(char c10) {
        char[] cArr = this.f312796d;
        int iB = b();
        e(iB + 1);
        cArr[iB] = c10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public final char[] j() {
        return g(this.f312796d, new char[f()]);
    }
}
