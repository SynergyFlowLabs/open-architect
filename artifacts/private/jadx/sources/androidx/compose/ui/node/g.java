package androidx.compose.ui.node;

import androidx.compose.ui.platform.o4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.a1
public interface g {

    @NotNull
    public static final a I = a.f39739a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39739a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Function0<g> f39740b = l0.f39845y3.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final Function0<g> f39741c = h.f39756a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final Function2<g, androidx.compose.ui.a0, Unit> f39742d = e.f39753a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final Function2<g, androidx.compose.ui.unit.d, Unit> f39743e = b.f39750a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final Function2<g, androidx.compose.runtime.b1, Unit> f39744f = f.f39754a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final Function2<g, androidx.compose.ui.layout.a1, Unit> f39745g = d.f39752a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final Function2<g, androidx.compose.ui.unit.w, Unit> f39746h = c.f39751a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private static final Function2<g, o4, Unit> f39747i = C0310g.f39755a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private static final Function2<g, Integer, Unit> f39748j = C0309a.f39749a;

        /* JADX INFO: renamed from: androidx.compose.ui.node.g$a$a, reason: collision with other inner class name */
        static final class C0309a extends kotlin.jvm.internal.l0 implements Function2<g, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0309a f39749a = new C0309a();

            C0309a() {
                super(2);
            }

            public final void c(g gVar, int i10) {
                gVar.d(i10);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(g gVar, Integer num) {
                c(gVar, num.intValue());
                return Unit.f312394a;
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function2<g, androidx.compose.ui.unit.d, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f39750a = new b();

            b() {
                super(2);
            }

            public final void c(g gVar, androidx.compose.ui.unit.d dVar) {
                gVar.e(dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(g gVar, androidx.compose.ui.unit.d dVar) {
                c(gVar, dVar);
                return Unit.f312394a;
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function2<g, androidx.compose.ui.unit.w, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f39751a = new c();

            c() {
                super(2);
            }

            public final void c(g gVar, androidx.compose.ui.unit.w wVar) {
                gVar.b(wVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(g gVar, androidx.compose.ui.unit.w wVar) {
                c(gVar, wVar);
                return Unit.f312394a;
            }
        }

        static final class d extends kotlin.jvm.internal.l0 implements Function2<g, androidx.compose.ui.layout.a1, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f39752a = new d();

            d() {
                super(2);
            }

            public final void c(g gVar, androidx.compose.ui.layout.a1 a1Var) {
                gVar.i(a1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(g gVar, androidx.compose.ui.layout.a1 a1Var) {
                c(gVar, a1Var);
                return Unit.f312394a;
            }
        }

        static final class e extends kotlin.jvm.internal.l0 implements Function2<g, androidx.compose.ui.a0, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f39753a = new e();

            e() {
                super(2);
            }

            public final void c(g gVar, androidx.compose.ui.a0 a0Var) {
                gVar.j(a0Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(g gVar, androidx.compose.ui.a0 a0Var) {
                c(gVar, a0Var);
                return Unit.f312394a;
            }
        }

        static final class f extends kotlin.jvm.internal.l0 implements Function2<g, androidx.compose.runtime.b1, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f39754a = new f();

            f() {
                super(2);
            }

            public final void c(g gVar, androidx.compose.runtime.b1 b1Var) {
                gVar.l(b1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(g gVar, androidx.compose.runtime.b1 b1Var) {
                c(gVar, b1Var);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.g$a$g, reason: collision with other inner class name */
        static final class C0310g extends kotlin.jvm.internal.l0 implements Function2<g, o4, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0310g f39755a = new C0310g();

            C0310g() {
                super(2);
            }

            public final void c(g gVar, o4 o4Var) {
                gVar.p(o4Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(g gVar, o4 o4Var) {
                c(gVar, o4Var);
                return Unit.f312394a;
            }
        }

        static final class h extends kotlin.jvm.internal.l0 implements Function0<l0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f39756a = new h();

            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final l0 invoke() {
                return new l0(true, 0, 2, null);
            }
        }

        private a() {
        }

        @NotNull
        public final Function0<g> a() {
            return f39740b;
        }

        @NotNull
        public final Function2<g, Integer, Unit> b() {
            return f39748j;
        }

        @NotNull
        public final Function2<g, androidx.compose.ui.unit.d, Unit> c() {
            return f39743e;
        }

        @NotNull
        public final Function2<g, androidx.compose.ui.unit.w, Unit> d() {
            return f39746h;
        }

        @NotNull
        public final Function2<g, androidx.compose.ui.layout.a1, Unit> e() {
            return f39745g;
        }

        @NotNull
        public final Function2<g, androidx.compose.ui.a0, Unit> f() {
            return f39742d;
        }

        @NotNull
        public final Function2<g, androidx.compose.runtime.b1, Unit> g() {
            return f39744f;
        }

        @NotNull
        public final Function2<g, o4, Unit> h() {
            return f39747i;
        }

        @NotNull
        public final Function0<g> i() {
            return f39741c;
        }
    }

    @NotNull
    androidx.compose.ui.a0 a();

    void b(@NotNull androidx.compose.ui.unit.w wVar);

    void d(int i10);

    void e(@NotNull androidx.compose.ui.unit.d dVar);

    int f();

    @NotNull
    androidx.compose.ui.unit.d getDensity();

    @NotNull
    androidx.compose.ui.unit.w getLayoutDirection();

    @NotNull
    o4 getViewConfiguration();

    void i(@NotNull androidx.compose.ui.layout.a1 a1Var);

    void j(@NotNull androidx.compose.ui.a0 a0Var);

    void l(@NotNull androidx.compose.runtime.b1 b1Var);

    @NotNull
    androidx.compose.runtime.b1 m();

    void p(@NotNull o4 o4Var);

    @NotNull
    androidx.compose.ui.layout.a1 s();
}
