package org.apache.commons.io;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.g3;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f336794a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f336795b = '/';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f336796c = '\\';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f336797d = File.separatorChar;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f336798e = "\n";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f336799f = "\r\n";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f336800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f336801h = 4096;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f336802i = 2048;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f336803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static byte[] f336804k;

    static {
        org.apache.commons.io.output.q qVar = new org.apache.commons.io.output.q(4);
        PrintWriter printWriter = new PrintWriter(qVar);
        printWriter.println();
        f336800g = qVar.toString();
        printWriter.close();
    }

    public static void A(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        w(new InputStreamReader(inputStream, b.c(charset)), writer);
    }

    public static char[] A0(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        A(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    @Deprecated
    public static void B(Reader reader, OutputStream outputStream) throws IOException {
        D(reader, outputStream, Charset.defaultCharset());
    }

    public static char[] B0(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        w(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static void C(Reader reader, OutputStream outputStream, String str) throws IOException {
        D(reader, outputStream, b.b(str));
    }

    @Deprecated
    public static InputStream C0(CharSequence charSequence) {
        return E0(charSequence, Charset.defaultCharset());
    }

    public static void D(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, b.c(charset));
        w(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static InputStream D0(CharSequence charSequence, String str) throws IOException {
        return E0(charSequence, b.b(str));
    }

    public static long E(InputStream inputStream, OutputStream outputStream) throws IOException {
        return x(inputStream, outputStream, 4096);
    }

    public static InputStream E0(CharSequence charSequence, Charset charset) {
        return H0(charSequence.toString(), charset);
    }

    public static long F(InputStream inputStream, OutputStream outputStream, long j10, long j11) throws IOException {
        return G(inputStream, outputStream, j10, j11, new byte[4096]);
    }

    @Deprecated
    public static InputStream F0(String str) {
        return H0(str, Charset.defaultCharset());
    }

    public static long G(InputStream inputStream, OutputStream outputStream, long j10, long j11, byte[] bArr) throws IOException {
        long j12 = 0;
        if (j10 > 0) {
            h0(inputStream, j10);
        }
        if (j11 == 0) {
            return 0L;
        }
        int length = bArr.length;
        int iMin = (j11 <= 0 || j11 >= ((long) length)) ? length : (int) j11;
        while (iMin > 0) {
            int i10 = inputStream.read(bArr, 0, iMin);
            if (-1 == i10) {
                break;
            }
            outputStream.write(bArr, 0, i10);
            j12 += (long) i10;
            if (j11 > 0) {
                iMin = (int) Math.min(j11 - j12, length);
            }
        }
        return j12;
    }

    public static InputStream G0(String str, String str2) throws IOException {
        return new ByteArrayInputStream(str.getBytes(b.b(str2)));
    }

    public static long H(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            boolean z10 = false | false;
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static InputStream H0(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(b.c(charset)));
    }

    public static long I(Reader reader, Writer writer) throws IOException {
        return L(reader, writer, new char[4096]);
    }

    @Deprecated
    public static String I0(InputStream inputStream) throws IOException {
        return K0(inputStream, Charset.defaultCharset());
    }

    public static long J(Reader reader, Writer writer, long j10, long j11) throws IOException {
        return K(reader, writer, j10, j11, new char[4096]);
    }

    public static String J0(InputStream inputStream, String str) throws IOException {
        return K0(inputStream, b.b(str));
    }

    public static long K(Reader reader, Writer writer, long j10, long j11, char[] cArr) throws IOException {
        long j12 = 0;
        if (j10 > 0) {
            i0(reader, j10);
        }
        if (j11 == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (j11 > 0 && j11 < cArr.length) {
            length = (int) j11;
        }
        while (length > 0) {
            int i10 = reader.read(cArr, 0, length);
            if (-1 == i10) {
                break;
            }
            writer.write(cArr, 0, i10);
            j12 += (long) i10;
            if (j11 > 0) {
                length = (int) Math.min(j11 - j12, cArr.length);
            }
        }
        return j12;
    }

    public static String K0(InputStream inputStream, Charset charset) throws IOException {
        org.apache.commons.io.output.q qVar = new org.apache.commons.io.output.q();
        A(inputStream, qVar, charset);
        return qVar.toString();
    }

    public static long L(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static String L0(Reader reader) throws IOException {
        org.apache.commons.io.output.q qVar = new org.apache.commons.io.output.q();
        w(reader, qVar);
        return qVar.toString();
    }

    public static r M(InputStream inputStream, String str) throws IOException {
        return N(inputStream, b.b(str));
    }

    @Deprecated
    public static String M0(URI uri) throws IOException {
        return O0(uri, Charset.defaultCharset());
    }

    public static r N(InputStream inputStream, Charset charset) throws IOException {
        return new r(new InputStreamReader(inputStream, b.c(charset)));
    }

    public static String N0(URI uri, String str) throws IOException {
        return O0(uri, b.b(str));
    }

    public static r O(Reader reader) {
        return new r(reader);
    }

    public static String O0(URI uri, Charset charset) throws IOException {
        return R0(uri.toURL(), b.c(charset));
    }

    public static int P(InputStream inputStream, byte[] bArr) throws IOException {
        return Q(inputStream, bArr, 0, bArr.length);
    }

    @Deprecated
    public static String P0(URL url) throws IOException {
        return R0(url, Charset.defaultCharset());
    }

    public static int Q(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + i11);
        }
        int i12 = i11;
        while (i12 > 0) {
            int i13 = inputStream.read(bArr, (i11 - i12) + i10, i12);
            if (-1 == i13) {
                break;
            }
            i12 -= i13;
        }
        return i11 - i12;
    }

    public static String Q0(URL url, String str) throws IOException {
        return R0(url, b.b(str));
    }

    public static int R(Reader reader, char[] cArr) throws IOException {
        return S(reader, cArr, 0, cArr.length);
    }

    public static String R0(URL url, Charset charset) throws IOException {
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            return K0(inputStreamOpenStream, charset);
        } finally {
            inputStreamOpenStream.close();
        }
    }

    public static int S(Reader reader, char[] cArr, int i10, int i11) throws IOException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + i11);
        }
        int i12 = i11;
        while (i12 > 0) {
            int i13 = reader.read(cArr, (i11 - i12) + i10, i12);
            if (-1 == i13) {
                break;
            }
            i12 -= i13;
        }
        return i11 - i12;
    }

    @Deprecated
    public static String S0(byte[] bArr) throws IOException {
        return new String(bArr, Charset.defaultCharset());
    }

    public static int T(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return iRemaining - byteBuffer.remaining();
    }

    public static String T0(byte[] bArr, String str) throws IOException {
        return new String(bArr, b.b(str));
    }

    public static void U(InputStream inputStream, byte[] bArr) throws IOException {
        V(inputStream, bArr, 0, bArr.length);
    }

    @Deprecated
    public static void U0(CharSequence charSequence, OutputStream outputStream) throws IOException {
        W0(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void V(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int iQ = Q(inputStream, bArr, i10, i11);
        if (iQ == i11) {
            return;
        }
        throw new EOFException("Length to read: " + i11 + " actual: " + iQ);
    }

    public static void V0(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        W0(charSequence, outputStream, b.b(str));
    }

    public static void W(Reader reader, char[] cArr) throws IOException {
        X(reader, cArr, 0, cArr.length);
    }

    public static void W0(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            a1(charSequence.toString(), outputStream, charset);
        }
    }

    public static void X(Reader reader, char[] cArr, int i10, int i11) throws IOException {
        int iS = S(reader, cArr, i10, i11);
        if (iS == i11) {
            return;
        }
        throw new EOFException("Length to read: " + i11 + " actual: " + iS);
    }

    public static void X0(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            b1(charSequence.toString(), writer);
        }
    }

    public static void Y(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int iT = T(readableByteChannel, byteBuffer);
        if (iT == iRemaining) {
            return;
        }
        throw new EOFException("Length to read: " + iRemaining + " actual: " + iT);
    }

    @Deprecated
    public static void Y0(String str, OutputStream outputStream) throws IOException {
        a1(str, outputStream, Charset.defaultCharset());
    }

    public static byte[] Z(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        V(inputStream, bArr, 0, i10);
        return bArr;
    }

    public static void Z0(String str, OutputStream outputStream, String str2) throws IOException {
        a1(str, outputStream, b.b(str2));
    }

    public static BufferedInputStream a(InputStream inputStream) {
        inputStream.getClass();
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    @Deprecated
    public static List<String> a0(InputStream inputStream) throws IOException {
        return c0(inputStream, Charset.defaultCharset());
    }

    public static void a1(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes(b.c(charset)));
        }
    }

    public static BufferedInputStream b(InputStream inputStream, int i10) {
        inputStream.getClass();
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    public static List<String> b0(InputStream inputStream, String str) throws IOException {
        return c0(inputStream, b.b(str));
    }

    public static void b1(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    public static BufferedOutputStream c(OutputStream outputStream) {
        outputStream.getClass();
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static List<String> c0(InputStream inputStream, Charset charset) throws IOException {
        return d0(new InputStreamReader(inputStream, b.c(charset)));
    }

    @Deprecated
    public static void c1(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        d1(stringBuffer, outputStream, null);
    }

    public static BufferedOutputStream d(OutputStream outputStream, int i10) {
        outputStream.getClass();
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    public static List<String> d0(Reader reader) throws IOException {
        BufferedReader bufferedReaderM0 = m0(reader);
        ArrayList arrayList = new ArrayList();
        for (String line = bufferedReaderM0.readLine(); line != null; line = bufferedReaderM0.readLine()) {
            arrayList.add(line);
        }
        return arrayList;
    }

    @Deprecated
    public static void d1(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(b.b(str)));
        }
    }

    public static BufferedReader e(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static long e0(InputStream inputStream, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j10);
        }
        if (f336804k == null) {
            f336804k = new byte[2048];
        }
        long j11 = j10;
        while (j11 > 0) {
            long j12 = inputStream.read(f336804k, 0, (int) Math.min(j11, PlaybackStateCompat.f9664p1));
            if (j12 < 0) {
                break;
            }
            j11 -= j12;
        }
        return j10 - j11;
    }

    @Deprecated
    public static void e1(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static BufferedReader f(Reader reader, int i10) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    public static long f0(Reader reader, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j10);
        }
        if (f336803j == null) {
            f336803j = new char[2048];
        }
        long j11 = j10;
        while (j11 > 0) {
            long j12 = reader.read(f336803j, 0, (int) Math.min(j11, PlaybackStateCompat.f9664p1));
            if (j12 < 0) {
                break;
            }
            j11 -= j12;
        }
        return j10 - j11;
    }

    public static void f1(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static BufferedWriter g(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    public static long g0(ReadableByteChannel readableByteChannel, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j10);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) Math.min(j10, PlaybackStateCompat.f9664p1));
        long j11 = j10;
        while (j11 > 0) {
            byteBufferAllocate.position(0);
            byteBufferAllocate.limit((int) Math.min(j11, PlaybackStateCompat.f9664p1));
            int i10 = readableByteChannel.read(byteBufferAllocate);
            if (i10 == -1) {
                break;
            }
            j11 -= (long) i10;
        }
        return j10 - j11;
    }

    @Deprecated
    public static void g1(byte[] bArr, Writer writer) throws IOException {
        i1(bArr, writer, Charset.defaultCharset());
    }

    public static BufferedWriter h(Writer writer, int i10) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    public static void h0(InputStream inputStream, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("Bytes to skip must not be negative: " + j10);
        }
        long jE0 = e0(inputStream, j10);
        if (jE0 == j10) {
            return;
        }
        throw new EOFException("Bytes to skip: " + j10 + " actual: " + jE0);
    }

    public static void h1(byte[] bArr, Writer writer, String str) throws IOException {
        i1(bArr, writer, b.b(str));
    }

    public static void i(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static void i0(Reader reader, long j10) throws IOException {
        long jF0 = f0(reader, j10);
        if (jF0 == j10) {
            return;
        }
        throw new EOFException("Chars to skip: " + j10 + " actual: " + jF0);
    }

    public static void i1(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, b.c(charset)));
        }
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void j0(ReadableByteChannel readableByteChannel, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("Bytes to skip must not be negative: " + j10);
        }
        long jG0 = g0(readableByteChannel, j10);
        if (jG0 == j10) {
            return;
        }
        throw new EOFException("Bytes to skip: " + j10 + " actual: " + jG0);
    }

    @Deprecated
    public static void j1(char[] cArr, OutputStream outputStream) throws IOException {
        l1(cArr, outputStream, Charset.defaultCharset());
    }

    public static void k(InputStream inputStream) {
        j(inputStream);
    }

    public static InputStream k0(InputStream inputStream) throws IOException {
        return org.apache.commons.io.output.c.c(inputStream);
    }

    public static void k1(char[] cArr, OutputStream outputStream, String str) throws IOException {
        l1(cArr, outputStream, b.b(str));
    }

    public static void l(OutputStream outputStream) {
        j(outputStream);
    }

    public static InputStream l0(InputStream inputStream, int i10) throws IOException {
        return org.apache.commons.io.output.c.d(inputStream, i10);
    }

    public static void l1(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(b.c(charset)));
        }
    }

    public static void m(Reader reader) {
        j(reader);
    }

    public static BufferedReader m0(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static void m1(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void n(Writer writer) {
        j(writer);
    }

    public static BufferedReader n0(Reader reader, int i10) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    public static void n1(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            int length = bArr.length;
            int i10 = 0;
            while (length > 0) {
                int iMin = Math.min(length, 4096);
                outputStream.write(bArr, i10, iMin);
                length -= iMin;
                i10 += iMin;
            }
        }
    }

    public static void o(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] o0(InputStream inputStream) throws IOException {
        org.apache.commons.io.output.c cVar = new org.apache.commons.io.output.c();
        v(inputStream, cVar);
        return cVar.e();
    }

    public static void o1(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i10 = 0;
            while (length > 0) {
                int iMin = Math.min(length, 4096);
                writer.write(cArr, i10, iMin);
                length -= iMin;
                i10 += iMin;
            }
        }
    }

    public static void p(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] p0(InputStream inputStream, int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Size must be equal or greater than zero: " + i10);
        }
        int i11 = 0;
        if (i10 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10];
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                break;
            }
            i11 += i12;
        }
        if (i11 == i10) {
            return bArr;
        }
        throw new IOException("Unexpected readed size. current: " + i11 + ", excepted: " + i10);
    }

    @Deprecated
    public static void p1(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        r1(collection, str, outputStream, Charset.defaultCharset());
    }

    public static void q(Selector selector) {
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] q0(InputStream inputStream, long j10) throws IOException {
        if (j10 <= g3.f12256c) {
            return p0(inputStream, (int) j10);
        }
        throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + j10);
    }

    public static void q1(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        r1(collection, str, outputStream, b.b(str2));
    }

    public static void r(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                j(closeable);
            }
        }
    }

    @Deprecated
    public static byte[] r0(Reader reader) throws IOException {
        return t0(reader, Charset.defaultCharset());
    }

    public static void r1(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f336800g;
        }
        Charset charsetC = b.c(charset);
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(charsetC));
            }
            outputStream.write(str.getBytes(charsetC));
        }
    }

    public static boolean s(InputStream inputStream, InputStream inputStream2) throws IOException {
        if (inputStream == inputStream2) {
            return true;
        }
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        for (int i10 = inputStream.read(); -1 != i10; i10 = inputStream.read()) {
            if (i10 != inputStream2.read()) {
                return false;
            }
        }
        return inputStream2.read() == -1;
    }

    public static byte[] s0(Reader reader, String str) throws IOException {
        return t0(reader, b.b(str));
    }

    public static void s1(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f336800g;
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static boolean t(Reader reader, Reader reader2) throws IOException {
        if (reader == reader2) {
            return true;
        }
        BufferedReader bufferedReaderM0 = m0(reader);
        BufferedReader bufferedReaderM1 = m0(reader2);
        for (int i10 = bufferedReaderM0.read(); -1 != i10; i10 = bufferedReaderM0.read()) {
            if (i10 != bufferedReaderM1.read()) {
                return false;
            }
        }
        return bufferedReaderM1.read() == -1;
    }

    public static byte[] t0(Reader reader, Charset charset) throws IOException {
        org.apache.commons.io.output.c cVar = new org.apache.commons.io.output.c();
        D(reader, cVar, charset);
        return cVar.e();
    }

    public static boolean u(Reader reader, Reader reader2) throws IOException {
        if (reader == reader2) {
            return true;
        }
        BufferedReader bufferedReaderM0 = m0(reader);
        BufferedReader bufferedReaderM1 = m0(reader2);
        String line = bufferedReaderM0.readLine();
        String line2 = bufferedReaderM1.readLine();
        while (line != null && line2 != null && line.equals(line2)) {
            line = bufferedReaderM0.readLine();
            line2 = bufferedReaderM1.readLine();
        }
        if (line == null) {
            return line2 == null;
        }
        return line.equals(line2);
    }

    @Deprecated
    public static byte[] u0(String str) throws IOException {
        return str.getBytes(Charset.defaultCharset());
    }

    public static int v(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jE = E(inputStream, outputStream);
        if (jE > g3.f12256c) {
            return -1;
        }
        return (int) jE;
    }

    public static byte[] v0(URI uri) throws IOException {
        return w0(uri.toURL());
    }

    public static int w(Reader reader, Writer writer) throws IOException {
        long jI = I(reader, writer);
        if (jI > g3.f12256c) {
            return -1;
        }
        return (int) jI;
    }

    public static byte[] w0(URL url) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        try {
            byte[] bArrX0 = x0(uRLConnection);
            i(uRLConnection);
            return bArrX0;
        } catch (Throwable th2) {
            i(uRLConnection);
            throw th2;
        }
    }

    public static long x(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        return H(inputStream, outputStream, new byte[i10]);
    }

    public static byte[] x0(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] bArrO0 = o0(inputStream);
            inputStream.close();
            return bArrO0;
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Deprecated
    public static void y(InputStream inputStream, Writer writer) throws IOException {
        A(inputStream, writer, Charset.defaultCharset());
    }

    @Deprecated
    public static char[] y0(InputStream inputStream) throws IOException {
        return A0(inputStream, Charset.defaultCharset());
    }

    public static void z(InputStream inputStream, Writer writer, String str) throws IOException {
        A(inputStream, writer, b.b(str));
    }

    public static char[] z0(InputStream inputStream, String str) throws IOException {
        return A0(inputStream, b.b(str));
    }
}
