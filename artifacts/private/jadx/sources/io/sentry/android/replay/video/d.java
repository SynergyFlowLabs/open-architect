package io.sentry.android.replay.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.compose.runtime.internal.w0;
import androidx.media3.exoplayer.audio.s0;
import io.sentry.android.replay.util.o;
import io.sentry.n8;
import io.sentry.y7;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@e.b(26)
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f305055j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.video.a f305057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function0<Unit> f305058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f305059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final MediaCodec f305060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f305061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final MediaCodec.BufferInfo f305062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c f305063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Surface f305064i;

    @SourceDebugExtension({"SMAP\nSimpleVideoEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleVideoEncoder.kt\nio/sentry/android/replay/video/SimpleVideoEncoder$hasExynosCodec$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,307:1\n12474#2,2:308\n*S KotlinDebug\n*F\n+ 1 SimpleVideoEncoder.kt\nio/sentry/android/replay/video/SimpleVideoEncoder$hasExynosCodec$2\n*L\n58#1:308,2\n*E\n"})
    static final class a extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f305065a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z10 = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                String name = mediaCodecInfo.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                int i10 = 6 >> 2;
                if (StringsKt.V2(name, "c2.exynos", false, 2, null)) {
                    z10 = true;
                    break;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class b extends l0 implements Function0<MediaFormat> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MediaFormat invoke() {
            int i10 = d.this.g().i();
            try {
                MediaCodecInfo.VideoCapabilities videoCapabilities = d.this.e().getCodecInfo().getCapabilitiesForType(d.this.g().l()).getVideoCapabilities();
                if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(i10))) {
                    d.this.i().getLogger().c(y7.DEBUG, "Encoder doesn't support the provided bitRate: " + i10 + ", the value will be clamped to the closest one", new Object[0]);
                    Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(i10));
                    Intrinsics.checkNotNullExpressionValue(objClamp, "clamp(...)");
                    i10 = ((Number) objClamp).intValue();
                }
            } catch (Throwable th2) {
                d.this.i().getLogger().a(y7.DEBUG, "Could not retrieve MediaCodec info", th2);
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(d.this.g().l(), d.this.g().n(), d.this.g().m());
            Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", i10);
            mediaFormatCreateVideoFormat.setFloat("frame-rate", d.this.g().k());
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
            return mediaFormatCreateVideoFormat;
        }
    }

    public d(@NotNull n8 options, @NotNull io.sentry.android.replay.video.a muxerConfig, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.f305056a = options;
        this.f305057b = muxerConfig;
        this.f305058c = function0;
        j0 j0Var = j0.NONE;
        this.f305059d = g0.b(j0Var, a.f305065a);
        MediaCodec mediaCodecCreateByCodecName = d() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.l());
        Intrinsics.checkNotNull(mediaCodecCreateByCodecName);
        this.f305060e = mediaCodecCreateByCodecName;
        this.f305061f = g0.b(j0Var, new b());
        this.f305062g = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.j().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.f305063h = new c(absolutePath, muxerConfig.k());
    }

    private final void a(boolean z10) {
        ByteBuffer byteBuffer;
        if (this.f305056a.getSessionReplay().o()) {
            this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: drainCodec(" + z10 + ')', new Object[0]);
        }
        if (z10) {
            if (this.f305056a.getSessionReplay().o()) {
                this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            this.f305060e.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.f305060e.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.f305060e.dequeueOutputBuffer(this.f305062g, s0.f63372z);
            if (iDequeueOutputBuffer == -1) {
                if (!z10) {
                    break;
                } else if (this.f305056a.getSessionReplay().o()) {
                    this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f305060e.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f305063h.a()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f305060e.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                if (this.f305056a.getSessionReplay().o()) {
                    this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                }
                this.f305063h.c(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                if (this.f305056a.getSessionReplay().o()) {
                    this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, new Object[0]);
                }
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((this.f305062g.flags & 2) != 0) {
                    if (this.f305056a.getSessionReplay().o()) {
                        this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    this.f305062g.size = 0;
                }
                if (this.f305062g.size != 0) {
                    if (!this.f305063h.a()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.f305063h.b(byteBuffer, this.f305062g);
                    if (this.f305056a.getSessionReplay().o()) {
                        this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: sent " + this.f305062g.size + " bytes to muxer", new Object[0]);
                    }
                }
                this.f305060e.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.f305062g.flags & 4) != 0) {
                    if (!this.f305056a.getSessionReplay().o()) {
                        break;
                    }
                    if (z10) {
                        this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                        break;
                    } else {
                        this.f305056a.getLogger().c(y7.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                        return;
                    }
                }
            }
        }
    }

    private final boolean d() {
        return ((Boolean) this.f305059d.getValue()).booleanValue();
    }

    private final MediaFormat f() {
        return (MediaFormat) this.f305061f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    public final void b(@NotNull Bitmap image) {
        Surface surface;
        Canvas canvasLockCanvas;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.S2(MANUFACTURER, "xiaomi", true)) {
            surface = this.f305064i;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (StringsKt.S2(MANUFACTURER, "motorola", true)) {
                surface = this.f305064i;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                o oVar = o.f305035a;
                o.a aVar = o.a.SOC_MANUFACTURER;
                if (StringsKt.N1(o.b(oVar, aVar, null, 2, null), "spreadtrum", true) || StringsKt.N1(o.b(oVar, aVar, null, 2, null), "unisoc", true)) {
                    surface = this.f305064i;
                    if (surface != null) {
                        canvasLockCanvas = surface.lockCanvas(null);
                    } else {
                        canvasLockCanvas = null;
                    }
                } else {
                    Surface surface2 = this.f305064i;
                    if (surface2 != null) {
                        canvasLockCanvas = surface2.lockHardwareCanvas();
                    } else {
                        canvasLockCanvas = null;
                    }
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.f305064i;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        a(false);
    }

    public final long c() {
        return this.f305063h.d();
    }

    @NotNull
    public final MediaCodec e() {
        return this.f305060e;
    }

    @NotNull
    public final io.sentry.android.replay.video.a g() {
        return this.f305057b;
    }

    @Nullable
    public final Function0<Unit> h() {
        return this.f305058c;
    }

    @NotNull
    public final n8 i() {
        return this.f305056a;
    }

    public final void j() {
        try {
            Function0<Unit> function0 = this.f305058c;
            if (function0 != null) {
                function0.invoke();
            }
            a(true);
            this.f305060e.stop();
            this.f305060e.release();
            Surface surface = this.f305064i;
            if (surface != null) {
                surface.release();
            }
            this.f305063h.release();
        } catch (Throwable th2) {
            this.f305056a.getLogger().a(y7.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public final void k() {
        this.f305060e.configure(f(), (Surface) null, (MediaCrypto) null, 1);
        this.f305064i = this.f305060e.createInputSurface();
        this.f305060e.start();
        a(false);
    }

    public /* synthetic */ d(n8 n8Var, io.sentry.android.replay.video.a aVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n8Var, aVar, (i10 & 4) != 0 ? null : function0);
    }
}
