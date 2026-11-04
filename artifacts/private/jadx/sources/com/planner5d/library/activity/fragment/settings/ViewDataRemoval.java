package com.planner5d.library.activity.fragment.settings;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.databinding.t7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewDataRemoval.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewDataRemoval.kt\ncom/planner5d/library/activity/fragment/settings/ViewDataRemoval\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,57:1\n13409#2:58\n13410#2:61\n257#3,2:59\n257#3,2:62\n*S KotlinDebug\n*F\n+ 1 ViewDataRemoval.kt\ncom/planner5d/library/activity/fragment/settings/ViewDataRemoval\n*L\n49#1:58\n49#1:61\n50#1:59,2\n52#1:62,2\n*E\n"})
public final class ViewDataRemoval extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135190d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t7 f135191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f135192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final View[] f135193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDataRemoval(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        t7 t7VarA = t7.a(View.inflate(getContext(), com.planner5d.library.f.m.X8, this));
        Intrinsics.checkNotNullExpressionValue(t7VarA, "bind(...)");
        t7VarA.f159719f.setRotation(this.f135192b ? 180.0f : 0.0f);
        this.f135191a = t7VarA;
        this.f135193c = new View[]{t7VarA.f159721h, t7VarA.f159718e, t7VarA.f159715b, t7VarA.f159716c};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Activity activity, View view) {
        com.planner5d.library.application.b.f142455c.a().w().a(activity, com.planner5d.library.api.f.a().f142275m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(ViewDataRemoval viewDataRemoval, View view) {
        viewDataRemoval.f135192b = !viewDataRemoval.f135192b;
        View[] viewArr = viewDataRemoval.f135193c;
        int length = viewArr.length;
        int i10 = 0;
        while (true) {
            int i11 = 8;
            if (i10 >= length) {
                break;
            }
            View view2 = viewArr[i10];
            if (viewDataRemoval.f135192b) {
                i11 = 0;
            }
            view2.setVisibility(i11);
            i10++;
        }
        TextView managePersonalDataExplanation = viewDataRemoval.f135191a.f159720g;
        Intrinsics.checkNotNullExpressionValue(managePersonalDataExplanation, "managePersonalDataExplanation");
        managePersonalDataExplanation.setVisibility(viewDataRemoval.f135192b ? 8 : 0);
        viewDataRemoval.f135191a.f159719f.setRotation(viewDataRemoval.f135192b ? 180.0f : 0.0f);
    }

    public final void setup(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f135191a.f159715b.setEnabled(false);
        com.planner5d.library.services.textspan.b.j(activity, this.f135191a.f159721h, com.planner5d.library.f.s.Mz, com.planner5d.library.application.b.f142455c.a().C1());
        this.f135191a.f159716c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.settings.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewDataRemoval.y(activity, view);
            }
        });
        this.f135191a.f159722i.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.settings.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewDataRemoval.z(this.f135268a, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDataRemoval(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        t7 t7VarA = t7.a(View.inflate(getContext(), com.planner5d.library.f.m.X8, this));
        Intrinsics.checkNotNullExpressionValue(t7VarA, "bind(...)");
        t7VarA.f159719f.setRotation(this.f135192b ? 180.0f : 0.0f);
        this.f135191a = t7VarA;
        this.f135193c = new View[]{t7VarA.f159721h, t7VarA.f159718e, t7VarA.f159715b, t7VarA.f159716c};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDataRemoval(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        t7 t7VarA = t7.a(View.inflate(getContext(), com.planner5d.library.f.m.X8, this));
        Intrinsics.checkNotNullExpressionValue(t7VarA, "bind(...)");
        t7VarA.f159719f.setRotation(this.f135192b ? 180.0f : 0.0f);
        this.f135191a = t7VarA;
        this.f135193c = new View[]{t7VarA.f159721h, t7VarA.f159718e, t7VarA.f159715b, t7VarA.f159716c};
    }
}
