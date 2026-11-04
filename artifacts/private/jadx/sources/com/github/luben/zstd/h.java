package com.github.luben.zstd;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public class h implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f103033b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f103034c = Math.max(Math.max((int) ZstdOutputStreamNoFinalizer.recommendedCOutSize(), (int) ZstdInputStreamNoFinalizer.recommendedDInSize()), (int) ZstdInputStreamNoFinalizer.recommendedDOutSize());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<SoftReference<ByteBuffer>> f103035a = new ConcurrentLinkedQueue<>();

    private h() {
    }

    @Override // com.github.luben.zstd.c
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= f103034c) {
            byteBuffer.clear();
            this.f103035a.add(new SoftReference<>(byteBuffer));
        }
    }

    @Override // com.github.luben.zstd.c
    public ByteBuffer get(int i10) {
        ByteBuffer byteBuffer;
        int i11 = f103034c;
        if (i10 <= i11) {
            do {
                SoftReference<ByteBuffer> softReferencePoll = this.f103035a.poll();
                if (softReferencePoll == null) {
                    return ByteBuffer.allocate(f103034c);
                }
                byteBuffer = softReferencePoll.get();
            } while (byteBuffer == null);
            return byteBuffer;
        }
        throw new RuntimeException("Unsupported buffer size: " + i10 + ". Supported buffer sizes: " + i11 + " or smaller.");
    }
}
