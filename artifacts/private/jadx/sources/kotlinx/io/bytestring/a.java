package kotlinx.io.bytestring;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    @kotlin.io.encoding.f
    @NotNull
    public static final byte[] a(@NotNull kotlin.io.encoding.a aVar, @NotNull c source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return aVar.j(source.q(), i10, i11);
    }

    public static /* synthetic */ byte[] b(kotlin.io.encoding.a aVar, c cVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cVar.r();
        }
        return a(aVar, cVar, i10, i11);
    }

    @kotlin.io.encoding.f
    public static final int c(@NotNull kotlin.io.encoding.a aVar, @NotNull c source, @NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return aVar.o(source.q(), destination, i10, i11, i12);
    }

    public static /* synthetic */ int d(kotlin.io.encoding.a aVar, c cVar, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = cVar.r();
        }
        return c(aVar, cVar, bArr, i10, i11, i12);
    }

    @kotlin.io.encoding.f
    @NotNull
    public static final c e(@NotNull kotlin.io.encoding.a aVar, @NotNull CharSequence source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return c.f315746c.b(aVar.i(source, i10, i11));
    }

    @kotlin.io.encoding.f
    @NotNull
    public static final c f(@NotNull kotlin.io.encoding.a aVar, @NotNull c source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return c.f315746c.b(aVar.j(source.q(), i10, i11));
    }

    @kotlin.io.encoding.f
    @NotNull
    public static final c g(@NotNull kotlin.io.encoding.a aVar, @NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return c.f315746c.b(aVar.j(source, i10, i11));
    }

    public static /* synthetic */ c h(kotlin.io.encoding.a aVar, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return e(aVar, charSequence, i10, i11);
    }

    public static /* synthetic */ c i(kotlin.io.encoding.a aVar, c cVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cVar.r();
        }
        return f(aVar, cVar, i10, i11);
    }

    public static /* synthetic */ c j(kotlin.io.encoding.a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return g(aVar, bArr, i10, i11);
    }

    @kotlin.io.encoding.f
    @NotNull
    public static final String k(@NotNull kotlin.io.encoding.a aVar, @NotNull c source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return aVar.s(source.q(), i10, i11);
    }

    public static /* synthetic */ String l(kotlin.io.encoding.a aVar, c cVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cVar.r();
        }
        return k(aVar, cVar, i10, i11);
    }

    @kotlin.io.encoding.f
    public static final int m(@NotNull kotlin.io.encoding.a aVar, @NotNull c source, @NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return aVar.u(source.q(), destination, i10, i11, i12);
    }

    public static /* synthetic */ int n(kotlin.io.encoding.a aVar, c cVar, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = cVar.r();
        }
        return m(aVar, cVar, bArr, i10, i11, i12);
    }

    @kotlin.io.encoding.f
    @NotNull
    public static final <A extends Appendable> A o(@NotNull kotlin.io.encoding.a aVar, @NotNull c source, @NotNull A destination, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return (A) aVar.y(source.q(), destination, i10, i11);
    }

    public static /* synthetic */ Appendable p(kotlin.io.encoding.a aVar, c cVar, Appendable appendable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = cVar.r();
        }
        return o(aVar, cVar, appendable, i10, i11);
    }

    @kotlin.io.encoding.f
    @NotNull
    public static final byte[] q(@NotNull kotlin.io.encoding.a aVar, @NotNull c source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return aVar.A(source.q(), i10, i11);
    }

    public static /* synthetic */ byte[] r(kotlin.io.encoding.a aVar, c cVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cVar.r();
        }
        return q(aVar, cVar, i10, i11);
    }
}
