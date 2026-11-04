package kotlin.io;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n54#1,4:158\n1#2:162\n1#2:165\n1317#3,2:163\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158,4\n35#1:162\n35#1:163,2\n*E\n"})
@oj.i(name = "TextStreamsKt")
public final class x {

    static final class a extends l0 implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f312710a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f312710a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f312710a.add(it);
        }
    }

    @kotlin.internal.f
    private static final BufferedReader a(Reader reader, int i10) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    @kotlin.internal.f
    private static final BufferedWriter b(Writer writer, int i10) {
        Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    static /* synthetic */ BufferedReader c(Reader reader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    static /* synthetic */ BufferedWriter d(Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    public static final long e(@NotNull Reader reader, @NotNull Writer out, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return e(reader, writer, i10);
    }

    public static final void g(@NotNull Reader reader, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f312394a;
            c.a(bufferedReader, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final Sequence<String> h(@NotNull BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return kotlin.sequences.o.f(new r(bufferedReader));
    }

    @NotNull
    public static final byte[] i(@NotNull URL url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "<this>");
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            Intrinsics.checkNotNull(inputStreamOpenStream);
            byte[] bArrP = b.p(inputStreamOpenStream);
            c.a(inputStreamOpenStream, null);
            return bArrP;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(inputStreamOpenStream, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final List<String> j(@NotNull Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @NotNull
    public static final String k(@NotNull Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @kotlin.internal.f
    private static final String l(URL url, Charset charset) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(i(url), charset);
    }

    static /* synthetic */ String m(URL url, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(i(url), charset);
    }

    @kotlin.internal.f
    private static final StringReader n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T o(@NotNull Reader reader, @NotNull Function1<? super Sequence<String>, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T tInvoke = block.invoke(h(bufferedReader));
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
}
