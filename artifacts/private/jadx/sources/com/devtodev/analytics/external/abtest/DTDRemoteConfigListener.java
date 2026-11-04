package com.devtodev.analytics.external.abtest;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface DTDRemoteConfigListener {

    public static final class DefaultImpls {
        public static /* synthetic */ void onChanged$default(DTDRemoteConfigListener dTDRemoteConfigListener, DTDRemoteConfigChangeResult dTDRemoteConfigChangeResult, Exception exc, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onChanged");
            }
            if ((i10 & 2) != 0) {
                exc = null;
            }
            dTDRemoteConfigListener.onChanged(dTDRemoteConfigChangeResult, exc);
        }
    }

    void onChanged(@NotNull DTDRemoteConfigChangeResult dTDRemoteConfigChangeResult, @Nullable Exception exc);

    void onPrepareToChange();

    void onReceived(@NotNull DTDRemoteConfigReceiveResult dTDRemoteConfigReceiveResult);
}
