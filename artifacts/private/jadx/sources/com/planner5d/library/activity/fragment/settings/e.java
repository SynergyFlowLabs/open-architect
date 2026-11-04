package com.planner5d.library.activity.fragment.settings;

import android.app.Activity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.navigation.c2;
import androidx.navigation.f4;
import com.planner5d.library.activity.fragment.profile.q;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.databinding.z7;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.widget.preloader.h0;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class e extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f135216b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.p f135217a;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.SettingsPageText$1$1", f = "SettingsPageText.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135218a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f135220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c1 f135221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t f135222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b2 f135223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.fragment.dialog.k f135224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m2 f135225h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f135226i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextView f135227j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ h0 f135228k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, c1 c1Var, t tVar, b2 b2Var, com.planner5d.library.activity.fragment.dialog.k kVar, m2 m2Var, boolean z10, TextView textView, h0 h0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f135220c = activity;
            this.f135221d = c1Var;
            this.f135222e = tVar;
            this.f135223f = b2Var;
            this.f135224g = kVar;
            this.f135225h = m2Var;
            this.f135226i = z10;
            this.f135227j = textView;
            this.f135228k = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(this.f135220c, this.f135221d, this.f135222e, this.f135223f, this.f135224g, this.f135225h, this.f135226i, this.f135227j, this.f135228k, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135218a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e eVar = e.this;
                Activity activity = this.f135220c;
                c1 c1Var = this.f135221d;
                t tVar = this.f135222e;
                b2 b2Var = this.f135223f;
                com.planner5d.library.activity.fragment.dialog.k kVar = this.f135224g;
                m2 m2Var = this.f135225h;
                boolean z10 = this.f135226i;
                this.f135218a = 1;
                aVar = this;
                obj = eVar.c(activity, c1Var, tVar, b2Var, kVar, m2Var, z10, aVar);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                aVar = this;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence instanceof Spanned) {
                com.planner5d.library.services.d.f224235a.c(aVar.f135227j, (Spanned) charSequence);
            } else {
                aVar.f135227j.setText(charSequence);
            }
            aVar.f135228k.b();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.SettingsPageText$loadText$2", f = "SettingsPageText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super CharSequence>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f135230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f135231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c1 f135232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m2 f135233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f135234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ t f135235g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b2 f135236h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, e eVar, c1 c1Var, m2 m2Var, Activity activity, t tVar, b2 b2Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f135230b = z10;
            this.f135231c = eVar;
            this.f135232d = c1Var;
            this.f135233e = m2Var;
            this.f135234f = activity;
            this.f135235g = tVar;
            this.f135236h = b2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(m2 m2Var, Activity activity, t tVar, b2 b2Var, e eVar, String str) {
            if (!StringsKt.u2(str, "p5d://", false, 2, null)) {
                m2Var.a(activity, str);
                return;
            }
            if (!Intrinsics.areEqual(str, "p5d://login")) {
                if (Intrinsics.areEqual(str, "p5d://support")) {
                    eVar.f135217a.c();
                }
            } else {
                if (tVar.b()) {
                    b2Var.b(com.planner5d.library.f.s.kq, new Object[0]);
                    return;
                }
                com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
                androidx.navigation.w0 w0VarA = f4.a(eVar);
                c2 c2VarK = q.k();
                Intrinsics.checkNotNullExpressionValue(c2VarK, "toSignIn(...)");
                kVar.d(w0VarA, c2VarK, new Function2() { // from class: com.planner5d.library.activity.fragment.settings.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e.b.s((androidx.navigation.w0) obj, (c2) obj2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(androidx.navigation.w0 w0Var, c2 c2Var) {
            com.planner5d.library.model.manager.statistics.events.n.f217157b.C1(k3.a.sign_in, k3.e.about);
            w0Var.m0(c2Var);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f135230b, this.f135231c, this.f135232d, this.f135233e, this.f135234f, this.f135235g, this.f135236h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f135229a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f135230b) {
                try {
                    str = this.f135231c.getContext().getString(com.planner5d.library.f.s.qF, this.f135231c.getContext().getString(com.planner5d.library.f.s.L1)) + org.apache.commons.io.p.K0(this.f135231c.getContext().getResources().openRawResource(com.planner5d.library.f.r.f168962p), Charset.defaultCharset());
                } catch (IOException e10) {
                    timber.log.b.f381052a.f(e10, "Failed to load text", new Object[0]);
                    str = "";
                }
            } else {
                str = this.f135231c.getContext().getString(com.planner5d.library.f.s.pF, this.f135231c.getContext().getString(com.planner5d.library.f.s.K1), this.f135231c.getContext().getString(com.planner5d.library.f.s.hE)) + "<br /><br />" + this.f135232d.a();
            }
            Spanned spannedD = com.planner5d.library.services.textspan.b.d(str);
            CharSequence charSequenceB = this.f135230b ? com.planner5d.library.services.textspan.b.b(spannedD) : new SpannableString(spannedD);
            final m2 m2Var = this.f135233e;
            final Activity activity = this.f135234f;
            final t tVar = this.f135235g;
            final b2 b2Var = this.f135236h;
            final e eVar = this.f135231c;
            return com.planner5d.library.services.textspan.b.f(charSequenceB, new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.settings.g
                @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
                public final void a(String str2) {
                    e.b.n(m2Var, activity, tVar, b2Var, eVar, str2);
                }
            }, null, false);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super CharSequence> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Activity activity, @NotNull com.planner5d.library.activity.helper.ui.d uiState, @NotNull s0 scope, @NotNull c1 installationManager, @NotNull t userAuthorization, @NotNull b2 messageManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull m2 uriViewer, boolean z10, @NotNull com.planner5d.library.services.p helpDialogFactory) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(uriViewer, "uriViewer");
        Intrinsics.checkNotNullParameter(helpDialogFactory, "helpDialogFactory");
        this.f135217a = helpDialogFactory;
        z7 z7VarA = z7.a(View.inflate(getContext(), com.planner5d.library.f.m.f168680e9, this));
        h0 h0VarA = new com.planner5d.library.widget.preloader.t(z7VarA.f160030c).a();
        h0VarA.g(Integer.valueOf(uiState.f137146m));
        h0VarA.h(Integer.valueOf(uiState.f137144k));
        h0VarA.a(com.planner5d.library.f.s.zn, false);
        TextView settingsText = z7VarA.f160029b;
        Intrinsics.checkNotNullExpressionValue(settingsText, "settingsText");
        settingsText.setLinksClickable(true);
        settingsText.setMovementMethod(LinkMovementMethod.getInstance());
        kotlinx.coroutines.k.f(scope, null, null, new a(activity, installationManager, userAuthorization, messageManager, dialogLauncher, uriViewer, z10, settingsText, h0VarA, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Activity activity, c1 c1Var, t tVar, b2 b2Var, com.planner5d.library.activity.fragment.dialog.k kVar, m2 m2Var, boolean z10, kotlin.coroutines.d<? super CharSequence> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(z10, this, c1Var, m2Var, activity, tVar, b2Var, null), dVar);
    }
}
