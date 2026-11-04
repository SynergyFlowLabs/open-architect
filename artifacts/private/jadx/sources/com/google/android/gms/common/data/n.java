package com.google.android.gms.common.data;

import android.content.ContentValues;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
final class n extends DataHolder.a {
    n(String[] strArr, String str) {
        super(strArr, null, null);
    }

    @Override // com.google.android.gms.common.data.DataHolder.a
    public final DataHolder.a c(ContentValues contentValues) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }

    @Override // com.google.android.gms.common.data.DataHolder.a
    public final DataHolder.a d(HashMap map) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }
}
