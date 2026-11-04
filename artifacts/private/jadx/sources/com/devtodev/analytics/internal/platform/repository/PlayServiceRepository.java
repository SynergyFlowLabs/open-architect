package com.devtodev.analytics.internal.platform.repository;

import android.os.DeadObjectException;
import com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStartConnectionListener;
import com.devtodev.analytics.internal.platform.repository.playservice.IInstallReferrerStopConnectionListener;
import com.devtodev.analytics.internal.platform.repository.playservice.IReferrerClientListener;
import com.devtodev.analytics.internal.platform.repository.playservice.InstallReferrerState;
import com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayServiceRepository implements IPlayServiceRepository {

    @NotNull
    private final ReferrerClient referrerClient;

    @NotNull
    private final IReferrerClientListener referrerClientListener;

    @Nullable
    private IInstallReferrerStartConnectionListener startInstallReferrerListener;

    @Nullable
    private IInstallReferrerStopConnectionListener stopInstallReferrerListener;

    public PlayServiceRepository(@NotNull ReferrerClient referrerClient) {
        Intrinsics.checkNotNullParameter(referrerClient, "referrerClient");
        this.referrerClient = referrerClient;
        this.referrerClientListener = new IReferrerClientListener() { // from class: com.devtodev.analytics.internal.platform.repository.PlayServiceRepository$referrerClientListener$1
            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerClientListener
            public void onReferrerFeatureNotSupported() {
                IInstallReferrerStartConnectionListener iInstallReferrerStartConnectionListener = this.this$0.startInstallReferrerListener;
                if (iInstallReferrerStartConnectionListener != null) {
                    iInstallReferrerStartConnectionListener.referrerSetupFinished(InstallReferrerState.FeatureNotSupported.INSTANCE);
                }
            }

            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerClientListener
            public void onReferrerServiceConnectionClosed() {
                IInstallReferrerStopConnectionListener iInstallReferrerStopConnectionListener = this.this$0.stopInstallReferrerListener;
                if (iInstallReferrerStopConnectionListener != null) {
                    iInstallReferrerStopConnectionListener.referrerConnectionClosed();
                }
            }

            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerClientListener
            public void onReferrerServiceDisconnected() {
                IInstallReferrerStartConnectionListener iInstallReferrerStartConnectionListener = this.this$0.startInstallReferrerListener;
                if (iInstallReferrerStartConnectionListener != null) {
                    iInstallReferrerStartConnectionListener.referrerServiceDisconnected();
                }
            }

            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerClientListener
            public void onReferrerServiceUnavailable() {
                IInstallReferrerStartConnectionListener iInstallReferrerStartConnectionListener = this.this$0.startInstallReferrerListener;
                if (iInstallReferrerStartConnectionListener != null) {
                    iInstallReferrerStartConnectionListener.referrerSetupFinished(InstallReferrerState.ServiceUnavailable.INSTANCE);
                }
            }

            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerClientListener
            public void onReferrerSetup(@NotNull String installReferrer, boolean z10, long j10, long j11) {
                Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
                IInstallReferrerStartConnectionListener iInstallReferrerStartConnectionListener = this.this$0.startInstallReferrerListener;
                if (iInstallReferrerStartConnectionListener != null) {
                    iInstallReferrerStartConnectionListener.referrerSetupFinished(new InstallReferrerState.InstallReferrerData(installReferrer, z10, j10, j11));
                }
            }

            @Override // com.devtodev.analytics.internal.platform.repository.playservice.IReferrerClientListener
            public void onReferrerSetupFail() {
                IInstallReferrerStartConnectionListener iInstallReferrerStartConnectionListener = this.this$0.startInstallReferrerListener;
                if (iInstallReferrerStartConnectionListener != null) {
                    iInstallReferrerStartConnectionListener.referrerSetupFinished(InstallReferrerState.ReceiveStateFail.INSTANCE);
                }
            }
        };
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IPlayServiceRepository
    public void startInstallReferrerConnection(@NotNull IInstallReferrerStartConnectionListener installReferrerListener) {
        Intrinsics.checkNotNullParameter(installReferrerListener, "installReferrerListener");
        try {
            this.startInstallReferrerListener = installReferrerListener;
            this.referrerClient.startConnection(this.referrerClientListener);
        } catch (DeadObjectException unused) {
            installReferrerListener.referrerSetupFinished(InstallReferrerState.DeadObjectException.INSTANCE);
        } catch (Exception unused2) {
            installReferrerListener.referrerSetupFinished(InstallReferrerState.FeatureNotSupported.INSTANCE);
        } catch (NoClassDefFoundError unused3) {
            installReferrerListener.referrerSetupFinished(InstallReferrerState.NoInstallReferrerImplementation.INSTANCE);
        } catch (SecurityException unused4) {
            installReferrerListener.referrerSetupFinished(InstallReferrerState.SecurityException.INSTANCE);
        }
    }

    @Override // com.devtodev.analytics.internal.platform.repository.IPlayServiceRepository
    public void stopInstallReferrerConnection(@NotNull IInstallReferrerStopConnectionListener installReferrerListener) {
        Intrinsics.checkNotNullParameter(installReferrerListener, "installReferrerListener");
        try {
            this.referrerClient.endConnection(this.referrerClientListener);
        } catch (DeadObjectException unused) {
            installReferrerListener.referrerObjectNotExist();
        } catch (Exception unused2) {
            installReferrerListener.referrerObjectNotExist();
        } catch (NoClassDefFoundError unused3) {
            installReferrerListener.referrerServiceNoDefinition();
        }
    }
}
