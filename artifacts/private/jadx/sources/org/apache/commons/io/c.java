package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f336436a = 4096;

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i10 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (-1 == i11) {
                return i10;
            }
            outputStream.write(bArr, 0, i11);
            i10 += i11;
        }
    }

    public static int b(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        int i10 = 0;
        while (true) {
            int i11 = reader.read(cArr);
            if (-1 == i11) {
                return i10;
            }
            writer.write(cArr, 0, i11);
            i10 += i11;
        }
    }

    @Deprecated
    public static void c(InputStream inputStream, Writer writer) throws IOException {
        b(new InputStreamReader(inputStream, Charset.defaultCharset()), writer);
    }

    public static void d(InputStream inputStream, Writer writer, String str) throws IOException {
        b(new InputStreamReader(inputStream, str), writer);
    }

    @Deprecated
    public static void e(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        b(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void f(Reader reader, OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        b(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    @Deprecated
    public static void g(String str, OutputStream outputStream) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        b(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void h(String str, OutputStream outputStream, String str2) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str2);
        b(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void i(String str, Writer writer) throws IOException {
        writer.write(str);
    }

    public static void j(byte[] bArr, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
    }

    @Deprecated
    public static void k(byte[] bArr, Writer writer) throws IOException {
        c(new ByteArrayInputStream(bArr), writer);
    }

    public static void l(byte[] bArr, Writer writer, String str) throws IOException {
        d(new ByteArrayInputStream(bArr), writer, str);
    }
}
