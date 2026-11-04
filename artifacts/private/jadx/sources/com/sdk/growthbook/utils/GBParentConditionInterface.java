package com.sdk.growthbook.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class GBParentConditionInterface {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final JsonElement f266485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Boolean f266486c;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<GBParentConditionInterface> serializer() {
            return GBParentConditionInterface$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GBParentConditionInterface(int i10, String str, JsonElement jsonElement, Boolean bool, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, GBParentConditionInterface$$serializer.INSTANCE.getDescriptor());
        }
        this.f266484a = str;
        this.f266485b = jsonElement;
        if ((i10 & 4) == 0) {
            this.f266486c = null;
        } else {
            this.f266486c = bool;
        }
    }

    public static /* synthetic */ GBParentConditionInterface e(GBParentConditionInterface gBParentConditionInterface, String str, JsonElement jsonElement, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gBParentConditionInterface.f266484a;
        }
        if ((i10 & 2) != 0) {
            jsonElement = gBParentConditionInterface.f266485b;
        }
        if ((i10 & 4) != 0) {
            bool = gBParentConditionInterface.f266486c;
        }
        return gBParentConditionInterface.d(str, jsonElement, bool);
    }

    @oj.n
    public static final /* synthetic */ void i(GBParentConditionInterface gBParentConditionInterface, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, gBParentConditionInterface.f266484a);
        eVar.encodeSerializableElement(serialDescriptor, 1, JsonElementSerializer.INSTANCE, gBParentConditionInterface.f266485b);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 2) && gBParentConditionInterface.f266486c == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.i.f315935a, gBParentConditionInterface.f266486c);
    }

    @NotNull
    public final String a() {
        return this.f266484a;
    }

    @NotNull
    public final JsonElement b() {
        return this.f266485b;
    }

    @Nullable
    public final Boolean c() {
        return this.f266486c;
    }

    @NotNull
    public final GBParentConditionInterface d(@NotNull String id2, @NotNull JsonElement condition, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return new GBParentConditionInterface(id2, condition, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GBParentConditionInterface)) {
            return false;
        }
        GBParentConditionInterface gBParentConditionInterface = (GBParentConditionInterface) obj;
        return Intrinsics.areEqual(this.f266484a, gBParentConditionInterface.f266484a) && Intrinsics.areEqual(this.f266485b, gBParentConditionInterface.f266485b) && Intrinsics.areEqual(this.f266486c, gBParentConditionInterface.f266486c);
    }

    @NotNull
    public final JsonElement f() {
        return this.f266485b;
    }

    @Nullable
    public final Boolean g() {
        return this.f266486c;
    }

    @NotNull
    public final String h() {
        return this.f266484a;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = ((this.f266484a.hashCode() * 31) + this.f266485b.hashCode()) * 31;
        Boolean bool = this.f266486c;
        if (bool == null) {
            iHashCode = 0;
            int i10 = 7 << 0;
        } else {
            iHashCode = bool.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @NotNull
    public String toString() {
        return "GBParentConditionInterface(id=" + this.f266484a + ", condition=" + this.f266485b + ", gate=" + this.f266486c + ")";
    }

    public GBParentConditionInterface(@NotNull String id2, @NotNull JsonElement condition, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f266484a = id2;
        this.f266485b = condition;
        this.f266486c = bool;
    }

    public /* synthetic */ GBParentConditionInterface(String str, JsonElement jsonElement, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonElement, (i10 & 4) != 0 ? null : bool);
    }
}
