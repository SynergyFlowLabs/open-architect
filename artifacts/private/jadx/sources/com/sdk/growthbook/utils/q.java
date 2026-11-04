package com.sdk.growthbook.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class q<T> implements KSerializer<p<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f266513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f266514b;

    public q(@NotNull KSerializer<T> valueSerializer) {
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f266513a = valueSerializer;
        this.f266514b = valueSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p<T> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new p.b(this.f266513a.deserialize(decoder));
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void serialize(@NotNull Encoder encoder, @NotNull p<? extends T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, p.a.f266511a)) {
            throw new c0("Tried to serialize an optional property that had no value present. Is encodeDefaults false?");
        }
        if (!(value instanceof p.b)) {
            throw new k0();
        }
        this.f266513a.serialize(encoder, (T) ((p.b) value).d());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.f266514b;
    }
}
