package com.devtodev.analytics.internal.platform.repository.playservice;

import com.devtodev.analytics.internal.platform.repository.IPlayServiceRepository;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayServiceWrapper {

    @NotNull
    private final IPlayServiceRepository playServiceRepository;

    public PlayServiceWrapper(@NotNull IPlayServiceRepository playServiceRepository) {
        Intrinsics.checkNotNullParameter(playServiceRepository, "playServiceRepository");
        this.playServiceRepository = playServiceRepository;
    }

    private final IInstallReferrerStartConnectionListener getInstallReferrerListener(final IReferrerStateListener iReferrerStateListener) {
        return new IInstallReferrerStartConnectionListener() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.PlayServiceWrapper.getInstallReferrerListener.1
            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStartConnectionListener
            public void referrerServiceDisconnected() {
                iReferrerStateListener.onReferrerState(ReferrerState.ServiceDisconnected.INSTANCE);
            }

            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStartConnectionListener
            public void referrerServiceNoDefinition() {
                iReferrerStateListener.onReferrerState(ReferrerState.NoInstallReferrerImplementation.INSTANCE);
            }

            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStartConnectionListener
            public void referrerSetupFinished(@NotNull InstallReferrerState installReferrerState) {
                Intrinsics.checkNotNullParameter(installReferrerState, "installReferrerState");
                if (installReferrerState instanceof InstallReferrerState.InstallReferrerData) {
                    InstallReferrerState.InstallReferrerData installReferrerData = (InstallReferrerState.InstallReferrerData) installReferrerState;
                    iReferrerStateListener.onReferrerState(new ReferrerState.ReferrerData(installReferrerData.getInstallReferrer(), installReferrerData.getGooglePlayInstantParam(), installReferrerData.getInstallBeginTimeStampSeconds(), installReferrerData.getReferrerClickTimestampSeconds()));
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.ReceiveStateFail.INSTANCE)) {
                    iReferrerStateListener.onReferrerState(ReferrerState.ReceiveStateFail.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.FeatureNotSupported.INSTANCE)) {
                    iReferrerStateListener.onReferrerState(ReferrerState.FeatureNotSupported.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.ServiceUnavailable.INSTANCE)) {
                    iReferrerStateListener.onReferrerState(ReferrerState.ServiceUnavailable.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.SecurityException.INSTANCE)) {
                    iReferrerStateListener.onReferrerState(ReferrerState.BindNotAllowed.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.NoInstallReferrerImplementation.INSTANCE)) {
                    iReferrerStateListener.onReferrerState(ReferrerState.NoInstallReferrerImplementation.INSTANCE);
                } else if (Intrinsics.areEqual(installReferrerState, InstallReferrerState.DeadObjectException.INSTANCE)) {
                    iReferrerStateListener.onReferrerState(ReferrerState.ServiceUnavailable.INSTANCE);
                }
                IPlayServiceRepository iPlayServiceRepository = this.playServiceRepository;
                final IReferrerStateListener iReferrerStateListener2 = iReferrerStateListener;
                iPlayServiceRepository.stopInstallReferrerConnection(new IInstallReferrerStopConnectionListener() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.PlayServiceWrapper$getInstallReferrerListener$1$referrerSetupFinished$1
                    @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener
                    public void referrerConnectionClosed() {
                        iReferrerStateListener2.onReferrerStateClose(ReferrerState.ServiceConnectionEnded.INSTANCE);
                    }

                    @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener
                    public void referrerObjectNotExist() {
                        iReferrerStateListener2.onReferrerStateClose(ReferrerState.ServiceUnavailable.INSTANCE);
                    }

                    @Override // com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener
                    public void referrerServiceNoDefinition() {
                        iReferrerStateListener2.onReferrerStateClose(ReferrerState.NoInstallReferrerImplementation.INSTANCE);
                    }
                });
            }
        };
    }

    public final void getInstallReferrer(@NotNull IReferrerStateListener referrerStateListener) {
        Intrinsics.checkNotNullParameter(referrerStateListener, "referrerStateListener");
        this.playServiceRepository.startInstallReferrerConnection(getInstallReferrerListener(referrerStateListener));
    }
}
