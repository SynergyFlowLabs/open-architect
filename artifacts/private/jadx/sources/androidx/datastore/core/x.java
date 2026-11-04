package androidx.datastore.core;

import androidx.annotation.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class x {
    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public static final w a(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new o0(filePath);
    }
}
