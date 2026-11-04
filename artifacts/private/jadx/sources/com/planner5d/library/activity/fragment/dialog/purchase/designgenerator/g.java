package com.planner5d.library.activity.fragment.dialog.purchase.designgenerator;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.k3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchaseDesignGeneratorViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseDesignGeneratorViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/designgenerator/PurchaseDesignGeneratorViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n11165#2:89\n11500#2,3:90\n295#3,2:93\n1557#3:95\n1628#3,3:96\n*S KotlinDebug\n*F\n+ 1 PurchaseDesignGeneratorViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/designgenerator/PurchaseDesignGeneratorViewModel\n*L\n47#1:89\n47#1:90,3\n52#1:93,2\n57#1:95\n57#1:96,3\n*E\n"})
public final class g extends f2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f132557h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f132558i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f132559j = "android.design_generator.30";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f132560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n1 f132561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t1 f132562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k0<b> f132563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final z0<b> f132564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.c f132565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.dialog.purchase.e> f132566g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f132567b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c> f132568a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = bVar.f132568a;
            }
            return bVar.b(list);
        }

        @NotNull
        public final List<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c> a() {
            return this.f132568a;
        }

        @NotNull
        public final b b(@NotNull List<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new b(items);
        }

        @NotNull
        public final List<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c> d() {
            return this.f132568a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f132568a, ((b) obj).f132568a);
        }

        public int hashCode() {
            return this.f132568a.hashCode();
        }

        @NotNull
        public String toString() {
            return "UiState(items=" + this.f132568a + ")";
        }

        public b(@NotNull List<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f132568a = items;
        }

        public /* synthetic */ b(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.PurchaseDesignGeneratorViewModel$update$1", f = "PurchaseDesignGeneratorViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132569a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132569a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.activity.fragment.dialog.purchase.c cVar = g.this.f132565f;
                this.f132569a = 1;
                if (cVar.d(this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public g(@NotNull com.planner5d.library.application.b application, @NotNull n1 languageManager, @NotNull t1 logRecordManager, @NotNull com.planner5d.library.activity.fragment.dialog.purchase.c.a productListFetchingFactory) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(productListFetchingFactory, "productListFetchingFactory");
        this.f132560a = application;
        this.f132561b = languageManager;
        this.f132562c = logRecordManager;
        boolean z10 = 4 & 0;
        k0<b> k0VarA = b1.a(new b(null, 1, 0 == true ? 1 : 0));
        this.f132563d = k0VarA;
        this.f132564e = k0VarA;
        com.planner5d.library.activity.fragment.dialog.purchase.c cVarA = productListFetchingFactory.a(fd.k.DESIGN_GENERATOR);
        this.f132565f = cVarA;
        this.f132566g = w.g(cVarA.b(), null, 0L, 3, null);
        d0();
    }

    private final com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c a0(final fd.g gVar, String str) {
        Integer numE;
        fd.f fVar = gVar.f275144a;
        fd.i iVarK = fVar.k();
        return new com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c(fVar, new k3(fVar.l(this.f132560a, this.f132561b)), new k3(str), (iVarK == null || (numE = iVarK.e()) == null) ? 0 : numE.intValue(), new k3(fVar.j()), Intrinsics.areEqual(iVarK != null ? iVarK.c() : null, f132559j), Intrinsics.areEqual(iVarK != null ? iVarK.c() : null, f132559j), new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.b0(this.f132555a, gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(g gVar, fd.g gVar2) {
        gVar.c0(gVar2);
        return Unit.f312394a;
    }

    private final void c0(fd.g gVar) {
        List<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c> listD = this.f132563d.getValue().d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
        for (com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c cVar : listD) {
            arrayList.add(com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c.j(cVar, null, null, null, 0, null, false, Intrinsics.areEqual(cVar.p(), gVar.f275144a), null, 191, null));
        }
        this.f132563d.setValue(new b(arrayList));
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.dialog.purchase.e> W() {
        return this.f132566g;
    }

    @Nullable
    public final fd.g X() {
        Object next;
        Iterator<T> it = this.f132563d.getValue().d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c) next).q());
        com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c cVar = (com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.c) next;
        if (cVar != null) {
            return new fd.g(cVar.p(), 0, false);
        }
        return null;
    }

    public final void Y(@Nullable String str) {
        if (str != null) {
            this.f132562c.u(new LogRecord("purchase_error", str, null));
        }
    }

    public final void Z(@NotNull fd.g[] array, @NotNull String numberOfRoomStyles) {
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(numberOfRoomStyles, "numberOfRoomStyles");
        k0<b> k0Var = this.f132563d;
        ArrayList arrayList = new ArrayList(array.length);
        for (fd.g gVar : array) {
            arrayList.add(a0(gVar, numberOfRoomStyles));
        }
        k0Var.setValue(new b(arrayList));
    }

    public final void d0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(null), 3, null);
    }

    @NotNull
    public final z0<b> getUiState() {
        return this.f132564e;
    }
}
