package com.planner5d.library.activity.form;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.p0;
import com.planner5d.library.activity.helper.j2;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.m0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.widget.EditTextWithValidator;
import rx.Observable;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(since = "should be rewritten to newest version of FormDataRemoval")
public class g extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Button f131507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EditTextWithValidator f131508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f131509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m0 f131510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final id.a f131511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b2 f131512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f131513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Activity f131514k;

    class a extends com.planner5d.library.services.rx.e<Void> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            g.this.f131513j.run();
        }
    }

    public g(final Activity activity, View view, com.planner5d.library.widget.preloader.t tVar, b2 b2Var, t tVar2, id.a aVar, Button button, Button button2, TextView textView, Runnable runnable, m0 m0Var, final m2 m2Var, j2 j2Var) {
        super(tVar);
        this.f131514k = activity;
        this.f131513j = runnable;
        this.f131512i = b2Var;
        this.f131509f = tVar2;
        this.f131510g = m0Var;
        EditTextWithValidator editTextWithValidator = (EditTextWithValidator) view.findViewById(com.planner5d.library.f.j.f168186ke);
        this.f131508e = editTextWithValidator;
        l(editTextWithValidator);
        this.f131507d = button;
        k(button);
        button2.setVisibility(0);
        button2.setText(com.planner5d.library.f.s.f169342p7);
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.form.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m2Var.a(activity, com.planner5d.library.api.f.a().f142275m);
            }
        });
        button.setText(com.planner5d.library.f.s.Lz);
        textView.setText(com.planner5d.library.f.s.Nz);
        textView.setVisibility(0);
        com.planner5d.library.services.textspan.b.j(activity, (TextView) view.findViewById(com.planner5d.library.f.j.hq), com.planner5d.library.f.s.Mz, j2Var);
        this.f131511h = aVar;
        String string = aVar == null ? "\"DELETE MY DATA\"" : activity.getString(com.planner5d.library.f.s.Vd);
        ((TextView) view.findViewById(com.planner5d.library.f.j.f168330qe)).setText(activity.getString(com.planner5d.library.f.s.Ud, string));
        editTextWithValidator.setHint(activity.getString(com.planner5d.library.f.s.Td, string));
        if (aVar != null) {
            editTextWithValidator.setInputType(128);
        }
        button.setClickable(false);
        h();
    }

    @Override // com.planner5d.library.activity.form.d
    protected void d(@p0 Throwable th2) {
        b2 b2Var = this.f131512i;
        if (!(th2 instanceof ErrorMessageException)) {
            th2 = new ErrorMessageException(com.planner5d.library.f.s.f168981a9, th2 == null ? com.planner5d.library.model.payments.a.f222474i : th2.getMessage());
        }
        b2Var.c(th2);
    }

    @Override // com.planner5d.library.activity.form.d
    protected void f() {
        this.f131508e.setText("");
        n(com.planner5d.library.f.s.f169557y5, new a());
    }

    @Override // com.planner5d.library.activity.form.d
    protected boolean h() {
        boolean z10 = false;
        if (this.f131508e.getText().length() > 0 && (this.f131511h != null || e.f131492o.equals(this.f131508e.getText().toString().trim()))) {
            z10 = true;
        }
        this.f131508e.setError(!z10);
        this.f131507d.setClickable(z10);
        Button button = this.f131507d;
        button.setTextColor(androidx.core.content.d.g(button.getContext(), z10 ? com.planner5d.library.f.C1549f.f166437ic : com.planner5d.library.f.C1549f.O1));
        return z10;
    }

    @Override // com.planner5d.library.activity.form.d
    protected Observable<?> o() {
        return this.f131510g.j(this.f131514k, this.f131511h, this.f131508e.getText().toString().trim());
    }
}
