package com.superwall.sdk.models.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class WebToAppConfig {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long entitlementsMaxAgeMs;

    @Nullable
    private String restoreAccesUrl;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<WebToAppConfig> serializer() {
            return WebToAppConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebToAppConfig() {
    }

    @a0("entitlements_max_age_ms")
    public static /* synthetic */ void getEntitlementsMaxAgeMs$annotations() {
    }

    @a0("restore_access_url")
    public static /* synthetic */ void getRestoreAccesUrl$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(WebToAppConfig webToAppConfig, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || webToAppConfig.entitlementsMaxAgeMs != 0) {
            eVar.encodeLongElement(serialDescriptor, 0, webToAppConfig.entitlementsMaxAgeMs);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && webToAppConfig.restoreAccesUrl == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, b3.f315897a, webToAppConfig.restoreAccesUrl);
    }

    public final long getEntitlementsMaxAgeMs() {
        return this.entitlementsMaxAgeMs;
    }

    @Nullable
    public final String getRestoreAccesUrl() {
        return this.restoreAccesUrl;
    }

    public final void setEntitlementsMaxAgeMs(long j10) {
        this.entitlementsMaxAgeMs = j10;
    }

    public final void setRestoreAccesUrl(@Nullable String str) {
        this.restoreAccesUrl = str;
    }

    public /* synthetic */ WebToAppConfig(int i10, long j10, String str, v2 v2Var) {
        this.entitlementsMaxAgeMs = (i10 & 1) == 0 ? 0L : j10;
        if ((i10 & 2) == 0) {
            this.restoreAccesUrl = null;
        } else {
            this.restoreAccesUrl = str;
        }
    }
}
