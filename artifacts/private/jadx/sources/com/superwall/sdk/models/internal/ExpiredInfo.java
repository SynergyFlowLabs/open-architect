package com.superwall.sdk.models.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class ExpiredInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final String obfuscatedEmail;
    private final boolean resent;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ExpiredInfo> serializer() {
            return ExpiredInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExpiredInfo(int i10, boolean z10, String str, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, ExpiredInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.resent = z10;
        if ((i10 & 2) == 0) {
            this.obfuscatedEmail = null;
        } else {
            this.obfuscatedEmail = str;
        }
    }

    public static /* synthetic */ ExpiredInfo copy$default(ExpiredInfo expiredInfo, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = expiredInfo.resent;
        }
        if ((i10 & 2) != 0) {
            str = expiredInfo.obfuscatedEmail;
        }
        return expiredInfo.copy(z10, str);
    }

    @a0("obfuscatedEmail")
    public static /* synthetic */ void getObfuscatedEmail$annotations() {
    }

    @a0("resent")
    public static /* synthetic */ void getResent$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(ExpiredInfo expiredInfo, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeBooleanElement(serialDescriptor, 0, expiredInfo.resent);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || expiredInfo.obfuscatedEmail != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, expiredInfo.obfuscatedEmail);
        }
    }

    public final boolean component1() {
        return this.resent;
    }

    @Nullable
    public final String component2() {
        return this.obfuscatedEmail;
    }

    @NotNull
    public final ExpiredInfo copy(boolean z10, @Nullable String str) {
        return new ExpiredInfo(z10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiredInfo)) {
            return false;
        }
        ExpiredInfo expiredInfo = (ExpiredInfo) obj;
        return this.resent == expiredInfo.resent && Intrinsics.areEqual(this.obfuscatedEmail, expiredInfo.obfuscatedEmail);
    }

    @Nullable
    public final String getObfuscatedEmail() {
        return this.obfuscatedEmail;
    }

    public final boolean getResent() {
        return this.resent;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.resent) * 31;
        String str = this.obfuscatedEmail;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ExpiredInfo(resent=" + this.resent + ", obfuscatedEmail=" + this.obfuscatedEmail + ")";
    }

    public ExpiredInfo(boolean z10, @Nullable String str) {
        this.resent = z10;
        this.obfuscatedEmail = str;
    }

    public /* synthetic */ ExpiredInfo(boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : str);
    }
}
