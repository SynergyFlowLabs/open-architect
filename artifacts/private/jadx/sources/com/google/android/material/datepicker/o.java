package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.p0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o<S> extends s<S> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f112483e = "THEME_RES_ID_KEY";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f112484f = "DATE_SELECTOR_KEY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f112485g = "CALENDAR_CONSTRAINTS_KEY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g1
    private int f112486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private DateSelector<S> f112487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private CalendarConstraints f112488d;

    class a extends r<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            Iterator<r<S>> it = o.this.f112508a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.r
        public void b(S s10) {
            Iterator<r<S>> it = o.this.f112508a.iterator();
            while (it.hasNext()) {
                it.next().b(s10);
            }
        }
    }

    @NonNull
    static <T> o<T> x(DateSelector<T> dateSelector, @g1 int i10, @NonNull CalendarConstraints calendarConstraints) {
        o<T> oVar = new o<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f112483e, i10);
        bundle.putParcelable(f112484f, dateSelector);
        bundle.putParcelable(f112485g, calendarConstraints);
        oVar.setArguments(bundle);
        return oVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f112486b = bundle.getInt(f112483e);
        this.f112487c = (DateSelector) bundle.getParcelable(f112484f);
        this.f112488d = (CalendarConstraints) bundle.getParcelable(f112485g);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        return this.f112487c.E2(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f112486b)), viewGroup, bundle, this.f112488d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f112483e, this.f112486b);
        bundle.putParcelable(f112484f, this.f112487c);
        bundle.putParcelable(f112485g, this.f112488d);
    }

    @Override // com.google.android.material.datepicker.s
    @NonNull
    public DateSelector<S> v() {
        DateSelector<S> dateSelector = this.f112487c;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }
}
