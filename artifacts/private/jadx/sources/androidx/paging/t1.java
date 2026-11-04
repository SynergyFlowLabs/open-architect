package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 {
    @kotlin.l(message = "DataSource is deprecated and has been replaced by PagingSource")
    public static final /* synthetic */ q1 a(u dataSource, q1.e config, Executor notifyExecutor, Executor fetchExecutor, q1.a aVar, Object obj) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(notifyExecutor, "notifyExecutor");
        Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
        return new q1.b(dataSource, config).i(notifyExecutor).f(fetchExecutor).c(aVar).g(obj).a();
    }

    public static /* synthetic */ q1 b(u uVar, q1.e eVar, Executor executor, Executor executor2, q1.a aVar, Object obj, int i10, Object obj2) {
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        if ((i10 & 32) != 0) {
            obj = null;
        }
        return a(uVar, eVar, executor, executor2, aVar, obj);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final <Key> h2.a<Key> c(@NotNull q1.e eVar, @Nullable Key key) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new h2.a.d(key, eVar.f72469d, eVar.f72468c);
    }
}
