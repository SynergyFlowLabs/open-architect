package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f72791a = new z();

    private z() {
    }

    private final void a(androidx.recyclerview.widget.v vVar, int i10, int i11, int i12, int i13, Object obj) {
        int i14 = i10 - i12;
        if (i14 > 0) {
            vVar.a(i12, i14, obj);
        }
        int i15 = i13 - i11;
        if (i15 > 0) {
            vVar.a(i11, i15, obj);
        }
    }

    public final <T> void b(@NotNull androidx.recyclerview.widget.v callback, @NotNull l2<T> oldList, @NotNull l2<T> newList) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        int iMax = Math.max(oldList.i(), newList.i());
        int iMin = Math.min(oldList.i() + oldList.c(), newList.i() + newList.c());
        int i10 = iMin - iMax;
        if (i10 > 0) {
            callback.c(iMax, i10);
            callback.b(iMax, i10);
        }
        int iMin2 = Math.min(iMax, iMin);
        int iMax2 = Math.max(iMax, iMin);
        a(callback, iMin2, iMax2, kotlin.ranges.r.B(oldList.i(), newList.getSize()), kotlin.ranges.r.B(oldList.i() + oldList.c(), newList.getSize()), y.ITEM_TO_PLACEHOLDER);
        a(callback, iMin2, iMax2, kotlin.ranges.r.B(newList.i(), oldList.getSize()), kotlin.ranges.r.B(newList.i() + newList.c(), oldList.getSize()), y.PLACEHOLDER_TO_ITEM);
        int size = newList.getSize() - oldList.getSize();
        if (size > 0) {
            callback.b(oldList.getSize(), size);
        } else if (size < 0) {
            callback.c(oldList.getSize() + size, -size);
        }
    }
}
