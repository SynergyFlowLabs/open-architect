package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.compose.ui.platform.s;
import androidx.core.view.u1;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.f0;
import com.google.android.material.internal.p0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chip f114270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f114271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EditText f114272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextWatcher f114273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f114274e;

    private class b extends f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f114275b = "00";

        private b() {
        }

        @Override // com.google.android.material.internal.f0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f114270a.setText(ChipTextInputComboView.this.d(f114275b));
                return;
            }
            String strD = ChipTextInputComboView.this.d(editable);
            Chip chip = ChipTextInputComboView.this.f114270a;
            if (TextUtils.isEmpty(strD)) {
                strD = ChipTextInputComboView.this.d(f114275b);
            }
            chip.setText(strD);
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    private void k() {
        this.f114272c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f114272c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f114272c.setFilters(inputFilterArr);
    }

    @l1
    CharSequence e() {
        return this.f114270a.getText();
    }

    public TextInputLayout f() {
        return this.f114271b;
    }

    public void g(androidx.core.view.a aVar) {
        u1.G1(this.f114270a, aVar);
    }

    public void h(boolean z10) {
        this.f114272c.setCursorVisible(z10);
    }

    public void i(CharSequence charSequence) {
        this.f114274e.setText(charSequence);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f114270a.isChecked();
    }

    public void j(CharSequence charSequence) {
        String strD = d(charSequence);
        this.f114270a.setText(strD);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        this.f114272c.removeTextChangedListener(this.f114273d);
        this.f114272c.setText(strD);
        this.f114272c.addTextChangedListener(this.f114273d);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f114270a.setChecked(z10);
        this.f114272c.setVisibility(z10 ? 0 : 4);
        this.f114270a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            p0.y(this.f114272c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f114270a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f114270a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f114270a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(r6.a.k.f360903i0, (ViewGroup) this, false);
        this.f114270a = chip;
        chip.setAccessibilityClassName(s.S);
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(r6.a.k.f360905j0, (ViewGroup) this, false);
        this.f114271b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f114272c = editText;
        editText.setVisibility(4);
        int i11 = 3 >> 0;
        b bVar = new b();
        this.f114273d = bVar;
        editText.addTextChangedListener(bVar);
        k();
        addView(chip);
        addView(textInputLayout);
        this.f114274e = (TextView) findViewById(r6.a.h.L2);
        editText.setId(u1.D());
        u1.d2(this.f114274e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
