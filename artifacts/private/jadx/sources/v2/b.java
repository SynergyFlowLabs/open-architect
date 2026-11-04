package v2;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final boolean a(@NotNull a aVar, @NotNull a.c<?> key) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return aVar.b().containsKey(key);
    }

    @NotNull
    public static final f b(@NotNull a aVar, @NotNull a creationExtras) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(creationExtras, "creationExtras");
        return new f((Map<a.c<?>, ? extends Object>) MapsKt.plus(aVar.b(), creationExtras.b()));
    }

    public static final void c(@NotNull f fVar, @NotNull a creationExtras) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(creationExtras, "creationExtras");
        fVar.b().putAll(creationExtras.b());
    }
}
