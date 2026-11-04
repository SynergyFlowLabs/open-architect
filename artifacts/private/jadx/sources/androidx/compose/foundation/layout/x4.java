package androidx.compose.foundation.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,699:1\n210#1:700\n213#1:701\n219#1:702\n216#1:703\n219#1:704\n210#1,10:705\n216#1,4:715\n210#1,4:719\n213#1:723\n219#1:724\n219#1:725\n213#1:726\n210#1:727\n213#1:728\n216#1:729\n219#1:730\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n248#1:700\n249#1:701\n250#1:702\n250#1:703\n251#1:704\n257#1:705,10\n259#1:715,4\n259#1:719,4\n265#1:723\n267#1:724\n273#1:725\n275#1:726\n279#1:727\n280#1:728\n281#1:729\n282#1:730\n*E\n"})
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16542a;

    private /* synthetic */ x4(long j10) {
        this.f16542a = j10;
    }

    public static final /* synthetic */ x4 a(long j10) {
        return new x4(j10);
    }

    public static long b(int i10, int i11, int i12, int i13) {
        return c(androidx.compose.ui.unit.c.a(i10, i11, i12, i13));
    }

    private static long c(long j10) {
        return j10;
    }

    public static long d(long j10, @NotNull i4 i4Var) {
        i4 i4Var2 = i4.Horizontal;
        return b(i4Var == i4Var2 ? androidx.compose.ui.unit.b.r(j10) : androidx.compose.ui.unit.b.q(j10), i4Var == i4Var2 ? androidx.compose.ui.unit.b.p(j10) : androidx.compose.ui.unit.b.o(j10), i4Var == i4Var2 ? androidx.compose.ui.unit.b.q(j10) : androidx.compose.ui.unit.b.r(j10), i4Var == i4Var2 ? androidx.compose.ui.unit.b.o(j10) : androidx.compose.ui.unit.b.p(j10));
    }

    public static final long e(long j10, int i10, int i11, int i12, int i13) {
        return b(i10, i11, i12, i13);
    }

    public static /* synthetic */ long f(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = androidx.compose.ui.unit.b.r(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = androidx.compose.ui.unit.b.p(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = androidx.compose.ui.unit.b.q(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = androidx.compose.ui.unit.b.o(j10);
        }
        return e(j10, i15, i16, i17, i13);
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof x4) && androidx.compose.ui.unit.b.g(j10, ((x4) obj).s());
    }

    public static final boolean h(long j10, long j11) {
        return androidx.compose.ui.unit.b.g(j10, j11);
    }

    public static final int i(long j10) {
        return androidx.compose.ui.unit.b.o(j10);
    }

    public static final int j(long j10) {
        return androidx.compose.ui.unit.b.q(j10);
    }

    public static final int k(long j10) {
        return androidx.compose.ui.unit.b.p(j10);
    }

    public static final int l(long j10) {
        return androidx.compose.ui.unit.b.r(j10);
    }

    public static int m(long j10) {
        return androidx.compose.ui.unit.b.t(j10);
    }

    public static final int n(long j10, @NotNull i4 i4Var) {
        return i4Var == i4.Horizontal ? androidx.compose.ui.unit.b.o(j10) : androidx.compose.ui.unit.b.p(j10);
    }

    public static final int o(long j10, @NotNull i4 i4Var) {
        return i4Var == i4.Horizontal ? androidx.compose.ui.unit.b.p(j10) : androidx.compose.ui.unit.b.o(j10);
    }

    public static final long p(long j10) {
        return b(androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10) != Integer.MAX_VALUE ? androidx.compose.ui.unit.b.o(j10) : androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.o(j10));
    }

    public static final long q(long j10, @NotNull i4 i4Var) {
        return i4Var == i4.Horizontal ? androidx.compose.ui.unit.c.a(androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.o(j10)) : androidx.compose.ui.unit.c.a(androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.o(j10), androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.p(j10));
    }

    public static String r(long j10) {
        return "OrientationIndependentConstraints(value=" + ((Object) androidx.compose.ui.unit.b.w(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f16542a, obj);
    }

    public int hashCode() {
        return m(this.f16542a);
    }

    public final /* synthetic */ long s() {
        return this.f16542a;
    }

    public String toString() {
        return r(this.f16542a);
    }
}
