package com.planner5d.library.activity.form;

import android.content.Context;
import android.widget.Button;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.settings.ViewPromoCode;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.o0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.preloader.t;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
public final class h extends d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f131516k = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f131517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final o0 f131518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final id.a f131519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final b2 f131520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private Button f131521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private TextInputEditTextCompat f131522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Pair<String, String> f131523j;

    public static final class a implements q0.g<String> {
        a() {
        }

        @Override // com.planner5d.library.services.q0.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            Pair pair = h.this.f131523j;
            if (pair == null || !Intrinsics.areEqual(pair.getFirst(), str)) {
                return null;
            }
            return (String) pair.getSecond();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.form.FormPromoCodes$submit$1", f = "FormPromoCodes.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131525a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131525a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0 o0Var = h.this.f131518e;
                id.a aVar = h.this.f131519f;
                String textAsString = h.this.f131522i.getTextAsString();
                this.f131525a = 1;
                if (o0Var.c(aVar, textAsString, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @NotNull ViewPromoCode view, @NotNull t preloader, @NotNull o0 userPromoCodeManager, @NotNull id.a user, @NotNull b2 messageManager) {
        super(preloader);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(preloader, "preloader");
        Intrinsics.checkNotNullParameter(userPromoCodeManager, "userPromoCodeManager");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f131517d = context;
        this.f131518e = userPromoCodeManager;
        this.f131519f = user;
        this.f131520g = messageManager;
        this.f131521h = view.getButton();
        this.f131522i = view.getInput();
        k(this.f131521h);
        this.f131521h.setEnabled(false);
        l(this.f131522i);
        this.f131522i.i(new q0.f(context));
        this.f131522i.i(new a());
    }

    @Override // com.planner5d.library.activity.form.d
    protected void d(@Nullable Throwable th2) {
        this.f131523j = null;
        if ((th2 instanceof ErrorMessageException) && ErrorMessageException.isWithCode(th2, com.planner5d.library.f.s.f169369qa, com.planner5d.library.f.s.f169393ra, com.planner5d.library.f.s.f169345pa)) {
            this.f131523j = TuplesKt.to(this.f131522i.getTextAsString(), ErrorMessageException.getError(this.f131517d, (ErrorMessageException) th2));
            h();
        } else {
            b2 b2Var = this.f131520g;
            if (th2 == null) {
                th2 = new ErrorMessageException(com.planner5d.library.f.s.f169250lb, new String[0]);
            }
            b2Var.c(th2);
        }
    }

    @Override // com.planner5d.library.activity.form.d
    protected void f() {
        this.f131522i.setText("");
        this.f131521h.setEnabled(false);
        m(com.planner5d.library.f.s.ow);
    }

    @Override // com.planner5d.library.activity.form.d
    protected boolean h() {
        boolean zValidate = this.f131522i.validate();
        this.f131521h.setEnabled(zValidate);
        return zValidate;
    }

    @Override // com.planner5d.library.activity.form.d
    @NotNull
    protected Observable<Unit> o() {
        return c0.F(c0.f225068a, null, new b(null), 1, null);
    }
}
