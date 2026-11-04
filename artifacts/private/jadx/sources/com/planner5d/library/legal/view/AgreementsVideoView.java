package com.planner5d.library.legal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import com.planner5d.library.api.f;
import com.planner5d.library.legal.application.e;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.h3;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uc.c;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nAgreementsVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgreementsVideoView.kt\ncom/planner5d/library/legal/view/AgreementsVideoView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,64:1\n299#2,2:65\n*S KotlinDebug\n*F\n+ 1 AgreementsVideoView.kt\ncom/planner5d/library/legal/view/AgreementsVideoView\n*L\n41#1:65,2\n*E\n"})
public final class AgreementsVideoView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f180424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f180425b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AgreementsVideoView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Context context, String str) {
        e.f180321b.a().j().a(h3.e(context), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(AgreementsVideoView agreementsVideoView, View view) {
        ConstraintLayout root = agreementsVideoView.f180425b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(8);
        agreementsVideoView.C();
        Function0<Unit> function0 = agreementsVideoView.f180424a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void A(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f180424a = function;
    }

    public final void B() {
        this.f180425b.f381233e.h();
    }

    public final void C() {
        this.f180425b.f381233e.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AgreementsVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreementsVideoView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        c cVarD = c.d(LayoutInflater.from(context), this, true);
        this.f180425b = cVarD;
        cVarD.f381233e.setDataSource(tc.b.p.f378959l);
        String string = context.getString(tc.b.q.Zj);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(tc.b.q.f378981ak);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        TextView textView = cVarD.f381230b;
        String string3 = context.getString(tc.b.q.Ch);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String str = String.format(string3, Arrays.copyOf(new Object[]{"<a href=\"" + f.a().f142276n + "\">" + string + "</a>", "<a href=\"" + f.a().f142277o + "\">" + string2 + "</a>"}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        com.planner5d.library.services.textspan.b.n(textView, com.planner5d.library.services.textspan.b.i(StringsKt.k2(str, "\n", "<br/>", false, 4, null), new UrlSpanWithListener.a() { // from class: com.planner5d.library.legal.view.a
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str2) {
                AgreementsVideoView.y(context, str2);
            }
        }, Integer.valueOf(d.g(context, tc.b.e.f377534yf)), false, false, false));
        cVarD.f381231c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.legal.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AgreementsVideoView.z(this.f180427a, view);
            }
        });
    }
}
