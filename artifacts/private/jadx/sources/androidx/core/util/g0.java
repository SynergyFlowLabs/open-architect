package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n72#1:102,4\n*E\n"})
public final class g0 {

    public static final class a extends IntIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f48383b;

        a(SparseIntArray sparseIntArray) {
            this.f48383b = sparseIntArray;
        }

        public final int b() {
            return this.f48382a;
        }

        public final void c(int i10) {
            this.f48382a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48382a < this.f48383b.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f48383b;
            int i10 = this.f48382a;
            this.f48382a = i10 + 1;
            return sparseIntArray.keyAt(i10);
        }
    }

    public static final class b extends IntIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseIntArray f48385b;

        b(SparseIntArray sparseIntArray) {
            this.f48385b = sparseIntArray;
        }

        public final int b() {
            return this.f48384a;
        }

        public final void c(int i10) {
            this.f48384a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48384a < this.f48385b.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f48385b;
            int i10 = this.f48384a;
            this.f48384a = i10 + 1;
            return sparseIntArray.valueAt(i10);
        }
    }

    public static final boolean a(@NotNull SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@NotNull SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@NotNull SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfValue(i10) >= 0;
    }

    public static final void d(@NotNull SparseIntArray sparseIntArray, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        int size = sparseIntArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(sparseIntArray.keyAt(i10)), Integer.valueOf(sparseIntArray.valueAt(i10)));
        }
    }

    public static final int e(@NotNull SparseIntArray sparseIntArray, int i10, int i11) {
        return sparseIntArray.get(i10, i11);
    }

    public static final int f(@NotNull SparseIntArray sparseIntArray, int i10, @NotNull Function0<Integer> function0) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : function0.invoke().intValue();
    }

    public static final int g(@NotNull SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean h(@NotNull SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@NotNull SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    @NotNull
    public static final IntIterator j(@NotNull SparseIntArray sparseIntArray) {
        return new a(sparseIntArray);
    }

    @NotNull
    public static final SparseIntArray k(@NotNull SparseIntArray sparseIntArray, @NotNull SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void l(@NotNull SparseIntArray sparseIntArray, @NotNull SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i10), sparseIntArray2.valueAt(i10));
        }
    }

    public static final boolean m(@NotNull SparseIntArray sparseIntArray, int i10, int i11) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || i11 != sparseIntArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void n(@NotNull SparseIntArray sparseIntArray, int i10, int i11) {
        sparseIntArray.put(i10, i11);
    }

    @NotNull
    public static final IntIterator o(@NotNull SparseIntArray sparseIntArray) {
        return new b(sparseIntArray);
    }
}
