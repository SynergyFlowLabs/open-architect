package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.t;
import com.rabbitmq.client.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a extends h {
    protected static final String A = "2\n[]";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f115293y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f115294z = 5000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f115295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final com.google.api.client.json.d f115296x;

    public a(int i10, com.google.api.client.json.d dVar) {
        this.f115295w = i10;
        this.f115296x = dVar;
    }

    protected int R() {
        return this.f115295w;
    }

    @Override // com.google.api.client.googleapis.auth.oauth2.h, com.google.api.client.auth.oauth2.j
    protected t d() throws IOException {
        Socket socket = new Socket(r.A3, R());
        socket.setSoTimeout(5000);
        t tVar = new t();
        try {
            new PrintWriter(socket.getOutputStream(), true).println(A);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedReader.readLine();
            tVar.u(((List) this.f115296x.f(bufferedReader).A(LinkedList.class, Object.class)).get(2).toString());
            return tVar;
        } finally {
            socket.close();
        }
    }
}
