package com.planner5d.library.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes12.dex */
@e.a({"AppCompatCustomView"})
public class EditTextWithValidator extends EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f249445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f249446b;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (EditTextWithValidator.this.f249445a != null) {
                EditTextWithValidator.this.f249445a.validate();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public interface b {
        boolean validate();
    }

    public EditTextWithValidator(Context context) {
        super(context);
        this.f249445a = null;
        this.f249446b = true;
        addTextChangedListener(new a());
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.widget.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f258858a.c(view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view, boolean z10) {
        if (z10) {
            com.planner5d.library.services.s.f(this, true);
        } else {
            if (view.findFocus() instanceof EditText) {
                return;
            }
            com.planner5d.library.services.s.f(this, false);
        }
    }

    public void d(boolean z10, @androidx.annotation.l int i10) {
        if (z10) {
            i10 = l1.a.f316127c;
        }
        setTextColor(i10);
    }

    public EditTextWithValidator e(b bVar) {
        this.f249445a = bVar;
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        return this.f249446b && super.onDragEvent(dragEvent);
    }

    public void setDragEnabled(boolean z10) {
        this.f249446b = z10;
    }

    public void setError(boolean z10) {
        d(z10, -16777216);
    }

    public EditTextWithValidator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249445a = null;
        this.f249446b = true;
        addTextChangedListener(new a());
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.widget.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f258858a.c(view, z10);
            }
        });
    }

    public EditTextWithValidator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f249445a = null;
        this.f249446b = true;
        addTextChangedListener(new a());
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.widget.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f258858a.c(view, z10);
            }
        });
    }
}
