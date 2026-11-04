package com.planner5d.library.uploadplan.view.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.uploadplan.view.UploadPlanUploadFragment;
import com.planner5d.library.widget.AnimatedVectorImageView;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRecognitionFailedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecognitionFailedDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionFailedDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,87:1\n16#2:88\n257#3,2:89\n257#3,2:91\n*S KotlinDebug\n*F\n+ 1 RecognitionFailedDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionFailedDialog\n*L\n21#1:88\n30#1:89,2\n31#1:91,2\n*E\n"})
public final class RecognitionFailedDialog extends RecognitionInProgressDialog {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private final f0 f230910q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @Nullable
    private final AnimatedVectorImageView f230911r3;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230912a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230912a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230912a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230912a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 RecognitionFailedDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionFailedDialog\n*L\n1#1,16:1\n21#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return RecognitionFailedDialog.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230914a;

        public c(com.planner5d.library.view.b bVar) {
            this.f230914a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230914a;
        }
    }

    public RecognitionFailedDialog() {
        Function0 function0 = null;
        this.f230910q3 = new i2(j1.d(l.class), new b(), new c(com.planner5d.library.uploadplan.application.g.f230718b.a()), function0, 8, null);
    }

    private final void g0() {
        q0().f0(new Function0() { // from class: com.planner5d.library.uploadplan.view.dialog.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecognitionFailedDialog.h0(this.f230944a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(RecognitionFailedDialog recognitionFailedDialog) {
        recognitionFailedDialog.dismiss();
        recognitionFailedDialog.sendResultOnce(Boolean.TRUE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(ie.a aVar, Boolean bool) {
        aVar.f287110e.setEnabled(!bool.booleanValue());
        aVar.f287109d.setEnabled(!bool.booleanValue());
        ProgressBar progress = aVar.f287113h;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        progress.setVisibility(bool.booleanValue() ? 0 : 8);
        View blocker = aVar.f287107b;
        Intrinsics.checkNotNullExpressionValue(blocker, "blocker");
        blocker.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(RecognitionFailedDialog recognitionFailedDialog, Boolean bool) {
        recognitionFailedDialog.sendResultOnce(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(RecognitionFailedDialog recognitionFailedDialog, String str, Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            recognitionFailedDialog.r0(str);
        }
        recognitionFailedDialog.sendResultOnce(bool2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(RecognitionFailedDialog recognitionFailedDialog, String str) {
        recognitionFailedDialog.q0().m0().a(recognitionFailedDialog.requireActivity(), str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(RecognitionFailedDialog recognitionFailedDialog, View view) {
        recognitionFailedDialog.q0().n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(final RecognitionFailedDialog recognitionFailedDialog, View view) {
        recognitionFailedDialog.q0().f0(new Function0() { // from class: com.planner5d.library.uploadplan.view.dialog.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecognitionFailedDialog.o0(this.f230943a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(RecognitionFailedDialog recognitionFailedDialog) {
        recognitionFailedDialog.q0().o0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(RecognitionFailedDialog recognitionFailedDialog, View view) {
        recognitionFailedDialog.g0();
    }

    private final l q0() {
        return (l) this.f230910q3.getValue();
    }

    private final void r0(String str) {
        com.planner5d.library.activity.fragment.x.g(com.planner5d.library.uploadplan.application.g.f230718b.a().j(), new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) UploadPlanUploadFragment.class, (Bundle) null).k(Intrinsics.areEqual(str, "feed") ? new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) FeedFragment.class, (Bundle) null) : new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a())), false, 2, null);
    }

    @Override // com.planner5d.library.uploadplan.view.dialog.RecognitionInProgressDialog, com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        final ie.a aVarD = ie.a.d(LayoutInflater.from(root.getContext()), root, false);
        q0().i0().k(this, new a(new Function1() { // from class: com.planner5d.library.uploadplan.view.dialog.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecognitionFailedDialog.i0(aVarD, (Boolean) obj);
            }
        }));
        q0().h0().k(this, new a(new Function1() { // from class: com.planner5d.library.uploadplan.view.dialog.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecognitionFailedDialog.j0(this.f230946a, (Boolean) obj);
            }
        }));
        final String str = "my_projects";
        q0().k0().k(this, new a(new Function1() { // from class: com.planner5d.library.uploadplan.view.dialog.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecognitionFailedDialog.k0(this.f230947a, str, (Boolean) obj);
            }
        }));
        q0().j0().k(this, new a(new Function1() { // from class: com.planner5d.library.uploadplan.view.dialog.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecognitionFailedDialog.l0(this.f230949a, (String) obj);
            }
        }));
        aVarD.f287110e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionFailedDialog.m0(this.f230950a, view);
            }
        });
        aVarD.f287109d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionFailedDialog.n0(this.f230951a, view);
            }
        });
        aVarD.f287108c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionFailedDialog.p0(this.f230952a, view);
            }
        });
        ConstraintLayout constraintLayoutB = aVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // com.planner5d.library.uploadplan.view.dialog.RecognitionInProgressDialog
    @Nullable
    protected AnimatedVectorImageView W() {
        return this.f230911r3;
    }

    @Override // com.planner5d.library.uploadplan.view.dialog.RecognitionInProgressDialog, com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        g0();
        return true;
    }
}
