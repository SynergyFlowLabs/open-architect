package kotlin.text;

import com.facebook.internal.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1499:1\n80#1,22:1500\n114#1,5:1522\n131#1,5:1527\n80#1,22:1532\n108#1:1554\n80#1,22:1555\n114#1,5:1577\n125#1:1582\n114#1,5:1583\n131#1,5:1588\n142#1:1593\n131#1,5:1594\n80#1,22:1599\n114#1,5:1621\n131#1,5:1626\n1069#2,2:1631\n12654#3,2:1633\n12654#3,2:1635\n295#4,2:1637\n295#4,2:1639\n1557#4:1642\n1628#4,3:1643\n1557#4:1646\n1628#4,3:1647\n1#5:1641\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n108#1:1500,22\n125#1:1522,5\n142#1:1527,5\n147#1:1532,22\n152#1:1554\n152#1:1555,22\n157#1:1577,5\n162#1:1582\n162#1:1583,5\n167#1:1588,5\n172#1:1593\n172#1:1594,5\n177#1:1599,22\n188#1:1621,5\n199#1:1626,5\n312#1:1631,2\n952#1:1633,2\n976#1:1635,2\n1015#1:1637,2\n1021#1:1639,2\n1321#1:1642\n1321#1:1643,3\n1346#1:1646\n1346#1:1647,3\n*E\n"})
public class StringsKt__StringsKt extends w {

    public static final class a extends CharIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f313215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f313216b;

        a(CharSequence charSequence) {
            this.f313216b = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313215a < this.f313216b.length();
        }

        @Override // kotlin.collections.CharIterator
        public char nextChar() {
            CharSequence charSequence = this.f313216b;
            int i10 = this.f313215a;
            this.f313215a = i10 + 1;
            return charSequence.charAt(i10);
        }
    }

    @SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1499:1\n1#2:1500\n*E\n"})
    static final class b extends l0 implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ char[] f313217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f313218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(char[] cArr, boolean z10) {
            super(2);
            this.f313217a = cArr;
            this.f313218b = z10;
        }

        public final Pair<Integer, Integer> c(CharSequence $receiver, int i10) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            int iT3 = StringsKt__StringsKt.t3($receiver, this.f313217a, i10, this.f313218b);
            if (iT3 < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(iT3), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return c(charSequence, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1499:1\n1#2:1500\n*E\n"})
    static final class c extends l0 implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<String> f313219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f313220b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, boolean z10) {
            super(2);
            this.f313219a = list;
            this.f313220b = z10;
        }

        public final Pair<Integer, Integer> c(CharSequence $receiver, int i10) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Pair pairD3 = StringsKt__StringsKt.d3($receiver, this.f313219a, i10, this.f313220b, false);
            if (pairD3 != null) {
                return TuplesKt.to(pairD3.getFirst(), Integer.valueOf(((String) pairD3.getSecond()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return c(charSequence, num.intValue());
        }
    }

    static final class d extends l0 implements Function1<IntRange, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f313221a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.f313221a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(IntRange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt__StringsKt.j5(this.f313221a, it);
        }
    }

    static final class e extends l0 implements Function1<IntRange, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f313222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence) {
            super(1);
            this.f313222a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(IntRange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt__StringsKt.j5(this.f313222a, it);
        }
    }

    @kotlin.internal.f
    private static final boolean A3(CharSequence charSequence) {
        return charSequence == null || w3(charSequence);
    }

    public static /* synthetic */ String A4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return y4(str, c10, str2, str3);
    }

    public static /* synthetic */ String A5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return y5(str, c10, str2);
    }

    @kotlin.internal.f
    private static final boolean B3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String B4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return z4(str, str2, str3, str4);
    }

    public static /* synthetic */ String B5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return z5(str, str2, str3);
    }

    @NotNull
    public static final CharIterator C3(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    @NotNull
    public static final String C4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        return iF3 == -1 ? missingDelimiterValue : J4(str, 0, iF3, replacement).toString();
    }

    @e1(version = "1.5")
    public static final boolean C5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, z0.P)) {
            return true;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int D3(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? I3(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    @NotNull
    public static final String D4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        int i10 = 4 & (-1);
        return iG3 == -1 ? missingDelimiterValue : J4(str, 0, iG3, replacement).toString();
    }

    @e1(version = "1.5")
    @Nullable
    public static Boolean D5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, z0.P)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int E3(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? o3(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ String E4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return C4(str, c10, str2, str3);
    }

    @NotNull
    public static CharSequence E5(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zQ = CharsKt__CharJVMKt.q(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zQ) {
                    break;
                }
                length--;
            } else if (zQ) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int F3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = i3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return D3(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String F4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return D4(str, str2, str3, str4);
    }

    @NotNull
    public static final CharSequence F5(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(charSequence.charAt(!z10 ? i10 : length))).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int G3(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = i3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return E3(charSequence, str, i10, z10);
    }

    @kotlin.internal.f
    private static final String G4(CharSequence charSequence, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.n(charSequence, replacement);
    }

    @NotNull
    public static final CharSequence G5(@NotNull CharSequence charSequence, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zContains = ArraysKt.contains(chars, charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int H3(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> pairD3 = d3(charSequence, strings, i10, z10, true);
        if (pairD3 != null) {
            return pairD3.getFirst().intValue();
        }
        return -1;
    }

    @u0
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    @oj.i(name = "replaceFirstCharWithChar")
    private static final String H4(String str, Function1<? super Character, Character> transform) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        char cCharValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return cCharValue + strSubstring;
    }

    @kotlin.internal.f
    private static final String H5(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return E5(str).toString();
    }

    public static final int I3(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.single(chars), i10);
        }
        for (int iB = kotlin.ranges.r.B(i10, i3(charSequence)); -1 < iB; iB--) {
            char cCharAt = charSequence.charAt(iB);
            for (char c10 : chars) {
                if (kotlin.text.c.I(c10, cCharAt, z10)) {
                    return iB;
                }
            }
        }
        return -1;
    }

    @u0
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    @oj.i(name = "replaceFirstCharWithCharSequence")
    private static final String I4(String str, Function1<? super Character, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @NotNull
    public static final String I5(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(str.charAt(!z10 ? i10 : length))).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = i3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return H3(charSequence, collection, i10, z10);
    }

    @NotNull
    public static CharSequence J4(@NotNull CharSequence charSequence, int i10, int i11, @NotNull CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    @NotNull
    public static final String J5(@NotNull String str, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        int i11 = 2 ^ 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zContains = ArraysKt.contains(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ int K3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = i3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return I3(charSequence, cArr, i10, z10);
    }

    @NotNull
    public static final CharSequence K4(@NotNull CharSequence charSequence, @NotNull IntRange range, @NotNull CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return J4(charSequence, range.u().intValue(), range.i().intValue() + 1, replacement);
    }

    @NotNull
    public static CharSequence K5(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!CharsKt__CharJVMKt.q(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    @NotNull
    public static Sequence<String> L3(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return Z4(charSequence, new String[]{"\r\n", "\n", org.apache.commons.lang3.z.f337565d}, false, 0, 6, null);
    }

    @kotlin.internal.f
    private static final String L4(String str, int i10, int i11, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return J4(str, i10, i11, replacement).toString();
    }

    @NotNull
    public static final CharSequence L5(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    @NotNull
    public static List<String> M3(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.sequences.o.c3(L3(charSequence));
    }

    @kotlin.internal.f
    private static final String M4(String str, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return K4(str, range, replacement).toString();
    }

    @NotNull
    public static final CharSequence M5(@NotNull CharSequence charSequence, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!ArraysKt.contains(chars, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return "";
    }

    @NotNull
    public static final String N2(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        int i10 = 0;
        while (i10 < iMin && kotlin.text.c.I(charSequence.charAt(i10), other.charAt(i10), z10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (j3(charSequence, i11) || j3(other, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    @kotlin.internal.f
    private static final boolean N3(CharSequence charSequence, Regex regex) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.k(charSequence);
    }

    public static final void N4(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    @kotlin.internal.f
    private static final String N5(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return K5(str).toString();
    }

    public static /* synthetic */ String O2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N2(charSequence, charSequence2, z10);
    }

    @kotlin.internal.f
    private static final String O3(String str) {
        if (str == null) {
            str = "";
        }
        return str;
    }

    @kotlin.internal.f
    private static final List<String> O4(CharSequence charSequence, Regex regex, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.o(charSequence, i10);
    }

    @NotNull
    public static final String O5(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!predicate.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    @NotNull
    public static final String P2(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = charSequence.length();
        int length2 = other.length();
        int iMin = Math.min(length, length2);
        int i10 = 0;
        while (i10 < iMin && kotlin.text.c.I(charSequence.charAt((length - i10) - 1), other.charAt((length2 - i10) - 1), z10)) {
            i10++;
        }
        if (j3(charSequence, (length - i10) - 1) || j3(other, (length2 - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(length - i10, length).toString();
    }

    @NotNull
    public static final CharSequence P3(@NotNull CharSequence charSequence, int i10, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return sb2;
    }

    @NotNull
    public static final List<String> P4(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return R4(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableN = kotlin.sequences.o.N(Z3(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableN, 10));
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            arrayList.add(j5(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final String P5(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!ArraysKt.contains(chars, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ String Q2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return P2(charSequence, charSequence2, z10);
    }

    @NotNull
    public static final String Q3(@NotNull String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return P3(str, i10, c10).toString();
    }

    @NotNull
    public static final List<String> Q4(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return R4(charSequence, str, z10, i10);
            }
        }
        Iterable iterableN = kotlin.sequences.o.N(a4(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableN, 10));
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            arrayList.add(j5(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static CharSequence Q5(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt__CharJVMKt.q(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static boolean R2(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return q3(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ CharSequence R3(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return P3(charSequence, i10, c10);
    }

    private static final List<String> R4(CharSequence charSequence, String str, boolean z10, int i10) {
        N4(i10);
        int length = 0;
        int iN3 = n3(charSequence, str, 0, z10);
        if (iN3 != -1 && i10 != 1) {
            boolean z11 = i10 > 0;
            ArrayList arrayList = new ArrayList(z11 ? kotlin.ranges.r.B(i10, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(length, iN3).toString());
                length = str.length() + iN3;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                iN3 = n3(charSequence, str, length, z10);
            } while (iN3 != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        return CollectionsKt.listOf(charSequence.toString());
    }

    @NotNull
    public static final CharSequence R5(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static boolean S2(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            return r3(charSequence, (String) other, 0, z10, 2, null) >= 0;
        }
        return p3(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static /* synthetic */ String S3(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return Q3(str, i10, c10);
    }

    static /* synthetic */ List S4(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.o(charSequence, i10);
    }

    @NotNull
    public static final CharSequence S5(@NotNull CharSequence charSequence, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!ArraysKt.contains(chars, charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    @kotlin.internal.f
    private static final boolean T2(CharSequence charSequence, Regex regex) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.b(charSequence);
    }

    @NotNull
    public static final CharSequence T3(@NotNull CharSequence charSequence, int i10, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static /* synthetic */ List T4(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return P4(charSequence, cArr, z10, i10);
    }

    @kotlin.internal.f
    private static final String T5(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Q5(str).toString();
    }

    public static /* synthetic */ boolean U2(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return R2(charSequence, c10, z10);
    }

    @NotNull
    public static String U3(@NotNull String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return T3(str, i10, c10).toString();
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final Sequence<String> U4(CharSequence charSequence, Regex regex, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.q(charSequence, i10);
    }

    @NotNull
    public static final String U5(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ boolean V2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S2(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ CharSequence V3(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return T3(charSequence, i10, c10);
    }

    @NotNull
    public static final Sequence<String> V4(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return kotlin.sequences.o.k1(Z3(charSequence, delimiters, 0, z10, i10, 2, null), new e(charSequence));
    }

    @NotNull
    public static String V5(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!ArraysKt.contains(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static final boolean W2(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return w.N1((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!kotlin.text.c.I(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String W3(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return U3(str, i10, c10);
    }

    @NotNull
    public static final Sequence<String> W4(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return kotlin.sequences.o.k1(a4(charSequence, delimiters, 0, z10, i10, 2, null), new d(charSequence));
    }

    public static final boolean X2(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    private static final Sequence<IntRange> X3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        N4(i11);
        return new kotlin.text.e(charSequence, i10, i11, new b(cArr, z10));
    }

    static /* synthetic */ Sequence X4(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.q(charSequence, i10);
    }

    public static final boolean Y2(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.c.I(charSequence.charAt(i3(charSequence)), c10, z10);
    }

    private static final Sequence<IntRange> Y3(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        N4(i11);
        return new kotlin.text.e(charSequence, i10, i11, new c(ArraysKt.asList(strArr), z10));
    }

    public static /* synthetic */ Sequence Y4(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return V4(charSequence, cArr, z10, i10);
    }

    public static final boolean Z2(@NotNull CharSequence charSequence, @NotNull CharSequence suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? w.M1((String) charSequence, (String) suffix, false, 2, null) : b4(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    static /* synthetic */ Sequence Z3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return X3(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ Sequence Z4(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return W4(charSequence, strArr, z10, i10);
    }

    public static /* synthetic */ boolean a3(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Y2(charSequence, c10, z10);
    }

    static /* synthetic */ Sequence a4(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return Y3(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean a5(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.c.I(charSequence.charAt(0), c10, z10);
    }

    public static /* synthetic */ boolean b3(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Z2(charSequence, charSequence2, z10);
    }

    public static final boolean b4(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 >= 0 && i10 >= 0 && i10 <= charSequence.length() - i12 && i11 <= other.length() - i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (!kotlin.text.c.I(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b5(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? w.t2((String) charSequence, (String) prefix, i10, false, 4, null) : b4(charSequence, i10, prefix, 0, prefix.length(), z10);
    }

    @Nullable
    public static final Pair<Integer, String> c3(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return d3(charSequence, strings, i10, z10, false);
    }

    @NotNull
    public static final CharSequence c4(@NotNull CharSequence charSequence, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return f5(charSequence, prefix, false, 2, null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static boolean c5(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? w.u2((String) charSequence, (String) prefix, false, 2, null) : b4(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, String> d3(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) CollectionsKt.single(collection);
            int iR3 = !z11 ? r3(charSequence, str, i10, false, 4, null) : G3(charSequence, str, i10, false, 4, null);
            if (iR3 < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(iR3), str);
        }
        CharSequence charSequence3 = charSequence;
        kotlin.ranges.j intRange = !z11 ? new IntRange(kotlin.ranges.r.u(i10, 0), charSequence3.length()) : kotlin.ranges.r.k0(kotlin.ranges.r.B(i10, i3(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iL = intRange.l();
            int iM = intRange.m();
            int iN = intRange.n();
            if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
                int i11 = iL;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (w.d2(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return TuplesKt.to(Integer.valueOf(i11), str3);
                    }
                    if (i11 != iM) {
                        i11 += iN;
                        z10 = z12;
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iL2 = intRange.l();
            int iM2 = intRange.m();
            int iN2 = intRange.n();
            if ((iN2 > 0 && iL2 <= iM2) || (iN2 < 0 && iM2 <= iL2)) {
                int i12 = iL2;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (b4(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return TuplesKt.to(Integer.valueOf(i12), str5);
                    }
                    if (i12 != iM2) {
                        i12 += iN2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    public static String d4(@NotNull String str, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (f5(str, prefix, false, 2, null)) {
            str = str.substring(prefix.length());
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        return str;
    }

    public static /* synthetic */ boolean d5(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a5(charSequence, c10, z10);
    }

    public static /* synthetic */ Pair e3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return c3(charSequence, collection, i10, z10);
    }

    @NotNull
    public static final CharSequence e4(@NotNull CharSequence charSequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
        }
        if (i11 == i10) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i11 - i10));
        sb2.append(charSequence, 0, i10);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(charSequence, i11, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    public static /* synthetic */ boolean e5(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b5(charSequence, charSequence2, i10, z10);
    }

    @Nullable
    public static final Pair<Integer, String> f3(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return d3(charSequence, strings, i10, z10, true);
    }

    @NotNull
    public static final CharSequence f4(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return e4(charSequence, range.u().intValue(), range.i().intValue() + 1);
    }

    public static /* synthetic */ boolean f5(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c5(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ Pair g3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = i3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return f3(charSequence, collection, i10, z10);
    }

    @kotlin.internal.f
    private static final String g4(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return e4(str, i10, i11).toString();
    }

    @NotNull
    public static final CharSequence g5(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.u().intValue(), range.i().intValue() + 1);
    }

    @NotNull
    public static final IntRange h3(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    @kotlin.internal.f
    private static final String h4(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return f4(str, range).toString();
    }

    @kotlin.l(message = "Use parameters named startIndex and endIndex.", replaceWith = @b1(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @kotlin.internal.f
    private static final CharSequence h5(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.subSequence(i10, i11);
    }

    public static int i3(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @NotNull
    public static final CharSequence i4(@NotNull CharSequence charSequence, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return b3(charSequence, suffix, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @kotlin.internal.f
    private static final String i5(CharSequence charSequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final boolean j3(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return i10 >= 0 && i10 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }

    @NotNull
    public static String j4(@NotNull String str, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!b3(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final String j5(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.u().intValue(), range.i().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R k3(C c10, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return w3(c10) ? defaultValue.invoke() : c10;
    }

    @NotNull
    public static final CharSequence k4(@NotNull CharSequence charSequence, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return l4(charSequence, delimiter, delimiter);
    }

    @NotNull
    public static String k5(@NotNull String str, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String strSubstring = str.substring(range.u().intValue(), range.i().intValue() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R l3(C c10, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return c10.length() == 0 ? defaultValue.invoke() : c10;
    }

    @NotNull
    public static final CharSequence l4(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (charSequence.length() >= prefix.length() + suffix.length() && f5(charSequence, prefix, false, 2, null) && b3(charSequence, suffix, false, 2, null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    static /* synthetic */ String l5(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final int m3(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? t3(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    @NotNull
    public static String m4(@NotNull String str, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return n4(str, delimiter, delimiter);
    }

    @NotNull
    public static String m5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iQ3 = q3(str, c10, 0, false, 6, null);
        if (iQ3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iQ3 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int n3(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? p3(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    @NotNull
    public static final String n4(@NotNull String str, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() >= prefix.length() + suffix.length() && f5(str, prefix, false, 2, null) && b3(str, suffix, false, 2, null)) {
            str = str.substring(prefix.length(), str.length() - suffix.length());
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        return str;
    }

    @NotNull
    public static String n5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, delimiter, 0, false, 6, null);
        if (iR3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iR3 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final int o3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        kotlin.ranges.j intRange = !z11 ? new IntRange(kotlin.ranges.r.u(i10, 0), kotlin.ranges.r.B(i11, charSequence.length())) : kotlin.ranges.r.k0(kotlin.ranges.r.B(i10, i3(charSequence)), kotlin.ranges.r.u(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iL = intRange.l();
            int iM = intRange.m();
            int iN = intRange.n();
            if ((iN <= 0 || iL > iM) && (iN >= 0 || iM > iL)) {
                return -1;
            }
            int i12 = iL;
            while (true) {
                boolean z12 = z10;
                if (w.d2((String) charSequence2, 0, (String) charSequence, i12, charSequence2.length(), z12)) {
                    return i12;
                }
                if (i12 == iM) {
                    return -1;
                }
                i12 += iN;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iL2 = intRange.l();
            int iM2 = intRange.m();
            int iN2 = intRange.n();
            if ((iN2 <= 0 || iL2 > iM2) && (iN2 >= 0 || iM2 > iL2)) {
                return -1;
            }
            int i13 = iL2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (b4(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iM2) {
                    return -1;
                }
                i13 += iN2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    @kotlin.internal.f
    private static final String o4(CharSequence charSequence, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    public static /* synthetic */ String o5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m5(str, c10, str2);
    }

    static /* synthetic */ int p3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
            boolean z12 = true | false;
        }
        return o3(charSequence, charSequence2, i10, i11, z10, z11);
    }

    @kotlin.internal.f
    private static final String p4(CharSequence charSequence, Regex regex, Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return regex.m(charSequence, transform);
    }

    public static /* synthetic */ String p5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return n5(str, str2, str3);
    }

    public static /* synthetic */ int q3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m3(charSequence, c10, i10, z10);
    }

    @NotNull
    public static final String q4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iQ3 = q3(str, c10, 0, false, 6, null);
        return iQ3 == -1 ? missingDelimiterValue : J4(str, iQ3 + 1, str.length(), replacement).toString();
    }

    @NotNull
    public static String q5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        if (iF3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iF3 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int r3(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n3(charSequence, str, i10, z10);
    }

    @NotNull
    public static final String r4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, delimiter, 0, false, 6, null);
        return iR3 == -1 ? missingDelimiterValue : J4(str, iR3 + delimiter.length(), str.length(), replacement).toString();
    }

    @NotNull
    public static final String r5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        if (iG3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iG3 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int s3(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> pairD3 = d3(charSequence, strings, i10, z10, false);
        if (pairD3 != null) {
            return pairD3.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String s4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return q4(str, c10, str2, str3);
    }

    public static /* synthetic */ String s5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return q5(str, c10, str2);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Q4(charSequence, strArr, z10, i10);
    }

    public static final int t3(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.single(chars), i10);
        }
        int iU = kotlin.ranges.r.u(i10, 0);
        int iI3 = i3(charSequence);
        if (iU <= iI3) {
            while (true) {
                char cCharAt = charSequence.charAt(iU);
                for (char c10 : chars) {
                    if (kotlin.text.c.I(c10, cCharAt, z10)) {
                        return iU;
                    }
                }
                if (iU != iI3) {
                    iU++;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ String t4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return r4(str, str2, str3, str4);
    }

    public static /* synthetic */ String t5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return r5(str, str2, str3);
    }

    public static /* synthetic */ int u3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return s3(charSequence, collection, i10, z10);
    }

    @NotNull
    public static final String u4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        return iF3 == -1 ? missingDelimiterValue : J4(str, iF3 + 1, str.length(), replacement).toString();
    }

    @NotNull
    public static final String u5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iQ3 = q3(str, c10, 0, false, 6, null);
        if (iQ3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iQ3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int v3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return t3(charSequence, cArr, i10, z10);
    }

    @NotNull
    public static final String v4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        int i10 = 3 & 0 & (-1);
        return iG3 == -1 ? missingDelimiterValue : J4(str, iG3 + delimiter.length(), str.length(), replacement).toString();
    }

    @NotNull
    public static final String v5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, delimiter, 0, false, 6, null);
        if (iR3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iR3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean w3(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt__CharJVMKt.q(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String w4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return u4(str, c10, str2, str3);
    }

    public static /* synthetic */ String w5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return u5(str, c10, str2);
    }

    @kotlin.internal.f
    private static final boolean x3(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static /* synthetic */ String x4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return v4(str, str2, str3, str4);
    }

    public static /* synthetic */ String x5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return v5(str, str2, str3);
    }

    @kotlin.internal.f
    private static final boolean y3(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !w3(charSequence);
    }

    @NotNull
    public static final String y4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iQ3 = q3(str, c10, 0, false, 6, null);
        return iQ3 == -1 ? missingDelimiterValue : J4(str, 0, iQ3, replacement).toString();
    }

    @NotNull
    public static final String y5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iF3 = F3(str, c10, 0, false, 6, null);
        if (iF3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iF3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @kotlin.internal.f
    private static final boolean z3(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @NotNull
    public static final String z4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iR3 = r3(str, delimiter, 0, false, 6, null);
        return iR3 == -1 ? missingDelimiterValue : J4(str, 0, iR3, replacement).toString();
    }

    @NotNull
    public static final String z5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG3 = G3(str, delimiter, 0, false, 6, null);
        if (iG3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iG3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
