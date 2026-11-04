package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f334761e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f334762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f334763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Certificate> f334764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f334765d;

    @SourceDebugExtension({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: okhttp3.t$a$a, reason: collision with other inner class name */
        static final class C2377a extends l0 implements Function0<List<? extends Certificate>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f334766a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2377a(List<? extends Certificate> list) {
                super(0);
                this.f334766a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.f334766a;
            }
        }

        static final class b extends l0 implements Function0<List<? extends Certificate>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f334767a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(List<? extends Certificate> list) {
                super(0);
                this.f334767a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.f334767a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Certificate> d(Certificate[] certificateArr) {
            return certificateArr != null ? jk.f.C(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "sslSession.handshake()", imports = {}))
        @oj.i(name = "-deprecated_get")
        @NotNull
        public final t a(@NotNull SSLSession sslSession) throws IOException {
            Intrinsics.checkNotNullParameter(sslSession, "sslSession");
            return b(sslSession);
        }

        @oj.n
        @oj.i(name = "get")
        @NotNull
        public final t b(@NotNull SSLSession sSLSession) throws IOException {
            List<Certificate> listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            i iVarB = i.f333864b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            i0 i0VarA = i0.f333933b.a(protocol);
            try {
                listEmptyList = d(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new t(i0VarA, iVarB, d(sSLSession.getLocalCertificates()), new b(listEmptyList));
        }

        @oj.n
        @NotNull
        public final t c(@NotNull i0 tlsVersion, @NotNull i cipherSuite, @NotNull List<? extends Certificate> peerCertificates, @NotNull List<? extends Certificate> localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new t(tlsVersion, cipherSuite, jk.f.h0(localCertificates), new C2377a(jk.f.h0(peerCertificates)));
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function0<List<? extends Certificate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<List<Certificate>> f334768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.f334768a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            try {
                return this.f334768a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@NotNull i0 tlsVersion, @NotNull i cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f334762a = tlsVersion;
        this.f334763b = cipherSuite;
        this.f334764c = localCertificates;
        this.f334765d = kotlin.g0.c(new b(peerCertificatesFn));
    }

    @oj.n
    @oj.i(name = "get")
    @NotNull
    public static final t h(@NotNull SSLSession sSLSession) throws IOException {
        return f334761e.b(sSLSession);
    }

    @oj.n
    @NotNull
    public static final t i(@NotNull i0 i0Var, @NotNull i iVar, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return f334761e.c(i0Var, iVar, list, list2);
    }

    private final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "cipherSuite", imports = {}))
    @oj.i(name = "-deprecated_cipherSuite")
    @NotNull
    public final i a() {
        return this.f334763b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "localCertificates", imports = {}))
    @oj.i(name = "-deprecated_localCertificates")
    @NotNull
    public final List<Certificate> b() {
        return this.f334764c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "localPrincipal", imports = {}))
    @oj.i(name = "-deprecated_localPrincipal")
    @Nullable
    public final Principal c() {
        return l();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "peerCertificates", imports = {}))
    @oj.i(name = "-deprecated_peerCertificates")
    @NotNull
    public final List<Certificate> d() {
        return m();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "peerPrincipal", imports = {}))
    @oj.i(name = "-deprecated_peerPrincipal")
    @Nullable
    public final Principal e() {
        return n();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (tVar.f334762a == this.f334762a && Intrinsics.areEqual(tVar.f334763b, this.f334763b) && Intrinsics.areEqual(tVar.m(), m()) && Intrinsics.areEqual(tVar.f334764c, this.f334764c)) {
                return true;
            }
        }
        return false;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "tlsVersion", imports = {}))
    @oj.i(name = "-deprecated_tlsVersion")
    @NotNull
    public final i0 f() {
        return this.f334762a;
    }

    @oj.i(name = "cipherSuite")
    @NotNull
    public final i g() {
        return this.f334763b;
    }

    public int hashCode() {
        return ((((((527 + this.f334762a.hashCode()) * 31) + this.f334763b.hashCode()) * 31) + m().hashCode()) * 31) + this.f334764c.hashCode();
    }

    @oj.i(name = "localCertificates")
    @NotNull
    public final List<Certificate> k() {
        return this.f334764c;
    }

    @oj.i(name = "localPrincipal")
    @Nullable
    public final Principal l() {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) this.f334764c);
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @oj.i(name = "peerCertificates")
    @NotNull
    public final List<Certificate> m() {
        return (List) this.f334765d.getValue();
    }

    @oj.i(name = "peerPrincipal")
    @Nullable
    public final Principal n() {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) m());
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @oj.i(name = "tlsVersion")
    @NotNull
    public final i0 o() {
        return this.f334762a;
    }

    @NotNull
    public String toString() {
        List<Certificate> listM = m();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(j((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f334762a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f334763b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f334764c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
