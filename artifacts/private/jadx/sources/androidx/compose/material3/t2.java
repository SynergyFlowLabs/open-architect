package androidx.compose.material3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@af
public interface t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33057a = a.f33058a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f33058a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.runtime.saveable.c0<t2, ?> f33059b = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.r2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t2.a.c((androidx.compose.runtime.saveable.g0) obj, (t2) obj2);
            }
        }, new Function1() { // from class: androidx.compose.material3.s2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t2.a.d((List) obj);
            }
        });

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List c(androidx.compose.runtime.saveable.g0 g0Var, t2 t2Var) {
            return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(t2Var.b()), Float.valueOf(t2Var.d()), Float.valueOf(t2Var.e())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t2 d(List list) {
            return o1.V(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<t2, ?> e() {
            return f33059b;
        }
    }

    float a();

    float b();

    void c(float f10);

    float d();

    float e();

    void f(float f10);

    void g(float f10);
}
