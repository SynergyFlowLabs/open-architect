package com.devtodev.core.utils.i;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public int a(Date date) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        int i10 = calendar2.get(1) - calendar.get(1);
        if (calendar2.get(6) < calendar.get(6)) {
            i10--;
        }
        return Integer.parseInt(Integer.valueOf(i10).toString());
    }

    public int a(String str) {
        try {
            Date date = new SimpleDateFormat("MM/dd/yyyy", Locale.US).parse(str.replace("\\", ""));
            Calendar.getInstance().setTime(date);
            return a(date);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
