package com.planner5d.library.activity.fragment.profile.orders;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.e7;
import com.planner5d.library.databinding.f7;
import com.planner5d.library.modules.user.user.t;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class b extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f134726c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<t> f134727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends h> f134728b;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nOrdersHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersHistoryAdapter.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryAdapter$OrderRowViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,127:1\n257#2,2:128\n299#2,2:130\n299#2,2:132\n28#3:134\n*S KotlinDebug\n*F\n+ 1 OrdersHistoryAdapter.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryAdapter$OrderRowViewHolder\n*L\n100#1:128,2\n103#1:130,2\n104#1:132,2\n111#1:134\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f134729o = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f134730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final fg.e<t> f134731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final e7 f134732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final TextView f134733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final TextView f134734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final TextView f134735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final TextView f134736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final TextView f134737h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final TextView f134738i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final TextView f134739j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private final TextView f134740k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private final TextView f134741l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        private final TextView f134742m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private final ConstraintLayout f134743n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent, @NotNull fg.e<t> userAuthorization) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.f168907z8, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
            this.f134730a = parent;
            this.f134731b = userAuthorization;
            e7 e7VarA = e7.a(this.itemView);
            Intrinsics.checkNotNullExpressionValue(e7VarA, "bind(...)");
            this.f134732c = e7VarA;
            TextView ordersHistoryRowDate = e7VarA.f158914c;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowDate, "ordersHistoryRowDate");
            this.f134733d = ordersHistoryRowDate;
            TextView ordersHistoryRowTime = e7VarA.f158922k;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowTime, "ordersHistoryRowTime");
            this.f134734e = ordersHistoryRowTime;
            TextView ordersHistoryRowSource = e7VarA.f158919h;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowSource, "ordersHistoryRowSource");
            this.f134735f = ordersHistoryRowSource;
            TextView ordersHistoryRowNumber = e7VarA.f158916e;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowNumber, "ordersHistoryRowNumber");
            this.f134736g = ordersHistoryRowNumber;
            TextView ordersHistoryRowOrderedItem = e7VarA.f158917f;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowOrderedItem, "ordersHistoryRowOrderedItem");
            this.f134737h = ordersHistoryRowOrderedItem;
            TextView ordersHistoryRowOrderedItemExplanation = e7VarA.f158918g;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowOrderedItemExplanation, "ordersHistoryRowOrderedItemExplanation");
            this.f134738i = ordersHistoryRowOrderedItemExplanation;
            TextView ordersHistoryRowStatus = e7VarA.f158920i;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowStatus, "ordersHistoryRowStatus");
            this.f134739j = ordersHistoryRowStatus;
            TextView ordersHistoryRowStatusExplanation = e7VarA.f158921j;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryRowStatusExplanation, "ordersHistoryRowStatusExplanation");
            this.f134740k = ordersHistoryRowStatusExplanation;
            TextView ordersHistoryUserId = e7VarA.f158923l;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryUserId, "ordersHistoryUserId");
            this.f134741l = ordersHistoryUserId;
            TextView ordersHistoryUserTitle = e7VarA.f158924m;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryUserTitle, "ordersHistoryUserTitle");
            this.f134742m = ordersHistoryUserTitle;
            ConstraintLayout cardBackground = e7VarA.f158913b;
            Intrinsics.checkNotNullExpressionValue(cardBackground, "cardBackground");
            this.f134743n = cardBackground;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(i iVar, View view) {
            iVar.b().invoke();
        }

        public final void h(@NotNull final i item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f134733d.setText(item.c());
            this.f134734e.setText(item.i());
            this.f134735f.setText(item.f());
            this.f134736g.setText(item.d());
            this.f134737h.setText(item.e());
            int i10 = 8;
            this.f134738i.setVisibility(item.l() ? 0 : 8);
            this.f134741l.setText(String.valueOf(item.k()));
            boolean z10 = item.k() == this.f134731b.get().e();
            this.f134741l.setVisibility(z10 ? 8 : 0);
            TextView textView = this.f134742m;
            if (!z10) {
                i10 = 0;
            }
            textView.setVisibility(i10);
            this.f134743n.setBackground(new ColorDrawable(androidx.core.content.res.i.e(this.f134730a.getResources(), z10 ? com.planner5d.library.f.C1549f.Rh : com.planner5d.library.f.C1549f.f166777wh, null)));
            if (item.g() != 0) {
                this.f134739j.setText(this.f134730a.getContext().getString(item.g()));
            }
            if (item.h() != 0) {
                this.f134740k.setText(this.f134730a.getContext().getString(item.h()));
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.orders.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a.i(item, view);
                }
            });
        }

        @NotNull
        public final ViewGroup j() {
            return this.f134730a;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.profile.orders.b$b, reason: collision with other inner class name */
    @w0(parameters = 0)
    public static final class C1479b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f134744h = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f134745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final fg.e<t> f134746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final f7 f134747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final TextView f134748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final TextView f134749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final TextView f134750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final TextView f134751g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1479b(@NotNull ViewGroup parent, @NotNull fg.e<t> userAuthorization) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.A8, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
            this.f134745a = parent;
            this.f134746b = userAuthorization;
            f7 f7VarA = f7.a(this.itemView);
            Intrinsics.checkNotNullExpressionValue(f7VarA, "bind(...)");
            this.f134747c = f7VarA;
            TextView ordersHistoryPlatformRowTitle = f7VarA.f158982h;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryPlatformRowTitle, "ordersHistoryPlatformRowTitle");
            this.f134748d = ordersHistoryPlatformRowTitle;
            TextView ordersHistoryPlatformRowPremium = f7VarA.f158976b;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryPlatformRowPremium, "ordersHistoryPlatformRowPremium");
            this.f134749e = ordersHistoryPlatformRowPremium;
            TextView ordersHistoryPlatformRowSnapshots = f7VarA.f158978d;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryPlatformRowSnapshots, "ordersHistoryPlatformRowSnapshots");
            this.f134750f = ordersHistoryPlatformRowSnapshots;
            TextView ordersHistoryPlatformRowTextures = f7VarA.f158980f;
            Intrinsics.checkNotNullExpressionValue(ordersHistoryPlatformRowTextures, "ordersHistoryPlatformRowTextures");
            this.f134751g = ordersHistoryPlatformRowTextures;
        }

        public final void g(@NotNull j item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f134748d.setText(this.f134745a.getContext().getString(item.c()));
            this.f134749e.setText(z.i(item.b()));
            id.a aVarA = this.f134746b.get().a();
            if (aVarA == null || !aVarA.g()) {
                this.f134750f.setText(item.d());
                this.f134751g.setText(item.e());
            } else {
                String string = this.f134745a.getContext().getString(com.planner5d.library.f.s.rG);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                this.f134750f.setText(string);
                this.f134751g.setText(string);
            }
        }

        @NotNull
        public final ViewGroup h() {
            return this.f134745a;
        }
    }

    @w0(parameters = 0)
    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f134752b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f134753a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.B8, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f134753a = parent;
        }

        @NotNull
        public final ViewGroup g() {
            return this.f134753a;
        }
    }

    @ij.a
    public b(@NotNull fg.e<t> userAuthorization) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f134727a = userAuthorization;
        this.f134728b = CollectionsKt.emptyList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f134728b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f134728b.get(i10).a().n();
    }

    @e.a({"NotifyDataSetChanged"})
    public final void h(@NotNull List<? extends h> listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f134728b = listItems;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        h hVar = this.f134728b.get(i10);
        if (hVar instanceof j) {
            ((C1479b) holder).g((j) hVar);
        } else {
            if (hVar instanceof i) {
                ((a) holder).h((i) hVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 == h.a.Platform.n()) {
            return new C1479b(parent, this.f134727a);
        }
        return i10 == h.a.Order.n() ? new a(parent, this.f134727a) : new c(parent);
    }
}
