package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class i1 extends n2<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private long[] f315939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315940b;

    public i1(@NotNull long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315939a = bufferWithData;
        this.f315940b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        long[] jArr = this.f315939a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, kotlin.ranges.r.u(i10, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f315939a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315940b;
    }

    public final void e(long j10) {
        n2.c(this, 0, 1, null);
        long[] jArr = this.f315939a;
        int iD = d();
        this.f315940b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f315939a, d());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
