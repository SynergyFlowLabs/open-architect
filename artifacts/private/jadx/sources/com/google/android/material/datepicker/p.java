package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class p extends BaseAdapter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f112490g = v.x().getMaximum(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f112491h = (v.x().getMaximum(5) + v.x().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f112492i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Month f112493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final DateSelector<?> f112494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection<Long> f112495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    b f112496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final CalendarConstraints f112497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    final DayViewDecorator f112498f;

    p(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @p0 DayViewDecorator dayViewDecorator) {
        this.f112493a = month;
        this.f112494b = dateSelector;
        this.f112497e = calendarConstraints;
        this.f112498f = dayViewDecorator;
        this.f112495c = dateSelector.N2();
    }

    private String c(Context context, long j10) {
        return h.e(context, j10, l(j10), k(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f112496d == null) {
            this.f112496d = new b(context);
        }
    }

    private boolean j(long j10) {
        Iterator<Long> it = this.f112494b.N2().iterator();
        while (it.hasNext()) {
            if (v.a(j10) == v.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j10) {
        return v.v().getTimeInMillis() == j10;
    }

    private void o(@p0 TextView textView, long j10, int i10) {
        boolean zJ;
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zD = this.f112497e.h().d(j10);
        if (zD) {
            textView.setEnabled(true);
            zJ = j(j10);
            textView.setSelected(zJ);
            if (zJ) {
                aVar = this.f112496d.f112366b;
            } else {
                aVar = l(j10) ? this.f112496d.f112367c : this.f112496d.f112365a;
            }
        } else {
            zJ = false;
            textView.setEnabled(false);
            aVar = this.f112496d.f112371g;
        }
        boolean z10 = zJ;
        DayViewDecorator dayViewDecorator = this.f112498f;
        if (dayViewDecorator == null || i10 == -1) {
            aVar.f(textView);
            return;
        }
        Month month = this.f112493a;
        int i11 = month.f112332c;
        int i12 = month.f112331b;
        aVar.g(textView, dayViewDecorator.a(context, i11, i12, i10, zD, z10), this.f112498f.h(context, i11, i12, i10, zD, z10));
        textView.setCompoundDrawables(this.f112498f.c(context, i11, i12, i10, zD, z10), this.f112498f.f(context, i11, i12, i10, zD, z10), this.f112498f.e(context, i11, i12, i10, zD, z10), this.f112498f.b(context, i11, i12, i10, zD, z10));
        textView.setContentDescription(this.f112498f.g(context, i11, i12, i10, zD, z10, strC));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.e(j10).equals(this.f112493a)) {
            int iO = this.f112493a.o(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iO) - materialCalendarGridView.getFirstVisiblePosition()), j10, iO);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f112493a.l(this.f112497e.k());
    }

    @Override // android.widget.Adapter
    @p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f112493a.n(n(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    @Override // android.widget.Adapter
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i10, @p0 View view, @NonNull ViewGroup viewGroup) {
        int i11;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(r6.a.k.f360927u0, viewGroup, false);
        }
        int iB = i10 - b();
        if (iB >= 0) {
            Month month = this.f112493a;
            if (iB >= month.f112334e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iB + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.f114319i, Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i11 = -1;
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        o(textView, item.longValue(), i11);
        return textView;
    }

    @l1
    boolean g(long j10) {
        Iterator<androidx.core.util.p<Long, Long>> it = this.f112494b.C3().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f48412b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f112491h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f112493a.f112333d;
    }

    boolean h(int i10) {
        return i10 % this.f112493a.f112333d == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i10) {
        return (i10 + 1) % this.f112493a.f112333d == 0;
    }

    @l1
    boolean k(long j10) {
        Iterator<androidx.core.util.p<Long, Long>> it = this.f112494b.C3().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f48411a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.f112493a.f112334e) - 1;
    }

    int n(int i10) {
        return (i10 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f112495c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f112494b;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.N2().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f112495c = this.f112494b.N2();
        }
    }

    boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
