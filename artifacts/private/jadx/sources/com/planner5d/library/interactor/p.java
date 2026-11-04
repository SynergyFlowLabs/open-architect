package com.planner5d.library.interactor;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.modules.user.user.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPrepareCatalogItemsDataInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrepareCatalogItemsDataInteractor.kt\ncom/planner5d/library/interactor/PrepareCatalogItemsDataInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,83:1\n1557#2:84\n1628#2,3:85\n1863#2,2:90\n1863#2,2:92\n37#3,2:88\n*S KotlinDebug\n*F\n+ 1 PrepareCatalogItemsDataInteractor.kt\ncom/planner5d/library/interactor/PrepareCatalogItemsDataInteractor\n*L\n45#1:84\n45#1:85,3\n52#1:90,2\n71#1:92,2\n45#1:88,2\n*E\n"})
public final class p implements le.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f180246f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t0 f180247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.unlockeditems.b f180248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.d f180249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k1 f180250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.d f180251e;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.PrepareCatalogItemsDataInteractor$prepareCatalogItemsData$2", f = "PrepareCatalogItemsDataInteractor.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"locksEnabled"}, s = {"I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super wc.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f180254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f180256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180257f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<?> f180259h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f180260i;

        /* JADX INFO: renamed from: com.planner5d.library.interactor.p$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1561a extends kotlin.jvm.internal.g0 implements Function2<Integer, com.planner5d.library.services.bitmaploader.target.a, Unit> {
            C1561a(Object obj) {
                super(2, obj, com.planner5d.library.model.manager.d.class, "getIcon", "getIcon(ILcom/planner5d/library/services/bitmaploader/target/BitmapTarget;)V", 0);
            }

            public final void X(int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
                ((com.planner5d.library.model.manager.d) this.receiver).c(i10, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, com.planner5d.library.services.bitmaploader.target.a aVar) {
                X(num.intValue(), aVar);
                return Unit.f312394a;
            }
        }

        /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function2<CatalogItem, com.planner5d.library.services.bitmaploader.target.a, Unit> {
            b(Object obj) {
                super(2, obj, k1.class, "getIcon", "getIcon(Lcom/planner5d/library/model/item/catalog/CatalogItem;Lcom/planner5d/library/services/bitmaploader/target/BitmapTarget;)V", 0);
            }

            public final void X(CatalogItem catalogItem, com.planner5d.library.services.bitmaploader.target.a aVar) {
                ((k1) this.receiver).a(catalogItem, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CatalogItem catalogItem, com.planner5d.library.services.bitmaploader.target.a aVar) {
                X(catalogItem, aVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<?> list, boolean z10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f180259h = list;
            this.f180260i = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new a(this.f180259h, this.f180260i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Function2 c1561a;
            com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] c1723aArr;
            boolean z10;
            Function2 function2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f180257f;
            if (i11 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] c1723aArrJ = p.this.j(this.f180259h, this.f180260i);
                i10 = (p.this.f180248b.a() || !p.this.f180251e.a() || p.this.f180247a.c()) ? 0 : 1;
                boolean z11 = this.f180260i;
                c1561a = new C1561a(p.this.f180249c);
                b bVar = new b(p.this.f180250d);
                t0 t0Var = p.this.f180247a;
                this.f180253b = c1723aArrJ;
                this.f180254c = c1561a;
                this.f180255d = bVar;
                this.f180252a = i10;
                this.f180256e = z11;
                this.f180257f = 1;
                Object objS = t0Var.S(this);
                if (objS == objL) {
                    return objL;
                }
                c1723aArr = c1723aArrJ;
                z10 = z11;
                function2 = bVar;
                obj = objS;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z12 = this.f180256e;
                i10 = this.f180252a;
                Function2 function3 = (Function2) this.f180255d;
                c1561a = (Function2) this.f180254c;
                com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] c1723aArr2 = (com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[]) this.f180253b;
                ResultKt.m(obj);
                c1723aArr = c1723aArr2;
                z10 = z12;
                function2 = function3;
            }
            return new wc.a(c1723aArr, z10, c1561a, function2, (String[]) obj, i10 != 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super wc.a> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function2<Integer, com.planner5d.library.services.bitmaploader.target.a, Unit> {
        b(Object obj) {
            super(2, obj, com.planner5d.library.model.manager.d.class, "getIcon", "getIcon(ILcom/planner5d/library/services/bitmaploader/target/BitmapTarget;)V", 0);
        }

        public final void X(int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
            ((com.planner5d.library.model.manager.d) this.receiver).c(i10, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, com.planner5d.library.services.bitmaploader.target.a aVar) {
            X(num.intValue(), aVar);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.g0 implements Function2<CatalogItem, com.planner5d.library.services.bitmaploader.target.a, Unit> {
        c(Object obj) {
            super(2, obj, k1.class, "getIcon", "getIcon(Lcom/planner5d/library/model/item/catalog/CatalogItem;Lcom/planner5d/library/services/bitmaploader/target/BitmapTarget;)V", 0);
        }

        public final void X(CatalogItem catalogItem, com.planner5d.library.services.bitmaploader.target.a aVar) {
            ((k1) this.receiver).a(catalogItem, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CatalogItem catalogItem, com.planner5d.library.services.bitmaploader.target.a aVar) {
            X(catalogItem, aVar);
            return Unit.f312394a;
        }
    }

    @ij.a
    public p(@NotNull t0 userPurchases, @NotNull com.planner5d.library.model.manager.unlockeditems.b trialUnlockManager, @NotNull com.planner5d.library.model.manager.d catalogCategoryManager, @NotNull k1 itemManager, @NotNull com.planner5d.library.model.manager.config.d configManager) {
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(trialUnlockManager, "trialUnlockManager");
        Intrinsics.checkNotNullParameter(catalogCategoryManager, "catalogCategoryManager");
        Intrinsics.checkNotNullParameter(itemManager, "itemManager");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        this.f180247a = userPurchases;
        this.f180248b = trialUnlockManager;
        this.f180249c = catalogCategoryManager;
        this.f180250d = itemManager;
        this.f180251e = configManager;
    }

    @m1
    private final com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] i(List<?> list) {
        int i10;
        List<?> list2 = list;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (Object obj : list2) {
            if (obj instanceof CatalogCategory) {
                i12++;
            } else if (obj instanceof CatalogItem) {
                i13++;
            }
        }
        com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] c1723aArr = i12 != 0 ? new com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[i13 + i12 + 1] : new com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[i13];
        if (i12 != 0) {
            c1723aArr[i12] = com.planner5d.library.widget.editor.catalog.adapter.a.C1723a.c(null);
            i10 = i12 + 1;
        } else {
            i10 = 0;
        }
        for (Object obj2 : list2) {
            if (obj2 instanceof CatalogCategory) {
                c1723aArr[i11] = com.planner5d.library.widget.editor.catalog.adapter.a.C1723a.c(obj2);
                i11++;
            } else if (obj2 instanceof CatalogItem) {
                c1723aArr[i10] = com.planner5d.library.widget.editor.catalog.adapter.a.C1723a.c(obj2);
                i10++;
            }
        }
        return c1723aArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] j(List<?> list, boolean z10) {
        if (z10) {
            return i(list);
        }
        List<?> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.planner5d.library.widget.editor.catalog.adapter.a.C1723a.c(it.next()));
        }
        return (com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[]) arrayList.toArray(new com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[0]);
    }

    @Override // le.h
    @Nullable
    public Object a(@NotNull List<?> list, boolean z10, @NotNull kotlin.coroutines.d<? super wc.a> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new a(list, z10, null), dVar);
    }

    @Override // le.h
    @NotNull
    public wc.a b() {
        com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[] c1723aArr = new com.planner5d.library.widget.editor.catalog.adapter.a.C1723a[30];
        for (int i10 = 0; i10 < 30; i10++) {
            com.planner5d.library.widget.editor.catalog.adapter.a.C1723a c1723aD = com.planner5d.library.widget.editor.catalog.adapter.a.C1723a.d();
            Intrinsics.checkNotNullExpressionValue(c1723aD, "createPlaceholderItem(...)");
            c1723aArr[i10] = c1723aD;
        }
        return new wc.a(c1723aArr, true, new b(this.f180249c), new c(this.f180250d), new String[0], false);
    }
}
