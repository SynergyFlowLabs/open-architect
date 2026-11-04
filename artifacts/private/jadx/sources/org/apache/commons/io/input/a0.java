package org.apache.commons.io.input;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class a0 extends Reader {
    private static final String X = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String Y = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String Z = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f336559d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f336560e = "UTF-8";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f336561f = "US-ASCII";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f336562g = "UTF-16BE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f336563h = "UTF-16LE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f336566k = "UTF-16";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f336567l = "UTF-32";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f336573v = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f336574w = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f336575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f336576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f336577c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final org.apache.commons.io.a[] f336569n = {org.apache.commons.io.a.f336422d, org.apache.commons.io.a.f336423e, org.apache.commons.io.a.f336424f, org.apache.commons.io.a.f336425g, org.apache.commons.io.a.f336426h};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f336564i = "UTF-32BE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f336565j = "UTF-32LE";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f336568m = "CP1047";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final org.apache.commons.io.a[] f336570o = {new org.apache.commons.io.a("UTF-8", 60, 63, 120, 109), new org.apache.commons.io.a("UTF-16BE", 0, 60, 0, 63), new org.apache.commons.io.a("UTF-16LE", 60, 0, 63, 0), new org.apache.commons.io.a(f336564i, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new org.apache.commons.io.a(f336565j, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new org.apache.commons.io.a(f336568m, 76, com.rabbitmq.client.impl.k.b.p.f265340a, 167, com.planner5d.library.engine.input.f.b.G1)};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f336571s = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f336572t = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    public a0(File file) throws IOException {
        this(new FileInputStream(file));
    }

    private String c(b bVar, b bVar2, String str, boolean z10) throws IOException {
        String strF = bVar.f();
        String strF2 = bVar2.f();
        try {
            return a(str, strF, strF2, l(bVar2, strF2), z10);
        } catch (b0 e10) {
            if (z10) {
                return d(str, e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    private String d(String str, b0 b0Var) throws IOException {
        a0 a0Var;
        String strD;
        String str2;
        if (str == null || !str.startsWith("text/html")) {
            a0Var = this;
        } else {
            try {
                a0Var = this;
                try {
                    return a0Var.a("text/xml" + str.substring(9), b0Var.a(), b0Var.e(), b0Var.d(), true);
                } catch (b0 e10) {
                    e = e10;
                    b0Var = e;
                    strD = b0Var.d();
                    if (strD == null) {
                        strD = b0Var.b();
                    }
                    if (strD == null) {
                        return strD;
                    }
                    str2 = a0Var.f336577c;
                    if (str2 == null) {
                        return "UTF-8";
                    }
                    return str2;
                }
            } catch (b0 e11) {
                e = e11;
                a0Var = this;
            }
        }
        strD = b0Var.d();
        if (strD == null) {
            strD = b0Var.b();
        }
        if (strD == null) {
            return strD;
        }
        str2 = a0Var.f336577c;
        if (str2 == null) {
            return "UTF-8";
        }
        return str2;
    }

    private String e(b bVar, b bVar2, boolean z10) throws IOException {
        String strF = bVar.f();
        String strF2 = bVar2.f();
        try {
            return b(strF, strF2, l(bVar2, strF2));
        } catch (b0 e10) {
            if (z10) {
                return d(null, e10);
            }
            throw e10;
        }
    }

    static String f(String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf(";")) > -1) {
            int i10 = (-1) << 1;
            Matcher matcher = f336571s.matcher(str.substring(iIndexOf + 1));
            String strGroup = matcher.find() ? matcher.group(1) : null;
            if (strGroup != null) {
                return strGroup.toUpperCase(Locale.US);
            }
        }
        return null;
    }

    static String g(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(";");
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim();
    }

    private static String l(InputStream inputStream, String str) throws IOException {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[4096];
        inputStream.mark(4096);
        int i10 = inputStream.read(bArr, 0, 4096);
        String str2 = "";
        int i11 = 4096;
        int i12 = 0;
        int iIndexOf = -1;
        while (i10 != -1 && iIndexOf == -1 && i12 < 4096) {
            i12 += i10;
            i11 -= i10;
            i10 = inputStream.read(bArr, i12, i11);
            str2 = new String(bArr, 0, i12, str);
            iIndexOf = str2.indexOf(62);
        }
        if (iIndexOf == -1) {
            if (i10 == -1) {
                throw new IOException("Unexpected end of XML stream");
            }
            throw new IOException("XML prolog or ROOT element not found on first " + i12 + " bytes");
        }
        if (i12 <= 0) {
            return null;
        }
        inputStream.reset();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str2.substring(0, iIndexOf + 1)));
        StringBuffer stringBuffer = new StringBuffer();
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            stringBuffer.append(line);
        }
        Matcher matcher = f336572t.matcher(stringBuffer);
        if (!matcher.find()) {
            return null;
        }
        String upperCase = matcher.group(1).toUpperCase();
        return upperCase.substring(1, upperCase.length() - 1);
    }

    static boolean m(String str) {
        if (str != null) {
            return str.equals("application/xml") || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity") || (str.startsWith("application/") && str.endsWith("+xml"));
        }
        return false;
    }

    static boolean o(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("text/xml") || str.equals("text/xml-external-parsed-entity")) {
            return true;
        }
        return str.startsWith("text/") && str.endsWith("+xml");
    }

    String a(String str, String str2, String str3, String str4, boolean z10) throws IOException {
        if (z10 && str4 != null) {
            return str4;
        }
        String strG = g(str);
        String strF = f(str);
        boolean zM = m(strG);
        boolean zO = o(strG);
        if (!zM && !zO) {
            throw new b0(MessageFormat.format(Z, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
        }
        if (strF == null) {
            if (zM) {
                return b(str2, str3, str4);
            }
            String str5 = this.f336577c;
            return str5 == null ? "US-ASCII" : str5;
        }
        if (strF.equals("UTF-16BE") || strF.equals("UTF-16LE")) {
            if (str2 != null) {
                throw new b0(MessageFormat.format(X, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
            }
        } else {
            if (strF.equals("UTF-16")) {
                if (str2 == null || !str2.startsWith("UTF-16")) {
                    throw new b0(MessageFormat.format(Y, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
                }
                return str2;
            }
            if (strF.equals(f336564i) || strF.equals(f336565j)) {
                if (str2 != null) {
                    throw new b0(MessageFormat.format(X, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
                }
            } else if (strF.equals(f336567l)) {
                if (str2 == null || !str2.startsWith(f336567l)) {
                    throw new b0(MessageFormat.format(Y, strG, strF, str2, str3, str4), strG, strF, str2, str3, str4);
                }
                return str2;
            }
        }
        return strF;
    }

    String b(String str, String str2, String str3) throws IOException {
        if (str == null) {
            if (str2 != null && str3 != null) {
                return (str3.equals("UTF-16") && (str2.equals("UTF-16BE") || str2.equals("UTF-16LE"))) ? str2 : str3;
            }
            String str4 = this.f336577c;
            return str4 == null ? "UTF-8" : str4;
        }
        if (str.equals("UTF-8")) {
            if (str2 != null && !str2.equals("UTF-8")) {
                throw new b0(MessageFormat.format(f336573v, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals("UTF-8")) {
                throw new b0(MessageFormat.format(f336573v, str, str2, str3), str, str2, str3);
            }
        } else if (str.equals("UTF-16BE") || str.equals("UTF-16LE")) {
            if (str2 != null && !str2.equals(str)) {
                throw new b0(MessageFormat.format(f336573v, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals("UTF-16") && !str3.equals(str)) {
                throw new b0(MessageFormat.format(f336573v, str, str2, str3), str, str2, str3);
            }
        } else {
            if (!str.equals(f336564i) && !str.equals(f336565j)) {
                throw new b0(MessageFormat.format(f336574w, str, str2, str3), str, str2, str3);
            }
            if (str2 != null && !str2.equals(str)) {
                throw new b0(MessageFormat.format(f336573v, str, str2, str3), str, str2, str3);
            }
            if (str3 != null && !str3.equals(f336567l) && !str3.equals(str)) {
                throw new b0(MessageFormat.format(f336573v, str, str2, str3), str, str2, str3);
            }
        }
        return str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f336575a.close();
    }

    public String h() {
        return this.f336577c;
    }

    public String j() {
        return this.f336576b;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        return this.f336575a.read(cArr, i10, i11);
    }

    public a0(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    public a0(InputStream inputStream, boolean z10) throws IOException {
        this(inputStream, z10, (String) null);
    }

    public a0(InputStream inputStream, boolean z10, String str) throws IOException {
        this.f336577c = str;
        b bVar = new b(new BufferedInputStream(inputStream, 4096), false, f336569n);
        b bVar2 = new b(bVar, true, f336570o);
        String strE = e(bVar, bVar2, z10);
        this.f336576b = strE;
        this.f336575a = new InputStreamReader(bVar2, strE);
    }

    public a0(URL url) throws IOException {
        this((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()), (String) null);
    }

    public a0(URLConnection uRLConnection, String str) throws IOException {
        this.f336577c = str;
        String contentType = uRLConnection.getContentType();
        b bVar = new b(new BufferedInputStream(uRLConnection.getInputStream(), 4096), false, f336569n);
        b bVar2 = new b(bVar, true, f336570o);
        if ((uRLConnection instanceof HttpURLConnection) || contentType != null) {
            this.f336576b = c(bVar, bVar2, contentType, true);
        } else {
            this.f336576b = e(bVar, bVar2, true);
        }
        this.f336575a = new InputStreamReader(bVar2, this.f336576b);
    }

    public a0(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true);
    }

    public a0(InputStream inputStream, String str, boolean z10, String str2) throws IOException {
        this.f336577c = str2;
        b bVar = new b(new BufferedInputStream(inputStream, 4096), false, f336569n);
        b bVar2 = new b(bVar, true, f336570o);
        String strC = c(bVar, bVar2, str, z10);
        this.f336576b = strC;
        this.f336575a = new InputStreamReader(bVar2, strC);
    }

    public a0(InputStream inputStream, String str, boolean z10) throws IOException {
        this(inputStream, str, z10, null);
    }
}
