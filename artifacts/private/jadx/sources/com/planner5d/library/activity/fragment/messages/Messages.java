package com.planner5d.library.activity.fragment.messages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.c0;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.planner5d.library.databinding.h1;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.u;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.q2;
import com.planner5d.library.services.utility.t3;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Messages.kt\ncom/planner5d/library/activity/fragment/messages/Messages\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,259:1\n12#2,6:260\n28#2:266\n1#3:267\n13474#4,3:268\n13409#4,2:273\n257#5,2:271\n*S KotlinDebug\n*F\n+ 1 Messages.kt\ncom/planner5d/library/activity/fragment/messages/Messages\n*L\n37#1:260,6\n37#1:266\n142#1:268,3\n175#1:273,2\n161#1:271,2\n*E\n"})
public final class Messages extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f134455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f134456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private c f134457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f134458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h1 f134459e;

    public enum a {
        ButtonPrimary(com.planner5d.library.f.C1549f.f166580oc, com.planner5d.library.f.C1549f.f166652rc),
        ButtonPrimaryContests(com.planner5d.library.f.C1549f.f166604pc, com.planner5d.library.f.C1549f.f166273bi),
        ButtonPrimaryContestNotify(com.planner5d.library.f.C1549f.f166442ii, com.planner5d.library.f.C1549f.Xn);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f134464g = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f134465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f134466b;

        a(int i10, int i11) {
            this.f134465a = i10;
            this.f134466b = i11;
        }

        @NotNull
        public static kotlin.enums.a<a> n() {
            return f134464g;
        }

        public final int l() {
            return this.f134465a;
        }

        public final int o() {
            return this.f134466b;
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Messages.kt\ncom/planner5d/library/activity/fragment/messages/Messages$LifecycleOwnerMessage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
    public static final class b implements o0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f134467e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.activity.helper.ui.c f134468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f134469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f134470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f134471d;

        public b() {
            com.planner5d.library.activity.helper.ui.c cVar = new com.planner5d.library.activity.helper.ui.c(this);
            cVar.v(c0.b.CREATED);
            this.f134468a = cVar;
            this.f134470c = 2;
            this.f134471d = true;
        }

        private final boolean d() {
            int i10 = this.f134470c;
            return i10 == 2 || i10 == 1;
        }

        private final void e() {
            c0.b bVar;
            com.planner5d.library.activity.helper.ui.c cVar = this.f134468a;
            if (this.f134469b) {
                bVar = c0.b.DESTROYED;
            } else {
                bVar = (d() || this.f134471d) ? c0.b.CREATED : c0.b.RESUMED;
            }
            cVar.v(bVar);
        }

        public final int a() {
            return this.f134470c;
        }

        public final boolean b() {
            return this.f134469b;
        }

        public final boolean c() {
            return this.f134471d;
        }

        public final void f(int i10) {
            this.f134470c = i10;
            e();
        }

        public final void g(boolean z10) {
            this.f134469b = z10;
            e();
        }

        @Override // androidx.lifecycle.o0
        @NotNull
        public c0 getLifecycle() {
            return this.f134468a;
        }

        public final void h(boolean z10) {
            this.f134471d = z10;
            e();
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Messages.kt\ncom/planner5d/library/activity/fragment/messages/Messages$MessageExpandBottomSheetCallback\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,259:1\n257#2,2:260\n*S KotlinDebug\n*F\n+ 1 Messages.kt\ncom/planner5d/library/activity/fragment/messages/Messages$MessageExpandBottomSheetCallback\n*L\n218#1:260,2\n*E\n"})
    public static final class c extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f134472e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f134473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final View f134474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final BottomSheetBehavior<View> f134475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f134476d;

        public c(@NotNull b lifecycleOwner, @NotNull View button, @NotNull BottomSheetBehavior<View> behavior) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            this.f134473a = lifecycleOwner;
            this.f134474b = button;
            this.f134475c = behavior;
            this.f134476d = true;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.messages.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Messages.c.b(this.f134492a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c cVar, View view) {
            if (cVar.f134476d) {
                cVar.f134475c.g(3);
            }
        }

        public final boolean c() {
            return this.f134476d;
        }

        public final void d(boolean z10) {
            this.f134476d = z10;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NotNull View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NotNull View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            int i11 = 3 >> 4;
            this.f134474b.setVisibility(i10 == 4 ? 0 : 8);
            this.f134473a.f(i10);
        }
    }

    private enum d {
        Message(com.planner5d.library.f.h.F3, com.planner5d.library.f.C1549f.f166273bi),
        MessageContest(com.planner5d.library.f.h.X1, com.planner5d.library.f.C1549f.Xn);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f134480f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f134481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f134482b;

        d(int i10, int i11) {
            this.f134481a = i10;
            this.f134482b = i11;
        }

        @NotNull
        public static kotlin.enums.a<d> n() {
            return f134480f;
        }

        public final int l() {
            return this.f134481a;
        }

        public final int o() {
            return this.f134482b;
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134483a;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.ContestError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.c.ContestVotingNotify.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f134483a = iArr;
        }
    }

    static final class f implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134484a;

        f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134484a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134484a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134484a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public Messages() {
        t3 t3Var = t3.f229751a;
        this.f134455a = new i2(j1.d(g.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f134456b = g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.messages.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Messages.C();
            }
        });
        this.f134458d = new b();
    }

    private final g A() {
        return (g) this.f134455a.getValue();
    }

    private final boolean B(b2.a aVar) {
        if (aVar.a().d() != u.c.SnackbarSuccess && aVar.a().d() != u.c.SnackbarError) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ud.b C() {
        return com.planner5d.library.application.b.f142455c.a().q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Messages messages, b2.a aVar) {
        messages.H(aVar);
        return Unit.f312394a;
    }

    private final void E(BottomSheetBehavior<View> bottomSheetBehavior, boolean z10) {
        try {
            q2.e(bottomSheetBehavior, BottomSheetBehavior.class, "hideable", Boolean.valueOf(z10));
        } catch (Throwable unused) {
            bottomSheetBehavior.l1(z10);
        }
    }

    private final void F(final b2.a aVar) {
        s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        BottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior != null) {
            c cVar = this.f134457c;
            int i10 = 3 << 0;
            if (cVar != null) {
                cVar.d(aVar != null);
            }
            if (aVar == null) {
                bottomSheetBehavior.l1(true);
                bottomSheetBehavior.g(5);
                bottomSheetBehavior.f1(false);
                return;
            }
            d dVar = e.f134483a[aVar.a().d().ordinal()] == 1 ? d.MessageContest : d.Message;
            View view = getView();
            if (view != null) {
                view.setBackgroundResource(dVar.l());
            }
            h1 h1Var = this.f134459e;
            h1 h1Var2 = null;
            if (h1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h1Var = null;
            }
            h1Var.f159056f.setTextColor(androidx.core.content.d.g(sVarRequireActivity, dVar.o()));
            h1 h1Var3 = this.f134459e;
            if (h1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h1Var3 = null;
            }
            h1Var3.f159055e.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(sVarRequireActivity, aVar.a().d().o(), Integer.valueOf(androidx.core.content.d.g(sVarRequireActivity, aVar.a().d().l()))));
            h1 h1Var4 = this.f134459e;
            if (h1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h1Var4 = null;
            }
            com.planner5d.library.services.textspan.b.n(h1Var4.f159056f, aVar.a().c().d(sVarRequireActivity, new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.messages.c
                @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
                public final void a(String str) {
                    Messages.G(this.f134489a, aVar, str);
                }
            }));
            h1 h1Var5 = this.f134459e;
            if (h1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h1Var5 = null;
            }
            h1Var5.f159057g.setText(aVar.b() > 1 ? sVarRequireActivity.getString(com.planner5d.library.f.s.nq, Integer.valueOf(aVar.b() - 1)) : null);
            h1 h1Var6 = this.f134459e;
            if (h1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h1Var6 = null;
            }
            MaterialButton materialButton = h1Var6.f159053c;
            h1 h1Var7 = this.f134459e;
            if (h1Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                h1Var2 = h1Var7;
            }
            MaterialButton[] materialButtonArr = {materialButton, h1Var2.f159054d};
            int i11 = 0;
            int i12 = 0;
            while (i11 < 2) {
                MaterialButton materialButton2 = materialButtonArr[i11];
                Intrinsics.checkNotNull(materialButton2);
                x(materialButton2, materialButtonArr, aVar.a(), i12);
                i11++;
                i12++;
            }
            E(bottomSheetBehavior, false);
            bottomSheetBehavior.f1(true);
            bottomSheetBehavior.g(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Messages messages, b2.a aVar, String str) {
        messages.z().a(str);
        messages.A().U(aVar.a());
    }

    private final void H(b2.a aVar) {
        if (aVar == null || !B(aVar)) {
            F(aVar);
        } else {
            I(aVar);
        }
    }

    private final void I(b2.a aVar) {
        h1 h1Var = this.f134459e;
        if (h1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h1Var = null;
        }
        ConstraintLayout root = h1Var.getRoot();
        k3 k3VarC = aVar.a().c();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Snackbar snackbarD0 = Snackbar.D0(root, k3VarC.i(contextRequireContext), -1);
        snackbarD0.d0(aVar.a().a());
        snackbarD0.f0(1);
        snackbarD0.Q0(androidx.core.content.d.g(requireContext(), aVar.a().d().l()));
        ((TextView) snackbarD0.M().findViewById(r6.a.h.f360685i5)).setCompoundDrawablesWithIntrinsicBounds(aVar.a().d().o(), 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = snackbarD0.M().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.g gVar = (CoordinatorLayout.g) layoutParams;
        ((ViewGroup.MarginLayoutParams) gVar).width = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Zj);
        gVar.f46850c = 17;
        snackbarD0.M().setLayoutParams(gVar);
        snackbarD0.m0();
    }

    private final BottomSheetBehavior<View> getBottomSheetBehavior() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        Iterator it = CollectionsKt.listOf(getParentFragment(), requireActivity()).iterator();
        do {
            bottomSheetBehavior = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof com.planner5d.library.activity.fragment.messages.a) {
                bottomSheetBehavior = ((com.planner5d.library.activity.fragment.messages.a) next).getBottomSheetBehavior();
            }
        } while (bottomSheetBehavior == null);
        return bottomSheetBehavior;
    }

    private final void x(MaterialButton materialButton, final Button[] buttonArr, final u uVar, int i10) {
        a aVar;
        h1 h1Var = null;
        final u.a aVar2 = i10 < uVar.b().length ? uVar.b()[i10] : null;
        materialButton.setVisibility(aVar2 != null ? 0 : 8);
        if (aVar2 != null) {
            h1 h1Var2 = this.f134459e;
            if (h1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                h1Var = h1Var2;
            }
            if (Intrinsics.areEqual(materialButton, h1Var.f159053c)) {
                int i11 = e.f134483a[uVar.d().ordinal()];
                if (i11 != 1) {
                    aVar = i11 != 2 ? a.ButtonPrimary : a.ButtonPrimaryContestNotify;
                } else {
                    aVar = a.ButtonPrimaryContests;
                }
                materialButton.setBackgroundTintList(androidx.core.content.d.h(materialButton.getContext(), aVar.l()));
                materialButton.setTextColor(androidx.core.content.d.h(materialButton.getContext(), aVar.o()));
            }
            k3 k3VarD = aVar2.d();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            materialButton.setText(k3VarD.i(contextRequireContext));
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.messages.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Messages.y(buttonArr, this, uVar, aVar2, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Button[] buttonArr, Messages messages, u uVar, u.a aVar, View view) {
        for (Button button : buttonArr) {
            button.setOnClickListener(null);
        }
        messages.A().U(uVar);
        aVar.c().invoke();
    }

    private final ud.b z() {
        return (ud.b) this.f134456b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        BottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior != null) {
            c cVar = this.f134457c;
            if (cVar != null) {
                bottomSheetBehavior.Y0(cVar);
            }
            b bVar = this.f134458d;
            h1 h1Var = this.f134459e;
            if (h1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h1Var = null;
            }
            View buttonExpand = h1Var.f159052b;
            Intrinsics.checkNotNullExpressionValue(buttonExpand, "buttonExpand");
            c cVar2 = new c(bVar, buttonExpand, bottomSheetBehavior);
            bottomSheetBehavior.h0(cVar2);
            this.f134457c = cVar2;
            this.f134458d.f(bottomSheetBehavior.getState());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        A().V().k(this.f134458d, new f(new Function1() { // from class: com.planner5d.library.activity.fragment.messages.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Messages.D(this.f134491a, (b2.a) obj);
            }
        }));
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        h1 h1VarD = h1.d(inflater, viewGroup, false);
        this.f134459e = h1VarD;
        if (h1VarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h1VarD = null;
        }
        ConstraintLayout root = h1VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        this.f134458d.g(true);
        c cVar = this.f134457c;
        if (cVar != null && (bottomSheetBehavior = getBottomSheetBehavior()) != null) {
            bottomSheetBehavior.Y0(cVar);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f134458d.h(true);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f134458d.h(false);
    }
}
