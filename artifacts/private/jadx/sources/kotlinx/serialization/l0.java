package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.d2;
import kotlinx.serialization.internal.e2;
import kotlinx.serialization.internal.w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,79:1\n78#1:81\n78#1:82\n78#2:80\n78#2:83\n78#2:84\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n*L\n22#1:81\n28#1:82\n54#1:80\n28#1:83\n45#1:84\n*E\n"})
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final w2<? extends Object> f316077a = kotlinx.serialization.internal.o.a(new Function1() { // from class: kotlinx.serialization.f0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return l0.k((kotlin.reflect.d) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final w2<Object> f316078b = kotlinx.serialization.internal.o.a(new Function1() { // from class: kotlinx.serialization.g0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return l0.l((kotlin.reflect.d) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final d2<? extends Object> f316079c = kotlinx.serialization.internal.o.b(new Function2() { // from class: kotlinx.serialization.h0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.g((kotlin.reflect.d) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d2<Object> f316080d = kotlinx.serialization.internal.o.b(new Function2() { // from class: kotlinx.serialization.i0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.i((kotlin.reflect.d) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer g(kotlin.reflect.d clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> listU = m0.u(kotlinx.serialization.modules.h.a(), types, true);
        Intrinsics.checkNotNull(listU);
        return m0.f(clazz, listU, new Function0() { // from class: kotlinx.serialization.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.h(types);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.g h(List list) {
        return ((kotlin.reflect.s) list.get(0)).J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer i(kotlin.reflect.d clazz, final List types) {
        KSerializer kSerializerV;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> listU = m0.u(kotlinx.serialization.modules.h.a(), types, true);
        Intrinsics.checkNotNull(listU);
        KSerializer<? extends Object> kSerializerF = m0.f(clazz, listU, new Function0() { // from class: kotlinx.serialization.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.j(types);
            }
        });
        if (kSerializerF == null || (kSerializerV = hk.a.v(kSerializerF)) == null) {
            return null;
        }
        return kSerializerV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.g j(List list) {
        return ((kotlin.reflect.s) list.get(0)).J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer k(kotlin.reflect.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer kSerializerQ = m0.q(it);
        if (kSerializerQ != null) {
            return kSerializerQ;
        }
        if (e2.n(it)) {
            return new p(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer l(kotlin.reflect.d it) {
        KSerializer kSerializerV;
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer kSerializerQ = m0.q(it);
        if (kSerializerQ == null) {
            kSerializerQ = e2.n(it) ? new p(it) : null;
        }
        if (kSerializerQ == null || (kSerializerV = hk.a.v(kSerializerQ)) == null) {
            return null;
        }
        return kSerializerV;
    }

    @Nullable
    public static final KSerializer<Object> m(@NotNull kotlin.reflect.d<Object> clazz, boolean z10) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z10) {
            return f316078b.a(clazz);
        }
        KSerializer<? extends Object> kSerializerA = f316077a.a(clazz);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        return null;
    }

    @NotNull
    public static final Object n(@NotNull kotlin.reflect.d<Object> clazz, @NotNull List<? extends kotlin.reflect.s> types, boolean z10) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z10 ? f316079c.a(clazz, types) : f316080d.a(clazz, types);
    }

    private static /* synthetic */ void o() {
    }

    private static /* synthetic */ void p() {
    }

    @NotNull
    public static final w2<? extends Object> q() {
        return f316077a;
    }

    public static /* synthetic */ void r() {
    }

    private static /* synthetic */ void s() {
    }

    @Nullable
    public static final p<? extends Object> t(@NotNull kotlin.reflect.d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (e2.n(dVar)) {
            return new p<>(dVar);
        }
        return null;
    }
}
