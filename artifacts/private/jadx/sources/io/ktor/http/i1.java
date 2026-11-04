package io.ktor.http;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpMessageProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpMessageProperties.kt\nio/ktor/http/HttpMessagePropertiesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1#2:194\n1374#3:195\n1460#3,2:196\n1563#3:198\n1634#3,3:199\n1462#3,3:202\n1374#3:205\n1460#3,2:206\n1563#3:208\n1634#3,3:209\n1462#3,3:212\n1374#3:215\n1460#3,5:216\n1563#3:221\n1634#3,3:222\n1563#3:225\n1634#3,3:226\n*S KotlinDebug\n*F\n+ 1 HttpMessageProperties.kt\nio/ktor/http/HttpMessagePropertiesKt\n*L\n67#1:195\n67#1:196,2\n68#1:198\n68#1:199,3\n67#1:202,3\n104#1:205\n104#1:206,2\n105#1:208\n105#1:209,3\n104#1:212,3\n121#1:215\n121#1:216,5\n122#1:221\n122#1:222,3\n131#1:225\n131#1:226,3\n*E\n"})
public final class i1 {
    @NotNull
    public static final List<r0> a(@NotNull f1 f1Var) {
        List<r0> listF;
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        String str = f1Var.O().get(d1.f295782a.u());
        return (str == null || (listF = c1.f(str)) == null) ? CollectionsKt.emptyList() : listF;
    }

    @Nullable
    public static final Charset b(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        m mVarF = f(f1Var);
        if (mVarF != null) {
            return o.a(mVarF);
        }
        return null;
    }

    @Nullable
    public static final Charset c(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        m mVarG = g(g1Var);
        if (mVarG != null) {
            return o.a(mVarG);
        }
        return null;
    }

    @Nullable
    public static final Long d(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        String str = f1Var.O().get(d1.f295782a.z());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    @Nullable
    public static final Long e(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        String str = g1Var.O().get(d1.f295782a.z());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    @Nullable
    public static final m f(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        String str = f1Var.O().get(d1.f295782a.C());
        if (str != null) {
            return m.f295981f.b(str);
        }
        return null;
    }

    @Nullable
    public static final m g(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        String str = g1Var.O().get(d1.f295782a.C());
        if (str != null) {
            return m.f295981f.b(str);
        }
        return null;
    }

    public static final void h(@NotNull g1 g1Var, @NotNull m type) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        g1Var.O().a(d1.f295782a.C(), type.toString());
    }

    @NotNull
    public static final List<Cookie> i(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        List<String> listB = g1Var.O().b(d1.f295782a.B0());
        if (listB == null) {
            return CollectionsKt.emptyList();
        }
        List<String> list = listB;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h0.p((String) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public static final String j(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        return f1Var.O().get(d1.f295782a.J());
    }

    @Nullable
    public static final String k(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        return g1Var.O().get(d1.f295782a.J());
    }

    public static final void l(@NotNull g1 g1Var, @NotNull String value) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        g1Var.O().a(d1.f295782a.T(), value);
    }

    public static final void m(@NotNull g1 g1Var, int i10) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        g1Var.O().l(d1.f295782a.u(), "max-age=" + i10);
    }

    @NotNull
    public static final List<Cookie> n(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        List<String> listB = f1Var.O().b(d1.f295782a.B0());
        if (listB == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, o((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(h0.p((String) it2.next()));
        }
        return arrayList2;
    }

    @NotNull
    public static final List<String> o(@NotNull String str) {
        String str2;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iQ3 = StringsKt.q3(str, AbstractJsonLexerKt.COMMA, 0, false, 6, null);
        if (iQ3 == -1) {
            return CollectionsKt.listOf(str);
        }
        ArrayList arrayList = new ArrayList();
        String str3 = str;
        int iQ4 = StringsKt.q3(str3, '=', iQ3, false, 4, null);
        int iQ5 = StringsKt.q3(str3, ';', iQ3, false, 4, null);
        int i12 = 0;
        int i13 = iQ3;
        int iQ6 = iQ5;
        while (i12 < str3.length() && i13 > 0) {
            if (iQ4 < i13) {
                String str4 = str3;
                int iQ7 = StringsKt.q3(str4, '=', i13, false, 4, null);
                str2 = str4;
                i10 = iQ7;
            } else {
                str2 = str3;
                i10 = iQ4;
            }
            String str5 = str2;
            int iQ8 = StringsKt.q3(str5, AbstractJsonLexerKt.COMMA, i13 + 1, false, 4, null);
            while (true) {
                i11 = i13;
                i13 = iQ8;
                if (i13 < 0 || i13 >= i10) {
                    break;
                }
                iQ8 = StringsKt.q3(str5, AbstractJsonLexerKt.COMMA, i13 + 1, false, 4, null);
            }
            if (iQ6 < i11) {
                iQ6 = StringsKt.q3(str5, ';', i11, false, 4, null);
            }
            if (i10 < 0) {
                String strSubstring = str5.substring(i12);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                return arrayList;
            }
            if (iQ6 == -1 || iQ6 > i10) {
                String strSubstring2 = str5.substring(i12, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                i12 = i11 + 1;
            }
            i13 = i13;
            str3 = str5;
            iQ4 = i10;
        }
        String str6 = str3;
        if (i12 < str6.length()) {
            String strSubstring3 = str6.substring(i12);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            arrayList.add(strSubstring3);
        }
        return arrayList;
    }

    public static final void p(@NotNull g1 g1Var, @NotNull String content) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        g1Var.O().a(d1.f295782a.L0(), content);
    }

    @Nullable
    public static final List<String> q(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        List<String> listB = f1Var.O().b(d1.f295782a.M0());
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt.split$default((String) it.next(), new String[]{","}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt.E5((String) it2.next()).toString());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    @Nullable
    public static final List<String> r(@NotNull g1 g1Var) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        List<String> listB = g1Var.O().b(d1.f295782a.M0());
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt.split$default((String) it.next(), new String[]{","}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt.E5((String) it2.next()).toString());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }
}
