package kotlin.io;

import androidx.collection.g3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public class n extends m {

    static final class a extends l0 implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f312596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f312596a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f312596a.add(it);
        }
    }

    @NotNull
    public static String A(@NotNull File file, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strK = x.k(inputStreamReader);
            c.a(inputStreamReader, null);
            return strK;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String B(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return A(file, charset);
    }

    @kotlin.internal.f
    private static final InputStreamReader C(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader D(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T E(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super Sequence<String>, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T tInvoke = block.invoke(x.h(bufferedReader));
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                c.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    c.a(bufferedReader, th2);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    public static /* synthetic */ Object F(File file, Charset charset, Function1 block, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        int i11 = 6 << 0;
        try {
            Object objInvoke = block.invoke(x.h(bufferedReader));
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                c.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            h0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    c.a(bufferedReader, th2);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }

    public static void G(@NotNull File file, @NotNull byte[] array) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f312394a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static void H(@NotNull File file, @NotNull String text, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            J(fileOutputStream, text, charset);
            Unit unit = Unit.f312394a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void I(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        H(file, str, charset);
    }

    public static void J(@NotNull OutputStream outputStream, @NotNull String text, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderT = t(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        Intrinsics.checkNotNull(charsetEncoderT);
        ByteBuffer byteBufferN = n(8192, charsetEncoderT);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderT.encode(charBufferAllocate, byteBufferN, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferN.array(), 0, byteBufferN.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferN.clear();
            i10 = i12;
        }
    }

    @kotlin.internal.f
    private static final OutputStreamWriter K(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter L(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@NotNull File file, @NotNull byte[] array) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f312394a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void h(@NotNull File file, @NotNull String text, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            J(fileOutputStream, text, charset);
            Unit unit = Unit.f312394a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        h(file, str, charset);
    }

    @kotlin.internal.f
    private static final BufferedReader j(File file, Charset charset, int i10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i10);
    }

    static /* synthetic */ BufferedReader k(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i10);
    }

    @kotlin.internal.f
    private static final BufferedWriter l(File file, Charset charset, int i10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i10);
    }

    static /* synthetic */ BufferedWriter m(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i10);
    }

    @NotNull
    public static ByteBuffer n(int i10, @NotNull CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[], java.lang.Object] */
    public static final void o(@NotNull File file, int i10, @NotNull Function2<? super byte[], ? super Integer, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ?? r10 = new byte[kotlin.ranges.r.u(i10, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(r10);
                if (i11 <= 0) {
                    Unit unit = Unit.f312394a;
                    c.a(fileInputStream, null);
                    return;
                }
                action.invoke(r10, Integer.valueOf(i11));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(fileInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public static final void p(@NotNull File file, @NotNull Function2<? super byte[], ? super Integer, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        o(file, 4096, action);
    }

    public static final void q(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        x.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void r(File file, Charset charset, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        q(file, charset, function1);
    }

    @kotlin.internal.f
    private static final FileInputStream s(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new FileInputStream(file);
    }

    public static CharsetEncoder t(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @kotlin.internal.f
    private static final FileOutputStream u(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new FileOutputStream(file);
    }

    @kotlin.internal.f
    private static final PrintWriter v(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    static /* synthetic */ PrintWriter w(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @NotNull
    public static byte[] x(@NotNull File file) throws IOException {
        int i10;
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > g3.f12256c) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i11 = (int) length;
            byte[] bArrCopyInto = new byte[i11];
            int i12 = i11;
            int i13 = 0;
            while (i12 > 0 && (i10 = fileInputStream.read(bArrCopyInto, i13, i12)) >= 0) {
                i12 -= i10;
                i13 += i10;
            }
            if (i12 > 0) {
                bArrCopyInto = Arrays.copyOf(bArrCopyInto, i13);
                Intrinsics.checkNotNullExpressionValue(bArrCopyInto, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    g gVar = new g(8193);
                    gVar.write(i14);
                    b.l(fileInputStream, gVar, 0, 2, null);
                    int size = gVar.size() + i11;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = gVar.a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrCopyInto, size);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    bArrCopyInto = ArraysKt.copyInto(bArrA, bArrCopyOf, i11, 0, gVar.size());
                }
            }
            c.a(fileInputStream, null);
            return bArrCopyInto;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final List<String> y(@NotNull File file, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        ArrayList arrayList = new ArrayList();
        q(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List z(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return y(file, charset);
    }
}
