package io.reactivex.observers;

import dj.r;
import io.reactivex.a0;
import io.reactivex.internal.util.y;
import io.reactivex.observers.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<T, U extends a<T, U>> implements io.reactivex.disposables.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f303536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Thread f303537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f303538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f303539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f303540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected CharSequence f303541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f303542j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List<T> f303534b = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List<Throwable> f303535c = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final CountDownLatch f303533a = new CountDownLatch(1);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f303543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f303544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f303545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f303546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f303547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f303548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ b[] f303549g;

        /* JADX INFO: renamed from: io.reactivex.observers.a$b$a, reason: collision with other inner class name */
        static enum C2197a extends b {
            C2197a(String str, int i10) {
                super(str, i10);
            }

            @Override // io.reactivex.observers.a.b, java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: io.reactivex.observers.a$b$b, reason: collision with other inner class name */
        static enum C2198b extends b {
            C2198b(String str, int i10) {
                super(str, i10);
            }

            @Override // io.reactivex.observers.a.b, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        }

        static enum c extends b {
            c(String str, int i10) {
                super(str, i10);
            }

            @Override // io.reactivex.observers.a.b, java.lang.Runnable
            public void run() {
                b.b(1);
            }
        }

        static enum d extends b {
            d(String str, int i10) {
                super(str, i10);
            }

            @Override // io.reactivex.observers.a.b, java.lang.Runnable
            public void run() {
                b.b(10);
            }
        }

        static enum e extends b {
            e(String str, int i10) {
                super(str, i10);
            }

            @Override // io.reactivex.observers.a.b, java.lang.Runnable
            public void run() {
                b.b(100);
            }
        }

        static enum f extends b {
            f(String str, int i10) {
                super(str, i10);
            }

            @Override // io.reactivex.observers.a.b, java.lang.Runnable
            public void run() {
                b.b(1000);
            }
        }

        static {
            C2197a c2197a = new C2197a("SPIN", 0);
            f303543a = c2197a;
            C2198b c2198b = new C2198b("YIELD", 1);
            f303544b = c2198b;
            c cVar = new c("SLEEP_1MS", 2);
            f303545c = cVar;
            d dVar = new d("SLEEP_10MS", 3);
            f303546d = dVar;
            e eVar = new e("SLEEP_100MS", 4);
            f303547e = eVar;
            f fVar = new f("SLEEP_1000MS", 5);
            f303548f = fVar;
            f303549g = new b[]{c2197a, c2198b, cVar, dVar, eVar, fVar};
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        static void b(int i10) {
            try {
                Thread.sleep(i10);
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f303549g.clone();
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static String c0(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    public final U A(T t10) {
        if (this.f303534b.size() != 1) {
            throw X("expected: " + c0(t10) + " but was: " + this.f303534b);
        }
        T t11 = this.f303534b.get(0);
        if (io.reactivex.internal.functions.b.c(t10, t11)) {
            return this;
        }
        throw X("expected: " + c0(t10) + " but was: " + c0(t11));
    }

    public final U B(int i10, r<T> rVar) {
        if (this.f303534b.size() == 0) {
            throw X("No values");
        }
        if (i10 >= this.f303534b.size()) {
            throw X("Invalid index: " + i10);
        }
        try {
            if (rVar.test(this.f303534b.get(i10))) {
                return this;
            }
            throw X("Value not present");
        } catch (Exception e10) {
            throw io.reactivex.internal.util.k.f(e10);
        }
    }

    public final U C(int i10, T t10) {
        int size = this.f303534b.size();
        if (size == 0) {
            throw X("No values");
        }
        if (i10 >= size) {
            throw X("Invalid index: " + i10);
        }
        T t11 = this.f303534b.get(i10);
        if (io.reactivex.internal.functions.b.c(t10, t11)) {
            return this;
        }
        throw X("expected: " + c0(t10) + " but was: " + c0(t11));
    }

    public final U D(int i10) {
        int size = this.f303534b.size();
        if (size == i10) {
            return this;
        }
        throw X("Value counts differ; expected: " + i10 + " but was: " + size);
    }

    public final U E(Iterable<? extends T> iterable) {
        boolean zHasNext;
        boolean zHasNext2;
        Iterator<T> it = this.f303534b.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        int i10 = 0;
        while (true) {
            zHasNext = it2.hasNext();
            zHasNext2 = it.hasNext();
            if (!zHasNext2 || !zHasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (!io.reactivex.internal.functions.b.c(next, next2)) {
                throw X("Values at position " + i10 + " differ; expected: " + c0(next) + " but was: " + c0(next2));
            }
            i10++;
        }
        if (zHasNext2) {
            throw X("More values received than expected (" + i10 + ")");
        }
        if (!zHasNext) {
            return this;
        }
        throw X("Fewer values received than expected (" + i10 + ")");
    }

    public final U F(Iterable<? extends T> iterable) {
        return (U) w().E(iterable).p().s();
    }

    public final U G(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            r();
            return this;
        }
        for (T t10 : this.f303534b) {
            if (!collection.contains(t10)) {
                throw X("Value not in the expected collection: " + c0(t10));
            }
        }
        return this;
    }

    public final U H(Collection<? extends T> collection) {
        return (U) w().G(collection).p().s();
    }

    public final U I(T... tArr) {
        int size = this.f303534b.size();
        if (size != tArr.length) {
            throw X("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.f303534b);
        }
        int i10 = 4 ^ 0;
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = this.f303534b.get(i11);
            T t11 = tArr[i11];
            if (!io.reactivex.internal.functions.b.c(t11, t10)) {
                throw X("Values at position " + i11 + " differ; expected: " + c0(t11) + " but was: " + c0(t10));
            }
        }
        return this;
    }

    public final U J(T... tArr) {
        return (U) w().I(tArr).p().s();
    }

    public final U K() throws InterruptedException {
        if (this.f303533a.getCount() == 0) {
            return this;
        }
        this.f303533a.await();
        return this;
    }

    public final boolean M(long j10, TimeUnit timeUnit) throws InterruptedException {
        boolean z10 = this.f303533a.getCount() == 0 || this.f303533a.await(j10, timeUnit);
        this.f303542j = !z10;
        return z10;
    }

    public final U N(int i10) {
        return (U) P(i10, b.f303546d, 5000L);
    }

    public final U O(int i10, Runnable runnable) {
        return (U) P(i10, runnable, 5000L);
    }

    public final U P(int i10, Runnable runnable, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j10 > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= j10) {
                this.f303542j = true;
                return this;
            }
            if (this.f303533a.getCount() != 0 && this.f303534b.size() < i10) {
                runnable.run();
            }
            return this;
        }
    }

    public final U Q(long j10, TimeUnit timeUnit) {
        try {
            if (this.f303533a.await(j10, timeUnit)) {
                return this;
            }
            this.f303542j = true;
            dispose();
            return this;
        } catch (InterruptedException e10) {
            dispose();
            throw io.reactivex.internal.util.k.f(e10);
        }
    }

    public final boolean R() {
        try {
            K();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean S(long j10, TimeUnit timeUnit) {
        try {
            return M(j10, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U T() {
        this.f303542j = false;
        return this;
    }

    public final long U() {
        return this.f303536d;
    }

    public final int V() {
        return this.f303535c.size();
    }

    public final List<Throwable> W() {
        return this.f303535c;
    }

    protected final AssertionError X(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (");
        sb2.append("latch = ");
        sb2.append(this.f303533a.getCount());
        sb2.append(", ");
        sb2.append("values = ");
        sb2.append(this.f303534b.size());
        sb2.append(", ");
        sb2.append("errors = ");
        sb2.append(this.f303535c.size());
        sb2.append(", ");
        sb2.append("completions = ");
        sb2.append(this.f303536d);
        if (this.f303542j) {
            sb2.append(", timeout!");
        }
        if (k()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.f303541i;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.f303535c.isEmpty()) {
            if (this.f303535c.size() == 1) {
                assertionError.initCause(this.f303535c.get(0));
                return assertionError;
            }
            assertionError.initCause(new io.reactivex.exceptions.a(this.f303535c));
        }
        return assertionError;
    }

    public final List<List<Object>> Y() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e0());
        arrayList.add(W());
        ArrayList arrayList2 = new ArrayList();
        for (long j10 = 0; j10 < this.f303536d; j10++) {
            arrayList2.add(a0.a());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean Z() {
        return this.f303533a.getCount() == 0;
    }

    public final U a() {
        long j10 = this.f303536d;
        if (j10 == 0) {
            throw X("Not completed");
        }
        if (j10 <= 1) {
            return this;
        }
        throw X("Multiple completions: " + j10);
    }

    public final boolean a0() {
        return this.f303542j;
    }

    public final Thread b0() {
        return this.f303537e;
    }

    public final U c() {
        return (U) w().r().p().s();
    }

    public final int d0() {
        return this.f303534b.size();
    }

    public final U e(r<Throwable> rVar) {
        int size = this.f303535c.size();
        if (size == 0) {
            throw X("No errors");
        }
        Iterator<Throwable> it = this.f303535c.iterator();
        while (it.hasNext()) {
            try {
                if (rVar.test(it.next())) {
                    if (size == 1) {
                        return this;
                    }
                    throw X("Error present but other errors as well");
                }
            } catch (Exception e10) {
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        throw X("Error not present");
    }

    public final List<T> e0() {
        return this.f303534b;
    }

    public final U f(Class<? extends Throwable> cls) {
        return (U) e(io.reactivex.internal.functions.a.l(cls));
    }

    public final U f0(CharSequence charSequence) {
        this.f303541i = charSequence;
        return this;
    }

    public final U g(Throwable th2) {
        return (U) e(io.reactivex.internal.functions.a.i(th2));
    }

    public final U h(String str) {
        int size = this.f303535c.size();
        if (size == 0) {
            throw X("No errors");
        }
        if (size != 1) {
            throw X("Multiple errors");
        }
        String message = this.f303535c.get(0).getMessage();
        if (io.reactivex.internal.functions.b.c(str, message)) {
            return this;
        }
        throw X("Error message differs; exptected: " + str + " but was: " + message);
    }

    public final U i(r<Throwable> rVar, T... tArr) {
        return (U) w().I(tArr).e(rVar).s();
    }

    public final U j(Class<? extends Throwable> cls, T... tArr) {
        return (U) w().I(tArr).f(cls).s();
    }

    public final U m(Class<? extends Throwable> cls, String str, T... tArr) {
        return (U) w().I(tArr).f(cls).h(str).s();
    }

    public final U n(r<? super T> rVar) {
        int size = this.f303534b.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                if (rVar.test(this.f303534b.get(i10))) {
                    throw X("Value at position " + i10 + " matches predicate " + rVar.toString() + ", which was not expected.");
                }
            } catch (Exception e10) {
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        return this;
    }

    public final U o(T t10) {
        int size = this.f303534b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (io.reactivex.internal.functions.b.c(this.f303534b.get(i10), t10)) {
                throw X("Value at position " + i10 + " is equal to " + c0(t10) + "; Expected them to be different");
            }
        }
        return this;
    }

    public final U p() {
        if (this.f303535c.size() == 0) {
            return this;
        }
        throw X("Error(s) present: " + this.f303535c);
    }

    public final U q() {
        if (this.f303542j) {
            throw X("Timeout?!");
        }
        return this;
    }

    public final U r() {
        return (U) D(0);
    }

    public final U s() {
        long j10 = this.f303536d;
        if (j10 == 1) {
            throw X("Completed!");
        }
        if (j10 <= 1) {
            return this;
        }
        throw X("Multiple completions: " + j10);
    }

    public abstract U t();

    public final U u() {
        if (this.f303533a.getCount() != 0) {
            return this;
        }
        throw X("Subscriber terminated!");
    }

    public final U v(T... tArr) {
        return (U) w().I(tArr).p().a();
    }

    public abstract U w();

    public final U x() {
        if (this.f303533a.getCount() != 0) {
            throw X("Subscriber still running!");
        }
        long j10 = this.f303536d;
        if (j10 > 1) {
            throw X("Terminated with multiple completions: " + j10);
        }
        int size = this.f303535c.size();
        if (size > 1) {
            throw X("Terminated with multiple errors: " + size);
        }
        if (j10 == 0 || size == 0) {
            return this;
        }
        throw X("Terminated with multiple completions and errors: " + j10);
    }

    public final U y() {
        if (this.f303542j) {
            return this;
        }
        throw X("No timeout?!");
    }

    public final U z(r<T> rVar) {
        B(0, rVar);
        if (this.f303534b.size() <= 1) {
            return this;
        }
        throw X("Value present but other values as well");
    }
}
