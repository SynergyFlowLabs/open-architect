package com.planner5d.library.activity.fragment.spaces.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDocumentStausView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentStausView.kt\ncom/planner5d/library/activity/fragment/spaces/view/DocumentStatusView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n257#2,2:94\n257#2,2:97\n257#2,2:99\n257#2,2:101\n257#2,2:103\n257#2,2:105\n257#2,2:107\n257#2,2:109\n257#2,2:111\n257#2,2:113\n257#2,2:115\n1#3:96\n*S KotlinDebug\n*F\n+ 1 DocumentStausView.kt\ncom/planner5d/library/activity/fragment/spaces/view/DocumentStatusView\n*L\n19#1:94,2\n62#1:97,2\n76#1:99,2\n77#1:101,2\n78#1:103,2\n82#1:105,2\n83#1:107,2\n84#1:109,2\n88#1:111,2\n89#1:113,2\n90#1:115,2\n*E\n"})
public final class DocumentStatusView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f136394b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final rd.i f136395a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public DocumentStatusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void A(DocumentStatusView documentStatusView, d dVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        documentStatusView.z(dVar, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(d dVar, View view) {
        ((i) dVar).c().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(d dVar, View view) {
        ((m) dVar).c().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(d dVar, View view) {
        ((l) dVar).c().invoke();
    }

    private final rd.i E() {
        rd.i iVar = this.f136395a;
        CircularProgressIndicator progress = iVar.f366622d;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        progress.setVisibility(8);
        TextView retryButton = iVar.f366623e;
        Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
        retryButton.setVisibility(8);
        ImageView downloadButton = iVar.f366621c;
        Intrinsics.checkNotNullExpressionValue(downloadButton, "downloadButton");
        downloadButton.setVisibility(0);
        return iVar;
    }

    private final rd.i F(Integer num) {
        rd.i iVar = this.f136395a;
        if (num == null) {
            iVar.f366622d.setIndeterminate(true);
        } else {
            iVar.f366622d.setIndeterminate(false);
            iVar.f366622d.setProgress(num.intValue());
        }
        CircularProgressIndicator progress = iVar.f366622d;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        progress.setVisibility(0);
        TextView retryButton = iVar.f366623e;
        Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
        retryButton.setVisibility(8);
        ImageView downloadButton = iVar.f366621c;
        Intrinsics.checkNotNullExpressionValue(downloadButton, "downloadButton");
        downloadButton.setVisibility(8);
        return iVar;
    }

    private final rd.i G() {
        rd.i iVar = this.f136395a;
        CircularProgressIndicator progress = iVar.f366622d;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        progress.setVisibility(8);
        TextView retryButton = iVar.f366623e;
        Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
        retryButton.setVisibility(0);
        ImageView downloadButton = iVar.f366621c;
        Intrinsics.checkNotNullExpressionValue(downloadButton, "downloadButton");
        downloadButton.setVisibility(8);
        return iVar;
    }

    public final void z(@Nullable final d dVar, @Nullable Function0<Unit> function0) {
        rd.i iVar = this.f136395a;
        View root = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        int i10 = 0;
        if (!(dVar != null)) {
            i10 = 8;
        }
        root.setVisibility(i10);
        if (dVar == null) {
            return;
        }
        Integer numB = dVar.b();
        if (numB != null) {
            iVar.f366626h.setText(numB.intValue());
        }
        Integer numA = dVar.a();
        if (numA != null) {
            iVar.f366625g.setText(numA.intValue());
        }
        if (dVar instanceof k) {
            F(((k) dVar).c());
            iVar.f366624f.setImageResource(c1.g.f251552l6);
            return;
        }
        if (dVar instanceof j) {
            F(null);
            iVar.f366624f.setImageResource(c1.g.f251638r8);
            return;
        }
        if (dVar instanceof i) {
            if (((i) dVar).c() != null) {
                G();
                iVar.f366623e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.spaces.view.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DocumentStatusView.B(dVar, view);
                    }
                });
            }
            iVar.f366624f.setImageResource(c1.g.f251512i9);
            return;
        }
        if (dVar instanceof m) {
            E();
            iVar.f366621c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.spaces.view.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DocumentStatusView.C(dVar, view);
                }
            });
            iVar.f366624f.setImageResource(c1.g.f251552l6);
            return;
        }
        if (dVar instanceof l) {
            TextView textView = iVar.f366626h;
            k3 k3VarD = ((l) dVar).d();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setText(k3VarD.i(context));
            E();
            iVar.f366621c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.spaces.view.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DocumentStatusView.D(dVar, view);
                }
            });
            iVar.f366624f.setImageResource(c1.g.f251552l6);
            return;
        }
        if (dVar instanceof h) {
            TextView textView2 = iVar.f366626h;
            h hVar = (h) dVar;
            k3 k3VarD2 = hVar.d();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView2.setText(k3VarD2.i(context2));
            F(hVar.c());
            iVar.f366624f.setImageResource(c1.g.f251552l6);
            return;
        }
        if (!(dVar instanceof p)) {
            throw new k0();
        }
        View root2 = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        root2.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public DocumentStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DocumentStatusView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public DocumentStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        rd.i iVarB = rd.i.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(iVarB, "inflate(...)");
        this.f136395a = iVarB;
    }
}
