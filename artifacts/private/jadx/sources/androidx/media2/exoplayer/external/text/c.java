package androidx.media2.exoplayer.external.text;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class c extends androidx.media2.exoplayer.external.decoder.g<i, j, g> implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f56558n;

    protected c(String name) {
        super(new i[2], new j[2]);
        this.f56558n = name;
        u(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.decoder.g
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void r(j buffer) {
        super.r(buffer);
    }

    @Override // androidx.media2.exoplayer.external.text.f
    public void d(long timeUs) {
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    public final String getName() {
        return this.f56558n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.decoder.g
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final i g() {
        return new i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.decoder.g
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final j h() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.decoder.g
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final g i(Throwable error) {
        return new g("Unexpected decode error", error);
    }

    protected abstract e y(byte[] data, int size, boolean reset) throws g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.decoder.g
    @p0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final g j(i inputBuffer, j outputBuffer, boolean reset) {
        try {
            ByteBuffer byteBuffer = inputBuffer.f53789c;
            outputBuffer.z(inputBuffer.f53790d, y(byteBuffer.array(), byteBuffer.limit(), reset), inputBuffer.f56773j);
            outputBuffer.p(Integer.MIN_VALUE);
            return null;
        } catch (g e10) {
            return e10;
        }
    }
}
