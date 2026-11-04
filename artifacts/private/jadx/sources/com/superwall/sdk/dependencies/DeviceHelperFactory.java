package com.superwall.sdk.dependencies;

import com.superwall.sdk.network.device.DeviceInfo;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface DeviceHelperFactory {
    @NotNull
    DeviceInfo makeDeviceInfo();

    boolean makeIsSandbox();

    @Nullable
    Object makeSessionDeviceAttributes(@NotNull kotlin.coroutines.d<? super HashMap<String, Object>> dVar);
}
