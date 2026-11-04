package androidx.room.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    default void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
    }
}
