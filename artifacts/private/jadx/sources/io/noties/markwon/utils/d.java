package io.noties.markwon.utils;

import androidx.annotation.NonNull;
import androidx.annotation.j;
import androidx.annotation.p0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.commonmark.node.c0;
import org.commonmark.node.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d {

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f298608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f298609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f298610c;

        a(b bVar, StringBuilder sb2, c cVar) {
            this.f298608a = bVar;
            this.f298609b = sb2;
            this.f298610c = cVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            v vVar = (v) objArr[0];
            this.f298608a.a(this.f298609b);
            this.f298609b.append(this.f298610c.a(vVar));
            if (vVar.e() == null) {
                this.f298609b.append("\n");
                return null;
            }
            this.f298609b.append(" [\n");
            this.f298608a.c();
            d.d((c0) obj, vVar);
            this.f298608a.b();
            this.f298608a.a(this.f298609b);
            this.f298609b.append("]\n");
            return null;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f298611a;

        private b() {
        }

        void a(@NonNull StringBuilder sb2) {
            for (int i10 = 0; i10 < this.f298611a; i10++) {
                sb2.append(' ');
                sb2.append(' ');
            }
        }

        void b() {
            this.f298611a--;
        }

        void c() {
            this.f298611a++;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public interface c {
        @NonNull
        String a(@NonNull v vVar);
    }

    /* JADX INFO: renamed from: io.noties.markwon.utils.d$d, reason: collision with other inner class name */
    private static class C2116d implements c {
        private C2116d() {
        }

        @Override // io.noties.markwon.utils.d.c
        @NonNull
        public String a(@NonNull v vVar) {
            return vVar.toString();
        }

        /* synthetic */ C2116d(a aVar) {
            this();
        }
    }

    private d() {
    }

    @NonNull
    @j
    public static String b(@NonNull v vVar) {
        return c(vVar, null);
    }

    @NonNull
    @j
    public static String c(@NonNull v vVar, @p0 c cVar) {
        a aVar = null;
        if (cVar == null) {
            cVar = new C2116d(aVar);
        }
        b bVar = new b(aVar);
        StringBuilder sb2 = new StringBuilder();
        vVar.c((c0) Proxy.newProxyInstance(c0.class.getClassLoader(), new Class[]{c0.class}, new a(bVar, sb2, cVar)));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(@NonNull c0 c0Var, @NonNull v vVar) {
        v vVarE = vVar.e();
        while (vVarE != null) {
            v vVarG = vVarE.g();
            vVarE.c(c0Var);
            vVarE = vVarG;
        }
    }
}
