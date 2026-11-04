package io.ktor.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nURLBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,372:1\n1374#2:373\n1460#2,5:374\n1563#2:379\n1634#2,3:380\n11228#3:383\n11563#3,3:384\n*S KotlinDebug\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilderKt\n*L\n244#1:373\n244#1:374,5\n245#1:379\n245#1:380,3\n273#1:383\n273#1:384,3\n*E\n"})
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f296065a = 0;

    private static final void c(Appendable appendable, String str) throws IOException {
        appendable.append(":");
        appendable.append(str);
    }

    @NotNull
    public static final k2 d(@NotNull k2 k2Var, @NotNull List<String> segments) {
        List<String> listPlus;
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(segments, "segments");
        boolean z10 = false;
        boolean z11 = k2Var.g().size() > 1 && ((CharSequence) CollectionsKt.last((List) k2Var.g())).length() == 0 && !segments.isEmpty();
        if (segments.size() > 1 && ((CharSequence) CollectionsKt.first((List) segments)).length() == 0 && !k2Var.g().isEmpty()) {
            z10 = true;
        }
        if (z11 && z10) {
            listPlus = CollectionsKt.plus((Collection) CollectionsKt.dropLast(k2Var.g(), 1), (Iterable) CollectionsKt.drop(segments, 1));
        } else if (z11) {
            listPlus = CollectionsKt.plus((Collection) CollectionsKt.dropLast(k2Var.g(), 1), (Iterable) segments);
        } else {
            listPlus = z10 ? CollectionsKt.plus((Collection) k2Var.g(), (Iterable) CollectionsKt.drop(segments, 1)) : CollectionsKt.plus((Collection) k2Var.g(), (Iterable) segments);
        }
        k2Var.v(listPlus);
        return k2Var;
    }

    @NotNull
    public static final k2 e(@NotNull k2 k2Var, @NotNull String... components) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return d(k2Var, ArraysKt.toList(components));
    }

    private static final void f(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!StringsKt.d5(str2, '/', false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void g(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    @NotNull
    public static final k2 h(@NotNull k2 k2Var, @NotNull List<String> segments, boolean z10) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(segments, "segments");
        if (!z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = segments.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, StringsKt.T4((String) it.next(), new char[]{'/'}, false, 0, 6, null));
            }
            segments = arrayList;
        }
        List<String> list = segments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(h.t((String) it2.next()));
        }
        d(k2Var, arrayList2);
        return k2Var;
    }

    @NotNull
    public static final k2 i(@NotNull k2 k2Var, @NotNull String[] components, boolean z10) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return h(k2Var, ArraysKt.toList(components), z10);
    }

    public static /* synthetic */ k2 j(k2 k2Var, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h(k2Var, list, z10);
    }

    public static /* synthetic */ k2 k(k2 k2Var, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(k2Var, strArr, z10);
    }

    private static final void l(Appendable appendable, String str) throws IOException {
        appendable.append(":");
        appendable.append(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <A extends Appendable> A m(k2 k2Var, A a10) throws IOException {
        a10.append(k2Var.o().getName());
        String name = k2Var.o().getName();
        switch (name.hashCode()) {
            case -1081572750:
                if (name.equals("mailto")) {
                    g(a10, q(k2Var), k2Var.j());
                    return a10;
                }
                break;
            case 114715:
                if (name.equals("tel")) {
                    l(a10, k2Var.j());
                    return a10;
                }
                break;
            case 3143036:
                if (name.equals(com.facebook.share.internal.k.f101891c)) {
                    f(a10, k2Var.j(), p(k2Var));
                    return a10;
                }
                break;
            case 92611469:
                if (name.equals("about")) {
                    c(a10, k2Var.j());
                    return a10;
                }
                break;
        }
        a10.append("://");
        a10.append(o(k2Var));
        w2.g(a10, p(k2Var), k2Var.e(), k2Var.q());
        if (k2Var.d().length() > 0) {
            a10.append('#');
            a10.append(k2Var.d());
        }
        return a10;
    }

    @NotNull
    public static final k2 n(@NotNull k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return w2.t(new k2(null, null, 0, null, null, null, null, null, false, 511, null), k2Var);
    }

    @NotNull
    public static final String o(@NotNull k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q(k2Var));
        sb2.append(k2Var.j());
        if (k2Var.n() != 0 && k2Var.n() != k2Var.o().k()) {
            sb2.append(":");
            sb2.append(String.valueOf(k2Var.n()));
        }
        return sb2.toString();
    }

    @NotNull
    public static final String p(@NotNull k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return r(k2Var.g());
    }

    @NotNull
    public static final String q(@NotNull k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        w2.j(sb2, k2Var.h(), k2Var.f());
        return sb2.toString();
    }

    private static final String r(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) CollectionsKt.first((List) list)).length() == 0 ? "/" : (String) CollectionsKt.first((List) list);
        }
        return CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void s(@NotNull k2 k2Var, @NotNull String... path) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        ArrayList arrayList = new ArrayList(path.length);
        int i10 = 4 & 0;
        for (String str : path) {
            arrayList.add(h.r(str, false, false, 3, null));
        }
        k2Var.v(arrayList);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Please use appendPathSegments method", replaceWith = @kotlin.b1(expression = "this.appendPathSegments(components", imports = {}))
    @NotNull
    public static final k2 t(@NotNull k2 k2Var, @NotNull List<String> components) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return j(k2Var, components, false, 2, null);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Please use appendPathSegments method", replaceWith = @kotlin.b1(expression = "this.appendPathSegments(components", imports = {}))
    @NotNull
    public static final k2 u(@NotNull k2 k2Var, @NotNull String... components) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return j(k2Var, ArraysKt.toList(components), false, 2, null);
    }

    public static final void v(@NotNull k2 k2Var, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super k2, Unit> block) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (str != null) {
            k2Var.C(s2.f296093c.a(str));
        }
        if (str2 != null) {
            k2Var.y(str2);
        }
        if (num != null) {
            k2Var.B(num.intValue());
        }
        if (str3 != null) {
            y(k2Var, str3);
        }
        block.invoke(k2Var);
    }

    public static /* synthetic */ void w(k2 k2Var, String str, String str2, Integer num, String str3, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.http.m2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return n2.x((k2) obj2);
                }
            };
        }
        v(k2Var, str, str2, num, str3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return Unit.f312394a;
    }

    public static final void y(@NotNull k2 k2Var, @NotNull String value) {
        List<String> mutableList;
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.w3(value)) {
            mutableList = CollectionsKt.emptyList();
        } else if (Intrinsics.areEqual(value, "/")) {
            mutableList = r2.e();
        } else {
            int i10 = 3 << 0;
            mutableList = CollectionsKt.toMutableList((Collection) StringsKt.T4(value, new char[]{'/'}, false, 0, 6, null));
        }
        k2Var.v(mutableList);
    }
}
