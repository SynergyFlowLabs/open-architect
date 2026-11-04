package com.devtodev.analytics.internal.platform.repository.playservice;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.devtodev.analytics.internal.queue.QueueManager;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ReferrerClient {

    @NotNull
    private final Context context;

    @NotNull
    private final f0 installReferrerClient$delegate;

    public ReferrerClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.installReferrerClient$delegate = g0.b(j0.NONE, new ReferrerClient$installReferrerClient$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstallReferrerClient getInstallReferrerClient() {
        return (InstallReferrerClient) this.installReferrerClient$delegate.getValue();
    }

    public final void endConnection(@NotNull IReferrerClientListener referrerListener) {
        Intrinsics.checkNotNullParameter(referrerListener, "referrerListener");
        InstallReferrerClient installReferrerClient = getInstallReferrerClient();
        if (installReferrerClient != null && installReferrerClient.isReady()) {
            installReferrerClient.endConnection();
        }
        referrerListener.onReferrerServiceConnectionClosed();
    }

    public final void startConnection(@NotNull final IReferrerClientListener referrerListener) {
        Intrinsics.checkNotNullParameter(referrerListener, "referrerListener");
        InstallReferrerClient installReferrerClient = getInstallReferrerClient();
        if (installReferrerClient != null) {
            installReferrerClient.startConnection(new InstallReferrerStateListener() { // from class: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient.startConnection.1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    QueueManager.Companion.runIncoming(new ReferrerClient$startConnection$1$onInstallReferrerServiceDisconnected$1(referrerListener));
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i10) {
                    QueueManager.Companion.runIncoming(new ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1(i10, ReferrerClient.this, referrerListener));
                }
            });
        }
    }
}
