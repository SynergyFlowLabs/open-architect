package o4;

import coil.request.n;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d<byte[], ByteBuffer> {
    @Override // o4.d
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(@NotNull byte[] bArr, @NotNull n nVar) {
        return ByteBuffer.wrap(bArr);
    }
}
