package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
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
public class RangeDateSelector implements DateSelector<androidx.core.util.p<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private CharSequence f112337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f112338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f112339c = " ";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Long f112340d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Long f112341e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Long f112342f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Long f112343g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private SimpleDateFormat f112344h;

    class a extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f112345i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f112346j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ r f112347k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f112345i = textInputLayout2;
            this.f112346j = textInputLayout3;
            this.f112347k = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        void d() {
            RangeDateSelector.this.f112342f = null;
            RangeDateSelector.this.m(this.f112345i, this.f112346j, this.f112347k);
        }

        @Override // com.google.android.material.datepicker.e
        void e(@p0 Long l10) {
            RangeDateSelector.this.f112342f = l10;
            RangeDateSelector.this.m(this.f112345i, this.f112346j, this.f112347k);
        }
    }

    class b extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f112349i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f112350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ r f112351k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f112349i = textInputLayout2;
            this.f112350j = textInputLayout3;
            this.f112351k = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        void d() {
            RangeDateSelector.this.f112343g = null;
            RangeDateSelector.this.m(this.f112349i, this.f112350j, this.f112351k);
        }

        @Override // com.google.android.material.datepicker.e
        void e(@p0 Long l10) {
            RangeDateSelector.this.f112343g = l10;
            RangeDateSelector.this.m(this.f112349i, this.f112350j, this.f112351k);
        }
    }

    class c implements Parcelable.Creator<RangeDateSelector> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f112340d = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f112341e = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    }

    private void g(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f112338b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    private boolean i(long j10, long j11) {
        return j10 <= j11;
    }

    private void j(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f112338b);
        textInputLayout2.setError(" ");
    }

    private void l(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f112337a = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f112337a = null;
        } else {
            this.f112337a = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull r<androidx.core.util.p<Long, Long>> rVar) {
        Long l10 = this.f112342f;
        if (l10 == null || this.f112343g == null) {
            g(textInputLayout, textInputLayout2);
            rVar.a();
        } else if (i(l10.longValue(), this.f112343g.longValue())) {
            this.f112340d = this.f112342f;
            this.f112341e = this.f112343g;
            rVar.b(Y2());
        } else {
            j(textInputLayout, textInputLayout2);
            rVar.a();
        }
        l(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<androidx.core.util.p<Long, Long>> C3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new androidx.core.util.p(this.f112340d, this.f112341e));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View E2(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle, CalendarConstraints calendarConstraints, @NonNull r<androidx.core.util.p<Long, Long>> rVar) {
        View viewInflate = layoutInflater.inflate(r6.a.k.Q0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(r6.a.h.A3);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(r6.a.h.f360819z3);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.n.b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f112338b = viewInflate.getResources().getString(r6.a.m.f361001r1);
        SimpleDateFormat simpleDateFormatG = this.f112344h;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = v.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        Long l10 = this.f112340d;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
            this.f112342f = this.f112340d;
        }
        Long l11 = this.f112341e;
        if (l11 != null) {
            editText2.setText(simpleDateFormat.format(l11));
            this.f112343g = this.f112341e;
        }
        String pattern = z10 ? simpleDateFormat.toPattern() : v.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        DateSelector.H3(editText, editText2);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void G2(@p0 SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) v.q(simpleDateFormat);
        }
        this.f112344h = simpleDateFormat;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean L2() {
        Long l10 = this.f112340d;
        return (l10 == null || this.f112341e == null || !i(l10.longValue(), this.f112341e.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> N2() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f112340d;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.f112341e;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @p0
    public String T() {
        if (TextUtils.isEmpty(this.f112337a)) {
            return null;
        }
        return this.f112337a.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void a3(long j10) {
        Long l10 = this.f112340d;
        if (l10 == null) {
            this.f112340d = Long.valueOf(j10);
        } else if (this.f112341e == null && i(l10.longValue(), j10)) {
            this.f112341e = Long.valueOf(j10);
        } else {
            this.f112341e = null;
            this.f112340d = Long.valueOf(j10);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int d1() {
        return r6.a.m.f361022y1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.core.util.p<Long, Long> Y2() {
        return new androidx.core.util.p<>(this.f112340d, this.f112341e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void y2(@NonNull androidx.core.util.p<Long, Long> pVar) {
        Long l10 = pVar.f48411a;
        if (l10 != null && pVar.f48412b != null) {
            androidx.core.util.t.a(i(l10.longValue(), pVar.f48412b.longValue()));
        }
        Long l11 = pVar.f48411a;
        this.f112340d = l11 == null ? null : Long.valueOf(v.a(l11.longValue()));
        Long l12 = pVar.f48412b;
        this.f112341e = l12 != null ? Long.valueOf(v.a(l12.longValue())) : null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String s3(@NonNull Context context) {
        Resources resources = context.getResources();
        androidx.core.util.p<String, String> pVarA = h.a(this.f112340d, this.f112341e);
        String str = pVarA.f48411a;
        String string = str == null ? resources.getString(r6.a.m.f360965g1) : str;
        String str2 = pVarA.f48412b;
        return resources.getString(r6.a.m.f360957e1, string, str2 == null ? resources.getString(r6.a.m.f360965g1) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int u1(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return com.google.android.material.resources.b.g(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(r6.a.f.f360493yb) ? r6.a.c.Bc : r6.a.c.f359497qc, l.class.getCanonicalName());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeValue(this.f112340d);
        parcel.writeValue(this.f112341e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String y3(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f112340d;
        if (l10 == null && this.f112341e == null) {
            return resources.getString(r6.a.m.f361025z1);
        }
        Long l11 = this.f112341e;
        if (l11 == null) {
            return resources.getString(r6.a.m.f361016w1, h.c(l10.longValue()));
        }
        if (l10 == null) {
            return resources.getString(r6.a.m.f361013v1, h.c(l11.longValue()));
        }
        androidx.core.util.p<String, String> pVarA = h.a(l10, l11);
        return resources.getString(r6.a.m.f361019x1, pVarA.f48411a, pVarA.f48412b);
    }
}
