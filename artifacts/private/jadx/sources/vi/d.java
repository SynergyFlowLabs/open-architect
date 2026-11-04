package vi;

import androidx.collection.g3;
import kotlin.a0;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    @a1
    @NotNull
    public static final Void a(long j10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalArgumentException("Long value " + j10 + " of " + name + " doesn't fit into 32-bit integer");
    }

    @a1
    public static final int b(long j10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j10 < g3.f12256c) {
            return (int) j10;
        }
        a(j10, name);
        throw new a0();
    }
}
