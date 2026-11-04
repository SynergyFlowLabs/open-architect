package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class i extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f112387d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f112388e = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Calendar f112389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f112390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f112391c;

    public i() {
        Calendar calendarX = v.x();
        this.f112389a = calendarX;
        this.f112390b = calendarX.getMaximum(7);
        this.f112391c = calendarX.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f112391c;
        int i12 = this.f112390b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    @p0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f112390b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f112390b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @e.a({"WrongConstant"})
    @p0
    public View getView(int i10, @p0 View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(r6.a.k.f360929v0, viewGroup, false);
        }
        this.f112389a.set(7, b(i10));
        textView.setText(this.f112389a.getDisplayName(7, f112388e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(r6.a.m.f360986m1), this.f112389a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i10) {
        Calendar calendarX = v.x();
        this.f112389a = calendarX;
        this.f112390b = calendarX.getMaximum(7);
        this.f112391c = i10;
    }
}
