package androidx.datastore.core;

import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "MultiProcessCoordinatorKt")
public final class b0 {
    @NotNull
    public static final w a(@NotNull CoroutineContext context, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        return new a0(context, file);
    }
}
