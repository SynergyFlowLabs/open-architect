package t7;

import com.google.api.client.util.n;
import com.google.api.client.util.v;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v
    private List<C2509a> f376192d;

    /* JADX INFO: renamed from: t7.a$a, reason: collision with other inner class name */
    public static final class C2509a extends com.google.api.client.json.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @v
        private String f376193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @v
        private String f376194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @v
        private String f376195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @v
        private String f376196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @v
        private String f376197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @v
        private String f376198i;

        public C2509a A(String str) {
            this.f376197h = str;
            return this;
        }

        public C2509a B(String str) {
            this.f376198i = str;
            return this;
        }

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C2509a clone() {
            return (C2509a) super.clone();
        }

        public String n() {
            return this.f376193d;
        }

        public String o() {
            return this.f376194e;
        }

        public String p() {
            return this.f376195f;
        }

        public String q() {
            return this.f376196g;
        }

        public String s() {
            return this.f376197h;
        }

        public String t() {
            return this.f376198i;
        }

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public C2509a p(String str, Object obj) {
            return (C2509a) super.p(str, obj);
        }

        public C2509a v(String str) {
            this.f376193d = str;
            return this;
        }

        public C2509a w(String str) {
            this.f376194e = str;
            return this;
        }

        public C2509a x(String str) {
            this.f376195f = str;
            return this;
        }

        public C2509a z(String str) {
            this.f376196g = str;
            return this;
        }
    }

    static {
        n.i(C2509a.class);
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return (a) super.clone();
    }

    public List<C2509a> n() {
        return this.f376192d;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a p(String str, Object obj) {
        return (a) super.p(str, obj);
    }

    public a p(List<C2509a> list) {
        this.f376192d = list;
        return this;
    }
}
