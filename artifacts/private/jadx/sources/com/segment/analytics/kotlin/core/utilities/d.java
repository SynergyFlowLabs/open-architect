package com.segment.analytics.kotlin.core.utilities;

import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.segment.analytics.kotlin.core.u;
import java.io.File;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f266984a = new d();

    private d() {
    }

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
                File file = new File("/tmp/analytics-kotlin/" + fVarU.H());
                File file2 = new File(file, EventEntry.tableName);
                return new s(new q(new File(file, "analytics-kotlin-" + fVarU.H() + ".properties")), new j(file2), aVar.a(), fVarU.H(), "segment.events.file.index." + fVarU.H(), aVar.e());
            }
        }
        throw new IllegalArgumentException("Invalid parameters for ConcreteStorageProvider. ConcreteStorageProvider requires at least 1 parameter and the first argument has to be an instance of Analytics");
    }
}
