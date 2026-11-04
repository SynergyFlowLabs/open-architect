package com.devtodev.core.logic.c;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public boolean a(Context context, String str, String str2, d dVar) {
        boolean z10 = false;
        if ((dVar != null && dVar.j()) || context == null) {
            return false;
        }
        if (str != null && !str.equals("") && str2 != null && !str2.equals("")) {
            z10 = true;
        }
        return z10;
    }
}
