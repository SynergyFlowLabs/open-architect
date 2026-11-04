package kotlin.text;

import kotlin.e1;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.q1;
import kotlin.r1;
import kotlin.u1;
import kotlin.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 {
    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final byte a(String str, h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return q1.n(g.p(str, format));
    }

    static /* synthetic */ byte b(String str, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return q1.n(g.p(str, format));
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.u
    @kotlin.internal.f
    private static final byte[] c(String str, h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return r1.k(g.t(str, format));
    }

    static /* synthetic */ byte[] d(String str, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return r1.k(g.t(str, format));
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final int e(String str, h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return u1.n(g.B(str, format));
    }

    static /* synthetic */ int f(String str, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return u1.n(g.B(str, format));
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final long g(String str, h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return y1.n(g.G(str, format));
    }

    static /* synthetic */ long h(String str, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return y1.n(g.G(str, format));
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final short i(String str, h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return e2.n(g.L(str, format));
    }

    static /* synthetic */ short j(String str, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return e2.n(g.L(str, format));
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final String k(int i10, h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return g.Z(i10, format);
    }

    static /* synthetic */ String l(int i10, h format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return g.Z(i10, format);
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final String m(long j10, h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return g.a0(j10, format);
    }

    static /* synthetic */ String n(long j10, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return g.a0(j10, format);
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final String o(byte b10, h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return g.Y(b10, format);
    }

    static /* synthetic */ String p(byte b10, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return g.Y(b10, format);
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.u
    @kotlin.internal.f
    private static final String q(byte[] toHexString, int i10, int i11, h format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return g.c0(toHexString, i10, i11, format);
    }

    static /* synthetic */ String r(byte[] toHexString, int i10, int i11, h format, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = r1.v(toHexString);
        }
        if ((i12 & 4) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return g.c0(toHexString, i10, i11, format);
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.internal.f
    private static final String s(short s10, h format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return g.b0(s10, format);
    }

    static /* synthetic */ String t(short s10, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return g.b0(s10, format);
    }

    @kotlin.s
    @e1(version = "1.9")
    @kotlin.u
    @kotlin.internal.f
    private static final String u(byte[] toHexString, h format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return g.d0(toHexString, format);
    }

    static /* synthetic */ String v(byte[] toHexString, h format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = h.f313318d.a();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return g.d0(toHexString, format);
    }
}
