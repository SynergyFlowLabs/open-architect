package com.superwall.sdk.models.internal;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DeviceVendorId {

    @NotNull
    private final String value;

    public /* synthetic */ DeviceVendorId(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return this.value;
    }

    private DeviceVendorId(String vendorId) {
        Intrinsics.checkNotNullParameter(vendorId, "vendorId");
        byte[] bytes = vendorId.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        this.value = "$SuperwallDevice:" + UUID.nameUUIDFromBytes(bytes);
    }
}
