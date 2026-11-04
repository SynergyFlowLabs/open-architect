package io.ktor.http.content;

import io.ktor.http.c1;
import io.ktor.http.d1;
import io.ktor.http.r0;
import io.ktor.http.u0;
import io.ktor.http.v0;
import io.ktor.http.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,307:1\n1#2:308\n1761#3,3:309\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion\n*L\n227#1:309,3\n*E\n"})
public final class p implements f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f295746d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final p f295747e = new p("*", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f295749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f295750c;

    @SourceDebugExtension({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1563#2:308\n1634#2,2:309\n1636#2:312\n1#3:311\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion$Companion\n*L\n271#1:308\n271#1:309,2\n271#1:312\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p a() {
            return p.f295747e;
        }

        @NotNull
        public final List<p> b(@NotNull String headerValue) {
            Intrinsics.checkNotNullParameter(headerValue, "headerValue");
            List<r0> listF = c1.f(headerValue);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listF, 10));
            for (r0 r0Var : listF) {
                if (r0Var.f() != 1.0d) {
                    throw new IllegalStateException(("entity-tag quality parameter is not allowed: " + r0Var.f() + '.').toString());
                }
                if (!r0Var.e().isEmpty()) {
                    throw new IllegalStateException(("entity-tag parameters are not allowed: " + r0Var.e() + '.').toString());
                }
                arrayList.add(p.f295746d.c(r0Var.g()));
            }
            return arrayList;
        }

        @NotNull
        public final p c(@NotNull String value) {
            boolean z10;
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "*")) {
                return a();
            }
            int i10 = 0 ^ 2;
            if (StringsKt.u2(value, "W/", false, 2, null)) {
                value = StringsKt.A6(value, 2);
                z10 = true;
            } else {
                z10 = false;
            }
            if (!StringsKt.u2(value, "\"", false, 2, null)) {
                value = u0.g(value);
            }
            return new p(value, z10);
        }

        private a() {
        }
    }

    public p(@NotNull String etag, boolean z10) {
        Intrinsics.checkNotNullParameter(etag, "etag");
        this.f295748a = etag;
        this.f295749b = z10;
        this.f295750c = (Intrinsics.areEqual(etag, "*") || StringsKt.u2(etag, "\"", false, 2, null)) ? etag : u0.g(etag);
        int length = etag.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = this.f295748a.charAt(i10);
            if ((Intrinsics.compare((int) cCharAt, 32) <= 0 || cCharAt == '\"') && i10 != 0 && i10 != StringsKt.i3(this.f295748a)) {
                throw new IllegalArgumentException(("Character '" + cCharAt + "' is not allowed in entity-tag.").toString());
            }
        }
    }

    public static /* synthetic */ p g(p pVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pVar.f295748a;
        }
        if ((i10 & 2) != 0) {
            z10 = pVar.f295749b;
        }
        return pVar.f(str, z10);
    }

    @Override // io.ktor.http.content.f0
    public void a(@NotNull w0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        io.ktor.http.a.a(builder, this.f295750c);
    }

    @Override // io.ktor.http.content.f0
    @NotNull
    public g0 b(@NotNull v0 requestHeaders) {
        List<p> listB;
        g0 g0VarJ;
        List<p> listB2;
        g0 g0VarL;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        d1 d1Var = d1.f295782a;
        String str = requestHeaders.get(d1Var.T());
        if (str != null && (listB2 = f295746d.b(str)) != null && (g0VarL = l(listB2)) != g0.f295714b) {
            return g0VarL;
        }
        String str2 = requestHeaders.get(d1Var.R());
        return (str2 == null || (listB = f295746d.b(str2)) == null || (g0VarJ = j(listB)) == g0.f295714b) ? g0.f295714b : g0VarJ;
    }

    @NotNull
    public final String d() {
        return this.f295748a;
    }

    public final boolean e() {
        return this.f295749b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f295748a, pVar.f295748a) && this.f295749b == pVar.f295749b;
    }

    @NotNull
    public final p f(@NotNull String etag, boolean z10) {
        Intrinsics.checkNotNullParameter(etag, "etag");
        return new p(etag, z10);
    }

    @NotNull
    public final String h() {
        return this.f295748a;
    }

    public int hashCode() {
        return (this.f295748a.hashCode() * 31) + Boolean.hashCode(this.f295749b);
    }

    public final boolean i() {
        return this.f295749b;
    }

    @NotNull
    public final g0 j(@NotNull List<p> givenMatchEtags) {
        Intrinsics.checkNotNullParameter(givenMatchEtags, "givenMatchEtags");
        if (!givenMatchEtags.isEmpty() && !givenMatchEtags.contains(f295747e)) {
            Iterator<p> it = givenMatchEtags.iterator();
            while (it.hasNext()) {
                if (k(it.next())) {
                    return g0.f295714b;
                }
            }
            return g0.f295716d;
        }
        return g0.f295714b;
    }

    public final boolean k(@NotNull p other) {
        Intrinsics.checkNotNullParameter(other, "other");
        p pVar = f295747e;
        if (Intrinsics.areEqual(this, pVar) || Intrinsics.areEqual(other, pVar)) {
            return true;
        }
        return Intrinsics.areEqual(this.f295750c, other.f295750c);
    }

    @NotNull
    public final g0 l(@NotNull List<p> givenNoneMatchEtags) {
        Intrinsics.checkNotNullParameter(givenNoneMatchEtags, "givenNoneMatchEtags");
        if (givenNoneMatchEtags.contains(f295747e)) {
            return g0.f295714b;
        }
        List<p> list = givenNoneMatchEtags;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (k((p) it.next())) {
                    return g0.f295715c;
                }
            }
        }
        return g0.f295714b;
    }

    @NotNull
    public String toString() {
        return "EntityTagVersion(etag=" + this.f295748a + ", weak=" + this.f295749b + ')';
    }
}
