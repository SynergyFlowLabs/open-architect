package androidx.compose.ui.semantics;

import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.w3;
import java.util.List;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1558:1\n481#1:1559\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n519#1:1559\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f41078a = {j1.k(new v0(b0.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), j1.k(new v0(b0.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), j1.k(new v0(b0.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), j1.k(new v0(b0.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), j1.k(new v0(b0.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(b0.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(b0.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(b0.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(b0.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), j1.k(new v0(b0.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), j1.k(new v0(b0.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), j1.k(new v0(b0.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), j1.k(new v0(b0.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), j1.k(new v0(b0.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), j1.k(new v0(b0.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), j1.k(new v0(b0.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), j1.k(new v0(b0.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(b0.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), j1.k(new v0(b0.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), j1.k(new v0(b0.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), j1.k(new v0(b0.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), j1.k(new v0(b0.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(b0.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), j1.k(new v0(b0.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), j1.k(new v0(b0.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), j1.k(new v0(b0.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), j1.k(new v0(b0.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), j1.k(new v0(b0.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1)), j1.k(new v0(b0.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends l0 implements Function2<androidx.compose.ui.semantics.a<T>, androidx.compose.ui.semantics.a<T>, androidx.compose.ui.semantics.a<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41079a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.semantics.a<T> invoke(androidx.compose.ui.semantics.a<T> aVar, androidx.compose.ui.semantics.a<T> aVar2) {
            String strB;
            kotlin.x xVarA;
            if (aVar == null || (strB = aVar.b()) == null) {
                strB = aVar2.b();
            }
            if (aVar == null || (xVarA = aVar.a()) == null) {
                xVarA = aVar2.a();
            }
            return new androidx.compose.ui.semantics.a<>(strB, xVarA);
        }
    }

    static final class b extends l0 implements Function1<List<Float>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f41080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Float> function0) {
            super(1);
            this.f41080a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<Float> list) {
            boolean z10;
            Float fInvoke = this.f41080a.invoke();
            if (fInvoke == null) {
                z10 = false;
            } else {
                list.add(fInvoke);
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static {
        z zVar = z.f41190a;
        zVar.J();
        zVar.E();
        zVar.C();
        zVar.A();
        zVar.i();
        zVar.r();
        zVar.y();
        zVar.w();
        zVar.e();
        zVar.c();
        zVar.P();
        zVar.l();
        zVar.Q();
        zVar.F();
        zVar.K();
        zVar.N();
        zVar.x();
        zVar.o();
        zVar.g();
        zVar.M();
        zVar.m();
        zVar.H();
        zVar.a();
        zVar.b();
        zVar.O();
        zVar.u();
        zVar.B();
        zVar.I();
        n.f41142a.d();
    }

    @NotNull
    public static final androidx.compose.ui.autofill.u A(@NotNull e0 e0Var) {
        return z.f41190a.e().d(e0Var, f41078a[8]);
    }

    public static /* synthetic */ void A0(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        z0(e0Var, str, function1);
    }

    public static final void A1(@NotNull e0 e0Var, boolean z10) {
        z.f41190a.i().h(e0Var, f41078a[4], Boolean.valueOf(z10));
    }

    private static Object B(e0 e0Var) {
        return z.f41190a.e();
    }

    @kotlin.l(message = "Use `hideFromAccessibility()` instead.", replaceWith = @b1(expression = "hideFromAccessibility()", imports = {}))
    public static final void B0(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.p(), Unit.f312394a);
    }

    public static final void B1(@NotNull e0 e0Var, @NotNull l lVar) {
        z.f41190a.l().h(e0Var, f41078a[11], lVar);
    }

    @NotNull
    public static final List<e> C(@NotNull e0 e0Var) {
        return n.f41142a.d().d(e0Var, f41078a[28]);
    }

    public static final boolean C0(@NotNull e0 e0Var) {
        return z.f41190a.r().d(e0Var, f41078a[5]).booleanValue();
    }

    @kotlin.l(message = "Pass the ImeAction to onImeAction instead.")
    public static final void C1(@NotNull e0 e0Var, int i10) {
        z.f41190a.m().h(e0Var, f41078a[20], androidx.compose.ui.text.input.t.j(i10));
    }

    private static Object D(e0 e0Var) {
        return n.f41142a.d();
    }

    @kotlin.l(message = "Use `isTraversalGroup` instead.", replaceWith = @b1(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void D0(e0 e0Var) {
    }

    public static final void D1(@NotNull e0 e0Var, @NotNull androidx.compose.ui.text.f fVar) {
        z.f41190a.o().h(e0Var, f41078a[17], fVar);
    }

    @NotNull
    public static final androidx.compose.ui.text.f E(@NotNull e0 e0Var) {
        return z.f41190a.g().d(e0Var, f41078a[18]);
    }

    private static Object E0(e0 e0Var) {
        return z.f41190a.r();
    }

    public static final void E1(@NotNull e0 e0Var, int i10) {
        z.f41190a.A().h(e0Var, f41078a[3], g.c(i10));
    }

    private static Object F(e0 e0Var) {
        return z.f41190a.g();
    }

    public static final boolean F0(@NotNull e0 e0Var) {
        return z.f41190a.u().d(e0Var, f41078a[25]).booleanValue();
    }

    public static final void F1(@NotNull e0 e0Var, int i10) {
        z.f41190a.B().h(e0Var, f41078a[26], Integer.valueOf(i10));
    }

    public static final boolean G(@NotNull e0 e0Var) {
        return z.f41190a.i().d(e0Var, f41078a[4]).booleanValue();
    }

    private static Object G0(e0 e0Var) {
        return z.f41190a.u();
    }

    public static final void G1(@NotNull e0 e0Var, @NotNull String str) {
        z.f41190a.C().h(e0Var, f41078a[2], str);
    }

    private static Object H(e0 e0Var) {
        return z.f41190a.i();
    }

    public static final boolean H0(@NotNull e0 e0Var) {
        return z.f41190a.w().d(e0Var, f41078a[7]).booleanValue();
    }

    public static final void H1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function1<? super Float, Boolean> function1) {
        e0Var.c(n.f41142a.z(), new androidx.compose.ui.semantics.a(str, function1));
    }

    @NotNull
    public static final l I(@NotNull e0 e0Var) {
        return z.f41190a.l().d(e0Var, f41078a[11]);
    }

    private static Object I0(e0 e0Var) {
        return z.f41190a.w();
    }

    public static /* synthetic */ void I1(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        H1(e0Var, str, function1);
    }

    private static Object J(e0 e0Var) {
        return z.f41190a.l();
    }

    public static final boolean J0(@NotNull e0 e0Var) {
        return z.f41190a.x().d(e0Var, f41078a[16]).booleanValue();
    }

    public static final void J1(@NotNull e0 e0Var, @NotNull i iVar) {
        z.f41190a.E().h(e0Var, f41078a[1], iVar);
    }

    @kotlin.l(message = "Pass the ImeAction to onImeAction instead.")
    public static final int K(@NotNull e0 e0Var) {
        return z.f41190a.m().d(e0Var, f41078a[20]).p();
    }

    private static Object K0(e0 e0Var) {
        return z.f41190a.x();
    }

    public static final void K1(@NotNull e0 e0Var, int i10) {
        z.f41190a.F().h(e0Var, f41078a[13], j.j(i10));
    }

    @kotlin.l(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void L(e0 e0Var) {
    }

    public static final boolean L0(@NotNull e0 e0Var) {
        return z.f41190a.y().d(e0Var, f41078a[6]).booleanValue();
    }

    public static final void L1(@NotNull e0 e0Var, boolean z10) {
        z.f41190a.H().h(e0Var, f41078a[21], Boolean.valueOf(z10));
    }

    private static Object M(e0 e0Var) {
        return z.f41190a.m();
    }

    private static Object M0(e0 e0Var) {
        return z.f41190a.y();
    }

    public static final void M1(@NotNull e0 e0Var, @Nullable String str, @Nullable pj.n<? super Integer, ? super Integer, ? super Boolean, Boolean> nVar) {
        e0Var.c(n.f41142a.A(), new androidx.compose.ui.semantics.a(str, nVar));
    }

    @NotNull
    public static final androidx.compose.ui.text.f N(@NotNull e0 e0Var) {
        return z.f41190a.o().d(e0Var, f41078a[17]);
    }

    public static final void N0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.text.f, Boolean> function1) {
        e0Var.c(n.f41142a.k(), new androidx.compose.ui.semantics.a(str, function1));
    }

    public static /* synthetic */ void N1(e0 e0Var, String str, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        M1(e0Var, str, nVar);
    }

    private static Object O(e0 e0Var) {
        return z.f41190a.o();
    }

    public static /* synthetic */ void O0(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        N0(e0Var, str, function1);
    }

    public static final void O1(@NotNull e0 e0Var, boolean z10) {
        z.f41190a.w().h(e0Var, f41078a[7], Boolean.valueOf(z10));
    }

    public static final int P(@NotNull e0 e0Var) {
        return z.f41190a.A().d(e0Var, f41078a[3]).i();
    }

    public static final void P0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.l(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void P1(@NotNull e0 e0Var, @NotNull q3 q3Var) {
        z.f41190a.I().h(e0Var, f41078a[27], q3Var);
    }

    private static Object Q(e0 e0Var) {
        return z.f41190a.A();
    }

    public static /* synthetic */ void Q0(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        P0(e0Var, str, function0);
    }

    public static final void Q1(@NotNull e0 e0Var, boolean z10) {
        z.f41190a.x().h(e0Var, f41078a[16], Boolean.valueOf(z10));
    }

    public static final int R(@NotNull e0 e0Var) {
        return z.f41190a.B().d(e0Var, f41078a[26]).intValue();
    }

    public static final void R0(@NotNull e0 e0Var, int i10, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(z.f41190a.m(), androidx.compose.ui.text.input.t.j(i10));
        e0Var.c(n.f41142a.m(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void R1(@NotNull e0 e0Var, @NotNull String str) {
        z.f41190a.J().h(e0Var, f41078a[0], str);
    }

    private static Object S(e0 e0Var) {
        return z.f41190a.B();
    }

    public static /* synthetic */ void S0(e0 e0Var, int i10, String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        R0(e0Var, i10, str, function0);
    }

    public static final void S1(@NotNull e0 e0Var, @NotNull String str) {
        z.f41190a.K().h(e0Var, f41078a[14], str);
    }

    @NotNull
    public static final String T(@NotNull e0 e0Var) {
        int i10 = 1 | 2;
        return z.f41190a.C().d(e0Var, f41078a[2]);
    }

    public static final void T0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.n(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void T1(@NotNull e0 e0Var, @NotNull androidx.compose.ui.text.f fVar) {
        e0Var.c(z.f41190a.L(), CollectionsKt.listOf(fVar));
    }

    private static Object U(e0 e0Var) {
        return z.f41190a.C();
    }

    public static /* synthetic */ void U0(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        T0(e0Var, str, function0);
    }

    public static final void U1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.text.f, Boolean> function1) {
        e0Var.c(n.f41142a.B(), new androidx.compose.ui.semantics.a(str, function1));
    }

    @NotNull
    public static final i V(@NotNull e0 e0Var) {
        return z.f41190a.E().d(e0Var, f41078a[1]);
    }

    public static final void V0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.o(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static /* synthetic */ void V1(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        U1(e0Var, str, function1);
    }

    private static Object W(e0 e0Var) {
        return z.f41190a.E();
    }

    public static /* synthetic */ void W0(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        V0(e0Var, str, function0);
    }

    public static final void W1(@NotNull e0 e0Var, long j10) {
        z.f41190a.M().h(e0Var, f41078a[19], w3.b(j10));
    }

    public static final int X(@NotNull e0 e0Var) {
        return z.f41190a.F().d(e0Var, f41078a[13]).p();
    }

    public static final void X0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.p(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void X1(@NotNull e0 e0Var, @NotNull androidx.compose.ui.text.f fVar) {
        z.f41190a.N().h(e0Var, f41078a[15], fVar);
    }

    private static Object Y(e0 e0Var) {
        return z.f41190a.F();
    }

    public static /* synthetic */ void Y0(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        X0(e0Var, str, function0);
    }

    public static final void Y1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.text.f, Boolean> function1) {
        e0Var.c(n.f41142a.C(), new androidx.compose.ui.semantics.a(str, function1));
    }

    public static final void Z(@NotNull e0 e0Var, @Nullable String str, @NotNull Function0<Float> function0) {
        e0Var.c(n.f41142a.h(), new androidx.compose.ui.semantics.a(str, new b(function0)));
    }

    public static final void Z0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.q(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static /* synthetic */ void Z1(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Y1(e0Var, str, function1);
    }

    @NotNull
    public static final <T> d0<T> a(@NotNull String str) {
        return new d0<>(str, true);
    }

    public static /* synthetic */ void a0(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Z(e0Var, str, function0);
    }

    public static /* synthetic */ void a1(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        Z0(e0Var, str, function0);
    }

    public static final void a2(@NotNull e0 e0Var, @NotNull v0.a aVar) {
        z.f41190a.O().h(e0Var, f41078a[24], aVar);
    }

    @NotNull
    public static final <T> d0<T> b(@NotNull String str, @NotNull Function2<? super T, ? super T, ? extends T> function2) {
        return new d0<>(str, true, function2, null, 8, null);
    }

    public static final boolean b0(@NotNull e0 e0Var) {
        return z.f41190a.H().d(e0Var, f41078a[21]).booleanValue();
    }

    public static final void b1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.r(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void b2(@NotNull e0 e0Var, boolean z10) {
        z.f41190a.y().h(e0Var, f41078a[6], Boolean.valueOf(z10));
    }

    private static final <T extends kotlin.x<? extends Boolean>> d0<androidx.compose.ui.semantics.a<T>> c(String str) {
        int i10 = 3 | 0;
        return new d0<>(str, true, a.f41079a, null, 8, null);
    }

    private static Object c0(e0 e0Var) {
        return z.f41190a.H();
    }

    public static /* synthetic */ void c1(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        b1(e0Var, str, function0);
    }

    public static final void c2(@NotNull e0 e0Var, float f10) {
        z.f41190a.P().h(e0Var, f41078a[10], Float.valueOf(f10));
    }

    @NotNull
    public static final q3 d0(@NotNull e0 e0Var) {
        return z.f41190a.I().d(e0Var, f41078a[27]);
    }

    public static final void d1(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.D(), Unit.f312394a);
    }

    public static final void d2(@NotNull e0 e0Var, @NotNull l lVar) {
        z.f41190a.Q().h(e0Var, f41078a[12], lVar);
    }

    public static final void e(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.a(), new androidx.compose.ui.semantics.a(str, function0));
    }

    private static Object e0(e0 e0Var) {
        return z.f41190a.I();
    }

    public static final void e1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.s(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void e2(@NotNull e0 e0Var, @Nullable String str, @Nullable Function1<? super Boolean, Boolean> function1) {
        e0Var.c(n.f41142a.D(), new androidx.compose.ui.semantics.a(str, function1));
    }

    public static /* synthetic */ void f(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e(e0Var, str, function0);
    }

    @NotNull
    public static final String f0(@NotNull e0 e0Var) {
        return z.f41190a.J().d(e0Var, f41078a[0]);
    }

    public static /* synthetic */ void f1(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e1(e0Var, str, function0);
    }

    public static /* synthetic */ void f2(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e2(e0Var, str, function1);
    }

    public static final void g(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.b(), new androidx.compose.ui.semantics.a(str, function0));
    }

    private static Object g0(e0 e0Var) {
        return z.f41190a.J();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @b1(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void g1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.m(), new androidx.compose.ui.semantics.a(str, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T g2() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static /* synthetic */ void h(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g(e0Var, str, function0);
    }

    @NotNull
    public static final String h0(@NotNull e0 e0Var) {
        return z.f41190a.K().d(e0Var, f41078a[14]);
    }

    public static /* synthetic */ void h1(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g1(e0Var, str, function0);
    }

    public static final void i(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.c(), new androidx.compose.ui.semantics.a(str, function0));
    }

    private static Object i0(e0 e0Var) {
        return z.f41190a.K();
    }

    public static final void i1(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.v(), Unit.f312394a);
    }

    public static /* synthetic */ void j(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        i(e0Var, str, function0);
    }

    @NotNull
    public static final androidx.compose.ui.text.f j0(@NotNull e0 e0Var) {
        return (androidx.compose.ui.text.f) g2();
    }

    public static final void j1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.v(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void k(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.e(), new androidx.compose.ui.semantics.a(str, function0));
    }

    public static final void k0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function1<? super List<p3>, Boolean> function1) {
        e0Var.c(n.f41142a.i(), new androidx.compose.ui.semantics.a(str, function1));
    }

    public static /* synthetic */ void k1(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        j1(e0Var, str, function0);
    }

    public static /* synthetic */ void l(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        k(e0Var, str, function0);
    }

    public static /* synthetic */ void l0(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        k0(e0Var, str, function1);
    }

    public static final void l1(@NotNull e0 e0Var, @Nullable String str, @Nullable Function2<? super Float, ? super Float, Boolean> function2) {
        e0Var.c(n.f41142a.w(), new androidx.compose.ui.semantics.a(str, function2));
    }

    public static final void m(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.t(), Unit.f312394a);
    }

    public static final long m0(@NotNull e0 e0Var) {
        return z.f41190a.M().d(e0Var, f41078a[19]).r();
    }

    public static /* synthetic */ void m1(e0 e0Var, String str, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        l1(e0Var, str, function2);
    }

    public static final void n(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.f(), Unit.f312394a);
    }

    private static Object n0(e0 e0Var) {
        return z.f41190a.M();
    }

    public static final void n1(@NotNull e0 e0Var, @NotNull Function2<? super n0.g, ? super kotlin.coroutines.d<? super n0.g>, ? extends Object> function2) {
        e0Var.c(n.f41142a.x(), function2);
    }

    public static final void o(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.f(), new androidx.compose.ui.semantics.a(str, function0));
    }

    @NotNull
    public static final androidx.compose.ui.text.f o0(@NotNull e0 e0Var) {
        return z.f41190a.N().d(e0Var, f41078a[15]);
    }

    public static final void o1(@NotNull e0 e0Var, @Nullable String str, @NotNull Function1<? super Integer, Boolean> function1) {
        e0Var.c(n.f41142a.y(), new androidx.compose.ui.semantics.a(str, function1));
    }

    public static /* synthetic */ void p(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        o(e0Var, str, function0);
    }

    private static Object p0(e0 e0Var) {
        return z.f41190a.N();
    }

    public static /* synthetic */ void p1(e0 e0Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        o1(e0Var, str, function1);
    }

    public static final void q(@NotNull e0 e0Var, @NotNull String str) {
        e0Var.c(z.f41190a.h(), str);
    }

    @NotNull
    public static final v0.a q0(@NotNull e0 e0Var) {
        return z.f41190a.O().d(e0Var, f41078a[24]);
    }

    public static final void q1(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.G(), Unit.f312394a);
    }

    public static final void r(@NotNull e0 e0Var, @Nullable String str, @Nullable Function0<Boolean> function0) {
        e0Var.c(n.f41142a.g(), new androidx.compose.ui.semantics.a(str, function0));
    }

    private static Object r0(e0 e0Var) {
        return z.f41190a.O();
    }

    public static final void r1(@NotNull e0 e0Var, @NotNull androidx.compose.ui.semantics.b bVar) {
        z.f41190a.a().h(e0Var, f41078a[22], bVar);
    }

    public static /* synthetic */ void s(e0 e0Var, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r(e0Var, str, function0);
    }

    public static final float s0(@NotNull e0 e0Var) {
        return z.f41190a.P().d(e0Var, f41078a[10]).floatValue();
    }

    public static final void s1(@NotNull e0 e0Var, @NotNull c cVar) {
        z.f41190a.b().h(e0Var, f41078a[23], cVar);
    }

    @NotNull
    public static final androidx.compose.ui.semantics.b t(@NotNull e0 e0Var) {
        return z.f41190a.a().d(e0Var, f41078a[22]);
    }

    private static Object t0(e0 e0Var) {
        return z.f41190a.P();
    }

    public static final void t1(@NotNull e0 e0Var, boolean z10) {
        z.f41190a.r().h(e0Var, f41078a[5], Boolean.valueOf(z10));
    }

    private static Object u(e0 e0Var) {
        return z.f41190a.a();
    }

    @NotNull
    public static final l u0(@NotNull e0 e0Var) {
        return z.f41190a.Q().d(e0Var, f41078a[12]);
    }

    public static final void u1(@NotNull e0 e0Var, @NotNull androidx.compose.ui.autofill.s sVar) {
        z.f41190a.c().h(e0Var, f41078a[9], sVar);
    }

    @NotNull
    public static final c v(@NotNull e0 e0Var) {
        return z.f41190a.b().d(e0Var, f41078a[23]);
    }

    private static Object v0(e0 e0Var) {
        return z.f41190a.Q();
    }

    public static final void v1(@NotNull e0 e0Var, @NotNull String str) {
        e0Var.c(z.f41190a.d(), CollectionsKt.listOf(str));
    }

    private static Object w(e0 e0Var) {
        return z.f41190a.b();
    }

    public static final void w0(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.j(), Unit.f312394a);
    }

    public static final void w1(@NotNull e0 e0Var, @NotNull androidx.compose.ui.autofill.u uVar) {
        z.f41190a.e().h(e0Var, f41078a[8], uVar);
    }

    @NotNull
    public static final androidx.compose.ui.autofill.s x(@NotNull e0 e0Var) {
        return z.f41190a.c().d(e0Var, f41078a[9]);
    }

    public static final void x0(@NotNull e0 e0Var) {
        e0Var.c(z.f41190a.k(), Unit.f312394a);
    }

    public static final void x1(@NotNull e0 e0Var, @NotNull List<e> list) {
        n.f41142a.d().h(e0Var, f41078a[28], list);
    }

    private static Object y(e0 e0Var) {
        return z.f41190a.c();
    }

    public static final void y0(@NotNull e0 e0Var, @NotNull Function1<Object, Integer> function1) {
        e0Var.c(z.f41190a.n(), function1);
    }

    public static final void y1(@NotNull e0 e0Var, boolean z10) {
        z.f41190a.u().h(e0Var, f41078a[25], Boolean.valueOf(z10));
    }

    @NotNull
    public static final String z(@NotNull e0 e0Var) {
        return (String) g2();
    }

    public static final void z0(@NotNull e0 e0Var, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.text.f, Boolean> function1) {
        e0Var.c(n.f41142a.j(), new androidx.compose.ui.semantics.a(str, function1));
    }

    public static final void z1(@NotNull e0 e0Var, @NotNull androidx.compose.ui.text.f fVar) {
        z.f41190a.g().h(e0Var, f41078a[18], fVar);
    }
}
