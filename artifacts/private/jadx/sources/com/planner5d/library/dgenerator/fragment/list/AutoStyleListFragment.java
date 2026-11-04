package com.planner5d.library.dgenerator.fragment.list;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.p0;
import androidx.navigation.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.widget.CompareImagesView;
import com.planner5d.library.widget.c0;
import com.planner5d.library.widget.preloader.t;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.x;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nAutoStyleListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStyleListFragment.kt\ncom/planner5d/library/dgenerator/fragment/list/AutoStyleListFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n16#2:161\n257#3,2:162\n257#3,2:164\n257#3,2:167\n1#4:166\n*S KotlinDebug\n*F\n+ 1 AutoStyleListFragment.kt\ncom/planner5d/library/dgenerator/fragment/list/AutoStyleListFragment\n*L\n43#1:161\n133#1:162,2\n134#1:164,2\n101#1:167,2\n*E\n"})
public final class AutoStyleListFragment extends Fragment implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mb.f f160298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f160299b;

    @ij.a
    public com.planner5d.library.model.manager.builtin.i builtInDataManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f160301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f160302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t f160303f;

    @ij.a
    public com.planner5d.library.activity.helper.imagechooser.j helperImageChooser;

    @ij.a
    public y0 imageManager;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160304a;

        static {
            int[] iArr = new int[n.b.values().length];
            try {
                iArr[n.b.Crop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.Gallery.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f160304a = iArr;
        }
    }

    static final class b<T> implements kotlinx.coroutines.flow.j {
        b() {
        }

        public final Object a(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
            AutoStyleListFragment.this.f160303f.a().u(z10);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return a(((Boolean) obj).booleanValue(), dVar);
        }
    }

    static final class c implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f160306a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f160306a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f160306a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f160306a.invoke(obj);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.list.AutoStyleListFragment$selectImage$1", f = "AutoStyleListFragment.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.X}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f160308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f160309c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = AutoStyleListFragment.this.new d(dVar);
            dVar2.f160309c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AutoStyleListFragment autoStyleListFragment;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160308b;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f160309c;
                AutoStyleListFragment.this.K(true);
                Observable<Bitmap> observableE = AutoStyleListFragment.this.getHelperImageChooser$P5D_Library_DesignGenerator_release().E(512, false);
                if (observableE != null) {
                    AutoStyleListFragment autoStyleListFragment2 = AutoStyleListFragment.this;
                    com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
                    this.f160309c = s0Var;
                    this.f160307a = autoStyleListFragment2;
                    this.f160308b = 1;
                    obj = c0Var.l(observableE, this);
                    if (obj == objL) {
                        return objL;
                    }
                    autoStyleListFragment = autoStyleListFragment2;
                } else {
                    AutoStyleListFragment.this.K(false);
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoStyleListFragment = (AutoStyleListFragment) this.f160307a;
            ResultKt.m(obj);
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                autoStyleListFragment.D().z0();
                n nVarD = autoStyleListFragment.D();
                Context contextRequireContext = autoStyleListFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                nVarD.v0(contextRequireContext, bitmap);
            } else {
                autoStyleListFragment.K(false);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 AutoStyleListFragment.kt\ncom/planner5d/library/dgenerator/fragment/list/AutoStyleListFragment\n*L\n1#1,16:1\n43#2:17\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return AutoStyleListFragment.this.getViewModelStore();
        }
    }

    public static final class f implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f160312a;

        public f(com.planner5d.library.view.b bVar) {
            this.f160312a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f160312a;
        }
    }

    public AutoStyleListFragment() {
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f160300c = hVarA;
        com.planner5d.library.dgenerator.application.c.b bVar = com.planner5d.library.dgenerator.application.c.f160073b;
        this.f160301d = new i2(j1.d(n.class), new e(), new f(bVar.a()), null, 8, null);
        this.f160302e = g0.c(new Function0() { // from class: com.planner5d.library.dgenerator.fragment.list.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoStyleListFragment.z(this.f160317a);
            }
        });
        this.f160303f = new t();
        bVar.a().i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(AutoStyleListFragment autoStyleListFragment, AutoStyle autoStyle, int i10) {
        Intrinsics.checkNotNullParameter(autoStyle, "autoStyle");
        autoStyleListFragment.D().n0(autoStyle, i10);
        return Unit.f312394a;
    }

    private final ValueAnimator B() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.5f);
        valueAnimatorOfFloat.setDuration(getResources().getInteger(lb.b.k.f320323f));
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    private final com.planner5d.library.dgenerator.fragment.list.a C() {
        return (com.planner5d.library.dgenerator.fragment.list.a) this.f160302e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n D() {
        return (n) this.f160301d.getValue();
    }

    private final void E(n.a aVar) {
        int i10 = a.f160304a[aVar.c().ordinal()];
        int i11 = 3 & 1;
        if (i10 == 1) {
            w0 w0VarA = androidx.navigation.fragment.f.a(this);
            h.b bVarB = h.b(aVar.a());
            Intrinsics.checkNotNullExpressionValue(bVarB, "toImageCrop(...)");
            w0VarA.m0(bVarB);
        } else {
            if (i10 != 2) {
                throw new k0();
            }
            w0 w0VarA2 = androidx.navigation.fragment.f.a(this);
            h.a aVarA = h.a(aVar.b(), aVar.a());
            Intrinsics.checkNotNullExpressionValue(aVarA, "toGallery(...)");
            w0VarA2.m0(aVarA);
        }
        D().p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(AutoStyleListFragment autoStyleListFragment, View view) {
        autoStyleListFragment.D().y0();
        autoStyleListFragment.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(AutoStyleListFragment autoStyleListFragment, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mb.f fVar = autoStyleListFragment.f160298a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        CompareImagesView compareImagesView = fVar.f322878e.f322853f;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        compareImagesView.setProgress(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(AutoStyleListFragment autoStyleListFragment, n.a aVar) {
        if (aVar != null) {
            autoStyleListFragment.E(aVar);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(AutoStyleListFragment autoStyleListFragment, r rVar) {
        timber.log.b.f381052a.a("AutoStyle list state has changed " + rVar.e(), new Object[0]);
        List<AutoStyle> listF = rVar.f();
        mb.f fVar = autoStyleListFragment.f160298a;
        mb.f fVar2 = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        ScrollView root = fVar.f322878e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(listF.isEmpty() ? 0 : 8);
        mb.f fVar3 = autoStyleListFragment.f160298a;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fVar2 = fVar3;
        }
        fVar2.f322877d.setText(listF.isEmpty() ? autoStyleListFragment.getString(lb.b.s.aG) : autoStyleListFragment.getString(lb.b.s.TF));
        autoStyleListFragment.C().k(listF);
        Integer numE = rVar.e();
        if (numE != null) {
            autoStyleListFragment.C().notifyItemChanged(numE.intValue());
        }
        autoStyleListFragment.L(listF.isEmpty());
        return Unit.f312394a;
    }

    private final void J() {
        if (D().m0()) {
            kotlinx.coroutines.k.f(p0.a(this), null, null, new d(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(boolean z10) {
        D().u0(z10);
    }

    private final void L(boolean z10) {
        mb.f fVar = this.f160298a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fVar = null;
        }
        ScrollView root = fVar.f322878e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(z10 ? 0 : 8);
        RecyclerView autoStyleList = fVar.f322875b;
        Intrinsics.checkNotNullExpressionValue(autoStyleList, "autoStyleList");
        autoStyleList.setVisibility(z10 ? 8 : 0);
        fVar.f322877d.setText(z10 ? getString(lb.b.s.aG) : getString(lb.b.s.TF));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.dgenerator.fragment.list.a z(final AutoStyleListFragment autoStyleListFragment) {
        return new com.planner5d.library.dgenerator.fragment.list.a(autoStyleListFragment.f160300c, autoStyleListFragment.getImageManager$P5D_Library_DesignGenerator_release(), autoStyleListFragment.getBuiltInDataManager$P5D_Library_DesignGenerator_release(), null, new Function2() { // from class: com.planner5d.library.dgenerator.fragment.list.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AutoStyleListFragment.A(this.f160322a, (AutoStyle) obj, ((Integer) obj2).intValue());
            }
        }, 8, null);
    }

    @NotNull
    public final com.planner5d.library.model.manager.builtin.i getBuiltInDataManager$P5D_Library_DesignGenerator_release() {
        com.planner5d.library.model.manager.builtin.i iVar = this.builtInDataManager;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("builtInDataManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.helper.imagechooser.j getHelperImageChooser$P5D_Library_DesignGenerator_release() {
        com.planner5d.library.activity.helper.imagechooser.j jVar = this.helperImageChooser;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperImageChooser");
        return null;
    }

    @NotNull
    public final y0 getImageManager$P5D_Library_DesignGenerator_release() {
        y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        D().x0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.activity.helper.ui.d.h(this, new k3(lb.b.s.bG, new Object[0]));
        D().A0();
        mb.f fVarC = mb.f.c(inflater);
        Intrinsics.checkNotNullExpressionValue(fVarC, "inflate(...)");
        this.f160303f.b(fVarC.f322876c);
        fVarC.f322875b.setAdapter(C());
        fVarC.f322877d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.list.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoStyleListFragment.F(this.f160318a, view);
            }
        });
        fVarC.f322878e.f322850c.setClipToOutline(true);
        this.f160298a = fVarC;
        ValueAnimator valueAnimatorB = B();
        this.f160299b = valueAnimatorB;
        mb.f fVar = null;
        if (valueAnimatorB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animator");
            valueAnimatorB = null;
        }
        valueAnimatorB.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.dgenerator.fragment.list.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AutoStyleListFragment.G(this.f160319a, valueAnimator);
            }
        });
        mb.f fVar2 = this.f160298a;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fVar = fVar2;
        }
        ConstraintLayout root = fVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ValueAnimator valueAnimator = this.f160299b;
        if (valueAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animator");
            valueAnimator = null;
        }
        valueAnimator.start();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        n.s0(D(), true, null, 2, null);
        D().k0().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.dgenerator.fragment.list.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoStyleListFragment.H(this.f160320a, (n.a) obj);
            }
        }));
        D().i0().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.dgenerator.fragment.list.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoStyleListFragment.I(this.f160321a, (r) obj);
            }
        }));
        l1.c(l1.f225303a, this, D().j0(), null, new b(), 2, null);
    }

    public final void setBuiltInDataManager$P5D_Library_DesignGenerator_release(@NotNull com.planner5d.library.model.manager.builtin.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.builtInDataManager = iVar;
    }

    public final void setHelperImageChooser$P5D_Library_DesignGenerator_release(@NotNull com.planner5d.library.activity.helper.imagechooser.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.helperImageChooser = jVar;
    }

    public final void setImageManager$P5D_Library_DesignGenerator_release(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }
}
