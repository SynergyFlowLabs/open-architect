package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n72#1:102,4\n*E\n"})
public final class h0 {

    public static final class a extends IntIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f48388b;

        a(SparseLongArray sparseLongArray) {
            this.f48388b = sparseLongArray;
        }

        public final int b() {
            return this.f48387a;
        }

        public final void c(int i10) {
            this.f48387a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48387a < this.f48388b.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f48388b;
            int i10 = this.f48387a;
            this.f48387a = i10 + 1;
            return sparseLongArray.keyAt(i10);
        }
    }

    public static final class b extends LongIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseLongArray f48390b;

        b(SparseLongArray sparseLongArray) {
            this.f48390b = sparseLongArray;
        }

        public final int b() {
            return this.f48389a;
        }

        public final void c(int i10) {
            this.f48389a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48389a < this.f48390b.size();
        }

        @Override // kotlin.collections.LongIterator
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f48390b;
            int i10 = this.f48389a;
            this.f48389a = i10 + 1;
            return sparseLongArray.valueAt(i10);
        }
    }

    public static final boolean a(@NotNull SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@NotNull SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@NotNull SparseLongArray sparseLongArray, long j10) {
        return sparseLongArray.indexOfValue(j10) >= 0;
    }

    public static final void d(@NotNull SparseLongArray sparseLongArray, @NotNull Function2<? super Integer, ? super Long, Unit> function2) {
        int size = sparseLongArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(sparseLongArray.keyAt(i10)), Long.valueOf(sparseLongArray.valueAt(i10)));
        }
    }

    public static final long e(@NotNull SparseLongArray sparseLongArray, int i10, long j10) {
        return sparseLongArray.get(i10, j10);
    }

    public static final long f(@NotNull SparseLongArray sparseLongArray, int i10, @NotNull Function0<Long> function0) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : function0.invoke().longValue();
    }

    public static final int g(@NotNull SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean h(@NotNull SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean i(@NotNull SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @NotNull
    public static final IntIterator j(@NotNull SparseLongArray sparseLongArray) {
        return new a(sparseLongArray);
    }

    @NotNull
    public static final SparseLongArray k(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void l(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i10), sparseLongArray2.valueAt(i10));
        }
    }

    public static final boolean m(@NotNull SparseLongArray sparseLongArray, int i10, long j10) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || j10 != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void n(@NotNull SparseLongArray sparseLongArray, int i10, long j10) {
        sparseLongArray.put(i10, j10);
    }

    @NotNull
    public static final LongIterator o(@NotNull SparseLongArray sparseLongArray) {
        return new b(sparseLongArray);
    }
}
