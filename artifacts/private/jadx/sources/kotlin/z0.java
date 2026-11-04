package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 {
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <V> V a(kotlin.reflect.p<? extends V> pVar, Object obj, kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return pVar.get();
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, V> V b(kotlin.reflect.q<T, ? extends V> qVar, T t10, kotlin.reflect.o<?> property) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return qVar.get(t10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <V> void c(kotlin.reflect.k<V> kVar, Object obj, kotlin.reflect.o<?> property, V v10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        kVar.set(v10);
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, V> void d(kotlin.reflect.l<T, V> lVar, T t10, kotlin.reflect.o<?> property, V v10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        lVar.set(t10, v10);
    }
}
