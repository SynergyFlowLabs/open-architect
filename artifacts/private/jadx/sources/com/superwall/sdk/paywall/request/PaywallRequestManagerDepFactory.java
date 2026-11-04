package com.superwall.sdk.paywall.request;

import com.superwall.sdk.dependencies.ConfigManagerFactory;
import com.superwall.sdk.dependencies.DeviceInfoFactory;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface PaywallRequestManagerDepFactory extends DeviceInfoFactory, ConfigManagerFactory {
    @Nullable
    String activePaywallId();
}
