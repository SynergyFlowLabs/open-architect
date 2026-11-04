package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class n3 extends n2<kotlin.v1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f315982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315983b;

    public /* synthetic */ n3(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // kotlinx.serialization.internal.n2
    public /* bridge */ /* synthetic */ kotlin.v1 a() {
        return kotlin.v1.d(f());
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        if (kotlin.v1.v(this.f315982a) < i10) {
            int[] iArr = this.f315982a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, kotlin.ranges.r.u(i10, kotlin.v1.v(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f315982a = kotlin.v1.k(iArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315983b;
    }

    public final void e(int i10) {
        n2.c(this, 0, 1, null);
        int[] iArr = this.f315982a;
        int iD = d();
        this.f315983b = iD + 1;
        kotlin.v1.D(iArr, iD, i10);
    }

    @NotNull
    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f315982a, d());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return kotlin.v1.k(iArrCopyOf);
    }

    private n3(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315982a = bufferWithData;
        this.f315983b = kotlin.v1.v(bufferWithData);
        b(10);
    }
}
