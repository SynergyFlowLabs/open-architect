package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP, b1.a.TESTS})
public class n extends DatePickerDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f112479c = 16843612;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g1
    private static final int f112480d = r6.a.n.R4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Drawable f112481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Rect f112482b;

    public n(@NonNull Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f112481a);
        getWindow().getDecorView().setOnTouchListener(new v6.a(this, this.f112482b));
    }

    public n(@NonNull Context context, int i10) {
        this(context, i10, null, -1, -1, -1);
    }

    public n(@NonNull Context context, @p0 DatePickerDialog.OnDateSetListener onDateSetListener, int i10, int i11, int i12) {
        this(context, 0, onDateSetListener, i10, i11, i12);
    }

    public n(@NonNull Context context, int i10, @p0 DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13) {
        super(context, i10, onDateSetListener, i11, i12, i13);
        Context context2 = getContext();
        int iG = com.google.android.material.resources.b.g(getContext(), r6.a.c.f359214e4, getClass().getCanonicalName());
        int i14 = f112480d;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context2, null, 16843612, i14);
        kVar.p0(ColorStateList.valueOf(iG));
        Rect rectA = v6.c.a(context2, 16843612, i14);
        this.f112482b = rectA;
        this.f112481a = v6.c.b(kVar, rectA);
    }
}
