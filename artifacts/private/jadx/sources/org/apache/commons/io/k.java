package org.apache.commons.io;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.filefilter.v;
import org.apache.commons.io.filefilter.w;

/* JADX INFO: loaded from: classes14.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f336690a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f336691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f336692c = 1048576;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f336693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336694e = 31457280;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f336695f = 1073741824;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f336696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f336697h = 1099511627776L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BigInteger f336698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f336699j = 1125899906842624L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BigInteger f336700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f336701l = 1152921504606846976L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final BigInteger f336702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BigInteger f336703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BigInteger f336704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final File[] f336705p;

    static class a implements FileFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f336706a;

        a(File file) {
            this.f336706a = file;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.equals(this.f336706a);
        }
    }

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        f336691b = bigIntegerValueOf;
        BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf);
        f336693d = bigIntegerMultiply;
        BigInteger bigIntegerMultiply2 = bigIntegerValueOf.multiply(bigIntegerMultiply);
        f336696g = bigIntegerMultiply2;
        BigInteger bigIntegerMultiply3 = bigIntegerValueOf.multiply(bigIntegerMultiply2);
        f336698i = bigIntegerMultiply3;
        BigInteger bigIntegerMultiply4 = bigIntegerValueOf.multiply(bigIntegerMultiply3);
        f336700k = bigIntegerMultiply4;
        f336702m = bigIntegerValueOf.multiply(bigIntegerMultiply4);
        BigInteger bigIntegerMultiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        f336703n = bigIntegerMultiply5;
        f336704o = bigIntegerValueOf.multiply(bigIntegerMultiply5);
        f336705p = new File[0];
    }

    public static void A(File file) throws IOException {
        if (file.exists()) {
            if (!Y(file)) {
                g(file);
            }
            if (!file.delete()) {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    public static BigInteger A0(File file) {
        if (file.exists()) {
            return file.isDirectory() ? F0(file) : BigInteger.valueOf(file.length());
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    private static void B(File file) throws IOException {
        if (file.exists()) {
            file.deleteOnExit();
            if (Y(file)) {
                return;
            }
            h(file);
        }
    }

    private static BigInteger B0(File file) {
        return file.isDirectory() ? F0(file) : BigInteger.valueOf(file.length());
    }

    public static boolean C(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                g(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    public static long C0(File file) {
        c(file);
        return D0(file);
    }

    public static boolean D(File file, File file2) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Not a directory: " + file);
        }
        if (file2 != null && file.exists() && file2.exists()) {
            return l.b(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    private static long D0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        long jZ0 = 0;
        for (File file2 : fileArrListFiles) {
            try {
                if (!Y(file2)) {
                    jZ0 += z0(file2);
                    if (jZ0 < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return jZ0;
    }

    private static void E(File file, File file2, FileFilter fileFilter, boolean z10, List<String> list) throws Throwable {
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    E(file3, file4, fileFilter, z10, list);
                } else {
                    F(file3, file4, z10);
                }
            }
        }
        if (z10) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static BigInteger E0(File file) {
        c(file);
        return F0(file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.nio.channels.FileChannel, java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    private static void F(File file, File file2, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        ?? channel;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    channel = fileInputStream.getChannel();
                    try {
                        ?? channel2 = fileOutputStream.getChannel();
                        try {
                            long size = channel.size();
                            long j10 = 0;
                            while (j10 < size) {
                                long j11 = size - j10;
                                if (j11 > f336694e) {
                                    j11 = 31457280;
                                }
                                long jTransferFrom = channel2.transferFrom(channel, j10, j11);
                                if (jTransferFrom == 0) {
                                    break;
                                } else {
                                    j10 += jTransferFrom;
                                }
                            }
                            p.r(new Closeable[]{channel2, fileOutputStream, channel, fileInputStream});
                            long length = file.length();
                            long length2 = file2.length();
                            if (length == length2) {
                                if (z10) {
                                    file2.setLastModified(file.lastModified());
                                    return;
                                }
                                return;
                            }
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = channel2;
                            p.r(new Closeable[]{r10, fileOutputStream, channel, fileInputStream});
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    channel = 0;
                }
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                channel = fileOutputStream;
                p.r(new Closeable[]{r10, fileOutputStream, channel, fileInputStream});
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            fileInputStream = null;
            fileOutputStream = null;
        }
    }

    private static BigInteger F0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (File file2 : fileArrListFiles) {
            try {
                if (!Y(file2)) {
                    bigIntegerAdd = bigIntegerAdd.add(B0(file2));
                }
            } catch (IOException unused) {
            }
        }
        return bigIntegerAdd;
    }

    public static void G(File file) throws IOException {
        if (file.isDirectory()) {
            A(file);
            return;
        }
        boolean zExists = file.exists();
        if (file.delete()) {
            return;
        }
        if (zExists) {
            throw new IOException("Unable to delete file: " + file);
        }
        throw new FileNotFoundException("File does not exist: " + file);
    }

    public static File G0(URL url) {
        if (url == null || !com.facebook.share.internal.k.f101891c.equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(z(url.getFile().replace('/', File.separatorChar)));
    }

    public static void H(File file) throws IOException {
        if (file.isDirectory()) {
            B(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static File[] H0(URL[] urlArr) {
        if (urlArr == null || urlArr.length == 0) {
            return f336705p;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i10 = 0; i10 < urlArr.length; i10++) {
            URL url = urlArr[i10];
            if (url != null) {
                if (!url.getProtocol().equals(com.facebook.share.internal.k.f101891c)) {
                    throw new IllegalArgumentException("URL could not be converted to a File: " + url);
                }
                fileArr[i10] = G0(url);
            }
        }
        return fileArr;
    }

    public static void I(File file) throws IOException {
        if (!file.exists()) {
            if (file.mkdirs() || file.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create directory " + file);
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException("File " + file + " exists and is not a directory. Unable to create directory.");
    }

    private static String[] I0(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr2[i10] = "." + strArr[i10];
        }
        return strArr2;
    }

    public static void J(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        I(parentFile);
    }

    public static URL[] J0(File[] fileArr) throws IOException {
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i10 = 0; i10 < length; i10++) {
            urlArr[i10] = fileArr[i10].toURI().toURL();
        }
        return urlArr;
    }

    public static File K(File file, String... strArr) {
        if (file == null) {
            throw new NullPointerException("directory must not be null");
        }
        if (strArr == null) {
            throw new NullPointerException("names must not be null");
        }
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            File file2 = new File(file, strArr[i10]);
            i10++;
            file = file2;
        }
        return file;
    }

    public static void K0(File file) throws IOException {
        if (!file.exists()) {
            p.l(n0(file));
        }
        if (file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        throw new IOException("Unable to set the last modification time for " + file);
    }

    public static File L(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("names must not be null");
        }
        File file = null;
        for (String str : strArr) {
            file = file == null ? new File(str) : new File(file, str);
        }
        return file;
    }

    private static void L0(File file, org.apache.commons.io.filefilter.n nVar) {
        if (file.isDirectory()) {
            if (nVar == null) {
                throw new NullPointerException("Parameter 'fileFilter' is null");
            }
        } else {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory: " + file);
        }
    }

    public static File M() {
        return new File(N());
    }

    private static File[] M0(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        throw new IOException("Failed to list contents of " + file);
    }

    public static String N() {
        return System.getProperty("java.io.tmpdir");
    }

    public static boolean N0(File file, int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis() + (((long) i10) * 1000);
        boolean z10 = false;
        while (!file.exists()) {
            try {
                long jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis();
                if (jCurrentTimeMillis2 < 0) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
                try {
                    Thread.sleep(Math.min(100L, jCurrentTimeMillis2));
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Exception unused2) {
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return true;
    }

    public static File O() {
        return new File(P());
    }

    @Deprecated
    public static void O0(File file, CharSequence charSequence) throws Throwable {
        S0(file, charSequence, Charset.defaultCharset(), false);
    }

    public static String P() {
        return System.getProperty("user.home");
    }

    public static void P0(File file, CharSequence charSequence, String str) throws Throwable {
        Q0(file, charSequence, str, false);
    }

    private static void Q(Collection<File> collection, File file, org.apache.commons.io.filefilter.n nVar, boolean z10) {
        File[] fileArrListFiles = file.listFiles((FileFilter) nVar);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    if (z10) {
                        collection.add(file2);
                    }
                    Q(collection, file2, nVar, z10);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    public static void Q0(File file, CharSequence charSequence, String str, boolean z10) throws Throwable {
        S0(file, charSequence, b.b(str), z10);
    }

    private static boolean R(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.exists()) {
            return false;
        }
        File canonicalFile = file.getCanonicalFile();
        File parentFile = canonicalFile.getParentFile();
        return parentFile != null && parentFile.exists() && (fileArrListFiles = parentFile.listFiles(new a(canonicalFile))) != null && fileArrListFiles.length > 0;
    }

    public static void R0(File file, CharSequence charSequence, Charset charset) throws Throwable {
        S0(file, charSequence, charset, false);
    }

    public static boolean S(File file, long j10) {
        if (file != null) {
            return file.exists() && file.lastModified() > j10;
        }
        throw new IllegalArgumentException("No specified file");
    }

    public static void S0(File file, CharSequence charSequence, Charset charset, boolean z10) throws Throwable {
        k1(file, charSequence == null ? null : charSequence.toString(), charset, z10);
    }

    public static boolean T(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (file2.exists()) {
            return S(file, file2.lastModified());
        }
        throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
    }

    @Deprecated
    public static void T0(File file, CharSequence charSequence, boolean z10) throws Throwable {
        S0(file, charSequence, Charset.defaultCharset(), z10);
    }

    public static boolean U(File file, Date date) {
        if (date != null) {
            return S(file, date.getTime());
        }
        throw new IllegalArgumentException("No specified date");
    }

    public static void U0(File file, byte[] bArr) throws Throwable {
        X0(file, bArr, false);
    }

    public static boolean V(File file, long j10) {
        if (file != null) {
            return file.exists() && file.lastModified() < j10;
        }
        throw new IllegalArgumentException("No specified file");
    }

    public static void V0(File file, byte[] bArr, int i10, int i11) throws Throwable {
        W0(file, bArr, i10, i11, false);
    }

    public static boolean W(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (file2.exists()) {
            return V(file, file2.lastModified());
        }
        throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
    }

    public static void W0(File file, byte[] bArr, int i10, int i11, boolean z10) throws Throwable {
        FileOutputStream fileOutputStreamO0;
        try {
            fileOutputStreamO0 = o0(file, z10);
            try {
                fileOutputStreamO0.write(bArr, i10, i11);
                fileOutputStreamO0.close();
                p.l(fileOutputStreamO0);
            } catch (Throwable th2) {
                th = th2;
                p.l(fileOutputStreamO0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStreamO0 = null;
        }
    }

    public static boolean X(File file, Date date) {
        if (date != null) {
            return V(file, date.getTime());
        }
        throw new IllegalArgumentException("No specified date");
    }

    public static void X0(File file, byte[] bArr, boolean z10) throws Throwable {
        W0(file, bArr, 0, bArr.length, z10);
    }

    public static boolean Y(File file) throws IOException {
        if (q.d()) {
            return q.e(file);
        }
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (l.A()) {
            return false;
        }
        File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
        if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
            return R(file);
        }
        return true;
    }

    public static void Y0(File file, String str, Collection<?> collection) throws Throwable {
        a1(file, str, collection, null, false);
    }

    public static Iterator<File> Z(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        return e0(file, nVar, nVar2).iterator();
    }

    public static void Z0(File file, String str, Collection<?> collection, String str2) throws Throwable {
        a1(file, str, collection, str2, false);
    }

    public static String a(long j10) {
        return b(BigInteger.valueOf(j10));
    }

    public static Iterator<File> a0(File file, String[] strArr, boolean z10) {
        return f0(file, strArr, z10).iterator();
    }

    public static void a1(File file, String str, Collection<?> collection, String str2, boolean z10) throws Throwable {
        FileOutputStream fileOutputStreamO0;
        try {
            fileOutputStreamO0 = o0(file, z10);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStreamO0);
                p.q1(collection, str2, bufferedOutputStream, str);
                bufferedOutputStream.flush();
                fileOutputStreamO0.close();
                p.l(fileOutputStreamO0);
            } catch (Throwable th2) {
                th = th2;
                p.l(fileOutputStreamO0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStreamO0 = null;
        }
    }

    public static String b(BigInteger bigInteger) {
        BigInteger bigInteger2 = f336702m;
        BigInteger bigIntegerDivide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigIntegerDivide.compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger2)) + " EB";
        }
        BigInteger bigInteger4 = f336700k;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger4)) + " PB";
        }
        BigInteger bigInteger5 = f336698i;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger5)) + " TB";
        }
        BigInteger bigInteger6 = f336696g;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger6)) + " GB";
        }
        BigInteger bigInteger7 = f336693d;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger7)) + " MB";
        }
        BigInteger bigInteger8 = f336691b;
        if (bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger8)) + " KB";
        }
        return String.valueOf(bigInteger) + " bytes";
    }

    public static Iterator<File> b0(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        return g0(file, nVar, nVar2).iterator();
    }

    public static void b1(File file, String str, Collection<?> collection, boolean z10) throws Throwable {
        a1(file, str, collection, null, z10);
    }

    private static void c(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IllegalArgumentException(file + " is not a directory");
    }

    public static r c0(File file) throws IOException {
        return d0(file, null);
    }

    public static void c1(File file, Collection<?> collection) throws Throwable {
        a1(file, null, collection, null, false);
    }

    private static void d(File file, File file2) throws FileNotFoundException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static r d0(File file, String str) throws IOException {
        FileInputStream fileInputStreamM0 = null;
        try {
            fileInputStreamM0 = m0(file);
            return p.M(fileInputStreamM0, str);
        } catch (IOException e10) {
            p.k(fileInputStreamM0);
            throw e10;
        } catch (RuntimeException e11) {
            p.k(fileInputStreamM0);
            throw e11;
        }
    }

    public static void d1(File file, Collection<?> collection, String str) throws Throwable {
        a1(file, null, collection, str, false);
    }

    public static Checksum e(File file, Checksum checksum) throws Throwable {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        CheckedInputStream checkedInputStream = null;
        try {
            CheckedInputStream checkedInputStream2 = new CheckedInputStream(new FileInputStream(file), checksum);
            try {
                p.v(checkedInputStream2, new org.apache.commons.io.output.m());
                p.k(checkedInputStream2);
                return checksum;
            } catch (Throwable th2) {
                th = th2;
                checkedInputStream = checkedInputStream2;
                p.k(checkedInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Collection<File> e0(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        L0(file, nVar);
        org.apache.commons.io.filefilter.n nVarX0 = x0(nVar);
        org.apache.commons.io.filefilter.n nVarW0 = w0(nVar2);
        LinkedList linkedList = new LinkedList();
        Q(linkedList, file, org.apache.commons.io.filefilter.l.F(nVarX0, nVarW0), false);
        return linkedList;
    }

    public static void e1(File file, Collection<?> collection, String str, boolean z10) throws Throwable {
        a1(file, null, collection, str, z10);
    }

    public static long f(File file) throws Throwable {
        CRC32 crc32 = new CRC32();
        e(file, crc32);
        return crc32.getValue();
    }

    public static Collection<File> f0(File file, String[] strArr, boolean z10) {
        return e0(file, strArr == null ? w.f336541c : new v(I0(strArr)), z10 ? w.f336541c : org.apache.commons.io.filefilter.j.f336510c);
    }

    public static void f1(File file, Collection<?> collection, boolean z10) throws Throwable {
        a1(file, null, collection, null, z10);
    }

    public static void g(File file) throws IOException {
        IOException e10 = null;
        for (File file2 : M0(file)) {
            try {
                G(file2);
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            throw e10;
        }
    }

    public static Collection<File> g0(File file, org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2) {
        L0(file, nVar);
        org.apache.commons.io.filefilter.n nVarX0 = x0(nVar);
        org.apache.commons.io.filefilter.n nVarW0 = w0(nVar2);
        LinkedList linkedList = new LinkedList();
        if (file.isDirectory()) {
            linkedList.add(file);
        }
        Q(linkedList, file, org.apache.commons.io.filefilter.l.F(nVarX0, nVarW0), true);
        return linkedList;
    }

    @Deprecated
    public static void g1(File file, String str) throws Throwable {
        k1(file, str, Charset.defaultCharset(), false);
    }

    private static void h(File file) throws IOException {
        IOException e10 = null;
        for (File file2 : M0(file)) {
            try {
                H(file2);
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            throw e10;
        }
    }

    public static void h0(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' is not a directory");
        }
        if (file2.exists()) {
            throw new i("Destination '" + file2 + "' already exists");
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
        l(file, file2);
        A(file);
        if (file.exists()) {
            throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
        }
    }

    public static void h1(File file, String str, String str2) throws Throwable {
        i1(file, str, str2, false);
    }

    public static boolean i(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        boolean zExists = file.exists();
        if (zExists != file2.exists()) {
            return false;
        }
        if (!zExists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        FileInputStream fileInputStream2 = null;
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    boolean zS = p.s(fileInputStream3, fileInputStream);
                    p.k(fileInputStream3);
                    p.k(fileInputStream);
                    return zS;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream3;
                    p.k(fileInputStream2);
                    p.k(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public static void i0(File file, File file2, boolean z10) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z10) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z10 + "]");
        }
        if (file2.isDirectory()) {
            h0(file, new File(file2, file.getName()));
            return;
        }
        throw new IOException("Destination '" + file2 + "' is not a directory");
    }

    public static void i1(File file, String str, String str2, boolean z10) throws Throwable {
        k1(file, str, b.b(str2), z10);
    }

    public static boolean j(File file, File file2, String str) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        boolean zExists = file.exists();
        if (zExists != file2.exists()) {
            return false;
        }
        if (!zExists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        InputStreamReader inputStreamReader3 = null;
        try {
            if (str == null) {
                InputStreamReader inputStreamReader4 = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                try {
                    inputStreamReader2 = new InputStreamReader(new FileInputStream(file2), Charset.defaultCharset());
                    inputStreamReader3 = inputStreamReader4;
                    try {
                        boolean zU = p.u(inputStreamReader3, inputStreamReader2);
                        p.m(inputStreamReader3);
                        p.m(inputStreamReader2);
                        return zU;
                    } catch (Throwable th2) {
                        inputStreamReader = inputStreamReader2;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                    inputStreamReader3 = inputStreamReader4;
                }
            } else {
                InputStreamReader inputStreamReader5 = new InputStreamReader(new FileInputStream(file), str);
                try {
                    inputStreamReader2 = new InputStreamReader(new FileInputStream(file2), str);
                    inputStreamReader3 = inputStreamReader5;
                    boolean zU2 = p.u(inputStreamReader3, inputStreamReader2);
                    p.m(inputStreamReader3);
                    p.m(inputStreamReader2);
                    return zU2;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                    inputStreamReader3 = inputStreamReader5;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = inputStreamReader3;
        }
        p.m(inputStreamReader3);
        p.m(inputStreamReader);
        throw th;
    }

    public static void j0(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' is a directory");
        }
        if (file2.exists()) {
            throw new i("Destination '" + file2 + "' already exists");
        }
        if (file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is a directory");
        }
        if (file.renameTo(file2)) {
            return;
        }
        r(file, file2);
        if (file.delete()) {
            return;
        }
        C(file2);
        throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
    }

    public static void j1(File file, String str, Charset charset) throws Throwable {
        k1(file, str, charset, false);
    }

    public static File[] k(Collection<File> collection) {
        return (File[]) collection.toArray(new File[collection.size()]);
    }

    public static void k0(File file, File file2, boolean z10) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z10) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z10 + "]");
        }
        if (file2.isDirectory()) {
            j0(file, new File(file2, file.getName()));
            return;
        }
        throw new IOException("Destination '" + file2 + "' is not a directory");
    }

    public static void k1(File file, String str, Charset charset, boolean z10) throws Throwable {
        FileOutputStream fileOutputStreamO0;
        try {
            fileOutputStreamO0 = o0(file, z10);
            try {
                p.a1(str, fileOutputStreamO0, charset);
                fileOutputStreamO0.close();
                p.l(fileOutputStreamO0);
            } catch (Throwable th2) {
                th = th2;
                p.l(fileOutputStreamO0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStreamO0 = null;
        }
    }

    public static void l(File file, File file2) throws Throwable {
        o(file, file2, true);
    }

    public static void l0(File file, File file2, boolean z10) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                i0(file, file2, z10);
                return;
            } else {
                k0(file, file2, z10);
                return;
            }
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    @Deprecated
    public static void l1(File file, String str, boolean z10) throws Throwable {
        k1(file, str, Charset.defaultCharset(), z10);
    }

    public static void m(File file, File file2, FileFilter fileFilter) throws Throwable {
        n(file, file2, fileFilter, true);
    }

    public static FileInputStream m0(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException("File '" + file + "' cannot be read");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    public static void n(File file, File file2, FileFilter fileFilter, boolean z10) throws Throwable {
        ArrayList arrayList;
        d(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(fileArrListFiles.length);
                for (File file3 : fileArrListFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
            }
        } else {
            arrayList = null;
        }
        E(file, file2, fileFilter, z10, arrayList);
    }

    public static FileOutputStream n0(File file) throws IOException {
        return o0(file, false);
    }

    public static void o(File file, File file2, boolean z10) throws Throwable {
        n(file, file2, null, z10);
    }

    public static FileOutputStream o0(File file, boolean z10) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        }
        return new FileOutputStream(file, z10);
    }

    public static void p(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("Source '" + file2 + "' is not a directory");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file2.exists() || file2.isDirectory()) {
            o(file, new File(file2, file.getName()), true);
            return;
        }
        throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
    }

    public static byte[] p0(File file) throws Throwable {
        FileInputStream fileInputStreamM0;
        try {
            fileInputStreamM0 = m0(file);
            try {
                byte[] bArrO0 = p.o0(fileInputStreamM0);
                p.k(fileInputStreamM0);
                return bArrO0;
            } catch (Throwable th2) {
                th = th2;
                p.k(fileInputStreamM0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStreamM0 = null;
        }
    }

    public static long q(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return p.E(fileInputStream, outputStream);
        } finally {
            fileInputStream.close();
        }
    }

    @Deprecated
    public static String q0(File file) throws IOException {
        return s0(file, Charset.defaultCharset());
    }

    public static void r(File file, File file2) throws Throwable {
        s(file, file2, true);
    }

    public static String r0(File file, String str) throws IOException {
        return s0(file, b.b(str));
    }

    public static void s(File file, File file2, boolean z10) throws Throwable {
        d(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (!file2.exists() || file2.canWrite()) {
            F(file, file2, z10);
            return;
        }
        throw new IOException("Destination '" + file2 + "' exists but is read-only");
    }

    public static String s0(File file, Charset charset) throws Throwable {
        FileInputStream fileInputStreamM0;
        try {
            fileInputStreamM0 = m0(file);
            try {
                String strK0 = p.K0(fileInputStreamM0, b.c(charset));
                p.k(fileInputStreamM0);
                return strK0;
            } catch (Throwable th2) {
                th = th2;
                p.k(fileInputStreamM0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStreamM0 = null;
        }
    }

    public static void t(File file, File file2) throws Throwable {
        u(file, file2, true);
    }

    @Deprecated
    public static List<String> t0(File file) throws IOException {
        return v0(file, Charset.defaultCharset());
    }

    public static void u(File file, File file2, boolean z10) throws Throwable {
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file2.exists() || file2.isDirectory()) {
            s(file, new File(file2, file.getName()), z10);
            return;
        }
        throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
    }

    public static List<String> u0(File file, String str) throws IOException {
        return v0(file, b.b(str));
    }

    public static void v(InputStream inputStream, File file) throws IOException {
        try {
            w(inputStream, file);
            p.k(inputStream);
        } catch (Throwable th2) {
            p.k(inputStream);
            throw th2;
        }
    }

    public static List<String> v0(File file, Charset charset) throws Throwable {
        FileInputStream fileInputStreamM0;
        try {
            fileInputStreamM0 = m0(file);
            try {
                List<String> listC0 = p.c0(fileInputStreamM0, b.c(charset));
                p.k(fileInputStreamM0);
                return listC0;
            } catch (Throwable th2) {
                th = th2;
                p.k(fileInputStreamM0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStreamM0 = null;
        }
    }

    public static void w(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStreamN0 = n0(file);
        try {
            p.v(inputStream, fileOutputStreamN0);
            fileOutputStreamN0.close();
            p.l(fileOutputStreamN0);
        } catch (Throwable th2) {
            p.l(fileOutputStreamN0);
            throw th2;
        }
    }

    private static org.apache.commons.io.filefilter.n w0(org.apache.commons.io.filefilter.n nVar) {
        return nVar == null ? org.apache.commons.io.filefilter.j.f336510c : org.apache.commons.io.filefilter.l.g(nVar, org.apache.commons.io.filefilter.h.f336504c);
    }

    public static void x(URL url, File file) throws IOException {
        v(FirebasePerfUrlConnection.openStream(url), file);
    }

    private static org.apache.commons.io.filefilter.n x0(org.apache.commons.io.filefilter.n nVar) {
        return org.apache.commons.io.filefilter.l.g(nVar, org.apache.commons.io.filefilter.l.E(org.apache.commons.io.filefilter.h.f336504c));
    }

    public static void y(URL url, File file, int i10, int i11) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        uRLConnection.setConnectTimeout(i10);
        uRLConnection.setReadTimeout(i11);
        v(uRLConnection.getInputStream(), file);
    }

    public static long y0(File file) {
        if (file.exists()) {
            return file.isDirectory() ? D0(file) : file.length();
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    static String z(String str) {
        int i10;
        if (str != null && str.indexOf(37) >= 0) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            int i11 = 0;
            while (i11 < length) {
                if (str.charAt(i11) == '%') {
                    while (true) {
                        i10 = i11 + 3;
                        try {
                            try {
                                byteBufferAllocate.put((byte) Integer.parseInt(str.substring(i11 + 1, i10), 16));
                                if (i10 >= length) {
                                    break;
                                }
                                try {
                                    if (str.charAt(i10) != '%') {
                                        break;
                                    }
                                    i11 = i10;
                                } catch (RuntimeException unused) {
                                    i11 = i10;
                                    if (byteBufferAllocate.position() > 0) {
                                        byteBufferAllocate.flip();
                                        sb2.append(b.f336435f.decode(byteBufferAllocate).toString());
                                        byteBufferAllocate.clear();
                                    }
                                    sb2.append(str.charAt(i11));
                                    i11++;
                                }
                            } catch (RuntimeException unused2) {
                            }
                        } catch (Throwable th2) {
                            if (byteBufferAllocate.position() > 0) {
                                byteBufferAllocate.flip();
                                sb2.append(b.f336435f.decode(byteBufferAllocate).toString());
                                byteBufferAllocate.clear();
                            }
                            throw th2;
                        }
                    }
                    if (byteBufferAllocate.position() > 0) {
                        byteBufferAllocate.flip();
                        sb2.append(b.f336435f.decode(byteBufferAllocate).toString());
                        byteBufferAllocate.clear();
                    }
                    i11 = i10;
                }
                sb2.append(str.charAt(i11));
                i11++;
            }
            str = sb2.toString();
        }
        return str;
    }

    private static long z0(File file) {
        return file.isDirectory() ? D0(file) : file.length();
    }
}
