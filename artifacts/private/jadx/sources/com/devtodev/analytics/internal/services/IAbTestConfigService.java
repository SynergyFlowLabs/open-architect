package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.repository.InvolvedExperiment;
import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.domain.events.abTests.SuitableExperiments;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IAbTestConfigService {
    @Nullable
    Function1<RemoteConfig, Unit> getConfigUpdate();

    @Nullable
    Function0<Unit> getOfferNoConnection();

    @Nullable
    Function2<List<InvolvedExperiment>, SuitableExperiments, Unit> getOfferUpdate();

    @Nullable
    Function1<Exception, Unit> getOfferUserChanged();

    @Nullable
    Function1<UserData, Unit> getOnBackendUserDataUpdate();

    void receiveABConfig();

    void receiveAbBackendOffers();

    void setConfigUpdate(@Nullable Function1<? super RemoteConfig, Unit> function1);

    void setOfferNoConnection(@Nullable Function0<Unit> function0);

    void setOfferUpdate(@Nullable Function2<? super List<InvolvedExperiment>, ? super SuitableExperiments, Unit> function2);

    void setOfferUserChanged(@Nullable Function1<? super Exception, Unit> function1);

    void setOnBackendUserDataUpdate(@Nullable Function1<? super UserData, Unit> function1);
}
