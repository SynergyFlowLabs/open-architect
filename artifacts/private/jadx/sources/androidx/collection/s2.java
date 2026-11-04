package androidx.collection;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1548:1\n287#1,6:1549\n315#1,6:1555\n287#1,6:1563\n287#1,6:1569\n287#1,6:1575\n287#1,6:1581\n287#1,6:1587\n301#1,6:1593\n315#1,6:1599\n329#1,6:1605\n80#1:1611\n301#1,6:1612\n301#1,6:1618\n301#1,6:1624\n329#1,6:1630\n80#1:1636\n315#1,6:1637\n80#1:1643\n315#1,6:1644\n329#1,6:1650\n329#1,6:1656\n301#1,6:1662\n287#1,6:1668\n84#1:1674\n1855#2,2:1561\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n99#1:1549,6\n113#1:1555,6\n162#1:1563,6\n177#1:1569,6\n201#1:1575,6\n216#1:1581,6\n232#1:1587,6\n246#1:1593,6\n262#1:1599,6\n276#1:1605,6\n359#1:1611\n386#1:1612,6\n392#1:1618,6\n408#1:1624,6\n422#1:1630,6\n444#1:1636\n456#1:1637,6\n465#1:1643\n475#1:1644,6\n492#1:1650,6\n498#1:1656,6\n528#1:1662,6\n557#1:1668,6\n571#1:1674\n153#1:1561,2\n*E\n"})
public abstract class s2<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public int f12450b;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<E, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s2<E> f12451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s2<E> s2Var) {
            super(1);
            this.f12451a = s2Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(E e10) {
            return e10 == this.f12451a ? "(this)" : String.valueOf(e10);
        }
    }

    public /* synthetic */ s2(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @kotlin.a1
    public static /* synthetic */ void D() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String Q(s2 s2Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return s2Var.P(charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    @kotlin.a1
    public static /* synthetic */ void z() {
    }

    @NotNull
    public final IntRange A() {
        return kotlin.ranges.r.W1(0, this.f12450b);
    }

    @androidx.annotation.g0(from = -1)
    public final int B() {
        return this.f12450b - 1;
    }

    @androidx.annotation.g0(from = 0)
    public final int C() {
        return this.f12450b;
    }

    public final int E(E e10) {
        int i10 = 0;
        if (e10 == null) {
            Object[] objArr = this.f12449a;
            int i11 = this.f12450b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
        } else {
            Object[] objArr2 = this.f12449a;
            int i12 = this.f12450b;
            while (i10 < i12) {
                if (e10.equals(objArr2[i10])) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public final int F(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int G(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i10]).booleanValue());
        return i10;
    }

    public final boolean H() {
        return this.f12450b == 0;
    }

    public final boolean I() {
        return this.f12450b != 0;
    }

    @oj.j
    @NotNull
    public final String J() {
        return Q(this, null, null, null, 0, null, null, 63, null);
    }

    @oj.j
    @NotNull
    public final String K(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        int i10 = 4 | 0;
        return Q(this, separator, null, null, 0, null, null, 62, null);
    }

    @oj.j
    @NotNull
    public final String L(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return Q(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @oj.j
    @NotNull
    public final String M(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return Q(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @oj.j
    @NotNull
    public final String N(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return Q(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @oj.j
    @NotNull
    public final String O(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return Q(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @oj.j
    @NotNull
    public final String P(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super E, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f12449a;
        int i11 = this.f12450b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            if (function1 == null) {
                sb2.append(obj);
            } else {
                sb2.append(function1.invoke(obj));
            }
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final E R() {
        if (H()) {
            t.f.f("ObjectList is empty.");
        }
        return (E) this.f12449a[this.f12450b - 1];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    public final E S(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        for (int i10 = this.f12450b - 1; -1 < i10; i10--) {
            ?? r10 = (Object) objArr[i10];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final int T(E e10) {
        if (e10 == null) {
            Object[] objArr = this.f12449a;
            for (int i10 = this.f12450b - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            Object[] objArr2 = this.f12449a;
            for (int i11 = this.f12450b - 1; -1 < i11; i11--) {
                if (e10.equals(objArr2[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @Nullable
    public final E U() {
        if (H()) {
            return null;
        }
        return (E) this.f12449a[this.f12450b - 1];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    @Nullable
    public final E V(@NotNull Function1<? super E, Boolean> predicate) {
        ?? r10;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        do {
            i10--;
            if (-1 >= i10) {
                return null;
            }
            r10 = (Object) objArr[i10];
        } while (!predicate.invoke(r10).booleanValue());
        return r10;
    }

    public final boolean W() {
        return H();
    }

    public final boolean X(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        for (int i10 = this.f12450b - 1; -1 < i10; i10--) {
            if (predicate.invoke(objArr[i10]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void Y(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i10);
        sb2.append(" must be in 0..");
        sb2.append(this.f12450b - 1);
        t.f.e(sb2.toString());
    }

    public final boolean a() {
        return I();
    }

    public final boolean b(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public abstract List<E> c();

    public final boolean d(E e10) {
        return E(e10) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(@NotNull s2<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f12449a;
        int i10 = elements.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(objArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof s2) {
            s2 s2Var = (s2) obj;
            int i10 = s2Var.f12450b;
            int i11 = this.f12450b;
            if (i10 == i11) {
                Object[] objArr = this.f12449a;
                Object[] objArr2 = s2Var.f12449a;
                IntRange intRangeW1 = kotlin.ranges.r.W1(0, i11);
                int iL = intRangeW1.l();
                int iM = intRangeW1.m();
                if (iL <= iM) {
                    while (Intrinsics.areEqual(objArr[iL], objArr2[iL])) {
                        if (iL != iM) {
                            iL++;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!d(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!d(elements.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e10 : elements) {
            if (!d(e10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        return this.f12450b;
    }

    public final int j(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(objArr[i12]).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final E k(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12450b) {
            Y(i10);
        }
        return (E) this.f12449a[i10];
    }

    public final E l(@androidx.annotation.g0(from = 0) int i10, @NotNull Function1<? super Integer, ? extends E> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f12450b) ? defaultValue.invoke(Integer.valueOf(i10)) : (E) this.f12449a[i10];
    }

    public final E m() {
        if (H()) {
            t.f.f("ObjectList is empty.");
        }
        return (E) this.f12449a[0];
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    public final E n(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r10 = (Object) objArr[i11];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @Nullable
    public final E o() {
        if (H()) {
            return null;
        }
        return y(0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    @Nullable
    public final E p(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r10 = (Object) objArr[i11];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        return null;
    }

    public final <R> R q(R r10, @NotNull Function2<? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R r(R r10, @NotNull pj.n<? super Integer, ? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R s(R r10, @NotNull Function2<? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(objArr[i10], r10);
        }
    }

    public final <R> R t(R r10, @NotNull pj.n<? super Integer, ? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), objArr[i10], r10);
        }
    }

    @NotNull
    public String toString() {
        return Q(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    public final void u(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(objArr[i11]);
        }
    }

    public final void v(@NotNull Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), objArr[i11]);
        }
    }

    public final void w(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12449a;
        int i10 = this.f12450b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(objArr[i10]);
            }
        }
    }

    public final void x(@NotNull Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12449a;
        for (int i10 = this.f12450b - 1; -1 < i10; i10--) {
            block.invoke(Integer.valueOf(i10), objArr[i10]);
        }
    }

    public final E y(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12450b) {
            Y(i10);
        }
        return (E) this.f12449a[i10];
    }

    private s2(int i10) {
        this.f12449a = i10 == 0 ? t2.f12459a : new Object[i10];
    }
}
