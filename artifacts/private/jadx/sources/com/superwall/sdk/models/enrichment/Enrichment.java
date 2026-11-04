package com.superwall.sdk.models.enrichment;

import com.superwall.sdk.storage.core_data.ConvertersKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Enrichment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonObject device;

    @NotNull
    private final JsonObject user;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Enrichment> serializer() {
            return Enrichment$$serializer.INSTANCE;
        }

        @NotNull
        public final Enrichment stub() {
            return new Enrichment(new JsonObject(MapsKt.emptyMap()), new JsonObject(MapsKt.mapOf(TuplesKt.to("demandTier", ConvertersKt.convertToJsonElement("silver")))));
        }

        private Companion() {
        }
    }

    public /* synthetic */ Enrichment(int i10, JsonObject jsonObject, JsonObject jsonObject2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, Enrichment$$serializer.INSTANCE.getDescriptor());
        }
        this.user = jsonObject;
        this.device = jsonObject2;
    }

    public static /* synthetic */ Enrichment copy$default(Enrichment enrichment, JsonObject jsonObject, JsonObject jsonObject2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jsonObject = enrichment.user;
        }
        if ((i10 & 2) != 0) {
            jsonObject2 = enrichment.device;
        }
        return enrichment.copy(jsonObject, jsonObject2);
    }

    @a0("device")
    public static /* synthetic */ void getDevice$annotations() {
    }

    @a0("user")
    public static /* synthetic */ void getUser$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Enrichment enrichment, e eVar, SerialDescriptor serialDescriptor) {
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        eVar.encodeSerializableElement(serialDescriptor, 0, jsonObjectSerializer, enrichment.user);
        eVar.encodeSerializableElement(serialDescriptor, 1, jsonObjectSerializer, enrichment.device);
    }

    @NotNull
    public final JsonObject component1() {
        return this.user;
    }

    @NotNull
    public final JsonObject component2() {
        return this.device;
    }

    @NotNull
    public final Enrichment copy(@NotNull JsonObject user, @NotNull JsonObject device) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(device, "device");
        return new Enrichment(user, device);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Enrichment)) {
            return false;
        }
        Enrichment enrichment = (Enrichment) obj;
        return Intrinsics.areEqual(this.user, enrichment.user) && Intrinsics.areEqual(this.device, enrichment.device);
    }

    @NotNull
    public final JsonObject getDevice() {
        return this.device;
    }

    @NotNull
    public final JsonObject getUser() {
        return this.user;
    }

    public int hashCode() {
        return (this.user.hashCode() * 31) + this.device.hashCode();
    }

    @NotNull
    public String toString() {
        return "Enrichment(user=" + this.user + ", device=" + this.device + ")";
    }

    public Enrichment(@NotNull JsonObject user, @NotNull JsonObject device) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(device, "device");
        this.user = user;
        this.device = device;
    }
}
