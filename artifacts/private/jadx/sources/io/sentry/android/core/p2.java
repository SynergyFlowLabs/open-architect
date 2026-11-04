package io.sentry.android.core;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import io.sentry.n8;
import io.sentry.t5;
import io.sentry.t7;
import io.sentry.w7;
import io.sentry.y7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class p2 extends AlertDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f304426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.v f304427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final io.sentry.protocol.v f304428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private DialogInterface.OnDismissListener f304429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final b f304430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final t7.b f304431f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        b f304432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        t7.b f304433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        io.sentry.protocol.v f304434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        final Context f304435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f304436e;

        public a(@NotNull Context context) {
            this(context, 0);
        }

        public a a(@Nullable io.sentry.protocol.v vVar) {
            this.f304434c = vVar;
            return this;
        }

        public a b(@Nullable t7.b bVar) {
            this.f304433b = bVar;
            return this;
        }

        public p2 c() {
            return new p2(this.f304435d, this.f304436e, this.f304434c, this.f304432a, this.f304433b);
        }

        public a(Context context, int i10) {
            this(context, i10, null);
        }

        public a(@NotNull Context context, @Nullable b bVar) {
            this(context, 0, bVar);
        }

        public a(@NotNull Context context, int i10, @Nullable b bVar) {
            this.f304435d = context;
            this.f304436e = i10;
            this.f304432a = bVar;
        }
    }

    public interface b {
        void a(@NotNull Context context, @NotNull t7 t7Var);
    }

    p2(@NotNull Context context, int i10, @Nullable io.sentry.protocol.v vVar, @Nullable b bVar, @Nullable t7.b bVar2) {
        super(context, i10);
        this.f304426a = false;
        this.f304428c = vVar;
        this.f304430e = bVar;
        this.f304431f = bVar2;
        w7.e().a("UserFeedbackWidget");
    }

    public static /* synthetic */ void b(p2 p2Var, Runnable runnable, DialogInterface dialogInterface) {
        p2Var.getClass();
        runnable.run();
        p2Var.f304427b = null;
        DialogInterface.OnDismissListener onDismissListener = p2Var.f304429d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static /* synthetic */ void c(p2 p2Var, EditText editText, EditText editText2, EditText editText3, t7 t7Var, TextView textView, TextView textView2, TextView textView3, View view) {
        p2Var.getClass();
        String strTrim = editText.getText().toString().trim();
        String strTrim2 = editText2.getText().toString().trim();
        String strTrim3 = editText3.getText().toString().trim();
        if (strTrim.isEmpty() && t7Var.r()) {
            editText.setError(textView.getText());
            return;
        }
        if (strTrim2.isEmpty() && t7Var.q()) {
            editText2.setError(textView2.getText());
            return;
        }
        if (strTrim3.isEmpty()) {
            editText3.setError(textView3.getText());
            return;
        }
        io.sentry.protocol.f fVar = new io.sentry.protocol.f(strTrim3);
        fVar.p(strTrim);
        fVar.n(strTrim2);
        io.sentry.protocol.v vVar = p2Var.f304428c;
        if (vVar != null) {
            fVar.m(vVar);
        }
        io.sentry.protocol.v vVar2 = p2Var.f304427b;
        if (vVar2 != null) {
            fVar.q(vVar2);
        }
        if (t5.v(fVar).equals(io.sentry.protocol.v.f306474b)) {
            t7.c cVarM = t7Var.m();
            if (cVarM != null) {
                cVarM.a(fVar);
            }
        } else {
            Toast.makeText(p2Var.getContext(), t7Var.p(), 0).show();
            t7.c cVarN = t7Var.n();
            if (cVarN != null) {
                cVarN.a(fVar);
            }
        }
        p2Var.cancel();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        io.sentry.protocol.g0 g0VarG;
        super.onCreate(bundle);
        setContentView(a2.c.f304069a);
        setCancelable(this.f304426a);
        final t7 t7Var = new t7(t5.R().b().getFeedbackOptions());
        b bVar = this.f304430e;
        if (bVar != null) {
            bVar.a(getContext(), t7Var);
        }
        t7.b bVar2 = this.f304431f;
        if (bVar2 != null) {
            bVar2.a(t7Var);
        }
        TextView textView = (TextView) findViewById(a2.b.f304065h);
        ImageView imageView = (ImageView) findViewById(a2.b.f304064g);
        final TextView textView2 = (TextView) findViewById(a2.b.f304068k);
        final EditText editText = (EditText) findViewById(a2.b.f304062e);
        final TextView textView3 = (TextView) findViewById(a2.b.f304067j);
        final EditText editText2 = (EditText) findViewById(a2.b.f304061d);
        final TextView textView4 = (TextView) findViewById(a2.b.f304066i);
        final EditText editText3 = (EditText) findViewById(a2.b.f304060c);
        Button button = (Button) findViewById(a2.b.f304059b);
        Button button2 = (Button) findViewById(a2.b.f304058a);
        if (t7Var.s()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (t7Var.u() || t7Var.r()) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText(t7Var.i());
            editText.setHint(t7Var.j());
            if (t7Var.r()) {
                textView2.append(t7Var.f());
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (t7Var.t() || t7Var.q()) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText(t7Var.c());
            editText2.setHint(t7Var.d());
            if (t7Var.q()) {
                textView3.append(t7Var.f());
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (t7Var.v() && (g0VarG = t5.R().getScope().G()) != null) {
            editText.setText(g0VarG.o());
            editText2.setText(g0VarG.j());
        }
        textView4.setText(t7Var.g());
        textView4.append(t7Var.f());
        editText3.setHint(t7Var.h());
        textView.setText(t7Var.e());
        button.setText(t7Var.o());
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.c(this.f304389a, editText, editText2, editText3, t7Var, textView2, textView3, textView4, view);
            }
        });
        button2.setText(t7Var.a());
        button2.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f304406a.cancel();
            }
        });
        setOnDismissListener(this.f304429d);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        n8 n8VarB = t5.R().b();
        Runnable runnableL = n8VarB.getFeedbackOptions().l();
        if (runnableL != null) {
            runnableL.run();
        }
        n8VarB.getReplayController().l(Boolean.FALSE);
        this.f304427b = n8VarB.getReplayController().t();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        this.f304426a = z10;
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f304429d = onDismissListener;
        final Runnable runnableK = t5.R().b().getFeedbackOptions().k();
        if (runnableK != null) {
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.o2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    p2.b(this.f304417a, runnableK, dialogInterface);
                }
            });
        } else {
            super.setOnDismissListener(this.f304429d);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        io.sentry.i1 i1VarR = t5.R();
        n8 n8VarB = i1VarR.b();
        if (i1VarR.isEnabled() && n8VarB.isEnabled()) {
            super.show();
        } else {
            n8VarB.getLogger().c(y7.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
