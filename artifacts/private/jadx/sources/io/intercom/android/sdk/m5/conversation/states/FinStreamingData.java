package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class FinStreamingData {
    public static final int $stable = 8;

    @NotNull
    private final List<Block> blocks;

    @NotNull
    private final String clientAssignedUUID;
    private final boolean isFinStreaming;
    private final int tokenSequenceIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public FinStreamingData(boolean z10, @NotNull List<? extends Block> blocks, @NotNull String clientAssignedUUID, int i10) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
        this.isFinStreaming = z10;
        this.blocks = blocks;
        this.clientAssignedUUID = clientAssignedUUID;
        this.tokenSequenceIndex = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinStreamingData copy$default(FinStreamingData finStreamingData, boolean z10, List list, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = finStreamingData.isFinStreaming;
        }
        if ((i11 & 2) != 0) {
            list = finStreamingData.blocks;
        }
        if ((i11 & 4) != 0) {
            str = finStreamingData.clientAssignedUUID;
        }
        if ((i11 & 8) != 0) {
            i10 = finStreamingData.tokenSequenceIndex;
        }
        return finStreamingData.copy(z10, list, str, i10);
    }

    public final boolean component1() {
        return this.isFinStreaming;
    }

    @NotNull
    public final List<Block> component2() {
        return this.blocks;
    }

    @NotNull
    public final String component3() {
        return this.clientAssignedUUID;
    }

    public final int component4() {
        return this.tokenSequenceIndex;
    }

    @NotNull
    public final FinStreamingData copy(boolean z10, @NotNull List<? extends Block> blocks, @NotNull String clientAssignedUUID, int i10) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
        return new FinStreamingData(z10, blocks, clientAssignedUUID, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinStreamingData)) {
            return false;
        }
        FinStreamingData finStreamingData = (FinStreamingData) obj;
        if (this.isFinStreaming == finStreamingData.isFinStreaming && Intrinsics.areEqual(this.blocks, finStreamingData.blocks) && Intrinsics.areEqual(this.clientAssignedUUID, finStreamingData.clientAssignedUUID) && this.tokenSequenceIndex == finStreamingData.tokenSequenceIndex) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    @NotNull
    public final String getClientAssignedUUID() {
        return this.clientAssignedUUID;
    }

    public final int getTokenSequenceIndex() {
        return this.tokenSequenceIndex;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isFinStreaming) * 31) + this.blocks.hashCode()) * 31) + this.clientAssignedUUID.hashCode()) * 31) + Integer.hashCode(this.tokenSequenceIndex);
    }

    public final boolean isFinStreaming() {
        return this.isFinStreaming;
    }

    @NotNull
    public String toString() {
        return "FinStreamingData(isFinStreaming=" + this.isFinStreaming + ", blocks=" + this.blocks + ", clientAssignedUUID=" + this.clientAssignedUUID + ", tokenSequenceIndex=" + this.tokenSequenceIndex + ')';
    }
}
