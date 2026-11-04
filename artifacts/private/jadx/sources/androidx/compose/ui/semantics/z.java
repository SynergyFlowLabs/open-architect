package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.text.w3;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1558:1\n481#2:1559\n475#2:1560\n475#2:1561\n481#2:1562\n475#2:1563\n475#2:1564\n475#2:1565\n475#2:1566\n475#2:1567\n475#2:1568\n475#2:1569\n475#2:1570\n475#2:1571\n475#2:1572\n481#2:1573\n481#2:1574\n481#2:1575\n481#2:1576\n475#2:1577\n475#2:1578\n475#2:1579\n475#2:1580\n475#2:1581\n475#2:1582\n475#2:1583\n475#2:1584\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties\n*L\n41#1:1559\n49#1:1560\n52#1:1561\n56#1:1562\n66#1:1563\n69#1:1564\n72#1:1565\n75#1:1566\n78#1:1567\n81#1:1568\n84#1:1569\n90#1:1570\n148#1:1571\n151#1:1572\n155#1:1573\n167#1:1574\n186#1:1575\n213#1:1576\n227#1:1577\n230#1:1578\n233#1:1579\n236#1:1580\n239#1:1581\n242#1:1582\n245#1:1583\n248#1:1584\n*E\n"})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f41190a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final d0<List<String>> f41191b = new d0<>("ContentDescription", true, b.f41217a, null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final d0<String> f41192c = new d0<>("StateDescription", true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.semantics.i> f41193d = new d0<>("ProgressBarRangeInfo", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final d0<String> f41194e = new d0<>("PaneTitle", true, i.f41224a, null, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final d0<Unit> f41195f = new d0<>("SelectableGroup", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.semantics.b> f41196g = new d0<>("CollectionInfo", true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.semantics.c> f41197h = new d0<>("CollectionItemInfo", true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final d0<Unit> f41198i = new d0<>("Heading", true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final d0<Unit> f41199j = new d0<>("Disabled", true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.semantics.g> f41200k = new d0<>("LiveRegion", true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final d0<Boolean> f41201l = new d0<>("Focused", true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final d0<Boolean> f41202m = new d0<>("IsContainer", true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final d0<Boolean> f41203n = new d0<>("IsTraversalGroup", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final d0<Boolean> f41204o = new d0<>("IsSensitiveData", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final d0<Unit> f41205p = new d0<>("InvisibleToUser", e.f41220a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final d0<Unit> f41206q = new d0<>("HideFromAccessibility", d.f41219a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.autofill.u> f41207r = new d0<>("ContentType", c.f41218a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.autofill.s> f41208s = new d0<>("ContentDataType", a.f41216a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final d0<Float> f41209t = new d0<>("TraversalIndex", n.f41229a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.semantics.l> f41210u = new d0<>("HorizontalScrollAxisRange", true);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.semantics.l> f41211v = new d0<>("VerticalScrollAxisRange", true);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final d0<Unit> f41212w = new d0<>("IsPopup", true, g.f41222a, null, 8, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final d0<Unit> f41213x = new d0<>("IsDialog", true, f.f41221a, null, 8, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final d0<androidx.compose.ui.semantics.j> f41214y = new d0<>("Role", true, j.f41225a, null, 8, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final d0<String> f41215z = new d0<>("TestTag", false, l.f41227a, null, 8, null);

    @NotNull
    private static final d0<Unit> A = new d0<>("LinkTestMarker", false, h.f41223a, null, 8, null);

    @NotNull
    private static final d0<List<androidx.compose.ui.text.f>> B = new d0<>("Text", true, m.f41228a, null, 8, null);

    @NotNull
    private static final d0<androidx.compose.ui.text.f> C = new d0<>("TextSubstitution", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final d0<Boolean> D = new d0<>("IsShowingTextSubstitution", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final d0<androidx.compose.ui.text.f> E = new d0<>("InputText", true);

    @NotNull
    private static final d0<androidx.compose.ui.text.f> F = new d0<>("EditableText", true);

    @NotNull
    private static final d0<w3> G = new d0<>("TextSelectionRange", true);

    @NotNull
    private static final d0<androidx.compose.ui.text.input.t> H = new d0<>("ImeAction", true);

    @NotNull
    private static final d0<Boolean> I = new d0<>("Selected", true);

    @NotNull
    private static final d0<v0.a> J = new d0<>("ToggleableState", true);

    @NotNull
    private static final d0<Unit> K = new d0<>("Password", true);

    @NotNull
    private static final d0<String> L = new d0<>("Error", true);

    @NotNull
    private static final d0<Function1<Object, Integer>> M = new d0<>("IndexForKey", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final d0<Boolean> N = new d0<>("IsEditable", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final d0<Integer> O = new d0<>("MaxTextLength", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final d0<q3> P = new d0<>("Shape", false, k.f41226a, null, 8, null);
    public static final int Q = 8;

    static final class a extends l0 implements Function2<androidx.compose.ui.autofill.s, androidx.compose.ui.autofill.s, androidx.compose.ui.autofill.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41216a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.autofill.s invoke(androidx.compose.ui.autofill.s sVar, androidx.compose.ui.autofill.s sVar2) {
            return sVar;
        }
    }

    @SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$ContentDescription$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1558:1\n1#2:1559\n*E\n"})
    static final class b extends l0 implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f41217a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> mutableList;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    }

    static final class c extends l0 implements Function2<androidx.compose.ui.autofill.u, androidx.compose.ui.autofill.u, androidx.compose.ui.autofill.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f41218a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.autofill.u invoke(androidx.compose.ui.autofill.u uVar, androidx.compose.ui.autofill.u uVar2) {
            return uVar;
        }
    }

    static final class d extends l0 implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f41219a = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    static final class e extends l0 implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f41220a = new e();

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    static final class f extends l0 implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f41221a = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    static final class g extends l0 implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f41222a = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    static final class h extends l0 implements Function2<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f41223a = new h();

        h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    static final class i extends l0 implements Function2<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f41224a = new i();

        i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    static final class j extends l0 implements Function2<androidx.compose.ui.semantics.j, androidx.compose.ui.semantics.j, androidx.compose.ui.semantics.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f41225a = new j();

        j() {
            super(2);
        }

        public final androidx.compose.ui.semantics.j c(androidx.compose.ui.semantics.j jVar, int i10) {
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.ui.semantics.j invoke(androidx.compose.ui.semantics.j jVar, androidx.compose.ui.semantics.j jVar2) {
            return c(jVar, jVar2.p());
        }
    }

    static final class k extends l0 implements Function2<q3, q3, q3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f41226a = new k();

        k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final q3 invoke(q3 q3Var, q3 q3Var2) {
            return q3Var;
        }
    }

    static final class l extends l0 implements Function2<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f41227a = new l();

        l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    @SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$Text$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1558:1\n1#2:1559\n*E\n"})
    static final class m extends l0 implements Function2<List<? extends androidx.compose.ui.text.f>, List<? extends androidx.compose.ui.text.f>, List<? extends androidx.compose.ui.text.f>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f41228a = new m();

        m() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<androidx.compose.ui.text.f> invoke(List<androidx.compose.ui.text.f> list, List<androidx.compose.ui.text.f> list2) {
            List<androidx.compose.ui.text.f> mutableList;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    }

    static final class n extends l0 implements Function2<Float, Float, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f41229a = new n();

        n() {
            super(2);
        }

        public final Float c(Float f10, float f11) {
            return f10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
            return c(f10, f11.floatValue());
        }
    }

    private z() {
    }

    @kotlin.l(message = "Use `hideFromAccessibility` instead.", replaceWith = @b1(expression = "HideFromAccessibility", imports = {}))
    public static /* synthetic */ void q() {
    }

    @kotlin.l(message = "Use `isTraversalGroup` instead.", replaceWith = @b1(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void s() {
    }

    @NotNull
    public final d0<androidx.compose.ui.semantics.g> A() {
        return f41200k;
    }

    @NotNull
    public final d0<Integer> B() {
        return O;
    }

    @NotNull
    public final d0<String> C() {
        return f41194e;
    }

    @NotNull
    public final d0<Unit> D() {
        return K;
    }

    @NotNull
    public final d0<androidx.compose.ui.semantics.i> E() {
        return f41193d;
    }

    @NotNull
    public final d0<androidx.compose.ui.semantics.j> F() {
        return f41214y;
    }

    @NotNull
    public final d0<Unit> G() {
        return f41195f;
    }

    @NotNull
    public final d0<Boolean> H() {
        return I;
    }

    @NotNull
    public final d0<q3> I() {
        return P;
    }

    @NotNull
    public final d0<String> J() {
        return f41192c;
    }

    @NotNull
    public final d0<String> K() {
        return f41215z;
    }

    @NotNull
    public final d0<List<androidx.compose.ui.text.f>> L() {
        return B;
    }

    @NotNull
    public final d0<w3> M() {
        return G;
    }

    @NotNull
    public final d0<androidx.compose.ui.text.f> N() {
        return C;
    }

    @NotNull
    public final d0<v0.a> O() {
        return J;
    }

    @NotNull
    public final d0<Float> P() {
        return f41209t;
    }

    @NotNull
    public final d0<androidx.compose.ui.semantics.l> Q() {
        return f41211v;
    }

    @NotNull
    public final d0<androidx.compose.ui.semantics.b> a() {
        return f41196g;
    }

    @NotNull
    public final d0<androidx.compose.ui.semantics.c> b() {
        return f41197h;
    }

    @NotNull
    public final d0<androidx.compose.ui.autofill.s> c() {
        return f41208s;
    }

    @NotNull
    public final d0<List<String>> d() {
        return f41191b;
    }

    @NotNull
    public final d0<androidx.compose.ui.autofill.u> e() {
        return f41207r;
    }

    @NotNull
    public final d0<Unit> f() {
        return f41199j;
    }

    @NotNull
    public final d0<androidx.compose.ui.text.f> g() {
        return F;
    }

    @NotNull
    public final d0<String> h() {
        return L;
    }

    @NotNull
    public final d0<Boolean> i() {
        return f41201l;
    }

    @NotNull
    public final d0<Unit> j() {
        return f41198i;
    }

    @NotNull
    public final d0<Unit> k() {
        return f41206q;
    }

    @NotNull
    public final d0<androidx.compose.ui.semantics.l> l() {
        return f41210u;
    }

    @NotNull
    public final d0<androidx.compose.ui.text.input.t> m() {
        return H;
    }

    @NotNull
    public final d0<Function1<Object, Integer>> n() {
        return M;
    }

    @NotNull
    public final d0<androidx.compose.ui.text.f> o() {
        return E;
    }

    @NotNull
    public final d0<Unit> p() {
        return f41205p;
    }

    @NotNull
    public final d0<Boolean> r() {
        return f41202m;
    }

    @NotNull
    public final d0<Unit> t() {
        return f41213x;
    }

    @NotNull
    public final d0<Boolean> u() {
        return N;
    }

    @NotNull
    public final d0<Unit> v() {
        return f41212w;
    }

    @NotNull
    public final d0<Boolean> w() {
        return f41204o;
    }

    @NotNull
    public final d0<Boolean> x() {
        return D;
    }

    @NotNull
    public final d0<Boolean> y() {
        return f41203n;
    }

    @NotNull
    public final d0<Unit> z() {
        return A;
    }
}
