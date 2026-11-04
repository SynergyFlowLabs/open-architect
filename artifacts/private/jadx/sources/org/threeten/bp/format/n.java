package org.threeten.bp.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes14.dex */
final class n extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator<Map.Entry<String, Long>> f340183c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Map.Entry<org.threeten.bp.temporal.j, Locale>, Object> f340184b = new ConcurrentHashMap(16, 0.75f, 2);

    class a implements Comparator<Map.Entry<String, Long>> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<o, Map<Long, String>> f340185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<o, List<Map.Entry<String, Long>>> f340186b;

        b(Map<o, Map<Long, String>> map) {
            this.f340185a = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (o oVar : map.keySet()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(oVar).entrySet()) {
                    map3.put(entry.getValue(), n.h(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(map3.values());
                Collections.sort(arrayList2, n.f340183c);
                map2.put(oVar, arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Collections.sort(arrayList, n.f340183c);
            this.f340186b = map2;
        }

        String a(long j10, o oVar) {
            Map<Long, String> map = this.f340185a.get(oVar);
            if (map != null) {
                return map.get(Long.valueOf(j10));
            }
            return null;
        }

        Iterator<Map.Entry<String, Long>> b(o oVar) {
            List<Map.Entry<String, Long>> list = this.f340186b.get(oVar);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <A, B> Map.Entry<A, B> h(A a10, B b10) {
        return new AbstractMap.SimpleImmutableEntry(a10, b10);
    }

    private static b i(Map<o, Map<Long, String>> map) {
        map.put(o.FULL_STANDALONE, map.get(o.FULL));
        map.put(o.SHORT_STANDALONE, map.get(o.SHORT));
        o oVar = o.NARROW;
        if (map.containsKey(oVar)) {
            o oVar2 = o.NARROW_STANDALONE;
            if (!map.containsKey(oVar2)) {
                map.put(oVar2, map.get(oVar));
            }
        }
        return new b(map);
    }

    private Object j(org.threeten.bp.temporal.j jVar, Locale locale) {
        if (jVar == org.threeten.bp.temporal.a.f340334h3) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map = new HashMap();
            String[] months = dateFormatSymbols.getMonths();
            HashMap map2 = new HashMap();
            map2.put(1L, months[0]);
            map2.put(2L, months[1]);
            map2.put(3L, months[2]);
            map2.put(4L, months[3]);
            map2.put(5L, months[4]);
            map2.put(6L, months[5]);
            map2.put(7L, months[6]);
            map2.put(8L, months[7]);
            map2.put(9L, months[8]);
            map2.put(10L, months[9]);
            map2.put(11L, months[10]);
            map2.put(12L, months[11]);
            map.put(o.FULL, map2);
            HashMap map3 = new HashMap();
            map3.put(1L, m(1, months[0], locale));
            map3.put(2L, m(2, months[1], locale));
            map3.put(3L, m(3, months[2], locale));
            map3.put(4L, m(4, months[3], locale));
            map3.put(5L, m(5, months[4], locale));
            map3.put(6L, m(6, months[5], locale));
            map3.put(7L, m(7, months[6], locale));
            map3.put(8L, m(8, months[7], locale));
            map3.put(9L, m(9, months[8], locale));
            map3.put(10L, m(10, months[9], locale));
            map3.put(11L, m(11, months[10], locale));
            map3.put(12L, m(12, months[11], locale));
            map.put(o.NARROW, map3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap map4 = new HashMap();
            map4.put(1L, shortMonths[0]);
            map4.put(2L, shortMonths[1]);
            map4.put(3L, shortMonths[2]);
            map4.put(4L, shortMonths[3]);
            map4.put(5L, shortMonths[4]);
            map4.put(6L, shortMonths[5]);
            map4.put(7L, shortMonths[6]);
            map4.put(8L, shortMonths[7]);
            map4.put(9L, shortMonths[8]);
            map4.put(10L, shortMonths[9]);
            map4.put(11L, shortMonths[10]);
            map4.put(12L, shortMonths[11]);
            map.put(o.SHORT, map4);
            return i(map);
        }
        if (jVar == org.threeten.bp.temporal.a.X) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map5 = new HashMap();
            String[] weekdays = dateFormatSymbols2.getWeekdays();
            HashMap map6 = new HashMap();
            map6.put(1L, weekdays[2]);
            map6.put(2L, weekdays[3]);
            map6.put(3L, weekdays[4]);
            map6.put(4L, weekdays[5]);
            map6.put(5L, weekdays[6]);
            map6.put(6L, weekdays[7]);
            map6.put(7L, weekdays[1]);
            map5.put(o.FULL, map6);
            HashMap map7 = new HashMap();
            map7.put(1L, l(1, weekdays[2], locale));
            map7.put(2L, l(2, weekdays[3], locale));
            map7.put(3L, l(3, weekdays[4], locale));
            map7.put(4L, l(4, weekdays[5], locale));
            map7.put(5L, l(5, weekdays[6], locale));
            map7.put(6L, l(6, weekdays[7], locale));
            map7.put(7L, l(7, weekdays[1], locale));
            map5.put(o.NARROW, map7);
            String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
            HashMap map8 = new HashMap();
            map8.put(1L, shortWeekdays[2]);
            map8.put(2L, shortWeekdays[3]);
            map8.put(3L, shortWeekdays[4]);
            map8.put(4L, shortWeekdays[5]);
            map8.put(5L, shortWeekdays[6]);
            map8.put(6L, shortWeekdays[7]);
            map8.put(7L, shortWeekdays[1]);
            map5.put(o.SHORT, map8);
            return i(map5);
        }
        if (jVar == org.threeten.bp.temporal.a.f340355w) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap map9 = new HashMap();
            String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
            HashMap map10 = new HashMap();
            map10.put(0L, amPmStrings[0]);
            map10.put(1L, amPmStrings[1]);
            map9.put(o.FULL, map10);
            map9.put(o.SHORT, map10);
            return i(map9);
        }
        if (jVar != org.threeten.bp.temporal.a.f340342l3) {
            if (jVar != org.threeten.bp.temporal.c.f340380b) {
                return "";
            }
            HashMap map11 = new HashMap();
            HashMap map12 = new HashMap();
            map12.put(1L, "Q1");
            map12.put(2L, "Q2");
            map12.put(3L, "Q3");
            map12.put(4L, "Q4");
            map11.put(o.SHORT, map12);
            HashMap map13 = new HashMap();
            map13.put(1L, "1st quarter");
            map13.put(2L, "2nd quarter");
            map13.put(3L, "3rd quarter");
            map13.put(4L, "4th quarter");
            map11.put(o.FULL, map13);
            return i(map11);
        }
        DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
        HashMap map14 = new HashMap();
        String[] eras = dateFormatSymbols4.getEras();
        HashMap map15 = new HashMap();
        map15.put(0L, eras[0]);
        map15.put(1L, eras[1]);
        map14.put(o.SHORT, map15);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            HashMap map16 = new HashMap();
            map16.put(0L, "Before Christ");
            map16.put(1L, "Anno Domini");
            map14.put(o.FULL, map16);
        } else {
            map14.put(o.FULL, map15);
        }
        HashMap map17 = new HashMap();
        map17.put(0L, eras[0].substring(0, 1));
        map17.put(1L, eras[1].substring(0, 1));
        map14.put(o.NARROW, map17);
        return i(map14);
    }

    private Object k(org.threeten.bp.temporal.j jVar, Locale locale) {
        Map.Entry<org.threeten.bp.temporal.j, Locale> entryH = h(jVar, locale);
        Object obj = this.f340184b.get(entryH);
        if (obj != null) {
            return obj;
        }
        this.f340184b.putIfAbsent(entryH, j(jVar, locale));
        return this.f340184b.get(entryH);
    }

    private String l(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    private String m(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i10) : str.substring(0, 1);
    }

    @Override // org.threeten.bp.format.h
    public String c(org.threeten.bp.temporal.j jVar, long j10, o oVar, Locale locale) {
        Object objK = k(jVar, locale);
        if (objK instanceof b) {
            return ((b) objK).a(j10, oVar);
        }
        return null;
    }

    @Override // org.threeten.bp.format.h
    public Iterator<Map.Entry<String, Long>> d(org.threeten.bp.temporal.j jVar, o oVar, Locale locale) {
        Object objK = k(jVar, locale);
        if (objK instanceof b) {
            return ((b) objK).b(oVar);
        }
        return null;
    }
}
