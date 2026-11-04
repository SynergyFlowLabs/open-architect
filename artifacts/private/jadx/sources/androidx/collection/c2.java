package androidx.collection;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class c2<K, V> implements Map.Entry<K, V>, qj.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object[] f12167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f12168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12169c;

    public c2(@NotNull Object[] keys, @NotNull Object[] values, int i10) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f12167a = keys;
        this.f12168b = values;
        this.f12169c = i10;
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public final int a() {
        return this.f12169c;
    }

    @NotNull
    public final Object[] c() {
        return this.f12167a;
    }

    @NotNull
    public final Object[] e() {
        return this.f12168b;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.f12167a[this.f12169c];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.f12168b[this.f12169c];
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        Object[] objArr = this.f12168b;
        int i10 = this.f12169c;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }
}
