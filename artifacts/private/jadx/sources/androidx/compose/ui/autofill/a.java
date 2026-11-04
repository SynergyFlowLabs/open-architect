package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.runtime.internal.w0;
import kotlin.a0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@androidx.annotation.w0(26)
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n91#2,5:149\n26#3:154\n26#3:155\n26#3:156\n26#3:157\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n*L\n53#1:149,5\n67#1:154\n68#1:155\n69#1:156\n70#1:157\n*E\n"})
public final class a implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36955e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f36956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q f36957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AutofillManager f36958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private AutofillId f36959d;

    public a(@NotNull View view, @NotNull q qVar) {
        this.f36956a = view;
        this.f36957b = qVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f36958c = autofillManager;
        view.setImportantForAutofill(1);
        androidx.compose.ui.platform.coreshims.a aVarA = androidx.compose.ui.platform.coreshims.c.a(view);
        AutofillId autofillIdA = aVarA != null ? aVarA.a() : null;
        if (autofillIdA != null) {
            this.f36959d = autofillIdA;
        } else {
            s0.a.j("Required value was null.");
            throw new a0();
        }
    }

    @Override // androidx.compose.ui.autofill.h
    public void a(@NotNull o oVar) {
        n0.j jVarE = oVar.e();
        if (jVarE == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.f36958c.notifyViewEntered(this.f36956a, oVar.f(), new Rect(Math.round(jVarE.t()), Math.round(jVarE.B()), Math.round(jVarE.x()), Math.round(jVarE.j())));
    }

    @Override // androidx.compose.ui.autofill.h
    public void b(@NotNull o oVar) {
        this.f36958c.notifyViewExited(this.f36956a, oVar.f());
    }

    @NotNull
    public final AutofillManager c() {
        return this.f36958c;
    }

    @NotNull
    public final q d() {
        return this.f36957b;
    }

    @NotNull
    public final AutofillId e() {
        return this.f36959d;
    }

    @NotNull
    public final View f() {
        return this.f36956a;
    }

    public final void g(@NotNull AutofillId autofillId) {
        this.f36959d = autofillId;
    }
}
