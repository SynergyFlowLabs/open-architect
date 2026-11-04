package com.superwall.sdk.models.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class RawFeatureFlag {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean enabled;

    @NotNull
    private final String key;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RawFeatureFlag> serializer() {
            return RawFeatureFlag$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RawFeatureFlag(int i10, String str, boolean z10, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, RawFeatureFlag$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.enabled = z10;
    }

    public static /* synthetic */ RawFeatureFlag copy$default(RawFeatureFlag rawFeatureFlag, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rawFeatureFlag.key;
        }
        if ((i10 & 2) != 0) {
            z10 = rawFeatureFlag.enabled;
        }
        return rawFeatureFlag.copy(str, z10);
    }

    @a0("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @a0("key")
    public static /* synthetic */ void getKey$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(RawFeatureFlag rawFeatureFlag, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, rawFeatureFlag.key);
        eVar.encodeBooleanElement(serialDescriptor, 1, rawFeatureFlag.enabled);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    public final boolean component2() {
        return this.enabled;
    }

    @NotNull
    public final RawFeatureFlag copy(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new RawFeatureFlag(key, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawFeatureFlag)) {
            return false;
        }
        RawFeatureFlag rawFeatureFlag = (RawFeatureFlag) obj;
        return Intrinsics.areEqual(this.key, rawFeatureFlag.key) && this.enabled == rawFeatureFlag.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + Boolean.hashCode(this.enabled);
    }

    @NotNull
    public String toString() {
        return "RawFeatureFlag(key=" + this.key + ", enabled=" + this.enabled + ")";
    }

    public RawFeatureFlag(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.enabled = z10;
    }
}
