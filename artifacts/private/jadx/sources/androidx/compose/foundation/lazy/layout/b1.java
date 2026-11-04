package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasuredItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public abstract class b1<T extends y0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17333b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<List<androidx.compose.ui.layout.i2>> f17334a = androidx.collection.k0.j();

    @NotNull
    public abstract T a(int i10, int i11, int i12, long j10);

    @NotNull
    public final List<androidx.compose.ui.layout.i2> b(@NotNull w0 w0Var, int i10, long j10) {
        List<androidx.compose.ui.layout.i2> listN = this.f17334a.n(i10);
        if (listN != null) {
            return listN;
        }
        List<androidx.compose.ui.layout.z0> listG8 = w0Var.g8(i10);
        int size = listG8.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listG8.get(i11).P0(j10));
        }
        this.f17334a.j0(i10, arrayList);
        return arrayList;
    }
}
