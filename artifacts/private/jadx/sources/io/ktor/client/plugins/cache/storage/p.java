package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nUnlimitedCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n168#2,3:55\n*S KotlinDebug\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage\n*L\n26#1:55,3\n*E\n"})
public final class p extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.collections.d<Url, Set<io.ktor.client.plugins.cache.c>> f294658d = new io.ktor.util.collections.d<>(0, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set j() {
        return io.ktor.util.collections.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k() {
        return io.ktor.util.collections.f.a();
    }

    @Override // io.ktor.client.plugins.cache.storage.l
    @Nullable
    public io.ktor.client.plugins.cache.c e(@NotNull Url url, @NotNull Map<String, String> varyKeys) {
        Object next;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(varyKeys, "varyKeys");
        Iterator<T> it = this.f294658d.c(url, new Function0() { // from class: io.ktor.client.plugins.cache.storage.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.j();
            }
        }).iterator();
        while (it.hasNext()) {
            next = it.next();
            io.ktor.client.plugins.cache.c cVar = (io.ktor.client.plugins.cache.c) next;
            if (!varyKeys.isEmpty()) {
                Iterator<Map.Entry<String, String>> it2 = varyKeys.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry<String, String> next2 = it2.next();
                        String key = next2.getKey();
                        if (!Intrinsics.areEqual(cVar.e().get(key), next2.getValue())) {
                        }
                    }
                }
            }
            if (varyKeys.size() == cVar.e().size()) {
                return (io.ktor.client.plugins.cache.c) next;
            }
        }
        next = null;
        return (io.ktor.client.plugins.cache.c) next;
    }

    @Override // io.ktor.client.plugins.cache.storage.l
    @NotNull
    public Set<io.ktor.client.plugins.cache.c> f(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Set<io.ktor.client.plugins.cache.c> setEmptySet = this.f294658d.get(url);
        if (setEmptySet == null) {
            setEmptySet = SetsKt.emptySet();
        }
        return setEmptySet;
    }

    @Override // io.ktor.client.plugins.cache.storage.l
    public void g(@NotNull Url url, @NotNull io.ktor.client.plugins.cache.c value) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(value, "value");
        Set<io.ktor.client.plugins.cache.c> setC = this.f294658d.c(url, new Function0() { // from class: io.ktor.client.plugins.cache.storage.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.k();
            }
        });
        if (!setC.add(value)) {
            setC.remove(value);
            setC.add(value);
        }
    }
}
