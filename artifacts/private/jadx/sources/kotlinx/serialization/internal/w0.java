package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class w0 extends n2<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f316043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f316044b;

    public w0(@NotNull int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f316043a = bufferWithData;
        this.f316044b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        int[] iArr = this.f316043a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, kotlin.ranges.r.u(i10, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f316043a = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f316044b;
    }

    public final void e(int i10) {
        n2.c(this, 0, 1, null);
        int[] iArr = this.f316043a;
        int iD = d();
        this.f316044b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f316043a, d());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
