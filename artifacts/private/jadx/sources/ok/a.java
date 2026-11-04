package ok;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.codec.binary.l;
import org.apache.commons.codec.digest.c;
import org.apache.commons.codec.language.bm.g;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f333644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f333645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f333646c;

    private a(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("args");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException(String.format("Usage: java %s [algorithm] [FILE|DIRECTORY|string] ...", a.class.getName()));
        }
        this.f333645b = strArr;
        this.f333644a = strArr[0];
        if (strArr.length <= 1) {
            this.f333646c = null;
            return;
        }
        String[] strArr2 = new String[strArr.length - 1];
        this.f333646c = strArr2;
        System.arraycopy(strArr, 1, strArr2, 0, strArr2.length);
    }

    public static void a(String[] strArr) throws IOException {
        new a(strArr).d();
    }

    private void b(String str, byte[] bArr) {
        c(str, bArr, null);
    }

    private void c(String str, byte[] bArr, String str2) {
        String str3;
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(l.s(bArr));
        if (str2 != null) {
            str3 = "  " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        printStream.println(sb2.toString());
    }

    private void d() throws IOException {
        if (this.f333644a.equalsIgnoreCase(g.f335338f) || this.f333644a.equals("*")) {
            h(org.apache.commons.codec.digest.g.a());
            return;
        }
        MessageDigest messageDigestP = c.p(this.f333644a, null);
        if (messageDigestP != null) {
            f("", messageDigestP);
        } else {
            f("", c.o(this.f333644a.toUpperCase(Locale.ROOT)));
        }
    }

    private void e(String str, String str2) throws IOException {
        f(str, c.o(str2));
    }

    private void f(String str, MessageDigest messageDigest) throws IOException {
        String[] strArr = this.f333646c;
        if (strArr == null) {
            b(str, c.f(messageDigest, System.in));
            return;
        }
        for (String str2 : strArr) {
            File file = new File(str2);
            if (file.isFile()) {
                c(str, c.e(messageDigest, file), str2);
            } else if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    g(str, messageDigest, fileArrListFiles);
                }
            } else {
                b(str, c.h(messageDigest, str2.getBytes(Charset.defaultCharset())));
            }
        }
    }

    private void g(String str, MessageDigest messageDigest, File[] fileArr) throws IOException {
        for (File file : fileArr) {
            if (file.isFile()) {
                c(str, c.e(messageDigest, file), file.getName());
            }
        }
    }

    private void h(String[] strArr) throws IOException {
        for (String str : strArr) {
            if (c.y(str)) {
                e(str + " ", str);
            }
        }
    }

    public String toString() {
        return String.format("%s %s", super.toString(), Arrays.toString(this.f333645b));
    }
}
