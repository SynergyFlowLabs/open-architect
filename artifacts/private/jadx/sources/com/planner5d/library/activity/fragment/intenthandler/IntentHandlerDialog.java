package com.planner5d.library.activity.fragment.intenthandler;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.d;
import androidx.core.view.k2;
import androidx.core.view.v3;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.f;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.PreloaderCoverView;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nIntentHandlerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentHandlerDialog.kt\ncom/planner5d/library/activity/fragment/intenthandler/IntentHandlerDialog\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n*L\n1#1,96:1\n12#2,6:97\n28#2:103\n28#3:104\n58#4,17:105\n*S KotlinDebug\n*F\n+ 1 IntentHandlerDialog.kt\ncom/planner5d/library/activity/fragment/intenthandler/IntentHandlerDialog\n*L\n28#1:97,6\n28#1:103\n57#1:104\n71#1:105,17\n*E\n"})
public final class IntentHandlerDialog extends m {

    @NotNull
    private final t H1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final f0 f133948p1;

    @NotNull
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull FragmentManager fragmentManager, @NotNull Intent intentToProcess) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(intentToProcess, "intentToProcess");
            IntentHandlerDialog intentHandlerDialog = new IntentHandlerDialog();
            intentHandlerDialog.setArguments(new i().i(r.newIntent, intentToProcess).a());
            intentHandlerDialog.show(fragmentManager, "intent_handler_dialog");
        }

        private a() {
        }
    }

    public static final class b extends Dialog {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            timber.log.b.f381052a.a("User pressed 'back' on intent handler dialog. Ignored.", new Object[0]);
        }
    }

    static final class c implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f133949a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f133949a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f133949a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f133949a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public IntentHandlerDialog() {
        t3 t3Var = t3.f229751a;
        this.f133948p1 = new i2(j1.d(com.planner5d.library.activity.fragment.intenthandler.b.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.H1 = new t();
    }

    private final com.planner5d.library.activity.fragment.intenthandler.b B() {
        return (com.planner5d.library.activity.fragment.intenthandler.b) this.f133948p1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(IntentHandlerDialog intentHandlerDialog, com.planner5d.library.activity.fragment.intenthandler.b.a aVar) {
        h0 h0VarA = intentHandlerDialog.H1.a();
        if (aVar instanceof com.planner5d.library.activity.fragment.intenthandler.b.a.c) {
            h0VarA.b();
        } else if (aVar instanceof com.planner5d.library.activity.fragment.intenthandler.b.a.C1473b) {
            h0VarA.p(intentHandlerDialog.getString(f.s.ku), true);
        } else {
            if (!(aVar instanceof com.planner5d.library.activity.fragment.intenthandler.b.a.C1472a)) {
                throw new k0();
            }
            intentHandlerDialog.dismiss();
        }
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            k2.c(window, false);
            int iG = d.g(window.getContext(), R.color.transparent);
            window.setStatusBarColor(iG);
            window.setNavigationBarColor(iG);
            v3 v3Var = new v3(window, window.getDecorView());
            v3Var.i(false);
            v3Var.h(true);
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, f.t.W6);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        b bVar = new b(requireContext(), getTheme());
        Window window = bVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        bVar.setCanceledOnTouchOutside(false);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        PreloaderCoverView preloaderCoverView = new PreloaderCoverView(requireContext());
        this.H1.b(preloaderCoverView);
        preloaderCoverView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return preloaderCoverView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(view, "view");
        j jVar = new j(getArguments());
        r rVar = r.newIntent;
        Parcelable parcelable2 = null;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Intent.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null || !(parcelable instanceof Intent)) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable != null) {
            parcelable2 = parcelable;
        }
        Intent intent = (Intent) parcelable2;
        if (intent != null) {
            com.planner5d.library.activity.fragment.intenthandler.b bVarB = B();
            s sVarRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            bVarB.X(intent, sVarRequireActivity);
        }
        B().W().k(this, new c(new Function1() { // from class: com.planner5d.library.activity.fragment.intenthandler.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntentHandlerDialog.C(this.f133950a, (b.a) obj);
            }
        }));
    }
}
