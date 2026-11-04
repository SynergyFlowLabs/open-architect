package com.planner5d.library.aichat.view.bottomsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends androidx.recyclerview.widget.u<d0, RecyclerView.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f142154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function1<? super String, Unit> f142155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f142156e;

    public enum a {
        Ai,
        User;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f142160d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f142160d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context) {
        super(new yc.c());
        Intrinsics.checkNotNullParameter(context, "context");
        this.f142154c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(x xVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super String, Unit> function1 = xVar.f142155d;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(x xVar) {
        Function0<Unit> function0 = xVar.f142156e;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return i(i10).a() ? a.Ai.ordinal() : a.User.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(i10) == a.Ai.ordinal()) {
            d0 d0VarI = i(i10);
            Intrinsics.checkNotNullExpressionValue(d0VarI, "getItem(...)");
            ((b0) holder).i(d0VarI);
        } else if (getItemViewType(i10) == a.User.ordinal()) {
            d0 d0VarI2 = i(i10);
            Intrinsics.checkNotNullExpressionValue(d0VarI2, "getItem(...)");
            ((c0) holder).g(d0VarI2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 != a.Ai.ordinal()) {
            wa.g gVarD = wa.g.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(gVarD, "inflate(...)");
            return new c0(gVarD);
        }
        Context context = this.f142154c;
        wa.e eVarD = wa.e.d(layoutInflaterFrom, parent, false);
        Intrinsics.checkNotNullExpressionValue(eVarD, "inflate(...)");
        return new b0(context, eVarD, new Function1() { // from class: com.planner5d.library.aichat.view.bottomsheet.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x.o(this.f142152a, (String) obj);
            }
        }, new Function0() { // from class: com.planner5d.library.aichat.view.bottomsheet.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x.p(this.f142153a);
            }
        });
    }

    public final void q(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f142155d = listener;
    }

    public final void r(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f142156e = listener;
    }
}
