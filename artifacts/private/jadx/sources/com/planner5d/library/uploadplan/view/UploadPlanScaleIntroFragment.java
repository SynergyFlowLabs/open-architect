package com.planner5d.library.uploadplan.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.VideoView;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUploadPlanScaleIntroFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadPlanScaleIntroFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleIntroFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,63:1\n16#2:64\n*S KotlinDebug\n*F\n+ 1 UploadPlanScaleIntroFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleIntroFragment\n*L\n21#1:64\n*E\n"})
public final class UploadPlanScaleIntroFragment extends UploadPlanBaseFragment implements com.planner5d.library.activity.helper.ui.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f230849e = new i2(j1.d(w.class), new b(), new c(com.planner5d.library.uploadplan.application.g.f230718b.a()), null, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private VideoView f230850f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230851a;

        static {
            int[] iArr = new int[w.a.values().length];
            try {
                iArr[w.a.Measurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f230851a = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 UploadPlanScaleIntroFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleIntroFragment\n*L\n1#1,16:1\n21#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return UploadPlanScaleIntroFragment.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230853a;

        public c(com.planner5d.library.view.b bVar) {
            this.f230853a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230853a;
        }
    }

    private final w A() {
        return (w) this.f230849e.getValue();
    }

    private final void B(w.a aVar) {
        Pair pair = (aVar == null ? -1 : a.f230851a[aVar.ordinal()]) == 1 ? new Pair(UploadPlanScaleRulerFragment.class, null) : null;
        if (pair != null) {
            this.f131538b.f(new com.planner5d.library.activity.helper.event.content.c((Class) pair.getFirst(), (Bundle) pair.getSecond(), com.planner5d.library.activity.helper.event.content.e.SlideLeft), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(UploadPlanScaleIntroFragment uploadPlanScaleIntroFragment, View view) {
        uploadPlanScaleIntroFragment.A().X();
        uploadPlanScaleIntroFragment.B(w.a.Measurement);
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).w(false).N(false).A(he.b.f.f281409m1).H(true).z(he.b.f.f281409m1).G(false).y(he.b.f.f281409m1).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ie.l lVarC = ie.l.c(inflater);
        VideoView videoView = lVarC.f287172d.f287204b;
        this.f230850f = videoView;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
            videoView = null;
        }
        videoView.setDataSource(he.b.r.f283894w);
        A().W(e4.c.f216886a.a(getArguments()));
        com.planner5d.library.activity.helper.ui.d.h(this, new k3(he.b.s.f284047g1, new Object[0]));
        lVarC.f287170b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleIntroFragment.C(this.f231178a, view);
            }
        });
        ConstraintLayout root = lVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        VideoView videoView = this.f230850f;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
            videoView = null;
        }
        videoView.l();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        VideoView videoView = this.f230850f;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
            videoView = null;
        }
        videoView.h();
    }
}
