package fi;

import io.ktor.client.plugins.sse.m0;
import io.ktor.http.g1;
import io.ktor.http.k2;
import io.ktor.http.n2;
import io.ktor.http.r2;
import io.ktor.http.w0;
import io.ktor.http.w2;
import io.ktor.utils.io.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/HttpRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,421:1\n1#2:422\n21#3:423\n65#4,18:424\n*S KotlinDebug\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/HttpRequestKt\n*L\n381#1:423\n381#1:424,18\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<i0> f275223a;

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = j1.d(i0.class);
        try {
            sVarA = j1.A(i0.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f275223a = new io.ktor.util.a<>("ResponseAdapterAttributeKey", new ri.b(dVarD, sVarA));
    }

    @NotNull
    public static final io.ktor.util.a<i0> c() {
        return f275223a;
    }

    @o0
    public static /* synthetic */ void d() {
    }

    @NotNull
    public static final w0 e(@NotNull g1 g1Var, @NotNull Function1<? super w0, Unit> block) {
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        w0 w0VarO = g1Var.O();
        block.invoke(w0VarO);
        return w0VarO;
    }

    @NotNull
    public static final y f(@NotNull y.a aVar, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super k2, Unit> block) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        y yVar = new y();
        p(yVar, str, str2, num, str3, block);
        return yVar;
    }

    @NotNull
    public static final y g(@NotNull y.a aVar, @NotNull Function1<? super k2, Unit> block) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        y yVar = new y();
        q(yVar, block);
        return yVar;
    }

    public static /* synthetic */ y h(y.a aVar, String str, String str2, Integer num, String str3, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: fi.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d0.i((k2) obj2);
                }
            };
        }
        return f(aVar, str, str2, num, str3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return Unit.f312394a;
    }

    @o0
    public static final boolean j(@NotNull z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return Intrinsics.areEqual(zVar.a().e(m0.j()), Boolean.TRUE);
    }

    @o0
    public static final boolean k(@NotNull z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar.b() instanceof io.ktor.client.plugins.sse.i0;
    }

    @o0
    public static final boolean l(@NotNull z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar.b() instanceof u;
    }

    @NotNull
    public static final y m(@NotNull y yVar, @NotNull w request) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        yVar.p(request.getMethod());
        yVar.k(request.getContent());
        yVar.l((ri.b) yVar.c().e(h0.a()));
        w2.u(yVar.i(), request.getUrl());
        yVar.O().j(request.O());
        io.ktor.util.e.c(yVar.c(), request.getAttributes());
        return yVar;
    }

    @NotNull
    public static final y n(@NotNull y yVar, @NotNull z request) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        yVar.p(request.f());
        yVar.k(request.b());
        yVar.l((ri.b) yVar.c().e(h0.a()));
        w2.u(yVar.i(), request.h());
        yVar.O().j(request.e());
        io.ktor.util.e.c(yVar.c(), request.a());
        return yVar;
    }

    public static final void o(@NotNull y yVar, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        r2.m(yVar.i(), urlString);
    }

    public static final void p(@NotNull y yVar, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super k2, Unit> block) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        n2.v(yVar.i(), str, str2, num, str3, block);
    }

    public static final void q(@NotNull y yVar, @NotNull Function1<? super k2, Unit> block) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(yVar.i());
    }

    public static /* synthetic */ void r(y yVar, String str, String str2, Integer num, String str3, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: fi.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d0.s((k2) obj2);
                }
            };
        }
        p(yVar, str, str2, num, str3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return Unit.f312394a;
    }
}
