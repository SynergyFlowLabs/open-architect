package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import com.planner5d.library.widget.EditTextWithValidator;

/* JADX INFO: loaded from: classes12.dex */
public class y extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditTextWithValidator f254707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageView f254708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v.e f254709c;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            y.this.f254708b.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
            if (y.this.f254709c != null) {
                y.this.f254709c.a(charSequence.toString());
            }
        }
    }

    public y(@NonNull Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.f254707a.setText("");
    }

    public boolean d() {
        return this.f254707a.getText().toString().isEmpty();
    }

    public EditTextWithValidator getSearchInput() {
        return this.f254707a;
    }

    void setOnSearchListener(v.e eVar) {
        this.f254709c = eVar;
        if (eVar == null) {
            this.f254707a.setText("");
            com.planner5d.library.services.s.f(this.f254707a, false);
        }
    }

    void setQuery(String str) {
        this.f254707a.setText(str);
        this.f254707a.setSelection(str.length());
    }

    public y(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public y(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        this(context, attributeSet, i10, 0);
    }

    public y(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        super(context, attributeSet, i10, i11);
        this.f254709c = null;
        View.inflate(getContext(), com.planner5d.library.f.m.f168699g6, this);
        ImageView imageView = (ImageView) findViewById(com.planner5d.library.f.j.f168201l5);
        this.f254708b = imageView;
        Drawable drawableA = com.planner5d.library.widget.drawable.c.f254258a.a(context, com.planner5d.library.f.h.f167702o7, null);
        if (drawableA != null) {
            drawableA.setBounds(new Rect(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), imageView.getPaddingBottom()));
        }
        imageView.setImageDrawable(drawableA);
        EditTextWithValidator editTextWithValidator = (EditTextWithValidator) findViewById(com.planner5d.library.f.j.f168427ue);
        this.f254707a = editTextWithValidator;
        editTextWithValidator.setImeOptions(301989888);
        editTextWithValidator.addTextChangedListener(new a());
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f254706a.e(view);
            }
        });
    }
}
