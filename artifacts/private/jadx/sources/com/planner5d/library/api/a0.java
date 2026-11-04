package com.planner5d.library.api;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.q0;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUriHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriHandler.kt\ncom/planner5d/library/api/UriHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f142216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Pattern f142217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f142218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f142219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f142220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f142221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f142222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f142223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final f0 f142224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final f0 f142225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f142226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final f0 f142227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final f0 f142228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final f0 f142229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final f0 f142230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final f0 f142231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final f0 f142232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final f0 f142233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final f0 f142234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final a f142209t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f142210u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f142211v = Pattern.compile("^(/[a-z]{1,3}|)/gallery/?$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f142212w = Pattern.compile("^(/[a-z]{1,3}|)/gallery/" + q0.c.ideas + "/(.+)$");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f142213x = Pattern.compile("^(/[a-z]{1,3}|)/gallery/floorplans/(.+)$");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f142214y = Pattern.compile("^/subscribe$");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f142215z = Pattern.compile("^/blog/(.+)$");
    private static final Pattern A = Pattern.compile("^/(.+)/blog/(.+)$");
    private static final Pattern B = Pattern.compile("^/editor$");
    private static final Pattern C = Pattern.compile("^/dashboard$");
    private static final Pattern D = Pattern.compile("^/ai$");
    private static final Pattern E = Pattern.compile("^/ai/chat-bot$");
    private static final Pattern F = Pattern.compile("^/ai/design-generator$");
    private static final Pattern G = Pattern.compile("^/project-creation$");
    private static final Pattern H = Pattern.compile("^/catalog$");
    private static final Pattern I = Pattern.compile("^/pricing$");
    private static final Pattern J = Pattern.compile("^/price/pro$");
    private static final Pattern K = Pattern.compile("^/smart-wizard$");
    private static final Pattern L = Pattern.compile("^/in-app-review$");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.UriHandler$getProjectHash$1", f = "UriHandler.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142235a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f142237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f142238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f142239e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.UriHandler$getProjectHash$1$1", f = "UriHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f142240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f142241b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f142242c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super String, Unit> function1, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f142241b = function1;
                this.f142242c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f142241b, this.f142242c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f142240a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f142241b.invoke(this.f142242c);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Context context, q0 q0Var, Function1<? super String, Unit> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f142237c = context;
            this.f142238d = q0Var;
            this.f142239e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new b(this.f142237c, this.f142238d, this.f142239e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142235a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    String strV = a0.this.v(this.f142237c, this.f142238d);
                    a3 a3VarA = com.planner5d.library.services.utility.s.f229729a.a();
                    a aVar = new a(this.f142239e, strV, null);
                    this.f142235a = 1;
                    if (kotlinx.coroutines.i.h(a3VarA, aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a0(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f142216a = uri;
        this.f142218c = g0.c(new Function0() { // from class: com.planner5d.library.api.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.V(this.f142346a));
            }
        });
        this.f142219d = g0.c(new Function0() { // from class: com.planner5d.library.api.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.k0(this.f142279a);
            }
        });
        this.f142220e = g0.c(new Function0() { // from class: com.planner5d.library.api.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.f0(this.f142280a));
            }
        });
        this.f142221f = g0.c(new Function0() { // from class: com.planner5d.library.api.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.S(this.f142281a));
            }
        });
        this.f142222g = g0.c(new Function0() { // from class: com.planner5d.library.api.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.Q(this.f142282a));
            }
        });
        this.f142223h = g0.c(new Function0() { // from class: com.planner5d.library.api.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.M(this.f142283a));
            }
        });
        this.f142224i = g0.c(new Function0() { // from class: com.planner5d.library.api.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.h0(this.f142284a));
            }
        });
        this.f142225j = g0.c(new Function0() { // from class: com.planner5d.library.api.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.E(this.f142285a));
            }
        });
        this.f142226k = g0.c(new Function0() { // from class: com.planner5d.library.api.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.O(this.f142286a));
            }
        });
        this.f142227l = g0.c(new Function0() { // from class: com.planner5d.library.api.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.K(this.f142287a));
            }
        });
        this.f142228m = g0.c(new Function0() { // from class: com.planner5d.library.api.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.G(this.f142438a));
            }
        });
        this.f142229n = g0.c(new Function0() { // from class: com.planner5d.library.api.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.I(this.f142439a));
            }
        });
        this.f142230o = g0.c(new Function0() { // from class: com.planner5d.library.api.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.b0(this.f142440a));
            }
        });
        this.f142231p = g0.c(new Function0() { // from class: com.planner5d.library.api.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.d0(this.f142441a));
            }
        });
        this.f142232q = g0.c(new Function0() { // from class: com.planner5d.library.api.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.X(this.f142442a));
            }
        });
        this.f142233r = g0.c(new Function0() { // from class: com.planner5d.library.api.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.t(this.f142443a);
            }
        });
        this.f142234s = g0.c(new Function0() { // from class: com.planner5d.library.api.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.u(this.f142444a);
            }
        });
    }

    private final Pattern A(Context context) {
        Pattern pattern = this.f142217b;
        if (pattern != null) {
            return pattern;
        }
        String string = context.getString(com.planner5d.library.f.s.hu);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (string.length() == 0) {
            string = "(/[a-z]{1,3}|)";
        }
        Pattern patternCompile = Pattern.compile("^" + string + "/(editor|view|v)/?$");
        this.f142217b = patternCompile;
        return patternCompile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(a0 a0Var) {
        Pattern PATTERN_BERNARD_CHAT = E;
        Intrinsics.checkNotNullExpressionValue(PATTERN_BERNARD_CHAT, "PATTERN_BERNARD_CHAT");
        return a0Var.i0(PATTERN_BERNARD_CHAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(a0 a0Var) {
        Pattern PATTERN_CATALOG = H;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CATALOG, "PATTERN_CATALOG");
        return a0Var.i0(PATTERN_CATALOG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(a0 a0Var) {
        Pattern PATTERN_COMPARE_PLANS = I;
        Intrinsics.checkNotNullExpressionValue(PATTERN_COMPARE_PLANS, "PATTERN_COMPARE_PLANS");
        return a0Var.i0(PATTERN_COMPARE_PLANS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(a0 a0Var) {
        Pattern PATTERN_CREATE_PROJECT = G;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CREATE_PROJECT, "PATTERN_CREATE_PROJECT");
        return a0Var.i0(PATTERN_CREATE_PROJECT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(a0 a0Var) {
        Pattern PATTERN_DASHBOARD = C;
        Intrinsics.checkNotNullExpressionValue(PATTERN_DASHBOARD, "PATTERN_DASHBOARD");
        return a0Var.i0(PATTERN_DASHBOARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(a0 a0Var) {
        Pattern PATTERN_DESIGN_GENERATOR = F;
        Intrinsics.checkNotNullExpressionValue(PATTERN_DESIGN_GENERATOR, "PATTERN_DESIGN_GENERATOR");
        return a0Var.i0(PATTERN_DESIGN_GENERATOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(a0 a0Var) {
        Pattern PATTERN_EDITOR = B;
        Intrinsics.checkNotNullExpressionValue(PATTERN_EDITOR, "PATTERN_EDITOR");
        if (!a0Var.i0(PATTERN_EDITOR)) {
            return false;
        }
        String queryParameter = a0Var.f142216a.getQueryParameter("key");
        return queryParameter == null || queryParameter.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(a0 a0Var) {
        Pattern PATTERN_FEED_BLOG = f142215z;
        Intrinsics.checkNotNullExpressionValue(PATTERN_FEED_BLOG, "PATTERN_FEED_BLOG");
        if (!a0Var.i0(PATTERN_FEED_BLOG)) {
            Pattern PATTERN_FEED_LANG_BLOG = A;
            Intrinsics.checkNotNullExpressionValue(PATTERN_FEED_LANG_BLOG, "PATTERN_FEED_LANG_BLOG");
            if (!a0Var.i0(PATTERN_FEED_LANG_BLOG)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(a0 a0Var) {
        Pattern PATTERN_GALLERY = f142211v;
        Intrinsics.checkNotNullExpressionValue(PATTERN_GALLERY, "PATTERN_GALLERY");
        return a0Var.i0(PATTERN_GALLERY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(a0 a0Var) {
        Pattern PATTERN_IN_APP_REVIEW = L;
        Intrinsics.checkNotNullExpressionValue(PATTERN_IN_APP_REVIEW, "PATTERN_IN_APP_REVIEW");
        return a0Var.i0(PATTERN_IN_APP_REVIEW);
    }

    private final boolean Y(String str) {
        if (str.length() != 2 && !StringsKt.V2(str, "-", false, 2, null) && !StringsKt.V2(str, "_", false, 2, null)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b0(a0 a0Var) {
        Pattern PATTERN_PRO_PAYWALL = J;
        Intrinsics.checkNotNullExpressionValue(PATTERN_PRO_PAYWALL, "PATTERN_PRO_PAYWALL");
        return a0Var.i0(PATTERN_PRO_PAYWALL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d0(a0 a0Var) {
        Pattern PATTERN_SMART_WIZARD = K;
        Intrinsics.checkNotNullExpressionValue(PATTERN_SMART_WIZARD, "PATTERN_SMART_WIZARD");
        return a0Var.i0(PATTERN_SMART_WIZARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f0(a0 a0Var) {
        Pattern PATTERN_SUBSCRIBE = f142214y;
        Intrinsics.checkNotNullExpressionValue(PATTERN_SUBSCRIBE, "PATTERN_SUBSCRIBE");
        return a0Var.i0(PATTERN_SUBSCRIBE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h0(a0 a0Var) {
        Pattern PATTERN_UPLOAD_PLAN = D;
        Intrinsics.checkNotNullExpressionValue(PATTERN_UPLOAD_PLAN, "PATTERN_UPLOAD_PLAN");
        return a0Var.i0(PATTERN_UPLOAD_PLAN);
    }

    private final boolean i0(Pattern pattern) {
        String path = this.f142216a.getPath();
        if (path != null) {
            return pattern.matcher(path).find();
        }
        return false;
    }

    private final String j0(String str) {
        return (str == null || !StringsKt.M1(str, "/", false, 2, null)) ? str : StringsKt.C6(str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k0(a0 a0Var) {
        String path = a0Var.f142216a.getPath();
        if (path == null) {
            return null;
        }
        Matcher matcher = f142212w.matcher(path);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(2);
        List listSplit$default = strGroup != null ? StringsKt.split$default(strGroup, new String[]{"/"}, false, 0, 6, null) : null;
        if (listSplit$default == null || !(!listSplit$default.isEmpty())) {
            return null;
        }
        int i10 = 6 >> 0;
        return (String) listSplit$default.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(a0 a0Var) {
        String path = a0Var.f142216a.getPath();
        String str = null;
        if (path == null) {
            return null;
        }
        int i10 = 6 ^ 0;
        List listSplit$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
        int i11 = 3 >> 1;
        boolean zAreEqual = Intrinsics.areEqual(CollectionsKt.getOrNull(listSplit$default, 1), "blog");
        boolean zAreEqual2 = Intrinsics.areEqual(CollectionsKt.getOrNull(listSplit$default, 2), "blog");
        if (!zAreEqual || listSplit$default.size() <= 2) {
            if (zAreEqual2 && listSplit$default.size() > 3) {
                str = (String) listSplit$default.get(3);
            }
            return str;
        }
        str = (String) listSplit$default.get(2);
        if (zAreEqual && listSplit$default.size() > 3 && a0Var.Y(str)) {
            return (String) listSplit$default.get(3);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(a0 a0Var) {
        List listSplit$default;
        String strJ0 = a0Var.j0(a0Var.f142216a.getPath());
        if (strJ0 == null || (listSplit$default = StringsKt.split$default(strJ0, new String[]{"/"}, false, 0, 6, null)) == null) {
            return null;
        }
        return (String) CollectionsKt.lastOrNull(listSplit$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w(com.planner5d.library.model.h hVar) {
        if (hVar != null) {
            return hVar.f180741c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    public final void B(@NotNull Context context, @NotNull q0 manager, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        kotlinx.coroutines.k.f(f2.f314023a, com.planner5d.library.services.utility.s.f229729a.h(), null, new b(context, manager, callback, null), 2, null);
    }

    @Nullable
    public final String C() {
        return (String) this.f142219d.getValue();
    }

    public final boolean D() {
        return ((Boolean) this.f142225j.getValue()).booleanValue();
    }

    public final boolean F() {
        return ((Boolean) this.f142228m.getValue()).booleanValue();
    }

    public final boolean H() {
        return ((Boolean) this.f142229n.getValue()).booleanValue();
    }

    public final boolean J() {
        return ((Boolean) this.f142227l.getValue()).booleanValue();
    }

    public final boolean L() {
        return ((Boolean) this.f142223h.getValue()).booleanValue();
    }

    public final boolean N() {
        return ((Boolean) this.f142226k.getValue()).booleanValue();
    }

    public final boolean P() {
        return ((Boolean) this.f142222g.getValue()).booleanValue();
    }

    public final boolean R() {
        return ((Boolean) this.f142221f.getValue()).booleanValue();
    }

    public final boolean T(@NotNull q0.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String path = this.f142216a.getPath();
        String strName = q0.c.projects == type ? "floorplans" : type.name();
        if (path == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^(/[a-z]{1,3}|)/gallery/");
        sb2.append(strName);
        sb2.append("/?$");
        return Pattern.compile(sb2.toString()).matcher(path).find();
    }

    public final boolean U() {
        return ((Boolean) this.f142218c.getValue()).booleanValue();
    }

    public final boolean W() {
        return ((Boolean) this.f142232q.getValue()).booleanValue();
    }

    public final boolean Z(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(com.planner5d.library.f.s.hu);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Pattern patternCompile = Pattern.compile("^" + string + "/profile/id\\d+/auth/.+$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return i0(patternCompile);
    }

    public final boolean a0() {
        return ((Boolean) this.f142230o.getValue()).booleanValue();
    }

    public final boolean c0() {
        return ((Boolean) this.f142231p.getValue()).booleanValue();
    }

    public final boolean e0() {
        return ((Boolean) this.f142220e.getValue()).booleanValue();
    }

    public final boolean g0() {
        return ((Boolean) this.f142224i.getValue()).booleanValue();
    }

    @m1
    @Nullable
    public final String v(@NotNull Context context, @NotNull q0 manager) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        String queryParameter = this.f142216a.getQueryParameter("key");
        String path = this.f142216a.getPath();
        if (queryParameter != null && queryParameter.length() != 0 && path != null && A(context).matcher(path).find()) {
            return queryParameter;
        }
        if (path == null) {
            return null;
        }
        Matcher matcher = f142213x.matcher(path);
        if (!matcher.find()) {
            if (!StringsKt.u2(path, "/api/project/", false, 2, null)) {
                return null;
            }
            String strSubstring = path.substring(13);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return null;
        }
        int i10 = 2 | 0;
        List listSplit$default = StringsKt.split$default(strGroup, new String[]{"/"}, false, 0, 6, null);
        if (listSplit$default == null) {
            return null;
        }
        Observable<com.planner5d.library.model.h> observableN = manager.n(q0.c.projects, (String) listSplit$default.get(0));
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.api.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.w((com.planner5d.library.model.h) obj);
            }
        };
        return (String) com.planner5d.library.services.rx.i.k(observableN.map(new Func1() { // from class: com.planner5d.library.api.r
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return a0.x(function1, obj);
            }
        }));
    }

    @Nullable
    public final String y() {
        return (String) this.f142233r.getValue();
    }

    @Nullable
    public final String z() {
        return (String) this.f142234s.getValue();
    }
}
