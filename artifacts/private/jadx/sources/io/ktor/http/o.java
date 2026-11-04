package io.ktor.http;

import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o {
    @Nullable
    public static final Charset a(@NotNull t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        String strC = t0Var.c(hi.c.C1916c.f285814c);
        Charset charsetI = null;
        if (strC != null) {
            try {
                charsetI = ti.a.i(Charsets.f313184a, strC);
            } catch (IllegalArgumentException unused) {
            }
        }
        return charsetI;
    }

    @NotNull
    public static final m b(@NotNull m mVar, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return mVar.j(hi.c.C1916c.f285814c, ti.a.l(charset));
    }

    @NotNull
    public static final m c(@NotNull m mVar, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String lowerCase = mVar.f().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return !Intrinsics.areEqual(lowerCase, "text") ? mVar : mVar.j(hi.c.C1916c.f285814c, ti.a.l(charset));
    }
}
