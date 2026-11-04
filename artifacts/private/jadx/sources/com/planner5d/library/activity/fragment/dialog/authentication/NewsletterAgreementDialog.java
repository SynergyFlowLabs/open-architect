package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.services.utility.t3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nNewsletterAgreementDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsletterAgreementDialog.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/NewsletterAgreementDialog\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,55:1\n12#2,6:56\n28#2:62\n257#3,2:63\n*S KotlinDebug\n*F\n+ 1 NewsletterAgreementDialog.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/NewsletterAgreementDialog\n*L\n19#1:56,6\n19#1:62\n41#1:63,2\n*E\n"})
public final class NewsletterAgreementDialog extends ContentDialog<Boolean> implements com.planner5d.library.activity.fragment.dialog.n0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131737o3;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.NewsletterAgreementDialog$createContentView$1$2$1", f = "NewsletterAgreementDialog.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131738a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return NewsletterAgreementDialog.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131738a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k1 k1VarA0 = NewsletterAgreementDialog.this.a0();
                this.f131738a = 1;
                if (k1VarA0.X(false, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public NewsletterAgreementDialog() {
        t3 t3Var = t3.f229751a;
        boolean z10 = true | false;
        this.f131737o3 = new i2(kotlin.jvm.internal.j1.d(k1.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(NewsletterAgreementDialog newsletterAgreementDialog, View view) {
        newsletterAgreementDialog.a0().U(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(NewsletterAgreementDialog newsletterAgreementDialog, View view) {
        kotlinx.coroutines.k.f(f2.f314023a, null, null, newsletterAgreementDialog.new a(null), 3, null);
        newsletterAgreementDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(com.planner5d.library.databinding.j jVar, Boolean bool) {
        jVar.f159152d.setEnabled(!bool.booleanValue());
        ProgressBar authenticationStayInTouchSpinner = jVar.f159155g;
        Intrinsics.checkNotNullExpressionValue(authenticationStayInTouchSpinner, "authenticationStayInTouchSpinner");
        authenticationStayInTouchSpinner.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(NewsletterAgreementDialog newsletterAgreementDialog, Boolean bool) {
        if (bool.booleanValue()) {
            newsletterAgreementDialog.dismiss();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k1 a0() {
        return (k1) this.f131737o3.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        final com.planner5d.library.databinding.j jVarC = com.planner5d.library.databinding.j.c(LayoutInflater.from(root.getContext()));
        jVarC.f159152d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewsletterAgreementDialog.W(this.f131788a, view);
            }
        });
        jVarC.f159151c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewsletterAgreementDialog.X(this.f131791a, view);
            }
        });
        com.planner5d.library.services.utility.n1.a(this, a0().V(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsletterAgreementDialog.Y(jVarC, (Boolean) obj);
            }
        });
        com.planner5d.library.services.utility.n1.a(this, a0().W(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsletterAgreementDialog.Z(this.f131798a, (Boolean) obj);
            }
        });
        ConstraintLayout root2 = jVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.f169922n7);
    }
}
