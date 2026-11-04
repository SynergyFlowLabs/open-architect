package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class HostAppState {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    public static final HostAppState NULL = new HostAppState(false, false, 0, 7, null);
    private final long backgroundedTimestamp;
    private final boolean isBackgrounded;
    private final boolean sessionStartedSinceLastBackgrounded;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int i10 = 5 | 0;
    }

    public HostAppState() {
        this(false, false, 0L, 7, null);
    }

    public static /* synthetic */ HostAppState copy$default(HostAppState hostAppState, boolean z10, boolean z11, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hostAppState.isBackgrounded;
        }
        if ((i10 & 2) != 0) {
            z11 = hostAppState.sessionStartedSinceLastBackgrounded;
        }
        if ((i10 & 4) != 0) {
            j10 = hostAppState.backgroundedTimestamp;
        }
        return hostAppState.copy(z10, z11, j10);
    }

    public final boolean component1() {
        return this.isBackgrounded;
    }

    public final boolean component2() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public final long component3() {
        return this.backgroundedTimestamp;
    }

    @NotNull
    public final HostAppState copy(boolean z10, boolean z11, long j10) {
        return new HostAppState(z10, z11, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAppState)) {
            return false;
        }
        HostAppState hostAppState = (HostAppState) obj;
        return this.isBackgrounded == hostAppState.isBackgrounded && this.sessionStartedSinceLastBackgrounded == hostAppState.sessionStartedSinceLastBackgrounded && this.backgroundedTimestamp == hostAppState.backgroundedTimestamp;
    }

    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isBackgrounded) * 31) + Boolean.hashCode(this.sessionStartedSinceLastBackgrounded)) * 31) + Long.hashCode(this.backgroundedTimestamp);
    }

    public final boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    @NotNull
    public String toString() {
        return "HostAppState(isBackgrounded=" + this.isBackgrounded + ", sessionStartedSinceLastBackgrounded=" + this.sessionStartedSinceLastBackgrounded + ", backgroundedTimestamp=" + this.backgroundedTimestamp + ')';
    }

    public HostAppState(boolean z10, boolean z11, long j10) {
        this.isBackgrounded = z10;
        this.sessionStartedSinceLastBackgrounded = z11;
        this.backgroundedTimestamp = j10;
    }

    public /* synthetic */ HostAppState(boolean z10, boolean z11, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? 0L : j10);
    }
}
