package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import androidx.lifecycle.c1;
import androidx.lifecycle.c2;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.list.n1;
import com.planner5d.library.databinding.c6;
import com.planner5d.library.databinding.e6;
import com.planner5d.library.databinding.k6;
import com.planner5d.library.databinding.m6;
import com.planner5d.library.model.Folder;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderFolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderFolder.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderFolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class c0 extends com.planner5d.library.activity.fragment.list.holders.a<com.planner5d.library.model.g<?>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f134093f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.databinding.e0 f134094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f134095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f134096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final n1<com.planner5d.library.model.g<?>> f134097e;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f134098i = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f134099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f134100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f134101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final View.OnClickListener f134102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final View.OnLongClickListener f134103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final androidx.lifecycle.w0<Boolean> f134104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final androidx.lifecycle.w0<Boolean> f134105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private final View.OnClickListener f134106h;

        public a(@Nullable String str, @Nullable String str2, @androidx.annotation.l int i10, @NotNull View.OnClickListener folderOnClickListener, @NotNull View.OnLongClickListener folderOnLongClickListener, @NotNull androidx.lifecycle.w0<Boolean> isSelectionModeOn, @NotNull androidx.lifecycle.w0<Boolean> isSelected, @Nullable View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(folderOnClickListener, "folderOnClickListener");
            Intrinsics.checkNotNullParameter(folderOnLongClickListener, "folderOnLongClickListener");
            Intrinsics.checkNotNullParameter(isSelectionModeOn, "isSelectionModeOn");
            Intrinsics.checkNotNullParameter(isSelected, "isSelected");
            this.f134099a = str;
            this.f134100b = str2;
            this.f134101c = i10;
            this.f134102d = folderOnClickListener;
            this.f134103e = folderOnLongClickListener;
            this.f134104f = isSelectionModeOn;
            this.f134105g = isSelected;
            this.f134106h = onClickListener;
        }

        @NotNull
        public final View.OnClickListener a() {
            return this.f134102d;
        }

        @NotNull
        public final View.OnLongClickListener b() {
            return this.f134103e;
        }

        public final int c() {
            return this.f134101c;
        }

        @Nullable
        public final View.OnClickListener d() {
            return this.f134106h;
        }

        @Nullable
        public final String e() {
            return this.f134100b;
        }

        @Nullable
        public final String f() {
            return this.f134099a;
        }

        @NotNull
        public final androidx.lifecycle.w0<Boolean> g() {
            return this.f134105g;
        }

        @NotNull
        public final androidx.lifecycle.w0<Boolean> h() {
            return this.f134104f;
        }

        public final void i(@Nullable String str) {
            this.f134100b = str;
        }

        public final void j(@Nullable String str) {
            this.f134099a = str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(@NotNull androidx.databinding.e0 binding, @NotNull l1 viewModel, @NotNull com.planner5d.library.services.utility.p0 formatter, @Nullable n1<com.planner5d.library.model.g<?>> n1Var) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134094b = binding;
        this.f134095c = viewModel;
        this.f134096d = formatter;
        this.f134097e = n1Var;
    }

    private final a p(Context context, final View view, final com.planner5d.library.model.g<?> gVar, final n1<com.planner5d.library.model.g<?>> n1Var) {
        int iN;
        Date dateM;
        View.OnClickListener onClickListener = null;
        final com.planner5d.library.database.model.j jVarF = gVar != null ? gVar.f() : null;
        String title = jVarF != null ? jVarF.getTitle() : null;
        String strM = (jVarF == null || (dateM = jVarF.m()) == null) ? null : this.f134096d.m(context, dateM);
        Resources resources = context.getResources();
        if (jVarF == null || jVarF.c() != com.planner5d.library.database.model.g.TYPE_DOCUMENTS.n()) {
            iN = com.planner5d.library.activity.fragment.spaces.documents.r.COLOR_1.n();
        } else {
            iN = com.planner5d.library.activity.fragment.spaces.documents.r.f136236c.a(jVarF instanceof com.planner5d.library.database.model.spaces.documents.c ? (com.planner5d.library.database.model.spaces.documents.c) jVarF : null).n();
        }
        int color = resources.getColor(iN);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c0.q(jVarF, this, view2);
            }
        };
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.z
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return c0.r(this.f134233a, jVarF, view2);
            }
        };
        androidx.lifecycle.w0<Boolean> w0VarQ1 = this.f134095c.q1();
        androidx.lifecycle.w0 w0VarH = c2.h(this.f134095c.d1(), new Function1() { // from class: com.planner5d.library.activity.fragment.list.holders.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(c0.s(jVarF, (l1.i) obj));
            }
        });
        if (jVarF != null && !Folder.y(jVarF.c())) {
            onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    c0.t(n1Var, view, gVar, view2);
                }
            };
        }
        return new a(title, strM, color, onClickListener2, onLongClickListener, w0VarQ1, w0VarH, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(com.planner5d.library.database.model.j jVar, c0 c0Var, View view) {
        if (jVar != null) {
            c0Var.f134095c.u1(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(c0 c0Var, com.planner5d.library.database.model.j jVar, View view) {
        return c0Var.f134095c.I1(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(com.planner5d.library.database.model.j jVar, l1.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return jVar != null && it.f().contains(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(n1 n1Var, View view, com.planner5d.library.model.g gVar, View view2) {
        if (n1Var != null) {
            n1Var.a(view, gVar);
        }
    }

    private final a u(Context context, final com.planner5d.library.database.model.spaces.documents.c cVar) {
        String strQ = cVar.q();
        int color = context.getResources().getColor(com.planner5d.library.activity.fragment.spaces.documents.r.f136236c.a(cVar).n());
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0.v(this.f134213a, cVar, view);
            }
        };
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.x
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return c0.w(view);
            }
        };
        Boolean bool = Boolean.FALSE;
        int i10 = 2 & 0;
        return new a(strQ, null, color, onClickListener, onLongClickListener, new c1(bool), new c1(bool), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(c0 c0Var, com.planner5d.library.database.model.spaces.documents.c cVar, View view) {
        l1.i iVarF = c0Var.f134095c.d1().f();
        if (iVarF == null || !iVarF.e()) {
            c0Var.f134095c.u1(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(View view) {
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable com.planner5d.library.model.g<?> gVar) {
        com.planner5d.library.database.model.spaces.documents.c cVar;
        a aVarP;
        a aVarP2;
        Context context = this.f134094b.getRoot().getContext();
        androidx.databinding.e0 e0Var = this.f134094b;
        if (e0Var instanceof k6) {
            Intrinsics.checkNotNull(context);
            ImageButton buttonMenu = ((k6) this.f134094b).f159240l3;
            Intrinsics.checkNotNullExpressionValue(buttonMenu, "buttonMenu");
            ((k6) e0Var).n1(p(context, buttonMenu, gVar, this.f134097e));
        } else {
            if (e0Var instanceof c6) {
                c6 c6Var = (c6) e0Var;
                com.planner5d.library.database.model.j jVarF = gVar != null ? gVar.f() : null;
                cVar = jVarF instanceof com.planner5d.library.database.model.spaces.documents.c ? (com.planner5d.library.database.model.spaces.documents.c) jVarF : null;
                if (cVar == null || !cVar.u()) {
                    Intrinsics.checkNotNull(context);
                    ImageButton buttonMenu2 = ((c6) this.f134094b).f158813l3;
                    Intrinsics.checkNotNullExpressionValue(buttonMenu2, "buttonMenu");
                    aVarP2 = p(context, buttonMenu2, gVar, this.f134097e);
                } else {
                    Intrinsics.checkNotNull(context);
                    com.planner5d.library.database.model.j jVarF2 = gVar.f();
                    Intrinsics.checkNotNull(jVarF2, "null cannot be cast to non-null type com.planner5d.library.database.model.spaces.documents.DocumentFolder");
                    aVarP2 = u(context, (com.planner5d.library.database.model.spaces.documents.c) jVarF2);
                }
                c6Var.n1(aVarP2);
            } else if (e0Var instanceof e6) {
                e6 e6Var = (e6) e0Var;
                com.planner5d.library.database.model.j jVarF3 = gVar != null ? gVar.f() : null;
                cVar = jVarF3 instanceof com.planner5d.library.database.model.spaces.documents.c ? (com.planner5d.library.database.model.spaces.documents.c) jVarF3 : null;
                if (cVar == null || !cVar.u()) {
                    Intrinsics.checkNotNull(context);
                    ImageButton buttonMenu3 = ((e6) this.f134094b).f158905l3;
                    Intrinsics.checkNotNullExpressionValue(buttonMenu3, "buttonMenu");
                    aVarP = p(context, buttonMenu3, gVar, this.f134097e);
                } else {
                    Intrinsics.checkNotNull(context);
                    com.planner5d.library.database.model.j jVarF4 = gVar.f();
                    Intrinsics.checkNotNull(jVarF4, "null cannot be cast to non-null type com.planner5d.library.database.model.spaces.documents.DocumentFolder");
                    aVarP = u(context, (com.planner5d.library.database.model.spaces.documents.c) jVarF4);
                }
                e6Var.n1(aVarP);
            } else {
                if (!(e0Var instanceof m6)) {
                    return;
                }
                Intrinsics.checkNotNull(context);
                ImageButton buttonMenu4 = ((m6) this.f134094b).f159355l3;
                Intrinsics.checkNotNullExpressionValue(buttonMenu4, "buttonMenu");
                ((m6) e0Var).n1(p(context, buttonMenu4, gVar, this.f134097e));
            }
        }
        this.f134094b.s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(@NotNull Context context, @NotNull l1 viewModel, @NotNull com.planner5d.library.services.utility.p0 formatter, @NotNull androidx.lifecycle.o0 lifecycleOwner, @Nullable n1<com.planner5d.library.model.g<?>> n1Var) {
        androidx.databinding.e0 e0VarJ1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (viewModel.S0().f() == EnhancedRecyclerView.e.GRID) {
            if (viewModel.g1()) {
                e0VarJ1 = c6.j1(layoutInflaterFrom);
                Intrinsics.checkNotNull(e0VarJ1);
            } else {
                e0VarJ1 = k6.j1(layoutInflaterFrom);
                Intrinsics.checkNotNull(e0VarJ1);
            }
        } else if (viewModel.g1()) {
            e0VarJ1 = e6.j1(layoutInflaterFrom);
            Intrinsics.checkNotNull(e0VarJ1);
        } else {
            e0VarJ1 = m6.j1(layoutInflaterFrom);
            Intrinsics.checkNotNull(e0VarJ1);
        }
        e0VarJ1.C0(lifecycleOwner);
        this(e0VarJ1, viewModel, formatter, n1Var);
    }
}
