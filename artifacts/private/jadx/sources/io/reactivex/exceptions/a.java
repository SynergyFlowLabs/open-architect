package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f298667d = 3026362227162912146L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Throwable> f298668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f298669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f298670c;

    /* JADX INFO: renamed from: io.reactivex.exceptions.a$a, reason: collision with other inner class name */
    static final class C2120a extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f298671a = 3875212506787802066L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String f298672b = "Chain of Causes for CompositeException In Order Received =>";

        C2120a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return f298672b;
        }
    }

    static abstract class b {
        b() {
        }

        abstract void a(Object obj);
    }

    static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintStream f298673a;

        c(PrintStream printStream) {
            this.f298673a = printStream;
        }

        @Override // io.reactivex.exceptions.a.b
        void a(Object obj) {
            this.f298673a.println(obj);
        }
    }

    static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintWriter f298674a;

        d(PrintWriter printWriter) {
            this.f298674a = printWriter;
        }

        @Override // io.reactivex.exceptions.a.b
        void a(Object obj) {
            this.f298674a.println(obj);
        }
    }

    public a(@cj.f Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    private List<Throwable> c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void e(b bVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f298668a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i10++;
        }
        bVar.a(sb2.toString());
    }

    @cj.f
    public List<Throwable> b() {
        return this.f298668a;
    }

    Throwable d(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause == null || th2 == cause) {
            return th2;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    public int f() {
        return this.f298668a.size();
    }

    @Override // java.lang.Throwable
    @cj.f
    public synchronized Throwable getCause() {
        try {
            if (this.f298670c == null) {
                C2120a c2120a = new C2120a();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.f298668a.iterator();
                Throwable thD = c2120a;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th2 : c(next)) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            thD.initCause(next);
                        } catch (Throwable unused) {
                        }
                        thD = d(thD);
                    }
                }
                this.f298670c = c2120a;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f298670c;
    }

    @Override // java.lang.Throwable
    @cj.f
    public String getMessage() {
        return this.f298669b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        e(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        e(new d(printWriter));
    }

    public a(@cj.f Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th2 : iterable) {
                if (th2 instanceof a) {
                    linkedHashSet.addAll(((a) th2).b());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f298668a = listUnmodifiableList;
            this.f298669b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
