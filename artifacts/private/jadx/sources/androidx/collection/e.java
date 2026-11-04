package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12190a = 4;

    public static final <E> void a(@NotNull c<E> cVar, @NotNull c<? extends E> array) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int iM = array.m();
        cVar.d(cVar.m() + iM);
        if (cVar.m() != 0) {
            for (int i10 = 0; i10 < iM; i10++) {
                cVar.add(array.v(i10));
            }
        } else if (iM > 0) {
            ArraysKt.copyInto$default(array.k(), cVar.k(), 0, 0, iM, 6, (Object) null);
            ArraysKt.copyInto$default(array.i(), cVar.i(), 0, 0, iM, 6, (Object) null);
            if (cVar.m() != 0) {
                throw new ConcurrentModificationException();
            }
            cVar.u(iM);
        }
    }

    public static final <E> boolean b(@NotNull c<E> cVar, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        cVar.d(cVar.m() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= cVar.add(it.next());
        }
        return zAdd;
    }

    public static final <E> boolean c(@NotNull c<E> cVar, E e10) {
        int i10;
        int iN;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int iM = cVar.m();
        if (e10 == null) {
            iN = p(cVar);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iN = n(cVar, e10, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i11 = ~iN;
        if (iM >= cVar.k().length) {
            int i12 = 8;
            if (iM >= 8) {
                i12 = (iM >> 1) + iM;
            } else if (iM < 4) {
                i12 = 4;
            }
            int[] iArrK = cVar.k();
            Object[] objArrI = cVar.i();
            d(cVar, i12);
            if (iM != cVar.m()) {
                throw new ConcurrentModificationException();
            }
            if (!(cVar.k().length == 0)) {
                ArraysKt.copyInto$default(iArrK, cVar.k(), 0, 0, iArrK.length, 6, (Object) null);
                ArraysKt.copyInto$default(objArrI, cVar.i(), 0, 0, objArrI.length, 6, (Object) null);
            }
        }
        if (i11 < iM) {
            int i13 = i11 + 1;
            ArraysKt.copyInto(cVar.k(), cVar.k(), i13, i11, iM);
            ArraysKt.copyInto(cVar.i(), cVar.i(), i13, i11, iM);
        }
        if (iM != cVar.m() || i11 >= cVar.k().length) {
            throw new ConcurrentModificationException();
        }
        cVar.k()[i11] = i10;
        cVar.i()[i11] = e10;
        cVar.u(cVar.m() + 1);
        return true;
    }

    public static final <E> void d(@NotNull c<E> cVar, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.t(new int[i10]);
        cVar.s(new Object[i10]);
    }

    @NotNull
    public static final <T> c<T> e() {
        return new c<>(0, 1, null);
    }

    @NotNull
    public static final <T> c<T> f(@NotNull T... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        c<T> cVar = new c<>(values.length);
        for (T t10 : values) {
            cVar.add(t10);
        }
        return cVar;
    }

    public static final <E> int g(@NotNull c<E> cVar, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        try {
            return t.a.a(cVar.k(), cVar.m(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void h(@NotNull c<E> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar.m() != 0) {
            cVar.t(t.a.f376158a);
            cVar.s(t.a.f376160c);
            cVar.u(0);
        }
        if (cVar.m() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean i(@NotNull c<E> cVar, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!cVar.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean j(@NotNull c<E> cVar, E e10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.indexOf(e10) >= 0;
    }

    public static final <E> void k(@NotNull c<E> cVar, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int iM = cVar.m();
        if (cVar.k().length < i10) {
            int[] iArrK = cVar.k();
            Object[] objArrI = cVar.i();
            d(cVar, i10);
            if (cVar.m() > 0) {
                int i11 = 5 | 0;
                ArraysKt.copyInto$default(iArrK, cVar.k(), 0, 0, cVar.m(), 6, (Object) null);
                ArraysKt.copyInto$default(objArrI, cVar.i(), 0, 0, cVar.m(), 6, (Object) null);
            }
        }
        if (cVar.m() != iM) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean l(@NotNull c<E> cVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof Set) || cVar.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iM = cVar.m();
            for (int i10 = 0; i10 < iM; i10++) {
                if (!((Set) obj).contains(cVar.v(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int m(@NotNull c<E> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int[] iArrK = cVar.k();
        int iM = cVar.m();
        int i10 = 0;
        for (int i11 = 0; i11 < iM; i11++) {
            i10 += iArrK[i11];
        }
        return i10;
    }

    public static final <E> int n(@NotNull c<E> cVar, @Nullable Object obj, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int iM = cVar.m();
        if (iM == 0) {
            return -1;
        }
        int iG = g(cVar, i10);
        if (iG < 0 || Intrinsics.areEqual(obj, cVar.i()[iG])) {
            return iG;
        }
        int i11 = iG + 1;
        while (i11 < iM && cVar.k()[i11] == i10) {
            if (Intrinsics.areEqual(obj, cVar.i()[i11])) {
                return i11;
            }
            i11++;
        }
        do {
            iG--;
            if (iG < 0 || cVar.k()[iG] != i10) {
                return ~i11;
            }
        } while (!Intrinsics.areEqual(obj, cVar.i()[iG]));
        return iG;
    }

    public static final <E> int o(@NotNull c<E> cVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return obj == null ? p(cVar) : n(cVar, obj, obj.hashCode());
    }

    public static final <E> int p(@NotNull c<E> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return n(cVar, null, 0);
    }

    public static final <E> boolean q(@NotNull c<E> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.m() <= 0;
    }

    public static final <E> boolean r(@NotNull c<E> cVar, @NotNull c<? extends E> array) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int iM = array.m();
        int iM2 = cVar.m();
        for (int i10 = 0; i10 < iM; i10++) {
            cVar.remove(array.v(i10));
        }
        return iM2 != cVar.m();
    }

    public static final <E> boolean s(@NotNull c<E> cVar, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= cVar.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> E t(@NotNull c<E> cVar, int i10) {
        int i11;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int iM = cVar.m();
        E e10 = (E) cVar.i()[i10];
        if (iM <= 1) {
            cVar.clear();
            return e10;
        }
        int i12 = iM - 1;
        if (cVar.k().length <= 8 || cVar.m() >= cVar.k().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                ArraysKt.copyInto(cVar.k(), cVar.k(), i10, i13, iM);
                ArraysKt.copyInto(cVar.i(), cVar.i(), i10, i13, iM);
            }
            cVar.i()[i12] = null;
        } else {
            int iM2 = cVar.m() > 8 ? cVar.m() + (cVar.m() >> 1) : 8;
            int[] iArrK = cVar.k();
            Object[] objArrI = cVar.i();
            d(cVar, iM2);
            if (i10 > 0) {
                ArraysKt.copyInto$default(iArrK, cVar.k(), 0, 0, i10, 6, (Object) null);
                objArr = objArrI;
                ArraysKt.copyInto$default(objArr, cVar.i(), 0, 0, i10, 6, (Object) null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrI;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                ArraysKt.copyInto(iArrK, cVar.k(), i11, i14, iM);
                ArraysKt.copyInto(objArr, cVar.i(), i11, i14, iM);
            }
        }
        if (iM != cVar.m()) {
            throw new ConcurrentModificationException();
        }
        cVar.u(i12);
        return e10;
    }

    public static final <E> boolean u(@NotNull c<E> cVar, E e10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int iIndexOf = cVar.indexOf(e10);
        if (iIndexOf < 0) {
            return false;
        }
        cVar.p(iIndexOf);
        return true;
    }

    public static final <E> boolean v(@NotNull c<E> cVar, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int iM = cVar.m() - 1; -1 < iM; iM--) {
            if (!CollectionsKt.contains(elements, cVar.i()[iM])) {
                cVar.p(iM);
                z10 = true;
            }
        }
        return z10;
    }

    @NotNull
    public static final <E> String w(@NotNull c<E> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(cVar.m() * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int iM = cVar.m();
        for (int i10 = 0; i10 < iM; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eV = cVar.v(i10);
            if (eV != cVar) {
                sb2.append(eV);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <E> E x(@NotNull c<E> cVar, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return (E) cVar.i()[i10];
    }
}
