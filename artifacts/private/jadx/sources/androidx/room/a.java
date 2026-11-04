package androidx.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1#2:254\n13579#3,2:255\n13644#3,3:257\n13644#3,2:260\n11335#3:262\n11670#3,2:263\n11672#3:267\n13646#3:268\n1855#4,2:265\n1726#4,3:269\n1549#4:272\n1620#4,3:273\n1855#4,2:278\n37#5,2:276\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n85#1:255,2\n87#1:257,3\n96#1:260,2\n118#1:262\n118#1:263,2\n118#1:267\n96#1:268\n120#1:265,2\n141#1:269,3\n151#1:272\n151#1:273,3\n188#1:278,2\n151#1:276,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f74618a = new a();

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    private static final class C0734a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final IntRange f74619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Integer> f74620b;

        public C0734a(@NotNull IntRange resultRange, @NotNull List<Integer> resultIndices) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.f74619a = resultRange;
            this.f74620b = resultIndices;
        }

        @NotNull
        public final List<Integer> a() {
            return this.f74620b;
        }

        @NotNull
        public final IntRange b() {
            return this.f74619a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f74621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f74622b;

        public b(@NotNull String name, int i10) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f74621a = name;
            this.f74622b = i10;
        }

        public static /* synthetic */ b d(b bVar, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f74621a;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f74622b;
            }
            return bVar.c(str, i10);
        }

        @NotNull
        public final String a() {
            return this.f74621a;
        }

        public final int b() {
            return this.f74622b;
        }

        @NotNull
        public final b c(@NotNull String name, int i10) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new b(name, i10);
        }

        public final int e() {
            return this.f74622b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f74621a, bVar.f74621a) && this.f74622b == bVar.f74622b;
        }

        @NotNull
        public final String f() {
            return this.f74621a;
        }

        public int hashCode() {
            return (this.f74621a.hashCode() * 31) + Integer.hashCode(this.f74622b);
        }

        @NotNull
        public String toString() {
            return "ResultColumn(name=" + this.f74621a + ", index=" + this.f74622b + ')';
        }
    }

    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final C0735a f74623d = new C0735a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final c f74624e = new c(CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<C0734a> f74625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f74626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f74627c;

        /* JADX INFO: renamed from: androidx.room.a$c$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1774#3,3:255\n1855#3,2:258\n1777#3:260\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n232#1:255,3\n234#1:258,2\n232#1:260\n*E\n"})
        public static final class C0735a {
            public /* synthetic */ C0735a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final c a(@NotNull List<C0734a> matches) {
                Intrinsics.checkNotNullParameter(matches, "matches");
                List<C0734a> list = matches;
                int i10 = 0;
                int iM = 0;
                for (C0734a c0734a : list) {
                    iM += ((c0734a.b().m() - c0734a.b().l()) + 1) - c0734a.a().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iL = ((C0734a) it.next()).b().l();
                while (it.hasNext()) {
                    int iL2 = ((C0734a) it.next()).b().l();
                    if (iL > iL2) {
                        iL = iL2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM2 = ((C0734a) it2.next()).b().m();
                while (it2.hasNext()) {
                    int iM3 = ((C0734a) it2.next()).b().m();
                    if (iM2 < iM3) {
                        iM2 = iM3;
                    }
                }
                Iterable intRange = new IntRange(iL, iM2);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it3 = intRange.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        Iterator<T> it4 = list.iterator();
                        int i12 = 0;
                        while (it4.hasNext()) {
                            if (((C0734a) it4.next()).b().t(iNextInt)) {
                                i12++;
                            }
                            if (i12 > 1) {
                                i11++;
                                if (i11 >= 0) {
                                    break;
                                }
                                CollectionsKt.throwCountOverflow();
                                break;
                            }
                        }
                    }
                    i10 = i11;
                }
                return new c(matches, iM, i10);
            }

            @NotNull
            public final c b() {
                return c.f74624e;
            }

            private C0735a() {
            }
        }

        public c(@NotNull List<C0734a> matches, int i10, int i11) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.f74625a = matches;
            this.f74626b = i10;
            this.f74627c = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int iCompare = Intrinsics.compare(this.f74627c, other.f74627c);
            return iCompare != 0 ? iCompare : Intrinsics.compare(this.f74626b, other.f74626b);
        }

        public final int n() {
            return this.f74626b;
        }

        @NotNull
        public final List<C0734a> o() {
            return this.f74625a;
        }

        public final int p() {
            return this.f74627c;
        }
    }

    @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n11335#2:254\n11670#2,2:255\n11672#2:259\n288#3,2:257\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n*L\n102#1:254\n102#1:255,2\n102#1:259\n103#1:257,2\n*E\n"})
    static final class d extends kotlin.jvm.internal.l0 implements pj.n<Integer, Integer, List<? extends b>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f74628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<List<C0734a>> f74629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f74630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String[] strArr, List<? extends List<C0734a>> list, int i10) {
            super(3);
            this.f74628a = strArr;
            this.f74629b = list;
            this.f74630c = i10;
        }

        public final void c(int i10, int i11, @NotNull List<b> resultColumnsSublist) {
            Object next;
            Intrinsics.checkNotNullParameter(resultColumnsSublist, "resultColumnsSublist");
            String[] strArr = this.f74628a;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                Iterator<T> it = resultColumnsSublist.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(str, ((b) next).a()));
                b bVar = (b) next;
                if (bVar == null) {
                    return;
                }
                arrayList.add(Integer.valueOf(bVar.e()));
            }
            this.f74629b.get(this.f74630c).add(new C0734a(new IntRange(i10, i11 - 1), arrayList));
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, List<? extends b> list) {
            c(num.intValue(), num2.intValue(), list);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1#2:254\n*E\n"})
    static final class e extends kotlin.jvm.internal.l0 implements Function1<List<? extends Integer>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<List<C0734a>> f74631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f74632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(List<? extends List<C0734a>> list, int i10) {
            super(1);
            this.f74631a = list;
            this.f74632b = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list) {
            invoke2((List<Integer>) list);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<Integer> indices) {
            Intrinsics.checkNotNullParameter(indices, "indices");
            List<Integer> list = indices;
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue = ((Number) it.next()).intValue();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                if (iIntValue > iIntValue2) {
                    iIntValue = iIntValue2;
                }
            }
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue3 = ((Number) it2.next()).intValue();
            while (it2.hasNext()) {
                int iIntValue4 = ((Number) it2.next()).intValue();
                if (iIntValue3 < iIntValue4) {
                    iIntValue3 = iIntValue4;
                }
            }
            this.f74631a.get(this.f74632b).add(new C0734a(new IntRange(iIntValue, iIntValue3), indices));
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<List<? extends C0734a>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<c> f74633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.jvm.internal.i1.h<c> hVar) {
            super(1);
            this.f74633a = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C0734a> list) {
            invoke2((List<C0734a>) list);
            return Unit.f312394a;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.room.a$c] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<C0734a> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ?? A = c.f74623d.a(it);
            if (A.compareTo(this.f74633a.f312751a) < 0) {
                this.f74633a.f312751a = A;
            }
        }
    }

    private a() {
    }

    private final <T> void a(List<? extends List<? extends T>> list, List<T> list2, int i10, Function1<? super List<? extends T>, Unit> function1) {
        if (i10 == list.size()) {
            function1.invoke(CollectionsKt.toList(list2));
            return;
        }
        Iterator<T> it = list.get(i10).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            f74618a.a(list, list2, i10 + 1, function1);
            CollectionsKt.removeLast(list2);
        }
    }

    static /* synthetic */ void b(a aVar, List list, List list2, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        aVar.a(list, list2, i10, function1);
    }

    private final void c(List<b> list, String[] strArr, pj.n<? super Integer, ? super Integer, ? super List<b>, Unit> nVar) {
        int i10 = 0;
        int iHashCode = 0;
        for (String str : strArr) {
            iHashCode += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((b) it.next()).f().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                nVar.invoke(Integer.valueOf(i10), Integer.valueOf(length), list.subList(i10, length));
            }
            int i11 = i10 + 1;
            int i12 = length + 1;
            if (i12 > list.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - list.get(i10).f().hashCode()) + list.get(length).f().hashCode();
            i10 = i11;
            length = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.room.a$c] */
    @oj.n
    @NotNull
    public static final int[][] d(@NotNull String[] resultColumns, @NotNull String[][] mappings) {
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String strSubstring = resultColumns[i11];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strSubstring.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i11] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int length3 = mappings[i12].length;
            for (int i13 = 0; i13 < length3; i13++) {
                String[] strArr = mappings[i12];
                String str = strArr[i13];
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = str.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i13] = lowerCase2;
            }
        }
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String[] strArr2 : mappings) {
            CollectionsKt.addAll(setCreateSetBuilder, strArr2);
        }
        Set setBuild = SetsKt.build(setCreateSetBuilder);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length4 = resultColumns.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length4) {
            String str2 = resultColumns[i14];
            int i16 = i15 + 1;
            if (setBuild.contains(str2)) {
                listCreateListBuilder.add(new b(str2, i15));
            }
            i14++;
            i15 = i16;
        }
        List<b> listBuild = CollectionsKt.build(listCreateListBuilder);
        int length5 = mappings.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i17 = 0; i17 < length5; i17++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length6) {
            String[] strArr3 = mappings[i18];
            int i20 = i19 + 1;
            f74618a.c(listBuild, strArr3, new d(strArr3, arrayList, i19));
            if (((List) arrayList.get(i19)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i21 = i10; i21 < length7; i21++) {
                    String str3 = strArr3[i21];
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    for (b bVar : listBuild) {
                        if (Intrinsics.areEqual(str3, bVar.f())) {
                            listCreateListBuilder2.add(Integer.valueOf(bVar.e()));
                        }
                    }
                    List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
                    if (listBuild2.isEmpty()) {
                        throw new IllegalStateException(("Column " + str3 + " not found in result").toString());
                    }
                    arrayList2.add(listBuild2);
                }
                b(f74618a, arrayList2, null, 0, new e(arrayList, i19), 6, null);
            }
            i18++;
            i19 = i20;
            i10 = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        hVar.f312751a = c.f74623d.b();
        b(f74618a, arrayList, null, 0, new f(hVar), 6, null);
        List<C0734a> listO = ((c) hVar.f312751a).o();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listO, 10));
        Iterator<T> it2 = listO.iterator();
        while (it2.hasNext()) {
            arrayList3.add(CollectionsKt.toIntArray(((C0734a) it2.next()).a()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }
}
