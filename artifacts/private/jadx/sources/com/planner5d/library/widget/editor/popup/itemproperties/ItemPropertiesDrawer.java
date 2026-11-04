package com.planner5d.library.widget.editor.popup.itemproperties;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.b1;
import com.planner5d.library.databinding.o3;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.GridLayoutManagerItemDecorationInvalidation;
import com.planner5d.library.widget.editor.helper.s2;
import com.planner5d.library.widget.editor.popup.itemproperties.pages.size.h0;
import com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k0;
import com.planner5d.library.widget.j0;
import com.planner5d.library.widget.y1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nItemPropertiesDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemPropertiesDrawer.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/ItemPropertiesDrawer\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,512:1\n12#2,6:513\n28#2:519\n12#2,6:520\n28#2:526\n12#2,6:527\n28#2:533\n12#2,6:534\n28#2:540\n12#2,6:541\n28#2:547\n12#2,6:548\n28#2:554\n12#2,6:555\n28#2:561\n278#3,2:562\n278#3,2:564\n278#3,2:566\n255#3:568\n278#3,2:569\n11165#4:571\n11500#4,3:572\n37#5,2:575\n*S KotlinDebug\n*F\n+ 1 ItemPropertiesDrawer.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/ItemPropertiesDrawer\n*L\n101#1:513,6\n101#1:519\n102#1:520,6\n102#1:526\n103#1:527,6\n103#1:533\n104#1:534,6\n104#1:540\n105#1:541,6\n105#1:547\n106#1:548,6\n106#1:554\n107#1:555,6\n107#1:561\n139#1:562,2\n413#1:564,2\n430#1:566,2\n466#1:568\n225#1:569,2\n358#1:571\n358#1:572,3\n358#1:575,2\n*E\n"})
public final class ItemPropertiesDrawer extends Fragment {

    @NotNull
    public static final String ITEM_PROPERTIES_FRAGMENT_TAG = "itemPropertiesFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o3 f257242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f257243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f257244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f257245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f257246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f257247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f257248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f257249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f257250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f257251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.popup.properties.adapter.l f257252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.popup.properties.adapter.l f257253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final CompositeSubscription f257254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.planner5d.library.bottomsheet.b f257255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f257256o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f257257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f257258t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.keyboard.a f257259v;

    @NotNull
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f257260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final View f257261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final View f257262c;

        public b(@NotNull View textures, @NotNull View userTextures, @NotNull View settings) {
            Intrinsics.checkNotNullParameter(textures, "textures");
            Intrinsics.checkNotNullParameter(userTextures, "userTextures");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f257260a = textures;
            this.f257261b = userTextures;
            this.f257262c = settings;
        }

        @NotNull
        public final List<y1.a> a(@NotNull Context context, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList arrayList = new ArrayList();
            if (!z10) {
                arrayList.add(new y1.a(context, com.planner5d.library.f.s.zF, com.planner5d.library.f.h.f167801tb, this.f257260a));
                arrayList.add(new y1.a(context, com.planner5d.library.f.s.KG, com.planner5d.library.f.h.f167686na, this.f257261b));
            }
            arrayList.add(new y1.a(context, com.planner5d.library.f.s.nB, com.planner5d.library.f.h.f167495db, this.f257262c));
            return arrayList;
        }
    }

    public static final class c extends com.planner5d.library.widget.editor.popup.properties.adapter.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f257263n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, p0 p0Var, com.planner5d.library.services.bitmaploader.target.h hVar) {
            super(p0Var, hVar);
            this.f257263n = z10;
        }

        @Override // com.planner5d.library.widget.editor.popup.properties.adapter.k
        public int q() {
            return this.f257263n ? com.planner5d.library.f.g.f167144n3 : com.planner5d.library.f.g.f167100l3;
        }
    }

    public static final class d extends com.planner5d.library.services.rx.e<com.planner5d.library.model.z> {
        d() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            timber.log.b.f381052a.d("Failed to select group", new Object[0]);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.model.z value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ItemPropertiesDrawer.this.Y().t0(value);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesDrawer$loadAndOpen$1", f = "ItemPropertiesDrawer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257265a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ze.b f257267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s2 f257268d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ze.b bVar, s2 s2Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f257267c = bVar;
            this.f257268d = s2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ItemPropertiesDrawer.this.new e(this.f257267c, this.f257268d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257265a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ItemPropertiesDrawer.this.Y().s0(this.f257267c, this.f257268d);
            ItemPropertiesDrawer.this.m0();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class f implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257269a;

        f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257269a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f257269a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257269a.invoke(obj);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesDrawer$startWatchingKeyboard$3", f = "ItemPropertiesDrawer.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257270a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(ItemPropertiesDrawer itemPropertiesDrawer, boolean z10) {
            if (z10) {
                itemPropertiesDrawer.Q();
            }
            com.planner5d.library.bottomsheet.b bVar = itemPropertiesDrawer.f257255n;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewFlipperSlideCallback");
                bVar = null;
            }
            bVar.d();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ItemPropertiesDrawer.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257270a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.keyboard.a aVar = ItemPropertiesDrawer.this.f257259v;
                o3 o3Var = ItemPropertiesDrawer.this.f257242a;
                if (o3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    o3Var = null;
                }
                FrameLayout root = o3Var.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                final ItemPropertiesDrawer itemPropertiesDrawer = ItemPropertiesDrawer.this;
                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ItemPropertiesDrawer.g.m(itemPropertiesDrawer, ((Boolean) obj2).booleanValue());
                    }
                };
                this.f257270a = 1;
                if (aVar.a(root, function1, this) == objL) {
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
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public ItemPropertiesDrawer() {
        t3 t3Var = t3.f229751a;
        t3.d dVar = t3.d.f229756a;
        this.f257243b = new i2(j1.d(v.class), new t3.c(this), dVar, null, 8, null);
        this.f257244c = new i2(j1.d(com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i.class), new t3.c(this), dVar, null, 8, null);
        this.f257245d = new i2(j1.d(com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k.class), new t3.c(this), dVar, null, 8, null);
        this.f257246e = new i2(j1.d(com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n.class), new t3.c(this), dVar, null, 8, null);
        this.f257247f = new i2(j1.d(com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q.class), new t3.c(this), dVar, null, 8, null);
        this.f257248g = new i2(j1.d(k0.class), new t3.c(this), dVar, null, 8, null);
        this.f257249h = new i2(j1.d(com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o.class), new t3.c(this), dVar, null, 8, null);
        this.f257251j = new com.planner5d.library.widget.preloader.t();
        this.f257254m = new CompositeSubscription();
        this.f257256o = 1;
        this.f257257s = new AtomicBoolean(false);
        this.f257259v = new com.planner5d.library.keyboard.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(ItemPropertiesDrawer itemPropertiesDrawer) {
        itemPropertiesDrawer.Q();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(ItemPropertiesDrawer itemPropertiesDrawer) {
        com.planner5d.library.bottomsheet.b bVar = itemPropertiesDrawer.f257255n;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFlipperSlideCallback");
            bVar = null;
        }
        bVar.d();
        return Unit.f312394a;
    }

    private final y1.a J() {
        return new y1.a(getContext(), com.planner5d.library.f.s.M5, K());
    }

    private final View K() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i iVarT = T();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f257250i;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return new com.planner5d.library.widget.editor.popup.itemproperties.pages.material.k(contextRequireContext, iVarT, hVar, viewLifecycleOwner).a();
    }

    private final RecyclerView L(com.planner5d.library.widget.editor.popup.properties.adapter.l lVar, int i10) {
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutManager(new GridLayoutManagerItemDecorationInvalidation(recyclerView, i10));
        if (lVar != null) {
            recyclerView.n(new j0(getResources().getDimensionPixelSize(lVar.q())));
            recyclerView.setAdapter(lVar);
        }
        return recyclerView;
    }

    private final y1.a M() {
        v vVarY = Y();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String strI0 = vVarY.i0(contextRequireContext);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return new y1.a(strI0, new h0(contextRequireContext2, viewLifecycleOwner, V()));
    }

    private final void N(Item item) {
        boolean z10 = item instanceof ItemNs;
        com.planner5d.library.bottomsheet.b bVar = null;
        if (z10 || (item instanceof ItemPr) || (item instanceof ItemWall) || (item instanceof ItemPoint)) {
            ArrayList arrayList = new ArrayList();
            if (z10 || (item instanceof ItemPr) || ((item instanceof ItemWall) && (((ItemWall) item).getParentItem() instanceof ItemRoom))) {
                arrayList.add(J());
            }
            if (Y().W()) {
                arrayList.add(M());
            }
            o3 o3Var = this.f257242a;
            if (o3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                o3Var = null;
            }
            com.planner5d.library.databinding.d1 d1Var = o3Var.f159441e;
            d1Var.f158836b.setAdapter(new y1(arrayList));
            d1Var.f158837c.setupWithViewPager(d1Var.f158836b);
            Y().Z();
        } else if (item instanceof ItemRoom) {
            Y().a0();
        } else if (item instanceof ItemGround) {
            v vVarY = Y();
            ItemMaterial materialFloor = ((ItemGround) item).getMaterialFloor();
            Intrinsics.checkNotNullExpressionValue(materialFloor, "getMaterialFloor(...)");
            vVarY.Y(materialFloor);
        }
        o3 o3Var2 = this.f257242a;
        if (o3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var2 = null;
        }
        TextView textView = o3Var2.f159448l;
        v vVarY2 = Y();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        textView.setText(vVarY2.l0(contextRequireContext));
        com.planner5d.library.bottomsheet.b bVar2 = this.f257255n;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFlipperSlideCallback");
        } else {
            bVar = bVar2;
        }
        bVar.d();
    }

    private final com.planner5d.library.widget.editor.popup.properties.adapter.l O(boolean z10) {
        p0 p0VarH0 = Y().h0();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f257250i;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        final c cVar = new c(z10, p0VarH0, hVar);
        Y().k0(z10, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.P(cVar, this, (com.planner5d.library.model.z[]) obj);
            }
        });
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(c cVar, ItemPropertiesDrawer itemPropertiesDrawer, com.planner5d.library.model.z[] textureGroups) {
        Intrinsics.checkNotNullParameter(textureGroups, "textureGroups");
        ArrayList arrayList = new ArrayList(textureGroups.length);
        for (com.planner5d.library.model.z zVar : textureGroups) {
            arrayList.add(zVar.a(itemPropertiesDrawer.getContext()));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        ze.b bVarF = itemPropertiesDrawer.Y().d().a().f();
        cVar.z(textureGroups, strArr, bVarF != null ? bVarF.i() : null, null);
        itemPropertiesDrawer.f257254m.add(cVar.u().subscribe((Subscriber) itemPropertiesDrawer.new d()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        if (this.f257242a == null || S().getState() != 6) {
            return;
        }
        S().g(3);
    }

    private final com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k R() {
        return (com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k) this.f257245d.getValue();
    }

    private final AdvancedBottomSheetBehavior<View> S() {
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        AdvancedBottomSheetBehavior<View> advancedBottomSheetBehaviorI0 = AdvancedBottomSheetBehavior.i0(o3Var.f159442f);
        Intrinsics.checkNotNullExpressionValue(advancedBottomSheetBehaviorI0, "from(...)");
        return advancedBottomSheetBehaviorI0;
    }

    private final com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i T() {
        return (com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i) this.f257244c.getValue();
    }

    private final com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q U() {
        return (com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q) this.f257247f.getValue();
    }

    private final k0 V() {
        return (k0) this.f257248g.getValue();
    }

    private final com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n W() {
        return (com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n) this.f257246e.getValue();
    }

    private final com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o X() {
        return (com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o) this.f257249h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v Y() {
        return (v) this.f257243b.getValue();
    }

    private final void Z() {
        Y().g0().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.a0(this.f257312a, (v.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(ItemPropertiesDrawer itemPropertiesDrawer, v.a aVar) {
        o3 o3Var = itemPropertiesDrawer.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        ImageView itemPropertiesBack = o3Var.f159439c;
        Intrinsics.checkNotNullExpressionValue(itemPropertiesBack, "itemPropertiesBack");
        boolean z10 = true;
        if (itemPropertiesDrawer.Y().c0() > 1) {
            z10 = false;
        }
        itemPropertiesBack.setVisibility(z10 ? 4 : 0);
        TextView textView = o3Var.f159448l;
        v vVarY = itemPropertiesDrawer.Y();
        Context contextRequireContext = itemPropertiesDrawer.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        textView.setText(vVarY.l0(contextRequireContext));
        ViewFlipper viewFlipper = o3Var.f159449m;
        if (viewFlipper.getDisplayedChild() > aVar.n()) {
            viewFlipper.setInAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165534e0);
            viewFlipper.setOutAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165540h0);
        } else {
            viewFlipper.setInAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165536f0);
            viewFlipper.setOutAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165538g0);
        }
        viewFlipper.setDisplayedChild(aVar.n());
        int childCount = viewFlipper.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            viewFlipper.getChildAt(i10).setVisibility(aVar.n() == i10 ? 0 : 4);
            i10++;
        }
        return Unit.f312394a;
    }

    @e.a({"NotifyDataSetChanged"})
    private final void b0() {
        R().b0().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.c0(this.f257315a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(ItemPropertiesDrawer itemPropertiesDrawer, List list) {
        com.planner5d.library.widget.editor.popup.properties.adapter.l lVar = itemPropertiesDrawer.f257253l;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
        return Unit.f312394a;
    }

    @e.a({"NotifyDataSetChanged"})
    private final void d0() {
        W().h0().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.e0(this.f257300a, (com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(ItemPropertiesDrawer itemPropertiesDrawer, com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n.b bVar) {
        com.planner5d.library.widget.editor.popup.properties.adapter.l lVar;
        if (bVar != null && bVar.a() && (lVar = itemPropertiesDrawer.f257253l) != null) {
            lVar.notifyDataSetChanged();
        }
        return Unit.f312394a;
    }

    private final void f0() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o oVarX = X();
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        xe.b bVar = new xe.b(contextRequireContext, oVarX, viewLifecycleOwner);
        this.f257252k = O(false);
        this.f257253l = O(true);
        final RecyclerView recyclerViewL = L(this.f257252k, 3);
        final RecyclerView recyclerViewL2 = L(this.f257253l, 2);
        View viewA = bVar.a();
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.TextureSettingsView");
        ((com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.l) viewA).setOnChoseColorListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPropertiesDrawer.g0(this.f257316a, view);
            }
        });
        final b bVar2 = new b(recyclerViewL, recyclerViewL2, viewA);
        Y().d().c().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.h0(this.f257845a, (ze.c) obj);
            }
        }));
        Y().d().b().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.i0(this.f257846a, recyclerViewL, recyclerViewL2, bVar2, (ItemMaterial) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(ItemPropertiesDrawer itemPropertiesDrawer, View view) {
        itemPropertiesDrawer.Y().p0(v.a.ColorPicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(ItemPropertiesDrawer itemPropertiesDrawer, ze.c cVar) {
        com.planner5d.library.widget.editor.popup.properties.adapter.l lVar = itemPropertiesDrawer.f257252k;
        if (lVar != null) {
            lVar.H(cVar != null ? cVar.g() : null);
        }
        if (cVar != null) {
            itemPropertiesDrawer.Y().z0(cVar);
            itemPropertiesDrawer.U().Z0(cVar);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(ItemPropertiesDrawer itemPropertiesDrawer, RecyclerView recyclerView, RecyclerView recyclerView2, b bVar, ItemMaterial itemMaterial) {
        if (itemMaterial != null) {
            itemPropertiesDrawer.Y().w0(itemMaterial);
            itemPropertiesDrawer.X().Z().r(x.c.f257892b);
            recyclerView.M1(0);
            recyclerView2.M1(0);
            o3 o3Var = itemPropertiesDrawer.f257242a;
            if (o3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                o3Var = null;
                int i10 = 4 | 0;
            }
            o3Var.f159447k.f158739b.setCurrentItem(0);
            com.planner5d.library.widget.editor.popup.properties.adapter.l lVar = itemPropertiesDrawer.f257252k;
            if (lVar != null) {
                lVar.I(itemMaterial.texture);
            }
            Context contextRequireContext = itemPropertiesDrawer.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            itemPropertiesDrawer.x0(bVar.a(contextRequireContext, itemPropertiesDrawer.Y().q0()));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(ItemPropertiesDrawer itemPropertiesDrawer, ze.b bVar) {
        Item itemH;
        if (bVar == null || (itemH = bVar.h()) == null) {
            return Unit.f312394a;
        }
        itemPropertiesDrawer.l0(itemH);
        if (!itemPropertiesDrawer.f257258t) {
            itemPropertiesDrawer.f257258t = true;
            itemPropertiesDrawer.f0();
            itemPropertiesDrawer.d0();
            itemPropertiesDrawer.b0();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(ItemPropertiesDrawer itemPropertiesDrawer) {
        itemPropertiesDrawer.close();
        return Unit.f312394a;
    }

    private final void l0(Item item) {
        if (Intrinsics.areEqual(item, Y().f0().f())) {
            return;
        }
        N(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        FrameLayout root = o3Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(0);
        o3 o3Var2 = this.f257242a;
        if (o3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var2 = null;
        }
        ViewGroup.LayoutParams layoutParams = o3Var2.f159438b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
        }
        S().g(6);
        z0();
    }

    private final void n0() {
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        ViewFlipper viewFlipper = o3Var.f159449m;
        v vVarY = Y();
        com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n nVarW = W();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.planner5d.library.widget.preloader.t tVar = this.f257251j;
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        viewFlipper.addView(new com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.j(vVarY, nVarW, contextRequireContext, tVar, viewLifecycleOwner).a());
    }

    private final void o0() {
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        ViewFlipper viewFlipper = o3Var.f159449m;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k kVarR = R();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f257250i;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        viewFlipper.addView(new com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.e(contextRequireContext, kVarR, hVar, viewLifecycleOwner, W(), this.f257254m));
    }

    private final void p0() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final ye.a aVar = new ye.a(contextRequireContext, null, 0, 6, null);
        aVar.setOnColorChangeListener(new com.github.danielnilsson9.colorpickerview.view.b.InterfaceC0931b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.g
            @Override // com.github.danielnilsson9.colorpickerview.view.b.InterfaceC0931b
            public final void a(int i10) {
                ItemPropertiesDrawer.q0(this.f257298a, i10);
            }
        });
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        o3Var.f159449m.addView(aVar);
        X().b0().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.r0(aVar, (ze.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(ItemPropertiesDrawer itemPropertiesDrawer, int i10) {
        itemPropertiesDrawer.X().h0(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(ye.a aVar, ze.c cVar) {
        if (cVar != null) {
            aVar.setColor(cVar.b());
        }
        return Unit.f312394a;
    }

    private final void s0() {
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        o3Var.f159439c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPropertiesDrawer.t0(this.f257850a, view);
            }
        });
        o3Var.f159440d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPropertiesDrawer.v0(this.f257296a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(final ItemPropertiesDrawer itemPropertiesDrawer, View view) {
        itemPropertiesDrawer.Y().m0(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ItemPropertiesDrawer.u0(this.f257309a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(ItemPropertiesDrawer itemPropertiesDrawer) {
        itemPropertiesDrawer.X().X();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(ItemPropertiesDrawer itemPropertiesDrawer, View view) {
        itemPropertiesDrawer.close();
    }

    private final void w0() {
        o3 o3Var = this.f257242a;
        com.planner5d.library.services.bitmaploader.target.h hVar = null;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        ViewFlipper viewFlipper = o3Var.f159449m;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q qVarU = U();
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        com.planner5d.library.services.bitmaploader.target.h hVar2 = this.f257250i;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
        } else {
            hVar = hVar2;
        }
        viewFlipper.addView(new com.planner5d.library.widget.editor.popup.itemproperties.pages.size.m(contextRequireContext, qVarU, viewLifecycleOwner, hVar));
    }

    private final void x0(List<? extends y1.a> list) {
        androidx.viewpager.widget.a adapter;
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        b1 b1Var = o3Var.f159447k;
        if (b1Var.f158739b.getAdapter() == null || (adapter = b1Var.f158739b.getAdapter()) == null || adapter.getCount() != list.size()) {
            y1 y1Var = new y1((List<y1.a>) list);
            b1Var.f158739b.setAdapter(y1Var);
            b1Var.f158740c.setupWithViewPager(b1Var.f158739b);
            int tabCount = b1Var.f158740c.getTabCount();
            for (int i10 = 0; i10 < tabCount; i10++) {
                TabLayout.i iVarD = b1Var.f158740c.D(i10);
                if (iVarD != null) {
                    iVarD.x(y1Var.a(i10));
                }
            }
        }
    }

    private final void y0(ze.a aVar) {
        U().K(aVar);
        T().K(aVar);
        R().K(aVar);
        V().K(aVar);
        X().K(aVar);
        W().K(aVar);
    }

    private final void z0() {
        o3 o3Var = null;
        if (Build.VERSION.SDK_INT < 30) {
            o0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(viewLifecycleOwner), null, null, new g(null), 3, null);
        } else {
            o3 o3Var2 = this.f257242a;
            if (o3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                o3Var = o3Var2;
            }
            u1.j2(o3Var.f159438b, new ef.a(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ItemPropertiesDrawer.A0(this.f257310a);
                }
            }, new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ItemPropertiesDrawer.B0(this.f257311a);
                }
            }));
        }
    }

    public final void close() {
        if (getActivity() == null) {
            return;
        }
        if (Y().g0().f() == v.a.ColorPicker) {
            X().X();
        }
        Y().b0();
        Y().X();
        S().g(5);
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        FrameLayout root = o3Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(4);
        this.f257259v.b();
    }

    @Nullable
    public final Item getCurrentItem() {
        try {
            return Y().f0().f();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final boolean isOpened() {
        return (this.f257242a == null || S().getState() == 5 || S().getState() == 4) ? false : true;
    }

    public final void loadAndOpen(@NotNull ze.b selectedItem, @NotNull s2 helperStatistics) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(helperStatistics, "helperStatistics");
        androidx.lifecycle.p0.a(this).i(new e(selectedItem, helperStatistics, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        y0(Y().d());
        com.planner5d.library.widget.preloader.t tVar = this.f257251j;
        o3 o3Var = this.f257242a;
        if (o3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var = null;
        }
        tVar.b(o3Var.f159446j);
        s0();
        Z();
        o0();
        n0();
        w0();
        p0();
        Y().d().a().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ItemPropertiesDrawer.j0(this.f257295a, (ze.b) obj);
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.planner5d.library.bottomsheet.b bVar = this.f257255n;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFlipperSlideCallback");
            bVar = null;
        }
        bVar.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f257250i = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        this.f257257s.set(false);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o3 o3VarC = o3.c(inflater);
        this.f257242a = o3VarC;
        o3 o3Var = null;
        if (o3VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3VarC = null;
        }
        ViewFlipper itemPropertiesViewFlipper = o3VarC.f159449m;
        Intrinsics.checkNotNullExpressionValue(itemPropertiesViewFlipper, "itemPropertiesViewFlipper");
        o3 o3Var2 = this.f257242a;
        if (o3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var2 = null;
        }
        View itemPropertiesAnchor = o3Var2.f159438b;
        Intrinsics.checkNotNullExpressionValue(itemPropertiesAnchor, "itemPropertiesAnchor");
        this.f257255n = new com.planner5d.library.bottomsheet.b(itemPropertiesViewFlipper, itemPropertiesAnchor);
        AdvancedBottomSheetBehavior<View> advancedBottomSheetBehaviorS = S();
        com.planner5d.library.bottomsheet.b bVar = this.f257255n;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewFlipperSlideCallback");
            bVar = null;
        }
        advancedBottomSheetBehaviorS.W(bVar);
        AdvancedBottomSheetBehavior<View> advancedBottomSheetBehaviorS2 = S();
        o3 o3Var3 = this.f257242a;
        if (o3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var3 = null;
        }
        FrameLayout root = o3Var3.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        advancedBottomSheetBehaviorS2.W(new com.planner5d.library.widget.editor.d(root));
        S().W(new com.planner5d.library.bottomsheet.a(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ItemPropertiesDrawer.k0(this.f257297a);
            }
        }));
        S().g(5);
        o3 o3Var4 = this.f257242a;
        if (o3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var4 = null;
        }
        FrameLayout root2 = o3Var4.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        root2.setVisibility(4);
        S().Q0(true);
        o3 o3Var5 = this.f257242a;
        if (o3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o3Var5 = null;
        }
        u1.j2(o3Var5.getRoot(), new ef.g(0, 1, null));
        o3 o3Var6 = this.f257242a;
        if (o3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            o3Var = o3Var6;
        }
        FrameLayout root3 = o3Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        return root3;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f257257s.getAndSet(true)) {
            return;
        }
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f257250i;
        if (hVar != null) {
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
                hVar = null;
            }
            hVar.a();
        }
        this.f257254m.unsubscribe();
    }

    public final void onOrientationChanged(int i10) {
        if (i10 != this.f257256o) {
            this.f257256o = i10;
            Context context = getContext();
            if (context != null) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f166945e1);
                o3 o3Var = this.f257242a;
                o3 o3Var2 = null;
                if (o3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    o3Var = null;
                }
                ViewGroup.LayoutParams layoutParams = o3Var.f159443g.getLayoutParams();
                if (dimensionPixelSize <= 0) {
                    dimensionPixelSize = -1;
                }
                layoutParams.width = dimensionPixelSize;
                o3 o3Var3 = this.f257242a;
                if (o3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    o3Var2 = o3Var3;
                }
                o3Var2.f159443g.setLayoutParams(layoutParams);
            }
        }
    }

    public final void restoreState(@NotNull Bundle state, @NotNull Project project, @NotNull ItemProject itemProject) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(itemProject, "itemProject");
        Set<String> setKeySet = state.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        if (!setKeySet.isEmpty()) {
            o3 o3Var = this.f257242a;
            if (o3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                o3Var = null;
                int i10 = 7 << 0;
            }
            o3Var.f159447k.f158739b.setCurrentItem(Y().v0(state, project, itemProject));
            m0();
        }
    }

    @NotNull
    public final Bundle saveState() {
        o3 o3Var = this.f257242a;
        if (o3Var != null) {
            o3 o3Var2 = null;
            int i10 = 2 << 0;
            if (o3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                o3Var = null;
            }
            FrameLayout root = o3Var.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            if (root.getVisibility() == 0) {
                v vVarY = Y();
                o3 o3Var3 = this.f257242a;
                if (o3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    o3Var2 = o3Var3;
                }
                return vVarY.j0(o3Var2.f159447k.f158739b.getCurrentItem());
            }
        }
        return new Bundle();
    }

    public final void setItem(@NotNull ze.b selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Y().y0(selectedItem);
    }
}
