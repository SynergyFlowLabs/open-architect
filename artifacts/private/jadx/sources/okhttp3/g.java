package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f333839c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final g f333840d = new a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<c> f333841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final mk.c f333842b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<c> f333843a = new ArrayList();

        @NotNull
        public final a a(@NotNull String pattern, @NotNull String... pins) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.f333843a.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final g b() {
            return new g(CollectionsKt.toSet(this.f333843a), null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final List<c> c() {
            return this.f333843a;
        }
    }

    @SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final String a(@NotNull Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).n();
        }

        @oj.n
        @NotNull
        public final okio.o b(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            okio.o.a aVar = okio.o.f335046d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return okio.o.a.p(aVar, encoded, 0, 0, 3, null).s0();
        }

        @oj.n
        @NotNull
        public final okio.o c(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            okio.o.a aVar = okio.o.f335046d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return okio.o.a.p(aVar, encoded, 0, 0, 3, null).t0();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f333844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f333845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final okio.o f333846c;

        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
        /* JADX WARN: Code duplicated, block: B:16:0x0062  */
        /* JADX WARN: Code duplicated, block: B:18:0x0073  */
        /* JADX WARN: Code duplicated, block: B:20:0x008c  */
        /* JADX WARN: Code duplicated, block: B:22:0x008f  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:36:0x0114  */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x008f, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x00cb, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x00e2, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00fa, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:36:0x0114, please report this as an issue */
        public c(@NotNull String pattern, @NotNull String pin) {
            String str;
            String strE;
            okio.o oVarH;
            okio.o oVarH2;
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (StringsKt.u2(pattern, "*.", false, 2, null)) {
                str = pattern;
                if (StringsKt.r3(str, "*", 1, false, 4, null) != -1) {
                }
                strE = jk.a.e(str);
                if (strE != null) {
                    throw new IllegalArgumentException("Invalid pattern: " + str);
                }
                this.f333844a = strE;
                if (StringsKt.u2(pin, "sha1/", false, 2, null)) {
                    this.f333845b = "sha1";
                    okio.o.a aVar = okio.o.f335046d;
                    String strSubstring = pin.substring(5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    oVarH2 = aVar.h(strSubstring);
                    if (oVarH2 != null) {
                        this.f333846c = oVarH2;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + pin);
                }
                if (StringsKt.u2(pin, "sha256/", false, 2, null)) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
                }
                this.f333845b = "sha256";
                okio.o.a aVar2 = okio.o.f335046d;
                String strSubstring2 = pin.substring(7);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                oVarH = aVar2.h(strSubstring2);
                if (oVarH != null) {
                    this.f333846c = oVarH;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            str = pattern;
            if (StringsKt.u2(str, "**.", false, 2, null)) {
                int i10 = 6 << 4;
                if (StringsKt.r3(str, "*", 2, false, 4, null) != -1) {
                    if (StringsKt.r3(str, "*", 0, false, 6, null) != -1) {
                        throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
                    }
                }
            } else if (StringsKt.r3(str, "*", 0, false, 6, null) != -1) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            strE = jk.a.e(str);
            if (strE != null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.f333844a = strE;
            if (StringsKt.u2(pin, "sha1/", false, 2, null)) {
                this.f333845b = "sha1";
                okio.o.a aVar3 = okio.o.f335046d;
                String strSubstring3 = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                oVarH2 = aVar3.h(strSubstring3);
                if (oVarH2 != null) {
                    this.f333846c = oVarH2;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            if (StringsKt.u2(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.f333845b = "sha256";
            okio.o.a aVar4 = okio.o.f335046d;
            String strSubstring4 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
            oVarH = aVar4.h(strSubstring4);
            if (oVarH != null) {
                this.f333846c = oVarH;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + pin);
        }

        @NotNull
        public final okio.o a() {
            return this.f333846c;
        }

        @NotNull
        public final String b() {
            return this.f333845b;
        }

        @NotNull
        public final String c() {
            return this.f333844a;
        }

        public final boolean d(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            String str = this.f333845b;
            if (Intrinsics.areEqual(str, "sha256")) {
                return Intrinsics.areEqual(this.f333846c, g.f333839c.c(certificate));
            }
            if (Intrinsics.areEqual(str, "sha1")) {
                return Intrinsics.areEqual(this.f333846c, g.f333839c.b(certificate));
            }
            return false;
        }

        public final boolean e(@NotNull String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            int i10 = 7 << 2;
            if (StringsKt.u2(this.f333844a, "**.", false, 2, null)) {
                int length = this.f333844a.length() - 3;
                int length2 = hostname.length() - length;
                int i11 = 4 >> 3;
                return StringsKt.f2(hostname, hostname.length() - length, this.f333844a, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!StringsKt.u2(this.f333844a, "*.", false, 2, null)) {
                return Intrinsics.areEqual(hostname, this.f333844a);
            }
            int length3 = this.f333844a.length() - 1;
            return StringsKt.f2(hostname, hostname.length() - length3, this.f333844a, 1, length3, false, 16, null) && StringsKt.F3(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f333844a, cVar.f333844a) && Intrinsics.areEqual(this.f333845b, cVar.f333845b) && Intrinsics.areEqual(this.f333846c, cVar.f333846c);
        }

        public int hashCode() {
            return (((this.f333844a.hashCode() * 31) + this.f333845b.hashCode()) * 31) + this.f333846c.hashCode();
        }

        @NotNull
        public String toString() {
            return this.f333845b + '/' + this.f333846c.n();
        }
    }

    @SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"})
    static final class d extends l0 implements Function0<List<? extends X509Certificate>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f333848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f333849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.f333848b = list;
            this.f333849c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            List<Certificate> listA;
            mk.c cVarE = g.this.e();
            if (cVarE == null || (listA = cVarE.a(this.f333848b, this.f333849c)) == null) {
                listA = this.f333848b;
            }
            List<Certificate> list = listA;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Certificate certificate : list) {
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(@NotNull Set<c> pins, @Nullable mk.c cVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f333841a = pins;
        this.f333842b = cVar;
    }

    @oj.n
    @NotNull
    public static final String g(@NotNull Certificate certificate) {
        return f333839c.a(certificate);
    }

    @oj.n
    @NotNull
    public static final okio.o h(@NotNull X509Certificate x509Certificate) {
        return f333839c.b(x509Certificate);
    }

    @oj.n
    @NotNull
    public static final okio.o i(@NotNull X509Certificate x509Certificate) {
        return f333839c.c(x509Certificate);
    }

    public final void a(@NotNull String hostname, @NotNull List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        c(hostname, new d(peerCertificates, hostname));
    }

    @kotlin.l(message = "replaced with {@link #check(String, List)}.", replaceWith = @b1(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@NotNull String hostname, @NotNull Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        a(hostname, ArraysKt.toList(peerCertificates));
    }

    public final void c(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listD = d(hostname);
        if (!listD.isEmpty()) {
            List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
            for (X509Certificate x509Certificate : listInvoke) {
                okio.o oVarC = null;
                int i10 = 7 << 0;
                okio.o oVarB = null;
                for (c cVar : listD) {
                    String strB = cVar.b();
                    if (Intrinsics.areEqual(strB, "sha256")) {
                        if (oVarC == null) {
                            oVarC = f333839c.c(x509Certificate);
                        }
                        if (Intrinsics.areEqual(cVar.a(), oVarC)) {
                        }
                    } else {
                        if (!Intrinsics.areEqual(strB, "sha1")) {
                            throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                        }
                        if (oVarB == null) {
                            oVarB = f333839c.b(x509Certificate);
                        }
                        if (Intrinsics.areEqual(cVar.a(), oVarB)) {
                        }
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : listInvoke) {
                sb2.append("\n    ");
                sb2.append(f333839c.a(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(hostname);
            sb2.append(":");
            for (c cVar2 : listD) {
                sb2.append("\n    ");
                sb2.append(cVar2);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(string);
        }
    }

    @NotNull
    public final List<c> d(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<c> set = this.f333841a;
        List<c> listEmptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((c) obj).e(hostname)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                r1.g(listEmptyList).add(obj);
            }
        }
        return listEmptyList;
    }

    @Nullable
    public final mk.c e() {
        return this.f333842b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(gVar.f333841a, this.f333841a) && Intrinsics.areEqual(gVar.f333842b, this.f333842b);
    }

    @NotNull
    public final Set<c> f() {
        return this.f333841a;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f333841a.hashCode()) * 41;
        mk.c cVar = this.f333842b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @NotNull
    public final g j(@NotNull mk.c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f333842b, certificateChainCleaner) ? this : new g(this.f333841a, certificateChainCleaner);
    }

    public /* synthetic */ g(Set set, mk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
