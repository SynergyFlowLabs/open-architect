package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class a<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35716d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f35717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f35718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Object f35719c;

    public a(V v10, @Nullable Object obj, @Nullable Object obj2) {
        this.f35717a = v10;
        this.f35718b = obj;
        this.f35719c = obj2;
    }

    public final boolean a() {
        return this.f35719c != i0.c.f286699a;
    }

    public final boolean b() {
        return this.f35718b != i0.c.f286699a;
    }

    @Nullable
    public final Object c() {
        return this.f35719c;
    }

    @Nullable
    public final Object d() {
        return this.f35718b;
    }

    public final V e() {
        return this.f35717a;
    }

    @NotNull
    public final a<V> f(@Nullable Object obj) {
        return new a<>(this.f35717a, this.f35718b, obj);
    }

    @NotNull
    public final a<V> g(@Nullable Object obj) {
        return new a<>(this.f35717a, obj, this.f35719c);
    }

    @NotNull
    public final a<V> h(V v10) {
        return new a<>(v10, this.f35718b, this.f35719c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(V v10) {
        i0.c cVar = i0.c.f286699a;
        this(v10, cVar, cVar);
    }

    public a(V v10, @Nullable Object obj) {
        this(v10, obj, i0.c.f286699a);
    }
}
