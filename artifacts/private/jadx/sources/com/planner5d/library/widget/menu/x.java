package com.planner5d.library.widget.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class x extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258395c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<y> f258396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<y, Unit> f258397b;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nSimpleActionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleActionsAdapter.kt\ncom/planner5d/library/widget/menu/SimpleActionsAdapter$SimpleActionViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,47:1\n257#2,2:48\n*S KotlinDebug\n*F\n+ 1 SimpleActionsAdapter.kt\ncom/planner5d/library/widget/menu/SimpleActionsAdapter$SimpleActionViewHolder\n*L\n25#1:48,2\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f258398c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<y, Unit> f258399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final TextView f258400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ViewGroup parent, @NotNull Function1<? super y, Unit> onActionClickListener) {
            super(LayoutInflater.from(parent.getContext()).inflate(c1.l.f252182m2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(onActionClickListener, "onActionClickListener");
            this.f258399a = onActionClickListener;
            View viewFindViewById = this.itemView.findViewById(c1.i.f251943p1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById;
            this.f258400b = textView;
            View viewFindViewById2 = this.itemView.findViewById(c1.i.f251919n1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            viewFindViewById2.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, y yVar, View view) {
            aVar.f258399a.invoke(yVar);
        }

        public final void h(@NotNull final y action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f258400b.setText(action.b());
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.menu.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x.a.i(this.f258393a, action, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull List<y> actions, @NotNull Function1<? super y, Unit> onActionClickListener) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(onActionClickListener, "onActionClickListener");
        this.f258396a = actions;
        this.f258397b = onActionClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f258396a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent, this.f258397b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).h(this.f258396a.get(i10));
    }
}
