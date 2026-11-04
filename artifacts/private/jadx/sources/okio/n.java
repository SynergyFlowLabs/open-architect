package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface n extends b1, ReadableByteChannel {
    short B4() throws IOException;

    @NotNull
    o E5(long j10) throws IOException;

    void H9(@NotNull l lVar, long j10) throws IOException;

    long J8() throws IOException;

    long J9(byte b10, long j10, long j11) throws IOException;

    long M2(byte b10, long j10) throws IOException;

    long M4() throws IOException;

    @NotNull
    String O7() throws IOException;

    long P2(@NotNull o oVar) throws IOException;

    @NotNull
    String R9(long j10) throws IOException;

    @Nullable
    String S2() throws IOException;

    @NotNull
    String S7(long j10, @NotNull Charset charset) throws IOException;

    long V1(@NotNull o oVar, long j10) throws IOException;

    @NotNull
    byte[] Y5() throws IOException;

    @NotNull
    String b7(@NotNull Charset charset) throws IOException;

    @kotlin.l(level = kotlin.n.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.b1(expression = "buffer", imports = {}))
    @NotNull
    l c1();

    long dd() throws IOException;

    long f5(@NotNull o oVar, long j10) throws IOException;

    int fe() throws IOException;

    long g8(@NotNull z0 z0Var) throws IOException;

    @Nullable
    <T> T ha(@NotNull f1<T> f1Var) throws IOException;

    long j5(byte b10) throws IOException;

    int k7() throws IOException;

    @NotNull
    String lb() throws IOException;

    @NotNull
    l n();

    boolean ob(long j10, @NotNull o oVar, int i10, int i11) throws IOException;

    @NotNull
    n peek();

    void q1(long j10) throws IOException;

    @NotNull
    o r7() throws IOException;

    int read(@NotNull byte[] bArr) throws IOException;

    int read(@NotNull byte[] bArr, int i10, int i11) throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j10) throws IOException;

    @NotNull
    InputStream rf();

    void skip(long j10) throws IOException;

    @NotNull
    byte[] tb(long j10) throws IOException;

    boolean u3(long j10, @NotNull o oVar) throws IOException;

    @NotNull
    String u5(long j10) throws IOException;

    long x2(@NotNull o oVar) throws IOException;

    int xf(@NotNull p0 p0Var) throws IOException;

    boolean y1() throws IOException;
}
