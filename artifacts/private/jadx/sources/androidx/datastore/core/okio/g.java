package androidx.datastore.core.okio;

import androidx.datastore.core.w;
import androidx.datastore.core.x;
import kotlin.jvm.internal.Intrinsics;
import okio.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g {
    @NotNull
    public static final w a(@NotNull r0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return x.a(path.w().toString());
    }
}
