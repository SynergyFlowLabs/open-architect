package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,283:1\n288#2,10:284\n301#2,14:294\n318#2:308\n323#2:309\n328#2:310\n333#2:311\n338#2,61:312\n403#2,17:373\n423#2,6:390\n433#2,60:396\n501#2,9:456\n514#2,22:465\n540#2,7:487\n551#2,19:494\n574#2,6:513\n584#2,6:519\n594#2,5:525\n603#2,8:530\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n89#1:284,10\n98#1:294,14\n108#1:308\n118#1:309\n128#1:310\n133#1:311\n145#1:312,61\n155#1:373,17\n165#1:390,6\n176#1:396,60\n185#1:456,9\n210#1:465,22\n215#1:487,7\n223#1:494,19\n250#1:513,6\n259#1:519,6\n269#1:525,5\n280#1:530,8\n*E\n"})
public final class c<E> implements Collection<E>, Set<E>, qj.b, qj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f12153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Object[] f12154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12155c;

    private final class a extends z<E> {
        public a() {
            super(c.this.m());
        }

        @Override // androidx.collection.z
        protected E b(int i10) {
            return c.this.v(i10);
        }

        @Override // androidx.collection.z
        protected void c(int i10) {
            c.this.p(i10);
        }
    }

    @oj.j
    public c() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iN;
        int iM = m();
        if (e10 == null) {
            iN = e.p(this);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iN = e.n(this, e10, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i11 = ~iN;
        if (iM >= k().length) {
            int i12 = 8;
            if (iM >= 8) {
                i12 = (iM >> 1) + iM;
            } else if (iM < 4) {
                i12 = 4;
            }
            int[] iArrK = k();
            Object[] objArrI = i();
            e.d(this, i12);
            if (iM != m()) {
                throw new ConcurrentModificationException();
            }
            if (!(k().length == 0)) {
                ArraysKt.copyInto$default(iArrK, k(), 0, 0, iArrK.length, 6, (Object) null);
                ArraysKt.copyInto$default(objArrI, i(), 0, 0, objArrI.length, 6, (Object) null);
            }
        }
        if (i11 < iM) {
            int i13 = i11 + 1;
            ArraysKt.copyInto(k(), k(), i13, i11, iM);
            ArraysKt.copyInto(i(), i(), i13, i11, iM);
        }
        if (iM != m() || i11 >= k().length) {
            throw new ConcurrentModificationException();
        }
        k()[i11] = i10;
        i()[i11] = e10;
        u(m() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d(m() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void c(@NotNull c<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int iM = array.m();
        d(m() + iM);
        if (m() != 0) {
            for (int i10 = 0; i10 < iM; i10++) {
                add(array.v(i10));
            }
            return;
        }
        if (iM > 0) {
            ArraysKt.copyInto$default(array.k(), k(), 0, 0, iM, 6, (Object) null);
            ArraysKt.copyInto$default(array.i(), i(), 0, 0, iM, 6, (Object) null);
            if (m() != 0) {
                throw new ConcurrentModificationException();
            }
            u(iM);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m() != 0) {
            t(t.a.f376158a);
            s(t.a.f376160c);
            u(0);
        }
        if (m() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i10) {
        int iM = m();
        if (k().length < i10) {
            int[] iArrK = k();
            Object[] objArrI = i();
            e.d(this, i10);
            if (m() > 0) {
                ArraysKt.copyInto$default(iArrK, k(), 0, 0, m(), 6, (Object) null);
                ArraysKt.copyInto$default(objArrI, i(), 0, 0, m(), 6, (Object) null);
            }
        }
        if (m() != iM) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int iM = m();
                for (int i10 = 0; i10 < iM; i10++) {
                    if (!((Set) obj).contains(v(i10))) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrK = k();
        int iM = m();
        int i10 = 0;
        for (int i11 = 0; i11 < iM; i11++) {
            i10 += iArrK[i11];
        }
        return i10;
    }

    @NotNull
    public final Object[] i() {
        return this.f12154b;
    }

    public final int indexOf(@Nullable Object obj) {
        return obj == null ? e.p(this) : e.n(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    @NotNull
    public final int[] k() {
        return this.f12153a;
    }

    public int l() {
        return this.f12155c;
    }

    public final int m() {
        return this.f12155c;
    }

    public final boolean n(@NotNull c<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int iM = array.m();
        int iM2 = m();
        for (int i10 = 0; i10 < iM; i10++) {
            remove(array.v(i10));
        }
        return iM2 != m();
    }

    public final E p(int i10) {
        int i11;
        Object[] objArr;
        int iM = m();
        E e10 = (E) i()[i10];
        if (iM <= 1) {
            clear();
            return e10;
        }
        int i12 = iM - 1;
        if (k().length <= 8 || m() >= k().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                ArraysKt.copyInto(k(), k(), i10, i13, iM);
                ArraysKt.copyInto(i(), i(), i10, i13, iM);
            }
            i()[i12] = null;
        } else {
            int iM2 = m() > 8 ? m() + (m() >> 1) : 8;
            int[] iArrK = k();
            Object[] objArrI = i();
            e.d(this, iM2);
            if (i10 > 0) {
                ArraysKt.copyInto$default(iArrK, k(), 0, 0, i10, 6, (Object) null);
                objArr = objArrI;
                ArraysKt.copyInto$default(objArr, i(), 0, 0, i10, 6, (Object) null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrI;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                ArraysKt.copyInto(iArrK, k(), i11, i14, iM);
                ArraysKt.copyInto(objArr, i(), i11, i14, iM);
            }
        }
        if (iM != m()) {
            throw new ConcurrentModificationException();
        }
        u(i12);
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        p(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int iM = m() - 1; -1 < iM; iM--) {
            if (!CollectionsKt.contains(elements, i()[iM])) {
                p(iM);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f12154b = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return l();
    }

    public final void t(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f12153a = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.f12154b, 0, this.f12155c);
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(m() * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int iM = m();
        for (int i10 = 0; i10 < iM; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eV = v(i10);
            if (eV != this) {
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

    public final void u(int i10) {
        this.f12155c = i10;
    }

    public final E v(int i10) {
        return (E) i()[i10];
    }

    @oj.j
    public c(int i10) {
        this.f12153a = t.a.f376158a;
        this.f12154b = t.a.f376160c;
        if (i10 > 0) {
            e.d(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] tArr = (T[]) d.a(array, this.f12155c);
        ArraysKt.copyInto(this.f12154b, tArr, 0, 0, this.f12155c);
        Intrinsics.checkNotNull(tArr);
        return tArr;
    }

    public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public c(@Nullable c<? extends E> cVar) {
        this(0);
        if (cVar != null) {
            c(cVar);
        }
    }

    public c(@Nullable Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Nullable E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator itA = kotlin.jvm.internal.i.a(eArr);
            while (itA.hasNext()) {
                add(itA.next());
            }
        }
    }
}
