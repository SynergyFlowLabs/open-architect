package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f96728g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final StackTraceElement[] f96729h = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Throwable> f96730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.load.g f96731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.a f96732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class<?> f96733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f96734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Exception f96735f;

    public q(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    private void a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof q)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((q) th2).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof q) {
                ((q) th2).i(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void i(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f96730a;
    }

    @p0
    public Exception f() {
        return this.f96735f;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> g() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f96734e);
        sb2.append(this.f96733d != null ? ", " + this.f96733d : "");
        sb2.append(this.f96732c != null ? ", " + this.f96732c : "");
        sb2.append(this.f96731b != null ? ", " + this.f96731b : "");
        List<Throwable> listG = g();
        if (listG.isEmpty()) {
            return sb2.toString();
        }
        if (listG.size() == 1) {
            sb2.append("\nThere was 1 cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listG.size());
            sb2.append(" causes:");
        }
        for (Throwable th2 : listG) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public void h(String str) {
        List<Throwable> listG = g();
        int size = listG.size();
        int i10 = 0;
        int i11 = 3 | 0;
        while (i10 < size) {
            int i12 = i10 + 1;
            listG.get(i10);
            i10 = i12;
        }
    }

    void j(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.a aVar) {
        k(gVar, aVar, null);
    }

    void k(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.f96731b = gVar;
        this.f96732c = aVar;
        this.f96733d = cls;
    }

    public void l(@p0 Exception exc) {
        this.f96735f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        i(printStream);
    }

    public q(String str, List<Throwable> list) {
        this.f96734e = str;
        setStackTrace(f96729h);
        this.f96730a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        i(printWriter);
    }

    private static final class a implements Appendable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f96736c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f96737d = "  ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f96738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f96739b = true;

        a(Appendable appendable) {
            this.f96738a = appendable;
        }

        @NonNull
        private CharSequence a(@p0 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f96739b) {
                this.f96739b = false;
                this.f96738a.append(f96737d);
            }
            this.f96739b = c10 == '\n';
            this.f96738a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@p0 CharSequence charSequence) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@p0 CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f96739b) {
                this.f96739b = false;
                this.f96738a.append(f96737d);
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f96739b = z10;
            this.f96738a.append(charSequenceA, i10, i11);
            return this;
        }
    }
}
