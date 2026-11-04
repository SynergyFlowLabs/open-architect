package com.google.gson.internal.sql;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.f;
import com.google.gson.v;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
final class b extends b0<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final c0 f125513b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f125514a;

    class a implements c0 {
        a() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            a aVar2 = null;
            if (rawType == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Time read(com.google.gson.stream.a aVar) throws IOException {
        Time time;
        if (aVar.x() == com.google.gson.stream.c.NULL) {
            aVar.a7();
            return null;
        }
        String strJc = aVar.jc();
        synchronized (this) {
            TimeZone timeZone = this.f125514a.getTimeZone();
            try {
                try {
                    time = new Time(this.f125514a.parse(strJc).getTime());
                    this.f125514a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new v("Failed parsing '" + strJc + "' as SQL Time; at path " + aVar.h(), e10);
                }
            } catch (Throwable th2) {
                this.f125514a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(com.google.gson.stream.d dVar, Time time) throws IOException {
        String str;
        if (time == null) {
            dVar.y();
            return;
        }
        synchronized (this) {
            str = this.f125514a.format((Date) time);
        }
        dVar.w0(str);
    }

    private b() {
        this.f125514a = new SimpleDateFormat("hh:mm:ss a");
    }
}
