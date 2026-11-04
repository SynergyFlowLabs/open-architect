package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f334741a = new o();

    private o() {
    }

    @oj.j
    @oj.n
    @NotNull
    public static final String a(@NotNull String username, @NotNull String password) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        return c(username, password, null, 4, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final String b(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + okio.o.f335046d.j(username + AbstractJsonLexerKt.COLON + password, charset).n();
    }

    public static /* synthetic */ String c(String str, String str2, Charset ISO_8859_1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        }
        return b(str, str2, ISO_8859_1);
    }
}
