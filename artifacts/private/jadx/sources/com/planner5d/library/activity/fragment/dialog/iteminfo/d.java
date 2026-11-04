package com.planner5d.library.activity.fragment.dialog.iteminfo;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.catalog.CatalogItemMetadata;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.services.l;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.v1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class d extends f2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f132092g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f132093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v1.a<Unit> f132094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f132095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f132096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f132097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private p2 f132098f;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfoViewModel$notifyAddCatalogItem$1", f = "ItemInfoViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132099a;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.iteminfo.d$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfoViewModel$notifyAddCatalogItem$1$1", f = "ItemInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1454a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132101a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f132102b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1454a(d dVar, kotlin.coroutines.d<? super C1454a> dVar2) {
                super(2, dVar2);
                this.f132102b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1454a(this.f132102b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f132101a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                v1.a<Unit> aVarX = this.f132102b.X();
                Unit unit = Unit.f312394a;
                aVarX.r(unit);
                return unit;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1454a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CatalogItem catalogItemW;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132099a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVar = d.this.f132093a;
                String str = d.this.f132096d;
                if (str != null && (catalogItemW = iVar.w(str)) != null) {
                    v1.a<l.b> aVar = l.f224376b;
                    CatalogItemMetadata catalogItemMetadata = catalogItemW.metadata;
                    aVar.o(new l.b(catalogItemW, catalogItemMetadata == null ? null : catalogItemMetadata.materialSets.get(d.this.f132097e)));
                    a3 a3VarA = s.f229729a.a();
                    C1454a c1454a = new C1454a(d.this, null);
                    this.f132099a = 1;
                    if (kotlinx.coroutines.i.h(a3VarA, c1454a, this) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public d(@NotNull i builtInDataManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f132093a = builtInDataManager;
        int i10 = 0 << 1;
        this.f132094b = v1.l(v1.f229769a, null, 1, null);
    }

    @NotNull
    public final v1.a<Unit> X() {
        return this.f132094b;
    }

    public final void Y(@NotNull String itemId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (this.f132095c) {
            return;
        }
        this.f132095c = true;
        this.f132096d = itemId;
        this.f132097e = str;
    }

    public final void Z() {
        p2 p2Var = this.f132098f;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f132098f = k.f(g2.a(this), s.f229729a.h(), null, new a(null), 2, null);
    }
}
