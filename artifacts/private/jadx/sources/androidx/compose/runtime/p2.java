package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36310c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public int[] f36311a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public int f36312b;

    private final int[] l() {
        int[] iArr = this.f36311a;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f36311a = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void a() {
        this.f36312b = 0;
    }

    public final int b() {
        return this.f36312b;
    }

    public final int c(int i10) {
        int[] iArr = this.f36311a;
        int iMin = Math.min(iArr.length, this.f36312b);
        for (int i11 = 0; i11 < iMin; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f36312b == 0;
    }

    public final boolean e() {
        return this.f36312b != 0;
    }

    public final int f() {
        return this.f36311a[this.f36312b - 1];
    }

    public final int g(int i10) {
        return this.f36311a[i10];
    }

    public final int h() {
        return this.f36311a[this.f36312b - 2];
    }

    public final int i(int i10) {
        int i11 = this.f36312b - 1;
        return i11 >= 0 ? this.f36311a[i11] : i10;
    }

    public final int j() {
        int[] iArr = this.f36311a;
        int i10 = this.f36312b - 1;
        this.f36312b = i10;
        return iArr[i10];
    }

    public final void k(int i10) {
        int[] iArrL = this.f36311a;
        if (this.f36312b >= iArrL.length) {
            iArrL = l();
        }
        int i11 = this.f36312b;
        this.f36312b = i11 + 1;
        iArrL[i11] = i10;
    }
}
