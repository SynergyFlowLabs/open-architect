package com.devtodev.analytics.internal.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceResolution {
    private final int screenDPI;
    private final double screenInches;

    @NotNull
    private final String screenResolution;

    public DeviceResolution(int i10, double d10, @NotNull String screenResolution) {
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        this.screenDPI = i10;
        this.screenInches = d10;
        this.screenResolution = screenResolution;
    }

    public static /* synthetic */ DeviceResolution copy$default(DeviceResolution deviceResolution, int i10, double d10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = deviceResolution.screenDPI;
        }
        if ((i11 & 2) != 0) {
            d10 = deviceResolution.screenInches;
        }
        if ((i11 & 4) != 0) {
            str = deviceResolution.screenResolution;
        }
        return deviceResolution.copy(i10, d10, str);
    }

    public final int component1() {
        return this.screenDPI;
    }

    public final double component2() {
        return this.screenInches;
    }

    @NotNull
    public final String component3() {
        return this.screenResolution;
    }

    @NotNull
    public final DeviceResolution copy(int i10, double d10, @NotNull String screenResolution) {
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        return new DeviceResolution(i10, d10, screenResolution);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceResolution)) {
            return false;
        }
        DeviceResolution deviceResolution = (DeviceResolution) obj;
        return this.screenDPI == deviceResolution.screenDPI && Double.compare(this.screenInches, deviceResolution.screenInches) == 0 && Intrinsics.areEqual(this.screenResolution, deviceResolution.screenResolution);
    }

    public final int getScreenDPI() {
        return this.screenDPI;
    }

    public final double getScreenInches() {
        return this.screenInches;
    }

    @NotNull
    public final String getScreenResolution() {
        return this.screenResolution;
    }

    public int hashCode() {
        return this.screenResolution.hashCode() + ((Double.hashCode(this.screenInches) + (Integer.hashCode(this.screenDPI) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DeviceResolution(screenDPI=" + this.screenDPI + ", screenInches=" + this.screenInches + ", screenResolution=" + this.screenResolution + ")";
    }
}
