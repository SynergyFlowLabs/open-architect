package com.superwall.sdk.models.entitlements;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Redeemable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String code;

    @Nullable
    private final Boolean firstRedemption;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Redeemable> serializer() {
            return Redeemable$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Redeemable(int i10, String str, Boolean bool, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, Redeemable$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        if ((i10 & 2) == 0) {
            this.firstRedemption = Boolean.FALSE;
        } else {
            this.firstRedemption = bool;
        }
    }

    public static /* synthetic */ Redeemable copy$default(Redeemable redeemable, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = redeemable.code;
        }
        if ((i10 & 2) != 0) {
            bool = redeemable.firstRedemption;
        }
        return redeemable.copy(str, bool);
    }

    @a0("code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @a0("firstRedemption")
    public static /* synthetic */ void getFirstRedemption$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Redeemable redeemable, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, redeemable.code);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.areEqual(redeemable.firstRedemption, Boolean.FALSE)) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, i.f315935a, redeemable.firstRedemption);
    }

    @NotNull
    public final String component1() {
        return this.code;
    }

    @Nullable
    public final Boolean component2() {
        return this.firstRedemption;
    }

    @NotNull
    public final Redeemable copy(@NotNull String code, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new Redeemable(code, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Redeemable)) {
            return false;
        }
        Redeemable redeemable = (Redeemable) obj;
        return Intrinsics.areEqual(this.code, redeemable.code) && Intrinsics.areEqual(this.firstRedemption, redeemable.firstRedemption);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final Boolean getFirstRedemption() {
        return this.firstRedemption;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        Boolean bool = this.firstRedemption;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "Redeemable(code=" + this.code + ", firstRedemption=" + this.firstRedemption + ")";
    }

    public Redeemable(@NotNull String code, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.firstRedemption = bool;
    }

    public /* synthetic */ Redeemable(String str, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? Boolean.FALSE : bool);
    }
}
