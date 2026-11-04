package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(level = kotlin.n.ERROR, message = "Use new [CacheStorage] instead.")
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f294638a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function0<l> f294639b = new Function0() { // from class: io.ktor.client.plugins.cache.storage.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.b();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final l f294640c = e.f294574d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final l a() {
            return l.f294640c;
        }

        @NotNull
        public final Function0<l> b() {
            return l.f294639b;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p b() {
        return new p();
    }

    @Nullable
    public abstract io.ktor.client.plugins.cache.c e(@NotNull Url url, @NotNull Map<String, String> map);

    @NotNull
    public abstract Set<io.ktor.client.plugins.cache.c> f(@NotNull Url url);

    public abstract void g(@NotNull Url url, @NotNull io.ktor.client.plugins.cache.c cVar);
}
