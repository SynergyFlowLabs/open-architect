package ui;

import io.ktor.utils.io.l0;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    @NotNull
    public static final x a() {
        return new kotlinx.io.b();
    }

    @kotlin.l(message = l0.f297090a, replaceWith = @b1(expression = "Sink", imports = {"kotlinx.io.Sink"}))
    public static /* synthetic */ void b() {
    }

    public static final void c(@NotNull x xVar, @NotNull CharSequence value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        u.p(xVar, value, i10, i11, null, 8, null);
    }

    public static /* synthetic */ void d(x xVar, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        c(xVar, charSequence, i10, i11);
    }

    @NotNull
    public static final c0 e(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return xVar.n();
    }

    public static final int f(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return (int) xVar.n().j();
    }

    public static /* synthetic */ void g(x xVar) {
    }

    public static final void h(@NotNull x xVar, @NotNull byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        xVar.write(buffer, i10, i11 + i10);
    }

    public static /* synthetic */ void i(x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        h(xVar, bArr, i10, i11);
    }

    public static final void j(@NotNull x xVar, @NotNull c0 packet) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(packet, "packet");
        xVar.la(packet);
    }
}
