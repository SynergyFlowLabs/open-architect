package androidx.work;

import androidx.annotation.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    @Nullable
    public abstract p a(@NotNull String str);

    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public final p b(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        p pVarA = a(className);
        if (pVarA == null) {
            pVarA = r.a(className);
        }
        return pVarA;
    }
}
