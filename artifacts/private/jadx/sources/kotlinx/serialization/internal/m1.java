package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class m1<K, V> extends c1<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315971c;

    private static final class a<K, V> implements Map.Entry<K, V>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f315972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f315973b;

        public a(K k10, V v10) {
            this.f315972a = k10;
            this.f315973b = v10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, Object obj, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                obj = aVar.f315972a;
            }
            if ((i10 & 2) != 0) {
                obj2 = aVar.f315973b;
            }
            return aVar.c(obj, obj2);
        }

        public final K a() {
            return this.f315972a;
        }

        public final V b() {
            return this.f315973b;
        }

        @NotNull
        public final a<K, V> c(K k10, V v10) {
            return new a<>(k10, v10);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f315972a, aVar.f315972a) && Intrinsics.areEqual(this.f315973b, aVar.f315973b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f315972a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f315973b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f315972a;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f315973b;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @NotNull
        public String toString() {
            return "MapEntry(key=" + this.f315972a + ", value=" + this.f315973b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(@NotNull final KSerializer<K> keySerializer, @NotNull final KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f315971c = kotlinx.serialization.descriptors.k.h("kotlin.collections.Map.Entry", kotlinx.serialization.descriptors.m.c.f315863a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m1.h(keySerializer, valueSerializer, (kotlinx.serialization.descriptors.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(KSerializer kSerializer, KSerializer kSerializer2, kotlinx.serialization.descriptors.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "key", kSerializer.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "value", kSerializer2.getDescriptor(), null, false, 12, null);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f315971c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.c1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public K b(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.c1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public V d(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.c1
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> f(K k10, V v10) {
        return new a(k10, v10);
    }
}
