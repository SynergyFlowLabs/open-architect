package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class g extends n2<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private boolean[] f315918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315919b;

    public g(@NotNull boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315918a = bufferWithData;
        this.f315919b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        boolean[] zArr = this.f315918a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, kotlin.ranges.r.u(i10, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f315918a = zArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315919b;
    }

    public final void e(boolean z10) {
        n2.c(this, 0, 1, null);
        boolean[] zArr = this.f315918a;
        int iD = d();
        this.f315919b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f315918a, d());
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
