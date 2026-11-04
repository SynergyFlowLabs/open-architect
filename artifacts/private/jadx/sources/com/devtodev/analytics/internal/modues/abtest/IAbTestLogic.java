package com.devtodev.analytics.internal.modues.abtest;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IAbTestLogic {
    @NotNull
    Map<String, Object> getConfig();

    void prepareCallbacks();

    void resetConfig();

    void startAbTestLogic();

    void startActivity();

    void stopActivity();

    void tryStartInvolvedExperiment();
}
