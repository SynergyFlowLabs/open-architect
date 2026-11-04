package kotlin.reflect;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    @Nullable
    public static final String a(@NotNull d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar.m();
    }
}
