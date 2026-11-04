package fi;

import io.ktor.http.j1;
import io.ktor.http.u2;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nbuildersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 buildersJvm.kt\nio/ktor/client/request/BuildersJvmKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,240:1\n85#2:241\n43#2:242\n359#2:243\n205#2,2:244\n43#2:246\n369#2:247\n217#2,2:248\n43#2:250\n379#2:251\n229#2,2:252\n43#2:254\n409#2:255\n265#2,2:256\n43#2:258\n399#2:259\n253#2,2:260\n43#2:262\n419#2:263\n277#2,2:264\n43#2:266\n389#2:267\n241#2,2:268\n43#2:270\n93#2:271\n52#2:272\n427#2:273\n287#2,2:274\n52#2:276\n435#2:277\n297#2,2:278\n52#2:280\n443#2:281\n307#2,2:282\n52#2:284\n467#2:285\n337#2,2:286\n52#2:288\n459#2:289\n327#2,2:290\n52#2:292\n475#2:293\n347#2,2:294\n52#2:296\n451#2:297\n317#2,2:298\n52#2:300\n*S KotlinDebug\n*F\n+ 1 buildersJvm.kt\nio/ktor/client/request/BuildersJvmKt\n*L\n22#1:241\n22#1:242\n38#1:243\n38#1:244,2\n38#1:246\n52#1:247\n52#1:248,2\n52#1:250\n66#1:251\n66#1:252,2\n66#1:254\n80#1:255\n80#1:256,2\n80#1:258\n94#1:259\n94#1:260,2\n94#1:262\n108#1:263\n108#1:264,2\n108#1:266\n122#1:267\n122#1:268,2\n122#1:270\n136#1:271\n136#1:272\n152#1:273\n152#1:274,2\n152#1:276\n166#1:277\n166#1:278,2\n166#1:280\n180#1:281\n180#1:282,2\n180#1:284\n194#1:285\n194#1:286,2\n194#1:288\n208#1:289\n208#1:290,2\n208#1:292\n222#1:293\n222#1:294,2\n222#1:296\n236#1:297\n236#1:298,2\n236#1:300\n*E\n"})
public final class q {
    public static /* synthetic */ Object A(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.B((y) obj2);
                }
            };
        }
        return z(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object C(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.f());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    public static /* synthetic */ Object D(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.E((y) obj2);
                }
            };
        }
        return C(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object F(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.g());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    public static /* synthetic */ Object G(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.H((y) obj2);
                }
            };
        }
        return F(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object I(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.b());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object J(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.K((y) obj2);
                }
            };
        }
        return I(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object L(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.c());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object M(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.N((y) obj2);
                }
            };
        }
        return L(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object O(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.d());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object P(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.Q((y) obj2);
                }
            };
        }
        return O(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object R(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.e());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object S(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.T((y) obj2);
                }
            };
        }
        return R(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object U(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.f());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object V(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.W((y) obj2);
                }
            };
        }
        return U(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object X(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.g());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object Y(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.Z((y) obj2);
                }
            };
        }
        return X(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object a0(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.h());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object b0(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.c0((y) obj2);
                }
            };
        }
        return a0(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object d0(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object e0(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.f0((y) obj2);
                }
            };
        }
        return d0(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object g0(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.h());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    public static /* synthetic */ Object h0(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.i0((y) obj2);
                }
            };
        }
        return g0(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object j0(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    public static /* synthetic */ Object k0(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.l0((y) obj2);
                }
            };
        }
        return j0(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object q(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.b());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    public static /* synthetic */ Object r(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.s((y) obj2);
                }
            };
        }
        return q(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object t(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.c());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    public static /* synthetic */ Object u(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.v((y) obj2);
                }
            };
        }
        return t(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object w(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.d());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    public static /* synthetic */ Object x(io.ktor.client.c cVar, URL url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: fi.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return q.y((y) obj2);
                }
            };
        }
        return w(cVar, url, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object z(@NotNull io.ktor.client.c cVar, @NotNull URL url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws URISyntaxException {
        y yVar = new y();
        u2.c(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.e());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }
}
