package org.apache.commons.io;

import io.sentry.protocol.h0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f336682a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f336683b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f336684c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f336685d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f336686e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f336687f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f336688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f336689h;

    static {
        int i10;
        String str = "df";
        try {
            String property = System.getProperty("os.name");
            if (property == null) {
                throw new IOException("os.name not found");
            }
            String lowerCase = property.toLowerCase(Locale.ENGLISH);
            if (lowerCase.contains(h0.b.f306302b)) {
                i10 = 1;
            } else if (lowerCase.contains("linux") || lowerCase.contains("mpe/ix") || lowerCase.contains("freebsd") || lowerCase.contains("irix") || lowerCase.contains("digital unix") || lowerCase.contains("unix") || lowerCase.contains("mac os x")) {
                i10 = 2;
            } else {
                if (lowerCase.contains("sun os") || lowerCase.contains("sunos") || lowerCase.contains("solaris")) {
                    str = "/usr/xpg4/bin/df";
                } else if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                    i10 = 0;
                }
                i10 = 3;
            }
            f336688g = i10;
            f336689h = str;
        } catch (Exception unused) {
            i10 = -1;
        }
    }

    @Deprecated
    public static long a(String str) throws IOException {
        return f336682a.f(str, f336688g, false, -1L);
    }

    public static long b() throws IOException {
        return c(-1L);
    }

    public static long c(long j10) throws IOException {
        return e(new File(".").getAbsolutePath(), j10);
    }

    public static long d(String str) throws IOException {
        return e(str, -1L);
    }

    public static long e(String str, long j10) throws IOException {
        return f336682a.f(str, f336688g, true, j10);
    }

    long f(String str, int i10, boolean z10, long j10) throws Throwable {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be null");
        }
        if (i10 == 0) {
            throw new IllegalStateException("Unsupported operating system");
        }
        if (i10 == 1) {
            long jH = h(str, j10);
            if (z10) {
                jH /= 1024;
            }
            return jH;
        }
        if (i10 == 2) {
            return g(str, z10, false, j10);
        }
        if (i10 == 3) {
            return g(str, z10, true, j10);
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    long g(String str, boolean z10, boolean z11, long j10) throws Throwable {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String str2 = "-";
        if (z10) {
            str2 = "-k";
        }
        if (z11) {
            str2 = str2 + "P";
        }
        List<String> listL = l(str2.length() > 1 ? new String[]{f336689h, str2, str} : new String[]{f336689h, str}, 3, j10);
        if (listL.size() < 2) {
            throw new IOException("Command line '" + f336689h + "' did not return info as expected for path '" + str + "'- response was " + listL);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(listL.get(1), " ");
        if (stringTokenizer.countTokens() >= 4) {
            stringTokenizer.nextToken();
        } else {
            if (stringTokenizer.countTokens() != 1 || listL.size() < 3) {
                throw new IOException("Command line '" + f336689h + "' did not return data as expected for path '" + str + "'- check path is valid");
            }
            stringTokenizer = new StringTokenizer(listL.get(2), " ");
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return j(stringTokenizer.nextToken(), str);
    }

    long h(String str, long j10) throws Throwable {
        String strC = l.C(str, false);
        if (strC.length() > 0 && strC.charAt(0) != '\"') {
            strC = "\"" + strC + "\"";
        }
        List<String> listL = l(new String[]{"cmd.exe", "/C", "dir /a /-c " + strC}, Integer.MAX_VALUE, j10);
        for (int size = listL.size() + (-1); size >= 0; size--) {
            String str2 = listL.get(size);
            if (str2.length() > 0) {
                return k(str2, strC);
            }
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + strC + "'");
    }

    Process i(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    long j(String str, String str2) throws IOException {
        try {
            long j10 = Long.parseLong(str);
            if (j10 >= 0) {
                return j10;
            }
            throw new IOException("Command line '" + f336689h + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e10) {
            throw new IOException("Command line '" + f336689h + "' did not return numeric data as expected for path '" + str2 + "'- check path is valid", e10);
        }
    }

    long k(String str, String str2) throws IOException {
        int i10;
        int i11;
        int i12;
        int length = str.length();
        while (true) {
            length--;
            i10 = 0;
            if (length < 0) {
                i11 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i11 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i12 = 0;
                break;
            }
            char cCharAt = str.charAt(length);
            if (!Character.isDigit(cCharAt) && cCharAt != ',' && cCharAt != '.') {
                i12 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException("Command line 'dir /-c' did not return valid info for path '" + str2 + "'");
        }
        StringBuilder sb2 = new StringBuilder(str.substring(i12, i11));
        while (i10 < sb2.length()) {
            if (sb2.charAt(i10) == ',' || sb2.charAt(i10) == '.') {
                sb2.deleteCharAt(i10);
                i10--;
            }
            i10++;
        }
        return j(sb2.toString(), str2);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x014c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.BufferedReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    List<String> l(String[] strArr, int i10, long j10) throws Throwable {
        Process processI;
        OutputStream outputStream;
        InputStream inputStream;
        InputStream errorStream;
        ?? bufferedReader;
        ?? r10;
        ArrayList arrayList = new ArrayList(20);
        InputStream inputStream2 = null;
        try {
            Thread threadB = t.b(j10);
            processI = i(strArr);
            try {
                inputStream = processI.getInputStream();
                try {
                    outputStream = processI.getOutputStream();
                    try {
                        errorStream = processI.getErrorStream();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
                            try {
                                for (String line = bufferedReader.readLine(); line != null && arrayList.size() < i10; line = bufferedReader.readLine()) {
                                    arrayList.add(line.toLowerCase(Locale.ENGLISH).trim());
                                }
                                processI.waitFor();
                                t.d(threadB);
                                if (processI.exitValue() != 0) {
                                    throw new IOException("Command line returned OS error code '" + processI.exitValue() + "' for command " + Arrays.asList(strArr));
                                }
                                if (arrayList.isEmpty()) {
                                    throw new IOException("Command line did not return any info for command " + Arrays.asList(strArr));
                                }
                                p.k(inputStream);
                                p.l(outputStream);
                                p.k(errorStream);
                                p.m(bufferedReader);
                                processI.destroy();
                                return arrayList;
                            } catch (InterruptedException e10) {
                                e = e10;
                                inputStream2 = processI;
                                bufferedReader = bufferedReader;
                                try {
                                    throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j10, e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    processI = inputStream2;
                                    inputStream2 = inputStream;
                                    r10 = bufferedReader;
                                    p.k(inputStream2);
                                    p.l(outputStream);
                                    p.k(errorStream);
                                    p.m(r10);
                                    if (processI != null) {
                                        processI.destroy();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream2 = inputStream;
                                r10 = bufferedReader;
                                p.k(inputStream2);
                                p.l(outputStream);
                                p.k(errorStream);
                                p.m(r10);
                                if (processI != null) {
                                    processI.destroy();
                                }
                                throw th;
                            }
                        } catch (InterruptedException e11) {
                            e = e11;
                            bufferedReader = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedReader = 0;
                        }
                    } catch (InterruptedException e12) {
                        e = e12;
                        errorStream = null;
                        bufferedReader = errorStream;
                        inputStream2 = processI;
                        bufferedReader = bufferedReader;
                        throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j10, e);
                    } catch (Throwable th5) {
                        th = th5;
                        errorStream = null;
                        bufferedReader = errorStream;
                        inputStream2 = inputStream;
                        r10 = bufferedReader;
                        p.k(inputStream2);
                        p.l(outputStream);
                        p.k(errorStream);
                        p.m(r10);
                        if (processI != null) {
                            processI.destroy();
                        }
                        throw th;
                    }
                } catch (InterruptedException e13) {
                    e = e13;
                    outputStream = null;
                    errorStream = outputStream;
                    bufferedReader = errorStream;
                    inputStream2 = processI;
                    bufferedReader = bufferedReader;
                    throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j10, e);
                } catch (Throwable th6) {
                    th = th6;
                    outputStream = null;
                    errorStream = null;
                }
            } catch (InterruptedException e14) {
                e = e14;
                inputStream = null;
                outputStream = null;
            } catch (Throwable th7) {
                th = th7;
                outputStream = null;
                errorStream = outputStream;
                r10 = errorStream;
                p.k(inputStream2);
                p.l(outputStream);
                p.k(errorStream);
                p.m(r10);
                if (processI != null) {
                    processI.destroy();
                }
                throw th;
            }
        } catch (InterruptedException e15) {
            e = e15;
            inputStream = null;
            outputStream = null;
            errorStream = null;
            bufferedReader = 0;
        } catch (Throwable th8) {
            th = th8;
            processI = null;
            outputStream = null;
        }
    }
}
