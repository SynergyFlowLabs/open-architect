package io.intercom.android.sdk.lightcompressor.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;
import kotlin.k0;
import kotlin.math.b;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class CompressorUtils {

    @NotNull
    public static final CompressorUtils INSTANCE = new CompressorUtils();
    private static final int I_FRAME_INTERVAL = 1;
    private static final double MIN_HEIGHT = 640.0d;
    private static final double MIN_WIDTH = 368.0d;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.VERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoQuality.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoQuality.VERY_HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CompressorUtils() {
    }

    private final Integer getColorRange(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-range")) {
            return Integer.valueOf(mediaFormat.getInteger("color-range"));
        }
        return null;
    }

    private final Integer getColorStandard(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-standard")) {
            return Integer.valueOf(mediaFormat.getInteger("color-standard"));
        }
        return null;
    }

    private final Integer getColorTransfer(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-transfer")) {
            return Integer.valueOf(mediaFormat.getInteger("color-transfer"));
        }
        return null;
    }

    private final int getFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("frame-rate")) {
            return mediaFormat.getInteger("frame-rate");
        }
        return 30;
    }

    private final int getIFrameIntervalRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("i-frame-interval")) {
            return mediaFormat.getInteger("i-frame-interval");
        }
        return 1;
    }

    public final int findTrack(@NotNull MediaExtractor extractor, boolean z10) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i10);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (z10) {
                boolValueOf = string != null ? Boolean.valueOf(StringsKt.u2(string, "video/", false, 2, null)) : null;
                Intrinsics.checkNotNull(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i10;
                }
            } else {
                boolValueOf = string != null ? Boolean.valueOf(StringsKt.u2(string, "audio/", false, 2, null)) : null;
                Intrinsics.checkNotNull(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i10;
                }
            }
        }
        return -5;
    }

    @NotNull
    public final Pair<Integer, Integer> generateWidthAndHeight(double d10, double d11, boolean z10) {
        int iGenerateWidthHeightValue;
        int iGenerateWidthHeightValue2;
        if (z10) {
            return new Pair<>(Integer.valueOf(b.K0(d10)), Integer.valueOf(b.K0(d11)));
        }
        if (d10 >= 1920.0d || d11 >= 1920.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.5d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.5d);
        } else if (d10 >= 1280.0d || d11 >= 1280.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.75d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.75d);
        } else if (d10 >= 960.0d || d11 >= 960.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.95d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.95d);
        } else {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.9d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.9d);
        }
        return new Pair<>(Integer.valueOf(iGenerateWidthHeightValue), Integer.valueOf(iGenerateWidthHeightValue2));
    }

    public final int getBitrate(int i10, @NotNull VideoQuality quality) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        int i11 = WhenMappings.$EnumSwitchMapping$0[quality.ordinal()];
        if (i11 == 1) {
            return b.K0(((double) i10) * 0.1d);
        }
        if (i11 == 2) {
            return b.K0(((double) i10) * 0.2d);
        }
        if (i11 == 3) {
            return b.K0(((double) i10) * 0.3d);
        }
        if (i11 == 4) {
            return b.K0(((double) i10) * 0.4d);
        }
        if (i11 == 5) {
            return b.K0(((double) i10) * 0.6d);
        }
        throw new k0();
    }

    public final boolean hasQTI() {
        Iterator itA = i.a(new MediaCodecList(0).getCodecInfos());
        while (itA.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) itA.next();
            mediaCodecInfo.getName();
            String name = mediaCodecInfo.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            int i10 = 5 & 2;
            if (StringsKt.V2(name, "qti.avc", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final double prepareVideoHeight(@NotNull MediaMetadataRetriever mediaMetadataRetriever) {
        Intrinsics.checkNotNullParameter(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
        return (strExtractMetadata == null || strExtractMetadata.length() == 0) ? MIN_HEIGHT : Double.parseDouble(strExtractMetadata);
    }

    public final double prepareVideoWidth(@NotNull MediaMetadataRetriever mediaMetadataRetriever) {
        Intrinsics.checkNotNullParameter(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        return (strExtractMetadata == null || strExtractMetadata.length() == 0) ? MIN_WIDTH : Double.parseDouble(strExtractMetadata);
    }

    public final void printException(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        exception.getLocalizedMessage();
    }

    public final void setOutputFileParameters(@NotNull MediaFormat inputFormat, @NotNull MediaFormat outputFormat, int i10) {
        Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        int frameRate = getFrameRate(inputFormat);
        int iFrameIntervalRate = getIFrameIntervalRate(inputFormat);
        outputFormat.setInteger("color-format", 2130708361);
        outputFormat.setInteger("frame-rate", frameRate);
        outputFormat.setInteger("i-frame-interval", iFrameIntervalRate);
        outputFormat.setInteger("bitrate", i10);
        outputFormat.setInteger("bitrate-mode", 2);
        CompressorUtils compressorUtils = INSTANCE;
        Integer colorStandard = compressorUtils.getColorStandard(inputFormat);
        if (colorStandard != null) {
            outputFormat.setInteger("color-standard", colorStandard.intValue());
        }
        Integer colorTransfer = compressorUtils.getColorTransfer(inputFormat);
        if (colorTransfer != null) {
            outputFormat.setInteger("color-transfer", colorTransfer.intValue());
        }
        Integer colorRange = compressorUtils.getColorRange(inputFormat);
        if (colorRange != null) {
            outputFormat.setInteger("color-range", colorRange.intValue());
        }
        outputFormat.toString();
    }
}
