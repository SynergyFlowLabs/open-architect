package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class WaveformElement {
    private final float amplitude;
    private final long timestamp;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f291971x;

    public WaveformElement(float f10, float f11, long j10) {
        this.f291971x = f10;
        this.amplitude = f11;
        this.timestamp = j10;
    }

    public static /* synthetic */ WaveformElement copy$default(WaveformElement waveformElement, float f10, float f11, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = waveformElement.f291971x;
        }
        if ((i10 & 2) != 0) {
            f11 = waveformElement.amplitude;
        }
        if ((i10 & 4) != 0) {
            j10 = waveformElement.timestamp;
        }
        return waveformElement.copy(f10, f11, j10);
    }

    public final float component1() {
        return this.f291971x;
    }

    public final float component2() {
        return this.amplitude;
    }

    public final long component3() {
        return this.timestamp;
    }

    @NotNull
    public final WaveformElement copy(float f10, float f11, long j10) {
        return new WaveformElement(f10, f11, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveformElement)) {
            return false;
        }
        WaveformElement waveformElement = (WaveformElement) obj;
        return Float.compare(this.f291971x, waveformElement.f291971x) == 0 && Float.compare(this.amplitude, waveformElement.amplitude) == 0 && this.timestamp == waveformElement.timestamp;
    }

    public final float getAmplitude() {
        return this.amplitude;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getX() {
        return this.f291971x;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f291971x) * 31) + Float.hashCode(this.amplitude)) * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "WaveformElement(x=" + this.f291971x + ", amplitude=" + this.amplitude + ", timestamp=" + this.timestamp + ')';
    }
}
