package com.planner5d.library.dgenerator.fragment.crop;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.navigation.h0;
import androidx.navigation.w0;
import com.canhub.cropper.core.CropImageView;
import com.planner5d.library.database.model.AutoStyle;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
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

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nAutoStyleImageCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStyleImageCropFragment.kt\ncom/planner5d/library/dgenerator/fragment/crop/AutoStyleImageCropFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,80:1\n42#2,3:81\n16#3:84\n29#4:85\n*S KotlinDebug\n*F\n+ 1 AutoStyleImageCropFragment.kt\ncom/planner5d/library/dgenerator/fragment/crop/AutoStyleImageCropFragment\n*L\n19#1:81,3\n20#1:84\n35#1:85\n*E\n"})
public final class AutoStyleImageCropFragment extends Fragment {

    @NotNull
    public static final a Companion = new a(null);
    public static final int MIN_SIZE = 256;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h0 f160104a = new h0(j1.d(g.class), new d(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f160105b = new i2(j1.d(k.class), new e(), new f(com.planner5d.library.dgenerator.application.c.f160073b.a()), null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mb.c f160106c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160107a;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f160107a = iArr;
        }
    }

    static final class c implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f160108a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f160108a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f160108a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f160108a.invoke(obj);
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

    public static final class d implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f160109a;

        public d(Fragment fragment) {
            this.f160109a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f160109a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f160109a + " has null arguments");
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 AutoStyleImageCropFragment.kt\ncom/planner5d/library/dgenerator/fragment/crop/AutoStyleImageCropFragment\n*L\n1#1,16:1\n20#2:17\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return AutoStyleImageCropFragment.this.getViewModelStore();
        }
    }

    public static final class f implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f160111a;

        public f(com.planner5d.library.view.b bVar) {
            this.f160111a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f160111a;
        }
    }

    private final k A() {
        return (k) this.f160105b.getValue();
    }

    private final void B(Pair<? extends k.a, Long> pair) {
        if (b.f160107a[pair.getFirst().ordinal()] != 1) {
            throw new k0();
        }
        w0 w0VarA = androidx.navigation.fragment.f.a(this);
        i.a aVarA = i.a(pair.getSecond().longValue());
        Intrinsics.checkNotNullExpressionValue(aVarA, "toRoomType(...)");
        w0VarA.m0(aVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(mb.c cVar, View view) {
        cVar.f322864f.y(-90);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(AutoStyleImageCropFragment autoStyleImageCropFragment, Pair pair) {
        if (pair != null) {
            autoStyleImageCropFragment.B(pair);
            autoStyleImageCropFragment.A().Y();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(AutoStyleImageCropFragment autoStyleImageCropFragment, AutoStyle autoStyle) {
        if (autoStyle != null) {
            mb.c cVar = autoStyleImageCropFragment.f160106c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cVar = null;
            }
            CropImageView cropImageView = cVar.f322864f;
            String strA = autoStyle.A();
            cropImageView.setImageUriAsync(strA != null ? Uri.parse(strA) : null);
            cVar.f322864f.E(256, 256);
            cVar.f322864f.setCropShape(CropImageView.d.RECTANGLE);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(AutoStyleImageCropFragment autoStyleImageCropFragment, CropImageView cropImageView, CropImageView.c result) {
        Intrinsics.checkNotNullParameter(cropImageView, "<unused var>");
        Intrinsics.checkNotNullParameter(result, "result");
        Uri uriK = result.k();
        if (uriK != null) {
            autoStyleImageCropFragment.A().c0(uriK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(AutoStyleImageCropFragment autoStyleImageCropFragment, View view) {
        androidx.navigation.fragment.f.a(autoStyleImageCropFragment).A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(mb.c cVar, View view) {
        CropImageView.g(cVar.f322864f, Bitmap.CompressFormat.PNG, 0, 0, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final g z() {
        return (g) this.f160104a.getValue();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        mb.c cVar = this.f160106c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar = null;
        }
        cVar.f322864f.requestLayout();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final mb.c cVarC = mb.c.c(LayoutInflater.from(getContext()));
        this.f160106c = cVarC;
        A().a0().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.dgenerator.fragment.crop.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoStyleImageCropFragment.D(this.f160112a, (Pair) obj);
            }
        }));
        A().Z().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.dgenerator.fragment.crop.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoStyleImageCropFragment.E(this.f160113a, (AutoStyle) obj);
            }
        }));
        cVarC.f322864f.setOnCropImageCompleteListener(new CropImageView.f() { // from class: com.planner5d.library.dgenerator.fragment.crop.c
            @Override // com.canhub.cropper.core.CropImageView.f
            public final void a(CropImageView cropImageView, CropImageView.c cVar) {
                AutoStyleImageCropFragment.F(this.f160114a, cropImageView, cVar);
            }
        });
        cVarC.f322861c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.crop.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoStyleImageCropFragment.G(this.f160115a, view);
            }
        });
        cVarC.f322862d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.crop.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoStyleImageCropFragment.H(cVarC, view);
            }
        });
        cVarC.f322863e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.crop.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoStyleImageCropFragment.C(cVarC, view);
            }
        });
        if (z().c() != 0) {
            A().b0(z().c());
        }
        ConstraintLayout root = cVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
