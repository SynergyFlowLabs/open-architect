package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class m0 extends n2<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private float[] f315969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315970b;

    public m0(@NotNull float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315969a = bufferWithData;
        this.f315970b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        float[] fArr = this.f315969a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, kotlin.ranges.r.u(i10, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f315969a = fArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315970b;
    }

    public final void e(float f10) {
        boolean z10 = true & false;
        n2.c(this, 0, 1, null);
        float[] fArr = this.f315969a;
        int iD = d();
        this.f315970b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f315969a, d());
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
