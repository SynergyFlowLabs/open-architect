package com.superwall.sdk.store.abstractions.transactions;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = StoreTransactionState.class)
public final class StoreTransactionStateSerializer implements KSerializer<StoreTransactionState> {

    @NotNull
    public static final StoreTransactionStateSerializer INSTANCE = new StoreTransactionStateSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = new PluginGeneratedSerialDescriptor("com.superwall.sdk.store.abstractions.transactions.StoreTransactionState", null, 0);

    private StoreTransactionStateSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlinx.serialization.e
    @NotNull
    public StoreTransactionState deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        switch (strDecodeString.hashCode()) {
            case -1791517821:
                if (strDecodeString.equals("purchased")) {
                    return StoreTransactionState.Purchased.INSTANCE;
                }
                break;
            case -1281977283:
                if (strDecodeString.equals(MetricTracker.Action.FAILED)) {
                    return StoreTransactionState.Failed.INSTANCE;
                }
                break;
            case -336625770:
                if (strDecodeString.equals("restored")) {
                    return StoreTransactionState.Restored.INSTANCE;
                }
                break;
            case 297526654:
                if (strDecodeString.equals("purchasing")) {
                    return StoreTransactionState.Purchasing.INSTANCE;
                }
                break;
            case 647890911:
                if (strDecodeString.equals("deferred")) {
                    return StoreTransactionState.Deferred.INSTANCE;
                }
                break;
        }
        throw new c0("Unknown string value: " + strDecodeString);
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull StoreTransactionState value) {
        String str;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof StoreTransactionState.Purchasing) {
            str = "purchasing";
        } else if (value instanceof StoreTransactionState.Purchased) {
            str = "purchased";
        } else if (value instanceof StoreTransactionState.Failed) {
            str = MetricTracker.Action.FAILED;
        } else if (value instanceof StoreTransactionState.Restored) {
            str = "restored";
        } else {
            if (!(value instanceof StoreTransactionState.Deferred)) {
                throw new k0();
            }
            str = "deferred";
        }
        encoder.encodeString(str);
    }
}
