package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class w extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j<?> f112515a;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f112516a;

        a(int i10) {
            this.f112516a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.f112515a.P(w.this.f112515a.G().g(Month.c(this.f112516a, w.this.f112515a.I().f112331b)));
            w.this.f112515a.Q(j.l.DAY);
        }
    }

    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final TextView f112518a;

        b(TextView textView) {
            super(textView);
            this.f112518a = textView;
        }
    }

    w(j<?> jVar) {
        this.f112515a = jVar;
    }

    @NonNull
    private View.OnClickListener i(int i10) {
        return new a(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f112515a.G().q();
    }

    int j(int i10) {
        return i10 - this.f112515a.G().o().f112332c;
    }

    int k(int i10) {
        return this.f112515a.G().o().f112332c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i10) {
        int iK = k(i10);
        bVar.f112518a.setText(String.format(Locale.getDefault(), TimeModel.f114319i, Integer.valueOf(iK)));
        TextView textView = bVar.f112518a;
        textView.setContentDescription(h.k(textView.getContext(), iK));
        com.google.android.material.datepicker.b bVarH = this.f112515a.H();
        Calendar calendarV = v.v();
        com.google.android.material.datepicker.a aVar = calendarV.get(1) == iK ? bVarH.f112370f : bVarH.f112368d;
        Iterator<Long> it = this.f112515a.v().N2().iterator();
        while (it.hasNext()) {
            calendarV.setTimeInMillis(it.next().longValue());
            if (calendarV.get(1) == iK) {
                aVar = bVarH.f112369e;
            }
        }
        aVar.f(bVar.f112518a);
        bVar.f112518a.setOnClickListener(i(iK));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(r6.a.k.D0, viewGroup, false));
    }
}
