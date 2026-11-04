package io.intercom.android.sdk.lightcompressor.config;

import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Configuration {
    private boolean disableAudio;
    private boolean isMinBitrateCheckEnabled;
    private final boolean keepOriginalResolution;

    @NotNull
    private VideoQuality quality;

    @Nullable
    private Integer videoBitrateInMbps;

    @Nullable
    private Double videoHeight;

    @NotNull
    private List<String> videoNames;

    @Nullable
    private Double videoWidth;

    public Configuration(@NotNull VideoQuality quality, boolean z10, @Nullable Integer num, boolean z11, boolean z12, @Nullable Double d10, @Nullable Double d11, @NotNull List<String> videoNames) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(videoNames, "videoNames");
        this.quality = quality;
        this.isMinBitrateCheckEnabled = z10;
        this.videoBitrateInMbps = num;
        this.disableAudio = z11;
        this.keepOriginalResolution = z12;
        this.videoHeight = d10;
        this.videoWidth = d11;
        this.videoNames = videoNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Configuration copy$default(Configuration configuration, VideoQuality videoQuality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            videoQuality = configuration.quality;
        }
        if ((i10 & 2) != 0) {
            z10 = configuration.isMinBitrateCheckEnabled;
        }
        if ((i10 & 4) != 0) {
            num = configuration.videoBitrateInMbps;
        }
        if ((i10 & 8) != 0) {
            z11 = configuration.disableAudio;
        }
        if ((i10 & 16) != 0) {
            z12 = configuration.keepOriginalResolution;
        }
        if ((i10 & 32) != 0) {
            d10 = configuration.videoHeight;
        }
        if ((i10 & 64) != 0) {
            d11 = configuration.videoWidth;
        }
        if ((i10 & 128) != 0) {
            list = configuration.videoNames;
        }
        Double d12 = d11;
        List list2 = list;
        boolean z13 = z12;
        Double d13 = d10;
        return configuration.copy(videoQuality, z10, num, z11, z13, d13, d12, list2);
    }

    @NotNull
    public final VideoQuality component1() {
        return this.quality;
    }

    public final boolean component2() {
        return this.isMinBitrateCheckEnabled;
    }

    @Nullable
    public final Integer component3() {
        return this.videoBitrateInMbps;
    }

    public final boolean component4() {
        return this.disableAudio;
    }

    public final boolean component5() {
        return this.keepOriginalResolution;
    }

    @Nullable
    public final Double component6() {
        return this.videoHeight;
    }

    @Nullable
    public final Double component7() {
        return this.videoWidth;
    }

    @NotNull
    public final List<String> component8() {
        return this.videoNames;
    }

    @NotNull
    public final Configuration copy(@NotNull VideoQuality quality, boolean z10, @Nullable Integer num, boolean z11, boolean z12, @Nullable Double d10, @Nullable Double d11, @NotNull List<String> videoNames) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(videoNames, "videoNames");
        return new Configuration(quality, z10, num, z11, z12, d10, d11, videoNames);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.quality == configuration.quality && this.isMinBitrateCheckEnabled == configuration.isMinBitrateCheckEnabled && Intrinsics.areEqual(this.videoBitrateInMbps, configuration.videoBitrateInMbps) && this.disableAudio == configuration.disableAudio && this.keepOriginalResolution == configuration.keepOriginalResolution && Intrinsics.areEqual((Object) this.videoHeight, (Object) configuration.videoHeight) && Intrinsics.areEqual((Object) this.videoWidth, (Object) configuration.videoWidth) && Intrinsics.areEqual(this.videoNames, configuration.videoNames);
    }

    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    @NotNull
    public final VideoQuality getQuality() {
        return this.quality;
    }

    @Nullable
    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    @Nullable
    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    @NotNull
    public final List<String> getVideoNames() {
        return this.videoNames;
    }

    @Nullable
    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        int iHashCode = ((this.quality.hashCode() * 31) + Boolean.hashCode(this.isMinBitrateCheckEnabled)) * 31;
        Integer num = this.videoBitrateInMbps;
        int iHashCode2 = 0;
        int iHashCode3 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.disableAudio)) * 31) + Boolean.hashCode(this.keepOriginalResolution)) * 31;
        Double d10 = this.videoHeight;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.videoWidth;
        if (d11 != null) {
            iHashCode2 = d11.hashCode();
        }
        return ((iHashCode4 + iHashCode2) * 31) + this.videoNames.hashCode();
    }

    public final boolean isMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    public final void setDisableAudio(boolean z10) {
        this.disableAudio = z10;
    }

    public final void setMinBitrateCheckEnabled(boolean z10) {
        this.isMinBitrateCheckEnabled = z10;
    }

    public final void setQuality(@NotNull VideoQuality videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "<set-?>");
        this.quality = videoQuality;
    }

    public final void setVideoBitrateInMbps(@Nullable Integer num) {
        this.videoBitrateInMbps = num;
    }

    public final void setVideoHeight(@Nullable Double d10) {
        this.videoHeight = d10;
    }

    public final void setVideoNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.videoNames = list;
    }

    public final void setVideoWidth(@Nullable Double d10) {
        this.videoWidth = d10;
    }

    @NotNull
    public String toString() {
        return "Configuration(quality=" + this.quality + ", isMinBitrateCheckEnabled=" + this.isMinBitrateCheckEnabled + ", videoBitrateInMbps=" + this.videoBitrateInMbps + ", disableAudio=" + this.disableAudio + ", keepOriginalResolution=" + this.keepOriginalResolution + ", videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", videoNames=" + this.videoNames + ')';
    }

    public /* synthetic */ Configuration(VideoQuality videoQuality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? VideoQuality.MEDIUM : videoQuality, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? null : d10, (i10 & 64) != 0 ? null : d11, list);
    }
}
