package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class q3 extends n2<kotlin.z1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private long[] f315999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f316000b;

    public /* synthetic */ q3(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // kotlinx.serialization.internal.n2
    public /* bridge */ /* synthetic */ kotlin.z1 a() {
        return kotlin.z1.d(f());
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        if (kotlin.z1.v(this.f315999a) < i10) {
            long[] jArr = this.f315999a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, kotlin.ranges.r.u(i10, kotlin.z1.v(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f315999a = kotlin.z1.k(jArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f316000b;
    }

    public final void e(long j10) {
        n2.c(this, 0, 1, null);
        long[] jArr = this.f315999a;
        int iD = d();
        this.f316000b = iD + 1;
        kotlin.z1.D(jArr, iD, j10);
    }

    @NotNull
    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f315999a, d());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return kotlin.z1.k(jArrCopyOf);
    }

    private q3(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315999a = bufferWithData;
        this.f316000b = kotlin.z1.v(bufferWithData);
        b(10);
    }
}
