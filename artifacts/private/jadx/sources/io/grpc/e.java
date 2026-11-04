package io.grpc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
@fj.c
@gj.b
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f288718k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    private final y f288719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    private final Executor f288720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private final String f288721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    private final d f288722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.h
    private final String f288723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object[][] f288724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<n.a> f288725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.h
    private final Boolean f288726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @fj.h
    private final Integer f288727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @fj.h
    private final Integer f288728j;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        y f288729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Executor f288730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f288731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f288732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f288733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object[][] f288734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<n.a> f288735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Boolean f288736h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Integer f288737i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Integer f288738j;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e b() {
            return new e(this);
        }
    }

    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f288739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f288740b;

        private c(String str, T t10) {
            this.f288739a = str;
            this.f288740b = t10;
        }

        public static <T> c<T> b(String str) {
            com.google.common.base.j0.F(str, "debugString");
            return new c<>(str, null);
        }

        public static <T> c<T> c(String str, T t10) {
            com.google.common.base.j0.F(str, "debugString");
            return new c<>(str, t10);
        }

        @e0("https://github.com/grpc/grpc-java/issues/1869")
        @Deprecated
        public static <T> c<T> e(String str, T t10) {
            com.google.common.base.j0.F(str, "debugString");
            return new c<>(str, t10);
        }

        public T d() {
            return this.f288740b;
        }

        public String toString() {
            return this.f288739a;
        }
    }

    static {
        b bVar = new b();
        bVar.f288734f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f288735g = Collections.EMPTY_LIST;
        f288718k = bVar.b();
    }

    private static b l(e eVar) {
        b bVar = new b();
        bVar.f288729a = eVar.f288719a;
        bVar.f288730b = eVar.f288720b;
        bVar.f288731c = eVar.f288721c;
        bVar.f288732d = eVar.f288722d;
        bVar.f288733e = eVar.f288723e;
        bVar.f288734f = eVar.f288724f;
        bVar.f288735g = eVar.f288725g;
        bVar.f288736h = eVar.f288726h;
        bVar.f288737i = eVar.f288727i;
        bVar.f288738j = eVar.f288728j;
        return bVar;
    }

    @fj.h
    @e0("https://github.com/grpc/grpc-java/issues/1767")
    public String a() {
        return this.f288721c;
    }

    @fj.h
    public String b() {
        return this.f288723e;
    }

    @fj.h
    public d c() {
        return this.f288722d;
    }

    @fj.h
    public y d() {
        return this.f288719a;
    }

    @fj.h
    public Executor e() {
        return this.f288720b;
    }

    @fj.h
    @e0("https://github.com/grpc/grpc-java/issues/2563")
    public Integer f() {
        return this.f288727i;
    }

    @fj.h
    @e0("https://github.com/grpc/grpc-java/issues/2563")
    public Integer g() {
        return this.f288728j;
    }

    @e0("https://github.com/grpc/grpc-java/issues/1869")
    public <T> T h(c<T> cVar) {
        com.google.common.base.j0.F(cVar, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f288724f;
            if (i10 >= objArr.length) {
                return (T) ((c) cVar).f288740b;
            }
            if (cVar.equals(objArr[i10][0])) {
                return (T) this.f288724f[i10][1];
            }
            i10++;
        }
    }

    @e0("https://github.com/grpc/grpc-java/issues/2861")
    public List<n.a> i() {
        return this.f288725g;
    }

    Boolean j() {
        return this.f288726h;
    }

    public boolean k() {
        return Boolean.TRUE.equals(this.f288726h);
    }

    @e0("https://github.com/grpc/grpc-java/issues/1767")
    public e m(@fj.h String str) {
        b bVarL = l(this);
        bVarL.f288731c = str;
        return bVarL.b();
    }

    public e n(@fj.h d dVar) {
        b bVarL = l(this);
        bVarL.f288732d = dVar;
        return bVarL.b();
    }

    public e o(@fj.h String str) {
        b bVarL = l(this);
        bVarL.f288733e = str;
        return bVarL.b();
    }

    public e p(@fj.h y yVar) {
        b bVarL = l(this);
        bVarL.f288729a = yVar;
        return bVarL.b();
    }

    public e q(long j10, TimeUnit timeUnit) {
        return p(y.b(j10, timeUnit));
    }

    public e r(@fj.h Executor executor) {
        b bVarL = l(this);
        bVarL.f288730b = executor;
        return bVarL.b();
    }

    @e0("https://github.com/grpc/grpc-java/issues/2563")
    public e s(int i10) {
        com.google.common.base.j0.k(i10 >= 0, "invalid maxsize %s", i10);
        b bVarL = l(this);
        bVarL.f288737i = Integer.valueOf(i10);
        return bVarL.b();
    }

    @e0("https://github.com/grpc/grpc-java/issues/2563")
    public e t(int i10) {
        com.google.common.base.j0.k(i10 >= 0, "invalid maxsize %s", i10);
        b bVarL = l(this);
        bVarL.f288738j = Integer.valueOf(i10);
        return bVarL.b();
    }

    public String toString() {
        com.google.common.base.b0.b bVarF = com.google.common.base.b0.c(this).f("deadline", this.f288719a).f("authority", this.f288721c).f("callCredentials", this.f288722d);
        Executor executor = this.f288720b;
        return bVarF.f("executor", executor != null ? executor.getClass() : null).f("compressorName", this.f288723e).f("customOptions", Arrays.deepToString(this.f288724f)).g("waitForReady", k()).f("maxInboundMessageSize", this.f288727i).f("maxOutboundMessageSize", this.f288728j).f("streamTracerFactories", this.f288725g).toString();
    }

    public <T> e u(c<T> cVar, T t10) {
        com.google.common.base.j0.F(cVar, "key");
        com.google.common.base.j0.F(t10, "value");
        b bVarL = l(this);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f288724f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (cVar.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f288724f.length + (i10 == -1 ? 1 : 0), 2);
        bVarL.f288734f = objArr2;
        Object[][] objArr3 = this.f288724f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i10 == -1) {
            bVarL.f288734f[this.f288724f.length] = new Object[]{cVar, t10};
        } else {
            bVarL.f288734f[i10] = new Object[]{cVar, t10};
        }
        return bVarL.b();
    }

    @e0("https://github.com/grpc/grpc-java/issues/2861")
    public e v(n.a aVar) {
        ArrayList arrayList = new ArrayList(this.f288725g.size() + 1);
        arrayList.addAll(this.f288725g);
        arrayList.add(aVar);
        b bVarL = l(this);
        bVarL.f288735g = Collections.unmodifiableList(arrayList);
        return bVarL.b();
    }

    public e w() {
        b bVarL = l(this);
        bVarL.f288736h = Boolean.TRUE;
        return bVarL.b();
    }

    public e x() {
        b bVarL = l(this);
        bVarL.f288736h = Boolean.FALSE;
        return bVarL.b();
    }

    private e(b bVar) {
        this.f288719a = bVar.f288729a;
        this.f288720b = bVar.f288730b;
        this.f288721c = bVar.f288731c;
        this.f288722d = bVar.f288732d;
        this.f288723e = bVar.f288733e;
        this.f288724f = bVar.f288734f;
        this.f288725g = bVar.f288735g;
        this.f288726h = bVar.f288736h;
        this.f288727i = bVar.f288737i;
        this.f288728j = bVar.f288738j;
    }
}
