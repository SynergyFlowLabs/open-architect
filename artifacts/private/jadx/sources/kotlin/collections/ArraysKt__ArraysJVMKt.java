package kotlin.collections;

import androidx.exifinterface.media.a;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.a1;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class ArraysKt__ArraysJVMKt {
    @NotNull
    public static final <T> T[] arrayOfNulls(@NotNull T[] reference, int i10) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @a1
    @e1(version = "1.3")
    @i(name = "contentDeepHashCode")
    public static <T> int contentDeepHashCode(@Nullable T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @e1(version = "1.3")
    public static final void copyOfRangeToIndexCheck(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static final /* synthetic */ <T> T[] orEmpty(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        Intrinsics.reifiedOperationMarker(0, a.f51379e5);
        return (T[]) new Object[0];
    }

    @f
    private static final String toString(byte[] bArr, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] toTypedArray(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
