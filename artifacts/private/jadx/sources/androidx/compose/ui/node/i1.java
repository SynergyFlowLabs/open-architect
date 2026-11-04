package androidx.compose.ui.node;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,778:1\n683#1,6:822\n654#1,6:828\n654#1,6:834\n662#1,3:841\n665#1,3:847\n683#1,6:850\n683#1,6:856\n633#1,6:868\n654#1,3:874\n639#1,2:877\n642#1,2:922\n657#1,3:924\n644#1:927\n634#1:928\n637#1,2:929\n654#1,3:931\n639#1,2:934\n642#1,2:979\n657#1,3:981\n644#1:984\n654#1,6:985\n674#1,12:991\n686#1,3:1046\n680#1:1049\n683#1,6:1050\n670#1,16:1056\n686#1,3:1115\n680#1:1118\n671#1:1119\n633#1,6:1120\n654#1,3:1126\n639#1,2:1129\n642#1,2:1174\n657#1,3:1176\n644#1:1179\n634#1:1180\n662#1,6:1181\n1#2:779\n1086#3:780\n1107#3:793\n1085#3,2:794\n1085#3,2:820\n1086#3:840\n1107#3:899\n1085#3,2:900\n1107#3:956\n1085#3,2:957\n1107#3:1023\n1085#3,2:1024\n1107#3:1092\n1085#3,2:1093\n1107#3:1151\n1085#3,2:1152\n57#4,4:781\n57#4,4:785\n57#4,4:789\n78#4,5:796\n78#4,5:803\n78#4,5:808\n78#4,5:814\n57#4,4:864\n472#5:801\n472#5:802\n472#5:813\n472#5:819\n472#5:844\n643#5,2:845\n82#6:862\n247#7:863\n247#7:885\n247#7:942\n247#7:1009\n247#7:1078\n247#7:1137\n450#8,6:879\n460#8,2:886\n462#8,8:891\n470#8,9:902\n479#8,8:914\n450#8,6:936\n460#8,2:943\n462#8,8:948\n470#8,9:959\n479#8,8:971\n450#8,6:1003\n460#8,2:1010\n462#8,8:1015\n470#8,9:1026\n479#8,8:1038\n450#8,6:1072\n460#8,2:1079\n462#8,8:1084\n470#8,9:1095\n479#8,8:1107\n450#8,6:1131\n460#8,2:1138\n462#8,8:1143\n470#8,9:1154\n479#8,8:1166\n240#9,3:888\n243#9,3:911\n240#9,3:945\n243#9,3:968\n240#9,3:1012\n243#9,3:1035\n240#9,3:1081\n243#9,3:1104\n240#9,3:1140\n243#9,3:1163\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n215#1:822,6\n274#1:828,6\n282#1:834,6\n307#1:841,3\n307#1:847,3\n346#1:850,6\n350#1:856,6\n628#1:868,6\n628#1:874,3\n628#1:877,2\n628#1:922,2\n628#1:924,3\n628#1:927\n628#1:928\n633#1:929,2\n633#1:931,3\n633#1:934,2\n633#1:979,2\n633#1:981,3\n633#1:984\n638#1:985,6\n670#1:991,12\n670#1:1046,3\n670#1:1049\n675#1:1050,6\n691#1:1056,16\n691#1:1115,3\n691#1:1118\n691#1:1119\n698#1:1120,6\n698#1:1126,3\n698#1:1129,2\n698#1:1174,2\n698#1:1176,3\n698#1:1179\n698#1:1180\n714#1:1181,6\n51#1:780\n122#1:793\n122#1:794,2\n198#1:820,2\n305#1:840\n628#1:899\n628#1:900,2\n633#1:956\n633#1:957,2\n670#1:1023\n670#1:1024,2\n691#1:1092\n691#1:1093,2\n698#1:1151\n698#1:1152,2\n70#1:781,4\n78#1:785,4\n86#1:789,4\n132#1:796,5\n162#1:803,5\n163#1:808,5\n186#1:814,5\n570#1:864,4\n133#1:801\n134#1:802\n178#1:813\n190#1:819\n340#1:844\n340#1:845,2\n391#1:862\n391#1:863\n628#1:885\n633#1:942\n670#1:1009\n691#1:1078\n698#1:1137\n628#1:879,6\n628#1:886,2\n628#1:891,8\n628#1:902,9\n628#1:914,8\n633#1:936,6\n633#1:943,2\n633#1:948,8\n633#1:959,9\n633#1:971,8\n670#1:1003,6\n670#1:1010,2\n670#1:1015,8\n670#1:1026,9\n670#1:1038,8\n691#1:1072,6\n691#1:1079,2\n691#1:1084,8\n691#1:1095,9\n691#1:1107,8\n698#1:1131,6\n698#1:1138,2\n698#1:1143,8\n698#1:1154,9\n698#1:1166,8\n628#1:888,3\n628#1:911,3\n633#1:945,3\n633#1:968,3\n670#1:1012,3\n670#1:1035,3\n691#1:1081,3\n691#1:1104,3\n698#1:1140,3\n698#1:1163,3\n*E\n"})
public final class i1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39774l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f39775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f39776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y f39777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private k1 f39778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0.d f39779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.a0.d f39780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> f39781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> f39782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<androidx.compose.ui.a0> f39783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private a f39784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private b f39785k;

    @SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,778:1\n472#2:779\n472#2:780\n472#2:781\n472#2:782\n472#2:785\n472#2:786\n82#3:783\n247#4:784\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n405#1:779\n412#1:780\n413#1:781\n438#1:782\n454#1:785\n455#1:786\n439#1:783\n439#1:784\n*E\n"})
    private final class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private androidx.compose.ui.a0.d f39786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> f39788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> f39789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f39790e;

        public a(androidx.compose.ui.a0.d dVar, @NotNull int i10, @NotNull androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar2, androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar3, boolean z10) {
            this.f39786a = dVar;
            this.f39787b = i10;
            this.f39788c = dVar2;
            this.f39789d = dVar3;
            this.f39790e = z10;
        }

        @Override // androidx.compose.ui.node.q
        public boolean a(int i10, int i11) {
            androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar = this.f39788c;
            int i12 = this.f39787b;
            return j1.c(dVar.f35552a[i10 + i12], this.f39789d.f35552a[i12 + i11]) != 0;
        }

        @Override // androidx.compose.ui.node.q
        public void b(int i10, int i11) {
            androidx.compose.ui.a0.d dVarO8 = this.f39786a.O8();
            Intrinsics.checkNotNull(dVarO8);
            b bVar = i1.this.f39785k;
            if (bVar != null) {
                androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar = this.f39788c;
                bVar.d(i11, dVar.f35552a[this.f39787b + i11], dVarO8);
            }
            if ((m1.b(2) & dVarO8.T8()) != 0) {
                k1 k1VarP8 = dVarO8.P8();
                Intrinsics.checkNotNull(k1VarP8);
                k1 k1VarA5 = k1VarP8.a5();
                k1 k1VarY4 = k1VarP8.Y4();
                Intrinsics.checkNotNull(k1VarY4);
                if (k1VarA5 != null) {
                    k1VarA5.U6(k1VarY4);
                }
                k1VarY4.V6(k1VarA5);
                i1.this.D(this.f39786a, k1VarY4);
            }
            this.f39786a = i1.this.h(dVarO8);
        }

        @Override // androidx.compose.ui.node.q
        public void c(int i10) {
            int i11 = this.f39787b + i10;
            androidx.compose.ui.a0.d dVar = this.f39786a;
            this.f39786a = i1.this.g(this.f39789d.f35552a[i11], dVar);
            b bVar = i1.this.f39785k;
            if (bVar != null) {
                bVar.a(i11, i11, this.f39789d.f35552a[i11], dVar, this.f39786a);
            }
            if (!this.f39790e) {
                this.f39786a.o9(true);
                return;
            }
            androidx.compose.ui.a0.d dVarO8 = this.f39786a.O8();
            Intrinsics.checkNotNull(dVarO8);
            k1 k1VarP8 = dVarO8.P8();
            Intrinsics.checkNotNull(k1VarP8);
            g0 g0VarE = k.e(this.f39786a);
            if (g0VarE != null) {
                h0 h0Var = new h0(i1.this.n(), g0VarE);
                this.f39786a.u9(h0Var);
                i1.this.D(this.f39786a, h0Var);
                h0Var.V6(k1VarP8.a5());
                h0Var.U6(k1VarP8);
                k1VarP8.V6(h0Var);
            } else {
                this.f39786a.u9(k1VarP8);
            }
            this.f39786a.c9();
            this.f39786a.i9();
            n1.a(this.f39786a);
        }

        @Override // androidx.compose.ui.node.q
        public void d(int i10, int i11) {
            androidx.compose.ui.a0.d dVarO8 = this.f39786a.O8();
            Intrinsics.checkNotNull(dVarO8);
            this.f39786a = dVarO8;
            androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar = this.f39788c;
            int i12 = this.f39787b;
            androidx.compose.ui.a0.c cVar = dVar.f35552a[i12 + i10];
            androidx.compose.ui.a0.c cVar2 = this.f39789d.f35552a[i12 + i11];
            if (Intrinsics.areEqual(cVar, cVar2)) {
                b bVar = i1.this.f39785k;
                if (bVar != null) {
                    int i13 = this.f39787b;
                    bVar.e(i13 + i10, i13 + i11, cVar, cVar2, this.f39786a);
                    return;
                }
                return;
            }
            i1.this.R(cVar, cVar2, this.f39786a);
            b bVar2 = i1.this.f39785k;
            if (bVar2 != null) {
                int i14 = this.f39787b;
                bVar2.b(i14 + i10, i14 + i11, cVar, cVar2, this.f39786a);
            }
        }

        @NotNull
        public final androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> e() {
            return this.f39789d;
        }

        @NotNull
        public final androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> f() {
            return this.f39788c;
        }

        @NotNull
        public final androidx.compose.ui.a0.d g() {
            return this.f39786a;
        }

        public final int h() {
            return this.f39787b;
        }

        public final boolean i() {
            return this.f39790e;
        }

        public final void j(@NotNull androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar) {
            this.f39789d = dVar;
        }

        public final void k(@NotNull androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar) {
            this.f39788c = dVar;
        }

        public final void l(@NotNull androidx.compose.ui.a0.d dVar) {
            this.f39786a = dVar;
        }

        public final void m(int i10) {
            this.f39787b = i10;
        }

        public final void n(boolean z10) {
            this.f39790e = z10;
        }
    }

    public interface b {
        void a(int i10, int i11, @NotNull androidx.compose.ui.a0.c cVar, @NotNull androidx.compose.ui.a0.d dVar, @NotNull androidx.compose.ui.a0.d dVar2);

        void b(int i10, int i11, @NotNull androidx.compose.ui.a0.c cVar, @NotNull androidx.compose.ui.a0.c cVar2, @NotNull androidx.compose.ui.a0.d dVar);

        void c(int i10, @NotNull androidx.compose.ui.a0.c cVar, @NotNull androidx.compose.ui.a0.c cVar2, @NotNull androidx.compose.ui.a0.d dVar);

        void d(int i10, @NotNull androidx.compose.ui.a0.c cVar, @NotNull androidx.compose.ui.a0.d dVar);

        void e(int i10, int i11, @NotNull androidx.compose.ui.a0.c cVar, @NotNull androidx.compose.ui.a0.c cVar2, @NotNull androidx.compose.ui.a0.d dVar);
    }

    public static final class c extends androidx.compose.ui.a0.d {
        c() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    public i1(@NotNull l0 l0Var) {
        this.f39775a = l0Var;
        c cVar = new c();
        cVar.k9(-1);
        this.f39776b = cVar;
        y yVar = new y(l0Var);
        this.f39777c = yVar;
        this.f39778d = yVar;
        m2 m2VarW7 = yVar.V4();
        this.f39779e = m2VarW7;
        this.f39780f = m2VarW7;
        this.f39783i = new androidx.compose.runtime.collection.d<>(new androidx.compose.ui.a0[16], 0);
    }

    private final androidx.compose.ui.a0.d C() {
        if (!(this.f39780f != this.f39776b)) {
            s0.a.i("padChain called on already padded chain");
        }
        androidx.compose.ui.a0.d dVar = this.f39780f;
        dVar.r9(this.f39776b);
        this.f39776b.m9(dVar);
        return this.f39776b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(androidx.compose.ui.a0.d dVar, k1 k1Var) {
        for (androidx.compose.ui.a0.d dVarW8 = dVar.W8(); dVarW8 != null; dVarW8 = dVarW8.W8()) {
            if (dVarW8 == this.f39776b) {
                l0 l0VarJ0 = this.f39775a.J0();
                k1Var.V6(l0VarJ0 != null ? l0VarJ0.e0() : null);
                this.f39778d = k1Var;
                return;
            } else {
                if ((m1.b(2) & dVarW8.T8()) != 0) {
                    return;
                }
                dVarW8.u9(k1Var);
            }
        }
    }

    private final androidx.compose.ui.a0.d E(androidx.compose.ui.a0.d dVar) {
        androidx.compose.ui.a0.d dVarO8 = dVar.O8();
        androidx.compose.ui.a0.d dVarW8 = dVar.W8();
        if (dVarO8 != null) {
            dVarO8.r9(dVarW8);
            dVar.m9(null);
        }
        if (dVarW8 != null) {
            dVarW8.m9(dVarO8);
            dVar.r9(null);
        }
        Intrinsics.checkNotNull(dVarW8);
        return dVarW8;
    }

    private final void I(int i10, androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar, androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar2, androidx.compose.ui.a0.d dVar3, boolean z10) {
        h1.e(dVar.R() - i10, dVar2.R() - i10, k(dVar3, i10, dVar, dVar2, z10));
        J();
    }

    private final void J() {
        int iT8 = 0;
        for (androidx.compose.ui.a0.d dVarW8 = this.f39779e.W8(); dVarW8 != null && dVarW8 != this.f39776b; dVarW8 = dVarW8.W8()) {
            iT8 |= dVarW8.T8();
            dVarW8.k9(iT8);
        }
    }

    private final androidx.compose.ui.a0.d P(androidx.compose.ui.a0.d dVar) {
        if (!(dVar == this.f39776b)) {
            s0.a.i("trimChain called on already trimmed chain");
        }
        androidx.compose.ui.a0.d dVarO8 = this.f39776b.O8();
        if (dVarO8 == null) {
            dVarO8 = this.f39779e;
        }
        dVarO8.r9(null);
        this.f39776b.m9(null);
        this.f39776b.k9(-1);
        this.f39776b.u9(null);
        if (!(dVarO8 != this.f39776b)) {
            s0.a.i("trimChain did not update the head");
        }
        return dVarO8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(androidx.compose.ui.a0.c cVar, androidx.compose.ui.a0.c cVar2, androidx.compose.ui.a0.d dVar) {
        if ((cVar instanceof e1) && (cVar2 instanceof e1)) {
            j1.e((e1) cVar2, dVar);
            if (dVar.a9()) {
                n1.e(dVar);
                return;
            } else {
                dVar.s9(true);
                return;
            }
        }
        if (!(dVar instanceof androidx.compose.ui.node.c)) {
            s0.a.i("Unknown Modifier.Node type");
            return;
        }
        ((androidx.compose.ui.node.c) dVar).A9(cVar2);
        if (dVar.a9()) {
            n1.e(dVar);
        } else {
            dVar.s9(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.a0.d g(androidx.compose.ui.a0.c cVar, androidx.compose.ui.a0.d dVar) {
        androidx.compose.ui.a0.d cVar2;
        if (cVar instanceof e1) {
            cVar2 = ((e1) cVar).a();
            cVar2.p9(n1.h(cVar2));
        } else {
            cVar2 = new androidx.compose.ui.node.c(cVar);
        }
        if (cVar2.a9()) {
            s0.a.i("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVar2.o9(true);
        return y(cVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.a0.d h(androidx.compose.ui.a0.d dVar) {
        if (dVar.a9()) {
            n1.d(dVar);
            dVar.j9();
            dVar.d9();
        }
        return E(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j() {
        return this.f39780f.N8();
    }

    private final a k(androidx.compose.ui.a0.d dVar, int i10, androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar2, androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar3, boolean z10) {
        a aVar = this.f39784j;
        if (aVar == null) {
            a aVar2 = new a(dVar, i10, dVar2, dVar3, z10);
            this.f39784j = aVar2;
            return aVar2;
        }
        aVar.l(dVar);
        aVar.m(i10);
        aVar.k(dVar2);
        aVar.j(dVar3);
        aVar.n(z10);
        return aVar;
    }

    private final androidx.compose.ui.a0.d y(androidx.compose.ui.a0.d dVar, androidx.compose.ui.a0.d dVar2) {
        androidx.compose.ui.a0.d dVarO8 = dVar2.O8();
        if (dVarO8 != null) {
            dVarO8.r9(dVar);
            dVar.m9(dVarO8);
        }
        dVar2.m9(dVar);
        dVar.r9(dVar2);
        return dVar;
    }

    public final void A() {
        for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null; dVarL = dVarL.O8()) {
            dVarL.c9();
        }
    }

    public final void B() {
        for (androidx.compose.ui.a0.d dVarQ = q(); dVarQ != null; dVarQ = dVarQ.W8()) {
            if (dVarQ.a9()) {
                dVarQ.d9();
            }
        }
    }

    public final void F() {
        for (androidx.compose.ui.a0.d dVarQ = q(); dVarQ != null; dVarQ = dVarQ.W8()) {
            if (dVarQ.a9()) {
                dVarQ.h9();
            }
        }
        H();
        B();
    }

    public final void G() {
        for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null; dVarL = dVarL.O8()) {
            dVarL.i9();
            if (dVarL.S8()) {
                n1.a(dVarL);
            }
            if (dVarL.Z8()) {
                n1.e(dVarL);
            }
            dVarL.o9(false);
            dVarL.s9(false);
        }
    }

    public final void H() {
        for (androidx.compose.ui.a0.d dVarQ = q(); dVarQ != null; dVarQ = dVarQ.W8()) {
            if (dVarQ.a9()) {
                dVarQ.j9();
            }
        }
    }

    public final void K() {
        k1 h0Var;
        k1 k1Var = this.f39777c;
        for (androidx.compose.ui.a0.d dVarW8 = this.f39779e.W8(); dVarW8 != null; dVarW8 = dVarW8.W8()) {
            g0 g0VarE = k.e(dVarW8);
            if (g0VarE != null) {
                if (dVarW8.P8() != null) {
                    k1 k1VarP8 = dVarW8.P8();
                    Intrinsics.checkNotNull(k1VarP8, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    h0Var = (h0) k1VarP8;
                    g0 g0VarX7 = h0Var.X7();
                    h0Var.q8(g0VarE);
                    if (g0VarX7 != dVarW8) {
                        h0Var.S5();
                    }
                } else {
                    h0Var = new h0(this.f39775a, g0VarE);
                    dVarW8.u9(h0Var);
                }
                k1Var.V6(h0Var);
                h0Var.U6(k1Var);
                k1Var = h0Var;
            } else {
                dVarW8.u9(k1Var);
            }
        }
        l0 l0VarJ0 = this.f39775a.J0();
        k1Var.V6(l0VarJ0 != null ? l0VarJ0.e0() : null);
        this.f39778d = k1Var;
    }

    public final /* synthetic */ <T> T L(int i10) {
        if ((j() & i10) == 0) {
            return null;
        }
        for (Object obj = (T) q(); obj != null; obj = (T) ((androidx.compose.ui.a0.d) obj).W8()) {
            if ((((androidx.compose.ui.a0.d) obj).T8() & i10) != 0) {
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                return (T) obj;
            }
        }
        return null;
    }

    public final void M(int i10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        if ((j() & i10) == 0) {
            return;
        }
        for (androidx.compose.ui.a0.d dVarQ = q(); dVarQ != null; dVarQ = dVarQ.W8()) {
            if ((dVarQ.T8() & i10) != 0) {
                function1.invoke(dVarQ);
            }
        }
    }

    public final void N(@NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        for (androidx.compose.ui.a0.d dVarQ = q(); dVarQ != null; dVarQ = dVarQ.W8()) {
            function1.invoke(dVarQ);
        }
    }

    public final /* synthetic */ <T> void O(int i10, Function1<? super T, Unit> function1) {
        if ((j() & i10) != 0) {
            for (androidx.compose.ui.a0.d dVarQ = q(); dVarQ != null; dVarQ = dVarQ.W8()) {
                if ((dVarQ.T8() & i10) != 0) {
                    for (androidx.compose.ui.a0.d dVarN = dVarQ; dVarN != null; dVarN = k.n(null)) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        function1.invoke(dVarN);
                    }
                }
            }
        }
    }

    public final void Q(@NotNull androidx.compose.ui.a0 a0Var) {
        androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar;
        androidx.compose.ui.a0.d dVar2;
        androidx.compose.ui.a0.d dVarW8;
        androidx.compose.ui.a0.d dVar3;
        b bVar;
        androidx.compose.ui.a0.d dVarC = C();
        androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar4 = this.f39781g;
        boolean z10 = false;
        int iR = dVar4 != null ? dVar4.R() : 0;
        androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar5 = this.f39782h;
        if (dVar5 == null) {
            dVar5 = new androidx.compose.runtime.collection.d<>(new androidx.compose.ui.a0.c[16], 0);
        }
        androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVarD = j1.d(a0Var, dVar5, this.f39783i);
        androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar6 = null;
        if (dVarD.R() == iR) {
            int i10 = 0;
            androidx.compose.ui.a0.d dVarO8 = dVarC.O8();
            while (true) {
                if (dVarO8 == null || i10 >= iR) {
                    dVarW8 = dVarO8;
                    break;
                }
                if (dVar4 == null) {
                    s0.a.j("expected prior modifier list to be non-empty");
                    throw new kotlin.a0();
                }
                androidx.compose.ui.a0.c cVar = dVar4.f35552a[i10];
                androidx.compose.ui.a0.c cVar2 = dVarD.f35552a[i10];
                int iC = j1.c(cVar, cVar2);
                if (iC == 0) {
                    androidx.compose.ui.a0.d dVar7 = dVarO8;
                    b bVar2 = this.f39785k;
                    if (bVar2 != null) {
                        bVar2.c(i10, cVar, cVar2, dVar7);
                    }
                    dVarW8 = dVar7.W8();
                    break;
                }
                if (iC != 1) {
                    if (iC == 2 && (bVar = this.f39785k) != null) {
                        bVar.e(i10, i10, cVar, cVar2, dVarO8);
                    }
                    dVar3 = dVarO8;
                } else {
                    dVar3 = dVarO8;
                    R(cVar, cVar2, dVar3);
                    b bVar3 = this.f39785k;
                    if (bVar3 != null) {
                        bVar3.b(i10, i10, cVar, cVar2, dVar3);
                    }
                }
                dVarO8 = dVar3.O8();
                i10++;
            }
            if (i10 >= iR) {
                dVar = dVarD;
                dVar2 = dVarC;
            } else {
                if (dVar4 == null) {
                    s0.a.j("expected prior modifier list to be non-empty");
                    throw new kotlin.a0();
                }
                if (dVarW8 == null) {
                    s0.a.j("structuralUpdate requires a non-null tail");
                    throw new kotlin.a0();
                }
                dVar = dVarD;
                I(i10, dVar4, dVar, dVarW8, !this.f39775a.U());
                dVar2 = dVarC;
                z10 = true;
            }
        } else {
            if (this.f39775a.U() && iR == 0) {
                int i11 = 0;
                androidx.compose.ui.a0.d dVar8 = dVarC;
                while (i11 < dVarD.R()) {
                    androidx.compose.ui.a0.c cVar3 = dVarD.f35552a[i11];
                    androidx.compose.ui.a0.d dVarG = g(cVar3, dVar8);
                    b bVar4 = this.f39785k;
                    if (bVar4 != null) {
                        bVar4.a(0, i11, cVar3, dVar8, dVarG);
                    }
                    i11++;
                    dVar8 = dVarG;
                }
                J();
                dVar = dVarD;
                dVar2 = dVarC;
            } else if (dVarD.R() != 0) {
                if (dVar4 == null) {
                    dVar4 = new androidx.compose.runtime.collection.d<>(new androidx.compose.ui.a0.c[16], 0);
                }
                dVar = dVarD;
                dVar2 = dVarC;
                I(0, dVar4, dVar, dVar2, !this.f39775a.U());
            } else {
                if (dVar4 == null) {
                    s0.a.j("expected prior modifier list to be non-empty");
                    throw new kotlin.a0();
                }
                androidx.compose.ui.a0.d dVarO9 = dVarC.O8();
                for (int i12 = 0; dVarO9 != null && i12 < dVar4.R(); i12++) {
                    b bVar5 = this.f39785k;
                    if (bVar5 != null) {
                        bVar5.d(i12, dVar4.f35552a[i12], dVarO9);
                    }
                    dVarO9 = h(dVarO9).O8();
                }
                y yVar = this.f39777c;
                l0 l0VarJ0 = this.f39775a.J0();
                yVar.V6(l0VarJ0 != null ? l0VarJ0.e0() : null);
                this.f39778d = this.f39777c;
                dVar = dVarD;
                dVar2 = dVarC;
            }
            z10 = true;
        }
        this.f39781g = dVar;
        if (dVar4 != null) {
            dVar4.r();
            dVar6 = dVar4;
        }
        this.f39782h = dVar6;
        this.f39780f = P(dVar2);
        if (z10) {
            K();
        }
    }

    public final void S(@Nullable b bVar) {
        this.f39785k = bVar;
    }

    public final /* synthetic */ <T> T i(int i10, Function1<? super T, Boolean> function1) {
        if ((j() & i10) != 0) {
            for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null; dVarL = dVarL.O8()) {
                if ((dVarL.T8() & i10) != 0) {
                    for (androidx.compose.ui.a0.d dVarN = dVarL; dVarN != null; dVarN = k.n(null)) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        if (function1.invoke(dVarN).booleanValue()) {
                            return dVarN;
                        }
                    }
                }
                if ((dVarL.N8() & i10) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @NotNull
    public final androidx.compose.ui.a0.d l() {
        return this.f39780f;
    }

    @NotNull
    public final y m() {
        return this.f39777c;
    }

    @NotNull
    public final l0 n() {
        return this.f39775a;
    }

    @NotNull
    public final List<androidx.compose.ui.layout.g1> o() {
        androidx.compose.runtime.collection.d<androidx.compose.ui.a0.c> dVar = this.f39781g;
        if (dVar == null) {
            return CollectionsKt.emptyList();
        }
        int i10 = 0;
        androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.layout.g1[dVar.R()], 0);
        androidx.compose.ui.a0.d dVarL = l();
        while (dVarL != null && dVarL != q()) {
            k1 k1VarP8 = dVarL.P8();
            if (k1VarP8 == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            w1 w1VarH4 = k1VarP8.H4();
            w1 w1VarH5 = this.f39777c.H4();
            androidx.compose.ui.a0.d dVarO8 = dVarL.O8();
            if (dVarO8 != this.f39779e || dVarL.P8() == dVarO8.P8()) {
                w1VarH5 = null;
            }
            if (w1VarH4 == null) {
                w1VarH4 = w1VarH5;
            }
            dVar2.d(new androidx.compose.ui.layout.g1(dVar.f35552a[i10], k1VarP8, w1VarH4));
            dVarL = dVarL.O8();
            i10++;
        }
        return dVar2.q();
    }

    @NotNull
    public final k1 p() {
        return this.f39778d;
    }

    @NotNull
    public final androidx.compose.ui.a0.d q() {
        return this.f39779e;
    }

    public final boolean r(int i10) {
        return (j() & i10) != 0;
    }

    public final boolean s(int i10) {
        return (j() & i10) != 0;
    }

    public final /* synthetic */ <T> T t(int i10) {
        if ((j() & i10) == 0) {
            return null;
        }
        for (Object obj = (T) l(); obj != null; obj = (T) ((androidx.compose.ui.a0.d) obj).O8()) {
            if ((((androidx.compose.ui.a0.d) obj).T8() & i10) != 0) {
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                return (T) obj;
            }
            if ((((androidx.compose.ui.a0.d) obj).N8() & i10) == 0) {
                return null;
            }
        }
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f39780f == this.f39779e) {
            sb2.append("]");
        } else {
            for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null && dVarL != q(); dVarL = dVarL.O8()) {
                sb2.append(String.valueOf(dVarL));
                if (dVarL.O8() == this.f39779e) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void u(int i10, @NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        if ((j() & i10) == 0) {
            return;
        }
        for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null; dVarL = dVarL.O8()) {
            if ((dVarL.T8() & i10) != 0) {
                function1.invoke(dVarL);
            }
            if ((dVarL.N8() & i10) == 0) {
                return;
            }
        }
    }

    public final void v(@NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null; dVarL = dVarL.O8()) {
            function1.invoke(dVarL);
        }
    }

    public final /* synthetic */ <T> void w(int i10, Function1<? super T, Unit> function1) {
        if ((j() & i10) != 0) {
            for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null; dVarL = dVarL.O8()) {
                if ((dVarL.T8() & i10) != 0) {
                    for (androidx.compose.ui.a0.d dVarN = dVarL; dVarN != null; dVarN = k.n(null)) {
                        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                        function1.invoke(dVarN);
                    }
                }
                if ((dVarL.N8() & i10) == 0) {
                    return;
                }
            }
        }
    }

    public final void x(@NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        for (androidx.compose.ui.a0.d dVarL = l(); dVarL != null && dVarL != q(); dVarL = dVarL.O8()) {
            function1.invoke(dVarL);
        }
    }

    public final boolean z() {
        return this.f39776b.O8() != null;
    }
}
