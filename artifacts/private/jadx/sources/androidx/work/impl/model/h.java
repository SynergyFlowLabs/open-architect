package androidx.work.impl.model;

import androidx.work.l0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    @NotNull
    public static final kotlinx.coroutines.flow.i<List<l0>> a(@NotNull g gVar, @NotNull n0 dispatcher, @NotNull w3.g query) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(query, "query");
        return x.a(gVar.b(query), dispatcher);
    }
}
