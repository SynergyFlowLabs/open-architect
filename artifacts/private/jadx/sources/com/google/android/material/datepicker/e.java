package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.material.internal.f0;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes4.dex */
abstract class e extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextInputLayout f112377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f112378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DateFormat f112379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CalendarConstraints f112380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f112381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f112382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f112383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f112384h = 0;

    e(final String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f112378b = str;
        this.f112379c = dateFormat;
        this.f112377a = textInputLayout;
        this.f112380d = calendarConstraints;
        this.f112381e = textInputLayout.getContext().getString(r6.a.m.f361010u1);
        this.f112382f = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f112373a, str);
            }
        };
    }

    public static /* synthetic */ void a(e eVar, long j10) {
        eVar.getClass();
        eVar.f112377a.setError(String.format(eVar.f112381e, eVar.g(h.c(j10))));
        eVar.d();
    }

    public static /* synthetic */ void b(e eVar, String str) {
        TextInputLayout textInputLayout = eVar.f112377a;
        DateFormat dateFormat = eVar.f112379c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(r6.a.m.f360992o1) + "\n" + String.format(context.getString(r6.a.m.f360998q1), eVar.g(str)) + "\n" + String.format(context.getString(r6.a.m.f360995p1), eVar.g(dateFormat.format(new Date(v.v().getTimeInMillis())))));
        eVar.d();
    }

    private Runnable c(final long j10) {
        return new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                e.a(this.f112375a, j10);
            }
        };
    }

    private String g(String str) {
        return str.replace(' ', b0.f313282g);
    }

    @Override // com.google.android.material.internal.f0, android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f112378b.length() && editable.length() >= this.f112384h) {
            char cCharAt = this.f112378b.charAt(editable.length());
            if (!Character.isLetterOrDigit(cCharAt)) {
                editable.append(cCharAt);
            }
        }
    }

    @Override // com.google.android.material.internal.f0, android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        this.f112384h = charSequence.length();
    }

    void d() {
    }

    abstract void e(@p0 Long l10);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    @Override // com.google.android.material.internal.f0, android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        this.f112377a.removeCallbacks(this.f112382f);
        this.f112377a.removeCallbacks(this.f112383g);
        this.f112377a.setError(null);
        e(null);
        if (!TextUtils.isEmpty(charSequence) && charSequence.length() >= this.f112378b.length()) {
            try {
                Date date = this.f112379c.parse(charSequence.toString());
                this.f112377a.setError(null);
                long time = date.getTime();
                if (this.f112380d.h().d(time) && this.f112380d.r(time)) {
                    e(Long.valueOf(date.getTime()));
                    return;
                }
                Runnable runnableC = c(time);
                this.f112383g = runnableC;
                f(this.f112377a, runnableC);
            } catch (ParseException unused) {
                f(this.f112377a, this.f112382f);
            }
        }
    }
}
