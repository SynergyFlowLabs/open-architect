package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35675a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35676b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35677c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35678d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35679e = 30;

    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] g(Object[] objArr, int i10, K k10, V v10) {
        Object[] objArr2 = new Object[objArr.length + 2];
        int i11 = 3 | 0;
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = k10;
        objArr2[i10 + 1] = v10;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i10, int i11, u<?, ?> uVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        ArraysKt.copyInto(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = uVar;
        ArraysKt.copyInto(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] k(Object[] objArr, int i10, int i11, K k10, V v10) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        ArraysKt.copyInto(objArrCopyOf, objArrCopyOf, i10 + 2, i10 + 1, objArr.length);
        ArraysKt.copyInto(objArrCopyOf, objArrCopyOf, i11 + 2, i11, i10);
        objArrCopyOf[i11] = k10;
        objArrCopyOf[i11 + 1] = v10;
        return objArrCopyOf;
    }
}
