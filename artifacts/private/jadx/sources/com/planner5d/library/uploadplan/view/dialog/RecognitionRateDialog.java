package com.planner5d.library.uploadplan.view.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.g3;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRecognitionRateDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecognitionRateDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionRateDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1872#2,3:72\n*S KotlinDebug\n*F\n+ 1 RecognitionRateDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionRateDialog\n*L\n30#1:72,3\n*E\n"})
public final class RecognitionRateDialog extends ContentDialog<Boolean> implements n0 {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f230917o3 = 3;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(RecognitionRateDialog recognitionRateDialog, int i10, Project project, View view) {
        recognitionRateDialog.W(i10);
        if (i10 < 3) {
            recognitionRateDialog.X(i10, project, recognitionRateDialog.getArguments());
        } else {
            recognitionRateDialog.Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(RecognitionRateDialog recognitionRateDialog, View view) {
        recognitionRateDialog.dismiss();
    }

    private final void W(int i10) {
        com.planner5d.library.application.b.f142455c.a().F().i(StatisticsEventAiDesigner.a.score_submitted, StatisticsEventAiDesigner.EventData.j(g3.f216952a.a(getArguments()), null, null, null, null, Integer.valueOf(i10), null, null, com.rabbitmq.client.impl.k.b.p.f265340a, null));
        dismiss();
    }

    private final void X(int i10, Project project, Bundle bundle) {
        com.planner5d.library.uploadplan.application.g.f230718b.a().i().c(RecognitionTellUsDialog.class).k(new Pair(Integer.valueOf(i10), project)).h(bundle).g();
    }

    private final void Y() {
        com.planner5d.library.uploadplan.application.g.f230718b.a().i().c(RecognitionThankYouDialog.class).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        final int i10 = 0;
        ie.c cVarD = ie.c.d(LayoutInflater.from(root.getContext()), root, false);
        List listListOf = CollectionsKt.listOf((Object[]) new ImageView[]{cVarD.f287122c, cVarD.f287123d, cVarD.f287124e, cVarD.f287125f, cVarD.f287126g});
        final Project project = (Project) A();
        for (Object obj : listListOf) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((ImageView) obj).setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecognitionRateDialog.U(this.f230995a, i10, project, view);
                }
            });
            i10 = i11;
        }
        cVarD.f287121b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionRateDialog.V(this.f230998a, view);
            }
        });
        ConstraintLayout constraintLayoutB = cVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.Fg);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }
}
