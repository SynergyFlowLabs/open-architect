package com.segment.analytics.kotlin.core.utilities;

import com.segment.analytics.kotlin.core.u;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements u {
    @Override // com.segment.analytics.kotlin.core.u
    @kotlin.l(message = "Deprecated in favor of create which takes vararg params", replaceWith = @b1(expression = "createStorage(analytics, store, writeKey, ioDispatcher, application)", imports = {}))
    @NotNull
    public com.segment.analytics.kotlin.core.s a(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull sovran.kotlin.e eVar, @NotNull String str, @NotNull n0 n0Var, @NotNull Object obj) {
        return u.a.a(this, aVar, eVar, str, n0Var, obj);
    }

    @Override // com.segment.analytics.kotlin.core.u
    @NotNull
    public com.segment.analytics.kotlin.core.s b(@NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.length != 0) {
            Object obj = params[0];
            if (obj instanceof com.segment.analytics.kotlin.core.a) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.Analytics");
                com.segment.analytics.kotlin.core.a aVar = (com.segment.analytics.kotlin.core.a) obj;
                com.segment.analytics.kotlin.core.f fVarU = aVar.u();
                return new s(new m(), new l(), aVar.a(), fVarU.H(), "segment.events.file.index." + fVarU.H(), aVar.e());
            }
        }
        throw new IllegalArgumentException("Invalid parameters for InMemoryStorageProvider. InMemoryStorageProvider requires at least 1 parameter and the first argument has to be an instance of Analytics");
    }
}
