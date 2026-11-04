package com.rabbitmq.client;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class d0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f265042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f265043b;

    public d0(String str, int i10, boolean z10) {
        this(new b(str, i10), z10);
    }

    @Override // com.rabbitmq.client.c
    public List<b> a() throws UnknownHostException {
        String strA = this.f265042a.a();
        int iL0 = r.l0(this.f265042a.b(), this.f265043b);
        InetAddress[] inetAddressArrB = b(strA);
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : inetAddressArrB) {
            arrayList.add(new b(inetAddress.getHostAddress(), iL0));
        }
        return arrayList;
    }

    protected InetAddress[] b(String str) throws UnknownHostException {
        return InetAddress.getAllByName(str);
    }

    public d0(String str, int i10) {
        this(new b(str, i10), false);
    }

    public d0() {
        this(r.A3);
    }

    public d0(String str) {
        this(new b(str), false);
    }

    public d0(b bVar) {
        this(bVar, false);
    }

    public d0(b bVar, boolean z10) {
        this.f265042a = bVar;
        this.f265043b = z10;
    }
}
