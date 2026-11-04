package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,101:1\n77#1,4:102\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n73#1:102,4\n*E\n"})
public final class e0 {

    public static final class a extends IntIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f48374b;

        a(SparseArray<T> sparseArray) {
            this.f48374b = sparseArray;
        }

        public final int b() {
            return this.f48373a;
        }

        public final void c(int i10) {
            this.f48373a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f48373a >= this.f48374b.size()) {
                return false;
            }
            int i10 = 3 | 1;
            return true;
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseArray<T> sparseArray = this.f48374b;
            int i10 = this.f48373a;
            this.f48373a = i10 + 1;
            return sparseArray.keyAt(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f48376b;

        b(SparseArray<T> sparseArray) {
            this.f48376b = sparseArray;
        }

        public final int b() {
            return this.f48375a;
        }

        public final void c(int i10) {
            this.f48375a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48375a < this.f48376b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f48376b;
            int i10 = this.f48375a;
            this.f48375a = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@NotNull SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean b(@NotNull SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean c(@NotNull SparseArray<T> sparseArray, T t10) {
        return sparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void d(@NotNull SparseArray<T> sparseArray, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(sparseArray.keyAt(i10)), sparseArray.valueAt(i10));
        }
    }

    public static final <T> T e(@NotNull SparseArray<T> sparseArray, int i10, T t10) {
        T t11 = sparseArray.get(i10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T f(@NotNull SparseArray<T> sparseArray, int i10, @NotNull Function0<? extends T> function0) {
        T tInvoke = sparseArray.get(i10);
        if (tInvoke == null) {
            tInvoke = function0.invoke();
        }
        return tInvoke;
    }

    public static final <T> int g(@NotNull SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean h(@NotNull SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@NotNull SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @NotNull
    public static final <T> IntIterator j(@NotNull SparseArray<T> sparseArray) {
        return new a(sparseArray);
    }

    @NotNull
    public static final <T> SparseArray<T> k(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), sparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean m(@NotNull SparseArray<T> sparseArray, int i10, T t10) {
        int iIndexOfKey = sparseArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(t10, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void n(@NotNull SparseArray<T> sparseArray, int i10, T t10) {
        sparseArray.put(i10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> o(@NotNull SparseArray<T> sparseArray) {
        return new b(sparseArray);
    }
}
