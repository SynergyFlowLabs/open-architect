package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1903:1\n1#2:1904\n118#3,4:1905\n123#3,4:1915\n287#4,6:1909\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n*L\n1892#1:1905,4\n1892#1:1915,4\n1892#1:1909,6\n*E\n"})
final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, Object> f36313a = androidx.compose.runtime.collection.c.e(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, Object> f36314b = androidx.compose.runtime.collection.c.e(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(i3 i3Var, q3 q3Var) {
        return Intrinsics.areEqual(q3Var.a(), i3Var);
    }

    public final void b(@NotNull e3<Object> e3Var, @NotNull q3 q3Var) {
        androidx.compose.runtime.collection.c.a(this.f36313a, e3Var, q3Var);
        androidx.compose.runtime.collection.c.a(this.f36314b, q3Var.a(), e3Var);
    }

    public final void c() {
        androidx.compose.runtime.collection.c.c(this.f36313a);
        androidx.compose.runtime.collection.c.c(this.f36314b);
    }

    public final boolean d(@NotNull e3<Object> e3Var) {
        return androidx.compose.runtime.collection.c.f(this.f36313a, e3Var);
    }

    @Nullable
    public final q3 e(@NotNull e3<Object> e3Var) {
        q3 q3Var = (q3) androidx.compose.runtime.collection.c.o(this.f36313a, e3Var);
        if (androidx.compose.runtime.collection.c.l(this.f36313a)) {
            androidx.compose.runtime.collection.c.c(this.f36314b);
        }
        return q3Var;
    }

    public final void f(@NotNull final i3 i3Var) {
        Object objP = this.f36314b.p(i3Var);
        if (objP != null) {
            if (!(objP instanceof androidx.collection.g2)) {
                Intrinsics.checkNotNull(objP, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                androidx.compose.runtime.collection.c.p(this.f36313a, (e3) objP, new Function1() { // from class: androidx.compose.runtime.o3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(p3.g(i3Var, (q3) obj));
                    }
                });
                return;
            }
            androidx.collection.s2 s2Var = (androidx.collection.s2) objP;
            Object[] objArr = s2Var.f12449a;
            int i10 = s2Var.f12450b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                androidx.compose.runtime.collection.c.p(this.f36313a, (e3) obj, new Function1() { // from class: androidx.compose.runtime.o3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(p3.g(i3Var, (q3) obj2));
                    }
                });
            }
        }
    }
}
