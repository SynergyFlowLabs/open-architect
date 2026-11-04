package com.sdk.growthbook.serializable_model;

import com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel;
import java.util.Map;
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
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SerializableFeaturesDataModel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f
    @NotNull
    private static final f0<KSerializer<Object>>[] f266411e = {g0.b(j0.PUBLICATION, new Function0() { // from class: qf.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SerializableFeaturesDataModel.b();
        }
    }), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Map<String, SerializableGBFeature> f266412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f266413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JsonObject f266414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f266415d;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SerializableFeaturesDataModel> serializer() {
            return SerializableFeaturesDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializableFeaturesDataModel() {
        this((Map) null, (String) null, (JsonObject) null, (String) null, 15, (DefaultConstructorMarker) null);
        boolean z10 = false | false;
        boolean z11 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new e1(b3.f315897a, SerializableGBFeature$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableFeaturesDataModel i(SerializableFeaturesDataModel serializableFeaturesDataModel, Map map, String str, JsonObject jsonObject, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = serializableFeaturesDataModel.f266412a;
        }
        if ((i10 & 2) != 0) {
            str = serializableFeaturesDataModel.f266413b;
        }
        if ((i10 & 4) != 0) {
            jsonObject = serializableFeaturesDataModel.f266414c;
        }
        if ((i10 & 8) != 0) {
            str2 = serializableFeaturesDataModel.f266415d;
        }
        return serializableFeaturesDataModel.h(map, str, jsonObject, str2);
    }

    @n
    public static final /* synthetic */ void n(SerializableFeaturesDataModel serializableFeaturesDataModel, e eVar, SerialDescriptor serialDescriptor) {
        f0<KSerializer<Object>>[] f0VarArr = f266411e;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || serializableFeaturesDataModel.f266412a != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 0, f0VarArr[0].getValue(), serializableFeaturesDataModel.f266412a);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || serializableFeaturesDataModel.f266413b != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, serializableFeaturesDataModel.f266413b);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || serializableFeaturesDataModel.f266414c != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, serializableFeaturesDataModel.f266414c);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 3) && serializableFeaturesDataModel.f266415d == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, serializableFeaturesDataModel.f266415d);
    }

    @Nullable
    public final Map<String, SerializableGBFeature> d() {
        return this.f266412a;
    }

    @Nullable
    public final String e() {
        return this.f266413b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableFeaturesDataModel)) {
            return false;
        }
        SerializableFeaturesDataModel serializableFeaturesDataModel = (SerializableFeaturesDataModel) obj;
        return Intrinsics.areEqual(this.f266412a, serializableFeaturesDataModel.f266412a) && Intrinsics.areEqual(this.f266413b, serializableFeaturesDataModel.f266413b) && Intrinsics.areEqual(this.f266414c, serializableFeaturesDataModel.f266414c) && Intrinsics.areEqual(this.f266415d, serializableFeaturesDataModel.f266415d);
    }

    @Nullable
    public final JsonObject f() {
        return this.f266414c;
    }

    @Nullable
    public final String g() {
        return this.f266415d;
    }

    @NotNull
    public final SerializableFeaturesDataModel h(@Nullable Map<String, SerializableGBFeature> map, @Nullable String str, @Nullable JsonObject jsonObject, @Nullable String str2) {
        return new SerializableFeaturesDataModel(map, str, jsonObject, str2);
    }

    public int hashCode() {
        Map<String, SerializableGBFeature> map = this.f266412a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f266413b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonObject jsonObject = this.f266414c;
        int iHashCode3 = (iHashCode2 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        String str2 = this.f266415d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Nullable
    public final String j() {
        return this.f266413b;
    }

    @Nullable
    public final String k() {
        return this.f266415d;
    }

    @Nullable
    public final Map<String, SerializableGBFeature> l() {
        return this.f266412a;
    }

    @Nullable
    public final JsonObject m() {
        return this.f266414c;
    }

    @NotNull
    public String toString() {
        return "SerializableFeaturesDataModel(features=" + this.f266412a + ", encryptedFeatures=" + this.f266413b + ", savedGroups=" + this.f266414c + ", encryptedSavedGroups=" + this.f266415d + ")";
    }

    public /* synthetic */ SerializableFeaturesDataModel(int i10, Map map, String str, JsonObject jsonObject, String str2, v2 v2Var) {
        if ((i10 & 1) == 0) {
            this.f266412a = null;
        } else {
            this.f266412a = map;
        }
        if ((i10 & 2) == 0) {
            this.f266413b = null;
        } else {
            this.f266413b = str;
        }
        if ((i10 & 4) == 0) {
            this.f266414c = null;
        } else {
            this.f266414c = jsonObject;
        }
        if ((i10 & 8) == 0) {
            this.f266415d = null;
        } else {
            this.f266415d = str2;
        }
    }

    public SerializableFeaturesDataModel(@Nullable Map<String, SerializableGBFeature> map, @Nullable String str, @Nullable JsonObject jsonObject, @Nullable String str2) {
        this.f266412a = map;
        this.f266413b = str;
        this.f266414c = jsonObject;
        this.f266415d = str2;
    }

    public /* synthetic */ SerializableFeaturesDataModel(Map map, String str, JsonObject jsonObject, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : jsonObject, (i10 & 8) != 0 ? null : str2);
    }
}
