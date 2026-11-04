package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class y2 extends n2<short[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private short[] f316058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f316059b;

    public y2(@NotNull short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f316058a = bufferWithData;
        this.f316059b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        short[] sArr = this.f316058a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, kotlin.ranges.r.u(i10, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f316058a = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f316059b;
    }

    public final void e(short s10) {
        n2.c(this, 0, 1, null);
        short[] sArr = this.f316058a;
        int iD = d();
        this.f316059b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f316058a, d());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
