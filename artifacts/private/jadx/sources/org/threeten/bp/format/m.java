package org.threeten.bp.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes14.dex */
final class m extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f340182a = new ConcurrentHashMap(16, 0.75f, 2);

    m() {
    }

    private int d(j jVar) {
        return jVar.ordinal();
    }

    @Override // org.threeten.bp.format.b
    public Locale[] a() {
        return DateFormat.getAvailableLocales();
    }

    @Override // org.threeten.bp.format.b
    public c b(j jVar, j jVar2, org.threeten.bp.chrono.j jVar3, Locale locale) {
        DateFormat timeInstance;
        if (jVar == null && jVar2 == null) {
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }
        String str = jVar3.getId() + '|' + locale.toString() + '|' + jVar + jVar2;
        ConcurrentMap<String, Object> concurrentMap = f340182a;
        Object obj = concurrentMap.get(str);
        if (obj != null) {
            if (obj.equals("")) {
                throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
            }
            return (c) obj;
        }
        if (jVar != null) {
            timeInstance = jVar2 != null ? DateFormat.getDateTimeInstance(d(jVar), d(jVar2), locale) : DateFormat.getDateInstance(d(jVar), locale);
        } else {
            timeInstance = DateFormat.getTimeInstance(d(jVar2), locale);
        }
        if (!(timeInstance instanceof SimpleDateFormat)) {
            concurrentMap.putIfAbsent(str, "");
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        }
        c cVarQ = new d().o(((SimpleDateFormat) timeInstance).toPattern()).Q(locale);
        concurrentMap.putIfAbsent(str, cVarQ);
        return cVarQ;
    }
}
