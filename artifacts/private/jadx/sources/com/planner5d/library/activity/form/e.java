package com.planner5d.library.activity.form;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import androidx.compose.runtime.internal.w0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.activity.fragment.settings.ViewDataRemoval;
import com.planner5d.library.databinding.t7;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.m0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.q0;
import com.planner5d.library.widget.TextInputEditTextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
public final class e extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final b f131490m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f131491n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f131492o = "DELETE MY DATA";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Activity f131493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f131494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b2 f131495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m0 f131496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.util.navigation.uiview.c f131497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final t7 f131498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private Button f131499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private TextInputEditTextCompat f131500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private TextInputLayout f131501l;

    public static final class a implements q0.g<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.a f131502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f131503b;

        a(id.a aVar, e eVar) {
            this.f131502a = aVar;
            this.f131503b = eVar;
        }

        @Override // com.planner5d.library.services.q0.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            if (this.f131502a != null || Intrinsics.areEqual(e.f131492o, str)) {
                return null;
            }
            return this.f131503b.f131493d.getString(com.planner5d.library.f.s.Db);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends com.planner5d.library.services.rx.e<Void> {
        c() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            e.this.s();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Activity activity, @NotNull ViewDataRemoval view, @NotNull com.planner5d.library.widget.preloader.t preloader, @NotNull t userAuthorization, @NotNull b2 messageManager, @NotNull m0 userPrivateData, @NotNull com.planner5d.library.util.navigation.uiview.c appUiView) {
        super(preloader);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(preloader, "preloader");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(userPrivateData, "userPrivateData");
        Intrinsics.checkNotNullParameter(appUiView, "appUiView");
        this.f131493d = activity;
        this.f131494e = userAuthorization;
        this.f131495f = messageManager;
        this.f131496g = userPrivateData;
        this.f131497h = appUiView;
        t7 t7VarA = t7.a(view);
        Intrinsics.checkNotNullExpressionValue(t7VarA, "bind(...)");
        this.f131498i = t7VarA;
        MaterialButton buttonDelete = t7VarA.f159715b;
        Intrinsics.checkNotNullExpressionValue(buttonDelete, "buttonDelete");
        this.f131499j = buttonDelete;
        TextInputEditTextCompat inputPersonalDataRemoval = t7VarA.f159717d;
        Intrinsics.checkNotNullExpressionValue(inputPersonalDataRemoval, "inputPersonalDataRemoval");
        this.f131500k = inputPersonalDataRemoval;
        TextInputLayout inputPersonalDataRemovalLayout = t7VarA.f159718e;
        Intrinsics.checkNotNullExpressionValue(inputPersonalDataRemovalLayout, "inputPersonalDataRemovalLayout");
        this.f131501l = inputPersonalDataRemovalLayout;
        k(this.f131499j);
        l(this.f131500k);
        id.a aVarA = userAuthorization.a();
        if (aVarA != null ? Intrinsics.areEqual(aVarA.f287086l, Boolean.TRUE) : false) {
            this.f131501l.setEndIconDrawable(j.a.b(activity, com.planner5d.library.f.h.T9));
            this.f131501l.setEndIconMode(1);
            this.f131500k.setInputType(129);
        } else {
            this.f131501l.setEndIconDrawable((Drawable) null);
            this.f131501l.setEndIconMode(0);
            this.f131500k.setInputType(1);
        }
        String string = aVarA != null ? Intrinsics.areEqual(aVarA.f287086l, Boolean.TRUE) : false ? activity.getString(com.planner5d.library.f.s.Vd) : "\"DELETE MY DATA\"";
        Intrinsics.checkNotNull(string);
        TextInputLayout textInputLayout = this.f131500k.getTextInputLayout();
        if (textInputLayout != null) {
            textInputLayout.setHelperText(activity.getString(com.planner5d.library.f.s.Ud, string));
        }
        this.f131500k.i(new q0.f(activity));
        this.f131500k.i(new a(aVarA, this));
        view.setup(activity);
    }

    @Override // com.planner5d.library.activity.form.d
    protected void d(@Nullable Throwable th2) {
        String message;
        ErrorMessageException errorMessageException;
        String message2;
        b2 b2Var = this.f131495f;
        if (th2 instanceof ErrorMessageException) {
            errorMessageException = (ErrorMessageException) th2;
        } else if (th2 == null || (message2 = th2.getMessage()) == null || !StringsKt.V2(message2, "Bad user or password", false, 2, null)) {
            int i10 = com.planner5d.library.f.s.f168981a9;
            if (th2 == null || (message = th2.getMessage()) == null) {
                message = com.planner5d.library.model.payments.a.f222474i;
            }
            errorMessageException = new ErrorMessageException(i10, message);
        } else {
            errorMessageException = new ErrorMessageException(com.planner5d.library.f.s.f169513w9, new String[0]);
        }
        b2Var.r(errorMessageException);
    }

    @Override // com.planner5d.library.activity.form.d
    protected void f() {
        this.f131500k.setText("");
        this.f131499j.setEnabled(false);
        this.f131497h.c();
        n(com.planner5d.library.f.s.f169557y5, new c());
    }

    @Override // com.planner5d.library.activity.form.d
    protected boolean h() {
        boolean zValidate = this.f131500k.validate();
        this.f131499j.setEnabled(zValidate);
        return zValidate;
    }

    @Override // com.planner5d.library.activity.form.d
    @NotNull
    protected Observable<?> o() {
        m0 m0Var = this.f131496g;
        Activity activity = this.f131493d;
        id.a aVarA = this.f131494e.a();
        String textAsString = this.f131500k.getTextAsString();
        return m0Var.j(activity, aVarA, textAsString != null ? StringsKt.E5(textAsString).toString() : null);
    }

    public final void s() {
        Intent launchIntentForPackage = this.f131493d.getPackageManager().getLaunchIntentForPackage(this.f131493d.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        launchIntentForPackage.addFlags(335577088);
        this.f131493d.startActivity(launchIntentForPackage);
        Runtime.getRuntime().exit(0);
    }
}
