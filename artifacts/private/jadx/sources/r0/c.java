package r0;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.input.pointer.b0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f359027c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f359028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private long[] f359029b = new long[2];

    private final long[] m(int i10) {
        long[] jArr = this.f359029b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.f359029b = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean a(long j10) {
        if (d(j10)) {
            return false;
        }
        n(this.f359028a, j10);
        return true;
    }

    public final boolean b(long j10) {
        return a(j10);
    }

    public final void c() {
        this.f359028a = 0;
    }

    public final boolean d(long j10) {
        int i10 = this.f359028a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f359029b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(long j10) {
        return d(j10);
    }

    public final long f(int i10) {
        return b0.b(this.f359029b[i10]);
    }

    public final int g() {
        return h() - 1;
    }

    public final int h() {
        return this.f359028a;
    }

    public final boolean i() {
        return this.f359028a == 0;
    }

    public final boolean j(long j10) {
        int i10 = this.f359028a;
        int i11 = 0;
        while (i11 < i10) {
            if (j10 == this.f359029b[i11]) {
                int i12 = this.f359028a - 1;
                while (i11 < i12) {
                    long[] jArr = this.f359029b;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f359028a--;
                return true;
            }
            i11++;
        }
        return false;
    }

    public final boolean k(long j10) {
        return j(j10);
    }

    public final boolean l(int i10) {
        int i11 = this.f359028a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f359029b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f359028a--;
        return true;
    }

    public final void n(int i10, long j10) {
        long[] jArrM = this.f359029b;
        if (i10 >= jArrM.length) {
            jArrM = m(i10 + 1);
        }
        jArrM[i10] = j10;
        if (i10 >= this.f359028a) {
            this.f359028a = i10 + 1;
        }
    }

    public final void o(int i10, long j10) {
        n(i10, j10);
    }
}
