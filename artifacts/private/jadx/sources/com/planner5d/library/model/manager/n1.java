package com.planner5d.library.model.manager;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.devtodev.core.data.metrics.MetricConsts;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class n1 implements o1, x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f192199e = "en";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f192200f = {f192199e, "ru", "de", "es", "fr", "pt", MetricConsts.Install, "zh_hans", "zh_hant", "ja", "ar"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f192201g = {f192199e, "ru"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.builtin.i> f192202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.services.utility.w1 f192203d;

    @ij.a
    public n1(fg.e<com.planner5d.library.model.manager.builtin.i> eVar, com.planner5d.library.services.utility.w1 w1Var) {
        this.f192202c = eVar;
        this.f192203d = w1Var;
    }

    @androidx.annotation.m1
    private int d(String str, String str2, Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(h(str, str2));
        return columnIndex == -1 ? cursor.getColumnIndex(h(str, i())) : columnIndex;
    }

    private String h(String str, String str2) {
        return str + "_" + str2;
    }

    private String j(String[] strArr) {
        Locale localeN = n();
        String language = localeN.getLanguage();
        if ("zh".equals(language)) {
            String country = localeN.getCountry();
            country.getClass();
            switch (country) {
                case "HK":
                case "MO":
                case "TW":
                    language = language + "_hant";
                    break;
                default:
                    language = language + "_hans";
                    break;
            }
        }
        for (String str : strArr) {
            if (str.equals(language)) {
                return language;
            }
        }
        return i();
    }

    @androidx.annotation.m1
    private com.planner5d.library.model.o l(Context context) {
        com.planner5d.library.model.o oVarY = this.f192202c.get().Y(a(context));
        return oVarY == null ? this.f192202c.get().Y(i()) : oVarY;
    }

    @Override // com.planner5d.library.model.manager.o1
    @NonNull
    public String a(Context context) {
        return j(f192200f);
    }

    @Override // com.planner5d.library.model.manager.o1
    @androidx.annotation.p0
    public String b(@androidx.annotation.p0 Context context, @androidx.annotation.p0 com.planner5d.library.model.a0 a0Var, @androidx.annotation.p0 String str) {
        return a0Var == null ? str : a0Var.a(a(context));
    }

    @androidx.annotation.m1
    public int c(String str, Context context, Cursor cursor) {
        return d(str, a(context), cursor);
    }

    public String f(String str, Context context) {
        return h(str, a(context));
    }

    public String i() {
        return f192199e;
    }

    @androidx.annotation.m1
    public Integer k(Context context) {
        return Integer.valueOf(l(context).a());
    }

    public String m() {
        return j(f192201g);
    }

    public Locale n() {
        return this.f192203d.a();
    }

    @androidx.annotation.m1
    public Map<String, String> o(String str, Context context, Cursor cursor) {
        HashMap map = new HashMap();
        for (String str2 : f192200f) {
            int iC = c(str, context, cursor);
            if (iC != -1) {
                map.put(str2, cursor.getString(iC));
            }
        }
        return map;
    }
}
