package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n51#2,4:94\n354#3,5:98\n1#4:103\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n62#1:94,4\n89#1:98,5\n*E\n"})
public final class l2 implements o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17468e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.q2<Object> f17469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object[] f17470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17471d;

    public l2(@NotNull IntRange intRange, @NotNull y<?> yVar) {
        m<Interval> mVarE = yVar.E();
        final int iL = intRange.l();
        if (!(iL >= 0)) {
            androidx.compose.foundation.internal.e.i("negative nearestRange.first");
        }
        final int iMin = Math.min(intRange.m(), mVarE.getSize() - 1);
        if (iMin < iL) {
            this.f17469b = androidx.collection.r2.c();
            this.f17470c = new Object[0];
            this.f17471d = 0;
        } else {
            int i10 = (iMin - iL) + 1;
            this.f17470c = new Object[i10];
            this.f17471d = iL;
            final androidx.collection.f2 f2Var = new androidx.collection.f2(i10);
            mVarE.b(iL, iMin, new Function1() { // from class: androidx.compose.foundation.lazy.layout.k2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l2.a(iL, iMin, f2Var, this, (m.a) obj);
                }
            });
            this.f17469b = f2Var;
        }
    }

    public static Unit a(int i10, int i11, androidx.collection.f2 f2Var, l2 l2Var, m.a aVar) {
        Object objA;
        Function1<Integer, Object> key = ((y.a) aVar.c()).getKey();
        int iMax = Math.max(i10, aVar.b());
        int iMin = Math.min(i11, (aVar.b() + aVar.a()) - 1);
        if (iMax <= iMin) {
            while (true) {
                if (key == null || (objA = key.invoke(Integer.valueOf(iMax - aVar.b()))) == null) {
                    objA = i2.a(iMax);
                }
                f2Var.l0(objA, iMax);
                l2Var.f17470c[iMax - l2Var.f17471d] = objA;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.foundation.lazy.layout.o0
    public int c(@NotNull Object obj) {
        androidx.collection.q2<Object> q2Var = this.f17469b;
        int i10 = q2Var.i(obj);
        if (i10 >= 0) {
            return q2Var.f12438c[i10];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.o0
    @Nullable
    public Object d(int i10) {
        Object[] objArr = this.f17470c;
        int i11 = i10 - this.f17471d;
        if (i11 < 0 || i11 >= objArr.length) {
            return null;
        }
        return objArr[i11];
    }
}
