package kotlin.io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class h {
    @f
    @e1(version = "1.8")
    @NotNull
    public static final InputStream a(@NotNull InputStream inputStream, @NotNull a base64) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new d(inputStream, base64);
    }

    @f
    @e1(version = "1.8")
    @NotNull
    public static final OutputStream b(@NotNull OutputStream outputStream, @NotNull a base64) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new e(outputStream, base64);
    }
}
