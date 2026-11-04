package androidx.compose.ui.focus;

import androidx.compose.runtime.k7;
import androidx.compose.ui.node.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,284:1\n266#1:288\n267#1,2:290\n269#1,5:293\n274#1:303\n275#1,5:339\n280#1:385\n281#1:389\n1107#2:285\n1085#2,2:286\n1107#2:316\n1085#2,2:317\n1107#2:445\n1085#2,2:446\n1#3:289\n1#3:426\n516#4:292\n424#4,5:298\n519#4:322\n44#4:324\n429#4,3:386\n516#4:390\n424#4,8:391\n516#4:399\n424#4,8:400\n516#4:408\n424#4,8:409\n516#4:417\n424#4,8:418\n516#4:427\n424#4,5:428\n519#4:451\n44#4:453\n429#4,3:509\n118#5:304\n118#5:433\n284#6,5:305\n149#6:310\n150#6:315\n151#6,3:319\n154#6:323\n155#6,9:325\n450#6,5:334\n455#6:344\n460#6,2:346\n462#6,17:351\n479#6,8:371\n164#6,6:379\n284#6,5:434\n149#6:439\n150#6:444\n151#6,3:448\n154#6:452\n155#6,9:454\n450#6,6:463\n460#6,2:470\n462#6,17:475\n479#6,8:495\n164#6,6:503\n57#7,4:311\n57#7,4:440\n247#8:345\n247#8:469\n240#9,3:348\n243#9,3:368\n240#9,3:472\n243#9,3:492\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n88#1:288\n88#1:290,2\n88#1:293,5\n88#1:303\n88#1:339,5\n88#1:385\n88#1:389\n54#1:285\n54#1:286,2\n88#1:316\n88#1:317,2\n274#1:445\n274#1:446,2\n88#1:289\n88#1:292\n88#1:298,5\n88#1:322\n88#1:324\n88#1:386,3\n112#1:390\n116#1:391,8\n138#1:399\n142#1:400,8\n160#1:408\n164#1:409,8\n178#1:417\n183#1:418,8\n268#1:427\n273#1:428,5\n274#1:451\n274#1:453\n273#1:509,3\n88#1:304\n274#1:433\n88#1:305,5\n88#1:310\n88#1:315\n88#1:319,3\n88#1:323\n88#1:325,9\n88#1:334,5\n88#1:344\n88#1:346,2\n88#1:351,17\n88#1:371,8\n88#1:379,6\n274#1:434,5\n274#1:439\n274#1:444\n274#1:448,3\n274#1:452\n274#1:454,9\n274#1:463,6\n274#1:470,2\n274#1:475,17\n274#1:495,8\n274#1:503,6\n88#1:311,4\n274#1:440,4\n88#1:345\n274#1:469\n88#1:348,3\n88#1:368,3\n274#1:472,3\n274#1:492,3\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37419c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<k0> f37423a = new androidx.compose.runtime.collection.d<>(new k0[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37418b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final g0 f37420d = new g0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final g0 f37421e = new g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final g0 f37422f = new g0();

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.focus.g0$a$a, reason: collision with other inner class name */
        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class C0282a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0282a f37424a = new C0282a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f37425b = 0;

            private C0282a() {
            }

            @NotNull
            public final g0 a() {
                return new g0();
            }

            @NotNull
            public final g0 b() {
                return new g0();
            }

            @NotNull
            public final g0 c() {
                return new g0();
            }

            @NotNull
            public final g0 d() {
                return new g0();
            }

            @NotNull
            public final g0 e() {
                return new g0();
            }

            @NotNull
            public final g0 f() {
                return new g0();
            }

            @NotNull
            public final g0 g() {
                return new g0();
            }

            @NotNull
            public final g0 h() {
                return new g0();
            }

            @NotNull
            public final g0 i() {
                return new g0();
            }

            @NotNull
            public final g0 j() {
                return new g0();
            }

            @NotNull
            public final g0 k() {
                return new g0();
            }

            @NotNull
            public final g0 l() {
                return new g0();
            }

            @NotNull
            public final g0 m() {
                return new g0();
            }

            @NotNull
            public final g0 n() {
                return new g0();
            }

            @NotNull
            public final g0 o() {
                return new g0();
            }

            @NotNull
            public final g0 p() {
                return new g0();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C0282a a() {
            return C0282a.f37424a;
        }

        @NotNull
        public final g0 b() {
            return g0.f37421e;
        }

        @NotNull
        public final g0 c() {
            return g0.f37420d;
        }

        @NotNull
        public final g0 d() {
            return g0.f37422f;
        }

        private a() {
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37426a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f37426a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.K4(this.f37426a));
        }
    }

    @e0.c
    public g0() {
    }

    private final boolean e(Function1<? super FocusTargetNode, Boolean> function1) {
        a aVar = f37418b;
        if (this == aVar.c()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == aVar.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this.f37423a.R() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.d<k0> dVar = this.f37423a;
        k0[] k0VarArr = dVar.f35552a;
        int iR = dVar.R();
        boolean z10 = false;
        for (int i10 = 0; i10 < iR; i10++) {
            k0 k0Var = k0VarArr[i10];
            int iB = m1.b(1024);
            if (!k0Var.w().a9()) {
                s0.a.i("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
            androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
            if (dVarO8 == null) {
                androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
            } else {
                dVar2.d(dVarO8);
            }
            while (dVar2.R() != 0) {
                androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar2.r0(dVar2.R() - 1);
                if ((dVarN.N8() & iB) == 0) {
                    androidx.compose.ui.node.k.c(dVar2, dVarN, false);
                } else {
                    while (dVarN != null) {
                        if ((dVarN.T8() & iB) != 0) {
                            androidx.compose.runtime.collection.d dVar3 = null;
                            while (dVarN != null) {
                                if (dVarN instanceof FocusTargetNode) {
                                    if (function1.invoke((FocusTargetNode) dVarN).booleanValue()) {
                                        z10 = true;
                                        break;
                                    }
                                } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof androidx.compose.ui.node.m)) {
                                    int i11 = 0;
                                    for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                }
                                                if (dVarN != null) {
                                                    dVar3.d(dVarN);
                                                    dVarN = null;
                                                }
                                                dVar3.d(dVarY9);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                dVarN = androidx.compose.ui.node.k.n(dVar3);
                            }
                            break;
                        }
                        dVarN = dVarN.O8();
                    }
                }
            }
        }
        return z10;
    }

    public static /* synthetic */ boolean k(g0 g0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f.f37408b.b();
        }
        return g0Var.j(i10);
    }

    public final boolean d() {
        if (this.f37423a.R() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.d<k0> dVar = this.f37423a;
        k0[] k0VarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            if (l0.a(k0VarArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(@NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        a aVar = f37418b;
        if (this == aVar.c()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == aVar.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this.f37423a.R() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.d<k0> dVar = this.f37423a;
        k0[] k0VarArr = dVar.f35552a;
        int iR = dVar.R();
        boolean z10 = false;
        for (int i10 = 0; i10 < iR; i10++) {
            k0 k0Var = k0VarArr[i10];
            int iB = m1.b(1024);
            if (!k0Var.w().a9()) {
                s0.a.i("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
            androidx.compose.ui.a0.d dVarO8 = k0Var.w().O8();
            if (dVarO8 == null) {
                androidx.compose.ui.node.k.c(dVar2, k0Var.w(), false);
            } else {
                dVar2.d(dVarO8);
            }
            while (dVar2.R() != 0) {
                androidx.compose.ui.a0.d dVarN = (androidx.compose.ui.a0.d) dVar2.r0(dVar2.R() - 1);
                if ((dVarN.N8() & iB) == 0) {
                    androidx.compose.ui.node.k.c(dVar2, dVarN, false);
                } else {
                    while (dVarN != null) {
                        if ((dVarN.T8() & iB) != 0) {
                            androidx.compose.runtime.collection.d dVar3 = null;
                            while (dVarN != null) {
                                if (dVarN instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) dVarN;
                                    if (focusTargetNode.D9().P() ? function1.invoke(focusTargetNode).booleanValue() : b1.k(focusTargetNode, f.f37408b.b(), function1)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if (((dVarN.T8() & iB) != 0) && (dVarN instanceof androidx.compose.ui.node.m)) {
                                    int i11 = 0;
                                    for (androidx.compose.ui.a0.d dVarY9 = ((androidx.compose.ui.node.m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                        if ((dVarY9.T8() & iB) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                dVarN = dVarY9;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                                                }
                                                if (dVarN != null) {
                                                    dVar3.d(dVarN);
                                                    dVarN = null;
                                                }
                                                dVar3.d(dVarY9);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                dVarN = androidx.compose.ui.node.k.n(dVar3);
                            }
                            break;
                        }
                        dVarN = dVarN.O8();
                    }
                }
            }
        }
        return z10;
    }

    public final boolean g() {
        if (this.f37423a.R() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.d<k0> dVar = this.f37423a;
        k0[] k0VarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            if (l0.b(k0VarArr[i10])) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final androidx.compose.runtime.collection.d<k0> h() {
        return this.f37423a;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "use the version the has a FocusDirection", replaceWith = @kotlin.b1(expression = "this.requestFocus()", imports = {}))
    public final /* synthetic */ void i() {
        j(f.f37408b.b());
    }

    public final boolean j(int i10) {
        return f(new b(i10));
    }

    public final boolean l() {
        if (this.f37423a.R() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.d<k0> dVar = this.f37423a;
        k0[] k0VarArr = dVar.f35552a;
        int iR = dVar.R();
        boolean z10 = false;
        for (int i10 = 0; i10 < iR; i10++) {
            z10 = l0.e(k0VarArr[i10]) || z10;
        }
        return z10;
    }

    public final boolean m() {
        if (this.f37423a.R() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.d<k0> dVar = this.f37423a;
        k0[] k0VarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            if (l0.f(k0VarArr[i10])) {
                int i11 = 6 & 1;
                return true;
            }
        }
        return false;
    }
}
