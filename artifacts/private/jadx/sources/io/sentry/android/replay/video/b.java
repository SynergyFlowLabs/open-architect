package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface b {
    boolean a();

    void b(@NotNull ByteBuffer byteBuffer, @NotNull MediaCodec.BufferInfo bufferInfo);

    void c(@NotNull MediaFormat mediaFormat);

    long d();

    void release();
}
