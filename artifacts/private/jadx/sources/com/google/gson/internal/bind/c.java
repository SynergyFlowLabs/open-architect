package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.internal.g0;
import com.google.gson.internal.z;
import com.google.gson.v;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class c<T extends Date> extends b0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f125328c = "DefaultDateTypeAdapter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f125329d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f125330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f125331b;

    class a implements c0 {
        a() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            a aVar2 = null;
            if (rawType != Date.class) {
                return null;
            }
            int i10 = 2;
            return new c(b.f125332b, i10, i10, aVar2);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b<T extends Date> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b<Date> f125332b = new a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f125333a;

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.c.b
            protected Date d(Date date) {
                return date;
            }
        }

        protected b(Class<T> cls) {
            this.f125333a = cls;
        }

        private c0 c(c<T> cVar) {
            return p.b(this.f125333a, cVar);
        }

        public final c0 a(int i10, int i11) {
            return c(new c<>(this, i10, i11, null));
        }

        public final c0 b(String str) {
            return c(new c<>(this, str, (a) null));
        }

        protected abstract T d(Date date);
    }

    /* synthetic */ c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    private Date a(com.google.gson.stream.a aVar) throws IOException {
        String strJc = aVar.jc();
        synchronized (this.f125331b) {
            try {
                Iterator<DateFormat> it = this.f125331b.iterator();
                while (it.hasNext()) {
                    DateFormat next = it.next();
                    TimeZone timeZone = next.getTimeZone();
                    try {
                        Date date = next.parse(strJc);
                        next.setTimeZone(timeZone);
                        return date;
                    } catch (ParseException unused) {
                        next.setTimeZone(timeZone);
                    } catch (Throwable th2) {
                        next.setTimeZone(timeZone);
                        throw th2;
                    }
                }
                try {
                    return q9.a.g(strJc, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new v("Failed parsing '" + strJc + "' as Date; at path " + aVar.h(), e10);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T read(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.x() == com.google.gson.stream.c.NULL) {
            aVar.a7();
            return null;
        }
        return (T) this.f125330a.d(a(aVar));
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(com.google.gson.stream.d dVar, Date date) throws IOException {
        String str;
        if (date == null) {
            dVar.y();
            return;
        }
        DateFormat dateFormat = this.f125331b.get(0);
        synchronized (this.f125331b) {
            try {
                str = dateFormat.format(date);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        dVar.w0(str);
    }

    public String toString() {
        DateFormat dateFormat = this.f125331b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* synthetic */ c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    private c(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f125331b = arrayList;
        Objects.requireNonNull(bVar);
        this.f125330a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private c(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f125331b = arrayList;
        Objects.requireNonNull(bVar);
        this.f125330a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (z.d()) {
            arrayList.add(g0.c(i10, i11));
        }
    }
}
