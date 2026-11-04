package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nUnlimitedCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n168#2,3:55\n*S KotlinDebug\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedStorage\n*L\n48#1:55,3\n*E\n"})
public final class s implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.util.collections.d<Url, Set<c>> f294659b = new io.ktor.util.collections.d<>(0, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set f() {
        return io.ktor.util.collections.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set g() {
        return io.ktor.util.collections.f.a();
    }

    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object a(@NotNull Url url, @NotNull c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Set<c> setC = this.f294659b.c(url, new Function0() { // from class: io.ktor.client.plugins.cache.storage.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.g();
            }
        });
        if (!setC.add(cVar)) {
            setC.remove(cVar);
            setC.add(cVar);
        }
        return Unit.f312394a;
    }

    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object b(@NotNull Url url, @NotNull Map<String, String> map, @NotNull kotlin.coroutines.d<? super c> dVar) {
        for (Object obj : this.f294659b.c(url, new Function0() { // from class: io.ktor.client.plugins.cache.storage.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.f();
            }
        })) {
            c cVar = (c) obj;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<String, String> next = it.next();
                        String key = next.getKey();
                        if (!Intrinsics.areEqual(cVar.i().get(key), next.getValue())) {
                        }
                    }
                }
            }
            if (map.size() == cVar.i().size()) {
                return obj;
            }
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.b
    @Nullable
    public Object c(@NotNull Url url, @NotNull kotlin.coroutines.d<? super Set<c>> dVar) {
        Set<c> set = this.f294659b.get(url);
        return set == null ? SetsKt.emptySet() : set;
    }
}
