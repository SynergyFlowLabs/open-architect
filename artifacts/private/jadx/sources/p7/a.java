package p7;

import com.google.api.client.http.s;
import com.google.api.client.json.c;
import com.google.api.client.json.d;
import com.google.api.client.json.e;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.google.api.client.http.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f340780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f340781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f340782e;

    public a(d dVar, Object obj) {
        super(c.f115763a);
        this.f340781d = (d) h0.d(dVar);
        this.f340780c = h0.d(obj);
    }

    public final Object h() {
        return this.f340780c;
    }

    public final d i() {
        return this.f340781d;
    }

    public final String j() {
        return this.f340782e;
    }

    @Override // com.google.api.client.http.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a g(s sVar) {
        super.g(sVar);
        return this;
    }

    public a l(String str) {
        this.f340782e = str;
        return this;
    }

    @Override // com.google.api.client.http.m, com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        e eVarA = this.f340781d.a(outputStream, e());
        if (this.f340782e != null) {
            eVarA.t();
            eVarA.j(this.f340782e);
        }
        eVarA.e(this.f340780c);
        if (this.f340782e != null) {
            eVarA.i();
        }
        eVarA.c();
    }
}
