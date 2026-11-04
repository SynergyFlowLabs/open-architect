package com.planner5d.library.activity.fragment.settings;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.y7;
import com.planner5d.library.widget.preloader.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class ViewSocial extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f135206a = 0;

    public static final class a extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f135207a;

        a(ViewSocial viewSocial) {
            this.f135207a = viewSocial.getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.Lh);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.c0 state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            outRect.top = parent.s0(view) > 0 ? this.f135207a : 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSocial(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), com.planner5d.library.f.m.f168669d9, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(t tVar, p pVar, id.e[] eVarArr) {
        if (eVarArr == null) {
            tVar.a().a(com.planner5d.library.f.s.yn, true);
        } else {
            tVar.a().b();
            pVar.k(eVarArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(h hVar, id.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.e() == null) {
            hVar.d0(it);
        } else {
            hVar.g0(it);
        }
        return Unit.f312394a;
    }

    public final void y(@NotNull o0 lifecycleOwner, @NotNull final h viewModel, @NotNull com.planner5d.library.activity.helper.ui.d uiState) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        y7 y7VarA = y7.a(this);
        final t tVar = new t();
        tVar.b(y7VarA.f159992c).g(Integer.valueOf(uiState.f137146m)).h(Integer.valueOf(uiState.f137144k)).j(false);
        final p pVar = new p(new Function1() { // from class: com.planner5d.library.activity.fragment.settings.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewSocial.z(viewModel, (id.e) obj);
            }
        });
        y7VarA.f159991b.n(new a(this));
        y7VarA.f159991b.setAdapter(pVar);
        viewModel.b0().k(lifecycleOwner, new d1() { // from class: com.planner5d.library.activity.fragment.settings.n
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                ViewSocial.A(tVar, pVar, (id.e[]) obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSocial(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), com.planner5d.library.f.m.f168669d9, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSocial(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), com.planner5d.library.f.m.f168669d9, this);
    }
}
