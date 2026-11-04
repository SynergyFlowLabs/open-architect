package com.planner5d.library.contest.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.d1;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestViewDataBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestViewDataBinder.kt\ncom/planner5d/library/contest/view/ContestViewDataBinder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n257#2,2:122\n257#2,2:124\n257#2,2:127\n257#2,2:129\n257#2,2:131\n257#2,2:133\n257#2,2:135\n257#2,2:137\n1#3:126\n*S KotlinDebug\n*F\n+ 1 ContestViewDataBinder.kt\ncom/planner5d/library/contest/view/ContestViewDataBinder\n*L\n46#1:122,2\n49#1:124,2\n60#1:127,2\n74#1:129,2\n76#1:131,2\n82#1:133,2\n88#1:135,2\n93#1:137,2\n*E\n"})
public final class u implements d1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f153798n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f153799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ImageView f153800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextView f153801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextView f153802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final TextView f153803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final TextView f153804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final TextView f153805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final View f153806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final View f153807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final View f153808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final TextView f153809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f153810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f153811m;

    public u(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull ImageView contestImage, @NotNull TextView contestRemainingTime, @NotNull TextView contestName, @NotNull TextView contestRequirements, @NotNull TextView contestButtonParticipate, @NotNull TextView contestButtonVote, @Nullable View view, @Nullable View view2, @Nullable View view3, @NotNull TextView contestShareExplanation, boolean z10) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(contestImage, "contestImage");
        Intrinsics.checkNotNullParameter(contestRemainingTime, "contestRemainingTime");
        Intrinsics.checkNotNullParameter(contestName, "contestName");
        Intrinsics.checkNotNullParameter(contestRequirements, "contestRequirements");
        Intrinsics.checkNotNullParameter(contestButtonParticipate, "contestButtonParticipate");
        Intrinsics.checkNotNullParameter(contestButtonVote, "contestButtonVote");
        Intrinsics.checkNotNullParameter(contestShareExplanation, "contestShareExplanation");
        this.f153799a = bitmapTargetManager;
        this.f153800b = contestImage;
        this.f153801c = contestRemainingTime;
        this.f153802d = contestName;
        this.f153803e = contestRequirements;
        this.f153804f = contestButtonParticipate;
        this.f153805g = contestButtonVote;
        this.f153806h = view;
        this.f153807i = view2;
        this.f153808j = view3;
        this.f153809k = contestShareExplanation;
        this.f153810l = z10;
    }

    @e.a({"SetTextI18n"})
    private final void g(Context context, final Contest contest, Date date, boolean z10, boolean z11, p0 p0Var, final c0.b bVar) {
        boolean zN = contest.N(date);
        boolean zM = contest.M(date);
        boolean zP = contest.P(date);
        TextView textView = this.f153804f;
        boolean z12 = false;
        if (zN) {
            textView.setVisibility(8);
        } else if (!z10) {
            textView.setVisibility(0);
            textView.setText(com.planner5d.library.contest.e.r.J3);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.h(bVar, contest, view);
                }
            });
        } else if (!z11) {
            textView.setVisibility(0);
            textView.setText(com.planner5d.library.contest.e.r.G3);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.i(bVar, contest, view);
                }
            });
        } else if (this.f153810l && z11) {
            textView.setVisibility(0);
            textView.setText(com.planner5d.library.contest.e.r.f151389a5);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.j(bVar, contest, view);
                }
            });
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f153805g;
        if (zM && zP) {
            textView2.setEnabled(true);
            textView2.setBackground(androidx.core.content.res.i.g(textView2.getResources(), com.planner5d.library.contest.e.g.f150619r1, null));
            textView2.setText(com.planner5d.library.contest.e.r.f151511f4);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.k(bVar, contest, view);
                }
            });
            textView2.setTextColor(androidx.core.content.d.g(context, com.planner5d.library.contest.e.C1519e.Lm));
            return;
        }
        textView2.setEnabled(false);
        textView2.setBackground(androidx.core.content.res.i.g(textView2.getResources(), com.planner5d.library.contest.e.g.f150529l1, null));
        String string = textView2.getResources().getString(com.planner5d.library.contest.e.r.N5);
        String strD = p0Var.D(context, contest.J(date));
        Intrinsics.checkNotNullExpressionValue(strD, "let(...)");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strD.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        textView2.setText(string + " " + lowerCase);
        textView2.setTextColor(androidx.core.content.d.g(context, com.planner5d.library.contest.e.C1519e.f149328dg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(c0.b bVar, Contest contest, View view) {
        bVar.f(contest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c0.b bVar, Contest contest, View view) {
        bVar.e(contest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(c0.b bVar, Contest contest, View view) {
        bVar.a(contest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(c0.b bVar, Contest contest, View view) {
        bVar.d(contest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(c0.b bVar, Contest contest, View view) {
        bVar.b(contest);
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        this.f153799a.d(this.f153811m);
    }

    @NotNull
    public final TextView l() {
        return this.f153804f;
    }

    @NotNull
    public final TextView m() {
        return this.f153805g;
    }

    public final void n(@NotNull Context context, @Nullable final Contest contest, @NotNull Date serverTime, boolean z10, boolean z11, @NotNull p0 formatter, @NotNull o1 languageManager, @NotNull com.planner5d.library.services.q imageManager, @NotNull final c0.b listener) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        View view = this.f153807i;
        if (view != null) {
            view.setClipToOutline(true);
        }
        if (contest == null) {
            View view2 = this.f153806h;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            }
            return;
        }
        View view3 = this.f153806h;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f153808j;
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    u.o(listener, contest, view5);
                }
            });
        }
        this.f153802d.setText(languageManager.b(context, contest.C(), ""));
        this.f153803e.setText(languageManager.b(context, contest.G(), ""));
        this.f153811m = new com.planner5d.library.contest.data.h(imageManager).b(this.f153799a, this.f153811m, this.f153800b, contest.A());
        TextView textView = this.f153801c;
        if (z11) {
            lowerCase = context.getString(com.planner5d.library.contest.e.r.f151438c4);
        } else {
            String strD = formatter.D(context, contest.F(serverTime));
            Intrinsics.checkNotNullExpressionValue(strD, "let(...)");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            lowerCase = strD.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        textView.setText(lowerCase);
        this.f153809k.setVisibility(this.f153810l && z11 ? 0 : 8);
        g(context, contest, serverTime, z10, z11, formatter, listener);
    }

    public /* synthetic */ u(com.planner5d.library.services.bitmaploader.target.h hVar, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, View view2, View view3, TextView textView6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, imageView, textView, textView2, textView3, textView4, textView5, (i10 & 128) != 0 ? null : view, (i10 & 256) != 0 ? null : view2, (i10 & 512) != 0 ? null : view3, textView6, z10);
    }
}
