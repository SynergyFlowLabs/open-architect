package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f294541a = a.f294542a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f294542a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Function0<b> f294543b = new Function0() { // from class: io.ktor.client.plugins.cache.storage.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.a.b();
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final b f294544c = f.f294575b;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s b() {
            return new s();
        }

        @NotNull
        public final b c() {
            return f294544c;
        }

        @NotNull
        public final Function0<b> d() {
            return f294543b;
        }
    }

    @Nullable
    Object a(@NotNull Url url, @NotNull c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object b(@NotNull Url url, @NotNull Map<String, String> map, @NotNull kotlin.coroutines.d<? super c> dVar);

    @Nullable
    Object c(@NotNull Url url, @NotNull kotlin.coroutines.d<? super Set<c>> dVar);
}
