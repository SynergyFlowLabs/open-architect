package okio;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@kotlin.l(message = "changed in Okio 2.x")
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f334881a = new e();

    private e() {
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return g1.l(string, 0, 0, 3, null);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@NotNull String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(string, "string");
        return g1.k(string, i10, i11);
    }
}
