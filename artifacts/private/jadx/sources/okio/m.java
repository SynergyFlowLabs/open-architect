package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface m extends z0, WritableByteChannel {
    @NotNull
    m C7(@NotNull b1 b1Var, long j10) throws IOException;

    @NotNull
    m K3(@NotNull String str, int i10, int i11) throws IOException;

    @NotNull
    m L9() throws IOException;

    long Ma(@NotNull b1 b1Var) throws IOException;

    @NotNull
    m Md(@NotNull String str, @NotNull Charset charset) throws IOException;

    @NotNull
    m O6(int i10) throws IOException;

    @NotNull
    m P5(@NotNull o oVar, int i10, int i11) throws IOException;

    @NotNull
    m U7(@NotNull o oVar) throws IOException;

    @kotlin.l(level = kotlin.n.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.b1(expression = "buffer", imports = {}))
    @NotNull
    l c1();

    @NotNull
    m c5(@NotNull String str, int i10, int i11, @NotNull Charset charset) throws IOException;

    @NotNull
    m d9(int i10) throws IOException;

    @NotNull
    m f1() throws IOException;

    @NotNull
    m f6(int i10) throws IOException;

    @Override // okio.z0, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    m h5(long j10) throws IOException;

    @NotNull
    m m2(long j10) throws IOException;

    @NotNull
    l n();

    @NotNull
    OutputStream nf();

    @NotNull
    m pa(@NotNull String str) throws IOException;

    @NotNull
    m q7(long j10) throws IOException;

    @NotNull
    m write(@NotNull byte[] bArr) throws IOException;

    @NotNull
    m write(@NotNull byte[] bArr, int i10, int i11) throws IOException;

    @NotNull
    m writeByte(int i10) throws IOException;

    @NotNull
    m writeInt(int i10) throws IOException;

    @NotNull
    m writeLong(long j10) throws IOException;

    @NotNull
    m writeShort(int i10) throws IOException;
}
