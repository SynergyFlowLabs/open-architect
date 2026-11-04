package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f49871a;

        public a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f49871a = name;
        }

        @NotNull
        public final String a() {
            return this.f49871a;
        }

        @NotNull
        public final b<T> b(T t10) {
            return new b<>(this, t10);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                return Intrinsics.areEqual(this.f49871a, ((a) obj).f49871a);
            }
            return false;
        }

        public int hashCode() {
            return this.f49871a.hashCode();
        }

        @NotNull
        public String toString() {
            return this.f49871a;
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a<T> f49872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f49873b;

        public b(@NotNull a<T> key, T t10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f49872a = key;
            this.f49873b = t10;
        }

        @NotNull
        public final a<T> a() {
            return this.f49872a;
        }

        public final T b() {
            return this.f49873b;
        }
    }

    @NotNull
    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(@NotNull a<T> aVar);

    @Nullable
    public abstract <T> T c(@NotNull a<T> aVar);

    @NotNull
    public final c d() {
        return new c(MapsKt.toMutableMap(a()), false);
    }

    @NotNull
    public final f e() {
        return new c(MapsKt.toMutableMap(a()), true);
    }
}
