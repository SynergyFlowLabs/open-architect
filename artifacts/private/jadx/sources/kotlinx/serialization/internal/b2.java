package kotlinx.serialization.internal;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class b2<K, V> extends c1<K, V, Pair<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(@NotNull final KSerializer<K> keySerializer, @NotNull final KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f315896c = kotlinx.serialization.descriptors.k.e("kotlin.Pair", new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b2.h(keySerializer, valueSerializer, (kotlinx.serialization.descriptors.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(KSerializer kSerializer, KSerializer kSerializer2, kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        int i10 = 1 << 0;
        kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "first", kSerializer.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f315896c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.c1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public K b(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.c1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public V d(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.c1
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> f(K k10, V v10) {
        return TuplesKt.to(k10, v10);
    }
}
