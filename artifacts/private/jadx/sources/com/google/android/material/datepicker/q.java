package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
class q extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CalendarConstraints f112499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DateSelector<?> f112500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final DayViewDecorator f112501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j.m f112502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f112503e;

    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f112504a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f112504a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f112504a.getAdapter().r(i10)) {
                q.this.f112502d.a(this.f112504a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final TextView f112506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MaterialCalendarGridView f112507b;

        b(@NonNull LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(r6.a.h.f360651e3);
            this.f112506a = textView;
            u1.H1(textView, true);
            this.f112507b = (MaterialCalendarGridView) linearLayout.findViewById(r6.a.h.Z2);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    q(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, @p0 DayViewDecorator dayViewDecorator, j.m mVar) {
        Month monthO = calendarConstraints.o();
        Month monthI = calendarConstraints.i();
        Month monthM = calendarConstraints.m();
        if (monthO.compareTo(monthM) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthM.compareTo(monthI) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f112503e = (p.f112490g * j.J(context)) + (l.Y(context) ? j.J(context) : 0);
        this.f112499a = calendarConstraints;
        this.f112500b = dateSelector;
        this.f112501c = dayViewDecorator;
        this.f112502d = mVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f112499a.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f112499a.o().r(i10).q();
    }

    @NonNull
    Month i(int i10) {
        return this.f112499a.o().r(i10);
    }

    @NonNull
    CharSequence j(int i10) {
        return i(i10).p();
    }

    int k(@NonNull Month month) {
        return this.f112499a.o().s(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i10) {
        Month monthR = this.f112499a.o().r(i10);
        bVar.f112506a.setText(monthR.p());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f112507b.findViewById(r6.a.h.Z2);
        if (materialCalendarGridView.getAdapter() == null || !monthR.equals(materialCalendarGridView.getAdapter().f112493a)) {
            p pVar = new p(monthR, this.f112500b, this.f112499a, this.f112501c);
            materialCalendarGridView.setNumColumns(monthR.f112333d);
            materialCalendarGridView.setAdapter((ListAdapter) pVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(r6.a.k.f360937z0, viewGroup, false);
        if (!l.Y(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f112503e));
        return new b(linearLayout, true);
    }
}
