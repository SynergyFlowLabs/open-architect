package io.ktor.client.engine;

import io.ktor.http.content.w;
import io.ktor.http.d1;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.util.g1;
import io.ktor.utils.io.o0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nio/ktor/client/engine/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1#2:115\n1869#3,2:116\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nio/ktor/client/engine/UtilsKt\n*L\n51#1:116,2\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f294362a = "ktor-client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<String> f294363b;

    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1 f294364a;

        public a(o1 o1Var) {
            this.f294364a = o1Var;
        }

        public final void c(Throwable th2) {
            this.f294364a.dispose();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    public static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p2 f294365a;

        public b(p2 p2Var) {
            this.f294365a = p2Var;
        }

        public final void c(Throwable th2) {
            if (th2 == null) {
                return;
            }
            this.f294365a.e(new CancellationException(th2.getMessage()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    static {
        d1 d1Var = d1.f295782a;
        f294363b = SetsKt.setOf((Object[]) new String[]{d1Var.G(), d1Var.L(), d1Var.X(), d1Var.S(), d1Var.W()});
    }

    @Nullable
    public static final Object c(@NotNull p2 p2Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        p2 p2Var2 = (p2) dVar.getContext().get(p2.M2);
        if (p2Var2 == null) {
            return Unit.f312394a;
        }
        p2Var.E(new a(p2.a.g(p2Var2, true, false, new b(p2Var), 2, null)));
        return Unit.f312394a;
    }

    private static final Object d(p2 p2Var, kotlin.coroutines.d<? super Unit> dVar) {
        h0.e(3);
        throw null;
    }

    @o0
    @Nullable
    public static final Object e(@NotNull kotlin.coroutines.d<? super CoroutineContext> dVar) {
        CoroutineContext.Element element = dVar.getContext().get(o.f294350b);
        Intrinsics.checkNotNull(element);
        return ((o) element).a();
    }

    @NotNull
    public static final String f() {
        return f294362a;
    }

    @o0
    public static /* synthetic */ void g() {
    }

    @o0
    public static final void h(@NotNull final v0 requestHeaders, @NotNull final w content, @NotNull final Function2<? super String, ? super String, Unit> block) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.utils.k.b(new Function1() { // from class: io.ktor.client.engine.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.i(requestHeaders, content, (w0) obj);
            }
        }).e(new Function2() { // from class: io.ktor.client.engine.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return v.j(block, (String) obj, (List) obj2);
            }
        });
        d1 d1Var = d1.f295782a;
        if (requestHeaders.get(d1Var.L0()) == null && content.c().get(d1Var.L0()) == null && k()) {
            block.invoke(d1Var.L0(), f294362a);
        }
        io.ktor.http.m mVarB = content.b();
        if ((mVarB == null || (string = mVarB.toString()) == null) && (string = content.c().get(d1Var.C())) == null) {
            string = requestHeaders.get(d1Var.C());
        }
        Long lA = content.a();
        if ((lA == null || (string2 = lA.toString()) == null) && (string2 = content.c().get(d1Var.z())) == null) {
            string2 = requestHeaders.get(d1Var.z());
        }
        if (string != null) {
            block.invoke(d1Var.C(), string);
        }
        if (string2 != null) {
            block.invoke(d1Var.z(), string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(v0 v0Var, w wVar, w0 buildHeaders) {
        Intrinsics.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
        buildHeaders.j(v0Var);
        buildHeaders.j(wVar.c());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function2 function2, String key, List values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        d1 d1Var = d1.f295782a;
        if (!Intrinsics.areEqual(d1Var.z(), key) && !Intrinsics.areEqual(d1Var.C(), key)) {
            if (f294363b.contains(key)) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    function2.invoke(key, (String) it.next());
                }
            } else {
                function2.invoke(key, CollectionsKt.joinToString$default(values, Intrinsics.areEqual(d1Var.D(), key) ? "; " : ",", null, null, 0, null, null, 62, null));
            }
            return Unit.f312394a;
        }
        return Unit.f312394a;
    }

    private static final boolean k() {
        return !g1.f296599a.a();
    }
}
