package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.planner5d.library.databinding.h0;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.y3;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationSignInEnterCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationSignInEnterCode.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInEnterCode\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 7 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n*L\n1#1,208:1\n12#2,6:209\n28#2:215\n42#3,3:216\n257#4,2:219\n257#4,2:240\n257#4,2:242\n257#4,2:244\n257#4,2:246\n257#4,2:248\n257#4,2:250\n257#4,2:252\n257#4,2:254\n257#4,2:256\n257#4,2:258\n257#4,2:272\n257#4,2:274\n257#4,2:276\n1863#5,2:221\n1863#5,2:223\n55#6,12:225\n84#6,3:237\n190#7,12:260\n*S KotlinDebug\n*F\n+ 1 AuthenticationSignInEnterCode.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInEnterCode\n*L\n37#1:209,6\n37#1:215\n39#1:216,3\n49#1:219,2\n64#1:240,2\n68#1:242,2\n74#1:244,2\n75#1:246,2\n76#1:248,2\n80#1:250,2\n81#1:252,2\n82#1:254,2\n86#1:256,2\n90#1:258,2\n113#1:272,2\n117#1:274,2\n123#1:276,2\n137#1:221,2\n142#1:223,2\n152#1:225,12\n152#1:237,3\n102#1:260,12\n*E\n"})
public final class AuthenticationSignInEnterCode extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131841a;

    @ij.a
    public com.planner5d.library.modules.user.user.b actionAfterLogInStandard;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h0 f131842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.h0 f131843c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCode$observeState$1$1", f = "AuthenticationSignInEnterCode.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131844a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AuthenticationSignInEnterCode.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131844a;
            int i11 = 5 >> 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.modules.user.user.b actionAfterLogInStandard = AuthenticationSignInEnterCode.this.getActionAfterLogInStandard();
                this.f131844a = 1;
                if (actionAfterLogInStandard.e(true, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AuthenticationSignInEnterCode.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/onelink/AuthenticationSignInEnterCode\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n153#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f131847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f131848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f131849d;

        public b(EditText editText, int i10, List list) {
            this.f131847b = editText;
            this.f131848c = i10;
            this.f131849d = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AuthenticationSignInEnterCode.this.U(this.f131847b, this.f131848c, this.f131849d);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static final class c implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f131850a;

        public c(Fragment fragment) {
            this.f131850a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f131850a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f131850a + " has null arguments");
        }
    }

    public AuthenticationSignInEnterCode() {
        t3 t3Var = t3.f229751a;
        this.f131841a = new i2(j1.d(v.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f131843c = new androidx.navigation.h0(j1.d(t.class), new c(this));
        com.planner5d.library.application.b.f142455c.a().o2(this);
    }

    private final List<EditText> A(h0 h0Var) {
        return CollectionsKt.listOf((Object[]) new EditText[]{h0Var.f159039f, h0Var.f159040g, h0Var.f159041h, h0Var.f159042i, h0Var.f159043j, h0Var.f159044k});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final t B() {
        return (t) this.f131843c.getValue();
    }

    private final v C() {
        return (v) this.f131841a.getValue();
    }

    private final void D(View view) {
        E(view).hideSoftInputFromWindow(view.getWindowToken(), 0);
        h0 h0Var = this.f131842b;
        if (h0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h0Var = null;
        }
        h0Var.f159045l.requestFocus();
    }

    private final InputMethodManager E(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    private final boolean F(KeyEvent keyEvent, int i10, EditText editText, int i11, List<? extends EditText> list) {
        if (keyEvent.getAction() == 0 && i10 == 67) {
            Editable text = editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() == 0 && i11 > 0) {
                EditText editText2 = list.get(i11 - 1);
                editText2.setText("");
                editText2.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void G(final h0 h0Var) {
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        n1.a(viewLifecycleOwner, C().j0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationSignInEnterCode.H(h0Var, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(h0 h0Var, boolean z10) {
        ProgressBar authenticationSignInSpinner = h0Var.f159035b;
        Intrinsics.checkNotNullExpressionValue(authenticationSignInSpinner, "authenticationSignInSpinner");
        authenticationSignInSpinner.setVisibility(z10 ? 0 : 8);
        return Unit.f312394a;
    }

    private final void I(final h0 h0Var) {
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        n1.a(viewLifecycleOwner, C().k0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationSignInEnterCode.J(this.f131900a, h0Var, (v.b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(AuthenticationSignInEnterCode authenticationSignInEnterCode, h0 h0Var, v.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        timber.log.b.C2515b c2515b = timber.log.b.f381052a;
        v.b bVarF = authenticationSignInEnterCode.C().k0().f();
        ViewParent viewParent = null;
        c2515b.k(bVarF != null ? bVarF.getClass().getSimpleName() : null, new Object[0]);
        if (it instanceof v.b.e) {
            TextView labelResendCode = h0Var.f159048o;
            Intrinsics.checkNotNullExpressionValue(labelResendCode, "labelResendCode");
            labelResendCode.setVisibility(0);
        } else if (it instanceof v.b.C1450b) {
            TextView error = h0Var.f159047n;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            error.setVisibility(8);
            authenticationSignInEnterCode.z(h0Var);
            authenticationSignInEnterCode.P(h0Var, false);
        } else if (it instanceof v.b.d) {
            TextView error2 = h0Var.f159047n;
            Intrinsics.checkNotNullExpressionValue(error2, "error");
            error2.setVisibility(8);
            TextView labelResendCode2 = h0Var.f159048o;
            Intrinsics.checkNotNullExpressionValue(labelResendCode2, "labelResendCode");
            labelResendCode2.setVisibility(8);
            TextView buttonResendCode = h0Var.f159038e;
            Intrinsics.checkNotNullExpressionValue(buttonResendCode, "buttonResendCode");
            buttonResendCode.setVisibility(0);
        } else if (it instanceof v.b.f) {
            TextView error3 = h0Var.f159047n;
            Intrinsics.checkNotNullExpressionValue(error3, "error");
            error3.setVisibility(8);
            TextView buttonResendCode2 = h0Var.f159038e;
            Intrinsics.checkNotNullExpressionValue(buttonResendCode2, "buttonResendCode");
            buttonResendCode2.setVisibility(8);
            TextView labelResendCode3 = h0Var.f159048o;
            Intrinsics.checkNotNullExpressionValue(labelResendCode3, "labelResendCode");
            labelResendCode3.setVisibility(8);
            h0Var.f159049s.setText(authenticationSignInEnterCode.T());
            h0Var.f159049s.setMovementMethod(LinkMovementMethod.getInstance());
            h0Var.f159049s.setLinksClickable(true);
            TextView support = h0Var.f159049s;
            Intrinsics.checkNotNullExpressionValue(support, "support");
            support.setVisibility(0);
        } else if (it instanceof v.b.a) {
            TextView error4 = h0Var.f159047n;
            Intrinsics.checkNotNullExpressionValue(error4, "error");
            error4.setVisibility(0);
            h0Var.f159047n.setText(((v.b.a) it).a());
            authenticationSignInEnterCode.P(h0Var, true);
        } else {
            if (!(it instanceof v.b.c)) {
                throw new k0();
            }
            if (authenticationSignInEnterCode.B().d().booleanValue()) {
                o0 viewLifecycleOwner = authenticationSignInEnterCode.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                kotlinx.coroutines.k.f(p0.a(viewLifecycleOwner), null, null, authenticationSignInEnterCode.new a(null), 3, null);
            } else {
                y3 y3Var = y3.f229862a;
                h0 h0Var2 = authenticationSignInEnterCode.f131842b;
                if (h0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    h0Var2 = null;
                }
                ViewParent root = h0Var2.getRoot();
                while (true) {
                    if (root instanceof ff.a) {
                        viewParent = root;
                        break;
                    }
                    root = root != null ? root.getParent() : null;
                    if (root == null) {
                        timber.log.b.f381052a.e(new RuntimeException("Expected parent not found"));
                        break;
                    }
                }
                ff.a aVar = (ff.a) viewParent;
                if (aVar != null) {
                    aVar.onOnboardingStepComplete();
                }
            }
        }
        return Unit.f312394a;
    }

    private final void K(final h0 h0Var) {
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        n1.a(viewLifecycleOwner, C().i0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationSignInEnterCode.L(this.f131906a, h0Var, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(AuthenticationSignInEnterCode authenticationSignInEnterCode, h0 h0Var, String str) {
        boolean zL0 = authenticationSignInEnterCode.C().l0();
        if (zL0) {
            TextView labelResendCode = h0Var.f159048o;
            Intrinsics.checkNotNullExpressionValue(labelResendCode, "labelResendCode");
            labelResendCode.setVisibility(8);
        } else {
            h0Var.f159048o.setText(authenticationSignInEnterCode.getString(com.planner5d.library.f.s.Rv, str));
        }
        TextView buttonResendCode = h0Var.f159038e;
        Intrinsics.checkNotNullExpressionValue(buttonResendCode, "buttonResendCode");
        buttonResendCode.setVisibility(zL0 ? 0 : 8);
        return Unit.f312394a;
    }

    private final void M(List<? extends EditText> list) {
        v vVarC = C();
        String strJoinToString$default = CollectionsKt.joinToString$default(list, "", null, null, 0, null, new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuthenticationSignInEnterCode.N((EditText) obj);
            }
        }, 30, null);
        Boolean boolF = B().f();
        Intrinsics.checkNotNullExpressionValue(boolF, "getSignup(...)");
        vVarC.q0(strJoinToString$default, boolF.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence N(EditText it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(AuthenticationSignInEnterCode authenticationSignInEnterCode, View view) {
        v vVarC = authenticationSignInEnterCode.C();
        Boolean boolF = authenticationSignInEnterCode.B().f();
        Intrinsics.checkNotNullExpressionValue(boolF, "getSignup(...)");
        boolean zBooleanValue = boolF.booleanValue();
        String strC = authenticationSignInEnterCode.B().c();
        Intrinsics.checkNotNullExpressionValue(strC, "getEmail(...)");
        vVarC.n0(zBooleanValue, strC);
    }

    private final void P(h0 h0Var, boolean z10) {
        Iterator<T> it = A(h0Var).iterator();
        while (it.hasNext()) {
            ((EditText) it.next()).setBackgroundResource(z10 ? com.planner5d.library.f.h.O0 : com.planner5d.library.f.h.N0);
        }
    }

    private final void Q(h0 h0Var) {
        final List<EditText> listA = A(h0Var);
        final int i10 = 0;
        for (Object obj : listA) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            final EditText editText = (EditText) obj;
            editText.addTextChangedListener(new b(editText, i10, listA));
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.p
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                    return AuthenticationSignInEnterCode.R(this.f131902a, editText, i10, listA, view, i11, keyEvent);
                }
            });
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(AuthenticationSignInEnterCode authenticationSignInEnterCode, EditText editText, int i10, List list, View view, int i11, KeyEvent keyEvent) {
        Intrinsics.checkNotNull(keyEvent);
        return authenticationSignInEnterCode.F(keyEvent, i11, editText, i10, list);
    }

    private final void S(View view) {
        view.requestFocus();
        E(view).showSoftInput(view, 0);
    }

    private final Spanned T() {
        Spanned spannedFromHtml = Html.fromHtml(getString(com.planner5d.library.f.s.Tv, getString(com.planner5d.library.f.s.dp, getString(com.planner5d.library.f.s.hE))), 0);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        return spannedFromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(EditText editText, int i10, List<? extends EditText> list) {
        String string = editText.getText().toString();
        if (string.length() > 0) {
            EditText editText2 = i10 < CollectionsKt.getLastIndex(list) ? list.get(i10 + 1) : null;
            if (string.length() > 1) {
                String strSubstring = string.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                editText.setText(strSubstring);
                if (editText2 != null) {
                    String strSubstring2 = string.substring(1, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    editText2.setText(strSubstring2);
                }
                if (editText2 != null) {
                    editText2.setSelection(1);
                }
            }
            if (editText2 != null) {
                editText2.requestFocus();
            } else {
                D(editText);
                M(list);
            }
        }
    }

    private final void z(h0 h0Var) {
        Iterator<T> it = A(h0Var).iterator();
        while (it.hasNext()) {
            ((EditText) it.next()).setText("");
        }
        EditText code1 = h0Var.f159039f;
        Intrinsics.checkNotNullExpressionValue(code1, "code1");
        S(code1);
    }

    @NotNull
    public final com.planner5d.library.modules.user.user.b getActionAfterLogInStandard() {
        com.planner5d.library.modules.user.user.b bVar = this.actionAfterLogInStandard;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionAfterLogInStandard");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        h0 h0VarD = h0.d(getLayoutInflater(), viewGroup, false);
        this.f131842b = h0VarD;
        v vVarC = C();
        int iE = B().e();
        Boolean boolF = B().f();
        Intrinsics.checkNotNullExpressionValue(boolF, "getSignup(...)");
        vVarC.o0(iE, boolF.booleanValue());
        TextView labelResendCode = h0VarD.f159048o;
        Intrinsics.checkNotNullExpressionValue(labelResendCode, "labelResendCode");
        labelResendCode.setVisibility(0);
        h0VarD.f159038e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.onelink.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationSignInEnterCode.O(this.f131908a, view);
            }
        });
        Intrinsics.checkNotNull(h0VarD);
        Q(h0VarD);
        G(h0VarD);
        K(h0VarD);
        I(h0VarD);
        NestedScrollView root = h0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setActionAfterLogInStandard(@NotNull com.planner5d.library.modules.user.user.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.actionAfterLogInStandard = bVar;
    }
}
