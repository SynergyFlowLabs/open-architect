package com.planner5d.library.activity.fragment.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.model.manager.managedfiles.v;
import com.planner5d.library.model.manager.managedfiles.w;
import com.planner5d.library.model.manager.managedfiles.y;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class ViewManagedFiles extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f135194i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ProgressBar f135195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Button f135196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextView f135197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextView f135198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final TextView f135199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final TextView f135200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private View.OnClickListener f135201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private View.OnClickListener f135202h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewManagedFiles(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence z(ViewManagedFiles viewManagedFiles, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String warning = ErrorMessageException.getWarning(viewManagedFiles.getContext(), it);
        Intrinsics.checkNotNullExpressionValue(warning, "getWarning(...)");
        return warning;
    }

    public final void x(@NotNull View.OnClickListener start, @NotNull View.OnClickListener stop) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        this.f135201g = start;
        this.f135202h = stop;
    }

    public final void y(@NotNull v state) {
        int i10;
        View.OnClickListener onClickListener;
        int i11;
        CharSequence charSequenceD;
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.d() == y.b.DOWNLOADING) {
            i10 = com.planner5d.library.f.s.f169487v7;
            onClickListener = this.f135202h;
        } else {
            i10 = com.planner5d.library.f.s.f169463u7;
            onClickListener = state.d() == y.b.IDLE ? this.f135201g : null;
        }
        w wVarE = state.e();
        this.f135196b.setOnClickListener(onClickListener);
        this.f135196b.setText(getContext().getString(i10));
        int i13 = 0;
        this.f135196b.setEnabled((wVarE == null || wVarE.f() || state.d() == y.b.CHANGING_STATE) ? false : true);
        TextView textView = this.f135198d;
        Context context = getContext();
        int i14 = com.planner5d.library.f.s.f169366q7;
        Context context2 = getContext();
        int iC = state.c();
        if (iC != 0) {
            i11 = iC != 2 ? com.planner5d.library.f.s.f169415s7 : com.planner5d.library.f.s.f169439t7;
        } else {
            i11 = com.planner5d.library.f.s.f169390r7;
        }
        textView.setText(context.getString(i14, context2.getString(i11)));
        if (wVarE == null) {
            this.f135195a.setProgress(0);
            this.f135195a.setIndeterminate(true);
            charSequenceD = getContext().getString(com.planner5d.library.f.s.zG);
        } else {
            this.f135195a.setIndeterminate(false);
            ProgressBar progressBar = this.f135195a;
            progressBar.setProgress((int) (progressBar.getMax() * wVarE.e()));
            String str = String.format("<font color=\"%4$s\">%1$s</font> / %2$s (%3$d%%)", Arrays.copyOf(new Object[]{org.apache.commons.io.k.a(wVarE.c()), org.apache.commons.io.k.a(wVarE.d()), Integer.valueOf((int) Math.floor(((double) wVarE.e()) * 100.0d)), com.planner5d.library.application.b.f142455c.a().O1().d(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166437ic))}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            charSequenceD = com.planner5d.library.services.textspan.b.d(str);
        }
        this.f135197c.setText(charSequenceD);
        TextView textView2 = this.f135200f;
        String[] strArrF = state.f();
        if (strArrF.length == 0) {
            i12 = 8;
        } else {
            this.f135200f.setText(ArraysKt.joinToString$default(strArrF, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.planner5d.library.activity.fragment.settings.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ViewManagedFiles.z(this.f135269a, (String) obj);
                }
            }, 30, (Object) null));
            i12 = 0;
        }
        textView2.setVisibility(i12);
        TextView textView3 = this.f135199e;
        ErrorMessageException errorMessageExceptionB = state.b();
        if (errorMessageExceptionB == null) {
            i13 = 8;
        } else {
            TextView textView4 = this.f135199e;
            q1 q1Var = q1.f312784a;
            String str2 = String.format("%s %d/%d", Arrays.copyOf(new Object[]{ErrorMessageException.getError(getContext(), errorMessageExceptionB), Integer.valueOf(com.planner5d.library.services.download.o.f224287a.f()), Integer.valueOf(state.a().f180679c.length)}, 3));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView4.setText(str2);
        }
        textView3.setVisibility(i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewManagedFiles(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewManagedFiles(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, com.planner5d.library.f.m.f168636a9, this);
        this.f135196b = (Button) findViewById(com.planner5d.library.f.j.M4);
        this.f135195a = (ProgressBar) findViewById(com.planner5d.library.f.j.f167933a4);
        this.f135197c = (TextView) findViewById(com.planner5d.library.f.j.st);
        this.f135198d = (TextView) findViewById(com.planner5d.library.f.j.Ka);
        this.f135199e = (TextView) findViewById(com.planner5d.library.f.j.f168064fc);
        this.f135200f = (TextView) findViewById(com.planner5d.library.f.j.Wx);
    }
}
