package com.google.gson.internal.sql;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.f;
import com.google.gson.v;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
final class a extends b0<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final c0 f125511b = new C1201a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f125512a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C1201a implements c0 {
        C1201a() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            C1201a c1201a = null;
            if (rawType == Date.class) {
                return new a(c1201a);
            }
            return null;
        }
    }

    /* synthetic */ a(C1201a c1201a) {
        this();
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date read(com.google.gson.stream.a aVar) throws IOException {
        Date date;
        if (aVar.x() == com.google.gson.stream.c.NULL) {
            aVar.a7();
            return null;
        }
        String strJc = aVar.jc();
        synchronized (this) {
            try {
                TimeZone timeZone = this.f125512a.getTimeZone();
                try {
                    try {
                        date = new Date(this.f125512a.parse(strJc).getTime());
                        this.f125512a.setTimeZone(timeZone);
                    } catch (ParseException e10) {
                        throw new v("Failed parsing '" + strJc + "' as SQL Date; at path " + aVar.h(), e10);
                    }
                } catch (Throwable th2) {
                    this.f125512a.setTimeZone(timeZone);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return date;
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(com.google.gson.stream.d dVar, Date date) throws IOException {
        String str;
        if (date == null) {
            dVar.y();
            return;
        }
        synchronized (this) {
            str = this.f125512a.format((java.util.Date) date);
        }
        dVar.w0(str);
    }

    private a() {
        this.f125512a = new SimpleDateFormat("MMM d, yyyy");
    }
}
