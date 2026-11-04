package com.devtodev.analytics.internal.modues.abtest;

import com.devtodev.analytics.internal.lifecycle.ILifecycleRepository;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IAbTestProxy {
    @NotNull
    Map<String, Object> getConfig();

    void initialize(@NotNull IAbTestLogic iAbTestLogic, @NotNull ILifecycleRepository iLifecycleRepository);

    void resetConfig();

    void startActivity();

    void stopActivity();

    void tryStartInvolvedExperiment();
}
