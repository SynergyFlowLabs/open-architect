package io.ably.lib.http;

import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.r;
import io.ktor.http.t1;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class d<T> implements i.e<io.ably.lib.types.h<T>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static Pattern f287274g = Pattern.compile("\\s*<(.*)>;\\s*rel=\"(.*)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static Pattern f287275h = Pattern.compile("\\./(.*)\\?(.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.ably.lib.http.f f287276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f287277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0[] f287278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0[] f287279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i.c f287280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i.b<T> f287281f;

    class a implements io.ably.lib.http.f.b<io.ably.lib.types.h<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f287282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.e f287283b;

        a(String str, i.e eVar) {
            this.f287282a = str;
            this.f287283b = eVar;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<io.ably.lib.types.h<T>> iVar) throws io.ably.lib.types.a {
            lVar.e(d.this.f287277b, this.f287282a, d.this.f287278c, d.this.f287279d, d.this.f287280e, this.f287283b, true, iVar);
        }
    }

    private static class b<T> extends e<T> implements io.ably.lib.types.f<T> {
        b(io.ably.lib.types.h<T> hVar) {
            super(hVar);
        }

        @Override // io.ably.lib.types.f
        public void d(io.ably.lib.types.i<io.ably.lib.types.f<T>> iVar) {
            this.f287293a.current().a(new c(iVar));
        }

        @Override // io.ably.lib.types.f
        public void e(io.ably.lib.types.i<io.ably.lib.types.f<T>> iVar) {
            this.f287293a.first().a(new c(iVar));
        }

        @Override // io.ably.lib.types.f
        public void f(io.ably.lib.types.i<io.ably.lib.types.f<T>> iVar) {
            this.f287293a.next().a(new c(iVar));
        }
    }

    private static class c<T> implements io.ably.lib.types.i<io.ably.lib.types.h<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.types.i<io.ably.lib.types.f<T>> f287285a;

        c(io.ably.lib.types.i<io.ably.lib.types.f<T>> iVar) {
            this.f287285a = iVar;
        }

        @Override // io.ably.lib.types.i
        public void a(r rVar) {
            this.f287285a.a(rVar);
        }

        @Override // io.ably.lib.types.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(io.ably.lib.types.h<T> hVar) {
            this.f287285a.b(new b(hVar));
        }
    }

    /* JADX INFO: renamed from: io.ably.lib.http.d$d, reason: collision with other inner class name */
    private class C1929d implements io.ably.lib.types.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T[] f287286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f287287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f287288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f287289d;

        /* JADX INFO: renamed from: io.ably.lib.http.d$d$a */
        class a implements io.ably.lib.http.f.b<io.ably.lib.types.h<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f287291a;

            a(String str) {
                this.f287291a = str;
            }

            @Override // io.ably.lib.http.f.b
            public void a(l lVar, io.ably.lib.types.i<io.ably.lib.types.h<T>> iVar) throws io.ably.lib.types.a {
                String str = this.f287291a;
                if (str == null) {
                    iVar.b(null);
                    return;
                }
                Matcher matcher = d.f287275h.matcher(str);
                if (!matcher.matches()) {
                    throw io.ably.lib.types.a.a(new r("Unexpected link URL format", 500, 50000));
                }
                int i10 = 7 | 2;
                String[] strArrSplit = matcher.group(2).split("&");
                b0[] b0VarArr = new b0[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    try {
                        String[] strArrSplit2 = strArrSplit[i11].split("=");
                        b0VarArr[i11] = new b0(strArrSplit2[0], URLDecoder.decode(strArrSplit2[1], "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                lVar.g(d.this.f287277b, d.this.f287278c, b0VarArr, d.this, true, iVar);
            }
        }

        /* synthetic */ C1929d(d dVar, Object[] objArr, Collection collection, a aVar) throws io.ably.lib.types.a {
            this(objArr, collection);
        }

        private io.ably.lib.http.f.c<io.ably.lib.types.h<T>> d(String str) {
            return d.this.f287276a.e(new a(str));
        }

        @Override // io.ably.lib.types.h
        public boolean a() {
            return this.f287287b != null;
        }

        @Override // io.ably.lib.types.h
        public T[] b() {
            return this.f287286a;
        }

        @Override // io.ably.lib.types.h
        public boolean c() {
            return this.f287288c != null;
        }

        @Override // io.ably.lib.types.h
        public io.ably.lib.http.f.c<io.ably.lib.types.h<T>> current() {
            return d(this.f287288c);
        }

        @Override // io.ably.lib.types.h
        public io.ably.lib.http.f.c<io.ably.lib.types.h<T>> first() {
            return d(this.f287287b);
        }

        @Override // io.ably.lib.types.h
        public boolean hasNext() {
            return this.f287289d != null;
        }

        @Override // io.ably.lib.types.h
        public boolean isLast() {
            return this.f287289d == null;
        }

        @Override // io.ably.lib.types.h
        public io.ably.lib.http.f.c<io.ably.lib.types.h<T>> next() {
            return d(this.f287289d);
        }

        private C1929d(T[] tArr, Collection<String> collection) throws io.ably.lib.types.a {
            this.f287286a = tArr;
            if (collection != null) {
                HashMap<String, String> mapJ = d.j(collection);
                this.f287287b = mapJ.get("first");
                this.f287288c = mapJ.get(io.sentry.protocol.b0.b.f306151f);
                this.f287289d = mapJ.get(t1.b.f296120h);
            }
        }
    }

    private static abstract class e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final io.ably.lib.types.h<T> f287293a;

        protected e(io.ably.lib.types.h<T> hVar) {
            this.f287293a = hVar;
        }

        public boolean a() {
            return this.f287293a.a();
        }

        public T[] b() {
            return this.f287293a.b();
        }

        public boolean c() {
            return this.f287293a.c();
        }

        public boolean hasNext() {
            return this.f287293a.hasNext();
        }

        public boolean isLast() {
            return this.f287293a.isLast();
        }
    }

    public static class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.http.f.c<io.ably.lib.types.h<T>> f287294a;

        class a implements io.ably.lib.types.i<io.ably.lib.types.h<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.ably.lib.types.i f287295a;

            a(io.ably.lib.types.i iVar) {
                this.f287295a = iVar;
            }

            @Override // io.ably.lib.types.i
            public void a(r rVar) {
                this.f287295a.a(rVar);
            }

            @Override // io.ably.lib.types.i
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(io.ably.lib.types.h<T> hVar) {
                this.f287295a.b(new b(hVar));
            }
        }

        public static class b<T> extends f<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final io.ably.lib.types.a f287297b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(io.ably.lib.types.a aVar) {
                super(null, 0 == true ? 1 : 0);
                this.f287297b = aVar;
            }

            @Override // io.ably.lib.http.d.f
            public void a(io.ably.lib.types.i<io.ably.lib.types.f<T>> iVar) {
                iVar.a(this.f287297b.f287918a);
            }

            @Override // io.ably.lib.http.d.f
            public a0<T> b() throws io.ably.lib.types.a {
                throw this.f287297b;
            }
        }

        /* synthetic */ f(io.ably.lib.http.f.c cVar, a aVar) {
            this(cVar);
        }

        public void a(io.ably.lib.types.i<io.ably.lib.types.f<T>> iVar) {
            this.f287294a.a(new a(iVar));
        }

        public a0<T> b() throws io.ably.lib.types.a {
            return new g(this.f287294a.b());
        }

        private f(io.ably.lib.http.f.c<io.ably.lib.types.h<T>> cVar) {
            this.f287294a = cVar;
        }
    }

    private static class g<T> extends e<T> implements a0<T> {
        g(io.ably.lib.types.h<T> hVar) {
            super(hVar);
        }

        @Override // io.ably.lib.types.a0
        public a0<T> current() throws io.ably.lib.types.a {
            return new g(this.f287293a.current().b());
        }

        @Override // io.ably.lib.types.a0
        public a0<T> first() throws io.ably.lib.types.a {
            return new g(this.f287293a.first().b());
        }

        @Override // io.ably.lib.types.a0
        public a0<T> next() throws io.ably.lib.types.a {
            return new g(this.f287293a.next().b());
        }
    }

    public d(io.ably.lib.http.f fVar, String str, b0[] b0VarArr, b0[] b0VarArr2, i.b<T> bVar) {
        this(fVar, str, b0VarArr, b0VarArr2, null, bVar);
    }

    protected static HashMap<String, String> j(Collection<String> collection) {
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            Matcher matcher = f287274g.matcher(it.next());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                for (String str : matcher.group(2).toLowerCase(Locale.ENGLISH).split("\\s")) {
                    map.put(str, strGroup);
                }
            }
        }
        return map;
    }

    public io.ably.lib.http.f.c<io.ably.lib.types.h<T>> g(String str) {
        return this.f287276a.e(new a(str, this));
    }

    public f<T> h() {
        return new f<>(g("GET"), null);
    }

    @Override // io.ably.lib.http.i.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public io.ably.lib.types.h<T> a(i.d dVar, r rVar) throws io.ably.lib.types.a {
        if (rVar == null) {
            return new C1929d(this, this.f287281f.a(dVar.f287359d, dVar.f287361f), dVar.b("Link"), null);
        }
        throw io.ably.lib.types.a.a(rVar);
    }

    public d(io.ably.lib.http.f fVar, String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.b<T> bVar) {
        this.f287276a = fVar;
        this.f287277b = str;
        this.f287278c = b0VarArr;
        this.f287279d = b0VarArr2;
        this.f287280e = cVar;
        this.f287281f = bVar;
    }
}
