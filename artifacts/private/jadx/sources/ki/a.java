package ki;

import io.ktor.util.b0;
import io.ktor.util.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ui.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f312228a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    @NotNull
    public static final String a(@NotNull String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        return f.g(b0.j(u.l(StringsKt.E5(nonce).toString() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11", Charsets.f313189f)));
    }
}
