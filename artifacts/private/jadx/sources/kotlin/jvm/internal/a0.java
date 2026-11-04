package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends a1<float[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final float[] f312719d;

    public a0(int i10) {
        super(i10);
        this.f312719d = new float[i10];
    }

    public final void h(float f10) {
        float[] fArr = this.f312719d;
        int iB = b();
        e(iB + 1);
        fArr[iB] = f10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public final float[] j() {
        return g(this.f312719d, new float[f()]);
    }
}
