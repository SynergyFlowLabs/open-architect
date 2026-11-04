package com.rabbitmq.client.impl;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes13.dex */
public class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final org.slf4j.c f265855a = org.slf4j.e.k(u1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f265856b = Collections.unmodifiableList(Arrays.asList("digitalSignature", "nonRepudiation", "keyEncipherment", "dataEncipherment", "keyAgreement", "keyCertSign", "cRLSign", "encipherOnly", "decipherOnly"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f265857c = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f265858d = "<parsing-error>";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, BiFunction<byte[], X509Certificate, String>> f265859e = Collections.unmodifiableMap(new b());

    static class a extends HashMap<String, String> {
        a() {
            put("1.3.6.1.5.5.7.3.1", "TLS Web server authentication");
            put("1.3.6.1.5.5.7.3.2", "TLS Web client authentication");
            put("1.3.6.1.5.5.7.3.3", "Signing of downloadable executable code");
            put("1.3.6.1.5.5.7.3.4", "E-mail protection");
            put("1.3.6.1.5.5.7.3.8", "Binding the hash of an object to a time from an agreed-upon time");
        }
    }

    static class b extends HashMap<String, BiFunction<byte[], X509Certificate, String>> {
        b() {
            put("2.5.29.14", new BiFunction() { // from class: com.rabbitmq.client.impl.v1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.i((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.15", new BiFunction() { // from class: com.rabbitmq.client.impl.y1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.j((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.16", new BiFunction() { // from class: com.rabbitmq.client.impl.z1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.c((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.17", new BiFunction() { // from class: com.rabbitmq.client.impl.a2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.k((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.18", new BiFunction() { // from class: com.rabbitmq.client.impl.b2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.h((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.19", new BiFunction() { // from class: com.rabbitmq.client.impl.c2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.b((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.30", new BiFunction() { // from class: com.rabbitmq.client.impl.d2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.d((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.33", new BiFunction() { // from class: com.rabbitmq.client.impl.e2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.g((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.35", new BiFunction() { // from class: com.rabbitmq.client.impl.f2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.e((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.36", new BiFunction() { // from class: com.rabbitmq.client.impl.w1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.a((byte[]) obj, (X509Certificate) obj2);
                }
            });
            put("2.5.29.37", new BiFunction() { // from class: com.rabbitmq.client.impl.x1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.b.f((byte[]) obj, (X509Certificate) obj2);
                }
            });
        }

        public static /* synthetic */ String a(byte[] bArr, X509Certificate x509Certificate) {
            return "PolicyConstraints = " + u1.q(0, bArr);
        }

        public static /* synthetic */ String b(byte[] bArr, X509Certificate x509Certificate) {
            return "BasicConstraints = " + u1.m(bArr);
        }

        public static /* synthetic */ String c(byte[] bArr, X509Certificate x509Certificate) {
            return "PrivateKeyUsage = " + u1.q(0, bArr);
        }

        public static /* synthetic */ String d(byte[] bArr, X509Certificate x509Certificate) {
            return "NameConstraints = " + u1.q(0, bArr);
        }

        public static /* synthetic */ String e(byte[] bArr, X509Certificate x509Certificate) {
            return "AuthorityKeyIdentifier = " + u1.l(bArr);
        }

        public static /* synthetic */ String f(byte[] bArr, X509Certificate x509Certificate) {
            return "ExtendedKeyUsage = " + u1.n(bArr, x509Certificate);
        }

        public static /* synthetic */ String g(byte[] bArr, X509Certificate x509Certificate) {
            return "PolicyMappings = " + u1.q(0, bArr);
        }

        public static /* synthetic */ String h(byte[] bArr, X509Certificate x509Certificate) {
            return "IssuerAlternativeName = " + u1.q(0, bArr);
        }

        public static /* synthetic */ String i(byte[] bArr, X509Certificate x509Certificate) {
            return "SubjectKeyIdentifier = " + u1.t(bArr);
        }

        public static /* synthetic */ String j(byte[] bArr, X509Certificate x509Certificate) {
            return "KeyUsage = " + u1.r(x509Certificate.getKeyUsage(), bArr);
        }

        public static /* synthetic */ String k(byte[] bArr, X509Certificate x509Certificate) {
            try {
                return "SubjectAlternativeName = " + u1.v(x509Certificate, "/");
            } catch (CertificateParsingException unused) {
                return "SubjectAlternativeName = " + u1.f265858d;
            }
        }
    }

    public static /* synthetic */ String c(String str, byte[] bArr, byte[] bArr2, X509Certificate x509Certificate) {
        return str + " = " + q(0, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l(byte[] bArr) {
        if (bArr.length != 26 || bArr[0] != 4) {
            return q(0, bArr);
        }
        return "keyid:" + q(6, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(byte[] bArr) {
        if (bArr.length == 4 && bArr[3] == 0) {
            return "CA:FALSE";
        }
        if (bArr.length < 7 || bArr[2] != 48 || bArr[4] != 1) {
            return q(0, bArr);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CA:");
        sb2.append(bArr[6] == 0 ? "FALSE" : "TRUE");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(byte[] bArr, X509Certificate x509Certificate) {
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            return extendedKeyUsage == null ? q(0, bArr) : String.join("/", (Iterable<? extends CharSequence>) extendedKeyUsage.stream().map(new Function() { // from class: com.rabbitmq.client.impl.t1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    return u1.f265857c.getOrDefault(str, str);
                }
            }).collect(Collectors.toList()));
        } catch (CertificateParsingException unused) {
            return f265858d;
        }
    }

    public static String o(final String str, final byte[] bArr, X509Certificate x509Certificate) {
        try {
            return f265859e.getOrDefault(str, new BiFunction() { // from class: com.rabbitmq.client.impl.s1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return u1.c(str, bArr, (byte[]) obj, (X509Certificate) obj2);
                }
            }).apply(bArr, x509Certificate);
        } catch (Exception unused) {
            return str + " = " + f265858d;
        }
    }

    private static String p(X509Certificate x509Certificate) {
        ArrayList arrayList = new ArrayList();
        for (String str : x509Certificate.getCriticalExtensionOIDs()) {
            arrayList.add(o(str, x509Certificate.getExtensionValue(str), x509Certificate) + " (critical)");
        }
        for (String str2 : x509Certificate.getNonCriticalExtensionOIDs()) {
            arrayList.add(o(str2, x509Certificate.getExtensionValue(str2), x509Certificate) + " (non-critical)");
        }
        return String.join(", ", arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String q(int i10, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        while (i10 < bArr.length) {
            arrayList.add(String.format("%02X", Byte.valueOf(bArr[i10])));
            i10++;
        }
        return String.join(":", arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String r(boolean[] zArr, byte[] bArr) {
        if (zArr == null) {
            return q(0, bArr);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < zArr.length; i10++) {
            if (zArr[i10]) {
                arrayList.add(f265856b.get(i10));
            }
        }
        return String.join("/", arrayList);
    }

    public static void s(SSLSession sSLSession) {
        org.slf4j.c cVar = f265855a;
        if (cVar.O()) {
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates == null || peerCertificates.length <= 0) {
                    return;
                }
                cVar.g(u(peerCertificates[0], "Peer's leaf certificate"));
                for (int i10 = 1; i10 < peerCertificates.length; i10++) {
                    f265855a.g(u(peerCertificates[i10], "Peer's certificate chain entry"));
                }
            } catch (Exception e10) {
                f265855a.D("Error while logging peer certificate info: {}", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(byte[] bArr) {
        return (bArr.length > 4 && bArr[0] == 4 && bArr[2] == 4) ? q(4, bArr) : q(0, bArr);
    }

    public static String u(Certificate certificate, String str) {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        try {
            return String.format("%s subject: %s, subject alternative names: %s, issuer: %s, not valid after: %s, X.509 usage extensions: %s", w(str), w(x509Certificate.getSubjectDN().getName()), w(v(x509Certificate, ",")), w(x509Certificate.getIssuerDN().getName()), x509Certificate.getNotAfter(), w(p(x509Certificate)));
        } catch (Exception unused) {
            return "Error while retrieving " + str + " certificate information";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(X509Certificate x509Certificate, String str) throws CertificateParsingException {
        return String.join(str, (Iterable<? extends CharSequence>) ((Collection) Optional.ofNullable(x509Certificate.getSubjectAlternativeNames()).orElse(new ArrayList())).stream().map(new Function() { // from class: com.rabbitmq.client.impl.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((List) obj).toString();
            }
        }).collect(Collectors.toList()));
    }

    public static String w(String str) {
        return str.replaceAll(org.apache.commons.lang3.z.f337565d, "").replaceAll("\n", "");
    }
}
