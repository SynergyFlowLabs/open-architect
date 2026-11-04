package io.grpc.okhttp.internal;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f290480a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f290481b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f290482c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f290483d = 7;

    private f() {
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> listB = b(x509Certificate, 7);
        List<String> listB2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listB.size() + listB2.size());
        arrayList.addAll(listB);
        arrayList.addAll(listB2);
        return arrayList;
    }

    private static List<String> b(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    static boolean d(String str) {
        return f290481b.matcher(str).matches();
    }

    private boolean e(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (lowerCase.startsWith("*.") && lowerCase.indexOf(42, 1) == -1) {
                if (str.length() >= lowerCase.length() && !"*.".equals(lowerCase)) {
                    String strSubstring = lowerCase.substring(1);
                    if (!str.endsWith(strSubstring)) {
                        return false;
                    }
                    int length = str.length() - strSubstring.length();
                    return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
                }
                return false;
            }
        }
        return false;
    }

    private boolean f(String str, X509Certificate x509Certificate) {
        String strB;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> listB = b(x509Certificate, 2);
        int size = listB.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            if (e(lowerCase, listB.get(i10))) {
                return true;
            }
            i10++;
            z10 = true;
        }
        if (z10 || (strB = new d(x509Certificate.getSubjectX500Principal()).b("cn")) == null) {
            return false;
        }
        return e(lowerCase, strB);
    }

    private boolean g(String str, X509Certificate x509Certificate) {
        List<String> listB = b(x509Certificate, 7);
        int size = listB.size();
        boolean z10 = false | false;
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(listB.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean c(String str, X509Certificate x509Certificate) {
        return d(str) ? g(str, x509Certificate) : f(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
