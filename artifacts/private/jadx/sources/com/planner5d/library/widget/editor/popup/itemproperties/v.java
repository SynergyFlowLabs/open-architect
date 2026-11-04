package com.planner5d.library.widget.editor.popup.itemproperties;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemUtilities;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.builder.ItemCloner;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.editor.helper.s2;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class v extends f2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f257852m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f257853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f257854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k5 f257855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y f257856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private ArrayDeque<a> f257857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private c1<a> f257858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.l.c f257859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.q f257860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private s2 f257861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Item f257862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<Item> f257863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final ze.a f257864l;

    public enum a {
        DesignSize(0),
        TextureSelector(1),
        Texture(2),
        TexturePreview(3),
        RoomSettings(4),
        ColorPicker(5);


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f257872i = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f257873a;

        a(int i10) {
            this.f257873a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f257872i;
        }

        public final int n() {
            return this.f257873a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesViewModel$getTextureGroups$1", f = "ItemPropertiesViewModel.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f257875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.planner5d.library.model.z[], Unit> f257876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f257877d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesViewModel$getTextureGroups$1$1", f = "ItemPropertiesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.z[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f257878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f257879b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f257879b = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f257879b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f257878a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f257879b.f257855c.D(false);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.z[]> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super com.planner5d.library.model.z[], Unit> function1, v vVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f257876c = function1;
            this.f257877d = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f257876c, this.f257877d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257875b;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<com.planner5d.library.model.z[], Unit> function2 = this.f257876c;
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                a aVar = new a(this.f257877d, null);
                this.f257874a = function2;
                this.f257875b = 1;
                Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (objH == objL) {
                    return objL;
                }
                obj = objH;
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f257874a;
                ResultKt.m(obj);
            }
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            function1.invoke(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesViewModel$setItem$1", f = "ItemPropertiesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257880a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ze.b f257882c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ze.b bVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f257882c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new c(this.f257882c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257880a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            v.this.d().e(this.f257882c);
            v.this.f0().r(this.f257882c.h());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public v(@NotNull p0 formatter, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull k5 textureManager, @NotNull y popupSerializer) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(popupSerializer, "popupSerializer");
        this.f257853a = formatter;
        this.f257854b = builtInDataManager;
        this.f257855c = textureManager;
        this.f257856d = popupSerializer;
        this.f257857e = new ArrayDeque<>();
        this.f257858f = new c1<>();
        this.f257863k = new c1<>();
        this.f257864l = new ze.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n0(v vVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v.o0();
                }
            };
        }
        vVar.m0(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0() {
        return Unit.f312394a;
    }

    private final boolean r0(ItemMaterial itemMaterial, ItemMaterial itemMaterial2) {
        if (itemMaterial2.getColorTextureInt() != itemMaterial.getColorTextureInt()) {
            return true;
        }
        if (itemMaterial2.isOnlyColor) {
            return false;
        }
        com.planner5d.library.model.y yVar = itemMaterial2.texture;
        String str = yVar != null ? yVar.f222851c : null;
        com.planner5d.library.model.y yVar2 = itemMaterial.texture;
        if (Intrinsics.areEqual(str, yVar2 != null ? yVar2.f222851c : null)) {
            com.planner5d.library.model.y yVar3 = itemMaterial2.texture;
            Float f10 = yVar3 != null ? yVar3.f222853e : null;
            com.planner5d.library.model.y yVar4 = itemMaterial.texture;
            if (Intrinsics.areEqual(f10, yVar4 != null ? yVar4.f222853e : null)) {
                com.planner5d.library.model.y yVar5 = itemMaterial2.texture;
                Float f11 = yVar5 != null ? yVar5.f222852d : null;
                com.planner5d.library.model.y yVar6 = itemMaterial.texture;
                if (Intrinsics.areEqual(f11, yVar6 != null ? yVar6.f222852d : null)) {
                    com.planner5d.library.model.y yVar7 = itemMaterial2.texture;
                    com.planner5d.library.engine.rendering.util.i iVar = yVar7 != null ? yVar7.f222857i : null;
                    com.planner5d.library.model.y yVar8 = itemMaterial.texture;
                    if (iVar == (yVar8 != null ? yVar8.f222857i : null)) {
                        if ((yVar7 != null ? yVar7.f222858j : null) == (yVar8 != null ? yVar8.f222858j : null)) {
                            if (Intrinsics.areEqual(yVar7 != null ? yVar7.f222854f : null, yVar8 != null ? yVar8.f222854f : null)) {
                                com.planner5d.library.model.y yVar9 = itemMaterial2.texture;
                                Float f12 = yVar9 != null ? yVar9.f222855g : null;
                                com.planner5d.library.model.y yVar10 = itemMaterial.texture;
                                if (Intrinsics.areEqual(f12, yVar10 != null ? yVar10.f222855g : null)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private final void u0(com.planner5d.library.model.y yVar, int i10) {
        ItemMaterial itemMaterialF;
        ze.b bVarF;
        Item itemH;
        com.planner5d.library.widget.editor.editaction.q qVar = this.f257860h;
        if (((qVar == null || (itemMaterialF = qVar.f254785c) == null) && (itemMaterialF = this.f257864l.b().f()) == null) || (bVarF = this.f257864l.a().f()) == null || (itemH = bVarF.h()) == null) {
            return;
        }
        ItemMaterial itemMaterial = new ItemMaterial(new ItemMaterial(itemMaterialF.name, Integer.valueOf(i10), Integer.valueOf(i10), yVar, itemMaterialF.position));
        if (r0(itemMaterial, itemMaterialF)) {
            com.planner5d.library.widget.editor.editaction.q qVar2 = new com.planner5d.library.widget.editor.editaction.q(itemH, itemMaterial, false, this.f257854b);
            v1.a<com.planner5d.library.services.l.c> aVar = com.planner5d.library.services.l.f224378d;
            com.planner5d.library.services.l.c cVar = new com.planner5d.library.services.l.c(qVar2, this.f257860h, null);
            this.f257859g = cVar;
            this.f257860h = qVar2;
            aVar.o(cVar);
        }
    }

    public final boolean W() {
        Project projectJ;
        ze.b bVarF = this.f257864l.a().f();
        return ((bVarF == null || (projectJ = bVarF.j()) == null) ? null : projectJ.contestId) == null;
    }

    public final void X() {
        this.f257857e.clear();
        this.f257863k.r(null);
    }

    public final void Y(@NotNull ItemMaterial materialFloor) {
        Intrinsics.checkNotNullParameter(materialFloor, "materialFloor");
        this.f257857e.clear();
        p0(a.TextureSelector);
        this.f257864l.b().r(materialFloor);
    }

    public final void Z() {
        this.f257857e.clear();
        p0(a.DesignSize);
    }

    public final void a0() {
        this.f257857e.clear();
        p0(a.RoomSettings);
    }

    public final void b0() {
        Item itemF;
        Item item;
        s2 s2Var = this.f257861i;
        if (s2Var == null || (itemF = this.f257863k.f()) == null || (item = this.f257862j) == null) {
            return;
        }
        s2Var.r(itemF, item);
    }

    public final int c0() {
        return this.f257857e.size();
    }

    @NotNull
    public final ze.a d() {
        return this.f257864l;
    }

    @NotNull
    public final com.planner5d.library.model.manager.builtin.i d0() {
        return this.f257854b;
    }

    @NotNull
    public final c1<Item> f0() {
        return this.f257863k;
    }

    @NotNull
    public final c1<a> g0() {
        return this.f257858f;
    }

    @NotNull
    public final p0 h0() {
        return this.f257853a;
    }

    @NotNull
    public final String i0(@NotNull Context context) {
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        ze.b bVarF = this.f257864l.a().f();
        Item itemH = bVarF != null ? bVarF.h() : null;
        if (itemH instanceof ItemRoom) {
            i10 = com.planner5d.library.f.s.Tz;
        } else {
            i10 = (!(itemH instanceof ItemRuler) && (itemH instanceof ItemWall)) ? com.planner5d.library.f.s.kH : com.planner5d.library.f.s.WB;
        }
        String string = context.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    @NotNull
    public final Bundle j0(int i10) {
        com.planner5d.library.services.utility.i iVarR = new com.planner5d.library.services.utility.i().r(com.planner5d.library.services.r.popupBackStack, this.f257856d.e(this.f257857e));
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.popupCurrentItem;
        Item itemF = this.f257863k.f();
        return iVarR.j(rVar, itemF != null ? itemF.getUid() : null).h(com.planner5d.library.services.r.popupItemPropertiesSelection, this.f257856d.d(this.f257864l)).f(com.planner5d.library.services.r.popupTexturePage, i10).a();
    }

    public final void k0(boolean z10, @NotNull Function1<? super com.planner5d.library.model.z[], Unit> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (!z10) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new b(completion, this, null), 3, null);
            return;
        }
        Object objE = this.f257855c.E(W());
        Intrinsics.checkNotNullExpressionValue(objE, "getTextureGroupsUser(...)");
        completion.invoke(objE);
    }

    @Nullable
    public final String l0(@NotNull Context context) {
        Item itemH;
        Intrinsics.checkNotNullParameter(context, "context");
        ze.b bVarF = this.f257864l.a().f();
        if (bVarF == null || (itemH = bVarF.h()) == null) {
            return null;
        }
        return String.valueOf(ItemUtilities.INSTANCE.getTitleWithIds(context, itemH));
    }

    public final void m0(@NotNull Function0<Unit> onBackFromColorPickerPage) {
        Object uid;
        Item itemH;
        Intrinsics.checkNotNullParameter(onBackFromColorPickerPage, "onBackFromColorPickerPage");
        if (this.f257858f.f() == a.ColorPicker) {
            onBackFromColorPickerPage.invoke();
        }
        try {
            this.f257857e.removeLast();
            this.f257858f.r(this.f257857e.last());
        } catch (NoSuchElementException e10) {
            t1 t1VarD = com.planner5d.library.application.b.f142455c.a().d();
            ze.b bVarF = this.f257864l.a().f();
            if (bVarF == null || (itemH = bVarF.h()) == null || (uid = itemH.getUid()) == null) {
                uid = 0;
            }
            t1VarD.b("back_in_item_properties", "Item #" + uid, e10);
        }
    }

    public final void p0(@NotNull a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (this.f257857e.isEmpty() || this.f257857e.last() != page) {
            this.f257857e.addLast(page);
        }
        v1.f229769a.v(this.f257858f, this.f257857e.last());
    }

    public final boolean q0() {
        ItemMaterial itemMaterialF = this.f257864l.b().f();
        return itemMaterialF != null && itemMaterialF.isOnlyColor;
    }

    public final void s0(@NotNull ze.b item, @NotNull s2 helperStatistics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(helperStatistics, "helperStatistics");
        this.f257860h = null;
        this.f257864l.e(item);
        this.f257863k.r(item.h());
        this.f257862j = ItemCloner.clone(item.h(), null, null);
        this.f257861i = helperStatistics;
    }

    public final void t0(@NotNull com.planner5d.library.model.z group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f257857e.addLast(a.Texture);
        this.f257858f.r(this.f257857e.last());
        this.f257864l.d().r(group);
    }

    public final int v0(@NotNull Bundle state, @NotNull Project project, @NotNull ItemProject itemProject) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(state);
        String strT = jVar.t(com.planner5d.library.services.r.popupCurrentItem, null);
        if (strT == null) {
            return 0;
        }
        Item child = itemProject.getChild(strT);
        ze.a aVar = this.f257864l;
        Intrinsics.checkNotNull(child);
        aVar.e(new ze.b(project, itemProject, child, false, 8, null));
        this.f257856d.a(jVar.h(com.planner5d.library.services.r.popupItemPropertiesSelection, new Bundle()), this.f257864l);
        this.f257856d.b(this.f257857e, jVar.v(com.planner5d.library.services.r.popupBackStack, new String[0]));
        v1 v1Var = v1.f229769a;
        v1Var.v(this.f257858f, this.f257857e.last());
        v1Var.v(this.f257863k, child);
        return jVar.c(com.planner5d.library.services.r.popupTexturePage, 0);
    }

    public final void w0(@NotNull ItemMaterial material) {
        com.planner5d.library.engine.rendering.util.i iVar;
        com.planner5d.library.engine.rendering.util.f fVar;
        Float f10;
        Float f11;
        Float f12;
        Float f13;
        Intrinsics.checkNotNullParameter(material, "material");
        a aVarF = this.f257858f.f();
        a aVar = a.TextureSelector;
        if (aVarF != aVar) {
            p0(aVar);
        }
        ze.b bVarF = this.f257864l.a().f();
        this.f257860h = new com.planner5d.library.widget.editor.editaction.q(bVarF != null ? bVarF.h() : null, material, true, this.f257854b);
        c1<ze.c> c1VarC = this.f257864l.c();
        com.planner5d.library.model.y yVar = material.texture;
        int colorInt = material.isOnlyColor ? material.getColorInt() : material.getColorTextureInt();
        com.planner5d.library.model.y yVar2 = material.texture;
        float fFloatValue = (yVar2 == null || (f13 = yVar2.f222852d) == null) ? 1.0f : f13.floatValue();
        com.planner5d.library.model.y yVar3 = material.texture;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = (yVar3 == null || (f12 = yVar3.f222853e) == null) ? 0.0f : f12.floatValue();
        com.planner5d.library.model.y yVar4 = material.texture;
        if (yVar4 == null || (iVar = yVar4.f222857i) == null) {
            iVar = com.planner5d.library.engine.rendering.util.i.RepeatXY;
        }
        if (yVar4 == null || (fVar = yVar4.f222858j) == null) {
            fVar = com.planner5d.library.engine.rendering.util.f.Center;
        }
        float fFloatValue4 = (yVar4 == null || (f11 = yVar4.f222854f) == null) ? 0.0f : f11.floatValue();
        com.planner5d.library.model.y yVar5 = material.texture;
        if (yVar5 != null && (f10 = yVar5.f222855g) != null) {
            fFloatValue2 = f10.floatValue();
        }
        c1VarC.r(new ze.c(yVar, colorInt, fFloatValue, fFloatValue3, iVar, fVar, fFloatValue4, fFloatValue2));
    }

    public final void x0(@NotNull c1<a> c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "<set-?>");
        this.f257858f = c1Var;
    }

    public final void y0(@NotNull ze.b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.a(), null, new c(item, null), 2, null);
    }

    public final void z0(@NotNull ze.c selectedTexture) {
        Intrinsics.checkNotNullParameter(selectedTexture, "selectedTexture");
        com.planner5d.library.model.y yVarG = selectedTexture.g();
        com.planner5d.library.model.y yVar = yVarG != null ? new com.planner5d.library.model.y(yVarG, Float.valueOf(selectedTexture.f()), Float.valueOf(selectedTexture.e()), selectedTexture.d(), selectedTexture.a(), Float.valueOf(selectedTexture.c()), Float.valueOf(selectedTexture.h())) : null;
        u0(yVar, selectedTexture.b());
        k5 k5Var = this.f257855c;
        if (yVar == null) {
            return;
        }
        k5Var.k(yVar);
    }
}
