package io.ktor.client.engine;

import fi.z;
import io.ktor.http.d1;
import io.ktor.http.x2;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngineKt\n+ 2 Utils.kt\nio/ktor/client/engine/UtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,239:1\n101#2,11:240\n774#3:251\n865#3,2:252\n21#4:254\n65#5,18:255\n*S KotlinDebug\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngineKt\n*L\n222#1:240,11\n232#1:251\n232#1:252,2\n20#1:254\n20#1:255,18\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final r0 f294346a = new r0("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<io.ktor.client.j<?>> f294347b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements l<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<T> f294348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f294349b;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? extends T> lVar, Function1<? super T, Unit> function1) {
            this.f294348a = lVar;
            this.f294349b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, Function1 function2, j create) {
            Intrinsics.checkNotNullParameter(create, "$this$create");
            function1.invoke(create);
            function2.invoke(create);
            return Unit.f312394a;
        }

        @Override // io.ktor.client.engine.l
        public b a(final Function1<? super T, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            l<T> lVar = this.f294348a;
            final Function1<T, Unit> function1 = this.f294349b;
            return lVar.a(new Function1() { // from class: io.ktor.client.engine.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n.a.c(function1, block, (j) obj);
                }
            });
        }
    }

    static {
        kotlin.reflect.s sVarB;
        kotlin.reflect.d dVarD = j1.d(io.ktor.client.j.class);
        try {
            sVarB = j1.B(io.ktor.client.j.class, KTypeProjection.f312969c.c());
        } catch (Throwable unused) {
            sVarB = null;
        }
        f294347b = new io.ktor.util.a<>("client-config", new ri.b(dVarD, sVarB));
    }

    @NotNull
    public static final <T extends j> l<T> b(@NotNull l<? extends T> lVar, @NotNull Function1<? super T, Unit> nested) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(nested, "nested");
        return new a(lVar, nested);
    }

    @Nullable
    public static final Object c(@NotNull b bVar, @NotNull p2 p2Var, @NotNull kotlin.coroutines.d<? super CoroutineContext> dVar) {
        a0 a0VarA = s2.a(p2Var);
        CoroutineContext coroutineContextPlus = bVar.getCoroutineContext().plus(a0VarA).plus(f294346a);
        p2 p2Var2 = (p2) dVar.getContext().get(p2.M2);
        if (p2Var2 == null) {
            return coroutineContextPlus;
        }
        a0VarA.E(new v.a(p2.a.g(p2Var2, true, false, new v.b(a0VarA), 2, null)));
        return coroutineContextPlus;
    }

    @NotNull
    public static final r0 d() {
        return f294346a;
    }

    @NotNull
    public static final io.ktor.util.a<io.ktor.client.j<?>> e() {
        return f294347b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(z zVar) {
        Set<String> setNames = zVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (d1.f295782a.J0().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new x2(arrayList.toString());
        }
    }
}
