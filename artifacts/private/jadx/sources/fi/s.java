package fi;

import io.ktor.http.Url;
import io.ktor.http.j1;
import io.ktor.http.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nbuildersWithUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 buildersWithUrl.kt\nio/ktor/client/request/BuildersWithUrlKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,229:1\n359#2:230\n205#2,2:231\n43#2:233\n205#2,2:234\n43#2:236\n205#2,2:237\n43#2:239\n427#2:240\n287#2,2:241\n52#2:243\n427#2:244\n287#2,2:245\n52#2:247\n427#2:248\n287#2,2:249\n52#2:251\n369#2:252\n217#2,2:253\n43#2:255\n369#2:256\n217#2,2:257\n43#2:259\n369#2:260\n217#2,2:261\n43#2:263\n435#2:264\n297#2,2:265\n52#2:267\n435#2:268\n297#2,2:269\n52#2:271\n435#2:272\n297#2,2:273\n52#2:275\n379#2:276\n229#2,2:277\n43#2:279\n379#2:280\n229#2,2:281\n43#2:283\n379#2:284\n229#2,2:285\n43#2:287\n443#2:288\n307#2,2:289\n52#2:291\n443#2:292\n307#2,2:293\n52#2:295\n443#2:296\n307#2,2:297\n52#2:299\n409#2:300\n265#2,2:301\n43#2:303\n409#2:304\n265#2,2:305\n43#2:307\n409#2:308\n265#2,2:309\n43#2:311\n467#2:312\n337#2,2:313\n52#2:315\n467#2:316\n337#2,2:317\n52#2:319\n467#2:320\n337#2,2:321\n52#2:323\n399#2:324\n253#2,2:325\n43#2:327\n399#2:328\n253#2,2:329\n43#2:331\n399#2:332\n253#2,2:333\n43#2:335\n459#2:336\n327#2,2:337\n52#2:339\n459#2:340\n327#2,2:341\n52#2:343\n459#2:344\n327#2,2:345\n52#2:347\n419#2:348\n277#2,2:349\n43#2:351\n419#2:352\n277#2,2:353\n43#2:355\n419#2:356\n277#2,2:357\n43#2:359\n475#2:360\n347#2,2:361\n52#2:363\n475#2:364\n347#2,2:365\n52#2:367\n475#2:368\n347#2,2:369\n52#2:371\n389#2:372\n241#2,2:373\n43#2:375\n389#2:376\n241#2,2:377\n43#2:379\n389#2:380\n241#2,2:381\n43#2:383\n451#2:384\n317#2,2:385\n52#2:387\n451#2:388\n317#2,2:389\n52#2:391\n451#2:392\n317#2,2:393\n52#2:395\n*S KotlinDebug\n*F\n+ 1 buildersWithUrl.kt\nio/ktor/client/request/BuildersWithUrlKt\n*L\n22#1:230\n22#1:231,2\n22#1:233\n22#1:234,2\n22#1:236\n22#1:237,2\n22#1:239\n36#1:240\n36#1:241,2\n36#1:243\n36#1:244\n36#1:245,2\n36#1:247\n36#1:248\n36#1:249,2\n36#1:251\n52#1:252\n52#1:253,2\n52#1:255\n52#1:256\n52#1:257,2\n52#1:259\n52#1:260\n52#1:261,2\n52#1:263\n66#1:264\n66#1:265,2\n66#1:267\n66#1:268\n66#1:269,2\n66#1:271\n66#1:272\n66#1:273,2\n66#1:275\n82#1:276\n82#1:277,2\n82#1:279\n82#1:280\n82#1:281,2\n82#1:283\n82#1:284\n82#1:285,2\n82#1:287\n96#1:288\n96#1:289,2\n96#1:291\n96#1:292\n96#1:293,2\n96#1:295\n96#1:296\n96#1:297,2\n96#1:299\n112#1:300\n112#1:301,2\n112#1:303\n112#1:304\n112#1:305,2\n112#1:307\n112#1:308\n112#1:309,2\n112#1:311\n126#1:312\n126#1:313,2\n126#1:315\n126#1:316\n126#1:317,2\n126#1:319\n126#1:320\n126#1:321,2\n126#1:323\n142#1:324\n142#1:325,2\n142#1:327\n142#1:328\n142#1:329,2\n142#1:331\n142#1:332\n142#1:333,2\n142#1:335\n156#1:336\n156#1:337,2\n156#1:339\n156#1:340\n156#1:341,2\n156#1:343\n156#1:344\n156#1:345,2\n156#1:347\n172#1:348\n172#1:349,2\n172#1:351\n172#1:352\n172#1:353,2\n172#1:355\n172#1:356\n172#1:357,2\n172#1:359\n186#1:360\n186#1:361,2\n186#1:363\n186#1:364\n186#1:365,2\n186#1:367\n186#1:368\n186#1:369,2\n186#1:371\n202#1:372\n202#1:373,2\n202#1:375\n202#1:376\n202#1:377,2\n202#1:379\n202#1:380\n202#1:381,2\n202#1:383\n216#1:384\n216#1:385,2\n216#1:387\n216#1:388\n216#1:389,2\n216#1:391\n216#1:392\n216#1:393,2\n216#1:395\n*E\n"})
public final class s {

    public static final class a implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f275264a = new a();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class b implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f275265a = new b();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class c implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f275266a = new c();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class d implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f275267a = new d();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class e implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f275268a = new e();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class f implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f275269a = new f();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class g implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f275270a = new g();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class h implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f275271a = new h();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class i implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f275272a = new i();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class j implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f275273a = new j();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class k implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f275274a = new k();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class l implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f275275a = new l();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class m implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f275276a = new m();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static final class n implements Function1<y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f275277a = new n();

        public final void c(y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
            c(yVar);
            return Unit.f312394a;
        }
    }

    public static /* synthetic */ Object A(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = i.f275272a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.d());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    @Nullable
    public static final Object B(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.e());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    private static final Object C(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.e());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object D(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = j.f275273a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.e());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    @Nullable
    public static final Object E(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.f());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    private static final Object F(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.f());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object G(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = k.f275274a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.f());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    @Nullable
    public static final Object H(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.g());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    private static final Object I(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.g());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object J(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = l.f275275a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.g());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    @Nullable
    public static final Object K(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.h());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    private static final Object L(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.h());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object M(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = m.f275276a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.h());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    @Nullable
    public static final Object N(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.h());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    private static final Object O(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.h());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static /* synthetic */ Object P(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = n.f275277a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.h());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static final void Q(@NotNull y yVar, @NotNull Url url) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        w2.u(yVar.i(), url);
    }

    @Nullable
    public static final Object a(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.b());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    private static final Object b(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.b());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static /* synthetic */ Object c(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = a.f275264a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.b());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    @Nullable
    public static final Object d(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.c());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    private static final Object e(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.c());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static /* synthetic */ Object f(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = b.f275265a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.c());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    @Nullable
    public static final Object g(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.d());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    private static final Object h(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.d());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static /* synthetic */ Object i(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = c.f275266a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.d());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    @Nullable
    public static final Object j(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.e());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    private static final Object k(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.e());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static /* synthetic */ Object l(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = d.f275267a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.e());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    @Nullable
    public static final Object m(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.f());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    private static final Object n(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.f());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static /* synthetic */ Object o(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = e.f275268a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.f());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    @Nullable
    public static final Object p(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.g());
        return new io.ktor.client.statement.g(yVar, cVar).d(dVar);
    }

    private static final Object q(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.g());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        int i10 = 3 & 0;
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    public static /* synthetic */ Object r(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = f.f275269a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.g());
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        kotlin.jvm.internal.h0.e(0);
        Object objD = gVar.d(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objD;
    }

    @Nullable
    public static final Object s(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.b());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    private static final Object t(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.b());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object u(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = g.f275270a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.b());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    @Nullable
    public static final Object v(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.c());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    private static final Object w(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.c());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    public static /* synthetic */ Object x(io.ktor.client.c cVar, Url url, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = h.f275271a;
        }
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.c());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    @Nullable
    public static final Object y(@NotNull io.ktor.client.c cVar, @NotNull Url url, @NotNull Function1<? super y, Unit> function1, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        yVar.p(j1.f295897b.d());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    private static final Object z(io.ktor.client.c cVar, Url url, Function1<? super y, Unit> function1, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        y yVar = new y();
        w2.u(yVar.i(), url);
        function1.invoke(yVar);
        Unit unit = Unit.f312394a;
        yVar.p(j1.f295897b.d());
        return new io.ktor.client.statement.g(yVar, cVar);
    }
}
