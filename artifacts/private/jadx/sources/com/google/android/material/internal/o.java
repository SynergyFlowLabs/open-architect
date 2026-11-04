package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.b1;
import com.google.android.material.internal.o;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface o<T extends o<T>> extends Checkable {

    public interface a<C> {
        void a(C c10, boolean z10);
    }

    @androidx.annotation.d0
    int getId();

    void setInternalOnCheckedChangeListener(@androidx.annotation.p0 a<T> aVar);
}
