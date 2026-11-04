package androidx.savedstate;

import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class h {
    @a1
    @NotNull
    public static final Void a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + key + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
