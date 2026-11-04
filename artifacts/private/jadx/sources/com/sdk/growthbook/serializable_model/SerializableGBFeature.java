package com.sdk.growthbook.serializable_model;

import com.sdk.growthbook.serializable_model.SerializableGBFeature;
import java.util.List;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SerializableGBFeature {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f
    @NotNull
    private static final f0<KSerializer<Object>>[] f266450c = {null, g0.b(j0.PUBLICATION, new Function0() { // from class: qf.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SerializableGBFeature.b();
        }
    })};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JsonElement f266451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<SerializableGBFeatureRule> f266452b;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SerializableGBFeature> serializer() {
            return SerializableGBFeature$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SerializableGBFeature() {
        this((JsonElement) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        int i10 = 1 >> 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new kotlinx.serialization.internal.f(SerializableGBFeatureRule$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableGBFeature g(SerializableGBFeature serializableGBFeature, JsonElement jsonElement, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jsonElement = serializableGBFeature.f266451a;
        }
        if ((i10 & 2) != 0) {
            list = serializableGBFeature.f266452b;
        }
        return serializableGBFeature.f(jsonElement, list);
    }

    @n
    public static final /* synthetic */ void j(SerializableGBFeature serializableGBFeature, e eVar, SerialDescriptor serialDescriptor) {
        f0<KSerializer<Object>>[] f0VarArr = f266450c;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || serializableGBFeature.f266451a != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 0, JsonElementSerializer.INSTANCE, serializableGBFeature.f266451a);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && serializableGBFeature.f266452b == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, f0VarArr[1].getValue(), serializableGBFeature.f266452b);
    }

    @Nullable
    public final JsonElement d() {
        return this.f266451a;
    }

    @Nullable
    public final List<SerializableGBFeatureRule> e() {
        return this.f266452b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableGBFeature)) {
            return false;
        }
        SerializableGBFeature serializableGBFeature = (SerializableGBFeature) obj;
        return Intrinsics.areEqual(this.f266451a, serializableGBFeature.f266451a) && Intrinsics.areEqual(this.f266452b, serializableGBFeature.f266452b);
    }

    @NotNull
    public final SerializableGBFeature f(@Nullable JsonElement jsonElement, @Nullable List<SerializableGBFeatureRule> list) {
        return new SerializableGBFeature(jsonElement, list);
    }

    @Nullable
    public final JsonElement h() {
        return this.f266451a;
    }

    public int hashCode() {
        JsonElement jsonElement = this.f266451a;
        int iHashCode = (jsonElement == null ? 0 : jsonElement.hashCode()) * 31;
        List<SerializableGBFeatureRule> list = this.f266452b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final List<SerializableGBFeatureRule> i() {
        return this.f266452b;
    }

    @NotNull
    public String toString() {
        return "SerializableGBFeature(defaultValue=" + this.f266451a + ", rules=" + this.f266452b + ")";
    }

    public /* synthetic */ SerializableGBFeature(int i10, JsonElement jsonElement, List list, v2 v2Var) {
        if ((i10 & 1) == 0) {
            this.f266451a = null;
        } else {
            this.f266451a = jsonElement;
        }
        if ((i10 & 2) == 0) {
            this.f266452b = null;
        } else {
            this.f266452b = list;
        }
    }

    public SerializableGBFeature(@Nullable JsonElement jsonElement, @Nullable List<SerializableGBFeatureRule> list) {
        this.f266451a = jsonElement;
        this.f266452b = list;
    }

    public /* synthetic */ SerializableGBFeature(JsonElement jsonElement, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : jsonElement, (i10 & 2) != 0 ? null : list);
    }
}
