package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n165#1,4:212\n165#1,4:216\n165#1,4:226\n1107#2:205\n1085#2,2:206\n97#3,4:208\n97#3,4:220\n472#4:224\n472#4:225\n472#4:230\n1#5:231\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n133#1:212,4\n134#1:216,4\n150#1:226,4\n94#1:205\n94#1:206,2\n112#1:208,4\n135#1:220,4\n140#1:224\n142#1:225\n159#1:230\n*E\n"})
public final class j2<T> implements m<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17448d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<m.a<T>> f17449a = new androidx.compose.runtime.collection.d<>(new m.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private m.a<? extends T> f17451c;

    private final void d(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            androidx.compose.foundation.internal.e.k("Index " + i10 + ", size " + getSize());
        }
    }

    private final boolean e(m.a<? extends T> aVar, int i10) {
        return i10 < aVar.b() + aVar.a() && aVar.b() <= i10;
    }

    private final m.a<T> f(int i10) {
        m.a<? extends T> aVar = this.f17451c;
        if (aVar != null && e(aVar, i10)) {
            return aVar;
        }
        androidx.compose.runtime.collection.d<m.a<T>> dVar = this.f17449a;
        m.a aVar2 = (m.a<? extends T>) dVar.f35552a[n.b(dVar, i10)];
        this.f17451c = aVar2;
        return aVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    public void b(int i10, int i11, @NotNull Function1<? super m.a<? extends T>, Unit> function1) {
        if (i10 < 0 || i10 >= getSize()) {
            androidx.compose.foundation.internal.e.k("Index " + i10 + ", size " + getSize());
        }
        if (i11 < 0 || i11 >= getSize()) {
            androidx.compose.foundation.internal.e.k("Index " + i11 + ", size " + getSize());
        }
        if (!(i11 >= i10)) {
            androidx.compose.foundation.internal.e.g("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')');
        }
        int iB = n.b(this.f17449a, i10);
        int iB2 = this.f17449a.f35552a[iB].b();
        while (iB2 <= i11) {
            m.a<T> aVar = this.f17449a.f35552a[iB];
            function1.invoke(aVar);
            iB2 += aVar.a();
            iB++;
        }
    }

    public final void c(int i10, T t10) {
        if (!(i10 >= 0)) {
            androidx.compose.foundation.internal.e.g("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        m.a<T> aVar = new m.a<>(getSize(), i10, t10);
        this.f17450b = getSize() + i10;
        this.f17449a.d(aVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    @NotNull
    public m.a<T> get(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            androidx.compose.foundation.internal.e.k("Index " + i10 + ", size " + getSize());
        }
        return f(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.m
    public int getSize() {
        return this.f17450b;
    }
}
