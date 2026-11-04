package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.core.os.t0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.b0;
import com.google.firebase.components.j0;
import com.google.firebase.components.v;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g implements j, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z8.b<q> f122085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f122086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z8.b<com.google.firebase.platforminfo.i> f122087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<h> f122088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f122089e;

    private g(final Context context, final String str, Set<h> set, z8.b<com.google.firebase.platforminfo.i> bVar, Executor executor) {
        this(new b0(new z8.b() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // z8.b
            public final Object get() {
                return g.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(g gVar) {
        String string;
        synchronized (gVar) {
            try {
                q qVar = gVar.f122085a.get();
                List<r> listG = qVar.g();
                qVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    r rVar = listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(io.ably.lib.transport.c.f287840d, rVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return string;
    }

    public static /* synthetic */ q d(Context context, String str) {
        return new q(context, str);
    }

    public static /* synthetic */ g e(j0 j0Var, com.google.firebase.components.h hVar) {
        return new g((Context) hVar.a(Context.class), ((com.google.firebase.h) hVar.a(com.google.firebase.h.class)).t(), (Set<h>) hVar.d(h.class), (z8.b<com.google.firebase.platforminfo.i>) hVar.e(com.google.firebase.platforminfo.i.class), (Executor) hVar.j(j0Var));
    }

    public static /* synthetic */ Void f(g gVar) {
        synchronized (gVar) {
            try {
                gVar.f122085a.get().q(System.currentTimeMillis(), gVar.f122087c.get().getUserAgent());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    @NonNull
    public static com.google.firebase.components.g<g> g() {
        final j0 j0VarA = j0.a(d8.a.class, Executor.class);
        return com.google.firebase.components.g.i(g.class, j.class, k.class).b(v.m(Context.class)).b(v.m(com.google.firebase.h.class)).b(v.q(h.class)).b(v.o(com.google.firebase.platforminfo.i.class)).b(v.l(j0VarA)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.heartbeatinfo.e
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return g.e(j0VarA, hVar);
            }
        }).d();
    }

    @Override // com.google.firebase.heartbeatinfo.k
    @NonNull
    public synchronized k.a a(@NonNull String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            q qVar = this.f122085a.get();
            if (!qVar.o(jCurrentTimeMillis)) {
                return k.a.NONE;
            }
            qVar.m();
            return k.a.GLOBAL;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.heartbeatinfo.j
    public Task<String> b() {
        return !t0.a(this.f122086b) ? com.google.android.gms.tasks.n.g("") : com.google.android.gms.tasks.n.d(this.f122089e, new Callable() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.c(this.f122082a);
            }
        });
    }

    public Task<Void> h() {
        if (this.f122088d.size() > 0 && t0.a(this.f122086b)) {
            return com.google.android.gms.tasks.n.d(this.f122089e, new Callable() { // from class: com.google.firebase.heartbeatinfo.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return g.f(this.f122084a);
                }
            });
        }
        return com.google.android.gms.tasks.n.g(null);
    }

    @l1
    g(z8.b<q> bVar, Set<h> set, Executor executor, z8.b<com.google.firebase.platforminfo.i> bVar2, Context context) {
        this.f122085a = bVar;
        this.f122088d = set;
        this.f122089e = executor;
        this.f122087c = bVar2;
        this.f122086b = context;
    }
}
