package mk;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import jk.f;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.g1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f332680a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f332681b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f332682c = 7;

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) g1.l(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.u2(str, ".", false, 2, null) && !StringsKt.M1(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !StringsKt.u2(str2, ".", false, 2, null) && !StringsKt.M1(str2, "..", false, 2, null)) {
            if (!StringsKt.M1(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt.M1(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strB = b(str2);
            if (!StringsKt.V2(strB, "*", false, 2, null)) {
                return Intrinsics.areEqual(str3, strB);
            }
            if (!StringsKt.u2(strB, "*.", false, 2, null) || StringsKt.q3(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || Intrinsics.areEqual("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!StringsKt.M1(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || StringsKt.F3(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List<String> listC = c(x509Certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (f332680a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strE = jk.a.e(str);
        List<String> listC = c(x509Certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strE, jk.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<String> a(@NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        int i10 = 6 | 2;
        return CollectionsKt.plus((Collection) c(certificate, 7), (Iterable) c(certificate, 2));
    }

    public final boolean e(@NotNull String host, @NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return f.k(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
