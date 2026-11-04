package ui;

import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.a0;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.io.c0;
import kotlinx.io.g0;
import kotlinx.io.i0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/core/StringsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,141:1\n21#2,3:142\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n35#1:142,3\n*E\n"})
public final class u {
    @kotlin.l(level = kotlin.n.WARNING, message = "Use decodeToString instead", replaceWith = @b1(expression = "bytes.decodeToString(offset, offset + length)", imports = {}))
    @NotNull
    public static final String a(@NotNull byte[] bytes, int i10, int i11, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return StringsKt.H1(bytes, i10, i10 + i11, false, 4, null);
        }
        kotlinx.io.b bVar = new kotlinx.io.b();
        j.h(bVar, bytes, i10, i11);
        return g(bVar, charset, 0, 2, null);
    }

    public static /* synthetic */ String b(byte[] bArr, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        return a(bArr, i10, i11, charset);
    }

    private static final Void c(int i10) throws EOFException {
        throw new EOFException("Not enough input bytes to read " + i10 + " characters.");
    }

    @kotlin.l(message = "Use readByteArray instead", replaceWith = @b1(expression = "this.readByteArray()", imports = {"kotlinx.io.readByteArray"}))
    @NotNull
    public static final byte[] d(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return g0.c(c0Var);
    }

    @kotlin.l(message = "Use readByteArray instead", replaceWith = @b1(expression = "this.readByteArray(count)", imports = {}))
    @NotNull
    public static final byte[] e(@NotNull c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return g0.d(c0Var, i10);
    }

    @NotNull
    public static final String f(@NotNull c0 c0Var, @NotNull Charset charset, int i10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return i10 == Integer.MAX_VALUE ? i0.j(c0Var) : i0.k(c0Var, Math.min(c0Var.n().j(), i10));
        }
        return ti.b.a(charset.newDecoder(), c0Var, i10);
    }

    public static /* synthetic */ String g(c0 c0Var, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return f(c0Var, charset, i10);
    }

    @kotlin.l(message = "Use readTextExactCharacters instead.", replaceWith = @b1(expression = "readTextExactCharacters(n, charset)", imports = {}))
    @NotNull
    public static final String h(@NotNull c0 c0Var, @NotNull Charset charset, int i10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return j(c0Var, i10, charset);
    }

    public static /* synthetic */ String i(c0 c0Var, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return h(c0Var, charset, i10);
    }

    @NotNull
    public static final String j(@NotNull c0 c0Var, int i10, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String strF = f(c0Var, charset, i10);
        if (strF.length() >= i10) {
            return strF;
        }
        c(i10);
        throw new a0();
    }

    public static /* synthetic */ String k(c0 c0Var, int i10, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return j(c0Var, i10, charset);
    }

    @NotNull
    public static final byte[] l(@NotNull String str, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.areEqual(charset, Charsets.UTF_8) ? StringsKt.K1(str, 0, 0, true, 3, null) : ti.a.d(charset.newEncoder(), str, 0, str.length());
    }

    public static /* synthetic */ byte[] m(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return l(str, charset);
    }

    public static final void n(@NotNull x xVar, @NotNull CharSequence text, int i10, int i11, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            i0.p(xVar, text.toString(), i10, i11);
        } else {
            ti.b.g(charset.newEncoder(), xVar, text, i10, i11);
        }
    }

    public static final void o(@NotNull x xVar, @NotNull char[] text, int i10, int i11, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (charset == Charsets.UTF_8) {
            i0.p(xVar, StringsKt.x1(text, i10, i10 + i11), 0, i11 - i10);
        } else {
            ti.b.d(charset.newEncoder(), text, i10, i11, xVar);
        }
    }

    public static /* synthetic */ void p(x xVar, CharSequence charSequence, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        n(xVar, charSequence, i10, i11, charset);
    }

    public static /* synthetic */ void q(x xVar, char[] cArr, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        if ((i12 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        o(xVar, cArr, i10, i11, charset);
    }
}
