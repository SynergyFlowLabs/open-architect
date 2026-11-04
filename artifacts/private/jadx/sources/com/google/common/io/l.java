package com.google.common.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f119035a = 2048;

    private static final class a extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f119036a = new a();

        private a() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c10) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int c10) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@fj.a CharSequence csq) {
            return this;
        }

        @Override // java.io.Writer
        public void write(char[] cbuf) {
            com.google.common.base.j0.E(cbuf);
        }

        @Override // java.io.Writer
        public void write(char[] cbuf, int off, int len) {
            com.google.common.base.j0.f0(off, len + off, cbuf.length);
        }

        @Override // java.io.Writer
        public void write(String str) {
            com.google.common.base.j0.E(str);
        }

        @Override // java.io.Writer
        public void write(String str, int off, int len) {
            com.google.common.base.j0.f0(off, len + off, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@fj.a CharSequence csq, int start, int end) {
            com.google.common.base.j0.f0(start, end, csq == null ? 4 : csq.length());
            return this;
        }
    }

    private l() {
    }

    public static Writer a(Appendable target) {
        return target instanceof Writer ? (Writer) target : new com.google.common.io.a(target);
    }

    @z7.a
    public static long b(Readable from, Appendable to) throws IOException {
        if (from instanceof Reader) {
            return to instanceof StringBuilder ? c((Reader) from, (StringBuilder) to) : d((Reader) from, a(to));
        }
        com.google.common.base.j0.E(from);
        com.google.common.base.j0.E(to);
        CharBuffer charBufferE = e();
        long jRemaining = 0;
        while (from.read(charBufferE) != -1) {
            x.b(charBufferE);
            to.append(charBufferE);
            jRemaining += (long) charBufferE.remaining();
            x.a(charBufferE);
        }
        return jRemaining;
    }

    @z7.a
    static long c(Reader from, StringBuilder to) throws IOException {
        com.google.common.base.j0.E(from);
        com.google.common.base.j0.E(to);
        char[] cArr = new char[2048];
        long j10 = 0;
        while (true) {
            int i10 = from.read(cArr);
            if (i10 == -1) {
                return j10;
            }
            to.append(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    @z7.a
    static long d(Reader from, Writer to) throws IOException {
        com.google.common.base.j0.E(from);
        com.google.common.base.j0.E(to);
        char[] cArr = new char[2048];
        long j10 = 0;
        while (true) {
            int i10 = from.read(cArr);
            if (i10 == -1) {
                return j10;
            }
            to.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    static CharBuffer e() {
        return CharBuffer.allocate(2048);
    }

    @z7.a
    public static long f(Readable readable) throws IOException {
        CharBuffer charBufferE = e();
        long j10 = 0;
        while (true) {
            long j11 = readable.read(charBufferE);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            x.a(charBufferE);
        }
    }

    public static Writer g() {
        return a.f119036a;
    }

    @z7.a
    @f0
    public static <T> T h(Readable readable, z<T> processor) throws IOException {
        String strB;
        com.google.common.base.j0.E(readable);
        com.google.common.base.j0.E(processor);
        a0 a0Var = new a0(readable);
        do {
            strB = a0Var.b();
            if (strB == null) {
                break;
            }
        } while (processor.a(strB));
        return processor.getResult();
    }

    public static List<String> i(Readable r10) throws IOException {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(r10);
        while (true) {
            String strB = a0Var.b();
            if (strB == null) {
                return arrayList;
            }
            arrayList.add(strB);
        }
    }

    public static void j(Reader reader, long n10) throws IOException {
        com.google.common.base.j0.E(reader);
        while (n10 > 0) {
            long jSkip = reader.skip(n10);
            if (jSkip == 0) {
                throw new EOFException();
            }
            n10 -= jSkip;
        }
    }

    public static String k(Readable r10) throws IOException {
        return l(r10).toString();
    }

    private static StringBuilder l(Readable r10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (r10 instanceof Reader) {
            c((Reader) r10, sb2);
            return sb2;
        }
        b(r10, sb2);
        return sb2;
    }
}
