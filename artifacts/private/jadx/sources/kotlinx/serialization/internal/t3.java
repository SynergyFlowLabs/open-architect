package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class t3 extends n2<kotlin.f2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private short[] f316019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f316020b;

    public /* synthetic */ t3(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // kotlinx.serialization.internal.n2
    public /* bridge */ /* synthetic */ kotlin.f2 a() {
        return kotlin.f2.d(f());
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        if (kotlin.f2.v(this.f316019a) < i10) {
            short[] sArr = this.f316019a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, kotlin.ranges.r.u(i10, kotlin.f2.v(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f316019a = kotlin.f2.k(sArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f316020b;
    }

    public final void e(short s10) {
        n2.c(this, 0, 1, null);
        short[] sArr = this.f316019a;
        int iD = d();
        this.f316020b = iD + 1;
        kotlin.f2.D(sArr, iD, s10);
    }

    @NotNull
    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f316019a, d());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return kotlin.f2.k(sArrCopyOf);
    }

    private t3(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f316019a = bufferWithData;
        this.f316020b = kotlin.f2.v(bufferWithData);
        b(10);
    }
}
