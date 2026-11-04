package com.planner5d.library.widget.editor.helper;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesDrawer;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBottomMenuHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomMenuHelper.kt\ncom/planner5d/library/widget/editor/helper/BottomMenuHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n1#2:257\n*E\n"})
public final class e implements androidx.lifecycle.o0, com.planner5d.library.widget.editor.facade.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f256221k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final FrameLayout f256222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f256223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g1 f256224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ta.a f256225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final xa.a f256226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final xa.b f256227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.ui.c f256228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.catalog.drawer.p f256229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final WeakReference<ItemPropertiesDrawer> f256230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.aichat.view.bottomsheet.q f256231j;

    public static final class a implements com.planner5d.library.widget.editor.catalog.drawer.q {
        a() {
        }

        @Override // com.planner5d.library.widget.editor.catalog.drawer.q
        public void a(CatalogItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (Intrinsics.areEqual(item.f180761id, com.planner5d.library.activity.fragment.smartwizard.w.f135875b)) {
                e.this.f256224c.i3();
            } else {
                e.this.f256224c.c1(item, null, com.planner5d.library.model.manager.statistics.events.o3.g.catalog_click);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.BottomMenuHelper$initItemPropertiesDrawer$1", f = "BottomMenuHelper.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBottomMenuHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomMenuHelper.kt\ncom/planner5d/library/widget/editor/helper/BottomMenuHelper$initItemPropertiesDrawer$1\n+ 2 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n1#1,256:1\n75#2:257\n127#2,8:258\n*S KotlinDebug\n*F\n+ 1 BottomMenuHelper.kt\ncom/planner5d/library/widget/editor/helper/BottomMenuHelper$initItemPropertiesDrawer$1\n*L\n116#1:257\n116#1:258,8\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256233a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.s f256235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f256236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ItemPropertiesDrawer f256237e;

        @SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n+ 2 BottomMenuHelper.kt\ncom/planner5d/library/widget/editor/helper/BottomMenuHelper$initItemPropertiesDrawer$1\n*L\n1#1,134:1\n117#2,11:135\n*E\n"})
        public static final class a implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.fragment.app.s f256238a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Long f256239b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ItemPropertiesDrawer f256240c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f256241d;

            public a(androidx.fragment.app.s sVar, Long l10, ItemPropertiesDrawer itemPropertiesDrawer, e eVar) {
                this.f256238a = sVar;
                this.f256239b = l10;
                this.f256240c = itemPropertiesDrawer;
                this.f256241d = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                FragmentManager supportFragmentManager = this.f256238a.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
                Long l10 = this.f256239b;
                if (l10 != null) {
                    iVar.g(com.planner5d.library.services.r.projectId, l10.longValue());
                }
                this.f256240c.setArguments(iVar.a());
                supportFragmentManager.w().N(true).z(this.f256241d.f256223b, this.f256240c, ItemPropertiesDrawer.ITEM_PROPERTIES_FRAGMENT_TAG).m();
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.fragment.app.s sVar, Long l10, ItemPropertiesDrawer itemPropertiesDrawer, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f256235c = sVar;
            this.f256236d = l10;
            this.f256237e = itemPropertiesDrawer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f256235c, this.f256236d, this.f256237e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x009d  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256233a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.lifecycle.c0 lifecycle = e.this.f256224c.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                androidx.fragment.app.s sVar = this.f256235c;
                Long l10 = this.f256236d;
                ItemPropertiesDrawer itemPropertiesDrawer = this.f256237e;
                e eVar = e.this;
                androidx.lifecycle.c0.b bVar = androidx.lifecycle.c0.b.RESUMED;
                kotlinx.coroutines.a3 a3VarM0 = kotlinx.coroutines.l1.e().R0();
                boolean zN = a3VarM0.N(getContext());
                if (zN) {
                    aVar = new a(sVar, l10, itemPropertiesDrawer, eVar);
                    this.f256233a = 1;
                    if (androidx.lifecycle.q2.a(lifecycle, bVar, zN, a3VarM0, aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (lifecycle.d() == androidx.lifecycle.c0.b.DESTROYED) {
                        throw new androidx.lifecycle.h0();
                    }
                    if (lifecycle.d().compareTo(bVar) >= 0) {
                        FragmentManager supportFragmentManager = sVar.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
                        if (l10 != null) {
                            iVar.g(com.planner5d.library.services.r.projectId, l10.longValue());
                        }
                        itemPropertiesDrawer.setArguments(iVar.a());
                        supportFragmentManager.w().N(true).z(eVar.f256223b, itemPropertiesDrawer, ItemPropertiesDrawer.ITEM_PROPERTIES_FRAGMENT_TAG).m();
                        Unit unit = Unit.f312394a;
                    } else {
                        aVar = new a(sVar, l10, itemPropertiesDrawer, eVar);
                        this.f256233a = 1;
                        if (androidx.lifecycle.q2.a(lifecycle, bVar, zN, a3VarM0, aVar, this) == objL) {
                            return objL;
                        }
                    }
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f256242a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f256242a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f256242a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f256242a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class d implements xa.c {
        d() {
        }

        @Override // xa.c
        public String a() {
            byte[] bArr = e.this.f256224c.I1().data;
            if (bArr == null) {
                throw new IllegalArgumentException("Unable to get project json");
            }
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
            return new String(bArr, charsetDefaultCharset);
        }

        @Override // xa.c
        public List<String> b() {
            Item selectedItem;
            com.planner5d.library.widget.editor.a aVarS1 = e.this.f256224c.s1();
            if (aVarS1 == null || (selectedItem = aVarS1.getSelectedItem()) == null) {
                return null;
            }
            return CollectionsKt.listOf(selectedItem.getUid());
        }
    }

    public e(@NotNull androidx.fragment.app.s activity, @NotNull FrameLayout container, int i10, boolean z10, @Nullable Long l10, @NotNull g1 helperEditor, @Nullable Long l11, @NotNull ta.a aiChatCommandsExecutor, @NotNull xa.a aiChatItemSelector, @NotNull xa.b aiChatLoader, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(helperEditor, "helperEditor");
        Intrinsics.checkNotNullParameter(aiChatCommandsExecutor, "aiChatCommandsExecutor");
        Intrinsics.checkNotNullParameter(aiChatItemSelector, "aiChatItemSelector");
        Intrinsics.checkNotNullParameter(aiChatLoader, "aiChatLoader");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f256222a = container;
        this.f256223b = i10;
        this.f256224c = helperEditor;
        this.f256225d = aiChatCommandsExecutor;
        this.f256226e = aiChatItemSelector;
        this.f256227f = aiChatLoader;
        com.planner5d.library.activity.helper.ui.c cVar = new com.planner5d.library.activity.helper.ui.c(this);
        this.f256228g = cVar;
        com.planner5d.library.widget.editor.catalog.drawer.p pVar = new com.planner5d.library.widget.editor.catalog.drawer.p(activity, null, 0, 6, null);
        this.f256229h = pVar;
        u(pVar, z10, l10);
        ItemPropertiesDrawer itemPropertiesDrawer = new ItemPropertiesDrawer();
        this.f256230i = new WeakReference<>(itemPropertiesDrawer);
        w(itemPropertiesDrawer, activity, l11);
        cVar.v(androidx.lifecycle.c0.b.RESUMED);
        if (featureConfigManager.a(com.planner5d.library.model.manager.config.f.BernardEditor)) {
            this.f256231j = t(activity, l11);
        }
        com.planner5d.library.aichat.view.bottomsheet.q qVar = this.f256231j;
        if (qVar != null) {
            I(qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(e eVar) {
        com.planner5d.library.aichat.view.bottomsheet.q qVar = eVar.f256231j;
        if (qVar != null) {
            qVar.K();
        }
        eVar.f256226e.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(e eVar) {
        com.planner5d.library.aichat.view.bottomsheet.q qVar = eVar.f256231j;
        if (qVar != null) {
            qVar.K();
        }
    }

    private final void I(com.planner5d.library.aichat.view.bottomsheet.q qVar) {
        qVar.setProjectProvider(new d());
        qVar.setEditorActionsExecutor(this.f256225d);
        qVar.setEditorItemSelector(this.f256226e);
        qVar.setAiChatLoader(this.f256227f);
    }

    private final void k() {
        this.f256222a.removeView(this.f256231j);
    }

    private final void l() {
        this.f256222a.removeView(this.f256229h);
    }

    private final void m(androidx.fragment.app.s sVar) {
        FragmentManager supportFragmentManager = sVar.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Fragment fragmentW0 = supportFragmentManager.w0(ItemPropertiesDrawer.ITEM_PROPERTIES_FRAGMENT_TAG);
        if (fragmentW0 != null) {
            if (sVar.getLifecycle().d() != androidx.lifecycle.c0.b.DESTROYED) {
                supportFragmentManager.w().x(fragmentW0).m();
                return;
            }
            com.planner5d.library.application.b.f142455c.a().d().b("itempropertydrawer_not_destroyed", "Activity state is DESTROYED", null);
            ItemPropertiesDrawer itemPropertiesDrawer = fragmentW0 instanceof ItemPropertiesDrawer ? (ItemPropertiesDrawer) fragmentW0 : null;
            if (itemPropertiesDrawer != null) {
                itemPropertiesDrawer.onDestroy();
            }
        }
    }

    private final ItemPropertiesDrawer q() {
        return this.f256230i.get();
    }

    private final com.planner5d.library.aichat.view.bottomsheet.q t(androidx.fragment.app.s sVar, Long l10) {
        FrameLayout frameLayout = this.f256222a;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.aiChatBottomSheet;
        com.planner5d.library.aichat.view.bottomsheet.q qVar = (com.planner5d.library.aichat.view.bottomsheet.q) frameLayout.findViewWithTag(rVar.f224891a);
        if (qVar != null) {
            this.f256222a.removeView(qVar);
            this.f256222a.addView(qVar);
            return qVar;
        }
        com.planner5d.library.aichat.view.bottomsheet.q qVar2 = new com.planner5d.library.aichat.view.bottomsheet.q(sVar, null, 0, 6, null);
        qVar2.setTag(rVar.f224891a);
        if (l10 != null) {
            qVar2.setProjectId(l10.longValue());
        }
        this.f256222a.addView(qVar2);
        return qVar2;
    }

    private final void u(com.planner5d.library.widget.editor.catalog.drawer.p pVar, boolean z10, Long l10) {
        pVar.U(this.f256224c, z10, l10, new a());
        this.f256222a.addView(pVar);
        com.planner5d.library.services.m0.f224435h.k(this, new c(new Function1() { // from class: com.planner5d.library.widget.editor.helper.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.v(this.f256199a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(e eVar, Integer num) {
        eVar.f256229h.f0();
        return Unit.f312394a;
    }

    private final void w(ItemPropertiesDrawer itemPropertiesDrawer, androidx.fragment.app.s sVar, Long l10) {
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(this.f256224c), null, null, new b(sVar, l10, itemPropertiesDrawer, null), 3, null);
    }

    public final void A() {
        com.planner5d.library.aichat.view.bottomsheet.q qVar = this.f256231j;
        if (qVar != null) {
            qVar.post(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.B(this.f256204a);
                }
            });
        }
    }

    public final void C() {
        com.planner5d.library.aichat.view.bottomsheet.q qVar = this.f256231j;
        if (qVar != null) {
            qVar.post(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.D(this.f256215a);
                }
            });
        }
    }

    public final void E() {
        this.f256229h.e0();
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ != null) {
            itemPropertiesDrawerQ.close();
        }
    }

    public final void F(@Nullable ze.b bVar) {
        this.f256229h.v();
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ == null || bVar == null) {
            return;
        }
        s2 helperStatistics = this.f256224c.B3;
        Intrinsics.checkNotNullExpressionValue(helperStatistics, "helperStatistics");
        itemPropertiesDrawerQ.loadAndOpen(bVar, helperStatistics);
    }

    public final void G() {
        this.f256229h.f0();
    }

    public final void H(@Nullable Bundle bundle, @NotNull Project project, @NotNull ItemProject itemProject) {
        ItemPropertiesDrawer itemPropertiesDrawerQ;
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        if (bundle == null || (itemPropertiesDrawerQ = q()) == null) {
            return;
        }
        itemPropertiesDrawerQ.restoreState(bundle, project, itemProject);
    }

    public final void J(int i10) {
        this.f256229h.setVisibility(i10);
        com.planner5d.library.aichat.view.bottomsheet.q qVar = this.f256231j;
        if (qVar != null) {
            qVar.setVisibility(i10);
        }
    }

    public final void K(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.widget.editor.catalog.drawer.p pVar = this.f256229h;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.view;
        Bundle EMPTY = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        pVar.setState(jVar.w(rVar, EMPTY));
    }

    public final void L(@Nullable ze.b bVar) {
        ItemPropertiesDrawer itemPropertiesDrawerQ;
        if (bVar != null && (itemPropertiesDrawerQ = q()) != null) {
            itemPropertiesDrawerQ.setItem(bVar);
        }
    }

    public final void M(boolean z10) {
        this.f256229h.h0(z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.d
    public void a() {
        this.f256229h.g0();
    }

    public final void g(@Nullable Runnable runnable) {
        this.f256229h.v();
        if (runnable != null) {
            runnable.run();
        }
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ != null) {
            itemPropertiesDrawerQ.close();
        }
        com.planner5d.library.aichat.view.bottomsheet.q qVar = this.f256231j;
        if (qVar != null) {
            qVar.A();
        }
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.f256228g;
    }

    public final void h() {
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ != null) {
            itemPropertiesDrawerQ.close();
        }
    }

    @Nullable
    public final Item i() {
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ != null) {
            return itemPropertiesDrawerQ.getCurrentItem();
        }
        return null;
    }

    public final void j(@Nullable androidx.fragment.app.s sVar, boolean z10) {
        this.f256228g.v(androidx.lifecycle.c0.b.DESTROYED);
        l();
        if (z10) {
            k();
        }
        if (sVar != null) {
            m(sVar);
        }
    }

    @Nullable
    public final AdvancedBottomSheetBehavior<View> n() {
        return this.f256229h.getBottomSheet();
    }

    @NotNull
    public final RectF o() {
        return this.f256229h.getDrawerBounds();
    }

    @NotNull
    public final Bundle p() {
        return new com.planner5d.library.services.utility.i().h(com.planner5d.library.services.r.view, this.f256229h.getState()).a();
    }

    @NotNull
    public final Bundle r() {
        Bundle bundleSaveState;
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ != null && (bundleSaveState = itemPropertiesDrawerQ.saveState()) != null) {
            return bundleSaveState;
        }
        return new Bundle();
    }

    public final void s() {
        this.f256229h.u();
    }

    public final boolean x() {
        return this.f256229h.c0();
    }

    public final boolean y() {
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ != null) {
            return itemPropertiesDrawerQ.isOpened();
        }
        return false;
    }

    public final void z(int i10) {
        this.f256229h.d0(i10);
        ItemPropertiesDrawer itemPropertiesDrawerQ = q();
        if (itemPropertiesDrawerQ != null) {
            itemPropertiesDrawerQ.onOrientationChanged(i10);
        }
    }
}
