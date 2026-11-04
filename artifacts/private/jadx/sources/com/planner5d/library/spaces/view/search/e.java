package com.planner5d.library.spaces.view.search;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class e extends androidx.recyclerview.widget.u<i, RecyclerView.g0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230452d = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f230453c;

    public interface a {
        void a();

        void b(@NotNull i iVar);

        void c();
    }

    public enum b {
        Header,
        Address,
        MyLocation,
        PickLocation,
        NoAddress,
        NoLocationPermission;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f230461h = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f230461h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull a listener) {
        super(new yc.c());
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f230453c = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(e eVar, i iVar) {
        a aVar = eVar.f230453c;
        Intrinsics.checkNotNull(iVar);
        aVar.b(iVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(e eVar) {
        eVar.f230453c.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(e eVar) {
        eVar.f230453c.c();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(e eVar, i iVar) {
        a aVar = eVar.f230453c;
        Intrinsics.checkNotNull(iVar);
        aVar.b(iVar);
        return Unit.f312394a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return i(i10).d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int itemViewType = getItemViewType(i10);
        if (itemViewType == b.Header.ordinal()) {
            i iVarI = i(i10);
            Intrinsics.checkNotNullExpressionValue(iVarI, "getItem(...)");
            ((f) holder).g(iVarI);
            return;
        }
        if (itemViewType == b.MyLocation.ordinal()) {
            final i iVarI2 = i(i10);
            Intrinsics.checkNotNull(iVarI2);
            ((k) holder).h(iVarI2, new Function0() { // from class: com.planner5d.library.spaces.view.search.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.q(this.f230446a, iVarI2);
                }
            });
        } else {
            if (itemViewType == b.PickLocation.ordinal()) {
                ((p) holder).h(new Function0() { // from class: com.planner5d.library.spaces.view.search.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.r(this.f230448a);
                    }
                });
                return;
            }
            if (itemViewType == b.NoAddress.ordinal()) {
                ((l) holder).g();
            } else {
                if (itemViewType == b.NoLocationPermission.ordinal()) {
                    ((n) holder).h(new Function0() { // from class: com.planner5d.library.spaces.view.search.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return e.s(this.f230449a);
                        }
                    });
                    return;
                }
                final i iVarI3 = i(i10);
                Intrinsics.checkNotNull(iVarI3);
                ((h) holder).h(iVarI3, new Function0() { // from class: com.planner5d.library.spaces.view.search.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.t(this.f230450a, iVarI3);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == b.Header.ordinal()) {
            ee.p pVarD = ee.p.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(pVarD, "inflate(...)");
            return new f(pVarD);
        }
        if (i10 == b.MyLocation.ordinal()) {
            ee.r rVarD = ee.r.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(rVarD, "inflate(...)");
            return new k(rVarD);
        }
        if (i10 == b.PickLocation.ordinal()) {
            ee.r rVarD2 = ee.r.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(rVarD2, "inflate(...)");
            return new p(rVarD2);
        }
        if (i10 == b.NoAddress.ordinal()) {
            ee.q qVarD = ee.q.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(qVarD, "inflate(...)");
            return new l(qVarD);
        }
        if (i10 == b.NoLocationPermission.ordinal()) {
            ee.q qVarD2 = ee.q.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(qVarD2, "inflate(...)");
            return new n(qVarD2);
        }
        ee.q qVarD3 = ee.q.d(layoutInflaterFrom, parent, false);
        Intrinsics.checkNotNullExpressionValue(qVarD3, "inflate(...)");
        return new h(qVarD3);
    }
}
