package com.planner5d.library.uploadplan.view;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.canhub.cropper.core.CropImageView;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.services.utility.k3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUploadPlanImageCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadPlanImageCropFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanImageCropFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n*L\n1#1,107:1\n16#2:108\n1#3:109\n58#4,17:110\n*S KotlinDebug\n*F\n+ 1 UploadPlanImageCropFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanImageCropFragment\n*L\n26#1:108\n87#1:110,17\n*E\n"})
public final class UploadPlanImageCropFragment extends UploadPlanBaseFragment implements com.planner5d.library.activity.helper.ui.a {

    @NotNull
    public static final a Companion = new a(null);
    public static final int MIN_SIZE = 256;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f230843e = new i2(j1.d(t.class), new d(), new e(com.planner5d.library.uploadplan.application.g.f230718b.a()), null, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ie.i f230844f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230845a;

        static {
            int[] iArr = new int[t.b.values().length];
            try {
                iArr[t.b.Cancel.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.Next.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f230845a = iArr;
        }
    }

    static final class c implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230846a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230846a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230846a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230846a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 UploadPlanImageCropFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanImageCropFragment\n*L\n1#1,16:1\n26#2:17\n*E\n"})
    public static final class d implements Function0<l2> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return UploadPlanImageCropFragment.this.getViewModelStore();
        }
    }

    public static final class e implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230848a;

        public e(com.planner5d.library.view.b bVar) {
            this.f230848a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230848a;
        }
    }

    private final t F() {
        return (t) this.f230843e.getValue();
    }

    private final Unit G(t.b bVar) {
        Pair<? extends Class<? extends FragmentController>, Bundle> pair;
        int i10 = b.f230845a[bVar.ordinal()];
        if (i10 != 1) {
            int i11 = 6 | 2;
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            pair = new Pair<>(UploadPlanScaleIntroFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.method, F().Z()).a());
        } else {
            this.f131538b.j();
            F().i0(e4.a.close);
            pair = null;
        }
        return y(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(UploadPlanImageCropFragment uploadPlanImageCropFragment, t.b bVar) {
        if (bVar != null) {
            uploadPlanImageCropFragment.G(bVar);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(UploadPlanImageCropFragment uploadPlanImageCropFragment, t.c cVar) {
        boolean zA = cVar.a();
        String string = uploadPlanImageCropFragment.getString(he.b.s.gF);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        com.planner5d.library.activity.helper.ui.d.f(uploadPlanImageCropFragment, new com.planner5d.library.activity.helper.ui.b(zA, new k3(string), true));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(UploadPlanImageCropFragment uploadPlanImageCropFragment, CropImageView cropImageView, CropImageView.c result) {
        Intrinsics.checkNotNullParameter(cropImageView, "<unused var>");
        Intrinsics.checkNotNullParameter(result, "result");
        uploadPlanImageCropFragment.F().d0(!Intrinsics.areEqual(result.e(), result.n()));
        uploadPlanImageCropFragment.F().i0(e4.a.saved_scale);
        Uri uriK = result.k();
        if (uriK != null) {
            uploadPlanImageCropFragment.F().h0(uriK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(UploadPlanImageCropFragment uploadPlanImageCropFragment, View view) {
        uploadPlanImageCropFragment.F().i0(e4.a.close);
        uploadPlanImageCropFragment.G(t.b.Cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(ie.i iVar, View view) {
        CropImageView.g(iVar.f287160f, Bitmap.CompressFormat.PNG, 0, 0, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(UploadPlanImageCropFragment uploadPlanImageCropFragment, ie.i iVar, View view) {
        uploadPlanImageCropFragment.F().g0(true);
        iVar.f287160f.y(-90);
    }

    private final void N(com.planner5d.library.services.utility.j jVar) {
        Parcelable parcelable;
        int iC = jVar.c(com.planner5d.library.services.r.minImageSize, 256);
        ie.i iVar = this.f230844f;
        ie.i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        CropImageView cropImageView = iVar.f287160f;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.uri;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Parcelable.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable == null) {
            parcelable = null;
        }
        cropImageView.setImageUriAsync(parcelable instanceof Uri ? (Uri) parcelable : null);
        ie.i iVar3 = this.f230844f;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            iVar2 = iVar3;
        }
        iVar2.f287160f.E(iC, iC);
        iVar2.f287160f.setCropShape(CropImageView.d.RECTANGLE);
        iVar2.f287160f.z(1, 1);
        iVar2.f287160f.setFixedAspectRatio(false);
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).w(false).N(false).A(R.color.black).H(true).z(R.color.black).G(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ie.i iVar = this.f230844f;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        iVar.f287160f.requestLayout();
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ie.i iVarC = ie.i.c(LayoutInflater.from(getContext()));
        F().f0(e4.c.f216886a.a(getArguments()));
        this.f230844f = iVarC;
        F().i0(e4.a.rescaling_screen);
        F().a0().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.uploadplan.view.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanImageCropFragment.H(this.f231107a, (t.b) obj);
            }
        }));
        F().c0().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.uploadplan.view.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanImageCropFragment.I(this.f231109a, (t.c) obj);
            }
        }));
        iVarC.f287160f.setOnCropImageCompleteListener(new CropImageView.f() { // from class: com.planner5d.library.uploadplan.view.p
            @Override // com.canhub.cropper.core.CropImageView.f
            public final void a(CropImageView cropImageView, CropImageView.c cVar) {
                UploadPlanImageCropFragment.J(this.f231111a, cropImageView, cVar);
            }
        });
        iVarC.f287157c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanImageCropFragment.K(this.f231113a, view);
            }
        });
        iVarC.f287158d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanImageCropFragment.L(iVarC, view);
            }
        });
        iVarC.f287159e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanImageCropFragment.M(this.f231115a, iVarC, view);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            N(new com.planner5d.library.services.utility.j(arguments));
        }
        ConstraintLayout root = iVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
