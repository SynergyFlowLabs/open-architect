package io.customer.messaginginapp.gist.presentation.engine;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class EngineWebMessage {

    @NotNull
    private final EngineWebEvent gist;

    public EngineWebMessage(@NotNull EngineWebEvent gist) {
        Intrinsics.checkNotNullParameter(gist, "gist");
        this.gist = gist;
    }

    public static /* synthetic */ EngineWebMessage copy$default(EngineWebMessage engineWebMessage, EngineWebEvent engineWebEvent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            engineWebEvent = engineWebMessage.gist;
        }
        return engineWebMessage.copy(engineWebEvent);
    }

    @NotNull
    public final EngineWebEvent component1() {
        return this.gist;
    }

    @NotNull
    public final EngineWebMessage copy(@NotNull EngineWebEvent gist) {
        Intrinsics.checkNotNullParameter(gist, "gist");
        return new EngineWebMessage(gist);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EngineWebMessage) && Intrinsics.areEqual(this.gist, ((EngineWebMessage) obj).gist)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final EngineWebEvent getGist() {
        return this.gist;
    }

    public int hashCode() {
        return this.gist.hashCode();
    }

    @NotNull
    public String toString() {
        return "EngineWebMessage(gist=" + this.gist + ")";
    }
}
