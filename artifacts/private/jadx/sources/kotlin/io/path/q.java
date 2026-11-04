package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.e1;
import kotlin.io.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,346:1\n1#2:347\n1#2:352\n54#3,4:348\n1317#4,2:353\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n219#1:352\n219#1:348,4\n219#1:353,2\n*E\n"})
class q {
    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path A(Path path, Sequence<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, kotlin.sequences.o.N(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path B(Path path, Iterable lines, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path C(Path path, Sequence lines, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, kotlin.sequences.o.N(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    public static final void D(@NotNull Path path, @NotNull CharSequence text, @NotNull Charset charset, @NotNull OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        try {
            if (text instanceof String) {
                Intrinsics.checkNotNull(outputStreamNewOutputStream);
                kotlin.io.l.J(outputStreamNewOutputStream, (String) text, charset);
            } else {
                CharsetEncoder charsetEncoderT = kotlin.io.l.t(charset);
                CharBuffer charBufferAsReadOnlyBuffer = text instanceof CharBuffer ? ((CharBuffer) text).asReadOnlyBuffer() : CharBuffer.wrap(text);
                int iMin = Math.min(text.length(), 8192);
                Intrinsics.checkNotNull(charsetEncoderT);
                ByteBuffer byteBufferN = kotlin.io.l.n(iMin, charsetEncoderT);
                while (charBufferAsReadOnlyBuffer.hasRemaining()) {
                    if (charsetEncoderT.encode(charBufferAsReadOnlyBuffer, byteBufferN, true).isError()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    outputStreamNewOutputStream.write(byteBufferN.array(), 0, byteBufferN.position());
                    byteBufferN.clear();
                }
            }
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(outputStreamNewOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(outputStreamNewOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final OutputStreamWriter F(Path path, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final void a(Path path, byte[] array) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        Files.write(path, array, StandardOpenOption.APPEND);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path b(Path path, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path c(Path path, Sequence<? extends CharSequence> lines, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        boolean z10 = true;
        Path pathWrite = Files.write(path, kotlin.sequences.o.N(lines), charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path d(Path path, Iterable lines, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    static /* synthetic */ Path e(Path path, Sequence lines, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path pathWrite = Files.write(path, kotlin.sequences.o.N(lines), charset, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    public static final void f(@NotNull Path path, @NotNull CharSequence text, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        D(path, text, charset, StandardOpenOption.APPEND);
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        f(path, charSequence, charset);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final BufferedReader h(Path path, Charset charset, int i10, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    static /* synthetic */ BufferedReader i(Path path, Charset charset, int i10, OpenOption[] options, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final BufferedWriter j(Path path, Charset charset, int i10, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i10, OpenOption[] options, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final void l(Path path, Charset charset, Function1<? super String, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        Intrinsics.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = x.h(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f312394a;
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(bufferedReaderNewBufferedReader, null);
            } else {
                bufferedReaderNewBufferedReader.close();
            }
            h0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(bufferedReaderNewBufferedReader, th2);
                } else {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ void m(Path path, Charset charset, Function1 action, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        Intrinsics.checkNotNullExpressionValue(bufferedReaderNewBufferedReader, "newBufferedReader(...)");
        try {
            Iterator<String> it = x.h(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f312394a;
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(bufferedReaderNewBufferedReader, null);
            } else {
                bufferedReaderNewBufferedReader.close();
            }
            h0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(bufferedReaderNewBufferedReader, th2);
                } else {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final InputStream n(Path path, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return inputStreamNewInputStream;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final OutputStream o(Path path, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return outputStreamNewOutputStream;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final byte[] p(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        byte[] allBytes = Files.readAllBytes(path);
        Intrinsics.checkNotNullExpressionValue(allBytes, "readAllBytes(...)");
        return allBytes;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final List<String> q(Path path, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        Intrinsics.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    static /* synthetic */ List r(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        Intrinsics.checkNotNullExpressionValue(allLines, "readAllLines(...)");
        return allLines;
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @NotNull
    public static final String s(@NotNull Path path, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String strK = x.k(inputStreamReader);
            kotlin.io.c.a(inputStreamReader, null);
            return strK;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return s(path, charset);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final InputStreamReader u(Path path, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final <T> T w(Path path, Charset charset, Function1<? super Sequence<String>, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        int i10 = 2 ^ 1;
        try {
            Intrinsics.checkNotNull(bufferedReaderNewBufferedReader);
            T tInvoke = block.invoke(x.h(bufferedReaderNewBufferedReader));
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(bufferedReaderNewBufferedReader, th2);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ Object x(Path path, Charset charset, Function1 block, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        try {
            Intrinsics.checkNotNull(bufferedReaderNewBufferedReader);
            Object objInvoke = block.invoke(x.h(bufferedReaderNewBufferedReader));
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.c.a(bufferedReaderNewBufferedReader, null);
            } else if (bufferedReaderNewBufferedReader != null) {
                bufferedReaderNewBufferedReader.close();
            }
            h0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.c.a(bufferedReaderNewBufferedReader, th2);
                } else if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final void y(Path path, byte[] array, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(options, "options");
        Files.write(path, array, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @m2(markerClass = {e.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final Path z(Path path, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(pathWrite, "write(...)");
        return pathWrite;
    }
}
