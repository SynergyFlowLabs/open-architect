package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private CharSequence f112353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private Long f112354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private SimpleDateFormat f112355c;

    class a extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r f112356i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f112357j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, r rVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f112356i = rVar;
            this.f112357j = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.e
        void d() {
            SingleDateSelector.this.f112353a = this.f112357j.getError();
            this.f112356i.a();
        }

        @Override // com.google.android.material.datepicker.e
        void e(@p0 Long l10) {
            if (l10 == null) {
                SingleDateSelector.this.e();
            } else {
                SingleDateSelector.this.a3(l10.longValue());
            }
            SingleDateSelector.this.f112353a = null;
            this.f112356i.b(SingleDateSelector.this.Y2());
        }
    }

    class b implements Parcelable.Creator<SingleDateSelector> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f112354b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f112354b = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<androidx.core.util.p<Long, Long>> C3() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View E2(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle, CalendarConstraints calendarConstraints, @NonNull r<Long> rVar) {
        View viewInflate = layoutInflater.inflate(r6.a.k.P0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(r6.a.h.f360811y3);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.n.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatG = this.f112355c;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = v.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        String pattern = z10 ? simpleDateFormat.toPattern() : v.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l10 = this.f112354b;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, rVar, textInputLayout));
        DateSelector.H3(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void G2(@p0 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) v.q(simpleDateFormat);
        }
        this.f112355c = simpleDateFormat;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean L2() {
        return this.f112354b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> N2() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f112354b;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @p0
    public String T() {
        if (TextUtils.isEmpty(this.f112353a)) {
            return null;
        }
        return this.f112353a.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void a3(long j10) {
        this.f112354b = Long.valueOf(j10);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int d1() {
        return r6.a.m.f360980k1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long Y2() {
        return this.f112354b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void y2(@p0 Long l10) {
        this.f112354b = l10 == null ? null : Long.valueOf(v.a(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String s3(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f112354b;
        return resources.getString(r6.a.m.f360961f1, l10 == null ? resources.getString(r6.a.m.f360965g1) : h.m(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int u1(Context context) {
        return com.google.android.material.resources.b.g(context, r6.a.c.Bc, l.class.getCanonicalName());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeValue(this.f112354b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String y3(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f112354b;
        if (l10 == null) {
            return resources.getString(r6.a.m.f360983l1);
        }
        return resources.getString(r6.a.m.f360977j1, h.m(l10.longValue()));
    }
}
