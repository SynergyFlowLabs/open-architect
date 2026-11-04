package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class y0<K, V> extends z0<K, V> implements Iterator<Map.Entry<K, V>>, qj.d {

    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n360#2,4:417\n1#3:421\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n378#1:417,4\n378#1:421\n*E\n"})
    public static final class a implements Map.Entry<K, V>, qj.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f36625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f36626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0<K, V> f36627c;

        a(y0<K, V> y0Var) {
            this.f36627c = y0Var;
            Map.Entry<K, V> entryE = y0Var.e();
            Intrinsics.checkNotNull(entryE);
            this.f36625a = entryE.getKey();
            Map.Entry<K, V> entryE2 = y0Var.e();
            Intrinsics.checkNotNull(entryE2);
            this.f36626b = entryE2.getValue();
        }

        public void a(V v10) {
            this.f36626b = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f36625a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f36626b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            y0<K, V> y0Var = this.f36627c;
            if (y0Var.g().j() != ((z0) y0Var).f36632c) {
                throw new ConcurrentModificationException();
            }
            V v11 = (V) getValue();
            y0Var.g().put(getKey(), v10);
            a(v10);
            return v11;
        }
    }

    public y0(@NotNull l0<K, V> l0Var, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(l0Var, it);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        d();
        if (e() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
