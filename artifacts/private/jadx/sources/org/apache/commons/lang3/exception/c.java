package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class c extends RuntimeException implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f337156b = 20110706;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f337157a;

    public c() {
        this.f337157a = new d();
    }

    @Override // org.apache.commons.lang3.exception.e
    public List<uk.e<String, Object>> a() {
        return this.f337157a.a();
    }

    @Override // org.apache.commons.lang3.exception.e
    public List<Object> c(String str) {
        return this.f337157a.c(str);
    }

    @Override // org.apache.commons.lang3.exception.e
    public Set<String> d() {
        return this.f337157a.d();
    }

    @Override // org.apache.commons.lang3.exception.e
    public String e(String str) {
        return this.f337157a.e(str);
    }

    @Override // org.apache.commons.lang3.exception.e
    public Object f(String str) {
        return this.f337157a.f(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return e(super.getMessage());
    }

    @Override // org.apache.commons.lang3.exception.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c b(String str, Object obj) {
        this.f337157a.b(str, obj);
        return this;
    }

    public String i() {
        return super.getMessage();
    }

    @Override // org.apache.commons.lang3.exception.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public c g(String str, Object obj) {
        this.f337157a.g(str, obj);
        return this;
    }

    public c(String str) {
        super(str);
        this.f337157a = new d();
    }

    public c(Throwable th2) {
        super(th2);
        this.f337157a = new d();
    }

    public c(String str, Throwable th2) {
        super(str, th2);
        this.f337157a = new d();
    }

    public c(String str, Throwable th2, e eVar) {
        super(str, th2);
        this.f337157a = eVar == null ? new d() : eVar;
    }
}
