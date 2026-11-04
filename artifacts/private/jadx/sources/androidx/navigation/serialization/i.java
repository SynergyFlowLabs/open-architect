package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.annotation.b1;
import androidx.lifecycle.l1;
import androidx.navigation.d3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    @b1({b1.a.LIBRARY_GROUP})
    public static final <T> T a(@NotNull KSerializer<T> kSerializer, @NotNull Bundle bundle, @NotNull Map<String, ? extends d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        return (T) new h(bundle, typeMap).j(kSerializer);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public static final <T> T b(@NotNull KSerializer<T> kSerializer, @NotNull l1 handle, @NotNull Map<String, ? extends d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        return (T) new h(handle, typeMap).j(kSerializer);
    }
}
