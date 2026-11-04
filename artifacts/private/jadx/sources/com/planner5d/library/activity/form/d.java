package com.planner5d.library.activity.form;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.f1;
import androidx.annotation.p0;
import com.planner5d.library.widget.EditTextWithValidator;
import com.planner5d.library.widget.preloader.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f131485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f1
    private final int f131486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f131487c;

    class a extends com.planner5d.library.services.rx.e<Object> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            d.this.e(false);
            d.this.h();
            d.this.d(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            d.this.e(false);
            d.this.f();
        }
    }

    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d.this.h();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    d(t tVar) {
        this(tVar, com.planner5d.library.f.s.ZD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z10) {
        this.f131487c.set(z10);
        if (z10) {
            this.f131485a.a().a(this.f131486b, true);
        } else {
            this.f131485a.a().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean j(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6 || !h()) {
            return false;
        }
        q();
        int i11 = 2 ^ 1;
        return true;
    }

    private Observable<?> p() {
        return h() ? o() : Observable.error(new Exception("Form is invalid"));
    }

    private void q() {
        e(true);
        p().observeOn(com.planner5d.library.services.rx.c.f224934d).delaySubscription(1L, TimeUnit.SECONDS).subscribe((Subscriber<? super Object>) new a());
    }

    abstract void d(@p0 Throwable th2);

    abstract void f();

    public boolean g() {
        return this.f131487c.get();
    }

    abstract boolean h();

    void k(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.form.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f131482a.i(view2);
            }
        });
    }

    void l(EditText editText) {
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.planner5d.library.activity.form.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return this.f131483a.j(textView, i10, keyEvent);
            }
        });
        if (editText instanceof EditTextWithValidator) {
            ((EditTextWithValidator) editText).e(new EditTextWithValidator.b() { // from class: com.planner5d.library.activity.form.c
                @Override // com.planner5d.library.widget.EditTextWithValidator.b
                public final boolean validate() {
                    return this.f131484a.h();
                }
            });
        }
        editText.addTextChangedListener(new b());
    }

    void m(@f1 int i10) {
        n(i10, new com.planner5d.library.services.rx.e());
    }

    void n(@f1 int i10, Subscriber<Void> subscriber) {
        this.f131485a.a().r(i10, false).subscribe((Subscriber<? super Void>) subscriber);
    }

    abstract Observable<?> o();

    d(t tVar, @f1 int i10) {
        this.f131487c = new AtomicBoolean();
        this.f131485a = tVar == null ? new t() : tVar;
        this.f131486b = i10;
    }
}
