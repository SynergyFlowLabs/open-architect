package io.ktor.client.plugins;

import io.ktor.http.Url;
import io.ktor.http.b2;
import io.ktor.http.k2;
import io.ktor.http.n2;
import io.ktor.http.r2;
import io.ktor.http.w2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDefaultRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,247:1\n21#2:248\n65#3,18:249\n*S KotlinDebug\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest\n*L\n66#1:248\n66#1:249,18\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f294818b = new b(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<h> f294819c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<a, Unit> f294820a;

    @io.ktor.utils.io.r0
    public static final class a implements io.ktor.http.g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final io.ktor.http.w0 f294821a = new io.ktor.http.w0(0, 1, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final k2 f294822b = new k2(null, null, 0, null, null, null, null, null, false, 511, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final io.ktor.util.b f294823c = io.ktor.util.d.a(true);

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void l(a aVar, String str, String str2, Integer num, String str3, Function1 function1, int i10, Object obj) {
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
                function1 = new Function1() { // from class: io.ktor.client.plugins.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return h.a.m((k2) obj2);
                    }
                };
            }
            aVar.j(str, str2, num, str3, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(k2 k2Var) {
            Intrinsics.checkNotNullParameter(k2Var, "<this>");
            return Unit.f312394a;
        }

        @Override // io.ktor.http.g1
        @NotNull
        public io.ktor.http.w0 O() {
            return this.f294821a;
        }

        @NotNull
        public final io.ktor.util.b b() {
            return this.f294823c;
        }

        @NotNull
        public final String c() {
            return this.f294822b.j();
        }

        public final int d() {
            return this.f294822b.n();
        }

        @NotNull
        public final k2 e() {
            return this.f294822b;
        }

        public final void f(@NotNull Function1<? super io.ktor.util.b, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(this.f294823c);
        }

        public final void g(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f294822b.y(value);
        }

        public final void h(int i10) {
            this.f294822b.B(i10);
        }

        public final void i(@NotNull String urlString) {
            Intrinsics.checkNotNullParameter(urlString, "urlString");
            r2.m(this.f294822b, urlString);
        }

        public final void j(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super k2, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            n2.v(this.f294822b, str, str2, num, str3, block);
        }

        public final void k(@NotNull Function1<? super k2, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(this.f294822b);
        }
    }

    @SourceDebugExtension({"SMAP\nDefaultRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n1869#2,2:248\n*S KotlinDebug\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin\n*L\n134#1:248,2\n*E\n"})
    public static final class b implements z<a, h> {

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDefaultRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin$install$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n1869#2,2:248\n1869#2,2:250\n*S KotlinDebug\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin$install$1\n*L\n80#1:248,2\n96#1:250,2\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294824a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294825b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f294826c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f294826c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f294824a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f294825b;
                String string = ((fi.y) eVar.f()).i().toString();
                a aVar = new a();
                h hVar = this.f294826c;
                io.ktor.util.w1.e(aVar.O(), ((fi.y) eVar.f()).O());
                io.ktor.http.v0 v0VarBuild = aVar.O().build();
                hVar.f294820a.invoke(aVar);
                Iterator<T> it = v0VarBuild.k().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    List<String> listB = aVar.O().b(str);
                    if (listB == null) {
                        aVar.O().g(str, list);
                    } else if (!Intrinsics.areEqual(listB, list) && !Intrinsics.areEqual(str, io.ktor.http.d1.f295782a.D())) {
                        aVar.O().remove(str);
                        aVar.O().g(str, list);
                        aVar.O().i(str, listB);
                    }
                }
                h.f294818b.f(aVar.e().b(), ((fi.y) eVar.f()).i());
                for (io.ktor.util.a<?> aVar2 : aVar.b().b()) {
                    if (!((fi.y) eVar.f()).c().d(aVar2)) {
                        io.ktor.util.b bVarC = ((fi.y) eVar.f()).c();
                        Intrinsics.checkNotNull(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                        bVarC.a(aVar2, aVar.b().f(aVar2));
                    }
                }
                ((fi.y) eVar.f()).O().clear();
                ((fi.y) eVar.f()).O().j(aVar.O().build());
                j.f294859a.J("Applied DefaultRequest to " + string + ". New url: " + ((fi.y) eVar.f()).i());
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(this.f294826c, dVar);
                aVar.f294825b = eVar;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<String> d(List<String> list, List<String> list2) {
            if (list2.isEmpty()) {
                return list;
            }
            if (list.isEmpty() || ((CharSequence) CollectionsKt.first((List) list2)).length() == 0) {
                return list2;
            }
            List listCreateListBuilder = CollectionsKt.createListBuilder((list.size() + list2.size()) - 1);
            int size = list.size() - 1;
            for (int i10 = 0; i10 < size; i10++) {
                listCreateListBuilder.add(list.get(i10));
            }
            listCreateListBuilder.addAll(list2);
            return CollectionsKt.build(listCreateListBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(Url url, k2 k2Var) {
            if (k2Var.p() == null) {
                k2Var.D(url.B());
            }
            if (k2Var.j().length() > 0) {
                return;
            }
            k2 k2VarC = w2.c(url);
            k2VarC.D(k2Var.p());
            if (k2Var.n() != 0) {
                k2VarC.B(k2Var.n());
            }
            k2VarC.v(h.f294818b.d(k2VarC.g(), k2Var.g()));
            if (k2Var.d().length() > 0) {
                k2VarC.s(k2Var.d());
            }
            int i10 = 1 >> 0;
            io.ktor.http.y1 y1VarB = b2.b(0, 1, null);
            io.ktor.util.w1.e(y1VarB, k2VarC.e());
            k2VarC.t(k2Var.e());
            Iterator<T> it = y1VarB.k().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!k2VarC.e().contains(str)) {
                    k2VarC.e().g(str, list);
                }
            }
            w2.t(k2Var, k2VarC);
        }

        @Override // io.ktor.client.plugins.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull h plugin, @NotNull io.ktor.client.c scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.x().q(fi.e0.f275224h.a(), new a(plugin, null));
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new h(block, null);
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        public io.ktor.util.a<h> getKey() {
            return h.f294819c;
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.s sVarA = null;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(h.class);
        try {
            sVarA = kotlin.jvm.internal.j1.A(h.class);
        } catch (Throwable unused) {
        }
        f294819c = new io.ktor.util.a<>("DefaultRequest", new ri.b(dVarD, sVarA));
    }

    public /* synthetic */ h(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(Function1<? super a, Unit> function1) {
        this.f294820a = function1;
    }
}
