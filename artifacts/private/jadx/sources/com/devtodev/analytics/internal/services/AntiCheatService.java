package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.backend.IBackend;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.modues.anticheat.Receipt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AntiCheatService implements IAntiCheatService {

    @NotNull
    private final IBackend backend;

    @NotNull
    private final IStateManager stateManager;

    public AntiCheatService(@NotNull IStateManager stateManager, @NotNull IBackend backend) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.stateManager = stateManager;
        this.backend = backend;
    }

    @Override // com.devtodev.analytics.internal.services.IAntiCheatService
    @NotNull
    public DTDVerifyResponse receiveReceiptStatus(@NotNull Receipt receipt) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Project activeProject = this.stateManager.getActiveProject();
        return this.backend.sendVerifyReceipt(activeProject.getApplicationKey(), receipt, this.stateManager.getIdentifiers(this.stateManager.getActiveUser()));
    }
}
