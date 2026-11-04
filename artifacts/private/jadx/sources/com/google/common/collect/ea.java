package com.google.common.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class ea {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f117365a = new a("NEXT_LOWER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f117366b = new C1058b("NEXT_HIGHER", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f117367c = new c("INVERTED_INSERTION_INDEX", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f117368d = k();

        final enum a extends b {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.ea.b
            int l(int higherIndex) {
                return higherIndex - 1;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ea$b$b, reason: collision with other inner class name */
        final enum C1058b extends b {
            C1058b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.ea.b
            public int l(int higherIndex) {
                return higherIndex;
            }
        }

        final enum c extends b {
            c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.ea.b
            public int l(int higherIndex) {
                return ~higherIndex;
            }
        }

        private b(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ b[] k() {
            return new b[]{f117365a, f117366b, f117367c};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f117368d.clone();
        }

        abstract int l(int higherIndex);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f117369a = new a("ANY_PRESENT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f117370b = new b("LAST_PRESENT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f117371c = new C1059c("FIRST_PRESENT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f117372d = new d("FIRST_AFTER", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f117373e = new e("LAST_BEFORE", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ c[] f117374f = k();

        final enum a extends c {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.ea.c
            <E> int l(Comparator<? super E> comparator, @b9 E key, List<? extends E> list, int foundIndex) {
                return foundIndex;
            }
        }

        final enum b extends c {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ea.c
            <E> int l(Comparator<? super E> comparator, @b9 E e10, List<? extends E> list, int i10) {
                int size = list.size() - 1;
                while (i10 < size) {
                    int i11 = ((i10 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i11), e10) > 0) {
                        size = i11 - 1;
                    } else {
                        i10 = i11;
                    }
                }
                return i10;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ea$c$c, reason: collision with other inner class name */
        final enum C1059c extends c {
            C1059c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ea.c
            <E> int l(Comparator<? super E> comparator, @b9 E e10, List<? extends E> list, int i10) {
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = (i11 + i10) >>> 1;
                    if (comparator.compare(list.get(i12), e10) < 0) {
                        i11 = i12 + 1;
                    } else {
                        i10 = i12;
                    }
                }
                return i11;
            }
        }

        final enum d extends c {
            d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.ea.c
            public <E> int l(Comparator<? super E> comparator, @b9 E key, List<? extends E> list, int foundIndex) {
                return c.f117370b.l(comparator, key, list, foundIndex) + 1;
            }
        }

        final enum e extends c {
            e(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.collect.ea.c
            public <E> int l(Comparator<? super E> comparator, @b9 E key, List<? extends E> list, int foundIndex) {
                return c.f117371c.l(comparator, key, list, foundIndex) - 1;
            }
        }

        private c(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ c[] k() {
            return new c[]{f117369a, f117370b, f117371c, f117372d, f117373e};
        }

        public static c valueOf(String name) {
            return (c) Enum.valueOf(c.class, name);
        }

        public static c[] values() {
            return (c[]) f117374f.clone();
        }

        abstract <E> int l(Comparator<? super E> comparator, @b9 E key, List<? extends E> list, int foundIndex);
    }

    private ea() {
    }

    public static <E, K extends Comparable> int a(List<E> list, com.google.common.base.t<? super E, K> keyFunction, K key, c presentBehavior, b absentBehavior) {
        com.google.common.base.j0.E(key);
        return b(list, keyFunction, key, a9.z(), presentBehavior, absentBehavior);
    }

    public static <E, K> int b(List<E> list, com.google.common.base.t<? super E, K> keyFunction, @b9 K key, Comparator<? super K> keyComparator, c presentBehavior, b absentBehavior) {
        return d(x7.D(list, keyFunction), key, keyComparator, presentBehavior, absentBehavior);
    }

    public static <E extends Comparable> int c(List<? extends E> list, E e10, c presentBehavior, b absentBehavior) {
        com.google.common.base.j0.E(e10);
        return d(list, e10, a9.z(), presentBehavior, absentBehavior);
    }

    public static <E> int d(List<? extends E> list, @b9 E e10, Comparator<? super E> comparator, c cVar, b bVar) {
        com.google.common.base.j0.E(comparator);
        com.google.common.base.j0.E(list);
        com.google.common.base.j0.E(cVar);
        com.google.common.base.j0.E(bVar);
        if (!(list instanceof RandomAccess)) {
            list = new ArrayList(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iCompare = comparator.compare(e10, list.get(i11));
            if (iCompare < 0) {
                size = i11 - 1;
            } else {
                if (iCompare <= 0) {
                    return i10 + cVar.l(comparator, e10, list.subList(i10, size + 1), i11 - i10);
                }
                i10 = i11 + 1;
            }
        }
        return bVar.l(i10);
    }
}
