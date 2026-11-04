package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.Unit;
import kotlin.collections.BooleanIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n78#1,4:104\n1#2:103\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n74#1:104,4\n*E\n"})
public final class f0 {

    public static final class a extends IntIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f48378b;

        a(SparseBooleanArray sparseBooleanArray) {
            this.f48378b = sparseBooleanArray;
        }

        public final int b() {
            return this.f48377a;
        }

        public final void c(int i10) {
            this.f48377a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48377a < this.f48378b.size();
        }

        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f48378b;
            int i10 = this.f48377a;
            this.f48377a = i10 + 1;
            return sparseBooleanArray.keyAt(i10);
        }
    }

    public static final class b extends BooleanIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SparseBooleanArray f48380b;

        b(SparseBooleanArray sparseBooleanArray) {
            this.f48380b = sparseBooleanArray;
        }

        public final int b() {
            return this.f48379a;
        }

        public final void c(int i10) {
            this.f48379a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48379a < this.f48380b.size();
        }

        @Override // kotlin.collections.BooleanIterator
        public boolean nextBoolean() {
            SparseBooleanArray sparseBooleanArray = this.f48380b;
            int i10 = this.f48379a;
            this.f48379a = i10 + 1;
            return sparseBooleanArray.valueAt(i10);
        }
    }

    public static final boolean a(@NotNull SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@NotNull SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@NotNull SparseBooleanArray sparseBooleanArray, boolean z10) {
        return sparseBooleanArray.indexOfValue(z10) >= 0;
    }

    public static final void d(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull Function2<? super Integer, ? super Boolean, Unit> function2) {
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i10)), Boolean.valueOf(sparseBooleanArray.valueAt(i10)));
        }
    }

    public static final boolean e(@NotNull SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        return sparseBooleanArray.get(i10, z10);
    }

    public static final boolean f(@NotNull SparseBooleanArray sparseBooleanArray, int i10, @NotNull Function0<Boolean> function0) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : function0.invoke().booleanValue();
    }

    public static final int g(@NotNull SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean h(@NotNull SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@NotNull SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @NotNull
    public static final IntIterator j(@NotNull SparseBooleanArray sparseBooleanArray) {
        return new a(sparseBooleanArray);
    }

    @NotNull
    public static final SparseBooleanArray k(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(@NotNull SparseBooleanArray sparseBooleanArray, @NotNull SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i10), sparseBooleanArray2.valueAt(i10));
        }
    }

    public static final boolean m(@NotNull SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || z10 != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i10);
        return true;
    }

    public static final void n(@NotNull SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        sparseBooleanArray.put(i10, z10);
    }

    @NotNull
    public static final BooleanIterator o(@NotNull SparseBooleanArray sparseBooleanArray) {
        return new b(sparseBooleanArray);
    }
}
