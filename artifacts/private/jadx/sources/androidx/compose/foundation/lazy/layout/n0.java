package androidx.compose.foundation.lazy.layout;

import androidx.collection.g3;
import androidx.compose.ui.layout.c3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n+ 3 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 4 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,174:1\n489#2:175\n301#3,7:176\n308#3,4:184\n1123#4:183\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy\n*L\n154#1:175\n154#1:176,7\n154#1:184,4\n154#1:183\n*E\n"})
final class n0 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f17476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.f2<Object> f17477b = androidx.collection.r2.d();

    public n0(@NotNull i0 i0Var) {
        this.f17476a = i0Var;
    }

    @Override // androidx.compose.ui.layout.c3
    public void a(@NotNull c3.a aVar) {
        this.f17477b.P();
        androidx.collection.i2<Object> i2VarK = aVar.k();
        Object[] objArr = i2VarK.f12498b;
        long[] jArr = i2VarK.f12499c;
        int i10 = i2VarK.f12501e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & g3.f12256c);
            Object obj = objArr[i10];
            Object objC = this.f17476a.c(obj);
            int iR = this.f17477b.r(objC, 0);
            if (iR == 7) {
                aVar.remove(obj);
            } else {
                this.f17477b.l0(objC, iR + 1);
            }
            i10 = i11;
        }
    }

    @Override // androidx.compose.ui.layout.c3
    public boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return Intrinsics.areEqual(this.f17476a.c(obj), this.f17476a.c(obj2));
    }
}
