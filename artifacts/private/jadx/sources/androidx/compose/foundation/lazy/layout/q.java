package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,110:1\n1107#2:111\n1085#2,2:112\n1#3:114\n519#4:115\n424#4,8:116\n424#4,8:128\n97#5,4:124\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n48#1:111\n48#1:112,2\n69#1:115\n75#1:116,8\n88#1:128,8\n80#1:124,4\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17527b = androidx.compose.runtime.collection.d.f35551d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<a> f17528a = new androidx.compose.runtime.collection.d<>(new a[16], 0);

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,110:1\n97#2,4:111\n97#2,4:115\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n*L\n105#1:111,4\n106#1:115,4\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f17529c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17531b;

        public a(int i10, int i11) {
            this.f17530a = i10;
            this.f17531b = i11;
            if (!(i10 >= 0)) {
                androidx.compose.foundation.internal.e.g("negative start index");
            }
            if (!(i11 >= i10)) {
                androidx.compose.foundation.internal.e.g("end index greater than start");
            }
        }

        public static /* synthetic */ a d(a aVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = aVar.f17530a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f17531b;
            }
            return aVar.c(i10, i11);
        }

        public final int a() {
            return this.f17530a;
        }

        public final int b() {
            return this.f17531b;
        }

        @NotNull
        public final a c(int i10, int i11) {
            return new a(i10, i11);
        }

        public final int e() {
            return this.f17531b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f17530a == aVar.f17530a && this.f17531b == aVar.f17531b) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f17530a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f17530a) * 31) + Integer.hashCode(this.f17531b);
        }

        @NotNull
        public String toString() {
            return "Interval(start=" + this.f17530a + ", end=" + this.f17531b + ')';
        }
    }

    @NotNull
    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f17528a.d(aVar);
        return aVar;
    }

    public final int b() {
        int iE = this.f17528a.z().e();
        androidx.compose.runtime.collection.d<a> dVar = this.f17528a;
        a[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            a aVar = aVarArr[i10];
            if (aVar.e() > iE) {
                iE = aVar.e();
            }
        }
        return iE;
    }

    public final int c() {
        int iF = this.f17528a.z().f();
        androidx.compose.runtime.collection.d<a> dVar = this.f17528a;
        a[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            a aVar = aVarArr[i10];
            if (aVar.f() < iF) {
                iF = aVar.f();
            }
        }
        if (!(iF >= 0)) {
            androidx.compose.foundation.internal.e.g("negative minIndex");
        }
        return iF;
    }

    public final boolean d() {
        return this.f17528a.R() != 0;
    }

    public final void e(@NotNull a aVar) {
        this.f17528a.n0(aVar);
    }
}
