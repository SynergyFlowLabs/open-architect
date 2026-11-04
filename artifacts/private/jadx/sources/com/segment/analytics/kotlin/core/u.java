package com.segment.analytics.kotlin.core;

import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface u {

    public static final class a {
        @kotlin.l(message = "Deprecated in favor of create which takes vararg params", replaceWith = @b1(expression = "createStorage(analytics, store, writeKey, ioDispatcher, application)", imports = {}))
        @NotNull
        public static s a(@NotNull u uVar, @NotNull com.segment.analytics.kotlin.core.a analytics, @NotNull sovran.kotlin.e store, @NotNull String writeKey, @NotNull n0 ioDispatcher, @NotNull Object application) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(writeKey, "writeKey");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            Intrinsics.checkNotNullParameter(application, "application");
            return uVar.b(analytics, store, writeKey, ioDispatcher, application);
        }
    }

    @kotlin.l(message = "Deprecated in favor of create which takes vararg params", replaceWith = @b1(expression = "createStorage(analytics, store, writeKey, ioDispatcher, application)", imports = {}))
    @NotNull
    s a(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull sovran.kotlin.e eVar, @NotNull String str, @NotNull n0 n0Var, @NotNull Object obj);

    @NotNull
    s b(@NotNull Object... objArr);
}
