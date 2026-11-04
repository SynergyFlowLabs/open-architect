package com.planner5d.library.widget.menu;

import android.R;
import android.content.res.ColorStateList;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class u extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f258379e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ue.b[] f258380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<ue.b, Unit> f258381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f258382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f258383d;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f258384e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f258385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function1<ue.b, Unit> f258386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final TextView f258387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final RadioButton f258388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ViewGroup parent, @NotNull Function1<? super ue.b, Unit> onItemClickListener, boolean z10) {
            super(LayoutInflater.from(parent.getContext()).inflate(z10 ? c1.l.f252166i2 : c1.l.f252162h2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
            this.f258385a = parent;
            this.f258386b = onItemClickListener;
            View viewFindViewById = this.itemView.findViewById(c1.i.f251801d3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f258387c = (TextView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(c1.i.f251789c3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f258388d = (RadioButton) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, ue.b bVar, View view) {
            aVar.f258386b.invoke(bVar);
        }

        public final void h(@NotNull final ue.b menuItem, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(menuItem, "menuItem");
            this.f258387c.setText((CharSequence) ((Pair) menuItem).second);
            Integer numA = menuItem.a();
            boolean z10 = false;
            if (numA != null) {
                this.f258387c.setCompoundDrawablesRelativeWithIntrinsicBounds(numA.intValue(), 0, 0, 0);
                TextView textView = this.f258387c;
                textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(c1.f.Id));
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.menu.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.a.i(this.f258377a, menuItem, view);
                }
            });
            androidx.core.widget.d.d(this.f258388d, new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{androidx.core.content.d.g(this.f258385a.getContext(), c1.e.f250847wf), androidx.core.content.d.g(this.f258385a.getContext(), c1.e.Rf)}));
            RadioButton radioButton = this.f258388d;
            if (num != null && Intrinsics.areEqual(num, ((Pair) menuItem).first)) {
                z10 = true;
            }
            radioButton.setChecked(z10);
        }

        @NotNull
        public final ViewGroup j() {
            return this.f258385a;
        }
    }

    @w0(parameters = 0)
    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f258389b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f258390a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(c1.l.f252170j2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f258390a = parent;
        }

        public final void g() {
        }

        @NotNull
        public final ViewGroup h() {
            return this.f258390a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public u(@NotNull ue.b[] options, @NotNull Function1<? super ue.b, Unit> onItemClickListener) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.f258380a = options;
        this.f258381b = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f258380a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return Intrinsics.areEqual(ue.b.f381244b, this.f258380a[i10]) ? 1 : 0;
    }

    @NotNull
    public final u h(boolean z10) {
        this.f258383d = z10;
        return this;
    }

    @e.a({"NotifyDataSetChanged"})
    @NotNull
    public final u i(int i10) {
        this.f258382c = Integer.valueOf(i10);
        notifyDataSetChanged();
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ue.b bVar = this.f258380a[i10];
        if (Intrinsics.areEqual(ue.b.f381244b, bVar)) {
            ((b) holder).g();
        } else {
            ((a) holder).h(bVar, this.f258382c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return i10 == 1 ? new b(parent) : new a(parent, this.f258381b, this.f258383d);
    }
}
