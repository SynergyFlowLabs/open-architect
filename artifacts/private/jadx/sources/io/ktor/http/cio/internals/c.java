package io.ktor.http.cio.internals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f295545b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b<T> f295546a;

    @SourceDebugExtension({"SMAP\nAsciiCharTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n1999#2,14:74\n1761#2,3:88\n1491#2:91\n1516#2,3:92\n1519#2,3:102\n774#2:106\n865#2,2:107\n774#2:109\n865#2,2:110\n384#3,7:95\n216#4:105\n217#4:112\n*S KotlinDebug\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Companion\n*L\n44#1:74,14\n47#1:88,3\n63#1:91\n63#1:92,3\n63#1:102,3\n66#1:106\n66#1:107,2\n68#1:109\n68#1:110,2\n63#1:95,7\n63#1:105\n63#1:112\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> void e(List<b<T>> list, List<? extends T> list2, int i10, int i11, Function1<? super T, Integer> function1, Function2<? super T, ? super Integer, Character> function2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t10 : list2) {
                Character chInvoke = function2.invoke(t10, Integer.valueOf(i11));
                chInvoke.charValue();
                Object arrayList = linkedHashMap.get(chInvoke);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(chInvoke, arrayList);
                }
                ((List) arrayList).add(t10);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list3 = (List) entry.getValue();
                int i12 = i11 + 1;
                ArrayList arrayList2 = new ArrayList();
                a aVar = c.f295545b;
                List list4 = list3;
                ArrayList arrayList3 = new ArrayList();
                for (T t11 : list4) {
                    if (function1.invoke(t11).intValue() > i12) {
                        arrayList3.add(t11);
                    }
                }
                int i13 = i10;
                Function1<? super T, Integer> function3 = function1;
                Function2<? super T, ? super Integer, Character> function4 = function2;
                aVar.e(arrayList2, arrayList3, i13, i12, function3, function4);
                arrayList2.trimToSize();
                ArrayList arrayList4 = new ArrayList();
                for (T t12 : list4) {
                    if (function3.invoke(t12).intValue() == i12) {
                        arrayList4.add(t12);
                    }
                }
                list.add(new b<>(cCharValue, arrayList4, arrayList2));
                i10 = i13;
                function1 = function3;
                function2 = function4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final char g(CharSequence s10, int i10) {
            Intrinsics.checkNotNullParameter(s10, "s");
            return s10.charAt(i10);
        }

        @NotNull
        public final <T extends CharSequence> c<T> c(@NotNull List<? extends T> from) {
            Intrinsics.checkNotNullParameter(from, "from");
            return d(from, new Function1() { // from class: io.ktor.http.cio.internals.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(c.a.f((CharSequence) obj));
                }
            }, new Function2() { // from class: io.ktor.http.cio.internals.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Character.valueOf(c.a.g((CharSequence) obj, ((Integer) obj2).intValue()));
                }
            });
        }

        @NotNull
        public final <T> c<T> d(@NotNull List<? extends T> from, @NotNull Function1<? super T, Integer> length, @NotNull Function2<? super T, ? super Integer, Character> charAt) {
            a0.c cVar;
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(length, "length");
            Intrinsics.checkNotNullParameter(charAt, "charAt");
            List<? extends T> list = from;
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    Integer numInvoke = length.invoke(next);
                    do {
                        T next2 = it.next();
                        Integer numInvoke2 = length.invoke(next2);
                        if (numInvoke.compareTo(numInvoke2) < 0) {
                            next = next2;
                            numInvoke = numInvoke2;
                        }
                    } while (it.hasNext());
                }
                cVar = next;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            int iIntValue = length.invoke(cVar).intValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (length.invoke(it2.next()).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            e(arrayList, from, iIntValue, 0, length, charAt);
            arrayList.trimToSize();
            return new c<>(new b((char) 0, CollectionsKt.emptyList(), arrayList));
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nAsciiCharTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Node\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n669#2,11:74\n*S KotlinDebug\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Node\n*L\n9#1:74,11\n*E\n"})
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f295547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<T> f295548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<b<T>> f295549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final b<T>[] f295550d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(char c10, @NotNull List<? extends T> exact, @NotNull List<b<T>> children) {
            Intrinsics.checkNotNullParameter(exact, "exact");
            Intrinsics.checkNotNullParameter(children, "children");
            this.f295547a = c10;
            this.f295548b = exact;
            this.f295549c = children;
            b<T>[] bVarArr = new b[256];
            int i10 = 6 ^ 0;
            for (int i11 = 0; i11 < 256; i11++) {
                Iterator<T> it = this.f295549c.iterator();
                b<T> bVar = null;
                boolean z10 = false;
                b<T> bVar2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (!z10) {
                            break;
                        }
                        bVar = bVar2;
                        break;
                    } else {
                        T next = it.next();
                        if (((b) next).f295547a == i11) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            bVar2 = next;
                        }
                    }
                }
                bVarArr[i11] = bVar;
            }
            this.f295550d = bVarArr;
        }

        @NotNull
        public final b<T>[] a() {
            return this.f295550d;
        }

        public final char b() {
            return this.f295547a;
        }

        @NotNull
        public final List<b<T>> c() {
            return this.f295549c;
        }

        @NotNull
        public final List<T> d() {
            return this.f295548b;
        }
    }

    public c(@NotNull b<T> root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f295546a = root;
    }

    public static /* synthetic */ List c(c cVar, CharSequence charSequence, int i10, int i11, boolean z10, Function2 function2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return cVar.b(charSequence, i10, i11, z10, function2);
    }

    @NotNull
    public final b<T> a() {
        return this.f295546a;
    }

    @NotNull
    public final List<T> b(@NotNull CharSequence sequence, int i10, int i11, boolean z10, @NotNull Function2<? super Character, ? super Integer, Boolean> stopPredicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(stopPredicate, "stopPredicate");
        if (sequence.length() == 0) {
            throw new IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        b<T> bVar = this.f295546a;
        while (i10 < i11) {
            char cCharAt = sequence.charAt(i10);
            if (stopPredicate.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt)).booleanValue()) {
                break;
            }
            b<T> bVar2 = bVar.a()[cCharAt];
            if (bVar2 == null) {
                bVar = z10 ? bVar.a()[Character.toLowerCase(cCharAt)] : null;
                if (bVar == null) {
                    return CollectionsKt.emptyList();
                }
            } else {
                bVar = bVar2;
            }
            i10++;
        }
        return bVar.d();
    }
}
