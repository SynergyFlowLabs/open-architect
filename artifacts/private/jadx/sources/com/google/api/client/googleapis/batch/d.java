package com.google.api.client.googleapis.batch;

import com.google.api.client.http.m;
import com.google.api.client.http.q;
import com.google.api.client.http.u;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes4.dex */
class d extends com.google.api.client.http.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f115406d = "\r\n";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f115407e = "HTTP/1.1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f115408c;

    d(u uVar) {
        super("application/http");
        this.f115408c = uVar;
    }

    @Override // com.google.api.client.http.m, com.google.api.client.util.m0
    public void writeTo(OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, e());
        outputStreamWriter.write(this.f115408c.p());
        outputStreamWriter.write(" ");
        outputStreamWriter.write(this.f115408c.y().k());
        outputStreamWriter.write(" ");
        outputStreamWriter.write(f115407e);
        outputStreamWriter.write("\r\n");
        q qVar = new q();
        qVar.i(this.f115408c.j());
        qVar.e0(null).F0(null).l0(null).q0(null).m0(null);
        m mVarF = this.f115408c.f();
        if (mVarF != null) {
            qVar.q0(mVarF.c());
            long length = mVarF.getLength();
            if (length != -1) {
                qVar.m0(Long.valueOf(length));
            }
        }
        q.b0(qVar, null, null, outputStreamWriter);
        outputStreamWriter.write("\r\n");
        outputStreamWriter.flush();
        if (mVarF != null) {
            mVarF.writeTo(outputStream);
        }
    }
}
