package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class j extends n2<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private byte[] f315946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315947b;

    public j(@NotNull byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315946a = bufferWithData;
        this.f315947b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        byte[] bArr = this.f315946a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, kotlin.ranges.r.u(i10, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f315946a = bArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315947b;
    }

    public final void e(byte b10) {
        n2.c(this, 0, 1, null);
        byte[] bArr = this.f315946a;
        int iD = d();
        this.f315947b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f315946a, d());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
