package fi;

import io.ktor.http.Cookie;
import io.ktor.http.d1;
import io.ktor.http.g1;
import io.ktor.http.w0;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nio/ktor/client/request/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public final class k0 {
    public static final void a(@NotNull g1 g1Var, @NotNull io.ktor.http.m contentType) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        g1Var.O().l(d1.f295782a.d(), contentType.toString());
    }

    public static final void b(@NotNull g1 g1Var, @NotNull String username, @NotNull String password) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        String strT = d1.f295782a.t();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(io.ktor.util.f.e(username + AbstractJsonLexerKt.COLON + password));
        h(g1Var, strT, sb2.toString());
    }

    public static final void c(@NotNull g1 g1Var, @NotNull String token) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        h(g1Var, d1.f295782a.t(), "Bearer " + token);
    }

    public static final void d(@NotNull g1 g1Var, @NotNull String name, @NotNull String value, int i10, @Nullable GMTDate gMTDate, @Nullable String str, @Nullable String str2, boolean z10, boolean z11, @NotNull Map<String, String> extensions) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        String strQ = io.ktor.http.h0.q(new Cookie(name, value, (io.ktor.http.c0) null, Integer.valueOf(i10), gMTDate, str, str2, z10, z11, extensions, 4, (DefaultConstructorMarker) null));
        w0 w0VarO = g1Var.O();
        d1 d1Var = d1.f295782a;
        if (!w0VarO.contains(d1Var.D())) {
            g1Var.O().l(d1Var.D(), strQ);
            return;
        }
        g1Var.O().a(d1Var.D(), g1Var.O().get(d1Var.D()) + "; " + strQ);
    }

    public static /* synthetic */ void e(g1 g1Var, String str, String str2, int i10, GMTDate gMTDate, String str3, String str4, boolean z10, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            gMTDate = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            str4 = null;
        }
        if ((i11 & 64) != 0) {
            z10 = false;
        }
        if ((i11 & 128) != 0) {
            z11 = false;
        }
        if ((i11 & 256) != 0) {
            map = MapsKt.emptyMap();
        }
        d(g1Var, str, str2, i10, gMTDate, str3, str4, z10, z11, map);
    }

    @NotNull
    public static final String f(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return yVar.i().j();
    }

    public static final int g(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return yVar.i().n();
    }

    public static final void h(@NotNull g1 g1Var, @NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            g1Var.O().l(key, obj.toString());
        }
    }

    public static final void i(@NotNull y yVar, @NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            yVar.i().k().l(key, obj.toString());
        }
    }

    public static final void j(@NotNull y yVar, @NotNull String value) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        yVar.i().y(value);
    }

    public static final void k(@NotNull y yVar, int i10) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        yVar.i().B(i10);
    }
}
