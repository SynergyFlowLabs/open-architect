package kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class q {
    @i
    @NotNull
    public static final <T> e<T> a(@NotNull kotlinx.serialization.internal.b<T> bVar, @NotNull kotlinx.serialization.encoding.d decoder, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        e<T> eVarD = bVar.d(decoder, str);
        if (eVarD != null) {
            return eVarD;
        }
        kotlinx.serialization.internal.c.a(str, bVar.f());
        throw new kotlin.a0();
    }

    @i
    @NotNull
    public static final <T> d0<T> b(@NotNull kotlinx.serialization.internal.b<T> bVar, @NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        d0<T> d0VarE = bVar.e(encoder, value);
        if (d0VarE != null) {
            return d0VarE;
        }
        kotlinx.serialization.internal.c.b(j1.d(value.getClass()), bVar.f());
        throw new kotlin.a0();
    }
}
