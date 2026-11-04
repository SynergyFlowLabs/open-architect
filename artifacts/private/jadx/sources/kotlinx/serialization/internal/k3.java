package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class k3 extends n2<kotlin.r1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private byte[] f315961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315962b;

    public /* synthetic */ k3(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // kotlinx.serialization.internal.n2
    public /* bridge */ /* synthetic */ kotlin.r1 a() {
        return kotlin.r1.d(f());
    }

    @Override // kotlinx.serialization.internal.n2
    public void b(int i10) {
        if (kotlin.r1.v(this.f315961a) < i10) {
            byte[] bArr = this.f315961a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, kotlin.ranges.r.u(i10, kotlin.r1.v(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f315961a = kotlin.r1.k(bArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.n2
    public int d() {
        return this.f315962b;
    }

    public final void e(byte b10) {
        n2.c(this, 0, 1, null);
        byte[] bArr = this.f315961a;
        int iD = d();
        this.f315962b = iD + 1;
        kotlin.r1.D(bArr, iD, b10);
    }

    @NotNull
    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f315961a, d());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return kotlin.r1.k(bArrCopyOf);
    }

    private k3(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315961a = bufferWithData;
        this.f315962b = kotlin.r1.v(bufferWithData);
        b(10);
    }
}
