package io.sentry.android.core;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class l2 extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private View.OnClickListener f304383a;

    public l2(Context context) throws Exception {
        super(context);
        b(context, null, 0, 0);
    }

    public static /* synthetic */ void a(l2 l2Var, View view) {
        new p2.a(l2Var.getContext()).c().show();
        View.OnClickListener onClickListener = l2Var.f304383a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @e.a({"SetTextI18n"})
    private void b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) throws Exception {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.d.f304070a, i10, i11);
        try {
            float f10 = context.getResources().getDisplayMetrics().density;
            float dimension = typedArrayObtainStyledAttributes.getDimension(a2.d.f304075f, -1.0f);
            int i12 = 5 & (-1);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(a2.d.f304077h, -1);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(a2.d.f304076g, false);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(a2.d.f304072c, -1);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(a2.d.f304073d, -1.0f);
            int color = typedArrayObtainStyledAttributes.getColor(a2.d.f304071b, -1);
            String string = typedArrayObtainStyledAttributes.getString(a2.d.f304074e);
            if (dimension == -1.0f) {
                setCompoundDrawablePadding((int) (4.0f * f10));
            }
            if (resourceId == -1) {
                setCompoundDrawablesRelativeWithIntrinsicBounds(a2.a.f304057d, 0, 0, 0);
            }
            setAllCaps(z10);
            if (resourceId2 == -1) {
                setBackgroundResource(a2.a.f304056c);
            }
            if (dimension2 == -1.0f) {
                int i13 = (int) (f10 * 12.0f);
                setPadding(i13, i13, i13, i13);
            }
            if (color == -1) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
                setTextColor(context.getResources().getColor(typedValue.resourceId, context.getTheme()));
            }
            if (string == null) {
                setText("Report a Bug");
            }
            androidx.documentfile.provider.b.a(typedArrayObtainStyledAttributes);
            setOnClickListener(this.f304383a);
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    androidx.documentfile.provider.b.a(typedArrayObtainStyledAttributes);
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f304383a = onClickListener;
        super.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l2.a(this.f304377a, view);
            }
        });
    }

    public l2(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        b(context, attributeSet, 0, 0);
    }

    public l2(Context context, AttributeSet attributeSet, int i10) throws Exception {
        super(context, attributeSet, i10);
        b(context, attributeSet, i10, 0);
    }

    public l2(Context context, AttributeSet attributeSet, int i10, int i11) throws Exception {
        super(context, attributeSet, i10, i11);
        b(context, attributeSet, i10, i11);
    }
}
