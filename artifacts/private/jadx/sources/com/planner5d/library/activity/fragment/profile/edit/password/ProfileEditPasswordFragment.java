package com.planner5d.library.activity.fragment.profile.edit.password;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.navigation.c2;
import com.planner5d.library.activity.fragment.profile.edit.q;
import com.planner5d.library.databinding.n1;
import com.planner5d.library.services.o;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.preloader.t;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProfileEditPasswordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileEditPasswordFragment.kt\ncom/planner5d/library/activity/fragment/profile/edit/password/ProfileEditPasswordFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,80:1\n12#2,6:81\n28#2:87\n55#3,12:88\n84#3,3:100\n*S KotlinDebug\n*F\n+ 1 ProfileEditPasswordFragment.kt\ncom/planner5d/library/activity/fragment/profile/edit/password/ProfileEditPasswordFragment\n*L\n23#1:81,6\n23#1:87\n65#1:88,12\n65#1:100,3\n*E\n"})
public final class ProfileEditPasswordFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f134678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f134679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n1 f134680c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134681a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.Completed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f134681a = iArr;
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134682a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134682a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134682a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134682a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ProfileEditPasswordFragment.kt\ncom/planner5d/library/activity/fragment/profile/edit/password/ProfileEditPasswordFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n66#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ProfileEditPasswordFragment.this.C();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public ProfileEditPasswordFragment() {
        t3 t3Var = t3.f229751a;
        this.f134678a = new i2(j1.d(f.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f134679b = new t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(ProfileEditPasswordFragment profileEditPasswordFragment, o oVar, n1 n1Var, View view) {
        profileEditPasswordFragment.w().X(oVar, n1Var.f159383d.getTextAsString(), n1Var.f159382c.getTextAsString());
    }

    private final TextInputEditTextCompat B(TextInputEditTextCompat textInputEditTextCompat) {
        textInputEditTextCompat.setInputType(129);
        Context context = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textInputEditTextCompat.i(new q0.f(context));
        Context context2 = textInputEditTextCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputEditTextCompat.i(new q0.e(context2, 6));
        textInputEditTextCompat.addTextChangedListener(new c());
        return textInputEditTextCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public final void C() {
        boolean z10;
        n1 n1Var = this.f134680c;
        n1 n1Var2 = null;
        if (n1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n1Var = null;
        }
        TextView textView = n1Var.f159381b;
        n1 n1Var3 = this.f134680c;
        if (n1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n1Var3 = null;
        }
        TextInputEditTextCompat profileEditPasswordCurrentInput = n1Var3.f159382c;
        Intrinsics.checkNotNullExpressionValue(profileEditPasswordCurrentInput, "profileEditPasswordCurrentInput");
        if (x(profileEditPasswordCurrentInput)) {
            n1 n1Var4 = this.f134680c;
            if (n1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                n1Var4 = null;
            }
            TextInputEditTextCompat profileEditPasswordNewInput = n1Var4.f159383d;
            Intrinsics.checkNotNullExpressionValue(profileEditPasswordNewInput, "profileEditPasswordNewInput");
            if (x(profileEditPasswordNewInput)) {
                n1 n1Var5 = this.f134680c;
                if (n1Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    n1Var2 = n1Var5;
                }
                TextInputEditTextCompat profileEditPasswordRepeatInput = n1Var2.f159385f;
                Intrinsics.checkNotNullExpressionValue(profileEditPasswordRepeatInput, "profileEditPasswordRepeatInput");
                if (x(profileEditPasswordRepeatInput)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        textView.setEnabled(z10);
    }

    private final f w() {
        return (f) this.f134678a.getValue();
    }

    private final boolean x(TextInputEditTextCompat textInputEditTextCompat) {
        String textAsString = textInputEditTextCompat.getTextAsString();
        if (textAsString != null) {
            return !StringsKt.w3(textAsString);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(ProfileEditPasswordFragment profileEditPasswordFragment, q qVar) {
        int i10 = qVar == null ? -1 : a.f134681a[qVar.ordinal()];
        if (i10 == 1) {
            profileEditPasswordFragment.f134679b.a().p(profileEditPasswordFragment.getString(com.planner5d.library.f.s.gF), true);
        } else if (i10 != 2) {
            profileEditPasswordFragment.f134679b.a().b();
        } else {
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(profileEditPasswordFragment);
            c2 c2VarA = d.a();
            Intrinsics.checkNotNullExpressionValue(c2VarA, "toProfileEditPasswordSuccess(...)");
            w0VarA.m0(c2VarA);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(n1 n1Var) {
        return n1Var.f159383d.getTextAsString();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final n1 n1VarA = n1.a(inflater.inflate(com.planner5d.library.f.m.f168695g2, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(n1VarA, "bind(...)");
        this.f134679b.b(n1VarA.f159384e);
        w().V().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.edit.password.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditPasswordFragment.y(this.f134684a, (q) obj);
            }
        }));
        final o oVar = new o(n1VarA.f159382c, n1VarA.f159383d, n1VarA.f159385f);
        TextInputEditTextCompat profileEditPasswordCurrentInput = n1VarA.f159382c;
        Intrinsics.checkNotNullExpressionValue(profileEditPasswordCurrentInput, "profileEditPasswordCurrentInput");
        B(profileEditPasswordCurrentInput);
        TextInputEditTextCompat profileEditPasswordNewInput = n1VarA.f159383d;
        Intrinsics.checkNotNullExpressionValue(profileEditPasswordNewInput, "profileEditPasswordNewInput");
        B(profileEditPasswordNewInput);
        TextInputEditTextCompat profileEditPasswordRepeatInput = n1VarA.f159385f;
        Intrinsics.checkNotNullExpressionValue(profileEditPasswordRepeatInput, "profileEditPasswordRepeatInput");
        TextInputEditTextCompat textInputEditTextCompatB = B(profileEditPasswordRepeatInput);
        Context context = n1VarA.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textInputEditTextCompatB.i(new q0.b(context, new Function0() { // from class: com.planner5d.library.activity.fragment.profile.edit.password.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditPasswordFragment.z(n1VarA);
            }
        }));
        n1VarA.f159381b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.edit.password.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditPasswordFragment.A(this.f134686a, oVar, n1VarA, view);
            }
        });
        this.f134680c = n1VarA;
        FrameLayout root = n1VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C();
    }
}
