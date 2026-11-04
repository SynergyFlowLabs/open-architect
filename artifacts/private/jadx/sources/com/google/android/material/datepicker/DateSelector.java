package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.g1;
import com.google.android.material.internal.p0;
import java.text.SimpleDateFormat;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    static void H3(@NonNull final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                DateSelector.o3(editTextArr, view, z10);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: com.google.android.material.datepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                p0.y(editText2, false);
            }
        }, 100L);
    }

    static /* synthetic */ void o3(EditText[] editTextArr, View view, boolean z10) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        p0.r(view, false);
    }

    @NonNull
    Collection<androidx.core.util.p<Long, Long>> C3();

    @NonNull
    View E2(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull r<S> rVar);

    void G2(@androidx.annotation.p0 SimpleDateFormat simpleDateFormat);

    boolean L2();

    @NonNull
    Collection<Long> N2();

    @androidx.annotation.p0
    String T();

    @androidx.annotation.p0
    S Y2();

    void a3(long j10);

    @f1
    int d1();

    @NonNull
    String s3(@NonNull Context context);

    @g1
    int u1(Context context);

    void y2(@NonNull S s10);

    @NonNull
    String y3(Context context);
}
