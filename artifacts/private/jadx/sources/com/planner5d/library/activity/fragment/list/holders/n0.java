package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.lifecycle.c2;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.list.n1;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.u6;
import com.planner5d.library.databinding.w6;
import com.planner5d.library.widget.EnhancedRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderProject.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderProject\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,121:1\n1#2:122\n257#3,2:123\n257#3,2:125\n*S KotlinDebug\n*F\n+ 1 MainListViewHolderProject.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderProject\n*L\n97#1:123,2\n98#1:125,2\n*E\n"})
public final class n0 extends a<Project> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f134162j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.databinding.e0 f134163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f134164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f134165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f134166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f134167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final n1<Project> f134168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.services.bitmaploader.target.k f134169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f134170i;

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(@NotNull androidx.databinding.e0 binding, @NotNull l1 viewModel, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @Nullable n1<Project> n1Var) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134163b = binding;
        this.f134164c = viewModel;
        this.f134165d = bitmapTargetManager;
        this.f134166e = projectManager;
        this.f134167f = formatter;
        this.f134168g = n1Var;
        this.f134169h = new com.planner5d.library.services.bitmaploader.target.k(bitmapTargetManager, scope);
        this.f134170i = this.itemView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167378xh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Project project, l1.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return project != null && it.f().contains(project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d q(n0 n0Var, Project project, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return n0Var.f134166e.d0(project, n0Var.f134170i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d r(n0 n0Var, Context context, Project project, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return n0Var.f134166e.c0(context, project, n0Var.f134170i, aVar);
    }

    private final View.OnClickListener s(final n1<Project> n1Var, final View view, final Project project) {
        return new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                n0.t(n1Var, view, project, view2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(n1 n1Var, View view, Project project, View view2) {
        if (n1Var != null) {
            n1Var.a(view, project);
        }
    }

    private final View.OnClickListener u(final Project project) {
        return new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.v(this.f134125a, project, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(n0 n0Var, Project project, View view) {
        n0Var.f134164c.A1(project);
    }

    private final View.OnLongClickListener w(final Project project) {
        return new View.OnLongClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.l0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return n0.x(this.f134152a, project, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(n0 n0Var, Project project, View view) {
        return n0Var.f134164c.I1(project);
    }

    private final String y(Context context, Project project) {
        return this.f134167f.m(context, project != null ? project.m() : null);
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
        this.f134169h.a();
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void h(boolean z10) {
        androidx.databinding.e0 e0Var = this.f134163b;
        if (e0Var instanceof u6) {
            View blocker = ((u6) e0Var).f159765m3;
            Intrinsics.checkNotNullExpressionValue(blocker, "blocker");
            blocker.setVisibility(z10 ? 0 : 8);
        } else {
            if (e0Var instanceof w6) {
                View blocker2 = ((w6) e0Var).f159863m3;
                Intrinsics.checkNotNullExpressionValue(blocker2, "blocker");
                blocker2.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable final Project project) {
        ImageView imageView;
        final Context context = this.f134163b.getRoot().getContext();
        androidx.databinding.e0 e0Var = this.f134163b;
        androidx.lifecycle.w0<Boolean> w0VarH = c2.h(this.f134164c.d1(), new Function1() { // from class: com.planner5d.library.activity.fragment.list.holders.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n0.p(project, (l1.i) obj));
            }
        });
        if (e0Var instanceof u6) {
            u6 u6Var = (u6) e0Var;
            imageView = u6Var.f159768p3;
            u6Var.E1(project != null ? Boolean.valueOf(project.D()) : null);
            u6Var.A1(project != null ? Boolean.valueOf(project.E()) : null);
            u6Var.C1(this.f134164c.q1());
            u6Var.B1(w0VarH);
            u6Var.I1(project != null ? project.title : null);
            Intrinsics.checkNotNull(context);
            u6Var.H1(y(context, project));
            u6Var.F1(u(project));
            u6Var.G1(w(project));
            n1<Project> n1Var = this.f134168g;
            ImageButton buttonMenu = u6Var.f159766n3;
            Intrinsics.checkNotNullExpressionValue(buttonMenu, "buttonMenu");
            u6Var.D1(s(n1Var, buttonMenu, project));
        } else {
            if (!(e0Var instanceof w6)) {
                return;
            }
            w6 w6Var = (w6) e0Var;
            imageView = w6Var.f159865o3;
            w6Var.A1(project != null ? Boolean.valueOf(project.D()) : null);
            w6Var.w1(project != null ? Boolean.valueOf(project.E()) : null);
            w6Var.y1(this.f134164c.q1());
            w6Var.x1(w0VarH);
            w6Var.E1(project != null ? project.title : null);
            Intrinsics.checkNotNull(context);
            w6Var.D1(y(context, project));
            w6Var.B1(u(project));
            w6Var.C1(w(project));
            n1<Project> n1Var2 = this.f134168g;
            ImageButton buttonMenu2 = w6Var.f159864n3;
            Intrinsics.checkNotNullExpressionValue(buttonMenu2, "buttonMenu");
            w6Var.z1(s(n1Var2, buttonMenu2, project));
        }
        e0Var.s();
        com.planner5d.library.services.bitmaploader.target.k.b bVarB = this.f134169h.b(com.planner5d.library.widget.bitmaptarget.a.g(imageView, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
        if (project != null) {
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.list.holders.j0
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return n0.q(this.f134133a, project, aVar);
                }
            });
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.list.holders.k0
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return n0.r(this.f134148a, context, project, aVar);
                }
            });
        }
        bVarB.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(@NotNull Context context, @NotNull l1 viewModel, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @Nullable n1<Project> n1Var) {
        androidx.databinding.e0 e0VarR1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
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
        this(e0Var, viewModel, bitmapTargetManager, scope, projectManager, formatter, n1Var);
    }
}
