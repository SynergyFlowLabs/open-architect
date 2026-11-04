package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends a1<byte[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final byte[] f312780d;

    public p(int i10) {
        super(i10);
        this.f312780d = new byte[i10];
    }

    public final void h(byte b10) {
        byte[] bArr = this.f312780d;
        int iB = b();
        e(iB + 1);
        bArr[iB] = b10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public final byte[] j() {
        return g(this.f312780d, new byte[f()]);
    }
}
