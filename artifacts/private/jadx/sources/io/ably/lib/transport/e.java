package io.ably.lib.transport;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import io.ably.lib.realtime.l;
import io.ably.lib.types.b0;
import io.ably.lib.types.e0;
import io.ably.lib.types.j0;
import io.ably.lib.types.n;
import io.ably.lib.types.r;
import io.ably.lib.util.k;
import io.ably.lib.util.q;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f287873a = "io.ably.lib.transport.e";

    public interface a {
        void a(e eVar, r rVar);

        void b(e eVar);
    }

    public interface b {
        e a(d dVar, io.ably.lib.transport.b bVar);
    }

    public enum c {
        clean,
        resume,
        recover
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected n f287878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f287879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f287880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected String f287881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected c f287882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected boolean f287883f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final io.ably.lib.util.n f287884g;

        public d(n nVar, io.ably.lib.util.n nVar2) {
            this.f287878a = nVar;
            this.f287884g = nVar2;
        }

        public n a() {
            return this.f287878a;
        }

        public b0[] b(b0[] b0VarArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(b0VarArr));
            arrayList.add(new b0("v", "2"));
            arrayList.add(new b0("format", this.f287878a.f288125u ? "msgpack" : PeopleCardEntry.json));
            if (!this.f287878a.f288127w) {
                arrayList.add(new b0("echo", "false"));
            }
            if (!q.a(this.f287881d)) {
                this.f287882e = c.resume;
                arrayList.add(new b0("resume", this.f287881d));
            } else if (!q.a(this.f287878a.f288128x)) {
                this.f287882e = c.recover;
                j0 j0VarA = j0.a(this.f287878a.f288128x);
                if (j0VarA != null) {
                    arrayList.add(new b0("recover", j0VarA.d()));
                }
            }
            String str = this.f287878a.f288115k;
            if (str != null) {
                arrayList.add(new b0(l.f287647j, str));
            }
            if (!this.f287883f) {
                arrayList.add(new b0("heartbeats", "false"));
            }
            b0[] b0VarArr2 = this.f287878a.N;
            if (b0VarArr2 != null) {
                arrayList.addAll(Arrays.asList(b0VarArr2));
            }
            arrayList.add(new b0(io.ably.lib.transport.c.f287840d, io.ably.lib.util.a.a(this.f287878a.S, this.f287884g)));
            k.b(e.f287873a, "getConnectParams: params = " + arrayList);
            return (b0[]) arrayList.toArray(new b0[arrayList.size()]);
        }

        public String c() {
            return this.f287879b;
        }

        public int d() {
            return this.f287880c;
        }
    }

    String A1();

    void a(e0 e0Var) throws io.ably.lib.types.a;

    String b();

    void c(a aVar);

    void close();

    void d(e0 e0Var) throws io.ably.lib.types.a;
}
