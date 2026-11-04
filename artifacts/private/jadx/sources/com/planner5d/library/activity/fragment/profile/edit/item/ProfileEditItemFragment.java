package com.planner5d.library.activity.fragment.profile.edit.item;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.navigation.h0;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.activity.fragment.profile.edit.ProfileEditItem;
import com.planner5d.library.activity.fragment.profile.edit.q;
import com.planner5d.library.databinding.m1;
import com.planner5d.library.services.o;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.utility.k3;
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
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProfileEditItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileEditItemFragment.kt\ncom/planner5d/library/activity/fragment/profile/edit/item/ProfileEditItemFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,60:1\n42#2,3:61\n12#3,6:64\n28#3:70\n*S KotlinDebug\n*F\n+ 1 ProfileEditItemFragment.kt\ncom/planner5d/library/activity/fragment/profile/edit/item/ProfileEditItemFragment\n*L\n25#1:61,3\n26#1:64,6\n26#1:70\n*E\n"})
public final class ProfileEditItemFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f134590a = com.planner5d.library.util.navigation.uiview.f.c(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h0 f134591b = new h0(j1.d(com.planner5d.library.activity.fragment.profile.edit.item.c.class), new c(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f134592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f134593d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f134595b;

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
            f134594a = iArr;
            int[] iArr2 = new int[ProfileEditItem.ProfileEditItemType.values().length];
            try {
                iArr2[ProfileEditItem.ProfileEditItemType.Name.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProfileEditItem.ProfileEditItemType.Email.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f134595b = iArr2;
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134596a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134596a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134596a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134596a.invoke(obj);
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

    public static final class c implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f134597a;

        public c(Fragment fragment) {
            this.f134597a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f134597a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f134597a + " has null arguments");
        }
    }

    public ProfileEditItemFragment() {
        t3 t3Var = t3.f229751a;
        this.f134592c = new i2(j1.d(e.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f134593d = new t();
    }

    private final com.planner5d.library.util.navigation.uiview.c v() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f134590a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.planner5d.library.activity.fragment.profile.edit.item.c w() {
        return (com.planner5d.library.activity.fragment.profile.edit.item.c) this.f134591b.getValue();
    }

    private final e x() {
        return (e) this.f134592c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(ProfileEditItemFragment profileEditItemFragment, q qVar) {
        int i10 = qVar == null ? -1 : a.f134594a[qVar.ordinal()];
        if (i10 == 1) {
            profileEditItemFragment.f134593d.a().p(profileEditItemFragment.getString(com.planner5d.library.f.s.gF), true);
        } else if (i10 != 2) {
            profileEditItemFragment.f134593d.a().b();
        } else {
            androidx.navigation.fragment.f.a(profileEditItemFragment).A0();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(m1 m1Var, ProfileEditItemFragment profileEditItemFragment, View view) {
        String textAsString = m1Var.f159323c.getTextAsString();
        if (textAsString != null) {
            e eVarX = profileEditItemFragment.x();
            o oVar = new o(m1Var.f159323c);
            ProfileEditItem.ProfileEditItemType profileEditItemTypeC = profileEditItemFragment.w().c();
            Intrinsics.checkNotNullExpressionValue(profileEditItemTypeC, "getItemType(...)");
            eVarX.Y(oVar, profileEditItemTypeC, textAsString);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x008c A[PHI: r6
      0x008c: PHI (r6v14 java.lang.String) = (r6v11 java.lang.String), (r6v18 java.lang.String) binds: [B:17:0x00a3, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final m1 m1VarD = m1.d(inflater, viewGroup, false);
        v().e(new k3(w().d(), new Object[0]));
        this.f134593d.b(m1VarD.f159322b);
        x().V().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.edit.item.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditItemFragment.y(this.f134598a, (q) obj);
            }
        }));
        int i10 = a.f134595b[w().c().ordinal()];
        String str2 = "";
        if (i10 == 1) {
            id.a aVarW = x().W();
            if (aVarW != null && (str = aVarW.f287076b) != null) {
                str2 = str;
            }
        } else {
            if (i10 != 2) {
                throw new k0();
            }
            TextInputEditTextCompat textInputEditTextCompat = m1VarD.f159323c;
            Context context = m1VarD.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textInputEditTextCompat.i(new q0.a(context));
            id.a aVarW2 = x().W();
            if (aVarW2 != null && (str = aVarW2.f287079e) != null) {
                str2 = str;
            }
        }
        TextInputEditTextCompat textInputEditTextCompat2 = m1VarD.f159323c;
        textInputEditTextCompat2.setText(str2);
        TextInputLayout textInputLayout = textInputEditTextCompat2.getTextInputLayout();
        if (textInputLayout != null) {
            textInputLayout.setHint(w().d());
        }
        Context context2 = textInputEditTextCompat2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textInputEditTextCompat2.i(new q0.f(context2));
        m1VarD.f159325e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.edit.item.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditItemFragment.z(m1VarD, this, view);
            }
        });
        FrameLayout root = m1VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
