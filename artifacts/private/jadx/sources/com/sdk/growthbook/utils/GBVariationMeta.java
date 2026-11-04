package com.sdk.growthbook.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class GBVariationMeta {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f266491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f266492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Boolean f266493c;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<GBVariationMeta> serializer() {
            return GBVariationMeta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GBVariationMeta() {
        this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GBVariationMeta e(GBVariationMeta gBVariationMeta, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gBVariationMeta.f266491a;
        }
        if ((i10 & 2) != 0) {
            str2 = gBVariationMeta.f266492b;
        }
        if ((i10 & 4) != 0) {
            bool = gBVariationMeta.f266493c;
        }
        return gBVariationMeta.d(str, str2, bool);
    }

    @oj.n
    public static final /* synthetic */ void l(GBVariationMeta gBVariationMeta, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || gBVariationMeta.f266491a != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 0, b3.f315897a, gBVariationMeta.f266491a);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || gBVariationMeta.f266492b != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, gBVariationMeta.f266492b);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 2) && gBVariationMeta.f266493c == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.i.f315935a, gBVariationMeta.f266493c);
    }

    @Nullable
    public final String a() {
        return this.f266491a;
    }

    @Nullable
    public final String b() {
        return this.f266492b;
    }

    @Nullable
    public final Boolean c() {
        return this.f266493c;
    }

    @NotNull
    public final GBVariationMeta d(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        return new GBVariationMeta(str, str2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GBVariationMeta)) {
            return false;
        }
        GBVariationMeta gBVariationMeta = (GBVariationMeta) obj;
        return Intrinsics.areEqual(this.f266491a, gBVariationMeta.f266491a) && Intrinsics.areEqual(this.f266492b, gBVariationMeta.f266492b) && Intrinsics.areEqual(this.f266493c, gBVariationMeta.f266493c);
    }

    @Nullable
    public final String f() {
        return this.f266491a;
    }

    @Nullable
    public final String g() {
        return this.f266492b;
    }

    @Nullable
    public final Boolean h() {
        return this.f266493c;
    }

    public int hashCode() {
        String str = this.f266491a;
        int iHashCode = 0;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f266492b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f266493c;
        if (bool != null) {
            iHashCode = bool.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final void i(@Nullable String str) {
        this.f266491a = str;
    }

    public final void j(@Nullable String str) {
        this.f266492b = str;
    }

    public final void k(@Nullable Boolean bool) {
        this.f266493c = bool;
    }

    @NotNull
    public String toString() {
        return "GBVariationMeta(key=" + this.f266491a + ", name=" + this.f266492b + ", passthrough=" + this.f266493c + ")";
    }

    public /* synthetic */ GBVariationMeta(int i10, String str, String str2, Boolean bool, v2 v2Var) {
        if ((i10 & 1) == 0) {
            this.f266491a = null;
        } else {
            this.f266491a = str;
        }
        if ((i10 & 2) == 0) {
            this.f266492b = null;
        } else {
            this.f266492b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f266493c = null;
        } else {
            this.f266493c = bool;
        }
    }

    public GBVariationMeta(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.f266491a = str;
        this.f266492b = str2;
        this.f266493c = bool;
    }

    public /* synthetic */ GBVariationMeta(String str, String str2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool);
    }
}
