package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class p extends n2<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private char[] f315991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315992b;

    public p(@NotNull char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315991a = bufferWithData;
        this.f315992b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        char[] cArr = this.f315991a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kotlin.ranges.r.u(i10, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f315991a = cArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315992b;
    }

    public final void e(char c10) {
        n2.c(this, 0, 1, null);
        char[] cArr = this.f315991a;
        int iD = d();
        this.f315992b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // kotlinx.serialization.internal.n2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f315991a, d());
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
