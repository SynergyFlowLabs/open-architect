package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.b1;
import kotlin.collections.ByteIterator;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "ByteStreamsKt")
public final class b {

    public static final class a extends ByteIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f312523a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f312524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f312525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BufferedInputStream f312526d;

        a(BufferedInputStream bufferedInputStream) {
            this.f312526d = bufferedInputStream;
        }

        private final void e() throws IOException {
            if (this.f312524b || this.f312525c) {
                return;
            }
            int i10 = this.f312526d.read();
            this.f312523a = i10;
            this.f312524b = true;
            this.f312525c = i10 == -1;
        }

        public final boolean b() {
            return this.f312525c;
        }

        public final int c() {
            return this.f312523a;
        }

        public final boolean d() {
            return this.f312524b;
        }

        public final void f(boolean z10) {
            this.f312525c = z10;
        }

        public final void g(int i10) {
            this.f312523a = i10;
        }

        public final void h(boolean z10) {
            this.f312524b = z10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            e();
            return !this.f312525c;
        }

        @Override // kotlin.collections.ByteIterator
        public byte nextByte() throws IOException {
            e();
            if (this.f312525c) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b10 = (byte) this.f312523a;
            this.f312524b = false;
            return b10;
        }
    }

    @kotlin.internal.f
    private static final BufferedInputStream a(InputStream inputStream, int i10) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    @kotlin.internal.f
    private static final BufferedOutputStream b(OutputStream outputStream, int i10) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    @kotlin.internal.f
    private static final BufferedReader e(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @kotlin.internal.f
    private static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream i(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@NotNull InputStream inputStream, @NotNull OutputStream out, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return k(inputStream, outputStream, i10);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream m(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream n(byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i10, i11);
    }

    @NotNull
    public static final ByteIterator o(@NotNull BufferedInputStream bufferedInputStream) {
        Intrinsics.checkNotNullParameter(bufferedInputStream, "<this>");
        return new a(bufferedInputStream);
    }

    @e1(version = "1.3")
    @NotNull
    public static final byte[] p(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @kotlin.l(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @b1(expression = "readBytes()", imports = {}))
    @kotlin.m(errorSince = "1.5", warningSince = "1.3")
    @NotNull
    public static final byte[] q(@NotNull InputStream inputStream, int i10) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        return q(inputStream, i10);
    }

    @kotlin.internal.f
    private static final InputStreamReader s(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @kotlin.internal.f
    private static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
