package i0;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f286701a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f286702b = 0;

    private e() {
    }

    @n
    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }
    }

    @n
    public static final void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }
    }

    @n
    public static final void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
        }
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
    }

    @n
    public static final boolean d(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @n
    public static final int e(@NotNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
