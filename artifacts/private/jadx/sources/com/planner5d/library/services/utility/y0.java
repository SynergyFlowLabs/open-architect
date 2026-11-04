package com.planner5d.library.services.utility;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class y0<T> implements ij.c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final y0<NumberFormat> f229845c = new y0<>(new a() { // from class: com.planner5d.library.services.utility.q0
        @Override // com.planner5d.library.services.utility.y0.a
        public final Object a(Locale locale) {
            return y0.c(locale);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final y0<NumberFormat> f229846d = new y0<>(NumberFormat.getPercentInstance());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final y0<SimpleDateFormat> f229847e = new y0<>(new a() { // from class: com.planner5d.library.services.utility.r0
        @Override // com.planner5d.library.services.utility.y0.a
        public final Object a(Locale locale) {
            return y0.d(locale);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final y0<SimpleDateFormat> f229848f = new y0<>(new a() { // from class: com.planner5d.library.services.utility.s0
        @Override // com.planner5d.library.services.utility.y0.a
        public final Object a(Locale locale) {
            return y0.g(locale);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final y0<SimpleDateFormat> f229849g = new y0<>(new a() { // from class: com.planner5d.library.services.utility.t0
        @Override // com.planner5d.library.services.utility.y0.a
        public final Object a(Locale locale) {
            return y0.h(locale);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final y0<SimpleDateFormat> f229850h = new y0<>(new a() { // from class: com.planner5d.library.services.utility.u0
        @Override // com.planner5d.library.services.utility.y0.a
        public final Object a(Locale locale) {
            return y0.a(locale);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final y0<SimpleDateFormat> f229851i = new y0<>(new a() { // from class: com.planner5d.library.services.utility.v0
        @Override // com.planner5d.library.services.utility.y0.a
        public final Object a(Locale locale) {
            return y0.b(locale);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final y0<SimpleDateFormat> f229852j = new y0<>(new a() { // from class: com.planner5d.library.services.utility.w0
        @Override // com.planner5d.library.services.utility.y0.a
        public final Object a(Locale locale) {
            return y0.f(locale);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final y0<DecimalFormat> f229853k = new y0<>(new DecimalFormat("00"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Locale, T> f229854a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a<T> f229855b;

    interface a<T> {
        T a(Locale locale);
    }

    private y0(a<T> aVar) {
        this.f229855b = aVar;
    }

    public static /* synthetic */ SimpleDateFormat a(Locale locale) {
        return new SimpleDateFormat("dd MMM yyyy", locale);
    }

    public static /* synthetic */ SimpleDateFormat b(Locale locale) {
        return new SimpleDateFormat("yyyy MMMM dd", locale);
    }

    public static /* synthetic */ NumberFormat c(Locale locale) {
        NumberFormat numberFormat = (NumberFormat) NumberFormat.getNumberInstance().clone();
        numberFormat.setGroupingUsed(false);
        return numberFormat;
    }

    public static /* synthetic */ SimpleDateFormat d(Locale locale) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
    }

    public static /* synthetic */ Object e(Object obj, Locale locale) {
        return obj;
    }

    public static /* synthetic */ SimpleDateFormat f(Locale locale) {
        return new SimpleDateFormat("HH:mm:ss", locale);
    }

    public static /* synthetic */ SimpleDateFormat g(Locale locale) {
        return new SimpleDateFormat("yyyy-MM-dd", locale);
    }

    public static /* synthetic */ SimpleDateFormat h(Locale locale) {
        return new SimpleDateFormat("dd MMM", locale);
    }

    private T j(Locale locale) {
        return this.f229855b.a(locale);
    }

    @Override // ij.c
    public T get() {
        T t10;
        synchronized (this.f229854a) {
            try {
                Locale locale = Locale.getDefault();
                if (!this.f229854a.containsKey(locale)) {
                    this.f229854a.put(locale, j(locale));
                }
                t10 = this.f229854a.get(locale);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public T i() {
        return j(Locale.getDefault());
    }

    private y0(final T t10) {
        this.f229855b = new a() { // from class: com.planner5d.library.services.utility.x0
            @Override // com.planner5d.library.services.utility.y0.a
            public final Object a(Locale locale) {
                return y0.e(t10, locale);
            }
        };
    }
}
