package io.ktor.client.plugins;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpPlainText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1068#2:180\n774#2:181\n865#2,2:182\n1056#2:184\n1869#2,2:185\n1869#2,2:187\n*S KotlinDebug\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n*L\n78#1:180\n81#1:181\n81#1:182,2\n82#1:184\n85#1:185,2\n90#1:187,2\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294771a = pi.a.a("io.ktor.client.plugins.HttpPlainText");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<b0> f294772b = io.ktor.client.plugins.api.i.b("HttpPlainText", a.f294773a, new Function1() { // from class: io.ktor.client.plugins.c0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return d0.c((io.ktor.client.plugins.api.d) obj);
        }
    });

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294773a = new a();

        a() {
            super(0, b0.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final b0 invoke() {
            return new b0();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<fi.y, Object, kotlin.coroutines.d<? super io.ktor.http.content.w>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f294777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Charset f294778e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Charset charset, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f294777d = str;
            this.f294778e = charset;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f294774a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            fi.y yVar = (fi.y) this.f294775b;
            Object obj2 = this.f294776c;
            d0.d(this.f294777d, yVar);
            int i10 = 5 >> 0;
            if (!(obj2 instanceof String)) {
                return null;
            }
            io.ktor.http.m mVarG = io.ktor.http.i1.g(yVar);
            if (mVarG == null || Intrinsics.areEqual(mVarG.f(), io.ktor.http.m.h.f296047a.i().f())) {
                return d0.f(this.f294778e, yVar, (String) obj2, mVarG);
            }
            return null;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fi.y yVar, Object obj, kotlin.coroutines.d<? super io.ktor.http.content.w> dVar) {
            b bVar = new b(this.f294777d, this.f294778e, dVar);
            bVar.f294775b = yVar;
            bVar.f294776c = obj;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.F1}, m = "invokeSuspend", n = {io.sentry.protocol.n.f306405g}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.p<io.ktor.client.plugins.api.v, io.ktor.client.statement.c, io.ktor.utils.io.h, ri.b, kotlin.coroutines.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f294782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Charset f294783e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Charset charset, kotlin.coroutines.d<? super c> dVar) {
            super(5, dVar);
            this.f294783e = charset;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.ktor.client.statement.c cVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294779a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.client.statement.c cVar2 = (io.ktor.client.statement.c) this.f294780b;
                io.ktor.utils.io.h hVar = (io.ktor.utils.io.h) this.f294781c;
                if (!Intrinsics.areEqual(((ri.b) this.f294782d).b(), kotlin.jvm.internal.j1.d(String.class))) {
                    return null;
                }
                this.f294780b = cVar2;
                this.f294781c = null;
                this.f294779a = 1;
                Object objI = io.ktor.utils.io.k.I(hVar, this);
                if (objI == objL) {
                    return objL;
                }
                cVar = cVar2;
                obj = objI;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (io.ktor.client.statement.c) this.f294780b;
                ResultKt.m(obj);
            }
            return d0.e(this.f294783e, cVar.h(), (kotlinx.io.c0) obj);
        }

        @Override // pj.p
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.plugins.api.v vVar, io.ktor.client.statement.c cVar, io.ktor.utils.io.h hVar, ri.b bVar, kotlin.coroutines.d<Object> dVar) {
            c cVar2 = new c(this.f294783e, dVar);
            cVar2.f294780b = cVar;
            cVar2.f294781c = hVar;
            cVar2.f294782d = bVar;
            return cVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n*L\n1#1,102:1\n82#2:103\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(ti.a.l((Charset) t10), ti.a.l((Charset) t11));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n*L\n1#1,121:1\n78#2:122\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l((Float) ((Pair) t11).getSecond(), (Float) ((Pair) t10).getSecond());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@NotNull io.ktor.client.j<?> jVar, @NotNull Function1<? super b0, Unit> block) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jVar.r(f294772b, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List<Pair> listSortedWith = CollectionsKt.sortedWith(MapsKt.toList(((b0) createClientPlugin.f()).a()), new e());
        Charset charsetC = ((b0) createClientPlugin.f()).c();
        Set<Charset> setB = ((b0) createClientPlugin.f()).b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB) {
            if (!((b0) createClientPlugin.f()).a().containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listSortedWith2 = CollectionsKt.sortedWith(arrayList, new d());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset : listSortedWith2) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(ti.a.l(charset));
        }
        for (Pair pair : listSortedWith) {
            Charset charset2 = (Charset) pair.component1();
            float fFloatValue = ((Number) pair.component2()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d10 = fFloatValue;
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(ti.a.l(charset2) + ";q=" + (((double) kotlin.math.b.L0(100 * fFloatValue)) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(ti.a.l(charsetC));
        }
        String string = sb2.toString();
        Charset charsetD = ((b0) createClientPlugin.f()).d();
        if (charsetD == null && (charsetD = (Charset) CollectionsKt.firstOrNull(listSortedWith2)) == null) {
            Pair pair2 = (Pair) CollectionsKt.firstOrNull(listSortedWith);
            charsetD = pair2 != null ? (Charset) pair2.getFirst() : null;
            if (charsetD == null) {
                charsetD = Charsets.UTF_8;
            }
        }
        createClientPlugin.g(l1.f294882a, new b(string, charsetD, null));
        createClientPlugin.n(new c(charsetC, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, fi.y yVar) {
        io.ktor.http.w0 w0VarO = yVar.O();
        io.ktor.http.d1 d1Var = io.ktor.http.d1.f295782a;
        if (w0VarO.get(d1Var.e()) != null) {
            return;
        }
        f294771a.J("Adding Accept-Charset=" + str + " to " + yVar.i());
        yVar.O().a(d1Var.e(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(Charset charset, io.ktor.client.call.b bVar, kotlinx.io.c0 c0Var) {
        Charset charsetB = io.ktor.http.i1.b(bVar.k());
        if (charsetB != null) {
            charset = charsetB;
        }
        f294771a.J("Reading response body for " + bVar.j().getUrl() + " as String with charset " + charset);
        return ui.u.g(c0Var, charset, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.content.w f(Charset charset, fi.y yVar, String str, io.ktor.http.m mVar) {
        Charset charsetA;
        io.ktor.http.m mVarI = mVar == null ? io.ktor.http.m.h.f296047a.i() : mVar;
        if (mVar != null && (charsetA = io.ktor.http.o.a(mVar)) != null) {
            charset = charsetA;
        }
        f294771a.J("Sending request body to " + yVar.i() + " as text/plain with charset " + charset);
        return new io.ktor.http.content.d0(str, io.ktor.http.o.b(mVarI, charset), null, 4, null);
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<b0> j() {
        return f294772b;
    }
}
