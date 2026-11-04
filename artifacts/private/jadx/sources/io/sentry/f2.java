package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<c> f305421a = new ArrayList<>();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f305422a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.c.values().length];
            f305422a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f305422a[io.sentry.vendor.gson.stream.c.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        @Nullable
        Object a() throws IOException;
    }

    private interface c {
        @NotNull
        Object getValue();
    }

    private static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f305425a;

        f(@NotNull String str) {
            this.f305425a = str;
        }

        @Override // io.sentry.f2.c
        @NotNull
        public Object getValue() {
            return this.f305425a;
        }
    }

    private static final class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f305426a;

        g(@NotNull Object obj) {
            this.f305426a = obj;
        }

        @Override // io.sentry.f2.c
        @NotNull
        public Object getValue() {
            return this.f305426a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    @Nullable
    private c f() {
        if (this.f305421a.isEmpty()) {
            return null;
        }
        ArrayList<c> arrayList = this.f305421a;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f305423a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f305424a.put(fVar.f305425a, cVarF.getValue());
        return false;
    }

    private boolean h(b bVar) throws IOException {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            m(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f305424a.put(fVar.f305425a, objA);
        } else if (f() instanceof d) {
            ((d) f()).f305423a.add(objA);
        }
        return false;
    }

    private boolean i() {
        return this.f305421a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object j(g2 g2Var) throws IOException {
        try {
            try {
                return Integer.valueOf(g2Var.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(g2Var.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(g2Var.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(@NotNull final g2 g2Var) throws IOException {
        boolean zG;
        a aVar = null;
        switch (a.f305422a[g2Var.peek().ordinal()]) {
            case 1:
                g2Var.J0();
                m(new d(aVar));
                zG = false;
                break;
            case 2:
                g2Var.F0();
                zG = g();
                break;
            case 3:
                g2Var.m1();
                m(new e(aVar));
                zG = false;
                break;
            case 4:
                g2Var.F1();
                zG = g();
                break;
            case 5:
                m(new f(g2Var.na()));
                zG = false;
                break;
            case 6:
                zG = h(new b() { // from class: io.sentry.b2
                    @Override // io.sentry.f2.b
                    public final Object a() {
                        return g2Var.jc();
                    }
                });
                break;
            case 7:
                zG = h(new b() { // from class: io.sentry.c2
                    @Override // io.sentry.f2.b
                    public final Object a() {
                        return this.f305153a.j(g2Var);
                    }
                });
                break;
            case 8:
                zG = h(new b() { // from class: io.sentry.d2
                    @Override // io.sentry.f2.b
                    public final Object a() {
                        return Boolean.valueOf(g2Var.nextBoolean());
                    }
                });
                break;
            case 9:
                g2Var.a7();
                zG = h(new b() { // from class: io.sentry.e2
                    @Override // io.sentry.f2.b
                    public final Object a() {
                        return f2.a();
                    }
                });
                break;
            case 10:
                zG = true;
                break;
            default:
                zG = false;
                break;
        }
        if (!zG) {
            k(g2Var);
        }
    }

    private void l() {
        if (this.f305421a.isEmpty()) {
            return;
        }
        ArrayList<c> arrayList = this.f305421a;
        arrayList.remove(arrayList.size() - 1);
    }

    private void m(c cVar) {
        this.f305421a.add(cVar);
    }

    @Nullable
    public Object e(@NotNull g2 g2Var) throws IOException {
        k(g2Var);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<Object> f305423a;

        private d() {
            this.f305423a = new ArrayList<>();
        }

        @Override // io.sentry.f2.c
        @NotNull
        public Object getValue() {
            return this.f305423a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HashMap<String, Object> f305424a;

        private e() {
            this.f305424a = new HashMap<>();
        }

        @Override // io.sentry.f2.c
        @NotNull
        public Object getValue() {
            return this.f305424a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
