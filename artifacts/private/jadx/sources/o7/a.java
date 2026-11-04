package o7;

import com.google.api.client.http.x;
import com.google.api.client.json.d;
import com.google.api.client.json.f;
import com.google.api.client.util.n;
import com.google.api.client.util.v;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v
    private List<C2345a> f333583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v
    private int f333584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v
    private String f333585f;

    /* JADX INFO: renamed from: o7.a$a, reason: collision with other inner class name */
    public static class C2345a extends com.google.api.client.json.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @v
        private String f333586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @v
        private String f333587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @v
        private String f333588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @v
        private String f333589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @v
        private String f333590h;

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C2345a clone() {
            return (C2345a) super.clone();
        }

        public final String n() {
            return this.f333586d;
        }

        public final String o() {
            return this.f333589g;
        }

        public final String p() {
            return this.f333590h;
        }

        public final String q() {
            return this.f333588f;
        }

        public final String s() {
            return this.f333587e;
        }

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public C2345a p(String str, Object obj) {
            return (C2345a) super.p(str, obj);
        }

        public final void u(String str) {
            this.f333586d = str;
        }

        public final void v(String str) {
            this.f333589g = str;
        }

        public final void w(String str) {
            this.f333590h = str;
        }

        public final void x(String str) {
            this.f333588f = str;
        }

        public final void z(String str) {
            this.f333587e = str;
        }
    }

    static {
        n.i(C2345a.class);
    }

    public static a q(d dVar, x xVar) throws IOException {
        return (a) new f.a(dVar).d(Collections.singleton("error")).a().a(xVar.c(), xVar.d(), a.class);
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return (a) super.clone();
    }

    public final int n() {
        return this.f333584e;
    }

    public final List<C2345a> o() {
        return this.f333583d;
    }

    public final String p() {
        return this.f333585f;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public a p(String str, Object obj) {
        return (a) super.p(str, obj);
    }

    public final void t(int i10) {
        this.f333584e = i10;
    }

    public final void u(List<C2345a> list) {
        this.f333583d = list;
    }

    public final void v(String str) {
        this.f333585f = str;
    }
}
