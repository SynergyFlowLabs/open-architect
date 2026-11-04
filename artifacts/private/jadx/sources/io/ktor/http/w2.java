package io.ktor.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nURLUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLUtils.kt\nio/ktor/http/URLUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1#2:227\n1374#3:228\n1460#3,2:229\n1563#3:231\n1634#3,3:232\n1462#3,3:235\n*S KotlinDebug\n*F\n+ 1 URLUtils.kt\nio/ktor/http/URLUtilsKt\n*L\n171#1:228\n171#1:229,2\n172#1:231\n172#1:232,3\n171#1:235,3\n*E\n"})
public final class w2 {
    @NotNull
    public static final k2 b(@NotNull k2 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return t(new k2(null, null, 0, null, null, null, null, null, false, 511, null), builder);
    }

    @NotNull
    public static final k2 c(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        int i10 = 4 ^ 0;
        return u(new k2(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    @NotNull
    public static final k2 d(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return r2.m(new k2(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    @NotNull
    public static final Url e(@NotNull k2 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return t(new k2(null, null, 0, null, null, null, null, null, false, 511, null), builder).b();
    }

    @NotNull
    public static final Url f(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return d(urlString).b();
    }

    public static final void g(@NotNull Appendable appendable, @NotNull String encodedPath, @NotNull y1 encodedQueryParameters, boolean z10) {
        List listListOf;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!StringsKt.w3(encodedPath) && !StringsKt.u2(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z10) {
            appendable.append(com.planner5d.library.model.payments.a.f222474i);
        }
        Set<Map.Entry<String, List<String>>> setK = encodedQueryParameters.k();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setK.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = CollectionsKt.listOf(TuplesKt.to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(TuplesKt.to(str, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            CollectionsKt.addAll(arrayList, listListOf);
        }
        CollectionsKt___CollectionsKt.joinTo(arrayList, appendable, (124 & 2) != 0 ? ", " : "&", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: io.ktor.http.v2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.i((Pair) obj);
            }
        });
    }

    public static final void h(@NotNull Appendable appendable, @NotNull String encodedPath, @NotNull String encodedQuery, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQuery, "encodedQuery");
        if (!StringsKt.w3(encodedPath) && !StringsKt.u2(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (encodedQuery.length() > 0 || z10) {
            appendable.append(com.planner5d.library.model.payments.a.f222474i);
        }
        appendable.append(encodedQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = (String) it.getFirst();
        if (it.getSecond() == null) {
            return str;
        }
        return str + '=' + String.valueOf(it.getSecond());
    }

    public static final void j(@NotNull StringBuilder sb2, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        if (str == null) {
            return;
        }
        sb2.append(str);
        if (str2 != null) {
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(str2);
        }
        sb2.append("@");
    }

    @NotNull
    public static final Url k(@NotNull Function1<? super k2, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int i10 = 5 & 0;
        k2 k2Var = new k2(null, null, 0, null, null, null, null, null, false, 511, null);
        block.invoke(k2Var);
        return k2Var.b();
    }

    @NotNull
    public static final String l(@NotNull Url url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        h(sb2, url.p(), url.r(), url.F());
        return sb2.toString();
    }

    @NotNull
    public static final String m(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return url.u() + AbstractJsonLexerKt.COLON + url.z();
    }

    @NotNull
    public static final String n(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        int iE = url.E();
        return (iE == 0 || iE == url.A().k()) ? url.u() : m(url);
    }

    public static final boolean o(@NotNull k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return Intrinsics.areEqual(CollectionsKt.firstOrNull((List) k2Var.m()), "");
    }

    public static final boolean p(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return Intrinsics.areEqual(CollectionsKt.firstOrNull((List) url.C()), "");
    }

    public static final boolean q(@NotNull k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return !o(k2Var);
    }

    public static final boolean r(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return !p(url);
    }

    @Nullable
    public static final Url s(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        try {
            k2 k2VarD = d(urlString);
            if (k2VarD.j().length() <= 0) {
                k2VarD = null;
            }
            if (k2VarD != null) {
                return k2VarD.b();
            }
        } catch (p2 unused) {
        }
        return null;
    }

    @NotNull
    public static final k2 t(@NotNull k2 k2Var, @NotNull k2 url) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        k2Var.D(url.p());
        k2Var.y(url.j());
        k2Var.B(url.n());
        k2Var.v(url.g());
        k2Var.w(url.h());
        k2Var.u(url.f());
        y1 y1VarB = b2.b(0, 1, null);
        io.ktor.util.w1.e(y1VarB, url.e());
        k2Var.t(y1VarB);
        k2Var.s(url.d());
        k2Var.E(url.q());
        return k2Var;
    }

    @NotNull
    public static final k2 u(@NotNull k2 k2Var, @NotNull Url url) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        k2Var.D(url.B());
        k2Var.y(url.u());
        k2Var.B(url.z());
        n2.y(k2Var, url.p());
        k2Var.w(url.s());
        k2Var.u(url.o());
        y1 y1VarB = b2.b(0, 1, null);
        y1VarB.j(d2.d(url.r(), 0, 0, false, 6, null));
        k2Var.t(y1VarB);
        k2Var.s(url.n());
        k2Var.E(url.F());
        return k2Var;
    }
}
