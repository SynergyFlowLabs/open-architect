package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.compose.runtime.internal.w0;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class c implements b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f305048g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f305049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final MediaMuxer f305050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f305051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f305052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f305053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f305054f;

    public c(@NotNull String path, float f10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f305049a = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.f305050b = new MediaMuxer(path, 0);
    }

    @Override // io.sentry.android.replay.video.b
    public boolean a() {
        return this.f305051c;
    }

    @Override // io.sentry.android.replay.video.b
    public void b(@NotNull ByteBuffer encodedData, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        long j10 = this.f305049a;
        int i10 = this.f305053e;
        this.f305053e = i10 + 1;
        long j11 = j10 * ((long) i10);
        this.f305054f = j11;
        bufferInfo.presentationTimeUs = j11;
        this.f305050b.writeSampleData(this.f305052d, encodedData, bufferInfo);
    }

    @Override // io.sentry.android.replay.video.b
    public void c(@NotNull MediaFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.f305052d = this.f305050b.addTrack(videoFormat);
        this.f305050b.start();
        this.f305051c = true;
    }

    @Override // io.sentry.android.replay.video.b
    public long d() {
        if (this.f305053e == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.f305054f + this.f305049a, TimeUnit.MICROSECONDS);
    }

    @Override // io.sentry.android.replay.video.b
    public void release() {
        this.f305050b.stop();
        this.f305050b.release();
    }
}
