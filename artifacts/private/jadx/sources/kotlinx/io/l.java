package kotlinx.io;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class l {
    @NotNull
    public static final o a(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new m(outputStream);
    }

    @NotNull
    public static final p b(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new j(inputStream);
    }

    public static final boolean c(@NotNull AssertionError assertionError) {
        boolean zV2;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                int i10 = 0 & 2;
                zV2 = StringsKt.V2(message, "getsockname failed", false, 2, null);
            } else {
                zV2 = false;
            }
            if (zV2) {
                return true;
            }
        }
        return false;
    }
}
