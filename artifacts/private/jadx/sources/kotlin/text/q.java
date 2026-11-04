package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:146\n126#1,2:159\n119#1,2:168\n121#1,4:183\n126#1,2:190\n1#2:130\n1#2:156\n1#2:187\n1#2:211\n1577#3,11:133\n1872#3,2:144\n1874#3:157\n1588#3:158\n774#3:161\n865#3,2:162\n1557#3:164\n1628#3,3:165\n1577#3,11:170\n1872#3,2:181\n1874#3:188\n1588#3:189\n1577#3,11:198\n1872#3,2:209\n1874#3:212\n1588#3:213\n158#4,6:150\n158#4,6:192\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:146,4\n42#1:159,2\n83#1:168,2\n83#1:183,4\n83#1:190,2\n42#1:156\n83#1:187\n120#1:211\n42#1:133,11\n42#1:144,2\n42#1:157\n42#1:158\n79#1:161\n79#1:162,2\n80#1:164\n80#1:165,3\n83#1:170,11\n83#1:181,2\n83#1:188\n83#1:189\n120#1:198,11\n120#1:209,2\n120#1:212\n120#1:213\n43#1:150,6\n107#1:192,6\n*E\n"})
public class q extends p {

    static final class a extends l0 implements Function1<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313378a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return line;
        }
    }

    static final class b extends l0 implements Function1<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f313379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f313379a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return this.f313379a + line;
        }
    }

    static final class c extends l0 implements Function1<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f313380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f313380a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsKt.w3(it)) {
                return it.length() < this.f313380a.length() ? this.f313380a : it;
            }
            return this.f313380a + it;
        }
    }

    private static final Function1<String, String> g(String str) {
        return str.length() == 0 ? a.f313378a : new b(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[RETURN] */
    private static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!CharsKt__CharJVMKt.q(str.charAt(i10))) {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
            i10++;
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    @NotNull
    public static final String i(@NotNull String str, @NotNull String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return kotlin.sequences.o.e1(kotlin.sequences.o.k1(StringsKt__StringsKt.L3(str), new c(indent)), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    private static final String k(List<String> list, int i10, Function1<? super String, String> function1, Function1<? super String, String> function2) {
        String strInvoke;
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if ((i11 == 0 || i11 == lastIndex) && StringsKt__StringsKt.w3(str)) {
                str = null;
            } else {
                String strInvoke2 = function2.invoke(str);
                if (strInvoke2 != null && (strInvoke = function1.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i11 = i12;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(i10), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String l(@NotNull String str, @NotNull String newIndent) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listM3 = StringsKt__StringsKt.M3(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3) {
            if (!StringsKt__StringsKt.w3((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM3.size());
        Function1<String, String> function1G = g(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listM3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj2;
            if ((i10 == 0 || i10 == lastIndex) && StringsKt__StringsKt.w3(str2)) {
                str2 = null;
            } else {
                String strA6 = y.A6(str2, iIntValue);
                if (strA6 != null && (strInvoke = function1G.invoke(strA6)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i11;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String m(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    @NotNull
    public static final String n(@NotNull String str, @NotNull String newIndent, @NotNull String marginPrefix) {
        String str2;
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.w3(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listM3 = StringsKt__StringsKt.M3(str);
        int length = str.length() + (newIndent.length() * listM3.size());
        Function1<String, String> function1G = g(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listM3);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == lastIndex) && StringsKt__StringsKt.w3(str3)) {
                str2 = marginPrefix;
                str3 = null;
            } else {
                int length2 = str3.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.q(str3.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (w.t2(str3, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        Intrinsics.checkNotNull(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = function1G.invoke(strSubstring)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        if ((i10 & 2) != 0) {
            str3 = "|";
        }
        return n(str, str2, str3);
    }

    @kotlin.internal.g
    @NotNull
    public static String p(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, "");
    }

    @kotlin.internal.g
    @NotNull
    public static final String q(@NotNull String str, @NotNull String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return n(str, "", marginPrefix);
    }

    public static /* synthetic */ String r(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return q(str, str2);
    }
}
