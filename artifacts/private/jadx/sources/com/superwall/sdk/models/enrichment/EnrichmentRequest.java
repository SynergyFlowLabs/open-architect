package com.superwall.sdk.models.enrichment;

import hk.a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class EnrichmentRequest {

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<String, JsonElement> device;

    @NotNull
    private final Map<String, JsonElement> user;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<EnrichmentRequest> serializer() {
            return EnrichmentRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b3 b3Var = b3.f315897a;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new e1(b3Var, a.v(jsonElementSerializer)), new e1(b3Var, jsonElementSerializer)};
    }

    public /* synthetic */ EnrichmentRequest(int i10, Map map, Map map2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, EnrichmentRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.user = map;
        this.device = map2;
    }

    @a0("device")
    public static /* synthetic */ void getDevice$annotations() {
    }

    @a0("user")
    public static /* synthetic */ void getUser$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(EnrichmentRequest enrichmentRequest, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], enrichmentRequest.user);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], enrichmentRequest.device);
    }

    @NotNull
    public final Map<String, JsonElement> getDevice() {
        return this.device;
    }

    @NotNull
    public final Map<String, JsonElement> getUser() {
        return this.user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnrichmentRequest(@NotNull Map<String, ? extends JsonElement> user, @NotNull Map<String, ? extends JsonElement> device) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(device, "device");
        this.user = user;
        this.device = device;
    }
}
