package androidx.compose.runtime.collection;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1116:1\n1085#1,2:1117\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1107#1:1117,2\n*E\n"})
public final class e {
    public static final /* synthetic */ <T> d<T> a(int i10) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new d<>(new Object[i10], 0);
    }

    public static final /* synthetic */ <T> d<T> b(int i10, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.reifiedOperationMarker(0, androidx.exifinterface.media.a.f51379e5);
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = function1.invoke(Integer.valueOf(i11));
        }
        return new d<>(objArr, i10);
    }

    public static /* synthetic */ d c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new d(new Object[i10], 0);
    }

    public static final void d(@NotNull List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            h(i10, size);
        }
    }

    public static final void e(@NotNull List<?> list, int i10, int i11) {
        if (i10 > i11) {
            k(i10, i11);
        }
        if (i10 < 0) {
            i(i10);
        }
        if (i11 > list.size()) {
            j(i11, list.size());
        }
    }

    public static final /* synthetic */ <T> d<T> f() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new d<>(new Object[16], 0);
    }

    public static final /* synthetic */ <T> d<T> g(T... tArr) {
        return new d<>(tArr, tArr.length);
    }

    private static final void h(int i10, int i11) {
        throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + i11 + " elements.");
    }

    private static final void i(int i10) {
        throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
    }

    private static final void j(int i10, int i11) {
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + i11 + ')');
    }

    private static final void k(int i10, int i11) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
    }
}
