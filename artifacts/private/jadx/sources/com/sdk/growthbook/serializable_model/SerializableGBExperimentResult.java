package com.sdk.growthbook.serializable_model;

import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.o0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SerializableGBExperimentResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f266438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f266439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final JsonElement f266440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f266441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f266442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f266443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f266444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Float f266445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Boolean f266446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final Boolean f266447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f266448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Boolean f266449l;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SerializableGBExperimentResult> serializer() {
            return SerializableGBExperimentResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializableGBExperimentResult() {
        this(false, 0, (JsonElement) null, (String) null, (String) null, (String) null, (String) null, (Float) null, (Boolean) null, (Boolean) null, (String) null, (Boolean) null, 4095, (DefaultConstructorMarker) null);
    }

    @n
    public static final /* synthetic */ void D(SerializableGBExperimentResult serializableGBExperimentResult, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || serializableGBExperimentResult.f266438a) {
            eVar.encodeBooleanElement(serialDescriptor, 0, serializableGBExperimentResult.f266438a);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || serializableGBExperimentResult.f266439b != 0) {
            eVar.encodeIntElement(serialDescriptor, 1, serializableGBExperimentResult.f266439b);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.areEqual(serializableGBExperimentResult.f266440c, new JsonObject(new HashMap()))) {
            eVar.encodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, serializableGBExperimentResult.f266440c);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || serializableGBExperimentResult.f266441d != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, serializableGBExperimentResult.f266441d);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 4) || serializableGBExperimentResult.f266442e != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 4, b3.f315897a, serializableGBExperimentResult.f266442e);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.areEqual(serializableGBExperimentResult.f266443f, "")) {
            eVar.encodeStringElement(serialDescriptor, 5, serializableGBExperimentResult.f266443f);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 6) || serializableGBExperimentResult.f266444g != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 6, b3.f315897a, serializableGBExperimentResult.f266444g);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 7) || serializableGBExperimentResult.f266445h != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 7, o0.f315985a, serializableGBExperimentResult.f266445h);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 8) || serializableGBExperimentResult.f266446i != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 8, i.f315935a, serializableGBExperimentResult.f266446i);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 9) || serializableGBExperimentResult.f266447j != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 9, i.f315935a, serializableGBExperimentResult.f266447j);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 10) || serializableGBExperimentResult.f266448k != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 10, b3.f315897a, serializableGBExperimentResult.f266448k);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 11) || serializableGBExperimentResult.f266449l != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 11, i.f315935a, serializableGBExperimentResult.f266449l);
        }
    }

    public static /* synthetic */ SerializableGBExperimentResult n(SerializableGBExperimentResult serializableGBExperimentResult, boolean z10, int i10, JsonElement jsonElement, String str, String str2, String str3, String str4, Float f10, Boolean bool, Boolean bool2, String str5, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = serializableGBExperimentResult.f266438a;
        }
        if ((i11 & 2) != 0) {
            i10 = serializableGBExperimentResult.f266439b;
        }
        if ((i11 & 4) != 0) {
            jsonElement = serializableGBExperimentResult.f266440c;
        }
        if ((i11 & 8) != 0) {
            str = serializableGBExperimentResult.f266441d;
        }
        if ((i11 & 16) != 0) {
            str2 = serializableGBExperimentResult.f266442e;
        }
        if ((i11 & 32) != 0) {
            str3 = serializableGBExperimentResult.f266443f;
        }
        if ((i11 & 64) != 0) {
            str4 = serializableGBExperimentResult.f266444g;
        }
        if ((i11 & 128) != 0) {
            f10 = serializableGBExperimentResult.f266445h;
        }
        if ((i11 & 256) != 0) {
            bool = serializableGBExperimentResult.f266446i;
        }
        if ((i11 & 512) != 0) {
            bool2 = serializableGBExperimentResult.f266447j;
        }
        if ((i11 & 1024) != 0) {
            str5 = serializableGBExperimentResult.f266448k;
        }
        if ((i11 & 2048) != 0) {
            bool3 = serializableGBExperimentResult.f266449l;
        }
        String str6 = str5;
        Boolean bool4 = bool3;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        String str7 = str4;
        Float f11 = f10;
        String str8 = str2;
        String str9 = str3;
        return serializableGBExperimentResult.m(z10, i10, jsonElement, str, str8, str9, str7, f11, bool5, bool6, str6, bool4);
    }

    public final void A(@Nullable Float f10) {
        this.f266445h = f10;
    }

    public final void B(@Nullable String str) {
        this.f266444g = str;
    }

    public final void C(@Nullable Boolean bool) {
        this.f266446i = bool;
    }

    public final boolean a() {
        return this.f266438a;
    }

    @Nullable
    public final Boolean b() {
        return this.f266447j;
    }

    @Nullable
    public final String c() {
        return this.f266448k;
    }

    @Nullable
    public final Boolean d() {
        return this.f266449l;
    }

    public final int e() {
        return this.f266439b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableGBExperimentResult)) {
            return false;
        }
        SerializableGBExperimentResult serializableGBExperimentResult = (SerializableGBExperimentResult) obj;
        return this.f266438a == serializableGBExperimentResult.f266438a && this.f266439b == serializableGBExperimentResult.f266439b && Intrinsics.areEqual(this.f266440c, serializableGBExperimentResult.f266440c) && Intrinsics.areEqual(this.f266441d, serializableGBExperimentResult.f266441d) && Intrinsics.areEqual(this.f266442e, serializableGBExperimentResult.f266442e) && Intrinsics.areEqual(this.f266443f, serializableGBExperimentResult.f266443f) && Intrinsics.areEqual(this.f266444g, serializableGBExperimentResult.f266444g) && Intrinsics.areEqual((Object) this.f266445h, (Object) serializableGBExperimentResult.f266445h) && Intrinsics.areEqual(this.f266446i, serializableGBExperimentResult.f266446i) && Intrinsics.areEqual(this.f266447j, serializableGBExperimentResult.f266447j) && Intrinsics.areEqual(this.f266448k, serializableGBExperimentResult.f266448k) && Intrinsics.areEqual(this.f266449l, serializableGBExperimentResult.f266449l);
    }

    @NotNull
    public final JsonElement f() {
        return this.f266440c;
    }

    @Nullable
    public final String g() {
        return this.f266441d;
    }

    @Nullable
    public final String h() {
        return this.f266442e;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f266438a) * 31) + Integer.hashCode(this.f266439b)) * 31) + this.f266440c.hashCode()) * 31;
        String str = this.f266441d;
        int i10 = 6 ^ 0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f266442e;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f266443f.hashCode()) * 31;
        String str3 = this.f266444g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f266445h;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Boolean bool = this.f266446i;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f266447j;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f266448k;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.f266449l;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        return this.f266443f;
    }

    @Nullable
    public final String j() {
        return this.f266444g;
    }

    @Nullable
    public final Float k() {
        return this.f266445h;
    }

    @Nullable
    public final Boolean l() {
        return this.f266446i;
    }

    @NotNull
    public final SerializableGBExperimentResult m(boolean z10, int i10, @NotNull JsonElement value, @Nullable String str, @Nullable String str2, @NotNull String key, @Nullable String str3, @Nullable Float f10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        return new SerializableGBExperimentResult(z10, i10, value, str, str2, key, str3, f10, bool, bool2, str4, bool3);
    }

    @Nullable
    public final Float o() {
        return this.f266445h;
    }

    @Nullable
    public final String p() {
        return this.f266448k;
    }

    @Nullable
    public final String q() {
        return this.f266441d;
    }

    @Nullable
    public final Boolean r() {
        return this.f266447j;
    }

    @Nullable
    public final String s() {
        return this.f266442e;
    }

    public final boolean t() {
        return this.f266438a;
    }

    @NotNull
    public String toString() {
        return "SerializableGBExperimentResult(inExperiment=" + this.f266438a + ", variationId=" + this.f266439b + ", value=" + this.f266440c + ", hashAttribute=" + this.f266441d + ", hashValue=" + this.f266442e + ", key=" + this.f266443f + ", name=" + this.f266444g + ", bucket=" + this.f266445h + ", passthrough=" + this.f266446i + ", hashUsed=" + this.f266447j + ", featureId=" + this.f266448k + ", stickyBucketUsed=" + this.f266449l + ")";
    }

    @NotNull
    public final String u() {
        return this.f266443f;
    }

    @Nullable
    public final String v() {
        return this.f266444g;
    }

    @Nullable
    public final Boolean w() {
        return this.f266446i;
    }

    @Nullable
    public final Boolean x() {
        return this.f266449l;
    }

    @NotNull
    public final JsonElement y() {
        return this.f266440c;
    }

    public final int z() {
        return this.f266439b;
    }

    public /* synthetic */ SerializableGBExperimentResult(int i10, boolean z10, int i11, JsonElement jsonElement, String str, String str2, String str3, String str4, Float f10, Boolean bool, Boolean bool2, String str5, Boolean bool3, v2 v2Var) {
        if ((i10 & 1) == 0) {
            this.f266438a = false;
        } else {
            this.f266438a = z10;
        }
        if ((i10 & 2) == 0) {
            this.f266439b = 0;
        } else {
            this.f266439b = i11;
        }
        if ((i10 & 4) == 0) {
            this.f266440c = new JsonObject(new HashMap());
        } else {
            this.f266440c = jsonElement;
        }
        if ((i10 & 8) == 0) {
            this.f266441d = null;
        } else {
            this.f266441d = str;
        }
        if ((i10 & 16) == 0) {
            this.f266442e = null;
        } else {
            this.f266442e = str2;
        }
        if ((i10 & 32) == 0) {
            this.f266443f = "";
        } else {
            this.f266443f = str3;
        }
        if ((i10 & 64) == 0) {
            this.f266444g = null;
        } else {
            this.f266444g = str4;
        }
        if ((i10 & 128) == 0) {
            this.f266445h = null;
        } else {
            this.f266445h = f10;
        }
        if ((i10 & 256) == 0) {
            this.f266446i = null;
        } else {
            this.f266446i = bool;
        }
        if ((i10 & 512) == 0) {
            this.f266447j = null;
        } else {
            this.f266447j = bool2;
        }
        if ((i10 & 1024) == 0) {
            this.f266448k = null;
        } else {
            this.f266448k = str5;
        }
        if ((i10 & 2048) == 0) {
            this.f266449l = null;
        } else {
            this.f266449l = bool3;
        }
    }

    public SerializableGBExperimentResult(boolean z10, int i10, @NotNull JsonElement value, @Nullable String str, @Nullable String str2, @NotNull String key, @Nullable String str3, @Nullable Float f10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f266438a = z10;
        this.f266439b = i10;
        this.f266440c = value;
        this.f266441d = str;
        this.f266442e = str2;
        this.f266443f = key;
        this.f266444g = str3;
        this.f266445h = f10;
        this.f266446i = bool;
        this.f266447j = bool2;
        this.f266448k = str4;
        this.f266449l = bool3;
    }

    public /* synthetic */ SerializableGBExperimentResult(boolean z10, int i10, JsonElement jsonElement, String str, String str2, String str3, String str4, Float f10, Boolean bool, Boolean bool2, String str5, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? new JsonObject(new HashMap()) : jsonElement, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : f10, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2, (i11 & 1024) != 0 ? null : str5, (i11 & 2048) != 0 ? null : bool3);
    }
}
