package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.lifecycle.c2;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.list.n1;
import com.planner5d.library.databinding.t6;
import com.planner5d.library.databinding.u6;
import com.planner5d.library.databinding.w6;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.EnhancedRecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderSnapshot.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderSnapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,218:1\n1#2:219\n257#3,2:220\n257#3,2:222\n257#3,2:224\n257#3,2:226\n*S KotlinDebug\n*F\n+ 1 MainListViewHolderSnapshot.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderSnapshot\n*L\n173#1:220,2\n177#1:222,2\n181#1:224,2\n187#1:226,2\n*E\n"})
public final class x0 extends com.planner5d.library.activity.fragment.list.holders.a<gd.b> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f134217l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.databinding.e0 f134218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f134219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b4 f134220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f134221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f134222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f1 f134223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final n1<gd.b> f134224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.services.bitmaploader.target.k f134225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f134226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final a f134227k;

    public static final class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.holders.MainListViewHolderSnapshot$createClickListener$1$1", f = "MainListViewHolderSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gd.b f134229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gd.b bVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f134229b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f134229b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f134229b.i(kotlin.coroutines.jvm.internal.b.a(false));
            this.f134229b.save();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(@NotNull androidx.databinding.e0 binding, @NotNull l1 viewModel, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull b4 snapshotManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull f1 coroutineScope, @Nullable n1<gd.b> n1Var) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134218b = binding;
        this.f134219c = viewModel;
        this.f134220d = snapshotManager;
        this.f134221e = formatter;
        this.f134222f = featureConfigManager;
        this.f134223g = coroutineScope;
        this.f134224h = n1Var;
        this.f134225i = new com.planner5d.library.services.bitmaploader.target.k(bitmapTargetManager, scope);
        this.f134226j = this.itemView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167378xh);
        this.f134227k = new a();
    }

    private final void A(boolean z10, boolean z11) {
        if (!z10) {
            B(false);
            View viewX = x();
            if (viewX != null) {
                viewX.setVisibility(8);
                return;
            }
            return;
        }
        if (z11) {
            View viewX2 = x();
            if (viewX2 != null) {
                viewX2.setVisibility(0);
            }
            B(false);
            return;
        }
        B(true);
        View viewX3 = x();
        if (viewX3 != null) {
            viewX3.setVisibility(8);
        }
    }

    private final void B(boolean z10) {
        View viewY = y();
        if (viewY == null) {
            return;
        }
        viewY.setVisibility(z10 ? 0 : 8);
        Drawable drawable = t6.a(viewY).f159712b.getDrawable();
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
        if (z10) {
            animatedVectorDrawable.registerAnimationCallback(this.f134227k);
            animatedVectorDrawable.start();
        } else {
            animatedVectorDrawable.unregisterAnimationCallback(this.f134227k);
            animatedVectorDrawable.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(gd.b bVar, l1.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return bVar != null && it.f().contains(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d p(x0 x0Var, Context context, gd.b bVar, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return x0Var.f134220d.D0(context, bVar, x0Var.f134226j, aVar, null);
    }

    private final View.OnClickListener q(final gd.b bVar) {
        return new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x0.r(bVar, this, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(gd.b bVar, x0 x0Var, View view) {
        if (bVar.t() != 4) {
            return;
        }
        if (bVar.r()) {
            kotlinx.coroutines.k.f(x0Var.f134223g, com.planner5d.library.services.utility.s.f229729a.d(), null, new b(bVar, null), 2, null);
        }
        x0Var.f134219c.A1(bVar);
    }

    private final View.OnClickListener s(final n1<gd.b> n1Var, final View view, final gd.b bVar) {
        return new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x0.t(n1Var, view, bVar, view2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(n1 n1Var, View view, gd.b bVar, View view2) {
        if (n1Var != null) {
            n1Var.a(view, bVar);
        }
    }

    private final View.OnLongClickListener u(final gd.b bVar) {
        return new View.OnLongClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.w0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return x0.v(bVar, this, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(gd.b bVar, x0 x0Var, View view) {
        if (bVar.t() != 4) {
            return true;
        }
        return x0Var.f134219c.I1(bVar);
    }

    private final String w(Context context, gd.b bVar) {
        String strM = this.f134221e.m(context, bVar.p());
        Intrinsics.checkNotNullExpressionValue(strM, "dateTimeForCurrentLanguage(...)");
        return strM;
    }

    private final View x() {
        androidx.databinding.e0 e0Var = this.f134218b;
        if (e0Var instanceof u6) {
            return ((u6) e0Var).f159767o3.f159657b;
        }
        return null;
    }

    private final View y() {
        androidx.databinding.e0 e0Var = this.f134218b;
        if (e0Var instanceof u6) {
            return ((u6) e0Var).f159770r3.f159713c;
        }
        return null;
    }

    private final String z(Context context, gd.b bVar, boolean z10) {
        if (z10) {
            String string = context.getString(com.planner5d.library.f.s.Fa);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (bVar.t() != 3) {
            String title = bVar.getTitle();
            if (title != null) {
                return title;
            }
            String string2 = context.getString(com.planner5d.library.f.s.JC);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (this.f134222f.get().a(com.planner5d.library.model.manager.config.f.RenderFlowUpdate)) {
            String string3 = context.getString(com.planner5d.library.f.s.Dz, Integer.valueOf(bVar.getProgress()));
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        String string4 = context.getString(com.planner5d.library.f.s.f169312o1);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
        this.f134225i.a();
        B(false);
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable final gd.b bVar) {
        ImageView imageView;
        boolean z10 = true;
        if (bVar == null) {
            A(false, true);
            return;
        }
        final Context context = this.f134218b.getRoot().getContext();
        androidx.lifecycle.w0<Boolean> w0VarH = c2.h(this.f134219c.d1(), new Function1() { // from class: com.planner5d.library.activity.fragment.list.holders.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x0.o(bVar, (l1.i) obj));
            }
        });
        androidx.databinding.e0 e0Var = this.f134218b;
        if (e0Var instanceof u6) {
            u6 u6Var = (u6) e0Var;
            imageView = u6Var.f159768p3;
            int iT = bVar.t();
            boolean z11 = iT == 5;
            boolean z12 = bVar.c() == gd.c.ENHANCE;
            Intrinsics.checkNotNull(context);
            u6Var.I1(z(context, bVar, z11 && z12));
            u6Var.H1(w(context, bVar));
            u6Var.C1(this.f134219c.q1());
            u6Var.B1(w0VarH);
            u6Var.F1(q(bVar));
            n1<gd.b> n1Var = this.f134224h;
            ImageButton buttonMenu = u6Var.f159766n3;
            Intrinsics.checkNotNullExpressionValue(buttonMenu, "buttonMenu");
            u6Var.D1(s(n1Var, buttonMenu, bVar));
            u6Var.G1(u(bVar));
            u6Var.z1(Boolean.valueOf(bVar.r() && iT == 4));
            u6Var.y1(Boolean.valueOf(z12 && !z11));
            if (iT != 3 && iT != 2 && iT != 5) {
                z10 = false;
            }
            A(z10, z11);
        } else {
            if (!(e0Var instanceof w6)) {
                return;
            }
            w6 w6Var = (w6) e0Var;
            imageView = w6Var.f159865o3;
            Intrinsics.checkNotNull(context);
            w6Var.E1(z(context, bVar, false));
            w6Var.D1(w(context, bVar));
            w6Var.B1(q(bVar));
            n1<gd.b> n1Var2 = this.f134224h;
            ImageButton buttonMenu2 = w6Var.f159864n3;
            Intrinsics.checkNotNullExpressionValue(buttonMenu2, "buttonMenu");
            w6Var.z1(s(n1Var2, buttonMenu2, bVar));
        }
        e0Var.s();
        com.planner5d.library.services.bitmaploader.target.k.b bVarB = this.f134225i.b(com.planner5d.library.widget.bitmaptarget.a.g(imageView, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
        bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.list.holders.u0
            @Override // com.planner5d.library.services.bitmaploader.d.f
            public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                return x0.p(this.f134202a, context, bVar, aVar);
            }
        });
        bVarB.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(@NotNull Context context, @NotNull l1 viewModel, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull b4 snapshotManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull f1 coroutineScope, @Nullable n1<gd.b> n1Var) {
        androidx.databinding.e0 e0VarR1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (viewModel.S0().f() == EnhancedRecyclerView.e.GRID) {
            e0VarR1 = u6.t1(layoutInflaterFrom);
            Intrinsics.checkNotNullExpressionValue(e0VarR1, "inflate(...)");
        } else {
            e0VarR1 = w6.r1(layoutInflaterFrom);
            Intrinsics.checkNotNullExpressionValue(e0VarR1, "inflate(...)");
        }
        androidx.databinding.e0 e0Var = e0VarR1;
        e0Var.C0(lifecycleOwner);
        this(e0Var, viewModel, bitmapTargetManager, scope, snapshotManager, formatter, featureConfigManager, coroutineScope, n1Var);
    }
}
