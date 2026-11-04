package ji;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f307451a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull Map<String, ? extends List<String>> mapping) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        this.f307451a = mapping;
    }

    public final boolean a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f307451a.containsKey(key);
    }

    @Nullable
    public final String b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List<String> list = this.f307451a.get(key);
        if (list != null) {
            return (String) CollectionsKt.firstOrNull((List) list);
        }
        return null;
    }

    @NotNull
    public final List<String> c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List<String> list = this.f307451a.get(key);
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
