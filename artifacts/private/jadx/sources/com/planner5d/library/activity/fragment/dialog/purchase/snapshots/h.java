package com.planner5d.library.activity.fragment.dialog.purchase.snapshots;

import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.c2;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w;
import com.planner5d.library.model.manager.y0;
import fd.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchaseSnapshotsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseSnapshotsViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/snapshots/PurchaseSnapshotsViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n11483#2,9:105\n13409#2:114\n13410#2:116\n11492#2:117\n13409#2,2:119\n1#3:115\n1#3:118\n*S KotlinDebug\n*F\n+ 1 PurchaseSnapshotsViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/snapshots/PurchaseSnapshotsViewModel\n*L\n51#1:105,9\n51#1:114\n51#1:116\n51#1:117\n61#1:119,2\n51#1:115\n*E\n"})
public final class h extends f2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f132780h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f132781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Pair<Bitmap, Bitmap>> f132782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b[] f132783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Point f132784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f132785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.c f132786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.dialog.purchase.e> f132787g;

    @w0(parameters = 0)
    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f132788j = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final Function1<Bitmap, Unit> f132789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private WeakReference<Bitmap> f132790i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Bitmap, Unit> setter) {
            Intrinsics.checkNotNullParameter(setter, "setter");
            this.f132789h = setter;
            this.f132790i = new WeakReference<>(null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void b(boolean z10) {
            if (z10) {
                return;
            }
            this.f132789h.invoke(this.f132790i.get());
            this.f132790i = new WeakReference<>(null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(@Nullable Throwable th2) {
            this.f132789h.invoke(null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(@Nullable Bitmap bitmap) {
            this.f132790i = new WeakReference<>(bitmap);
            this.f132789h.invoke(bitmap);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.purchase.snapshots.PurchaseSnapshotsViewModel$update$1", f = "PurchaseSnapshotsViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132795a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132795a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.activity.fragment.dialog.purchase.c cVar = h.this.f132786f;
                this.f132795a = 1;
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
    public h(@NotNull y0 imageManager, @NotNull com.planner5d.library.activity.fragment.dialog.purchase.c.a productListFetchingFactory) {
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(productListFetchingFactory, "productListFetchingFactory");
        this.f132781a = imageManager;
        this.f132782b = new c1();
        Object[] objArr = 0 == true ? 1 : 0;
        this.f132783c = new b[]{new b("purchase_render_editor", false, null, null, 14, null), new b("purchase_render_render", false, objArr, null, 14, null)};
        this.f132785e = new com.planner5d.library.services.bitmaploader.target.h();
        com.planner5d.library.activity.fragment.dialog.purchase.c cVarA = productListFetchingFactory.a(k.RENDERS);
        this.f132786f = cVarA;
        this.f132787g = w.g(cVarA.b(), null, 0L, 3, null);
        d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W(Pair pair) {
        return pair == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(b bVar, h hVar, Bitmap bitmap) {
        bVar.e(bitmap);
        bVar.f(false);
        hVar.f0();
        return Unit.f312394a;
    }

    private final void f0() {
        androidx.lifecycle.w0<Pair<Bitmap, Bitmap>> w0Var = this.f132782b;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Pair<android.graphics.Bitmap, android.graphics.Bitmap>?>");
        c1 c1Var = (c1) w0Var;
        b[] bVarArr = this.f132783c;
        ArrayList arrayList = new ArrayList();
        for (b bVar : bVarArr) {
            Bitmap bitmapA = bVar.a();
            if (bitmapA != null) {
                arrayList.add(bitmapA);
            }
        }
        if (arrayList.size() != this.f132783c.length) {
            arrayList = null;
        }
        c1Var.r(arrayList != null ? TuplesKt.to(arrayList.get(0), arrayList.get(1)) : null);
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> Y() {
        return c2.h(this.f132782b, new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.snapshots.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h.W((Pair) obj));
            }
        });
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.dialog.purchase.e> Z() {
        return this.f132787g;
    }

    @NotNull
    public final androidx.lifecycle.w0<Pair<Bitmap, Bitmap>> a0() {
        return this.f132782b;
    }

    public final void b0(@NotNull Point purchaseRenderSize) {
        Intrinsics.checkNotNullParameter(purchaseRenderSize, "purchaseRenderSize");
        Point point = this.f132784d;
        if (point == null || !point.equals(purchaseRenderSize)) {
            this.f132784d = purchaseRenderSize;
            int iMax = Math.max(purchaseRenderSize.x, purchaseRenderSize.y);
            for (final b bVar : this.f132783c) {
                this.f132785e.d(bVar.d());
                com.planner5d.library.services.bitmaploader.target.a aVarC = this.f132785e.c(new a(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.snapshots.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h.c0(bVar, this, (Bitmap) obj);
                    }
                }));
                bVar.f(true);
                bVar.g(aVarC);
                this.f132781a.k(bVar.c(), iMax, iMax, aVarC, 0L);
            }
        }
    }

    public final void d0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(null), 3, null);
    }

    @Override // androidx.lifecycle.f2
    protected void onCleared() {
        super.onCleared();
        this.f132785e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f132791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f132792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Bitmap f132793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private com.planner5d.library.services.bitmaploader.target.a f132794d;

        public b(@NotNull String name, boolean z10, @Nullable Bitmap bitmap, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f132791a = name;
            this.f132792b = z10;
            this.f132793c = bitmap;
            this.f132794d = aVar;
        }

        @Nullable
        public final Bitmap a() {
            return this.f132793c;
        }

        public final boolean b() {
            return this.f132792b;
        }

        @NotNull
        public final String c() {
            return this.f132791a;
        }

        @Nullable
        public final com.planner5d.library.services.bitmaploader.target.a d() {
            return this.f132794d;
        }

        public final void e(@Nullable Bitmap bitmap) {
            this.f132793c = bitmap;
        }

        public final void f(boolean z10) {
            this.f132792b = z10;
        }

        public final void g(@Nullable com.planner5d.library.services.bitmaploader.target.a aVar) {
            this.f132794d = aVar;
        }

        public /* synthetic */ b(String str, boolean z10, Bitmap bitmap, com.planner5d.library.services.bitmaploader.target.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : bitmap, (i10 & 8) != 0 ? null : aVar);
        }
    }
}
