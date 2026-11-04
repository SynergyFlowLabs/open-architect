package io.ktor.client.plugins.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nAcceptAllCookiesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcceptAllCookiesStorage.kt\nio/ktor/client/plugins/cookies/AcceptAllCookiesStorage\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n116#2,8:74\n125#2,2:89\n116#2,11:91\n774#3:82\n865#3,2:83\n1563#3:85\n1634#3,3:86\n1803#3,2:102\n1805#3:105\n1#4:104\n*S KotlinDebug\n*F\n+ 1 AcceptAllCookiesStorage.kt\nio/ktor/client/plugins/cookies/AcceptAllCookiesStorage\n*L\n26#1:74,8\n26#1:89,2\n39#1:91,11\n30#1:82\n30#1:83,2\n30#1:85\n30#1:86,3\n63#1:102,2\n63#1:105\n*E\n"})
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Long> f294702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a> f294703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f294704c;

    @NotNull
    private volatile /* synthetic */ long oldestCookie;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Cookie f294705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f294706b;

        public a(@NotNull Cookie cookie, long j10) {
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            this.f294705a = cookie;
            this.f294706b = j10;
        }

        public static /* synthetic */ a d(a aVar, Cookie cookie, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cookie = aVar.f294705a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f294706b;
            }
            return aVar.c(cookie, j10);
        }

        @NotNull
        public final Cookie a() {
            return this.f294705a;
        }

        public final long b() {
            return this.f294706b;
        }

        @NotNull
        public final a c(@NotNull Cookie cookie, long j10) {
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            return new a(cookie, j10);
        }

        @NotNull
        public final Cookie e() {
            return this.f294705a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f294705a, aVar.f294705a) && this.f294706b == aVar.f294706b;
        }

        public final long f() {
            return this.f294706b;
        }

        public int hashCode() {
            return (this.f294705a.hashCode() * 31) + Long.hashCode(this.f294706b);
        }

        @NotNull
        public String toString() {
            return "CookieWithTimestamp(cookie=" + this.f294705a + ", createdAt=" + this.f294706b + ')';
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.X}, m = "addCookie", n = {"requestUrl", "cookie", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f294710d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f294712f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294710d = obj;
            this.f294712f |= Integer.MIN_VALUE;
            return d.this.Nd(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.X}, m = "get", n = {"requestUrl", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294715c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f294717e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294715c = obj;
            this.f294717e |= Integer.MIN_VALUE;
            return d.this.R8(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d() {
        return ni.a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Cookie cookie, Url url, a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
        Cookie cookieA = aVar.a();
        return Intrinsics.areEqual(cookieA.getName(), cookie.getName()) && g.c(cookieA, url);
    }

    private final void f(final long j10) {
        CollectionsKt.removeAll((List) this.f294703b, new Function1() { // from class: io.ktor.client.plugins.cookies.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(d.g(this.f294700a, j10, (d.a) obj));
            }
        });
        long jMin = Long.MAX_VALUE;
        for (a aVar : this.f294703b) {
            Long lH = h(aVar.a(), aVar.b());
            if (lH != null) {
                jMin = Math.min(jMin, lH.longValue());
            }
        }
        this.oldestCookie = jMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(d dVar, long j10, a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
        Long lH = dVar.h(aVar.a(), aVar.b());
        return lH != null && lH.longValue() < j10;
    }

    private final Long h(Cookie cookie, long j10) {
        Integer numW = cookie.w();
        if (numW != null) {
            return Long.valueOf(j10 + (((long) numW.intValue()) * 1000));
        }
        GMTDate gMTDateT = cookie.t();
        if (gMTDateT != null) {
            return Long.valueOf(gMTDateT.W());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // io.ktor.client.plugins.cookies.f
    @Nullable
    public Object Nd(@NotNull final Url url, @NotNull final Cookie cookie, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f294712f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f294712f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f294710d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f294712f;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (StringsKt.w3(cookie.getName())) {
                return Unit.f312394a;
            }
            aVar = this.f294704c;
            bVar.f294707a = url;
            bVar.f294708b = cookie;
            bVar.f294709c = aVar;
            bVar.f294712f = 1;
            if (aVar.h(null, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) bVar.f294709c;
            cookie = (Cookie) bVar.f294708b;
            Url url2 = (Url) bVar.f294707a;
            ResultKt.m(obj);
            aVar = aVar2;
            url = url2;
        }
        try {
            CollectionsKt.removeAll((List) this.f294703b, new Function1() { // from class: io.ktor.client.plugins.cookies.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(d.e(cookie, url, (d.a) obj2));
                }
            });
            long jLongValue = this.f294702a.invoke().longValue();
            this.f294703b.add(new a(g.b(cookie, url), jLongValue));
            Long lH = h(cookie, jLongValue);
            if (lH != null) {
                long jLongValue2 = lH.longValue();
                if (this.oldestCookie > jLongValue2) {
                    this.oldestCookie = jLongValue2;
                }
                Unit unit = Unit.f312394a;
            }
            return Unit.f312394a;
        } finally {
            aVar.i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // io.ktor.client.plugins.cookies.f
    @Nullable
    public Object R8(@NotNull Url url, @NotNull kotlin.coroutines.d<? super List<Cookie>> dVar) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f294717e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f294717e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f294715c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f294717e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f294704c;
            cVar.f294713a = url;
            cVar.f294714b = aVar;
            cVar.f294717e = 1;
            if (aVar.h(null, cVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) cVar.f294714b;
            Url url2 = (Url) cVar.f294713a;
            ResultKt.m(obj);
            aVar = aVar2;
            url = url2;
        }
        try {
            long jLongValue = this.f294702a.invoke().longValue();
            if (jLongValue >= this.oldestCookie) {
                f(jLongValue);
            }
            List<a> list = this.f294703b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (g.c(((a) obj2).e(), url)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a) it.next()).e());
            }
            return arrayList2;
        } finally {
            aVar.i(null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public d(@NotNull Function0<Long> clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f294702a = clock;
        this.f294703b = new ArrayList();
        this.oldestCookie = 0L;
        this.f294704c = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    public /* synthetic */ d(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: io.ktor.client.plugins.cookies.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(d.d());
            }
        } : function0);
    }
}
