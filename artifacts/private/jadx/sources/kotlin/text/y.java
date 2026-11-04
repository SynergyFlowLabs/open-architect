package kotlin.text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
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
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2487:1\n130#1,2:2488\n221#1,5:2490\n507#1,5:2496\n507#1,5:2501\n467#1:2506\n1188#1,2:2507\n468#1,2:2509\n1190#1:2511\n470#1:2512\n467#1:2513\n1188#1,2:2514\n468#1,2:2516\n1190#1:2518\n470#1:2519\n1188#1,3:2520\n497#1,2:2523\n497#1,2:2525\n755#1,4:2527\n724#1,4:2531\n740#1,4:2535\n787#1,4:2539\n887#1,5:2543\n928#1,3:2548\n931#1,3:2558\n946#1,3:2561\n949#1,3:2571\n1046#1,3:2588\n1016#1,4:2591\n1005#1:2595\n1188#1,2:2596\n1190#1:2599\n1006#1:2600\n1188#1,3:2601\n1037#1:2604\n1179#1:2605\n1180#1:2607\n1038#1:2608\n1179#1,2:2609\n1188#1,3:2611\n1985#1,2:2614\n1987#1,6:2617\n2009#1,2:2623\n2011#1,6:2626\n2432#1,6:2632\n2462#1,7:2638\n1#2:2495\n1#2:2598\n1#2:2606\n1#2:2616\n1#2:2625\n381#3,7:2551\n381#3,7:2564\n381#3,7:2574\n381#3,7:2581\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n56#1:2488,2\n66#1:2490,5\n425#1:2496,5\n434#1:2501,5\n445#1:2506\n445#1:2507,2\n445#1:2509,2\n445#1:2511\n445#1:2512\n456#1:2513\n456#1:2514,2\n456#1:2516,2\n456#1:2518\n456#1:2519\n467#1:2520,3\n479#1:2523,2\n488#1:2525,2\n682#1:2527,4\n697#1:2531,4\n711#1:2535,4\n774#1:2539,4\n847#1:2543,5\n903#1:2548,3\n903#1:2558,3\n916#1:2561,3\n916#1:2571,3\n975#1:2588,3\n985#1:2591,4\n995#1:2595\n995#1:2596,2\n995#1:2599\n995#1:2600\n1005#1:2601,3\n1029#1:2604\n1029#1:2605\n1029#1:2607\n1029#1:2608\n1037#1:2609,2\n1791#1:2611,3\n2079#1:2614,2\n2079#1:2617,6\n2096#1:2623,2\n2096#1:2626,6\n2421#1:2632,6\n2449#1:2638,7\n995#1:2598\n1029#1:2606\n2079#1:2616\n2096#1:2625\n903#1:2551,7\n916#1:2564,7\n930#1:2574,7\n948#1:2581,7\n*E\n"})
public class y extends x {

    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,17:1\n2476#2:18\n*E\n"})
    public static final class a implements Iterable<Character>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f313381a;

        public a(CharSequence charSequence) {
            this.f313381a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.C3(this.f313381a);
        }
    }

    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,22:1\n2484#2:23\n*E\n"})
    public static final class b implements Sequence<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f313382a;

        public b(CharSequence charSequence) {
            this.f313382a = charSequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.C3(this.f313382a);
        }
    }

    static final class c extends l0 implements Function1<CharSequence, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f313383a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    public static final class d<K> implements Grouping<Character, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f313384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Character, K> f313385b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(CharSequence charSequence, Function1<? super Character, ? extends K> function1) {
            this.f313384a = charSequence;
            this.f313385b = function1;
        }

        public K a(char c10) {
            return this.f313385b.invoke(Character.valueOf(c10));
        }

        @Override // kotlin.collections.Grouping
        public /* bridge */ /* synthetic */ Object keyOf(Character ch2) {
            return a(ch2.charValue());
        }

        @Override // kotlin.collections.Grouping
        public Iterator<Character> sourceIterator() {
            return StringsKt__StringsKt.C3(this.f313384a);
        }
    }

    static final class e extends l0 implements Function1<CharSequence, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f313386a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    static final class f extends l0 implements Function1<CharSequence, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f313387a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class g<R> extends l0 implements Function1<Integer, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f313388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f313389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<CharSequence, R> f313390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(int i10, CharSequence charSequence, Function1<? super CharSequence, ? extends R> function1) {
            super(1);
            this.f313388a = i10;
            this.f313389b = charSequence;
            this.f313390c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final R invoke(int i10) {
            int length = this.f313388a + i10;
            if (length < 0 || length > this.f313389b.length()) {
                length = this.f313389b.length();
            }
            return this.f313390c.invoke(this.f313389b.subSequence(i10, length));
        }
    }

    static final class h extends l0 implements Function0<Iterator<? extends Character>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f313391a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CharSequence charSequence) {
            super(0);
            this.f313391a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Character> invoke() {
            return StringsKt__StringsKt.C3(this.f313391a);
        }
    }

    @NotNull
    public static String A6(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(kotlin.ranges.r.B(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C A7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final String A8(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return z8(str).toString();
    }

    @NotNull
    public static final CharSequence B6(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return W8(charSequence, kotlin.ranges.r.u(charSequence.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C B7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <R> List<R> B8(@NotNull CharSequence charSequence, R r10, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static String C6(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            return X8(str, kotlin.ranges.r.u(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<R> C7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <R> List<R> C8(@NotNull CharSequence charSequence, R r10, @NotNull pj.n<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence D6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int iI3 = StringsKt__StringsKt.i3(charSequence); -1 < iI3; iI3--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(iI3))).booleanValue()) {
                return charSequence.subSequence(0, iI3 + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C D7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @e1(version = "1.4")
    @NotNull
    public static final List<Character> D8(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @NotNull
    public static final String E6(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int iI3 = StringsKt__StringsKt.i3(str); -1 < iI3; iI3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iI3))).booleanValue()) {
                String strSubstring = str.substring(0, iI3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C E7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return destination;
    }

    @e1(version = "1.4")
    @NotNull
    public static final List<Character> E8(@NotNull CharSequence charSequence, @NotNull pj.n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence F6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
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

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character F7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <R> List<R> F8(@NotNull CharSequence charSequence, R r10, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final String G6(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char G7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 != 0) {
            R rInvoke = selector.invoke(Character.valueOf(cCharAt));
            int i10 = 1;
            if (1 <= iI3) {
                while (true) {
                    char cCharAt2 = charSequence.charAt(i10);
                    R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        cCharAt = cCharAt2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == iI3) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return cCharAt;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <R> List<R> G8(@NotNull CharSequence charSequence, R r10, @NotNull pj.n<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final char H6(CharSequence charSequence, int i10, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= charSequence.length()) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final double H7(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    public static char H8(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length != 1) {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        int i10 = 7 >> 0;
        return charSequence.charAt(0);
    }

    @kotlin.internal.f
    private static final Character I6(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return l7(charSequence, i10);
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final float I7(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).floatValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    public static final char I8(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    @NotNull
    public static final CharSequence J6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R J7(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        int i11 = 2 << 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @Nullable
    public static final Character J8(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @NotNull
    public static final String K6(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R K7(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @Nullable
    public static final Character K8(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @NotNull
    public static final CharSequence L6(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Double L7(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @NotNull
    public static final CharSequence L8(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb2.append(charSequence.charAt(it.next().intValue()));
        }
        return sb2;
    }

    @NotNull
    public static final String M6(@NotNull String str, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Float M7(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).floatValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final CharSequence M8(@NotNull CharSequence charSequence, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.g5(charSequence, indices);
    }

    @NotNull
    public static final <C extends Appendable> C N6(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R> R N7(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @kotlin.internal.f
    private static final String N8(String str, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return L8(str, indices).toString();
    }

    @NotNull
    public static final CharSequence O6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R> R O7(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final String O8(@NotNull String str, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.k5(str, indices);
    }

    @NotNull
    public static final String P6(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character P7(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @kotlin.l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.m(warningSince = "1.5")
    public static final int P8(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final <C extends Appendable> C Q6(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final char Q7(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @kotlin.l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.m(warningSince = "1.5")
    public static final double Q8(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <C extends Appendable> C R6(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character R7(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfDouble")
    private static final double R8(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.internal.f
    private static final Character S6(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final char S7(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfInt")
    private static final int S8(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).intValue();
        }
        return iIntValue;
    }

    @kotlin.internal.f
    private static final Character T6(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character T7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfLong")
    private static final long T8(CharSequence charSequence, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            jLongValue += selector.invoke(Character.valueOf(charSequence.charAt(i10))).longValue();
        }
        return jLongValue;
    }

    public static char U6(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char U7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 != 0) {
            R rInvoke = selector.invoke(Character.valueOf(cCharAt));
            int i10 = 1;
            if (1 <= iI3) {
                while (true) {
                    char cCharAt2 = charSequence.charAt(i10);
                    R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        cCharAt = cCharAt2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == iI3) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return cCharAt;
    }

    @u0
    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    @oj.i(name = "sumOfUInt")
    private static final int U8(CharSequence charSequence, Function1<? super Character, u1> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iN = u1.n(iN + selector.invoke(Character.valueOf(charSequence.charAt(i10))).z0());
        }
        return iN;
    }

    public static final char V6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final double V7(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    @oj.i(name = "sumOfULong")
    private static final long V8(CharSequence charSequence, Function1<? super Character, y1> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            jN = y1.n(jN + selector.invoke(Character.valueOf(charSequence.charAt(i10))).z0());
        }
        return jN;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final <R> R W6(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final float W7(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).floatValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @NotNull
    public static final CharSequence W8(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(0, kotlin.ranges.r.B(i10, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @e1(version = "1.5")
    @kotlin.internal.f
    private static final <R> R X6(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R rInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R X7(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static String X8(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, kotlin.ranges.r.B(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @Nullable
    public static final Character Y6(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R Y7(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final CharSequence Y8(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - kotlin.ranges.r.B(i10, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @Nullable
    public static final Character Z6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Double Z7(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).doubleValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @NotNull
    public static String Z8(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - kotlin.ranges.r.B(i10, length));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<R> a7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            CollectionsKt.addAll(arrayList, transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Float a8(CharSequence charSequence, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(charSequence.charAt(i10))).floatValue());
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final CharSequence a9(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int iI3 = StringsKt__StringsKt.i3(charSequence); -1 < iI3; iI3--) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(iI3))).booleanValue()) {
                return charSequence.subSequence(iI3 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> b7(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R> R b8(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final String b9(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int iI3 = StringsKt__StringsKt.i3(str); -1 < iI3; iI3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iI3))).booleanValue()) {
                String strSubstring = str.substring(iI3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C c7(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <R> R c8(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i10)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final CharSequence c9(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return charSequence.subSequence(0, i10);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C d7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            CollectionsKt.addAll(destination, transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character d8(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final String d9(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(0, i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final <R> R e7(@NotNull CharSequence charSequence, R r10, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
        }
        return r10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final char e8(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (Intrinsics.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @NotNull
    public static <C extends Collection<? super Character>> C e9(@NotNull CharSequence charSequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }

    public static final <R> R f7(@NotNull CharSequence charSequence, R r10, @NotNull pj.n<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character f8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final HashSet<Character> f9(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) e9(charSequence, new HashSet(MapsKt.mapCapacity(kotlin.ranges.r.B(charSequence.length(), 128))));
    }

    public static final boolean g6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R g7(@NotNull CharSequence charSequence, R r10, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int iI3 = StringsKt__StringsKt.i3(charSequence); iI3 >= 0; iI3--) {
            r10 = operation.invoke(Character.valueOf(charSequence.charAt(iI3)), r10);
        }
        return r10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final char g8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @NotNull
    public static final List<Character> g9(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? h9(charSequence) : CollectionsKt.listOf(Character.valueOf(charSequence.charAt(0)));
        }
        return CollectionsKt.emptyList();
    }

    public static final boolean h6(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final <R> R h7(@NotNull CharSequence charSequence, R r10, @NotNull pj.n<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int iI3 = StringsKt__StringsKt.i3(charSequence); iI3 >= 0; iI3--) {
            r10 = operation.invoke(Integer.valueOf(iI3), Character.valueOf(charSequence.charAt(iI3)), r10);
        }
        return r10;
    }

    public static final boolean h8(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @NotNull
    public static final List<Character> h9(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) e9(charSequence, new ArrayList(charSequence.length()));
    }

    public static final boolean i6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void i7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            action.invoke(Character.valueOf(charSequence.charAt(i10)));
        }
    }

    public static final boolean i8(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Set<Character> i9(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            return length != 1 ? (Set) e9(charSequence, new LinkedHashSet(MapsKt.mapCapacity(kotlin.ranges.r.B(charSequence.length(), 128)))) : SetsKt.setOf(Character.valueOf(charSequence.charAt(0)));
        }
        return SetsKt.emptySet();
    }

    @NotNull
    public static final Iterable<Character> j6(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? CollectionsKt.emptyList() : new a(charSequence);
    }

    public static final void j7(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static final <S extends CharSequence> S j8(@NotNull S s10, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i10 = 0; i10 < s10.length(); i10++) {
            action.invoke(Character.valueOf(s10.charAt(i10)));
        }
        return s10;
    }

    @e1(version = "1.2")
    @NotNull
    public static final List<String> j9(@NotNull CharSequence charSequence, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return k9(charSequence, i10, i11, z10, e.f313386a);
    }

    @NotNull
    public static final Sequence<Character> k6(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? kotlin.sequences.o.g() : new b(charSequence);
    }

    @kotlin.internal.f
    private static final char k7(CharSequence charSequence, int i10, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= charSequence.length()) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S k8(@NotNull S s10, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < s10.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(s10.charAt(i10)));
            i10++;
            i11++;
        }
        return s10;
    }

    @e1(version = "1.2")
    @NotNull
    public static final <R> List<R> k9(@NotNull CharSequence charSequence, int i10, int i11, boolean z10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i10, i11);
        int length = charSequence.length();
        int i12 = 0;
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> l6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @Nullable
    public static final Character l7(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0 || i10 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    @NotNull
    public static final Pair<CharSequence, CharSequence> l8(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        return new Pair<>(sb2, sb3);
    }

    public static /* synthetic */ List l9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return j9(charSequence, i10, i11, z10);
    }

    @NotNull
    public static final <K> Map<K, Character> m6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> m7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Pair<String, String> m8(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Pair<>(string, string2);
    }

    public static /* synthetic */ List m9(CharSequence charSequence, int i10, int i11, boolean z10, Function1 function1, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return k9(charSequence, i10, i11, z10, function1);
    }

    @NotNull
    public static final <K, V> Map<K, V> n6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> n7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final char n8(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return o8(charSequence, kotlin.random.f.f312895a);
    }

    @e1(version = "1.2")
    @NotNull
    public static final Sequence<String> n9(@NotNull CharSequence charSequence, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return o9(charSequence, i10, i11, z10, f.f313387a);
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M o6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M o7(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    @e1(version = "1.3")
    public static char o8(@NotNull CharSequence charSequence, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.m(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @e1(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> o9(@NotNull CharSequence charSequence, int i10, int i11, boolean z10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i10, i11);
        return kotlin.sequences.o.k1(CollectionsKt.asSequence(kotlin.ranges.r.B1(z10 ? StringsKt__StringsKt.h3(charSequence) : kotlin.ranges.r.W1(0, (charSequence.length() - i10) + 1), i11)), new g(i10, charSequence, transform));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M p6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M p7(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Character p8(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return q8(charSequence, kotlin.random.f.f312895a);
    }

    public static /* synthetic */ Sequence p9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
            boolean z11 = true & false;
        }
        return n9(charSequence, i10, i11, z10);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M q6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(charSequence.charAt(i10)));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static final <K> Grouping<Character, K> q7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new d(charSequence, keySelector);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character q8(@NotNull CharSequence charSequence, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.m(charSequence.length())));
    }

    public static /* synthetic */ Sequence q9(CharSequence charSequence, int i10, int i11, boolean z10, Function1 function1, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return o9(charSequence, i10, i11, z10, function1);
    }

    @e1(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> r6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(kotlin.ranges.r.B(charSequence.length(), 128)), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static final int r7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final char r8(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> r9(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IndexingIterable(new h(charSequence));
    }

    @e1(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M s6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final int s7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    public static final char s8(@NotNull CharSequence charSequence, @NotNull pj.n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @NotNull
    public static List<Pair<Character, Character>> s9(@NotNull CharSequence charSequence, @NotNull CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    @e1(version = "1.2")
    @NotNull
    public static List<String> t6(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return j9(charSequence, i10, i10, true);
    }

    public static char t7(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.i3(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character t8(@NotNull CharSequence charSequence, @NotNull pj.n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final <V> List<V> t9(@NotNull CharSequence charSequence, @NotNull CharSequence other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    @e1(version = "1.2")
    @NotNull
    public static final <R> List<R> u6(@NotNull CharSequence charSequence, int i10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return k9(charSequence, i10, i10, true, transform);
    }

    public static final char u7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return cCharAt;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character u8(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        int i10 = 1;
        if (1 <= iI3) {
            while (true) {
                cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @e1(version = "1.2")
    @NotNull
    public static final List<Pair<Character, Character>> u9(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            i10++;
            arrayList.add(TuplesKt.to(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @e1(version = "1.2")
    @NotNull
    public static final Sequence<String> v6(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return w6(charSequence, i10, c.f313383a);
    }

    @Nullable
    public static final Character v7(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char v8(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iI3);
        for (int i10 = iI3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @e1(version = "1.2")
    @NotNull
    public static final <R> List<R> v9(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i10));
            i10++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @e1(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> w6(@NotNull CharSequence charSequence, int i10, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return o9(charSequence, i10, i10, true, transform);
    }

    @Nullable
    public static final Character w7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    return Character.valueOf(cCharAt);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    public static final char w8(@NotNull CharSequence charSequence, @NotNull pj.n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iI3);
        for (int i10 = iI3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @kotlin.internal.f
    private static final int x6(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    @NotNull
    public static final <R> List<R> x7(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character x8(@NotNull CharSequence charSequence, @NotNull pj.n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iI3);
        for (int i10 = iI3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final int y6(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final <R> List<R> y7(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character y8(@NotNull CharSequence charSequence, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iI3 = StringsKt__StringsKt.i3(charSequence);
        if (iI3 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iI3);
        for (int i10 = iI3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final CharSequence z6(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(kotlin.ranges.r.B(i10, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <R> List<R> z7(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static CharSequence z8(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder sbReverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(sbReverse, "reverse(...)");
        return sbReverse;
    }
}
