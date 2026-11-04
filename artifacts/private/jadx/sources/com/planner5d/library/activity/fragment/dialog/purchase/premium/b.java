package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPremiumProductAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumProductAdapter.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PremiumProductAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n774#2:129\n865#2,2:130\n774#2:132\n865#2,2:133\n295#2,2:135\n295#2,2:137\n295#2,2:140\n1#3:139\n*S KotlinDebug\n*F\n+ 1 PremiumProductAdapter.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PremiumProductAdapter\n*L\n35#1:129\n35#1:130,2\n36#1:132\n36#1:133,2\n37#1:135,2\n38#1:137,2\n40#1:140,2\n*E\n"})
public final class b extends RecyclerView.h<C1459b> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f132666j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f132667k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f132668l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f132669m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f132670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f132671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private fd.g f132672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private List<fd.g> f132673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<fd.g> f132674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private fd.g f132675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private fd.g f132676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f132677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final r f132678i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.purchase.premium.b$b, reason: collision with other inner class name */
    public final class C1459b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.activity.fragment.dialog.purchase.b f132679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f132680b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1459b(@NotNull b bVar, com.planner5d.library.activity.fragment.dialog.purchase.b view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f132680b = bVar;
            this.f132679a = view;
        }

        public final void g(@NotNull fd.g product, @Nullable fd.g gVar, @Nullable fd.g gVar2, @NotNull View.OnClickListener clickListener) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            fd.f fVar = product.f275144a;
            fd.f fVar2 = gVar != null ? gVar.f275144a : null;
            r rVar = this.f132680b.f132678i;
            this.f132679a.a(rVar.e(fVar), Intrinsics.areEqual(product, gVar2), rVar.h(fVar, fVar2), rVar.r(fVar), rVar.f(fVar, fVar2), fVar.r());
            this.f132679a.setOnClickListener(clickListener);
        }
    }

    public enum c {
        Standard,
        WithTrial,
        Recommendations,
        RecommendationsAdvanced,
        WithTrialSquare;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f132687g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f132687g;
        }
    }

    public b(@NotNull Context context, @NotNull p0 formatter, @NotNull t1 logRecordManager, @NotNull c viewType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f132670a = viewType;
        this.f132673d = CollectionsKt.emptyList();
        this.f132674e = CollectionsKt.emptyList();
        this.f132678i = new r(context, formatter, viewType, logRecordManager);
    }

    private final c k(c cVar, boolean z10) {
        return (cVar == c.Recommendations && z10) ? c.RecommendationsAdvanced : cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar, int i10, View view) {
        bVar.f132672c = bVar.f132673d.get(i10);
        bVar.notifyDataSetChanged();
        Function0<Unit> function0 = bVar.f132671b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final fd.g o(int i10) {
        fd.g gVar = (fd.g) CollectionsKt.getOrNull(this.f132673d, 1);
        if (gVar == null || i10 != 0) {
            return null;
        }
        return gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f132673d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Nullable
    public final fd.g j() {
        fd.f fVar;
        fd.i iVarK;
        fd.g gVar;
        fd.g gVar2 = this.f132672c;
        return (!this.f132677h || gVar2 == null || (fVar = gVar2.f275144a) == null || (iVarK = fVar.k()) == null || !iVarK.u() || (gVar = (fd.g) CollectionsKt.firstOrNull((List) this.f132674e)) == null) ? gVar2 : gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @e.a({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C1459b holder, final int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.g(this.f132673d.get(i10), o(i10), this.f132672c, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.m(this.f132664a, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C1459b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new C1459b(this, new com.planner5d.library.activity.fragment.dialog.purchase.b(context, null, 0, k(this.f132670a, i10 == 0)));
    }

    @e.a({"NotifyDataSetChanged"})
    public final void p(@NotNull fd.g[] products, boolean z10) {
        Object obj;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(products, "products");
        this.f132677h = z10;
        this.f132678i.i(z10);
        List list = ArraysKt.toList(products);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            fd.g gVar = (fd.g) obj2;
            if (!gVar.a() && !gVar.b()) {
                arrayList.add(obj2);
            }
        }
        this.f132673d = arrayList;
        List list2 = ArraysKt.toList(products);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((fd.g) obj3).a()) {
                arrayList2.add(obj3);
            }
        }
        this.f132674e = arrayList2;
        Iterator<T> it = this.f132673d.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((fd.g) next).f275144a.n());
        this.f132675f = (fd.g) next;
        Iterator<T> it2 = this.f132673d.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((fd.g) next2).f275144a.q());
        this.f132676g = (fd.g) next2;
        fd.g gVar2 = this.f132672c;
        if (!ArraysKt.contains(products, gVar2)) {
            gVar2 = null;
        }
        if (gVar2 == null) {
            for (Object obj4 : this.f132673d) {
                if (((fd.g) obj4).f275144a.r()) {
                    obj = obj4;
                    break;
                }
            }
            gVar2 = (fd.g) obj;
            if (gVar2 == null) {
                gVar2 = (fd.g) CollectionsKt.firstOrNull((List) this.f132673d);
            }
        }
        this.f132672c = gVar2;
        notifyDataSetChanged();
    }

    public final void q(@NotNull Function0<Unit> onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.f132671b = onItemClickListener;
    }

    @e.a({"NotifyDataSetChanged"})
    public final void r(boolean z10) {
        this.f132677h = z10;
        this.f132678i.i(z10);
        notifyDataSetChanged();
    }
}
