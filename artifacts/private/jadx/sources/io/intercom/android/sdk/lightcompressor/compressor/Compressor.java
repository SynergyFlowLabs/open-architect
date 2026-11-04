package io.intercom.android.sdk.lightcompressor.compressor;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.view.Surface;
import io.intercom.android.sdk.lightcompressor.CompressionProgressListener;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.utils.CompressorUtils;
import io.intercom.android.sdk.lightcompressor.utils.StreamableVideo;
import io.intercom.android.sdk.lightcompressor.video.InputSurface;
import io.intercom.android.sdk.lightcompressor.video.OutputSurface;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.n1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Compressor {

    @NotNull
    private static final String INVALID_BITRATE = "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false";
    private static final long MEDIACODEC_TIMEOUT_DEFAULT = 100;

    @NotNull
    private static final String MIME_TYPE = "video/avc";
    private static final int MIN_BITRATE = 2000000;

    @NotNull
    public static final Compressor INSTANCE = new Compressor();
    private static boolean isRunning = true;

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2", f = "Compressor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Result>, Object> {
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $destination;
        final /* synthetic */ int $index;
        final /* synthetic */ CompressionProgressListener $listener;
        final /* synthetic */ Uri $srcUri;
        final /* synthetic */ String $streamableFile;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, Uri uri, int i10, Configuration configuration, String str, String str2, CompressionProgressListener compressionProgressListener, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$srcUri = uri;
            this.$index = i10;
            this.$configuration = configuration;
            this.$destination = str;
            this.$streamableFile = str2;
            this.$listener = compressionProgressListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$srcUri, this.$index, this.$configuration, this.$destination, this.$streamableFile, this.$listener, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0159  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            Pair<Integer, Integer> pairGenerateWidthAndHeight;
            int i10;
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            MediaExtractor mediaExtractor = new MediaExtractor();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.$context, this.$srcUri);
                Context context = this.$context;
                Uri uri = this.$srcUri;
                try {
                    kotlin.Result.a aVar = kotlin.Result.Companion;
                    mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
                    kotlin.Result.m785constructorimpl(Unit.f312394a);
                } catch (Throwable th2) {
                    kotlin.Result.a aVar2 = kotlin.Result.Companion;
                    kotlin.Result.m785constructorimpl(ResultKt.createFailure(th2));
                }
                CompressorUtils compressorUtils = CompressorUtils.INSTANCE;
                double dPrepareVideoHeight = compressorUtils.prepareVideoHeight(mediaMetadataRetriever);
                double dPrepareVideoWidth = compressorUtils.prepareVideoWidth(mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata == null || strExtractMetadata.length() == 0 || strExtractMetadata2 == null || strExtractMetadata2.length() == 0 || strExtractMetadata3 == null || strExtractMetadata3.length() == 0) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
                }
                try {
                    n1 n1Var = new n1(kotlin.coroutines.jvm.internal.b.f(Integer.parseInt(strExtractMetadata)), kotlin.coroutines.jvm.internal.b.f(Integer.parseInt(strExtractMetadata2)), kotlin.coroutines.jvm.internal.b.g(Long.parseLong(strExtractMetadata3) * ((long) 1000)));
                    int iIntValue2 = ((Number) n1Var.a()).intValue();
                    int iIntValue3 = ((Number) n1Var.b()).intValue();
                    long jLongValue = ((Number) n1Var.c()).longValue();
                    if (this.$configuration.isMinBitrateCheckEnabled() && iIntValue3 <= Compressor.MIN_BITRATE) {
                        return new Result(this.$index, false, Compressor.INVALID_BITRATE, 0L, null, 24, null);
                    }
                    if (this.$configuration.getVideoBitrateInMbps() == null) {
                        iIntValue = compressorUtils.getBitrate(iIntValue3, this.$configuration.getQuality());
                    } else {
                        Integer videoBitrateInMbps = this.$configuration.getVideoBitrateInMbps();
                        Intrinsics.checkNotNull(videoBitrateInMbps);
                        iIntValue = videoBitrateInMbps.intValue() * 1000000;
                    }
                    int i11 = iIntValue;
                    if (this.$configuration.getVideoHeight() != null) {
                        Double videoWidth = this.$configuration.getVideoWidth();
                        Integer numF = videoWidth != null ? kotlin.coroutines.jvm.internal.b.f((int) videoWidth.doubleValue()) : null;
                        Double videoHeight = this.$configuration.getVideoHeight();
                        pairGenerateWidthAndHeight = new Pair<>(numF, videoHeight != null ? kotlin.coroutines.jvm.internal.b.f((int) videoHeight.doubleValue()) : null);
                    } else {
                        pairGenerateWidthAndHeight = compressorUtils.generateWidthAndHeight(dPrepareVideoWidth, dPrepareVideoHeight, this.$configuration.getKeepOriginalResolution());
                    }
                    Integer numComponent1 = pairGenerateWidthAndHeight.component1();
                    Integer numComponent2 = pairGenerateWidthAndHeight.component2();
                    if (iIntValue2 == 90) {
                        numComponent1 = numComponent2;
                        numComponent2 = numComponent1;
                        i10 = 0;
                    } else if (iIntValue2 == 180) {
                        i10 = 0;
                    } else if (iIntValue2 != 270) {
                        i10 = iIntValue2;
                    } else {
                        numComponent1 = numComponent2;
                        numComponent2 = numComponent1;
                        i10 = 0;
                    }
                    Compressor compressor = Compressor.INSTANCE;
                    Integer num = numComponent2;
                    int i12 = this.$index;
                    Intrinsics.checkNotNull(numComponent1);
                    int iIntValue4 = numComponent1.intValue();
                    Intrinsics.checkNotNull(num);
                    return compressor.start(i12, iIntValue4, num.intValue(), this.$destination, i11, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, jLongValue, i10);
                } catch (Exception unused) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0L, null, 24, null);
                }
            } catch (IllegalArgumentException e10) {
                CompressorUtils.INSTANCE.printException(e10);
                return new Result(this.$index, false, String.valueOf(e10.getMessage()), 0L, null, 24, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Result> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private Compressor() {
    }

    private final int addAudioTrack(MediaMuxer mediaMuxer, boolean z10, MediaExtractor mediaExtractor) {
        int iFindTrack = CompressorUtils.INSTANCE.findTrack(mediaExtractor, false);
        if (iFindTrack < 0 || z10) {
            return -1;
        }
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
        return mediaMuxer.addTrack(trackFormat);
    }

    private final void dispose(int i10, MediaCodec mediaCodec, MediaCodec mediaCodec2, InputSurface inputSurface, OutputSurface outputSurface, MediaExtractor mediaExtractor) {
        mediaExtractor.unselectTrack(i10);
        mediaCodec.stop();
        mediaCodec.release();
        mediaCodec2.stop();
        mediaCodec2.release();
        inputSurface.release();
        outputSurface.release();
    }

    private final MediaCodec prepareDecoder(MediaFormat mediaFormat, OutputSurface outputSurface) throws IOException {
        String string = mediaFormat.getString("mime");
        Intrinsics.checkNotNull(string);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
        mediaCodecCreateDecoderByType.configure(mediaFormat, outputSurface.getSurface(), (MediaCrypto) null, 0);
        return mediaCodecCreateDecoderByType;
    }

    private final MediaCodec prepareEncoder(MediaFormat mediaFormat, boolean z10) throws IOException {
        MediaCodec mediaCodecCreateByCodecName = z10 ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        Intrinsics.checkNotNull(mediaCodecCreateByCodecName);
        try {
            mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return mediaCodecCreateByCodecName;
        } catch (Exception unused) {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return mediaCodecCreateEncoderByType;
        }
    }

    private final void processAudio(MediaMuxer mediaMuxer, int i10, MediaCodec.BufferInfo bufferInfo, boolean z10, MediaExtractor mediaExtractor) {
        int iFindTrack = CompressorUtils.INSTANCE.findTrack(mediaExtractor, false);
        if (iFindTrack < 0 || z10 || i10 < 0) {
            return;
        }
        mediaExtractor.selectTrack(iFindTrack);
        MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
        int integer = trackFormat.getInteger("max-input-size");
        if (integer <= 0) {
            integer = 65536;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(integer);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(...)");
        int sampleSize = (int) mediaExtractor.getSampleSize();
        if (sampleSize > integer) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(sampleSize + 1024);
        }
        mediaExtractor.seekTo(0L, 0);
        boolean z11 = false;
        while (!z11) {
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == iFindTrack) {
                int sampleData = mediaExtractor.readSampleData(byteBufferAllocateDirect, 0);
                bufferInfo.size = sampleData;
                if (sampleData >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.offset = 0;
                    bufferInfo.flags = 1;
                    mediaMuxer.writeSampleData(i10, byteBufferAllocateDirect, bufferInfo);
                    mediaExtractor.advance();
                } else {
                    bufferInfo.size = 0;
                    z11 = true;
                }
            } else if (sampleTrackIndex == -1) {
                z11 = true;
            }
        }
        mediaExtractor.unselectTrack(iFindTrack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:112:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0167 A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:42:0x011a, B:46:0x0136, B:85:0x0214, B:94:0x023a, B:98:0x0241, B:101:0x0249, B:50:0x0167, B:52:0x0173, B:54:0x017a, B:57:0x0187, B:64:0x01ab, B:66:0x01b1, B:68:0x01b6, B:71:0x01be, B:72:0x01c1, B:77:0x01d0, B:79:0x01d8, B:80:0x01f5, B:81:0x01f6, B:82:0x020c), top: B:154:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0173 A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:42:0x011a, B:46:0x0136, B:85:0x0214, B:94:0x023a, B:98:0x0241, B:101:0x0249, B:50:0x0167, B:52:0x0173, B:54:0x017a, B:57:0x0187, B:64:0x01ab, B:66:0x01b1, B:68:0x01b6, B:71:0x01be, B:72:0x01c1, B:77:0x01d0, B:79:0x01d8, B:80:0x01f5, B:81:0x01f6, B:82:0x020c), top: B:154:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x017a A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:42:0x011a, B:46:0x0136, B:85:0x0214, B:94:0x023a, B:98:0x0241, B:101:0x0249, B:50:0x0167, B:52:0x0173, B:54:0x017a, B:57:0x0187, B:64:0x01ab, B:66:0x01b1, B:68:0x01b6, B:71:0x01be, B:72:0x01c1, B:77:0x01d0, B:79:0x01d8, B:80:0x01f5, B:81:0x01f6, B:82:0x020c), top: B:154:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0181  */
    /* JADX WARN: Code duplicated, block: B:57:0x0187 A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:42:0x011a, B:46:0x0136, B:85:0x0214, B:94:0x023a, B:98:0x0241, B:101:0x0249, B:50:0x0167, B:52:0x0173, B:54:0x017a, B:57:0x0187, B:64:0x01ab, B:66:0x01b1, B:68:0x01b6, B:71:0x01be, B:72:0x01c1, B:77:0x01d0, B:79:0x01d8, B:80:0x01f5, B:81:0x01f6, B:82:0x020c), top: B:154:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ab A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:42:0x011a, B:46:0x0136, B:85:0x0214, B:94:0x023a, B:98:0x0241, B:101:0x0249, B:50:0x0167, B:52:0x0173, B:54:0x017a, B:57:0x0187, B:64:0x01ab, B:66:0x01b1, B:68:0x01b6, B:71:0x01be, B:72:0x01c1, B:77:0x01d0, B:79:0x01d8, B:80:0x01f5, B:81:0x01f6, B:82:0x020c), top: B:154:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1 A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:42:0x011a, B:46:0x0136, B:85:0x0214, B:94:0x023a, B:98:0x0241, B:101:0x0249, B:50:0x0167, B:52:0x0173, B:54:0x017a, B:57:0x0187, B:64:0x01ab, B:66:0x01b1, B:68:0x01b6, B:71:0x01be, B:72:0x01c1, B:77:0x01d0, B:79:0x01d8, B:80:0x01f5, B:81:0x01f6, B:82:0x020c), top: B:154:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214 A[Catch: Exception -> 0x0131, TryCatch #6 {Exception -> 0x0131, blocks: (B:42:0x011a, B:46:0x0136, B:85:0x0214, B:94:0x023a, B:98:0x0241, B:101:0x0249, B:50:0x0167, B:52:0x0173, B:54:0x017a, B:57:0x0187, B:64:0x01ab, B:66:0x01b1, B:68:0x01b6, B:71:0x01be, B:72:0x01c1, B:77:0x01d0, B:79:0x01d8, B:80:0x01f5, B:81:0x01f6, B:82:0x020c), top: B:154:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x021e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0232  */
    public final Result start(int i10, int i11, int i12, String str, int i13, String str2, boolean z10, MediaExtractor mediaExtractor, CompressionProgressListener compressionProgressListener, long j10, int i14) throws Throwable {
        MediaMuxer mediaMuxer;
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        boolean z11;
        boolean z12;
        boolean z13;
        MediaCodec mediaCodec3;
        int i15;
        boolean z14;
        int i16;
        int iDequeueOutputBuffer;
        ByteBuffer outputBuffer;
        boolean z15;
        int i17;
        MediaFormat outputFormat;
        int iAddTrack;
        int iDequeueOutputBuffer2;
        MediaCodec mediaCodec4;
        int iDequeueInputBuffer;
        Compressor compressor = this;
        int i18 = i10;
        if (i11 == 0 || i12 == 0) {
            return new Result(i10, false, "Something went wrong, please try again", 0L, null, 24, null);
        }
        File file = new File(str);
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            MediaMuxer mediaMuxer2 = new MediaMuxer(str, 0);
            if (i14 != 0) {
                mediaMuxer2.setOrientationHint(i14);
            }
            CompressorUtils compressorUtils = CompressorUtils.INSTANCE;
            int iFindTrack = compressorUtils.findTrack(mediaExtractor, true);
            mediaExtractor.selectTrack(iFindTrack);
            mediaExtractor.seekTo(0L, 0);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i11, i12);
            Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            compressorUtils.setOutputFileParameters(trackFormat, mediaFormatCreateVideoFormat, i13);
            MediaCodec mediaCodecPrepareEncoder = compressor.prepareEncoder(mediaFormatCreateVideoFormat, compressorUtils.hasQTI());
            try {
                InputSurface inputSurface = new InputSurface(mediaCodecPrepareEncoder.createInputSurface());
                inputSurface.makeCurrent();
                mediaCodecPrepareEncoder.start();
                OutputSurface outputSurface = new OutputSurface();
                MediaCodec mediaCodecPrepareDecoder = compressor.prepareDecoder(trackFormat, outputSurface);
                mediaCodecPrepareDecoder.start();
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                int iAddAudioTrack = -1;
                int i19 = -5;
                while (!z16) {
                    if (z17) {
                        mediaCodec = mediaCodecPrepareEncoder;
                    } else {
                        int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                        if (sampleTrackIndex == iFindTrack) {
                            mediaCodec = mediaCodecPrepareEncoder;
                            int iDequeueInputBuffer2 = mediaCodecPrepareDecoder.dequeueInputBuffer(MEDIACODEC_TIMEOUT_DEFAULT);
                            if (iDequeueInputBuffer2 >= 0) {
                                ByteBuffer inputBuffer = mediaCodecPrepareDecoder.getInputBuffer(iDequeueInputBuffer2);
                                Intrinsics.checkNotNull(inputBuffer);
                                int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                                if (sampleData < 0) {
                                    mediaCodec2 = mediaCodecPrepareDecoder;
                                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer2, 0, 0, 0L, 4);
                                    z17 = true;
                                } else {
                                    MediaCodec mediaCodec5 = mediaCodecPrepareDecoder;
                                    mediaCodec5.queueInputBuffer(iDequeueInputBuffer2, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                                    mediaCodec4 = mediaCodec5;
                                    mediaExtractor.advance();
                                    mediaCodec2 = mediaCodec4;
                                }
                            }
                        } else {
                            mediaCodec = mediaCodecPrepareEncoder;
                            mediaCodec4 = mediaCodecPrepareDecoder;
                            if (sampleTrackIndex != -1 || (iDequeueInputBuffer = mediaCodec4.dequeueInputBuffer(MEDIACODEC_TIMEOUT_DEFAULT)) < 0) {
                                mediaCodec2 = mediaCodec4;
                            } else {
                                mediaCodec2 = mediaCodec4;
                                mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                z17 = true;
                            }
                        }
                        z11 = true;
                        z12 = true;
                        while (true) {
                            if (!z11 && !z12) {
                                break;
                            }
                            if (!isRunning) {
                                dispose(iFindTrack, mediaCodec2, mediaCodec, inputSurface, outputSurface, mediaExtractor);
                                compressionProgressListener.onProgressCancelled(i18);
                                return new Result(i10, false, "The compression has stopped!", 0L, null, 24, null);
                            }
                            try {
                                z13 = z16;
                                InputSurface inputSurface2 = inputSurface;
                                mediaCodec3 = mediaCodec2;
                                i15 = iAddAudioTrack;
                                iFindTrack = iFindTrack;
                                mediaCodec = mediaCodec;
                                z14 = z11;
                                i16 = i19;
                                iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                                if (iDequeueOutputBuffer == -1) {
                                    z16 = z13;
                                    iAddAudioTrack = i15;
                                    i19 = i16;
                                    z12 = false;
                                    i17 = -1;
                                    z15 = false;
                                } else {
                                    if (iDequeueOutputBuffer == -2) {
                                        outputFormat = mediaCodec.getOutputFormat();
                                        Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                                        if (i16 == -5) {
                                            iAddTrack = mediaMuxer2.addTrack(outputFormat);
                                            if (i15 == -1) {
                                                iAddAudioTrack = addAudioTrack(mediaMuxer2, z10, mediaExtractor);
                                            } else {
                                                iAddAudioTrack = i15;
                                            }
                                            if (z18) {
                                                z16 = z13;
                                                i19 = iAddTrack;
                                                z15 = false;
                                                i17 = -1;
                                            } else {
                                                mediaMuxer2.start();
                                                z16 = z13;
                                                i19 = iAddTrack;
                                                z15 = false;
                                                i17 = -1;
                                                z18 = true;
                                            }
                                        }
                                    } else {
                                        if (iDequeueOutputBuffer != -3) {
                                            if (iDequeueOutputBuffer >= 0) {
                                                throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                            }
                                            outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                                            if (outputBuffer != null) {
                                                throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                            }
                                            if (bufferInfo.size > 1 && (bufferInfo.flags & 2) == 0 && z18) {
                                                mediaMuxer2.writeSampleData(i16, outputBuffer, bufferInfo);
                                            }
                                            if ((bufferInfo.flags & 4) != 0) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            z15 = false;
                                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                        }
                                        iAddAudioTrack = i15;
                                        i19 = i16;
                                        i17 = -1;
                                    }
                                    z15 = false;
                                    z16 = z13;
                                    iAddAudioTrack = i15;
                                    i19 = i16;
                                    i17 = -1;
                                }
                                if (iDequeueOutputBuffer != i17) {
                                    i18 = i10;
                                    z11 = z14;
                                } else {
                                    iDequeueOutputBuffer2 = mediaCodec3.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                                    if (iDequeueOutputBuffer2 == i17) {
                                        z11 = z15;
                                        i18 = i10;
                                    } else {
                                        if (iDequeueOutputBuffer2 != -3 || iDequeueOutputBuffer2 == -2) {
                                            i18 = i10;
                                        } else {
                                            if (iDequeueOutputBuffer2 < 0) {
                                                throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer2);
                                            }
                                            boolean z19 = bufferInfo.size != 0 ? true : z15;
                                            mediaCodec3.releaseOutputBuffer(iDequeueOutputBuffer2, z19);
                                            if (z19) {
                                                try {
                                                    outputSurface.awaitNewImage();
                                                    outputSurface.drawImage();
                                                    inputSurface2.setPresentationTime(bufferInfo.presentationTimeUs * ((long) 1000));
                                                    i18 = i10;
                                                    compressionProgressListener.onProgressChanged(i18, (bufferInfo.presentationTimeUs / j10) * 100);
                                                    inputSurface2.swapBuffers();
                                                } catch (Exception e10) {
                                                    i18 = i10;
                                                    e10.getMessage();
                                                }
                                            } else {
                                                i18 = i10;
                                            }
                                            if ((bufferInfo.flags & 4) != 0) {
                                                mediaCodec.signalEndOfInputStream();
                                                z11 = false;
                                            }
                                            e = e;
                                        }
                                        z11 = z14;
                                    }
                                }
                                mediaCodec2 = mediaCodec3;
                                inputSurface = inputSurface2;
                            } catch (Exception e11) {
                                e = e11;
                            }
                            CompressorUtils.INSTANCE.printException(e);
                            return new Result(i10, false, e.getMessage(), 0L, null, 24, null);
                        }
                        compressor = this;
                        mediaCodecPrepareEncoder = mediaCodec;
                        mediaCodecPrepareDecoder = mediaCodec2;
                    }
                    mediaCodec2 = mediaCodecPrepareDecoder;
                    z11 = true;
                    z12 = true;
                    while (true) {
                        if (!z11) {
                        }
                        if (!isRunning) {
                            dispose(iFindTrack, mediaCodec2, mediaCodec, inputSurface, outputSurface, mediaExtractor);
                            compressionProgressListener.onProgressCancelled(i18);
                            return new Result(i10, false, "The compression has stopped!", 0L, null, 24, null);
                        }
                        z13 = z16;
                        InputSurface inputSurface3 = inputSurface;
                        mediaCodec3 = mediaCodec2;
                        i15 = iAddAudioTrack;
                        iFindTrack = iFindTrack;
                        mediaCodec = mediaCodec;
                        z14 = z11;
                        i16 = i19;
                        iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                        if (iDequeueOutputBuffer == -1) {
                            z16 = z13;
                            iAddAudioTrack = i15;
                            i19 = i16;
                            z12 = false;
                            i17 = -1;
                            z15 = false;
                        } else {
                            if (iDequeueOutputBuffer == -2) {
                                outputFormat = mediaCodec.getOutputFormat();
                                Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                                if (i16 == -5) {
                                    iAddTrack = mediaMuxer2.addTrack(outputFormat);
                                    if (i15 == -1) {
                                        iAddAudioTrack = addAudioTrack(mediaMuxer2, z10, mediaExtractor);
                                    } else {
                                        iAddAudioTrack = i15;
                                    }
                                    if (z18) {
                                        mediaMuxer2.start();
                                        z16 = z13;
                                        i19 = iAddTrack;
                                        z15 = false;
                                        i17 = -1;
                                        z18 = true;
                                    } else {
                                        z16 = z13;
                                        i19 = iAddTrack;
                                        z15 = false;
                                        i17 = -1;
                                    }
                                }
                            } else {
                                if (iDequeueOutputBuffer != -3) {
                                    if (iDequeueOutputBuffer >= 0) {
                                        throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                    }
                                    outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                                    if (outputBuffer != null) {
                                        throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                    }
                                    if (bufferInfo.size > 1) {
                                        mediaMuxer2.writeSampleData(i16, outputBuffer, bufferInfo);
                                    }
                                    if ((bufferInfo.flags & 4) != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    z15 = false;
                                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                }
                                iAddAudioTrack = i15;
                                i19 = i16;
                                i17 = -1;
                            }
                            z15 = false;
                            z16 = z13;
                            iAddAudioTrack = i15;
                            i19 = i16;
                            i17 = -1;
                        }
                        if (iDequeueOutputBuffer != i17) {
                            i18 = i10;
                            z11 = z14;
                        } else {
                            iDequeueOutputBuffer2 = mediaCodec3.dequeueOutputBuffer(bufferInfo, MEDIACODEC_TIMEOUT_DEFAULT);
                            if (iDequeueOutputBuffer2 == i17) {
                                z11 = z15;
                                i18 = i10;
                            } else if (iDequeueOutputBuffer2 != -3) {
                                i18 = i10;
                                z11 = z14;
                            } else {
                                i18 = i10;
                                z11 = z14;
                            }
                        }
                        mediaCodec2 = mediaCodec3;
                        inputSurface = inputSurface3;
                        CompressorUtils.INSTANCE.printException(e);
                        return new Result(i10, false, e.getMessage(), 0L, null, 24, null);
                    }
                    compressor = this;
                    mediaCodecPrepareEncoder = mediaCodec;
                    mediaCodecPrepareDecoder = mediaCodec2;
                }
                compressor.dispose(iFindTrack, mediaCodecPrepareDecoder, mediaCodecPrepareEncoder, inputSurface, outputSurface, mediaExtractor);
                if (z18) {
                    mediaMuxer = mediaMuxer2;
                    processAudio(mediaMuxer, iAddAudioTrack, bufferInfo, z10, mediaExtractor);
                } else {
                    mediaMuxer = mediaMuxer2;
                }
                mediaExtractor.release();
                try {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                } catch (Exception e12) {
                    CompressorUtils.INSTANCE.printException(e12);
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            CompressorUtils.INSTANCE.printException(e14);
        }
        if (str2 != null) {
            try {
                boolean zStart = StreamableVideo.INSTANCE.start(file, new File(str2));
                File file2 = new File(str2);
                if (zStart) {
                    try {
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception e15) {
                        e = e15;
                        file = file2;
                        CompressorUtils.INSTANCE.printException(e);
                    }
                }
                file = file2;
            } catch (Exception e16) {
                e = e16;
            }
        }
        return new Result(i10, true, null, file.length(), file.getPath());
    }

    @Nullable
    public final Object compressVideo(int i10, @NotNull Context context, @NotNull Uri uri, @NotNull String str, @Nullable String str2, @NotNull Configuration configuration, @NotNull CompressionProgressListener compressionProgressListener, @NotNull d<? super Result> dVar) {
        return i.h(l1.a(), new AnonymousClass2(context, uri, i10, configuration, str, str2, compressionProgressListener, null), dVar);
    }

    public final boolean isRunning() {
        return isRunning;
    }

    public final void setRunning(boolean z10) {
        isRunning = z10;
    }
}
