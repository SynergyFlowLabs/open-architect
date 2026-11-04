package com.google.api.client.http;

import com.google.api.client.util.m0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class g0 extends com.google.api.client.http.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f115606d = "\r\n";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f115607e = "--";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<a> f115608c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m f115609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        q f115610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        n f115611c;

        public a() {
            this(null);
        }

        public m a() {
            return this.f115609a;
        }

        public n b() {
            return this.f115611c;
        }

        public q c() {
            return this.f115610b;
        }

        public a d(m mVar) {
            this.f115609a = mVar;
            return this;
        }

        public a e(n nVar) {
            this.f115611c = nVar;
            return this;
        }

        public a f(q qVar) {
            this.f115610b = qVar;
            return this;
        }

        public a(m mVar) {
            this(null, mVar);
        }

        public a(q qVar, m mVar) {
            f(qVar);
            d(mVar);
        }
    }

    public g0() {
        super(new s("multipart/related").o("boundary", "__END_OF_PART__"));
        this.f115608c = new ArrayList<>();
    }

    @Override // com.google.api.client.http.a, com.google.api.client.http.m
    public boolean a() {
        Iterator<a> it = this.f115608c.iterator();
        while (it.hasNext()) {
            if (!it.next().f115609a.a()) {
                return false;
            }
        }
        return true;
    }

    public g0 h(a aVar) {
        this.f115608c.add((a) com.google.api.client.util.h0.d(aVar));
        return this;
    }

    public final String i() {
        return f().g("boundary");
    }

    public final Collection<a> j() {
        return Collections.unmodifiableCollection(this.f115608c);
    }

    public g0 k(String str) {
        f().o("boundary", (String) com.google.api.client.util.h0.d(str));
        return this;
    }

    public g0 l(Collection<? extends m> collection) {
        this.f115608c = new ArrayList<>(collection.size());
        Iterator<? extends m> it = collection.iterator();
        while (it.hasNext()) {
            h(new a(it.next()));
        }
        return this;
    }

    @Override // com.google.api.client.http.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g0 g(s sVar) {
        super.g(sVar);
        return this;
    }

    public g0 n(Collection<a> collection) {
        this.f115608c = new ArrayList<>(collection);
        return this;
    }

    @Override // com.google.api.client.http.m, com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        m0 m0Var;
        m0 m0Var2;
        long length;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, e());
        String strI = i();
        for (a aVar : this.f115608c) {
            q qVarE0 = new q().e0(null);
            q qVar = aVar.f115610b;
            if (qVar != null) {
                qVarE0.i(qVar);
            }
            qVarE0.l0(null).F0(null).q0(null).m0(null).p("Content-Transfer-Encoding", null);
            m mVar = aVar.f115609a;
            if (mVar != null) {
                qVarE0.p("Content-Transfer-Encoding", Arrays.asList("binary"));
                qVarE0.q0(mVar.c());
                n nVar = aVar.f115611c;
                if (nVar == null) {
                    length = mVar.getLength();
                    m0Var2 = mVar;
                } else {
                    qVarE0.l0(nVar.getName());
                    o oVar = new o(mVar, nVar);
                    long jD = com.google.api.client.http.a.d(mVar);
                    m0Var2 = oVar;
                    length = jD;
                }
                m0Var = m0Var2;
                if (length != -1) {
                    qVarE0.m0(Long.valueOf(length));
                    m0Var = m0Var2;
                }
            } else {
                m0Var = null;
            }
            outputStreamWriter.write(f115607e);
            outputStreamWriter.write(strI);
            outputStreamWriter.write("\r\n");
            q.b0(qVarE0, null, null, outputStreamWriter);
            if (m0Var != null) {
                outputStreamWriter.write("\r\n");
                outputStreamWriter.flush();
                m0Var.writeTo(outputStream);
            }
            outputStreamWriter.write("\r\n");
        }
        outputStreamWriter.write(f115607e);
        outputStreamWriter.write(strI);
        outputStreamWriter.write(f115607e);
        outputStreamWriter.write("\r\n");
        outputStreamWriter.flush();
    }
}
