package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35711a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35712b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35713c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35714d = 30;

    public static final class a implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35715a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj != e.f35702d.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] c(Object[] objArr, int i10, E e10) {
        Object[] objArr2 = new Object[objArr.length + 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i10 + 1, i10, objArr.length);
        objArr2[i10] = e10;
        return objArr2;
    }

    private static final int d(Object[] objArr, Object[] objArr2, int i10, Function1<Object, Boolean> function1) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length) {
            i0.a.a(i12 <= i11);
            if (function1.invoke(objArr[i11]).booleanValue()) {
                objArr2[i10 + i12] = objArr[i11];
                i12++;
                i0.a.a(i10 + i12 <= objArr2.length);
            }
            i11++;
        }
        return i12;
    }

    static /* synthetic */ int e(Object[] objArr, Object[] objArr2, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            function1 = a.f35715a;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < objArr.length) {
            i0.a.a(i13 <= i12);
            if (((Boolean) function1.invoke(objArr[i12])).booleanValue()) {
                objArr2[i10 + i13] = objArr[i12];
                i13++;
                i0.a.a(i10 + i13 <= objArr2.length);
            }
            i12++;
        }
        return i13;
    }

    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] g(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }
}
