package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.l0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.lifecycle.c0;
import androidx.lifecycle.o0;
import coil.memory.MemoryCache;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    @NotNull
    private final c0 A;

    @NotNull
    private final coil.size.j B;

    @NotNull
    private final coil.size.h C;

    @NotNull
    private final o D;

    @Nullable
    private final MemoryCache.Key E;

    @Nullable
    private final Integer F;

    @Nullable
    private final Drawable G;

    @Nullable
    private final Integer H;

    @Nullable
    private final Drawable I;

    @Nullable
    private final Integer J;

    @Nullable
    private final Drawable K;

    @NotNull
    private final d L;

    @NotNull
    private final c M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f87651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f87652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final coil.target.c f87653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final b f87654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final MemoryCache.Key f87655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f87656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Bitmap.Config f87657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final ColorSpace f87658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final coil.size.e f87659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final Pair<coil.fetch.h.a<?>, Class<?>> f87660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final coil.decode.h.a f87661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<q4.e> f87662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final coil.transition.c.a f87663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final okhttp3.u f87664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final s f87665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f87666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f87667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f87668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f87669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final coil.request.b f87670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final coil.request.b f87671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final coil.request.b f87672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n0 f87673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final n0 f87674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final n0 f87675y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final n0 f87676z;

    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    public static final class a {

        @Nullable
        private n0 A;

        @Nullable
        private o.a B;

        @Nullable
        private MemoryCache.Key C;

        @androidx.annotation.v
        @Nullable
        private Integer D;

        @Nullable
        private Drawable E;

        @androidx.annotation.v
        @Nullable
        private Integer F;

        @Nullable
        private Drawable G;

        @androidx.annotation.v
        @Nullable
        private Integer H;

        @Nullable
        private Drawable I;

        @Nullable
        private c0 J;

        @Nullable
        private coil.size.j K;

        @Nullable
        private coil.size.h L;

        @Nullable
        private c0 M;

        @Nullable
        private coil.size.j N;

        @Nullable
        private coil.size.h O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f87677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private coil.request.c f87678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Object f87679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private coil.target.c f87680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private b f87681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private MemoryCache.Key f87682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f87683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private Bitmap.Config f87684h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private ColorSpace f87685i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private coil.size.e f87686j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private Pair<? extends coil.fetch.h.a<?>, ? extends Class<?>> f87687k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private coil.decode.h.a f87688l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private List<? extends q4.e> f87689m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        private coil.transition.c.a f87690n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        private okhttp3.u.a f87691o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        private Map<Class<?>, Object> f87692p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f87693q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        private Boolean f87694r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        private Boolean f87695s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f87696t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        private coil.request.b f87697u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        private coil.request.b f87698v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        private coil.request.b f87699w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @Nullable
        private n0 f87700x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @Nullable
        private n0 f87701y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @Nullable
        private n0 f87702z;

        /* JADX INFO: renamed from: coil.request.i$a$a, reason: collision with other inner class name */
        public static final class C0820a implements Function1<i, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0820a f87703a = new C0820a();

            public final void c(i iVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i iVar) {
                c(iVar);
                return Unit.f312394a;
            }
        }

        public static final class b implements Function1<i, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f87704a = new b();

            public final void c(i iVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i iVar) {
                c(iVar);
                return Unit.f312394a;
            }
        }

        public static final class c implements Function2<i, coil.request.f, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f87705a = new c();

            public final void c(i iVar, coil.request.f fVar) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(i iVar, coil.request.f fVar) {
                c(iVar, fVar);
                return Unit.f312394a;
            }
        }

        public static final class d implements Function2<i, r, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f87706a = new d();

            public final void c(i iVar, r rVar) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(i iVar, r rVar) {
                c(iVar, rVar);
                return Unit.f312394a;
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<i, Unit> f87707c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<i, Unit> f87708d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function2<i, coil.request.f, Unit> f87709e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<i, r, Unit> f87710f;

            /* JADX WARN: Multi-variable type inference failed */
            public e(Function1<? super i, Unit> function1, Function1<? super i, Unit> function2, Function2<? super i, ? super coil.request.f, Unit> function3, Function2<? super i, ? super r, Unit> function4) {
                this.f87707c = function1;
                this.f87708d = function2;
                this.f87709e = function3;
                this.f87710f = function4;
            }

            @Override // coil.request.i.b
            public void onCancel(i iVar) {
                this.f87708d.invoke(iVar);
            }

            @Override // coil.request.i.b
            public void onError(i iVar, coil.request.f fVar) {
                this.f87709e.invoke(iVar, fVar);
            }

            @Override // coil.request.i.b
            public void onStart(i iVar) {
                this.f87707c.invoke(iVar);
            }

            @Override // coil.request.i.b
            public void onSuccess(i iVar, r rVar) {
                this.f87710f.invoke(iVar, rVar);
            }
        }

        public static final class f implements Function1<Drawable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f87711a = new f();

            public final void c(Drawable drawable) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                c(drawable);
                return Unit.f312394a;
            }
        }

        public static final class g implements Function1<Drawable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f87712a = new g();

            public final void c(Drawable drawable) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                c(drawable);
                return Unit.f312394a;
            }
        }

        public static final class h implements Function1<Drawable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f87713a = new h();

            public final void c(Drawable drawable) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                c(drawable);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: coil.request.i$a$i, reason: collision with other inner class name */
        public static final class C0821i implements coil.target.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Drawable, Unit> f87714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Drawable, Unit> f87715b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Drawable, Unit> f87716c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0821i(Function1<? super Drawable, Unit> function1, Function1<? super Drawable, Unit> function2, Function1<? super Drawable, Unit> function3) {
                this.f87714a = function1;
                this.f87715b = function2;
                this.f87716c = function3;
            }

            @Override // coil.target.c
            public void onError(Drawable drawable) {
                this.f87715b.invoke(drawable);
            }

            @Override // coil.target.c
            public void onStart(Drawable drawable) {
                this.f87714a.invoke(drawable);
            }

            @Override // coil.target.c
            public void onSuccess(Drawable drawable) {
                this.f87716c.invoke(drawable);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @oj.j
        public a(@NotNull i iVar) {
            this(iVar, null, 2, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ a F(a aVar, Function1 function1, Function1 function2, Function2 function3, Function2 function4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = C0820a.f87703a;
            }
            if ((i10 & 2) != 0) {
                function2 = b.f87704a;
            }
            if ((i10 & 4) != 0) {
                function3 = c.f87705a;
            }
            if ((i10 & 8) != 0) {
                function4 = d.f87706a;
            }
            return aVar.D(new e(function1, function2, function3, function4));
        }

        private final void T() {
            this.O = null;
        }

        private final void U() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final c0 V() {
            coil.target.c cVar = this.f87680d;
            c0 c0VarC = coil.util.d.c(cVar instanceof coil.target.d ? ((coil.target.d) cVar).getView().getContext() : this.f87677a);
            return c0VarC == null ? coil.request.h.f87649b : c0VarC;
        }

        private final coil.size.h W() {
            View view;
            coil.size.j jVar = this.K;
            View view2 = null;
            coil.size.l lVar = jVar instanceof coil.size.l ? (coil.size.l) jVar : null;
            if (lVar == null || (view = lVar.getView()) == null) {
                coil.target.c cVar = this.f87680d;
                coil.target.d dVar = cVar instanceof coil.target.d ? (coil.target.d) cVar : null;
                if (dVar != null) {
                    view2 = dVar.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? coil.util.l.v((ImageView) view2) : coil.size.h.FIT;
        }

        private final coil.size.j X() {
            ImageView.ScaleType scaleType;
            coil.target.c cVar = this.f87680d;
            if (!(cVar instanceof coil.target.d)) {
                return new coil.size.d(this.f87677a);
            }
            View view = ((coil.target.d) cVar).getView();
            return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? coil.size.k.a(coil.size.i.f87783d) : coil.size.m.c(view, false, 2, null);
        }

        public static /* synthetic */ a c0(a aVar, String str, Object obj, String str2, int i10, Object obj2) {
            if ((i10 & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return aVar.b0(str, obj, str2);
        }

        public static /* synthetic */ a o0(a aVar, Function1 function1, Function1 function2, Function1 function3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = f.f87711a;
            }
            if ((i10 & 2) != 0) {
                function2 = g.f87712a;
            }
            if ((i10 & 4) != 0) {
                function3 = h.f87713a;
            }
            return aVar.m0(new C0821i(function1, function2, function3));
        }

        @NotNull
        public final a A(@NotNull n0 n0Var) {
            this.f87700x = n0Var;
            return this;
        }

        @NotNull
        public final a B(@Nullable c0 c0Var) {
            this.J = c0Var;
            return this;
        }

        @NotNull
        public final a C(@Nullable o0 o0Var) {
            return B(o0Var != null ? o0Var.getLifecycle() : null);
        }

        @NotNull
        public final a D(@Nullable b bVar) {
            this.f87681e = bVar;
            return this;
        }

        @NotNull
        public final a E(@NotNull Function1<? super i, Unit> function1, @NotNull Function1<? super i, Unit> function2, @NotNull Function2<? super i, ? super coil.request.f, Unit> function3, @NotNull Function2<? super i, ? super r, Unit> function4) {
            return D(new e(function1, function2, function3, function4));
        }

        @NotNull
        public final a G(@Nullable MemoryCache.Key key) {
            this.f87682f = key;
            return this;
        }

        @NotNull
        public final a H(@Nullable String str) {
            return G(str != null ? new MemoryCache.Key(str, null, 2, null) : null);
        }

        @NotNull
        public final a I(@NotNull coil.request.b bVar) {
            this.f87697u = bVar;
            return this;
        }

        @NotNull
        public final a J(@NotNull coil.request.b bVar) {
            this.f87699w = bVar;
            return this;
        }

        @NotNull
        public final a K(@NotNull o oVar) {
            this.B = oVar.l();
            return this;
        }

        @NotNull
        public final a L(@androidx.annotation.v int i10) {
            this.D = Integer.valueOf(i10);
            this.E = null;
            return this;
        }

        @NotNull
        public final a M(@Nullable Drawable drawable) {
            this.E = drawable;
            this.D = 0;
            return this;
        }

        @NotNull
        public final a N(@Nullable MemoryCache.Key key) {
            this.C = key;
            return this;
        }

        @NotNull
        public final a O(@Nullable String str) {
            return N(str != null ? new MemoryCache.Key(str, null, 2, null) : null);
        }

        @NotNull
        public final a P(@NotNull coil.size.e eVar) {
            this.f87686j = eVar;
            return this;
        }

        @NotNull
        public final a Q(boolean z10) {
            this.f87696t = z10;
            return this;
        }

        @NotNull
        public final a R(@NotNull String str) {
            okhttp3.u.a aVar = this.f87691o;
            if (aVar != null) {
                aVar.l(str);
            }
            return this;
        }

        @NotNull
        public final a S(@NotNull String str) {
            o.a aVar = this.B;
            if (aVar != null) {
                aVar.b(str);
            }
            return this;
        }

        @NotNull
        public final a Y(@NotNull coil.size.h hVar) {
            this.L = hVar;
            return this;
        }

        @NotNull
        public final a Z(@NotNull String str, @NotNull String str2) {
            okhttp3.u.a aVar = this.f87691o;
            if (aVar == null) {
                aVar = new okhttp3.u.a();
                this.f87691o = aVar;
            }
            aVar.m(str, str2);
            return this;
        }

        @NotNull
        public final a a(@NotNull String str, @NotNull String str2) {
            okhttp3.u.a aVar = this.f87691o;
            if (aVar == null) {
                aVar = new okhttp3.u.a();
                this.f87691o = aVar;
            }
            aVar.b(str, str2);
            return this;
        }

        @oj.j
        @NotNull
        public final a a0(@NotNull String str, @Nullable Object obj) {
            int i10 = 1 << 0;
            return c0(this, str, obj, null, 4, null);
        }

        @NotNull
        public final a b(boolean z10) {
            this.f87693q = z10;
            return this;
        }

        @oj.j
        @NotNull
        public final a b0(@NotNull String str, @Nullable Object obj, @Nullable String str2) {
            o.a aVar = this.B;
            if (aVar == null) {
                aVar = new o.a();
                this.B = aVar;
            }
            aVar.d(str, obj, str2);
            return this;
        }

        @NotNull
        public final a c(boolean z10) {
            this.f87694r = Boolean.valueOf(z10);
            return this;
        }

        @NotNull
        public final a d(boolean z10) {
            this.f87695s = Boolean.valueOf(z10);
            return this;
        }

        @NotNull
        public final a d0(@t0 int i10) {
            return e0(i10, i10);
        }

        @NotNull
        public final a e(@NotNull Bitmap.Config config) {
            this.f87684h = config;
            return this;
        }

        @NotNull
        public final a e0(@t0 int i10, @t0 int i11) {
            return g0(coil.size.b.a(i10, i11));
        }

        @NotNull
        public final i f() {
            Context context = this.f87677a;
            Object obj = this.f87679c;
            if (obj == null) {
                obj = k.f87717a;
            }
            coil.target.c cVar = this.f87680d;
            b bVar = this.f87681e;
            MemoryCache.Key key = this.f87682f;
            String str = this.f87683g;
            Bitmap.Config configE = this.f87684h;
            if (configE == null) {
                configE = this.f87678b.e();
            }
            ColorSpace colorSpace = this.f87685i;
            coil.size.e eVarO = this.f87686j;
            if (eVarO == null) {
                eVarO = this.f87678b.o();
            }
            Pair<? extends coil.fetch.h.a<?>, ? extends Class<?>> pair = this.f87687k;
            coil.decode.h.a aVar = this.f87688l;
            List<? extends q4.e> list = this.f87689m;
            coil.transition.c.a aVarQ = this.f87690n;
            if (aVarQ == null) {
                aVarQ = this.f87678b.q();
            }
            okhttp3.u.a aVar2 = this.f87691o;
            okhttp3.u uVarG = coil.util.l.G(aVar2 != null ? aVar2.i() : null);
            Map<Class<?>, ? extends Object> map = this.f87692p;
            s sVarF = coil.util.l.F(map != null ? s.f87750b.a(map) : null);
            boolean z10 = this.f87693q;
            Boolean bool = this.f87694r;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f87678b.c();
            Boolean bool2 = this.f87695s;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.f87678b.d();
            boolean z11 = this.f87696t;
            coil.request.b bVarL = this.f87697u;
            if (bVarL == null) {
                bVarL = this.f87678b.l();
            }
            coil.request.b bVar2 = bVarL;
            coil.request.b bVarG = this.f87698v;
            if (bVarG == null) {
                bVarG = this.f87678b.g();
            }
            coil.request.b bVar3 = bVarG;
            coil.request.b bVarM = this.f87699w;
            if (bVarM == null) {
                bVarM = this.f87678b.m();
            }
            coil.request.b bVar4 = bVarM;
            n0 n0VarK = this.f87700x;
            if (n0VarK == null) {
                n0VarK = this.f87678b.k();
            }
            n0 n0Var = n0VarK;
            n0 n0VarJ = this.f87701y;
            if (n0VarJ == null) {
                n0VarJ = this.f87678b.j();
            }
            n0 n0Var2 = n0VarJ;
            n0 n0VarF = this.f87702z;
            if (n0VarF == null) {
                n0VarF = this.f87678b.f();
            }
            n0 n0Var3 = n0VarF;
            n0 n0VarP = this.A;
            if (n0VarP == null) {
                n0VarP = this.f87678b.p();
            }
            n0 n0Var4 = n0VarP;
            c0 c0VarV = this.J;
            if (c0VarV == null && (c0VarV = this.M) == null) {
                c0VarV = V();
            }
            c0 c0Var = c0VarV;
            coil.size.j jVarX = this.K;
            if (jVarX == null && (jVarX = this.N) == null) {
                jVarX = X();
            }
            coil.size.j jVar = jVarX;
            coil.size.h hVarW = this.L;
            if (hVarW == null && (hVarW = this.O) == null) {
                hVarW = W();
            }
            coil.size.h hVar = hVarW;
            o.a aVar3 = this.B;
            return new i(context, obj, cVar, bVar, key, str, configE, colorSpace, eVarO, pair, aVar, list, aVarQ, uVarG, sVarF, z10, zBooleanValue, zBooleanValue2, z11, bVar2, bVar3, bVar4, n0Var, n0Var2, n0Var3, n0Var4, c0Var, jVar, hVar, coil.util.l.E(aVar3 != null ? aVar3.a() : null), this.C, this.D, this.E, this.F, this.G, this.H, this.I, new coil.request.d(this.J, this.K, this.L, this.f87700x, this.f87701y, this.f87702z, this.A, this.f87690n, this.f87686j, this.f87684h, this.f87694r, this.f87695s, this.f87697u, this.f87698v, this.f87699w), this.f87678b, null);
        }

        @NotNull
        public final a f0(@NotNull coil.size.c cVar, @NotNull coil.size.c cVar2) {
            return g0(new coil.size.i(cVar, cVar2));
        }

        @w0(26)
        @NotNull
        public final a g(@NotNull ColorSpace colorSpace) {
            this.f87685i = colorSpace;
            return this;
        }

        @NotNull
        public final a g0(@NotNull coil.size.i iVar) {
            return h0(coil.size.k.a(iVar));
        }

        @NotNull
        public final a h(int i10) {
            coil.transition.c.a c0822a;
            if (i10 > 0) {
                c0822a = new coil.transition.a.C0822a(i10, false, 2, null);
            } else {
                c0822a = coil.transition.c.a.f87804b;
            }
            t0(c0822a);
            return this;
        }

        @NotNull
        public final a h0(@NotNull coil.size.j jVar) {
            this.K = jVar;
            U();
            return this;
        }

        @NotNull
        public final a i(boolean z10) {
            return h(z10 ? 100 : 0);
        }

        @NotNull
        public final <T> a i0(@NotNull Class<? super T> cls, @Nullable T t10) {
            if (t10 == null) {
                Map<Class<?>, Object> map = this.f87692p;
                if (map != null) {
                    map.remove(cls);
                }
                return this;
            }
            Map linkedHashMap = this.f87692p;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f87692p = linkedHashMap;
            }
            T tCast = cls.cast(t10);
            Intrinsics.checkNotNull(tCast);
            linkedHashMap.put(cls, tCast);
            return this;
        }

        @NotNull
        public final a j(@Nullable Object obj) {
            this.f87679c = obj;
            return this;
        }

        public final /* synthetic */ <T> a j0(T t10) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return i0(Object.class, t10);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Migrate to 'decoderFactory'.", replaceWith = @b1(expression = "decoderFactory { _, _, _ -> decoder }", imports = {}))
        @NotNull
        public final a k(@NotNull coil.decode.h hVar) {
            coil.util.l.K();
            throw new a0();
        }

        @NotNull
        public final a k0(@NotNull s sVar) {
            this.f87692p = MapsKt.toMutableMap(sVar.a());
            return this;
        }

        @NotNull
        public final a l(@NotNull n0 n0Var) {
            this.f87702z = n0Var;
            return this;
        }

        @NotNull
        public final a l0(@NotNull ImageView imageView) {
            return m0(new coil.target.b(imageView));
        }

        @NotNull
        public final a m(@NotNull coil.decode.h.a aVar) {
            this.f87688l = aVar;
            return this;
        }

        @NotNull
        public final a m0(@Nullable coil.target.c cVar) {
            this.f87680d = cVar;
            U();
            return this;
        }

        @NotNull
        public final a n(@NotNull coil.request.c cVar) {
            this.f87678b = cVar;
            T();
            return this;
        }

        @NotNull
        public final a n0(@NotNull Function1<? super Drawable, Unit> function1, @NotNull Function1<? super Drawable, Unit> function2, @NotNull Function1<? super Drawable, Unit> function3) {
            return m0(new C0821i(function1, function2, function3));
        }

        @NotNull
        public final a o(@Nullable String str) {
            this.f87683g = str;
            return this;
        }

        @NotNull
        public final a p(@NotNull coil.request.b bVar) {
            this.f87698v = bVar;
            return this;
        }

        @NotNull
        public final a p0(@NotNull n0 n0Var) {
            this.A = n0Var;
            return this;
        }

        @NotNull
        public final a q(@NotNull n0 n0Var) {
            this.f87701y = n0Var;
            this.f87702z = n0Var;
            this.A = n0Var;
            return this;
        }

        @NotNull
        public final a q0(@NotNull List<? extends q4.e> list) {
            this.f87689m = coil.util.c.g(list);
            return this;
        }

        @NotNull
        public final a r(@androidx.annotation.v int i10) {
            this.F = Integer.valueOf(i10);
            this.G = null;
            return this;
        }

        @NotNull
        public final a r0(@NotNull q4.e... eVarArr) {
            return q0(ArraysKt.toList(eVarArr));
        }

        @NotNull
        public final a s(@Nullable Drawable drawable) {
            this.G = drawable;
            this.F = 0;
            return this;
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @b1(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @NotNull
        public final a s0(@NotNull coil.transition.c cVar) {
            coil.util.l.K();
            throw new a0();
        }

        @NotNull
        public final a t(@androidx.annotation.v int i10) {
            this.H = Integer.valueOf(i10);
            this.I = null;
            return this;
        }

        @NotNull
        public final a t0(@NotNull coil.transition.c.a aVar) {
            this.f87690n = aVar;
            return this;
        }

        @NotNull
        public final a u(@Nullable Drawable drawable) {
            this.I = drawable;
            this.H = 0;
            return this;
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Migrate to 'fetcherFactory'.", replaceWith = @b1(expression = "fetcherFactory<Any> { _, _, _ -> fetcher }", imports = {}))
        @NotNull
        public final a v(@NotNull coil.fetch.h hVar) {
            coil.util.l.K();
            throw new a0();
        }

        @NotNull
        public final a w(@NotNull n0 n0Var) {
            this.f87701y = n0Var;
            return this;
        }

        public final /* synthetic */ <T> a x(coil.fetch.h.a<T> aVar) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return y(aVar, Object.class);
        }

        @NotNull
        public final <T> a y(@NotNull coil.fetch.h.a<T> aVar, @NotNull Class<T> cls) {
            this.f87687k = TuplesKt.to(aVar, cls);
            return this;
        }

        @NotNull
        public final a z(@NotNull okhttp3.u uVar) {
            this.f87691o = uVar.s();
            return this;
        }

        public a(@NotNull Context context) {
            this.f87677a = context;
            this.f87678b = coil.util.k.b();
            this.f87679c = null;
            this.f87680d = null;
            this.f87681e = null;
            this.f87682f = null;
            this.f87683g = null;
            this.f87684h = null;
            this.f87685i = null;
            this.f87686j = null;
            this.f87687k = null;
            this.f87688l = null;
            this.f87689m = CollectionsKt.emptyList();
            this.f87690n = null;
            this.f87691o = null;
            this.f87692p = null;
            this.f87693q = true;
            this.f87694r = null;
            this.f87695s = null;
            this.f87696t = true;
            this.f87697u = null;
            this.f87698v = null;
            this.f87699w = null;
            this.f87700x = null;
            this.f87701y = null;
            this.f87702z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        @oj.j
        public a(@NotNull i iVar, @NotNull Context context) {
            this.f87677a = context;
            this.f87678b = iVar.p();
            this.f87679c = iVar.m();
            this.f87680d = iVar.M();
            this.f87681e = iVar.A();
            this.f87682f = iVar.B();
            this.f87683g = iVar.r();
            this.f87684h = iVar.q().e();
            this.f87685i = iVar.k();
            this.f87686j = iVar.q().m();
            this.f87687k = iVar.w();
            this.f87688l = iVar.o();
            this.f87689m = iVar.O();
            this.f87690n = iVar.q().q();
            this.f87691o = iVar.x().s();
            this.f87692p = MapsKt.toMutableMap(iVar.L().a());
            this.f87693q = iVar.g();
            this.f87694r = iVar.q().c();
            this.f87695s = iVar.q().d();
            this.f87696t = iVar.I();
            this.f87697u = iVar.q().k();
            this.f87698v = iVar.q().g();
            this.f87699w = iVar.q().l();
            this.f87700x = iVar.q().i();
            this.f87701y = iVar.q().h();
            this.f87702z = iVar.q().f();
            this.A = iVar.q().p();
            this.B = iVar.E().l();
            this.C = iVar.G();
            this.D = iVar.F;
            this.E = iVar.G;
            this.F = iVar.H;
            this.G = iVar.I;
            this.H = iVar.J;
            this.I = iVar.K;
            this.J = iVar.q().j();
            this.K = iVar.q().o();
            this.L = iVar.q().n();
            if (iVar.l() == context) {
                this.M = iVar.z();
                this.N = iVar.K();
                this.O = iVar.J();
            } else {
                this.M = null;
                this.N = null;
                this.O = null;
            }
        }

        public /* synthetic */ a(i iVar, Context context, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(iVar, (i10 & 2) != 0 ? iVar.l() : context);
        }
    }

    public interface b {

        public static final class a {
            @l0
            @Deprecated
            public static void a(@NotNull b bVar, @NotNull i iVar) {
                b.super.onCancel(iVar);
            }

            @l0
            @Deprecated
            public static void b(@NotNull b bVar, @NotNull i iVar, @NotNull f fVar) {
                b.super.onError(iVar, fVar);
            }

            @l0
            @Deprecated
            public static void c(@NotNull b bVar, @NotNull i iVar) {
                b.super.onStart(iVar);
            }

            @l0
            @Deprecated
            public static void d(@NotNull b bVar, @NotNull i iVar, @NotNull r rVar) {
                b.super.onSuccess(iVar, rVar);
            }
        }

        @l0
        default void onCancel(@NotNull i iVar) {
        }

        @l0
        default void onError(@NotNull i iVar, @NotNull f fVar) {
        }

        @l0
        default void onStart(@NotNull i iVar) {
        }

        @l0
        default void onSuccess(@NotNull i iVar, @NotNull r rVar) {
        }
    }

    public /* synthetic */ i(Context context, Object obj, coil.target.c cVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, coil.size.e eVar, Pair pair, coil.decode.h.a aVar, List list, coil.transition.c.a aVar2, okhttp3.u uVar, s sVar, boolean z10, boolean z11, boolean z12, boolean z13, coil.request.b bVar2, coil.request.b bVar3, coil.request.b bVar4, n0 n0Var, n0 n0Var2, n0 n0Var3, n0 n0Var4, c0 c0Var, coil.size.j jVar, coil.size.h hVar, o oVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar, c cVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cVar, bVar, key, str, config, colorSpace, eVar, pair, aVar, list, aVar2, uVar, sVar, z10, z11, z12, z13, bVar2, bVar3, bVar4, n0Var, n0Var2, n0Var3, n0Var4, c0Var, jVar, hVar, oVar, key2, num, drawable, num2, drawable2, num3, drawable3, dVar, cVar2);
    }

    public static /* synthetic */ a S(i iVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = iVar.f87651a;
        }
        return iVar.R(context);
    }

    @Nullable
    public final b A() {
        return this.f87654d;
    }

    @Nullable
    public final MemoryCache.Key B() {
        return this.f87655e;
    }

    @NotNull
    public final coil.request.b C() {
        return this.f87670t;
    }

    @NotNull
    public final coil.request.b D() {
        return this.f87672v;
    }

    @NotNull
    public final o E() {
        return this.D;
    }

    @Nullable
    public final Drawable F() {
        return coil.util.k.c(this, this.G, this.F, this.M.n());
    }

    @Nullable
    public final MemoryCache.Key G() {
        return this.E;
    }

    @NotNull
    public final coil.size.e H() {
        return this.f87659i;
    }

    public final boolean I() {
        return this.f87669s;
    }

    @NotNull
    public final coil.size.h J() {
        return this.C;
    }

    @NotNull
    public final coil.size.j K() {
        return this.B;
    }

    @NotNull
    public final s L() {
        return this.f87665o;
    }

    @Nullable
    public final coil.target.c M() {
        return this.f87653c;
    }

    @NotNull
    public final n0 N() {
        return this.f87676z;
    }

    @NotNull
    public final List<q4.e> O() {
        return this.f87662l;
    }

    @NotNull
    public final coil.transition.c.a P() {
        return this.f87663m;
    }

    @oj.j
    @NotNull
    public final a Q() {
        return S(this, null, 1, null);
    }

    @oj.j
    @NotNull
    public final a R(@NotNull Context context) {
        return new a(this, context);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Intrinsics.areEqual(this.f87651a, iVar.f87651a) && Intrinsics.areEqual(this.f87652b, iVar.f87652b) && Intrinsics.areEqual(this.f87653c, iVar.f87653c) && Intrinsics.areEqual(this.f87654d, iVar.f87654d) && Intrinsics.areEqual(this.f87655e, iVar.f87655e) && Intrinsics.areEqual(this.f87656f, iVar.f87656f) && this.f87657g == iVar.f87657g && Intrinsics.areEqual(this.f87658h, iVar.f87658h) && this.f87659i == iVar.f87659i && Intrinsics.areEqual(this.f87660j, iVar.f87660j) && Intrinsics.areEqual(this.f87661k, iVar.f87661k) && Intrinsics.areEqual(this.f87662l, iVar.f87662l) && Intrinsics.areEqual(this.f87663m, iVar.f87663m) && Intrinsics.areEqual(this.f87664n, iVar.f87664n) && Intrinsics.areEqual(this.f87665o, iVar.f87665o) && this.f87666p == iVar.f87666p && this.f87667q == iVar.f87667q && this.f87668r == iVar.f87668r && this.f87669s == iVar.f87669s && this.f87670t == iVar.f87670t && this.f87671u == iVar.f87671u && this.f87672v == iVar.f87672v && Intrinsics.areEqual(this.f87673w, iVar.f87673w) && Intrinsics.areEqual(this.f87674x, iVar.f87674x) && Intrinsics.areEqual(this.f87675y, iVar.f87675y) && Intrinsics.areEqual(this.f87676z, iVar.f87676z) && Intrinsics.areEqual(this.E, iVar.E) && Intrinsics.areEqual(this.F, iVar.F) && Intrinsics.areEqual(this.G, iVar.G) && Intrinsics.areEqual(this.H, iVar.H) && Intrinsics.areEqual(this.I, iVar.I) && Intrinsics.areEqual(this.J, iVar.J) && Intrinsics.areEqual(this.K, iVar.K) && Intrinsics.areEqual(this.A, iVar.A) && Intrinsics.areEqual(this.B, iVar.B) && this.C == iVar.C && Intrinsics.areEqual(this.D, iVar.D) && Intrinsics.areEqual(this.L, iVar.L) && Intrinsics.areEqual(this.M, iVar.M)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return this.f87666p;
    }

    public final boolean h() {
        return this.f87667q;
    }

    public int hashCode() {
        int iHashCode = ((this.f87651a.hashCode() * 31) + this.f87652b.hashCode()) * 31;
        coil.target.c cVar = this.f87653c;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        b bVar = this.f87654d;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f87655e;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f87656f;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.f87657g.hashCode()) * 31;
        ColorSpace colorSpace = this.f87658h;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f87659i.hashCode()) * 31;
        Pair<coil.fetch.h.a<?>, Class<?>> pair = this.f87660j;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        coil.decode.h.a aVar = this.f87661k;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f87662l.hashCode()) * 31) + this.f87663m.hashCode()) * 31) + this.f87664n.hashCode()) * 31) + this.f87665o.hashCode()) * 31) + Boolean.hashCode(this.f87666p)) * 31) + Boolean.hashCode(this.f87667q)) * 31) + Boolean.hashCode(this.f87668r)) * 31) + Boolean.hashCode(this.f87669s)) * 31) + this.f87670t.hashCode()) * 31) + this.f87671u.hashCode()) * 31) + this.f87672v.hashCode()) * 31) + this.f87673w.hashCode()) * 31) + this.f87674x.hashCode()) * 31) + this.f87675y.hashCode()) * 31) + this.f87676z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        MemoryCache.Key key2 = this.E;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.F;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        return ((((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.f87668r;
    }

    @NotNull
    public final Bitmap.Config j() {
        return this.f87657g;
    }

    @Nullable
    public final ColorSpace k() {
        return this.f87658h;
    }

    @NotNull
    public final Context l() {
        return this.f87651a;
    }

    @NotNull
    public final Object m() {
        return this.f87652b;
    }

    @NotNull
    public final n0 n() {
        return this.f87675y;
    }

    @Nullable
    public final coil.decode.h.a o() {
        return this.f87661k;
    }

    @NotNull
    public final c p() {
        return this.M;
    }

    @NotNull
    public final d q() {
        return this.L;
    }

    @Nullable
    public final String r() {
        return this.f87656f;
    }

    @NotNull
    public final coil.request.b s() {
        return this.f87671u;
    }

    @Nullable
    public final Drawable t() {
        return coil.util.k.c(this, this.I, this.H, this.M.h());
    }

    @Nullable
    public final Drawable u() {
        return coil.util.k.c(this, this.K, this.J, this.M.i());
    }

    @NotNull
    public final n0 v() {
        return this.f87674x;
    }

    @Nullable
    public final Pair<coil.fetch.h.a<?>, Class<?>> w() {
        return this.f87660j;
    }

    @NotNull
    public final okhttp3.u x() {
        return this.f87664n;
    }

    @NotNull
    public final n0 y() {
        return this.f87673w;
    }

    @NotNull
    public final c0 z() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i(Context context, Object obj, coil.target.c cVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, coil.size.e eVar, Pair<? extends coil.fetch.h.a<?>, ? extends Class<?>> pair, coil.decode.h.a aVar, List<? extends q4.e> list, coil.transition.c.a aVar2, okhttp3.u uVar, s sVar, boolean z10, boolean z11, boolean z12, boolean z13, coil.request.b bVar2, coil.request.b bVar3, coil.request.b bVar4, n0 n0Var, n0 n0Var2, n0 n0Var3, n0 n0Var4, c0 c0Var, coil.size.j jVar, coil.size.h hVar, o oVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar, c cVar2) {
        this.f87651a = context;
        this.f87652b = obj;
        this.f87653c = cVar;
        this.f87654d = bVar;
        this.f87655e = key;
        this.f87656f = str;
        this.f87657g = config;
        this.f87658h = colorSpace;
        this.f87659i = eVar;
        this.f87660j = pair;
        this.f87661k = aVar;
        this.f87662l = list;
        this.f87663m = aVar2;
        this.f87664n = uVar;
        this.f87665o = sVar;
        this.f87666p = z10;
        this.f87667q = z11;
        this.f87668r = z12;
        this.f87669s = z13;
        this.f87670t = bVar2;
        this.f87671u = bVar3;
        this.f87672v = bVar4;
        this.f87673w = n0Var;
        this.f87674x = n0Var2;
        this.f87675y = n0Var3;
        this.f87676z = n0Var4;
        this.A = c0Var;
        this.B = jVar;
        this.C = hVar;
        this.D = oVar;
        this.E = key2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = dVar;
        this.M = cVar2;
    }
}
