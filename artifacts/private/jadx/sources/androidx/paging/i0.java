package androidx.paging;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i0<K, V> extends o1<K, V> {
    @Override // androidx.paging.o1
    public void C(@NotNull o1.d<K> params, @NotNull o1.a<K, V> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.a(CollectionsKt.emptyList(), null);
    }

    @Override // androidx.paging.o1
    public void E(@NotNull o1.d<K> params, @NotNull o1.a<K, V> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.a(CollectionsKt.emptyList(), null);
    }

    @Override // androidx.paging.o1
    public void G(@NotNull o1.c<K> params, @NotNull o1.b<K, V> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i10 = 6 ^ 0;
        callback.a(CollectionsKt.emptyList(), 0, 0, null, null);
    }
}
