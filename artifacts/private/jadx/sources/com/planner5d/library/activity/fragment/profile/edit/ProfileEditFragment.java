package com.planner5d.library.activity.fragment.profile.edit;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.navigation.c2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.l1;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.n2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.modules.user.auth.r;
import com.planner5d.library.services.utility.r3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
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
@SourceDebugExtension({"SMAP\nProfileEditFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileEditFragment.kt\ncom/planner5d/library/activity/fragment/profile/edit/ProfileEditFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,146:1\n12#2,6:147\n28#2:153\n12#2,6:154\n28#2:160\n*S KotlinDebug\n*F\n+ 1 ProfileEditFragment.kt\ncom/planner5d/library/activity/fragment/profile/edit/ProfileEditFragment\n*L\n31#1:147,6\n31#1:153\n32#1:154,6\n32#1:160\n*E\n"})
public final class ProfileEditFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f134559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f134560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f134561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f134562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f134563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l1 f134564f;

    @ij.a
    public r socialServiceAuthorization;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134565a;

        static {
            int[] iArr = new int[ProfileEditItem.ProfileEditItemType.values().length];
            try {
                iArr[ProfileEditItem.ProfileEditItemType.Name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileEditItem.ProfileEditItemType.Email.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f134565a = iArr;
        }
    }

    public static final class b implements l.b {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f134567a;

            static {
                int[] iArr = new int[ProfileEditItem.ProfileEditItemType.values().length];
                try {
                    iArr[ProfileEditItem.ProfileEditItemType.Name.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProfileEditItem.ProfileEditItemType.Email.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f134567a = iArr;
            }
        }

        b() {
        }

        @Override // com.planner5d.library.activity.fragment.profile.edit.l.b
        public void a(ProfileEditItem.ProfileEditItemType profileEditItemType) {
            int i10 = profileEditItemType == null ? -1 : a.f134567a[profileEditItemType.ordinal()];
            if (i10 == 1) {
                ProfileEditFragment.this.C(profileEditItemType);
            } else if (i10 != 2) {
                ProfileEditFragment.this.D();
            } else {
                ProfileEditFragment.this.C(profileEditItemType);
            }
        }
    }

    public static final class c extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f134569i;

        c(float f10) {
            this.f134569i = f10;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            timber.log.b.f381052a.f(th2, "Profile image load failed", new Object[0]);
            dispose();
            l1 l1Var = ProfileEditFragment.this.f134564f;
            l1 l1Var2 = null;
            if (l1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                l1Var = null;
            }
            if (l1Var.f159262b != null) {
                l1 l1Var3 = ProfileEditFragment.this.f134564f;
                if (l1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    l1Var2 = l1Var3;
                }
                l1Var2.f159262b.a(com.planner5d.library.f.h.f167667ma, this.f134569i);
            }
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            timber.log.b.f381052a.a("Profile image loaded", new Object[0]);
            l1 l1Var = ProfileEditFragment.this.f134564f;
            l1 l1Var2 = null;
            if (l1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                l1Var = null;
            }
            if (l1Var.f159262b != null) {
                l1 l1Var3 = ProfileEditFragment.this.f134564f;
                if (l1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    l1Var2 = l1Var3;
                }
                l1Var2.f159262b.b(bitmap, this.f134569i);
            }
        }
    }

    static final class d implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134570a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134570a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134570a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134570a.invoke(obj);
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

    public ProfileEditFragment() {
        t3 t3Var = t3.f229751a;
        t3.d dVar = t3.d.f229756a;
        this.f134559a = new i2(j1.d(n.class), new t3.c(this), dVar, null, 8, null);
        this.f134560b = new i2(j1.d(com.planner5d.library.activity.fragment.settings.h.class), new t3.c(this), dVar, null, 8, null);
        this.f134561c = new t();
        com.planner5d.library.application.b.f142455c.a().u1(this);
    }

    private final com.planner5d.library.activity.fragment.settings.h A() {
        return (com.planner5d.library.activity.fragment.settings.h) this.f134560b.getValue();
    }

    private final n B() {
        return (n) this.f134559a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(ProfileEditItem.ProfileEditItemType profileEditItemType) {
        int i10;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        int i11 = a.f134565a[profileEditItemType.ordinal()];
        if (i11 == 1) {
            i10 = com.planner5d.library.f.s.Nr;
        } else {
            if (i11 != 2) {
                throw new k0();
            }
            i10 = com.planner5d.library.f.s.A7;
        }
        h.a aVarA = h.a(i10, profileEditItemType);
        Intrinsics.checkNotNullExpressionValue(aVarA, "toProfileEditItem(...)");
        w0VarA.m0(aVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        n2.f217166b.W0();
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        c2 c2VarB = h.b();
        Intrinsics.checkNotNullExpressionValue(c2VarB, "toProfileEditPassword(...)");
        w0VarA.m0(c2VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(ProfileEditFragment profileEditFragment, Boolean bool) {
        h0 h0VarA = profileEditFragment.f134561c.a();
        if (bool.booleanValue()) {
            h0VarA.p(profileEditFragment.getString(com.planner5d.library.f.s.gF), true);
        } else {
            h0VarA.b();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(ProfileEditFragment profileEditFragment, List list) {
        l lVar = profileEditFragment.f134563e;
        l lVar2 = null;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableListViewAdapter");
            lVar = null;
        }
        Intrinsics.checkNotNull(list);
        lVar.h(list);
        l lVar3 = profileEditFragment.f134563e;
        if (lVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableListViewAdapter");
        } else {
            lVar2 = lVar3;
        }
        lVar2.notifyDataSetChanged();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(ProfileEditFragment profileEditFragment, SocialAuthType socialAuthType) {
        r socialServiceAuthorization = profileEditFragment.getSocialServiceAuthorization();
        s sVarRequireActivity = profileEditFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        Intrinsics.checkNotNull(socialAuthType);
        socialServiceAuthorization.j(sVarRequireActivity, socialAuthType, k3.a.authenticate);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(ProfileEditFragment profileEditFragment, com.planner5d.library.services.utility.o oVar) {
        Pair<? extends SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> pair;
        r3 r3VarA = oVar.a();
        if (r3VarA != null && (pair = (Pair) r3VarA.a()) != null) {
            profileEditFragment.A().Z(pair);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(ProfileEditFragment profileEditFragment, View view) {
        profileEditFragment.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(ProfileEditFragment profileEditFragment, View view) {
        profileEditFragment.L();
    }

    private final void K() {
        if (getContext() == null) {
            return;
        }
        float dimension = getResources().getDimension(com.planner5d.library.f.g.f167181oi);
        n nVarB = B();
        int i10 = (int) dimension;
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f134562d;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        com.planner5d.library.services.bitmaploader.target.a aVarC = hVar.c(new c(dimension));
        Intrinsics.checkNotNullExpressionValue(aVarC, "register(...)");
        nVarB.g0(i10, aVarC);
    }

    private final void L() {
        B().k0(new Function0() { // from class: com.planner5d.library.activity.fragment.profile.edit.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileEditFragment.M(this.f134588a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(ProfileEditFragment profileEditFragment) {
        profileEditFragment.K();
        return Unit.f312394a;
    }

    @NotNull
    public final r getSocialServiceAuthorization() {
        r rVar = this.socialServiceAuthorization;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("socialServiceAuthorization");
        boolean z10 = true & false;
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @e.a({"NotifyDataSetChanged"})
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f134562d = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        l1 l1VarA = l1.a(inflater.inflate(com.planner5d.library.f.m.f168673e2, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(l1VarA, "bind(...)");
        this.f134561c.b(l1VarA.f159265e);
        B().d0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.edit.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.E(this.f134582a, (Boolean) obj);
            }
        }));
        B().f0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.edit.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.F(this.f134583a, (List) obj);
            }
        }));
        A().c0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.edit.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.G(this.f134584a, (SocialAuthType) obj);
            }
        }));
        getSocialServiceAuthorization().h().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.edit.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEditFragment.H(this.f134585a, (com.planner5d.library.services.utility.o) obj);
            }
        }));
        l1VarA.f159262b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.edit.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditFragment.I(this.f134586a, view);
            }
        });
        l1VarA.f159263c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.edit.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditFragment.J(this.f134587a, view);
            }
        });
        this.f134564f = l1VarA;
        FrameLayout root = l1VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        K();
        com.planner5d.library.activity.fragment.settings.h hVarA = A();
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(getContext(), this).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        this.f134563e = new l(this, hVarA, dVarX, new b());
        l1 l1Var = this.f134564f;
        l lVar = null;
        if (l1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l1Var = null;
        }
        RecyclerView recyclerView = l1Var.f159264d;
        l lVar2 = this.f134563e;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandableListViewAdapter");
        } else {
            lVar = lVar2;
        }
        recyclerView.setAdapter(lVar);
        B().i0();
    }

    public final void setSocialServiceAuthorization(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.socialServiceAuthorization = rVar;
    }
}
