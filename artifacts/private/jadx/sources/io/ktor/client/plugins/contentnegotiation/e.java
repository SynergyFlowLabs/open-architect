package io.ktor.client.plugins.contentnegotiation;

import fi.y;
import io.ktor.client.plugins.api.i;
import io.ktor.client.plugins.api.t;
import io.ktor.client.plugins.api.v;
import io.ktor.http.Url;
import io.ktor.http.content.w;
import io.ktor.http.i1;
import io.ktor.http.l1;
import io.ktor.http.m;
import io.ktor.utils.io.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.p;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nContentNegotiation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentNegotiation.kt\nio/ktor/client/plugins/contentnegotiation/ContentNegotiationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,314:1\n774#2:315\n865#2:316\n2746#2,3:317\n866#2:320\n1869#2:321\n2746#2,3:322\n1870#2:325\n1761#2,3:326\n774#2:329\n865#2,2:330\n774#2:333\n865#2,2:334\n1563#2:336\n1634#2,3:337\n1#3:332\n21#4:340\n65#5,18:341\n*S KotlinDebug\n*F\n+ 1 ContentNegotiation.kt\nio/ktor/client/plugins/contentnegotiation/ContentNegotiationKt\n*L\n178#1:315\n178#1:316\n178#1:317,3\n178#1:320\n184#1:321\n185#1:322,3\n184#1:325\n197#1:326,3\n215#1:329\n215#1:330,2\n270#1:333\n270#1:334,2\n271#1:336\n271#1:337,3\n37#1:340\n37#1:341,18\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294667a = pi.a.a("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<kotlin.reflect.d<?>> f294668b = SetsKt.setOf((Object[]) new kotlin.reflect.d[]{j1.d(byte[].class), j1.d(String.class), j1.d(l1.class), j1.d(h.class), j1.d(w.class)});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<List<m>> f294669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<io.ktor.client.plugins.contentnegotiation.b> f294670d;

    /* synthetic */ class a extends g0 implements Function0<io.ktor.client.plugins.contentnegotiation.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294671a = new a();

        a() {
            super(0, io.ktor.client.plugins.contentnegotiation.b.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final io.ktor.client.plugins.contentnegotiation.b invoke() {
            return new io.ktor.client.plugins.contentnegotiation.b();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$1", f = "ContentNegotiation.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements p<t, y, Object, ri.b, kotlin.coroutines.d<? super w>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<io.ktor.client.plugins.contentnegotiation.b.a> f294675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<kotlin.reflect.d<?>> f294676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> f294677f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<io.ktor.client.plugins.contentnegotiation.b.a> list, Set<? extends kotlin.reflect.d<?>> set, io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> dVar, kotlin.coroutines.d<? super b> dVar2) {
            super(5, dVar2);
            this.f294675d = list;
            this.f294676e = set;
            this.f294677f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws io.ktor.client.plugins.contentnegotiation.a {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294672a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            y yVar = (y) this.f294673b;
            Object obj2 = this.f294674c;
            List<io.ktor.client.plugins.contentnegotiation.b.a> list = this.f294675d;
            Set<kotlin.reflect.d<?>> set = this.f294676e;
            io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> dVar = this.f294677f;
            this.f294673b = null;
            this.f294672a = 1;
            Object objD = e.d(list, set, dVar, yVar, obj2, this);
            return objD == objL ? objL : objD;
        }

        @Override // pj.p
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, y yVar, Object obj, ri.b bVar, kotlin.coroutines.d<? super w> dVar) {
            b bVar2 = new b(this.f294675d, this.f294676e, this.f294677f, dVar);
            bVar2.f294673b = yVar;
            bVar2.f294674c = obj;
            return bVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt$ContentNegotiation$2$2", f = "ContentNegotiation.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements p<v, io.ktor.client.statement.c, h, ri.b, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f294681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<kotlin.reflect.d<?>> f294682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<io.ktor.client.plugins.contentnegotiation.b.a> f294683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> f294684g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Set<? extends kotlin.reflect.d<?>> set, List<io.ktor.client.plugins.contentnegotiation.b.a> list, io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> dVar, kotlin.coroutines.d<? super c> dVar2) {
            super(5, dVar2);
            this.f294682e = set;
            this.f294683f = list;
            this.f294684g = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws io.ktor.serialization.c {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294678a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            io.ktor.client.statement.c cVar = (io.ktor.client.statement.c) this.f294679b;
            h hVar = (h) this.f294680c;
            ri.b bVar = (ri.b) this.f294681d;
            m mVarF = i1.f(cVar);
            if (mVarF == null) {
                return null;
            }
            Charset charsetC = io.ktor.serialization.e.c(io.ktor.client.statement.e.h(cVar).O(), null, 1, null);
            Set<kotlin.reflect.d<?>> set = this.f294682e;
            List<io.ktor.client.plugins.contentnegotiation.b.a> list = this.f294683f;
            io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> dVar = this.f294684g;
            Url url = io.ktor.client.statement.e.h(cVar).getUrl();
            this.f294679b = null;
            this.f294680c = null;
            this.f294678a = 1;
            Object objF = e.f(set, list, dVar, url, bVar, hVar, mVarF, charsetC, this);
            return objF == objL ? objL : objF;
        }

        @Override // pj.p
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, io.ktor.client.statement.c cVar, h hVar, ri.b bVar, kotlin.coroutines.d<Object> dVar) {
            c cVar2 = new c(this.f294682e, this.f294683f, this.f294684g, dVar);
            cVar2.f294679b = cVar;
            cVar2.f294680c = hVar;
            cVar2.f294681d = bVar;
            return cVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt", f = "ContentNegotiation.kt", i = {0, 0, 0, 0, 0}, l = {231}, m = "ContentNegotiation$lambda$16$convertRequest", n = {"request", "body", "contentType", "matchingRegistrations", "registration"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f294689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f294690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f294691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f294692h;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294691g = obj;
            this.f294692h |= Integer.MIN_VALUE;
            return e.d(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.contentnegotiation.e$e, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt", f = "ContentNegotiation.kt", i = {0}, l = {281}, m = "ContentNegotiation$lambda$16$convertResponse", n = {"requestUrl"}, s = {"L$0"})
    static final class C2062e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294695c;

        C2062e(kotlin.coroutines.d<? super C2062e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294694b = obj;
            this.f294695c |= Integer.MIN_VALUE;
            return e.f(null, null, null, null, null, null, null, null, this);
        }
    }

    static {
        s sVarB;
        kotlin.reflect.d dVarD = j1.d(List.class);
        try {
            sVarB = j1.B(List.class, KTypeProjection.f312969c.e(j1.A(m.class)));
        } catch (Throwable unused) {
            sVarB = null;
        }
        f294669c = new io.ktor.util.a<>("ExcludedContentTypesAttr", new ri.b(dVarD, sVarB));
        f294670d = i.b("ContentNegotiation", a.f294671a, new Function1() { // from class: io.ktor.client.plugins.contentnegotiation.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.c((io.ktor.client.plugins.api.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List<io.ktor.client.plugins.contentnegotiation.b.a> listF = ((io.ktor.client.plugins.contentnegotiation.b) createClientPlugin.f()).f();
        Set<kotlin.reflect.d<?>> setE = ((io.ktor.client.plugins.contentnegotiation.b) createClientPlugin.f()).e();
        createClientPlugin.m(new b(listF, setE, createClientPlugin, null));
        createClientPlugin.n(new c(setE, listF, createClientPlugin, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x029d  */
    /* JADX WARN: Code duplicated, block: B:101:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0303  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:95:0x027c  */
    /* JADX WARN: Code duplicated, block: B:97:0x028c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x02c9 -> B:106:0x02d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(java.util.List<io.ktor.client.plugins.contentnegotiation.b.a> r18, java.util.Set<? extends kotlin.reflect.d<?>> r19, io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> r20, fi.y r21, java.lang.Object r22, kotlin.coroutines.d<? super io.ktor.http.content.w> r23) throws io.ktor.client.plugins.contentnegotiation.a {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.contentnegotiation.e.d(java.util.List, java.util.Set, io.ktor.client.plugins.api.d, fi.y, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(io.ktor.client.plugins.contentnegotiation.b.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.c().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object f(Set<? extends kotlin.reflect.d<?>> set, List<io.ktor.client.plugins.contentnegotiation.b.a> list, io.ktor.client.plugins.api.d<io.ktor.client.plugins.contentnegotiation.b> dVar, Url url, ri.b bVar, Object obj, m mVar, Charset charset, kotlin.coroutines.d<Object> dVar2) throws io.ktor.serialization.c {
        C2062e c2062e;
        if (dVar2 instanceof C2062e) {
            c2062e = (C2062e) dVar2;
            int i10 = c2062e.f294695c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2062e.f294695c = i10 - Integer.MIN_VALUE;
            } else {
                c2062e = new C2062e(dVar2);
            }
        } else {
            c2062e = new C2062e(dVar2);
        }
        Object objA = c2062e.f294694b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2062e.f294695c;
        if (i11 == 0) {
            ResultKt.m(objA);
            if (!(obj instanceof h)) {
                f294667a.J("Response body is already transformed. Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            if (set.contains(bVar.b())) {
                f294667a.J("Response body type " + bVar.b() + " is in ignored types. Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((io.ktor.client.plugins.contentnegotiation.b.a) obj2).a().a(mVar)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((io.ktor.client.plugins.contentnegotiation.b.a) it.next()).c());
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                f294667a.J("None of the registered converters match response with Content-Type=" + mVar + ". Skipping ContentNegotiation for " + url + '.');
                return null;
            }
            c2062e.f294693a = url;
            c2062e.f294695c = 1;
            objA = io.ktor.serialization.e.a(arrayList2, (h) obj, bVar, charset, c2062e);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c2062e.f294693a;
            ResultKt.m(objA);
        }
        if (!(objA instanceof h)) {
            f294667a.J("Response body was converted to " + j1.d(objA.getClass()) + " for " + url + '.');
        }
        return objA;
    }

    public static final void j(@NotNull y yVar, @NotNull m... contentType) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        io.ktor.util.b bVarC = yVar.c();
        io.ktor.util.a<List<m>> aVar = f294669c;
        List listEmptyList = (List) bVarC.e(aVar);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        yVar.c().a(aVar, CollectionsKt.plus((Collection) listEmptyList, (Object[]) contentType));
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<io.ktor.client.plugins.contentnegotiation.b> k() {
        return f294670d;
    }

    public static /* synthetic */ void l() {
    }

    @NotNull
    public static final Set<kotlin.reflect.d<?>> m() {
        return f294668b;
    }

    @NotNull
    public static final io.ktor.util.a<List<m>> n() {
        return f294669c;
    }
}
