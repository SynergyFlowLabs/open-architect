package com.planner5d.library.widget.editor.popup.itemproperties.pages.material;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemMaterialSets;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.y;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.j1;
import kotlin.x;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class i extends f2 implements ze.a.InterfaceC2545a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f257370j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f257371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f257372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ze.a f257373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f257374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f257375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f257376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f257377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final a1<a> f257378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private p2 f257379i;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f257380d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Item f257381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final ItemMaterial[] f257382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final k3[] f257383c;

        public a(@NotNull Item item, @Nullable ItemMaterial[] itemMaterialArr, @Nullable k3[] k3VarArr) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f257381a = item;
            this.f257382b = itemMaterialArr;
            this.f257383c = k3VarArr;
        }

        @NotNull
        public final Item a() {
            return this.f257381a;
        }

        @Nullable
        public final ItemMaterial[] b() {
            return this.f257382b;
        }

        @Nullable
        public final k3[] c() {
            return this.f257383c;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.material.ItemPropertiesMaterialsPageViewModel$refreshMaterials$1", f = "ItemPropertiesMaterialsPageViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Item f257385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f257386c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.material.ItemPropertiesMaterialsPageViewModel$refreshMaterials$1$1", f = "ItemPropertiesMaterialsPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f257387a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f257388b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Item f257389c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i1.h<ItemMaterial[]> f257390d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i1.h<k3[]> f257391e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, Item item, i1.h<ItemMaterial[]> hVar, i1.h<k3[]> hVar2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f257388b = iVar;
                this.f257389c = item;
                this.f257390d = hVar;
                this.f257391e = hVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f257388b, this.f257389c, this.f257390d, this.f257391e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f257387a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f257388b.f257378h.r(new a(this.f257389c, this.f257390d.f312751a, this.f257391e.f312751a));
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Item item, i iVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f257385b = item;
            this.f257386c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f257385b, this.f257386c, dVar);
        }

        /* JADX WARN: Type inference failed for: r11v11, types: [T, com.planner5d.library.model.item.ItemMaterial[]] */
        /* JADX WARN: Type inference failed for: r11v13, types: [T, com.planner5d.library.services.utility.k3[]] */
        /* JADX WARN: Type inference failed for: r11v15, types: [T, com.planner5d.library.model.item.ItemMaterial[]] */
        /* JADX WARN: Type inference failed for: r11v19, types: [T, com.planner5d.library.model.item.ItemMaterial[]] */
        /* JADX WARN: Type inference failed for: r11v7, types: [T, com.planner5d.library.model.item.ItemMaterial[]] */
        /* JADX WARN: Type inference failed for: r11v9, types: [T, com.planner5d.library.services.utility.k3[]] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257384a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i1.h hVar = new i1.h();
                i1.h hVar2 = new i1.h();
                Item item = this.f257385b;
                if (item instanceof ItemPr) {
                    hVar.f312751a = ((ItemPr) item).getMaterials();
                } else if (item instanceof ItemNs) {
                    hVar.f312751a = ((ItemNs) item).getMaterialsEditable(this.f257386c.f257372b);
                } else if (item instanceof ItemRoom) {
                    hVar.f312751a = ((ItemRoom) item).getMaterials();
                    hVar2.f312751a = new k3[]{new k3(com.planner5d.library.f.s.Sz, new Object[0]), new k3(com.planner5d.library.f.s.Qz, new Object[0]), new k3(com.planner5d.library.f.s.cH, new Object[0]), new k3(com.planner5d.library.f.s.iH, new Object[0])};
                } else if ((item instanceof ItemWall) && (((ItemWall) item).getParentItem() instanceof ItemRoom)) {
                    hVar.f312751a = ((ItemWall) this.f257385b).getMaterials();
                    hVar2.f312751a = new k3[]{new k3(com.planner5d.library.f.s.cH, new Object[0]), new k3(com.planner5d.library.f.s.iH, new Object[0])};
                }
                a3 a3VarA = s.f229729a.a();
                a aVar = new a(this.f257386c, this.f257385b, hVar, hVar2, null);
                this.f257384a = 1;
                if (kotlinx.coroutines.i.h(a3VarA, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257392a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257392a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f257392a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257392a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @ij.a
    public i(@NotNull p0 formatter, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f257371a = formatter;
        this.f257372b = builtInDataManager;
        this.f257374d = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.w0(this.f257366a);
            }
        });
        this.f257375e = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.v0(this.f257367a);
            }
        });
        this.f257376f = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.p0(this.f257368a);
            }
        });
        this.f257377g = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.u0(this.f257369a);
            }
        });
        this.f257378h = new a1<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(i iVar, Unit unit) {
        iVar.t0();
        return Unit.f312394a;
    }

    private final androidx.lifecycle.w0<Unit> i0() {
        return (androidx.lifecycle.w0) this.f257376f.getValue();
    }

    private static Object k0(i iVar) {
        return j1.t(new c1(iVar, i.class, "materialsUiStateInternal", "getMaterialsUiStateInternal()Landroidx/lifecycle/MediatorLiveData;", 0));
    }

    private final androidx.lifecycle.c1<ItemMaterial> m0() {
        return (androidx.lifecycle.c1) this.f257375e.getValue();
    }

    private final androidx.lifecycle.c1<ze.c> n0() {
        return (androidx.lifecycle.c1) this.f257374d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a1 p0(i iVar) {
        final a1 a1Var = new a1();
        a1Var.s(iVar.m0(), new c(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.q0(a1Var, (ItemMaterial) obj);
            }
        }));
        a1Var.s(iVar.n0(), new c(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.r0(a1Var, (ze.c) obj);
            }
        }));
        a1Var.s(com.planner5d.library.services.l.f224378d, new c(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.s0(a1Var, (com.planner5d.library.services.l.c) obj);
            }
        }));
        return a1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(a1 a1Var, ItemMaterial itemMaterial) {
        Unit unit = Unit.f312394a;
        a1Var.r(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(a1 a1Var, ze.c cVar) {
        Unit unit = Unit.f312394a;
        a1Var.r(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(a1 a1Var, com.planner5d.library.services.l.c cVar) {
        Unit unit = Unit.f312394a;
        a1Var.r(unit);
        return unit;
    }

    private final void t0() {
        Item itemG0 = g0();
        if (itemG0 == null) {
            return;
        }
        p2 p2Var = this.f257379i;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        int i10 = (6 << 0) | 0;
        this.f257379i = kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new b(itemG0, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.w0 u0(i iVar) {
        return iVar.d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.c1 v0(i iVar) {
        return iVar.d().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.c1 w0(i iVar) {
        return iVar.d().c();
    }

    private final void z0() {
        t0();
        a1<a> a1Var = this.f257378h;
        a1Var.t(i0());
        a1Var.s(i0(), new c(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.A0(this.f257365a, (Unit) obj);
            }
        }));
    }

    @Override // ze.a.InterfaceC2545a
    public void K(@NotNull ze.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f257373c = value;
        z0();
    }

    @Override // ze.a.InterfaceC2545a
    @NotNull
    public ze.a d() {
        ze.a aVar = this.f257373c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemPropertiesSelectionInternal");
        return null;
    }

    @NotNull
    public final p0 f0() {
        return this.f257371a;
    }

    @Nullable
    public final Item g0() {
        ze.b bVarF = l0().f();
        if (bVarF != null) {
            return bVarF.h();
        }
        return null;
    }

    @Nullable
    public final ItemProject h0() {
        ze.b bVarF = l0().f();
        if (bVarF != null) {
            return bVarF.i();
        }
        return null;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> j0() {
        return this.f257378h;
    }

    @NotNull
    public final androidx.lifecycle.w0<ze.b> l0() {
        return (androidx.lifecycle.w0) this.f257377g.getValue();
    }

    public final boolean o0(@NotNull ItemNs item) {
        ItemMaterialSet itemMaterialSet;
        Intrinsics.checkNotNullParameter(item, "item");
        ItemMaterialSets materialSets = item.getMaterialSets();
        return ((materialSets == null || (itemMaterialSet = materialSets.getDefault()) == null) ? null : itemMaterialSet.materials) != null;
    }

    public final void x0(@NotNull y texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        ze.c cVarF = n0().f();
        if (cVarF != null) {
            n0().r(new ze.c(texture, -1, cVarF.f(), cVarF.e(), cVarF.d(), cVarF.a(), cVarF.c(), cVarF.h()));
        }
    }

    public final void y0(@NotNull ItemMaterial material) {
        Intrinsics.checkNotNullParameter(material, "material");
        m0().r(material);
    }
}
